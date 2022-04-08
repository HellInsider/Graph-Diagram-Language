from collections import namedtuple

from GDLParser import GDLParser
from GDLVisitor import GDLVisitor
import dto


class GDLVisitorImpl(GDLVisitor):

    def __init__(self):
        self.isOriented = False


    def visitProgram(self, ctx: GDLParser.ProgramContext):
        print("Program")
        graphs = []

        for g in ctx.graph():
            graphs.append(self.visit(g))
        return graphs

    # Visit a parse tree produced by GDLParser#graph.
    def visitGraph(self, ctx: GDLParser.GraphContext):
        print("Graph")

        default_graph_options = dto.Graph()

        edges = vertices = None
        isOriented = default_graph_options.is_oriented
        edges, vertices = self.visit(ctx.content())

        layout = default_graph_options.layout
        background = default_graph_options.background
        #graph_title = default_graph_options.graph_title
        #saveformat = default_graph_options.save_format
        use_vertex_names = default_graph_options.use_vertex_names
        font = default_graph_options.font
        font_color = default_graph_options.font_color
        font_size = default_graph_options.font_size

        for t in ctx.layout():
            layout = self.visit(t)

        for t in ctx.background():
            background = self.visit(t)

        '''for t in ctx.graphtitle():
            graph_title = self.visit(t)

        for t in ctx.saveformat():
            saveformat = self.visit(t)
            '''
        for t in ctx.usevertexnames():
            use_vertex_names = self.visit(t)

        for t in ctx.font():
            font = self.visit(t)

        for t in ctx.fontclr():
            font_color = self.visit(t)

        for t in ctx.fontsize():
            font_size = self.visit(t)

        #graph = dto.Graph(edges, vertices, self.isOriented, layout, graph_title, saveformat,
         #                 background, font, font_color, font_size)
        graph = dto.Graph(edges, vertices, self.isOriented, layout, use_vertex_names, background, font, font_color, font_size)
        return graph

    # Visit a parse tree produced by GDLParser#layout.
    def visitLayout(self, ctx: GDLParser.LayoutContext):
        print('Layout')
        return ctx.getChild(2).getText()

    def visitUsevertexnames(self, ctx:GDLParser.UsevertexnamesContext):
        print('UseVertexNames')
        val = ctx.getChild(2).getText()
        if val.lower() == 'true':
            return True

        return False


    # Visit a parse tree produced by GDLParser#saveformat.
    #def visitSaveformat(self, ctx: GDLParser.SaveformatContext):
    #    print('SaveFormat')
    #    return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#graphtitle.
    #def visitGraphtitle(self, ctx: GDLParser.GraphtitleContext):
     #   print('GraphTitle')
      #  return ctx.getChild(2).getText()

    def visitBackground(self, ctx: GDLParser.BackgroundContext):
        print('Background')
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#edges.
    def visitContent(self, ctx: GDLParser.ContentContext):
        print("Content")
        edges = list()
        vertices = list()

        for c in ctx.edge():
            edges.append(self.visit(c))

        for c in ctx.vertex():
            vertices.append(self.visit(c))

        return edges, vertices

    # Visit a parse tree produced by GDLParser#edge.
    def visitEdge(self, ctx: GDLParser.EdgeContext):
        print('Edge')

        edgeOptions = None
        label = ""

        self.visit(ctx.attitude())

        if ctx.edgeopt() is not None:
            edgeOptions = self.visit(ctx.edgeopt())
        else:
            edgeOptions = dto.EdgeOptions()

        if ctx.value() is not None:
            label = self.visit(ctx.value())

        return dto.Edge(self.visit(ctx.vertex(0)), self.visit(ctx.vertex(1)), label, edgeOptions)

    # Visit a parse tree produced by GDLParser#edgeopt.
    def visitEdgeopt(self, ctx: GDLParser.EdgeoptContext):
        print('Edgeopt')

        default_edge_options = dto.EdgeOptions()
        edge_color = default_edge_options.edge_color
        edge_thickness = default_edge_options.edge_thickness
        text_place = default_edge_options.text_place

        for i in range(ctx.getChildCount() - 2):
            child = ctx.edgeoptparams(i).getChild(0)

            if type(child) == GDLParser.EdgeclrContext:
                edge_color = self.visit(child)
            elif type(child) == GDLParser.EdgethicknessContext:
                edge_thickness = int(self.visit(child))
            elif type(child) == GDLParser.PlacementContext:
                text_place = self.visit(child)
            else:
                print('Err')

        return dto.EdgeOptions(text_place, edge_color, edge_thickness)

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

        label = " "
        _id = ctx.getChild(0).getText()
        print(_id)

        if ctx.value() is not None:
            label = self.visit(ctx.value())

        if ctx.vertexopt() is not None:
            vertexOptions = self.visit(ctx.vertexopt())
        else:
            vertexOptions = dto.VertexOptions()

        return dto.Vertex(_id, label, vertexOptions)

    # Visit a parse tree produced by GDLParser#value.
    def visitValue(self, ctx: GDLParser.ValueContext):
        print('Value')
        return ctx.getText()

    # Visit a parse tree produced by GDLParser#attitude.
    def visitAttitude(self, ctx: GDLParser.AttitudeContext):
        print("Attitude")

        if ctx.getText() == '->' or ctx.getText() == '<-':
            self.isOriented = True

        return ctx.getText()

    # Visit a parse tree produced by GDLParser#vertexopt.
    def visitVertexopt(self, ctx: GDLParser.VertexoptContext):
        print("Vertexopt")

        default_vertex_options = dto.VertexOptions()
        vertex_color = default_vertex_options.vertex_color
        vertex_size = default_vertex_options.vertex_size

        print(ctx.getChildCount())
        for i in range(ctx.getChildCount() - 2):
            child = ctx.vertexoptparams(i).getChild(0)

            if type(child) == GDLParser.VertexclrContext:
                vertex_color = self.visit(child)
            elif type(child) == GDLParser.VertexsizeContext:
                vertex_size = int(self.visit(child))
            else:
                print('Err')

        return dto.VertexOptions(vertex_size, vertex_color)

    # Visit a parse tree produced by GDLParser#vertexoptparams.
    def visitVertexoptparams(self, ctx: GDLParser.VertexoptparamsContext):
        print("Vertexoptparams")
        return self.visit(ctx.getChild(0))

    # Visit a parse tree produced by GDLParser#clr.
    def visitClr(self, ctx: GDLParser.ClrContext):
        print("Clr")
        return ctx.getChild(0).getText()

    def visitEdgethickness(self, ctx:GDLParser.EdgethicknessContext):
        print("EdgeThick")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#edgeclr.
    def visitEdgeclr(self, ctx:GDLParser.EdgeclrContext):
        print("EdgeClr")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#fontclr.
    def visitFontclr(self, ctx:GDLParser.FontclrContext):
        print("FontClr")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#placement.
    def visitPlacement(self, ctx: GDLParser.PlacementContext):
        print("Placement")
        return ctx.getChild(2).getText()

    def visitFontsize(self, ctx: GDLParser.FontsizeContext):
        print("FontSize")
        return ctx.getChild(2).getText()

    def visitVertexclr(selfself, ctx: GDLParser.VertexclrContext):
        print("Vertex color")
        return ctx.getChild(2).getText()

    def visitVertexsize(self, ctx:GDLParser.VertexsizeContext):
        print("VertexSize")
        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#font.
    def visitFont(self, ctx: GDLParser.FontContext):
        print("Font")
        return ctx.getChild(2).getText()
