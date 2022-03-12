// Generated from GDL.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link GDLParser#edges}.
	 * @param ctx the parse tree
	 */
	void enterEdges(GDLParser.EdgesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#edges}.
	 * @param ctx the parse tree
	 */
	void exitEdges(GDLParser.EdgesContext ctx);
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
	 * Enter a parse tree produced by {@link GDLParser#optional}.
	 * @param ctx the parse tree
	 */
	void enterOptional(GDLParser.OptionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#optional}.
	 * @param ctx the parse tree
	 */
	void exitOptional(GDLParser.OptionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GDLParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(GDLParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(GDLParser.ParamContext ctx);
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
	 * Enter a parse tree produced by {@link GDLParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(GDLParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GDLParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(GDLParser.SizeContext ctx);
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