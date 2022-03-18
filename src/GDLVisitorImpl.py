from ANTLR.sources.GDLParser import GDLParser
from ANTLR.sources.GDLVisitor import GDLVisitor


class GDLVisitorImpl(GDLVisitor):
    def visitProgram(self, ctx:GDLParser.ProgramContext):
        print(ctx.getText())
        return self.visit(ctx.graph()[0])

    # Visit a parse tree produced by GDLParser#graph.
    def visitGraph(self, ctx:GDLParser.GraphContext):
        self.visit(ctx.graphtitle())
        self.visit(ctx.layout())
        self.visit(ctx.saveformat())
        self.visit(ctx.edges())

    # Visit a parse tree produced by GDLParser#layout.
    def visitLayout(self, ctx:GDLParser.LayoutContext):
        print(ctx.getText())

    # Visit a parse tree produced by GDLParser#saveformat.
    def visitSaveformat(self, ctx:GDLParser.SaveformatContext):
        print(ctx.getText())

    # Visit a parse tree produced by GDLParser#graphtitle.
    def visitGraphtitle(self, ctx:GDLParser.GraphtitleContext):
        print(ctx.getText())

    # Visit a parse tree produced by GDLParser#edges.
    def visitEdges(self, ctx:GDLParser.EdgesContext):
        print("Edges")
        for i in range(ctx.getChildCount()):
            self.visit(ctx.getChild(i))

    # Visit a parse tree produced by GDLParser#edge.
    def visitEdge(self, ctx:GDLParser.EdgeContext):
        print(ctx.getText())
        # print(ctx.vertex())
        # print(self.visit(ctx.vertex(0)))
        self.visit(ctx.edgeopt())

    # Visit a parse tree produced by GDLParser#edgeopt.
    def visitEdgeopt(self, ctx:GDLParser.EdgeoptContext):
        for i in range(ctx.getChildCount() - 2):
            print(self.visit(ctx.edgeoptparams(i)))
        # print(ctx.getText())

    # Visit a parse tree produced by GDLParser#edgeoptparams.
    def visitEdgeoptparams(self, ctx:GDLParser.EdgeoptparamsContext):
        # print(ctx.getText())
        return self.visit(ctx.getChild(0))
        # print(f"Font: {self.visit(ctx.font())}")
        # print(f"Size: {self.visit(ctx.size())}")
        # print(f"Place: {self.visit(ctx.placement())}")

    # Visit a parse tree produced by GDLParser#vertex.
    def visitVertex(self, ctx:GDLParser.VertexContext):
        print(self.visit(ctx.value()))
        print("Vertex")

    # Visit a parse tree produced by GDLParser#value.
    def visitValue(self, ctx:GDLParser.ValueContext):
        return ctx.getText()

    # Visit a parse tree produced by GDLParser#attitude.
    def visitAttitude(self, ctx:GDLParser.AttitudeContext):
        print("Attitude")

    # Visit a parse tree produced by GDLParser#vertexopt.
    def visitVertexopt(self, ctx:GDLParser.VertexoptContext):
        print("Vertexopt")

    # Visit a parse tree produced by GDLParser#vertexoptparams.
    def visitVertexoptparams(self, ctx:GDLParser.VertexoptparamsContext):
        print("Vertexoptparams")

    # Visit a parse tree produced by GDLParser#clr.
    def visitClr(self, ctx:GDLParser.ClrContext):
        # mb add exceptions
        return ctx.getChild(2)

    # Visit a parse tree produced by GDLParser#placement.
    def visitPlacement(self, ctx:GDLParser.PlacementContext):
        return ctx.getChild(2)

    # Visit a parse tree produced by GDLParser#size.
    def visitSize(self, ctx:GDLParser.SizeContext):
        return ctx.getChild(2)

    # Visit a parse tree produced by GDLParser#font.
    def visitFont(self, ctx:GDLParser.FontContext):
        return ctx.getChild(2)
