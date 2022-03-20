from collections import namedtuple

from GDLParser import GDLParser
from GDLVisitor import GDLVisitor
import dto


class GDLVisitorImpl(GDLVisitor):
    def visitProgram(self, ctx: GDLParser.ProgramContext):
        print("Program")
        graphs = []

        for g in ctx.graph():
            graphs.append(self.visit(g))
        return graphs

    # Visit a parse tree produced by GDLParser#graph.
    def visitGraph(self, ctx: GDLParser.GraphContext):
        print("Graph")

        edges = vertices = None
        edges, vertices = self.visit(ctx.content())

        layout = background = graph_title = saveformat = None

        for t in ctx.layout():
            layout = self.visit(t)

        for t in ctx.background():
            background = self.visit(t)

        for t in ctx.graphtitle():
            graph_title = self.visit(t)

        for t in ctx.saveformat():
            saveformat = self.visit(t)

        graph = dto.Graph(edges, vertices, layout, background, graph_title, saveformat)
        return graph

    # Visit a parse tree produced by GDLParser#layout.
    def visitLayout(self, ctx: GDLParser.LayoutContext):
        print('Layout')
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#saveformat.
    def visitSaveformat(self, ctx: GDLParser.SaveformatContext):
        print('SaveFormat')
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#graphtitle.
    def visitGraphtitle(self, ctx: GDLParser.GraphtitleContext):
        print('GraphTitle')
        return ctx.getChild(2).getText()

    def visitBackground(self, ctx: GDLParser.BackgroundContext):
        print('Background')
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#edges.
    def visitContent(self, ctx: GDLParser.ContentContext):
        print("Content")
        edges = list()
        vertices = list()

        '''print(ctx.getChildCount())
        for c in ctx.getChildCount():
            if type(ctx.getChild(i)) == GDLParser.EdgeContext:
                edges.append(self.visit(ctx.getChild(i)))
            else:
                vertices.append(self.visit(ctx.getChild(i)))'''

        for c in ctx.edge():
            edges.append(self.visit(c))

        for c in ctx.vertex():
            vertices.append(self.visit(c))

        return edges, vertices

    # Visit a parse tree produced by GDLParser#edge.
    def visitEdge(self, ctx: GDLParser.EdgeContext):
        print('Edge')

        cost = None
        name = None

        if (ctx.value() is not None):
            cost = self.visit(ctx.value())

            if cost.isnumeric():
                cost = int(cost)
            else:
                name = cost
                cost = None

        edgeOptions = None
        if ctx.edgeopt() != None:
            edgeOptions = self.visit(ctx.edgeopt())

        return dto.Edge(self.visit(ctx.vertex(0)), self.visit(ctx.vertex(1)), name, cost, edgeOptions)

    # Visit a parse tree produced by GDLParser#edgeopt.
    def visitEdgeopt(self, ctx: GDLParser.EdgeoptContext):
        print('Edgeopt')

        clr = font_size = font = text_place = None

        for i in range(ctx.getChildCount() - 2):
            child = ctx.edgeoptparams(i).getChild(0)

            if type(child) == GDLParser.ClrContext:
                clr = self.visit(child)
            elif type(child) == GDLParser.SizeContext:
                font_size = int(self.visit(child))
            elif type(child) == GDLParser.FontContext:
                font = self.visit(child)
            elif type(child) == GDLParser.PlacementContext:
                text_place = self.visit(child)
            else:
                print('Err')

        return dto.EdgeOptions(text_place, clr, font, font_size)

    # Visit a parse tree produced by GDLParser#edgeoptparams.
    def visitEdgeoptparams(self, ctx: GDLParser.EdgeoptparamsContext):
        print('Edgeoptparams')
        return self.visit(ctx.getChild(0))
        # print(ctx.getText())
        # return self.visit(ctx.getChild(0))
        # print(f"Font: {self.visit(ctx.font())}")
        # print(f"Size: {self.visit(ctx.size())}")
        # print(f"Place: {self.visit(ctx.placement())}")

    # Visit a parse tree produced by GDLParser#vertex.
    def visitVertex(self, ctx: GDLParser.VertexContext):
        print('Vertex')

        cost = None
        name = None

        if (ctx.value() is not None):
            cost = self.visit(ctx.value())

            if cost.isnumeric():
                cost = int(cost)
            else:
                name = cost
                cost = None

        vertexOptions = None
        if ctx.vertexopt() is not None:
            vertexOptions = self.visit(ctx.vertexopt())

        return dto.Vertex(cost, name, vertexOptions)

    # Visit a parse tree produced by GDLParser#value.
    def visitValue(self, ctx: GDLParser.ValueContext):
        print('Value')
        return ctx.getText()

    # Visit a parse tree produced by GDLParser#attitude.
    def visitAttitude(self, ctx: GDLParser.AttitudeContext):
        print("Attitude")
        return ctx.getText()

    # Visit a parse tree produced by GDLParser#vertexopt.
    def visitVertexopt(self, ctx: GDLParser.VertexoptContext):
        print("Vertexopt")
        clr = font_size = font = None

        print(ctx.getChildCount())
        for i in range(ctx.getChildCount() - 2):
            child = ctx.vertexoptparams(i).getChild(0)

            if type(child) == GDLParser.ClrContext:
                clr = self.visit(child)
            elif type(child) == GDLParser.SizeContext:
                font_size = int(self.visit(child))
            elif type(child) == GDLParser.FontContext:
                font = self.visit(child)
            else:
                print('Err')

        return dto.VertexOptions(clr, font, font_size)

    # Visit a parse tree produced by GDLParser#vertexoptparams.
    def visitVertexoptparams(self, ctx: GDLParser.VertexoptparamsContext):
        print("Vertexoptparams")
        return self.visit(ctx.getChild(0))

    # Visit a parse tree produced by GDLParser#clr.
    def visitClr(self, ctx: GDLParser.ClrContext):
        # mb add exceptions
        print("Clr")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#placement.
    def visitPlacement(self, ctx: GDLParser.PlacementContext):
        print("Placement")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#size.
    def visitSize(self, ctx: GDLParser.SizeContext):
        print("FontSize")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#font.
    def visitFont(self, ctx: GDLParser.FontContext):
        print("Font")
        return ctx.getChild(2).getText()
