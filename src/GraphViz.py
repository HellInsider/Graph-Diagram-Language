from dto import Graph
import networkx as nx
import matplotlib.pyplot as plt
from networkx.drawing.nx_agraph import graphviz_layout


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

    def draw_in_file(self):
        G = nx.Graph()
        label_dict = {}

        for edge in self.edges:
            label_dict[edge.first_vertex.id] = edge.first_vertex.label
            label_dict[edge.second_vertex.id] = edge.second_vertex.label

            G.add_edge(edge.first_vertex.id, edge.second_vertex.id, weight=edge.label,
                                   color=edge.edge_options.color)


        edges, colors = zip(*nx.get_edge_attributes(G, 'color').items())
        # pos = nx.multipartite_layout(G)
        pos = graphviz_layout(
            G,
            prog='dot',
            args='-Grankdir=LR'
        )

        fig, ax = plt.subplots()
        nx.draw(G, edgelist=edges, pos=pos, labels=label_dict, edge_color=colors, with_labels=True)
        ax.set_facecolor(self.background)
        ax.axis('off')
        fig.set_facecolor(self.background)
        plt.show()



