// Generated from ../antlrInput/GDL.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, INTEGER=54, TEXT=55, EXTENDETTEXT=56, SPACE=57, COMMENT=58, 
		LINE_COMMENT=59;
	public static final int
		RULE_program = 0, RULE_graph = 1, RULE_layout = 2, RULE_saveformat = 3, 
		RULE_graphtitle = 4, RULE_background = 5, RULE_content = 6, RULE_edge = 7, 
		RULE_edgeopt = 8, RULE_edgeoptparams = 9, RULE_vertex = 10, RULE_value = 11, 
		RULE_attitude = 12, RULE_vertexopt = 13, RULE_vertexoptparams = 14, RULE_clr = 15, 
		RULE_vertexclr = 16, RULE_edgeclr = 17, RULE_fontclr = 18, RULE_placement = 19, 
		RULE_edgethickness = 20, RULE_fontsize = 21, RULE_vertexsize = 22, RULE_font = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "graph", "layout", "saveformat", "graphtitle", "background", 
			"content", "edge", "edgeopt", "edgeoptparams", "vertex", "value", "attitude", 
			"vertexopt", "vertexoptparams", "clr", "vertexclr", "edgeclr", "fontclr", 
			"placement", "edgethickness", "fontsize", "vertexsize", "font"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Graph'", "'{'", "'}'", "'layout'", "':'", "'dot'", "'neato'", 
			"'twopi'", "'circo'", "'fdp'", "'sfdp'", "';'", "'saveAs'", "'png'", 
			"'jpg'", "'title'", "'background'", "'='", "'['", "']'", "','", "'('", 
			"')'", "'->'", "'<-'", "'-'", "'clr'", "'Red'", "'Green'", "'Blue'", 
			"'Gray'", "'Yellow'", "'Black'", "'White'", "'Pink'", "'Cyan'", "'vertexClr'", 
			"'edgeClr'", "'fontClr'", "'place'", "'Left'", "'Right'", "'Up'", "'Down'", 
			"'U-L'", "'U-R'", "'D-L'", "'D-R'", "'Center'", "'edgeThick'", "'fontSize'", 
			"'vertexSize'", "'font'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "INTEGER", "TEXT", "EXTENDETTEXT", 
			"SPACE", "COMMENT", "LINE_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "GDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GDLParser.EOF, 0); }
		public List<GraphContext> graph() {
			return getRuleContexts(GraphContext.class);
		}
		public GraphContext graph(int i) {
			return getRuleContext(GraphContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				graph();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphContext extends ParserRuleContext {
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public List<GraphtitleContext> graphtitle() {
			return getRuleContexts(GraphtitleContext.class);
		}
		public GraphtitleContext graphtitle(int i) {
			return getRuleContext(GraphtitleContext.class,i);
		}
		public List<LayoutContext> layout() {
			return getRuleContexts(LayoutContext.class);
		}
		public LayoutContext layout(int i) {
			return getRuleContext(LayoutContext.class,i);
		}
		public List<BackgroundContext> background() {
			return getRuleContexts(BackgroundContext.class);
		}
		public BackgroundContext background(int i) {
			return getRuleContext(BackgroundContext.class,i);
		}
		public List<SaveformatContext> saveformat() {
			return getRuleContexts(SaveformatContext.class);
		}
		public SaveformatContext saveformat(int i) {
			return getRuleContext(SaveformatContext.class,i);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitGraph(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_graph);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(T__0);
			setState(56);
			match(T__1);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__12) | (1L << T__15) | (1L << T__16))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__15:
					{
					setState(57);
					graphtitle();
					}
					break;
				case T__3:
					{
					setState(58);
					layout();
					}
					break;
				case T__16:
					{
					setState(59);
					background();
					}
					break;
				case T__12:
					{
					setState(60);
					saveformat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			content();
			setState(67);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LayoutContext extends ParserRuleContext {
		public LayoutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_layout; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterLayout(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitLayout(this);
		}
	}

	public final LayoutContext layout() throws RecognitionException {
		LayoutContext _localctx = new LayoutContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_layout);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(T__3);
			setState(70);
			match(T__4);
			setState(71);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SaveformatContext extends ParserRuleContext {
		public SaveformatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saveformat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterSaveformat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitSaveformat(this);
		}
	}

	public final SaveformatContext saveformat() throws RecognitionException {
		SaveformatContext _localctx = new SaveformatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_saveformat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__12);
			setState(75);
			match(T__4);
			setState(76);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(77);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GraphtitleContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(GDLParser.TEXT, 0); }
		public TerminalNode EXTENDETTEXT() { return getToken(GDLParser.EXTENDETTEXT, 0); }
		public GraphtitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graphtitle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterGraphtitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitGraphtitle(this);
		}
	}

	public final GraphtitleContext graphtitle() throws RecognitionException {
		GraphtitleContext _localctx = new GraphtitleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_graphtitle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__15);
			setState(80);
			match(T__4);
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==EXTENDETTEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BackgroundContext extends ParserRuleContext {
		public ClrContext clr() {
			return getRuleContext(ClrContext.class,0);
		}
		public BackgroundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_background; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterBackground(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitBackground(this);
		}
	}

	public final BackgroundContext background() throws RecognitionException {
		BackgroundContext _localctx = new BackgroundContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_background);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__16);
			setState(85);
			match(T__4);
			setState(86);
			clr();
			setState(87);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitContent(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(91);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(89);
					edge();
					}
					break;
				case 2:
					{
					setState(90);
					vertex();
					}
					break;
				}
				}
				setState(93); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeContext extends ParserRuleContext {
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public AttitudeContext attitude() {
			return getRuleContext(AttitudeContext.class,0);
		}
		public EdgeoptContext edgeopt() {
			return getRuleContext(EdgeoptContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitEdge(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edge);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			vertex();
			setState(96);
			attitude();
			setState(97);
			vertex();
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(98);
					match(T__4);
					setState(99);
					edgeopt();
					}
				}

				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(102);
					match(T__17);
					setState(103);
					value();
					}
				}

				}
				break;
			case 2:
				{
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__17) {
					{
					setState(106);
					match(T__17);
					setState(107);
					value();
					}
				}

				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(110);
					match(T__4);
					setState(111);
					edgeopt();
					}
				}

				}
				break;
			}
			setState(116);
			match(T__11);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeoptContext extends ParserRuleContext {
		public List<EdgeoptparamsContext> edgeoptparams() {
			return getRuleContexts(EdgeoptparamsContext.class);
		}
		public EdgeoptparamsContext edgeoptparams(int i) {
			return getRuleContext(EdgeoptparamsContext.class,i);
		}
		public EdgeoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterEdgeopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitEdgeopt(this);
		}
	}

	public final EdgeoptContext edgeopt() throws RecognitionException {
		EdgeoptContext _localctx = new EdgeoptContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edgeopt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__18);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(119);
				edgeoptparams();
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__49) | (1L << T__50) | (1L << T__52))) != 0) );
			setState(124);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeoptparamsContext extends ParserRuleContext {
		public FontclrContext fontclr() {
			return getRuleContext(FontclrContext.class,0);
		}
		public PlacementContext placement() {
			return getRuleContext(PlacementContext.class,0);
		}
		public FontsizeContext fontsize() {
			return getRuleContext(FontsizeContext.class,0);
		}
		public FontContext font() {
			return getRuleContext(FontContext.class,0);
		}
		public EdgeclrContext edgeclr() {
			return getRuleContext(EdgeclrContext.class,0);
		}
		public EdgethicknessContext edgethickness() {
			return getRuleContext(EdgethicknessContext.class,0);
		}
		public EdgeoptparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeoptparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterEdgeoptparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitEdgeoptparams(this);
		}
	}

	public final EdgeoptparamsContext edgeoptparams() throws RecognitionException {
		EdgeoptparamsContext _localctx = new EdgeoptparamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_edgeoptparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				{
				setState(126);
				fontclr();
				}
				break;
			case T__39:
				{
				setState(127);
				placement();
				}
				break;
			case T__50:
				{
				setState(128);
				fontsize();
				}
				break;
			case T__52:
				{
				setState(129);
				font();
				}
				break;
			case T__37:
				{
				setState(130);
				edgeclr();
				}
				break;
			case T__49:
				{
				setState(131);
				edgethickness();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(134);
				match(T__20);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(GDLParser.TEXT, 0); }
		public VertexoptContext vertexopt() {
			return getRuleContext(VertexoptContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VertexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterVertex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitVertex(this);
		}
	}

	public final VertexContext vertex() throws RecognitionException {
		VertexContext _localctx = new VertexContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vertex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TEXT);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__21) {
				{
				setState(138);
				match(T__21);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INTEGER || _la==TEXT) {
					{
					setState(139);
					value();
					}
				}

				setState(142);
				match(T__22);
				}
			}

			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(145);
				vertexopt();
				}
			}

			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(148);
				match(T__11);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GDLParser.INTEGER, 0); }
		public TerminalNode TEXT() { return getToken(GDLParser.TEXT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==INTEGER || _la==TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttitudeContext extends ParserRuleContext {
		public AttitudeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attitude; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterAttitude(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitAttitude(this);
		}
	}

	public final AttitudeContext attitude() throws RecognitionException {
		AttitudeContext _localctx = new AttitudeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attitude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexoptContext extends ParserRuleContext {
		public List<VertexoptparamsContext> vertexoptparams() {
			return getRuleContexts(VertexoptparamsContext.class);
		}
		public VertexoptparamsContext vertexoptparams(int i) {
			return getRuleContext(VertexoptparamsContext.class,i);
		}
		public VertexoptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexopt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterVertexopt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitVertexopt(this);
		}
	}

	public final VertexoptContext vertexopt() throws RecognitionException {
		VertexoptContext _localctx = new VertexoptContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vertexopt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(T__18);
			setState(157); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(156);
				vertexoptparams();
				}
				}
				setState(159); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__38) | (1L << T__50) | (1L << T__51) | (1L << T__52))) != 0) );
			setState(161);
			match(T__19);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexoptparamsContext extends ParserRuleContext {
		public FontclrContext fontclr() {
			return getRuleContext(FontclrContext.class,0);
		}
		public FontsizeContext fontsize() {
			return getRuleContext(FontsizeContext.class,0);
		}
		public FontContext font() {
			return getRuleContext(FontContext.class,0);
		}
		public VertexclrContext vertexclr() {
			return getRuleContext(VertexclrContext.class,0);
		}
		public VertexsizeContext vertexsize() {
			return getRuleContext(VertexsizeContext.class,0);
		}
		public VertexoptparamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexoptparams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterVertexoptparams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitVertexoptparams(this);
		}
	}

	public final VertexoptparamsContext vertexoptparams() throws RecognitionException {
		VertexoptparamsContext _localctx = new VertexoptparamsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vertexoptparams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__38:
				{
				setState(163);
				fontclr();
				}
				break;
			case T__50:
				{
				setState(164);
				fontsize();
				}
				break;
			case T__52:
				{
				setState(165);
				font();
				}
				break;
			case T__36:
				{
				setState(166);
				vertexclr();
				}
				break;
			case T__51:
				{
				setState(167);
				vertexsize();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__20) {
				{
				setState(170);
				match(T__20);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClrContext extends ParserRuleContext {
		public ClrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterClr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitClr(this);
		}
	}

	public final ClrContext clr() throws RecognitionException {
		ClrContext _localctx = new ClrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_clr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(T__26);
			setState(174);
			match(T__17);
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexclrContext extends ParserRuleContext {
		public VertexclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexclr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterVertexclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitVertexclr(this);
		}
	}

	public final VertexclrContext vertexclr() throws RecognitionException {
		VertexclrContext _localctx = new VertexclrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_vertexclr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(T__36);
			setState(178);
			match(T__17);
			setState(179);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgeclrContext extends ParserRuleContext {
		public EdgeclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeclr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterEdgeclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitEdgeclr(this);
		}
	}

	public final EdgeclrContext edgeclr() throws RecognitionException {
		EdgeclrContext _localctx = new EdgeclrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_edgeclr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__37);
			setState(182);
			match(T__17);
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FontclrContext extends ParserRuleContext {
		public FontclrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontclr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterFontclr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitFontclr(this);
		}
	}

	public final FontclrContext fontclr() throws RecognitionException {
		FontclrContext _localctx = new FontclrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fontclr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__38);
			setState(186);
			match(T__17);
			setState(187);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlacementContext extends ParserRuleContext {
		public PlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_placement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterPlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitPlacement(this);
		}
	}

	public final PlacementContext placement() throws RecognitionException {
		PlacementContext _localctx = new PlacementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_placement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(T__39);
			setState(190);
			match(T__17);
			setState(191);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgethicknessContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GDLParser.INTEGER, 0); }
		public EdgethicknessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgethickness; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterEdgethickness(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitEdgethickness(this);
		}
	}

	public final EdgethicknessContext edgethickness() throws RecognitionException {
		EdgethicknessContext _localctx = new EdgethicknessContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_edgethickness);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(T__49);
			setState(194);
			match(T__17);
			setState(195);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FontsizeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GDLParser.INTEGER, 0); }
		public FontsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterFontsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitFontsize(this);
		}
	}

	public final FontsizeContext fontsize() throws RecognitionException {
		FontsizeContext _localctx = new FontsizeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fontsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__50);
			setState(198);
			match(T__17);
			setState(199);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VertexsizeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GDLParser.INTEGER, 0); }
		public VertexsizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vertexsize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterVertexsize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitVertexsize(this);
		}
	}

	public final VertexsizeContext vertexsize() throws RecognitionException {
		VertexsizeContext _localctx = new VertexsizeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vertexsize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(T__51);
			setState(202);
			match(T__17);
			setState(203);
			match(INTEGER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FontContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(GDLParser.TEXT, 0); }
		public FontContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_font; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterFont(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitFont(this);
		}
	}

	public final FontContext font() throws RecognitionException {
		FontContext _localctx = new FontContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_font);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__52);
			setState(206);
			match(T__17);
			setState(207);
			match(TEXT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3@\n\3\f"+
		"\3\16\3C\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\6\b^\n\b\r\b\16\b_\3\t\3"+
		"\t\3\t\3\t\3\t\5\tg\n\t\3\t\3\t\5\tk\n\t\3\t\3\t\5\to\n\t\3\t\3\t\5\t"+
		"s\n\t\5\tu\n\t\3\t\3\t\3\n\3\n\6\n{\n\n\r\n\16\n|\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0087\n\13\3\13\5\13\u008a\n\13\3\f\3\f\3\f\5"+
		"\f\u008f\n\f\3\f\5\f\u0092\n\f\3\f\5\f\u0095\n\f\3\f\5\f\u0098\n\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\6\17\u00a0\n\17\r\17\16\17\u00a1\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\5\20\u00ab\n\20\3\20\5\20\u00ae\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\2\t\3\2\b\r\3\2\20\21\3\29:\3\289\3\2\32\34\3"+
		"\2\36&\3\2+\63\2\u00d8\2\63\3\2\2\2\49\3\2\2\2\6G\3\2\2\2\bL\3\2\2\2\n"+
		"Q\3\2\2\2\fV\3\2\2\2\16]\3\2\2\2\20a\3\2\2\2\22x\3\2\2\2\24\u0086\3\2"+
		"\2\2\26\u008b\3\2\2\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2\2"+
		"\2\36\u00aa\3\2\2\2 \u00af\3\2\2\2\"\u00b3\3\2\2\2$\u00b7\3\2\2\2&\u00bb"+
		"\3\2\2\2(\u00bf\3\2\2\2*\u00c3\3\2\2\2,\u00c7\3\2\2\2.\u00cb\3\2\2\2\60"+
		"\u00cf\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2"+
		"\65\66\3\2\2\2\66\67\3\2\2\2\678\7\2\2\38\3\3\2\2\29:\7\3\2\2:A\7\4\2"+
		"\2;@\5\n\6\2<@\5\6\4\2=@\5\f\7\2>@\5\b\5\2?;\3\2\2\2?<\3\2\2\2?=\3\2\2"+
		"\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2CA\3\2\2\2DE\5\16"+
		"\b\2EF\7\5\2\2F\5\3\2\2\2GH\7\6\2\2HI\7\7\2\2IJ\t\2\2\2JK\7\16\2\2K\7"+
		"\3\2\2\2LM\7\17\2\2MN\7\7\2\2NO\t\3\2\2OP\7\16\2\2P\t\3\2\2\2QR\7\22\2"+
		"\2RS\7\7\2\2ST\t\4\2\2TU\7\16\2\2U\13\3\2\2\2VW\7\23\2\2WX\7\7\2\2XY\5"+
		" \21\2YZ\7\16\2\2Z\r\3\2\2\2[^\5\20\t\2\\^\5\26\f\2][\3\2\2\2]\\\3\2\2"+
		"\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\17\3\2\2\2ab\5\26\f\2bc\5\32\16\2ct"+
		"\5\26\f\2de\7\7\2\2eg\5\22\n\2fd\3\2\2\2fg\3\2\2\2gj\3\2\2\2hi\7\24\2"+
		"\2ik\5\30\r\2jh\3\2\2\2jk\3\2\2\2ku\3\2\2\2lm\7\24\2\2mo\5\30\r\2nl\3"+
		"\2\2\2no\3\2\2\2or\3\2\2\2pq\7\7\2\2qs\5\22\n\2rp\3\2\2\2rs\3\2\2\2su"+
		"\3\2\2\2tf\3\2\2\2tn\3\2\2\2uv\3\2\2\2vw\7\16\2\2w\21\3\2\2\2xz\7\25\2"+
		"\2y{\5\24\13\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177"+
		"\7\26\2\2\177\23\3\2\2\2\u0080\u0087\5&\24\2\u0081\u0087\5(\25\2\u0082"+
		"\u0087\5,\27\2\u0083\u0087\5\60\31\2\u0084\u0087\5$\23\2\u0085\u0087\5"+
		"*\26\2\u0086\u0080\3\2\2\2\u0086\u0081\3\2\2\2\u0086\u0082\3\2\2\2\u0086"+
		"\u0083\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0085\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u008a\7\27\2\2\u0089\u0088\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\25\3\2\2\2\u008b\u0091\79\2\2\u008c\u008e\7\30\2\2\u008d\u008f\5\30\r"+
		"\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0092"+
		"\7\31\2\2\u0091\u008c\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0094\3\2\2\2"+
		"\u0093\u0095\5\34\17\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097"+
		"\3\2\2\2\u0096\u0098\7\16\2\2\u0097\u0096\3\2\2\2\u0097\u0098\3\2\2\2"+
		"\u0098\27\3\2\2\2\u0099\u009a\t\5\2\2\u009a\31\3\2\2\2\u009b\u009c\t\6"+
		"\2\2\u009c\33\3\2\2\2\u009d\u009f\7\25\2\2\u009e\u00a0\5\36\20\2\u009f"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\26\2\2\u00a4\35\3\2\2\2\u00a5\u00ab"+
		"\5&\24\2\u00a6\u00ab\5,\27\2\u00a7\u00ab\5\60\31\2\u00a8\u00ab\5\"\22"+
		"\2\u00a9\u00ab\5.\30\2\u00aa\u00a5\3\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00ae\7\27\2\2\u00ad\u00ac\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\37\3\2\2"+
		"\2\u00af\u00b0\7\35\2\2\u00b0\u00b1\7\24\2\2\u00b1\u00b2\t\7\2\2\u00b2"+
		"!\3\2\2\2\u00b3\u00b4\7\'\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\t\7\2\2"+
		"\u00b6#\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8\u00b9\7\24\2\2\u00b9\u00ba\t"+
		"\7\2\2\u00ba%\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc\u00bd\7\24\2\2\u00bd\u00be"+
		"\t\7\2\2\u00be\'\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c1\7\24\2\2\u00c1"+
		"\u00c2\t\b\2\2\u00c2)\3\2\2\2\u00c3\u00c4\7\64\2\2\u00c4\u00c5\7\24\2"+
		"\2\u00c5\u00c6\78\2\2\u00c6+\3\2\2\2\u00c7\u00c8\7\65\2\2\u00c8\u00c9"+
		"\7\24\2\2\u00c9\u00ca\78\2\2\u00ca-\3\2\2\2\u00cb\u00cc\7\66\2\2\u00cc"+
		"\u00cd\7\24\2\2\u00cd\u00ce\78\2\2\u00ce/\3\2\2\2\u00cf\u00d0\7\67\2\2"+
		"\u00d0\u00d1\7\24\2\2\u00d1\u00d2\79\2\2\u00d2\61\3\2\2\2\26\65?A]_fj"+
		"nrt|\u0086\u0089\u008e\u0091\u0094\u0097\u00a1\u00aa\u00ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}