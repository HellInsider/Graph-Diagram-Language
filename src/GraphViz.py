from dto import Graph
import networkx as nx
import matplotlib.pyplot as plt
from netgraph import InteractiveGraph


def fill_vertex_params(graph: nx.Graph, v):
    graph.nodes[v.id]['label'] = v.label
    graph.nodes[v.id]['color'] = v.vertex_options.vertex_color
    graph.nodes[v.id]['size'] = v.vertex_options.vertex_size


class GraphViz:

    def __init__(self, graph: Graph):
        self.index = 0
        self.layout = graph.layout
        self.background = graph.background
        self.edges = graph.edges
        self.vertices = graph.vertices
        self.font = graph.font
        self.font_size = graph.font_size
        self.font_color = graph.font_color
        self.graph = graph
        self.use_vertex_names = graph.use_vertex_names
        self.label_dict = {}

    def draw_in_file(self):

        if self.graph.is_oriented:
            G = nx.DiGraph()
        else:
            G = nx.Graph()

        self.add_edges_to_graph(G)
        self.add_additional_nodes_to_graph(G)

        edges, _ = zip(*nx.get_edge_attributes(G, 'edge_thickness').items())
        nodes, _ = zip(*nx.get_node_attributes(G, 'color').items())
        edge_colors = nx.get_edge_attributes(G, 'color')
        node_colors = nx.get_node_attributes(G, 'color')
        edge_sizes = nx.get_edge_attributes(G, 'edge_thickness')
        node_sizes = nx.get_node_attributes(G, 'size')
        labels = nx.get_edge_attributes(G, 'weight')
        node_labels = nx.get_node_attributes(G, 'label')


        pos = nx.spring_layout(G)
        I = InteractiveGraph(G, edgelist=edges, nodelist=nodes, pos=pos, labels=self.label_dict, edgecolors='Black',
                             with_labels=True, node_labels=node_labels, edge_labels=labels,
                             arrowsize=20, edge_width=edge_sizes, node_size=node_sizes, node_color=node_colors,
                             edge_color=edge_colors,
                             arrows=self.graph.is_oriented, font_color=self.font_color, font_size=self.font_size,
                             font_family=self.font, node_label_fontdict=dict(size=int(self.font_size), fontfamily=self.font),
                             edge_label_fontdict=dict(size=int(self.font_size), fontfamily=self.font))
        plt.gca().set_facecolor(self.background)
        plt.show()

    def add_edges_to_graph(self, graph: nx.Graph):
        for edge in self.edges:
            v1 = edge.first_vertex
            v2 = edge.second_vertex
            self.label_dict[v1.id] = v1.label
            self.label_dict[v2.id] = v2.label

            edge_opt = edge.edge_options

            if edge.label == "":
                weight = None
            else:
                weight = edge.label

            graph.add_edge(v1.id, v2.id, weight=weight,
                           color=edge_opt.edge_color, edge_thickness=edge_opt.edge_thickness,
                           text_place=edge_opt.text_place)
            fill_vertex_params(graph, v1)
            fill_vertex_params(graph, v2)

    def add_additional_nodes_to_graph(self, graph: nx.Graph):
        for v in self.vertices:
            if v.id in self.label_dict.keys():
                fill_vertex_params(graph, v)
            else:
                self.label_dict[v.id] = v.label
                v_opt = v.vertex_options
                graph.add_node(v.id, label=v.label, color=v_opt.vertex_color, size=v_opt.vertex_size)
