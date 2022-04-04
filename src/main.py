import sys
import os
from GDLVisitorImpl import GDLVisitorImpl
from antlr4 import *
from ANTLR.sources.GDLLexer import GDLLexer
from ANTLR.sources.GDLParser import GDLParser
from GraphViz import GraphViz

if __name__ == "__main__":
    data = FileStream('D:/study/4 курс/Graph-Diagram-Language/ANTLR/samples/dijkstra_step6.txt', encoding='utf-8')
    # lexer
    lexer = GDLLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = GDLParser(stream)
    tree = parser.program()
    # # evaluator
    visitor = GDLVisitorImpl()
    graphs = visitor.visit(tree)        #here graphs

    for graph in graphs:
        gr = GraphViz(graph)
        gr.draw_in_file()





