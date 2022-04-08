from typing import List, NamedTuple

class EdgeOptions(NamedTuple):
    text_place: str = "Center"
    edge_color: str = "Black"
    edge_thickness: int = 2             #in pixels?

class VertexOptions(NamedTuple):
    vertex_size: int = 5                #radius of node in pixels?
    vertex_color: str = "White"


class Vertex(NamedTuple):
    id: str = None
    label: str = " "
    vertex_options: VertexOptions = None


class Edge(NamedTuple):
    first_vertex: Vertex
    second_vertex: Vertex
    label: str = " "
    edge_options: EdgeOptions = None


class Graph(NamedTuple):
    edges: List[Edge] = []
    vertices: List[Vertex] = []
    is_oriented: bool = False
    layout: str = "twopi"               # change it

    #graph_title: str = "title"
    #save_format: str = "jpg"
    use_vertex_names: bool = False

    background: str = "White"
    font: str = "Arial"
    font_color: str = "Black"
    font_size: int = 14



