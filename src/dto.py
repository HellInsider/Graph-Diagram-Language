from typing import List, NamedTuple

class EdgeOptions(NamedTuple):
    text_place: str
    color: str
    font: str
    font_size: int

class VertexOptions(NamedTuple):
    #text_place: str
    color: str
    font: str
    font_size: int

class Vertex(NamedTuple):
    cost: int = None
    name: str = None
    vertex_options: VertexOptions = None


class Edge(NamedTuple):
    first_vertex: Vertex
    second_vertex: Vertex
    name: str = None
    cost: int = None
    edge_options: EdgeOptions = None


class Graph(NamedTuple):
    edges: List[Edge]
    vertices: List[Vertex]
    layout: str = "default"  # change it
    background: str = "white"
    graph_title: str = "title"
    save_format: str = "jpg"


