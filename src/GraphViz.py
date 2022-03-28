from dto import Graph
import networkx as nx
import matplotlib.pyplot as plt
from networkx.drawing.nx_agraph import graphviz_layout


def fill_vertex_params(graph: nx.Graph, v):
    graph.nodes[v.id]['label'] = v.label
    graph.nodes[v.id]['font_color'] = v.vertex_options.font_color
    graph.nodes[v.id]['font_size'] = v.vertex_options.font_size
    graph.nodes[v.id]['font'] = v.vertex_options.font
    graph.nodes[v.id]['color'] = v.vertex_options.vertex_color
    graph.nodes[v.id]['size'] = v.vertex_options.vertex_size


class GraphViz:

    def __init__(self, graph: Graph):
        self.index = 0
        self.title = graph.graph_title
        self.save_format = graph.save_format
        self.layout = graph.layout
        self.background = graph.background
        self.edges = graph.edges
        self.vertices = graph.vertices
        self.graph = graph
        self.label_dict = {}

    def draw_in_file(self):

        if self.graph.is_oriented:
            G = nx.DiGraph()
        else:
            G = nx.Graph()

        self.add_edges_to_graph(G)
        self.add_additional_nodes_to_graph(G)

        edges, colors = zip(*nx.get_edge_attributes(G, 'color').items())
        edges, edge_sizes = zip(*nx.get_edge_attributes(G, 'edge_thickness').items())
        nodes, node_sizes = zip(*nx.get_node_attributes(G, 'size').items())
        nodes, node_colors = zip(*nx.get_node_attributes(G, 'color').items())


        pos = graphviz_layout(
            G,
            prog=self.layout
        )

        fig, ax = plt.subplots()
        nx.draw(G, edgelist=edges, nodelist=nodes, pos=pos, labels=self.label_dict, edge_color=colors, with_labels=True,
                arrowsize=20, node_size=node_sizes, width=edge_sizes, node_color=node_colors, arrows=self.graph.is_oriented)

        labels = nx.get_edge_attributes(G, 'weight')
        edges, edge_font_sizes = zip(*nx.get_edge_attributes(G, 'font_size').items())
        edges, edge_font_colors = zip(*nx.get_edge_attributes(G, 'font_color').items())

        node_labels = nx.get_node_attributes(G, 'label')
        nodes, node_font_sizes = zip(*nx.get_node_attributes(G, 'font_size').items())
        nodes, node_font_colors = zip(*nx.get_node_attributes(G, 'font_color').items())

        nx.draw_networkx_edge_labels(G, pos, edge_labels=labels)
        nx.draw_networkx_labels(G, pos, labels=node_labels)
        ax.set_facecolor(self.background)
        ax.axis('off')
        fig.set_facecolor(self.background)
        plt.savefig(self.title + "." + self.save_format)

    def add_edges_to_graph(self, graph: nx.Graph):
        for edge in self.edges:
            v1 = edge.first_vertex
            v2 = edge.second_vertex
            self.label_dict[v1.id] = v1.label
            self.label_dict[v2.id] = v2.label

            edge_opt = edge.edge_options

            graph.add_edge(v1.id, v2.id, weight=edge.label,
                           color=edge_opt.edge_color, edge_thickness=edge_opt.edge_thickness,
                           text_place=edge_opt.text_place, font_color=edge_opt.font_color, font_size=edge_opt.font_size,
                           font=edge_opt.font)
            fill_vertex_params(graph, v1)
            fill_vertex_params(graph, v2)

    def add_additional_nodes_to_graph(self, graph: nx.Graph):
        for v in self.vertices:
            if v.id in self.label_dict.keys():
                fill_vertex_params(graph, v)
            else:
                v_opt = v.vertex_options
                graph.add_node(v.id, label=v.label, font_color=v_opt.font_color, font_size=v_opt.font_size, font=v_opt.font,
                               color=v_opt.vertex_color, size=v_opt.vertex_size)
