import sys
from GDLVisitorImpl import GDLVisitorImpl
from antlr4 import *
from GDLLexer import GDLLexer
from GDLParser import GDLParser
from dto import Graph

if __name__ == "__main__":
    data = FileStream('D:\Workspace\ANTLR\GraphDiagramLanguage\samples\\test3.txt', encoding='utf-8')
    # lexer
    lexer = GDLLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = GDLParser(stream)
    tree = parser.program()
    # # evaluator
    visitor = GDLVisitorImpl()
    graphs = visitor.visit(tree)        #here graphs
    print(graphs)
