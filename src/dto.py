from typing import List, NamedTuple

class EdgeOptions(NamedTuple):
    text_place: str = "Center"

    font_color: str = "Black"
    font_size: int = 14
    font: str = "Arial"

    edge_color: str = "Black"
    edge_thickness: int = 2     #in pixels?

class VertexOptions(NamedTuple):
    font_color: str = "Black"
    font_size: int = 14
    font: str = "Arial"

    vertex_size: int = 5    #radius of node in pixels?
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
    edges: List[Edge]
    vertices: List[Vertex]
    layout: str = "twopi"  # change it
    background: str = "White"
    graph_title: str = "title"
    save_format: str = "jpg"
    is_oriented: bool = False


