# Generated from ../antlrInput/GDL.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .GDLParser import GDLParser
else:
    from GDLParser import GDLParser

# This class defines a complete generic visitor for a parse tree produced by GDLParser.

class GDLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by GDLParser#program.
    def visitProgram(self, ctx:GDLParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#graph.
    def visitGraph(self, ctx:GDLParser.GraphContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#layout.
    def visitLayout(self, ctx:GDLParser.LayoutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#saveformat.
    def visitSaveformat(self, ctx:GDLParser.SaveformatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#graphtitle.
    def visitGraphtitle(self, ctx:GDLParser.GraphtitleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#background.
    def visitBackground(self, ctx:GDLParser.BackgroundContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#content.
    def visitContent(self, ctx:GDLParser.ContentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#edge.
    def visitEdge(self, ctx:GDLParser.EdgeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#edgeopt.
    def visitEdgeopt(self, ctx:GDLParser.EdgeoptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#edgeoptparams.
    def visitEdgeoptparams(self, ctx:GDLParser.EdgeoptparamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#vertex.
    def visitVertex(self, ctx:GDLParser.VertexContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#value.
    def visitValue(self, ctx:GDLParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#attitude.
    def visitAttitude(self, ctx:GDLParser.AttitudeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#vertexopt.
    def visitVertexopt(self, ctx:GDLParser.VertexoptContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#vertexoptparams.
    def visitVertexoptparams(self, ctx:GDLParser.VertexoptparamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#clr.
    def visitClr(self, ctx:GDLParser.ClrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#placement.
    def visitPlacement(self, ctx:GDLParser.PlacementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#size.
    def visitSize(self, ctx:GDLParser.SizeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by GDLParser#font.
    def visitFont(self, ctx:GDLParser.FontContext):
        return self.visitChildren(ctx)



del GDLParser