// Generated from ../antlrInput/GDL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GDLParser}.
 */
public interface GDLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GDLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GDLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GDLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#graph}.
	 * @param ctx the parse tree
	 */
	void enterGraph(GDLParser.GraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#graph}.
	 * @param ctx the parse tree
	 */
	void exitGraph(GDLParser.GraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#layout}.
	 * @param ctx the parse tree
	 */
	void enterLayout(GDLParser.LayoutContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#layout}.
	 * @param ctx the parse tree
	 */
	void exitLayout(GDLParser.LayoutContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#saveformat}.
	 * @param ctx the parse tree
	 */
	void enterSaveformat(GDLParser.SaveformatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#saveformat}.
	 * @param ctx the parse tree
	 */
	void exitSaveformat(GDLParser.SaveformatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#graphtitle}.
	 * @param ctx the parse tree
	 */
	void enterGraphtitle(GDLParser.GraphtitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#graphtitle}.
	 * @param ctx the parse tree
	 */
	void exitGraphtitle(GDLParser.GraphtitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#background}.
	 * @param ctx the parse tree
	 */
	void enterBackground(GDLParser.BackgroundContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#background}.
	 * @param ctx the parse tree
	 */
	void exitBackground(GDLParser.BackgroundContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(GDLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(GDLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#edge}.
	 * @param ctx the parse tree
	 */
	void enterEdge(GDLParser.EdgeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#edge}.
	 * @param ctx the parse tree
	 */
	void exitEdge(GDLParser.EdgeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#edgeopt}.
	 * @param ctx the parse tree
	 */
	void enterEdgeopt(GDLParser.EdgeoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#edgeopt}.
	 * @param ctx the parse tree
	 */
	void exitEdgeopt(GDLParser.EdgeoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#edgeoptparams}.
	 * @param ctx the parse tree
	 */
	void enterEdgeoptparams(GDLParser.EdgeoptparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#edgeoptparams}.
	 * @param ctx the parse tree
	 */
	void exitEdgeoptparams(GDLParser.EdgeoptparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#vertex}.
	 * @param ctx the parse tree
	 */
	void enterVertex(GDLParser.VertexContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#vertex}.
	 * @param ctx the parse tree
	 */
	void exitVertex(GDLParser.VertexContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(GDLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(GDLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#attitude}.
	 * @param ctx the parse tree
	 */
	void enterAttitude(GDLParser.AttitudeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#attitude}.
	 * @param ctx the parse tree
	 */
	void exitAttitude(GDLParser.AttitudeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#vertexopt}.
	 * @param ctx the parse tree
	 */
	void enterVertexopt(GDLParser.VertexoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#vertexopt}.
	 * @param ctx the parse tree
	 */
	void exitVertexopt(GDLParser.VertexoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#vertexoptparams}.
	 * @param ctx the parse tree
	 */
	void enterVertexoptparams(GDLParser.VertexoptparamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#vertexoptparams}.
	 * @param ctx the parse tree
	 */
	void exitVertexoptparams(GDLParser.VertexoptparamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#clr}.
	 * @param ctx the parse tree
	 */
	void enterClr(GDLParser.ClrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#clr}.
	 * @param ctx the parse tree
	 */
	void exitClr(GDLParser.ClrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#vertexclr}.
	 * @param ctx the parse tree
	 */
	void enterVertexclr(GDLParser.VertexclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#vertexclr}.
	 * @param ctx the parse tree
	 */
	void exitVertexclr(GDLParser.VertexclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#edgeclr}.
	 * @param ctx the parse tree
	 */
	void enterEdgeclr(GDLParser.EdgeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#edgeclr}.
	 * @param ctx the parse tree
	 */
	void exitEdgeclr(GDLParser.EdgeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#fontclr}.
	 * @param ctx the parse tree
	 */
	void enterFontclr(GDLParser.FontclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#fontclr}.
	 * @param ctx the parse tree
	 */
	void exitFontclr(GDLParser.FontclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#placement}.
	 * @param ctx the parse tree
	 */
	void enterPlacement(GDLParser.PlacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#placement}.
	 * @param ctx the parse tree
	 */
	void exitPlacement(GDLParser.PlacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#edgethickness}.
	 * @param ctx the parse tree
	 */
	void enterEdgethickness(GDLParser.EdgethicknessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#edgethickness}.
	 * @param ctx the parse tree
	 */
	void exitEdgethickness(GDLParser.EdgethicknessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#fontsize}.
	 * @param ctx the parse tree
	 */
	void enterFontsize(GDLParser.FontsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#fontsize}.
	 * @param ctx the parse tree
	 */
	void exitFontsize(GDLParser.FontsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#vertexsize}.
	 * @param ctx the parse tree
	 */
	void enterVertexsize(GDLParser.VertexsizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#vertexsize}.
	 * @param ctx the parse tree
	 */
	void exitVertexsize(GDLParser.VertexsizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#font}.
	 * @param ctx the parse tree
	 */
	void enterFont(GDLParser.FontContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#font}.
	 * @param ctx the parse tree
	 */
	void exitFont(GDLParser.FontContext ctx);
}