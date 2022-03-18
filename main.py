import sys
from GDLVisitorImpl import GDLVisitorImpl
from antlr4 import *
from ANTLR.sources.GDLLexer import GDLLexer
from ANTLR.sources.GDLParser import GDLParser

if __name__ == "__main__":
    data = FileStream('ANTLR/samples/test1.txt', encoding='utf-8')
    # lexer
    lexer = GDLLexer(data)
    stream = CommonTokenStream(lexer)
    # parser
    parser = GDLParser(stream)
    tree = parser.program()
    # # evaluator
    visitor = GDLVisitorImpl()
    output = visitor.visit(tree)
    print(output)