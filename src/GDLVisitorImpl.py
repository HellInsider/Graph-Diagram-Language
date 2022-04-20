from ANTLR.sources.GDLParser import GDLParser
from ANTLR.sources.GDLVisitor import GDLVisitor
import dto


class GDLVisitorImpl(GDLVisitor):

    def __init__(self):
        self.isOriented = False
        self.use_vertex_names = False

    def visitProgram(self, ctx: GDLParser.ProgramContext):
        graphs = []

        for g in ctx.graph():
            graphs.append(self.visit(g))
        return graphs

    # Visit a parse tree produced by GDLParser#graph.
    def visitGraph(self, ctx: GDLParser.GraphContext):
        default_graph_options = dto.Graph()

        edges = vertices = None
        isOriented = default_graph_options.is_oriented

        layout = default_graph_options.layout
        background = default_graph_options.background
        use_vertex_names = default_graph_options.use_vertex_names
        font = default_graph_options.font
        font_color = default_graph_options.font_color
        font_size = default_graph_options.font_size

        for t in ctx.usevertexnames():
            use_vertex_names = self.visit(t)
            self.use_vertex_names = use_vertex_names

        edges, vertices = self.visit(ctx.content())

        for t in ctx.layout():
            layout = self.visit(t)

        for t in ctx.background():
            background = self.visit(t)

        for t in ctx.font():
            font = self.visit(t)

        for t in ctx.fontclr():
            font_color = self.visit(t)

        for t in ctx.fontsize():
            font_size = self.visit(t)

        graph = dto.Graph(edges, vertices, self.isOriented, layout, use_vertex_names, background, font, font_color,
                          font_size)
        return graph

    # Visit a parse tree produced by GDLParser#layout.
    def visitLayout(self, ctx: GDLParser.LayoutContext):

        return ctx.getChild(2).getText()

    def visitUsevertexnames(self, ctx: GDLParser.UsevertexnamesContext):

        val = ctx.getChild(2).getText()
        if val.lower() == 'true':
            return True

        return False

    def visitBackground(self, ctx: GDLParser.BackgroundContext):

        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#edges.
    def visitContent(self, ctx: GDLParser.ContentContext):

        edges = list()
        vertices = list()

        for c in ctx.edge():
            edges.append(self.visit(c))

        for c in ctx.vertex():
            vertices.append(self.visit(c))

        return edges, vertices

    # Visit a parse tree produced by GDLParser#edge.
    def visitEdge(self, ctx: GDLParser.EdgeContext):

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

        return self.visit(ctx.getChild(0))

    # Visit a parse tree produced by GDLParser#vertex.
    def visitVertex(self, ctx: GDLParser.VertexContext):

        label = " "
        _id = ctx.getChild(0).getText()

        if ctx.value() is not None:
            label = self.visit(ctx.value())

        if ctx.vertexopt() is not None:
            vertexOptions = self.visit(ctx.vertexopt())
        else:
            vertexOptions = dto.VertexOptions()

        if self.use_vertex_names:
            _id = _id + "(" + label + ")"
            label = _id

        return dto.Vertex(_id, label, vertexOptions)

    # Visit a parse tree produced by GDLParser#value.
    def visitValue(self, ctx: GDLParser.ValueContext):

        return ctx.getText()

    # Visit a parse tree produced by GDLParser#attitude.
    def visitAttitude(self, ctx: GDLParser.AttitudeContext):

        if ctx.getText() == '->' or ctx.getText() == '<-':
            self.isOriented = True

        return ctx.getText()

    # Visit a parse tree produced by GDLParser#vertexopt.
    def visitVertexopt(self, ctx: GDLParser.VertexoptContext):

        default_vertex_options = dto.VertexOptions()
        vertex_color = default_vertex_options.vertex_color
        vertex_size = default_vertex_options.vertex_size

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

        return self.visit(ctx.getChild(0))

    # Visit a parse tree produced by GDLParser#clr.
    def visitClr(self, ctx: GDLParser.ClrContext):

        return ctx.getChild(0).getText()

    def visitEdgethickness(self, ctx: GDLParser.EdgethicknessContext):

        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#edgeclr.
    def visitEdgeclr(self, ctx: GDLParser.EdgeclrContext):

        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#fontclr.
    def visitFontclr(self, ctx: GDLParser.FontclrContext):

        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#placement.
    def visitPlacement(self, ctx: GDLParser.PlacementContext):

        return ctx.getChild(2).getText()

    def visitFontsize(self, ctx: GDLParser.FontsizeContext):

        return ctx.getChild(2).getText()

    def visitVertexclr(selfself, ctx: GDLParser.VertexclrContext):
        return ctx.getChild(2).getText()

    def visitVertexsize(self, ctx: GDLParser.VertexsizeContext):

        return ctx.getChild(2).getText()

    # Visit a parse tree produced by GDLParser#font.
    def visitFont(self, ctx: GDLParser.FontContext):

        return ctx.getChild(2).getText()
