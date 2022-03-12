// Generated from GDL.g4 by ANTLR 4.9.2
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, INTEGER=45, 
		TEXT=46, SPACE=47;
	public static final int
		RULE_program = 0, RULE_graph = 1, RULE_layout = 2, RULE_saveformat = 3, 
		RULE_graphtitle = 4, RULE_edges = 5, RULE_vertex = 6, RULE_value = 7, 
		RULE_attitude = 8, RULE_optional = 9, RULE_param = 10, RULE_clr = 11, 
		RULE_placement = 12, RULE_size = 13, RULE_font = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "graph", "layout", "saveformat", "graphtitle", "edges", "vertex", 
			"value", "attitude", "optional", "param", "clr", "placement", "size", 
			"font"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Graph'", "'{'", "'}'", "'layout:'", "'dot'", "'neato'", "'twopi'", 
			"'circo'", "'graphs'", "'fdp'", "'sfdp'", "';'", "'saveAs:'", "'png'", 
			"'jpg'", "'title:'", "':'", "'='", "'('", "')'", "'->'", "'<-'", "'-'", 
			"'['", "']'", "','", "'clr'", "'Red'", "'Green'", "'Blue'", "'Gray'", 
			"'Yellow'", "'Black'", "'place'", "'Left'", "'Right'", "'Up'", "'Down'", 
			"'U-L'", "'U-R'", "'D-L'", "'D-R'", "'size'", "'font'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "INTEGER", "TEXT", 
			"SPACE"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				graph();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
			setState(35);
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
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public GraphtitleContext graphtitle() {
			return getRuleContext(GraphtitleContext.class,0);
		}
		public LayoutContext layout() {
			return getRuleContext(LayoutContext.class,0);
		}
		public SaveformatContext saveformat() {
			return getRuleContext(SaveformatContext.class,0);
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
			setState(37);
			match(T__0);
			setState(38);
			match(T__1);
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(39);
				graphtitle();
				}
			}

			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(42);
				layout();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(45);
				saveformat();
				}
			}

			setState(48);
			edges();
			setState(49);
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
			setState(51);
			match(T__3);
			setState(52);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(53);
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
			setState(55);
			match(T__12);
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__14) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(57);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__15);
			setState(60);
			match(TEXT);
			setState(61);
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

	public static class EdgesContext extends ParserRuleContext {
		public List<VertexContext> vertex() {
			return getRuleContexts(VertexContext.class);
		}
		public VertexContext vertex(int i) {
			return getRuleContext(VertexContext.class,i);
		}
		public List<AttitudeContext> attitude() {
			return getRuleContexts(AttitudeContext.class);
		}
		public AttitudeContext attitude(int i) {
			return getRuleContext(AttitudeContext.class,i);
		}
		public List<OptionalContext> optional() {
			return getRuleContexts(OptionalContext.class);
		}
		public OptionalContext optional(int i) {
			return getRuleContext(OptionalContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public EdgesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterEdges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitEdges(this);
		}
	}

	public final EdgesContext edges() throws RecognitionException {
		EdgesContext _localctx = new EdgesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(63);
					vertex();
					}
					break;
				case 2:
					{
					setState(64);
					vertex();
					setState(65);
					attitude();
					setState(66);
					vertex();
					setState(83);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(69);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__16) {
							{
							setState(67);
							match(T__16);
							setState(68);
							optional();
							}
						}

						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(71);
							match(T__17);
							setState(72);
							value();
							}
						}

						}
						break;
					case 2:
						{
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__17) {
							{
							setState(75);
							match(T__17);
							setState(76);
							value();
							}
						}

						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__16) {
							{
							setState(79);
							match(T__16);
							setState(80);
							optional();
							}
						}

						}
						break;
					}
					}
					break;
				}
				setState(87);
				match(T__11);
				}
				}
				setState(91); 
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

	public static class VertexContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(GDLParser.TEXT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public OptionalContext optional() {
			return getRuleContext(OptionalContext.class,0);
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
		enterRule(_localctx, 12, RULE_vertex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(TEXT);
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__18) {
				{
				setState(94);
				match(T__18);
				setState(95);
				value();
				setState(96);
				match(T__19);
				}
			}

			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(100);
				optional();
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(GDLParser.TEXT, 0); }
		public TerminalNode INTEGER() { return getToken(GDLParser.INTEGER, 0); }
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
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
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
		enterRule(_localctx, 16, RULE_attitude);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
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

	public static class OptionalContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public OptionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterOptional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitOptional(this);
		}
	}

	public final OptionalContext optional() throws RecognitionException {
		OptionalContext _localctx = new OptionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_optional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__23);
			setState(109); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(108);
				param();
				}
				}
				setState(111); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__33) | (1L << T__42) | (1L << T__43))) != 0) );
			setState(113);
			match(T__24);
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

	public static class ParamContext extends ParserRuleContext {
		public ClrContext clr() {
			return getRuleContext(ClrContext.class,0);
		}
		public PlacementContext placement() {
			return getRuleContext(PlacementContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public FontContext font() {
			return getRuleContext(FontContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_param);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
				{
				setState(115);
				clr();
				}
				break;
			case T__33:
				{
				setState(116);
				placement();
				}
				break;
			case T__42:
				{
				setState(117);
				size();
				}
				break;
			case T__43:
				{
				setState(118);
				font();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(121);
				match(T__25);
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
		enterRule(_localctx, 22, RULE_clr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(T__26);
			setState(125);
			match(T__17);
			setState(126);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
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
		enterRule(_localctx, 24, RULE_placement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__33);
			setState(129);
			match(T__17);
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(GDLParser.INTEGER, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GDLListener ) ((GDLListener)listener).exitSize(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__42);
			setState(133);
			match(T__17);
			setState(134);
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
		enterRule(_localctx, 28, RULE_font);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__43);
			setState(137);
			match(T__17);
			setState(138);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2"+
		"\16\2#\3\2\3\2\3\3\3\3\3\3\5\3+\n\3\3\3\5\3.\n\3\3\3\5\3\61\n\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7H\n\7\3\7\3\7\5\7L\n\7\3\7\3\7\5\7P\n\7\3\7\3\7\5\7T\n\7\5"+
		"\7V\n\7\5\7X\n\7\3\7\3\7\6\7\\\n\7\r\7\16\7]\3\b\3\b\3\b\3\b\3\b\5\be"+
		"\n\b\3\b\5\bh\n\b\3\t\3\t\3\n\3\n\3\13\3\13\6\13p\n\13\r\13\16\13q\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\5\fz\n\f\3\f\5\f}\n\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\2\2\21\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36\2\b\3\2\7\r\3\2\20\21\3\2/\60\3\2\27\31"+
		"\3\2\36#\3\2%,\2\u0091\2!\3\2\2\2\4\'\3\2\2\2\6\65\3\2\2\2\b9\3\2\2\2"+
		"\n=\3\2\2\2\f[\3\2\2\2\16_\3\2\2\2\20i\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2"+
		"\26y\3\2\2\2\30~\3\2\2\2\32\u0082\3\2\2\2\34\u0086\3\2\2\2\36\u008a\3"+
		"\2\2\2 \"\5\4\3\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%"+
		"&\7\2\2\3&\3\3\2\2\2\'(\7\3\2\2(*\7\4\2\2)+\5\n\6\2*)\3\2\2\2*+\3\2\2"+
		"\2+-\3\2\2\2,.\5\6\4\2-,\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/\61\5\b\5\2\60"+
		"/\3\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\5\f\7\2\63\64\7\5\2\2\64\5"+
		"\3\2\2\2\65\66\7\6\2\2\66\67\t\2\2\2\678\7\16\2\28\7\3\2\2\29:\7\17\2"+
		"\2:;\t\3\2\2;<\7\16\2\2<\t\3\2\2\2=>\7\22\2\2>?\7\60\2\2?@\7\16\2\2@\13"+
		"\3\2\2\2AX\5\16\b\2BC\5\16\b\2CD\5\22\n\2DU\5\16\b\2EF\7\23\2\2FH\5\24"+
		"\13\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IJ\7\24\2\2JL\5\20\t\2KI\3\2\2\2KL"+
		"\3\2\2\2LV\3\2\2\2MN\7\24\2\2NP\5\20\t\2OM\3\2\2\2OP\3\2\2\2PS\3\2\2\2"+
		"QR\7\23\2\2RT\5\24\13\2SQ\3\2\2\2ST\3\2\2\2TV\3\2\2\2UG\3\2\2\2UO\3\2"+
		"\2\2VX\3\2\2\2WA\3\2\2\2WB\3\2\2\2XY\3\2\2\2YZ\7\16\2\2Z\\\3\2\2\2[W\3"+
		"\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\r\3\2\2\2_d\7\60\2\2`a\7\25\2\2"+
		"ab\5\20\t\2bc\7\26\2\2ce\3\2\2\2d`\3\2\2\2de\3\2\2\2eg\3\2\2\2fh\5\24"+
		"\13\2gf\3\2\2\2gh\3\2\2\2h\17\3\2\2\2ij\t\4\2\2j\21\3\2\2\2kl\t\5\2\2"+
		"l\23\3\2\2\2mo\7\32\2\2np\5\26\f\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2rs\3\2\2\2st\7\33\2\2t\25\3\2\2\2uz\5\30\r\2vz\5\32\16\2wz\5\34\17"+
		"\2xz\5\36\20\2yu\3\2\2\2yv\3\2\2\2yw\3\2\2\2yx\3\2\2\2z|\3\2\2\2{}\7\34"+
		"\2\2|{\3\2\2\2|}\3\2\2\2}\27\3\2\2\2~\177\7\35\2\2\177\u0080\7\24\2\2"+
		"\u0080\u0081\t\6\2\2\u0081\31\3\2\2\2\u0082\u0083\7$\2\2\u0083\u0084\7"+
		"\24\2\2\u0084\u0085\t\7\2\2\u0085\33\3\2\2\2\u0086\u0087\7-\2\2\u0087"+
		"\u0088\7\24\2\2\u0088\u0089\7/\2\2\u0089\35\3\2\2\2\u008a\u008b\7.\2\2"+
		"\u008b\u008c\7\24\2\2\u008c\u008d\7\60\2\2\u008d\37\3\2\2\2\22#*-\60G"+
		"KOSUW]dgqy|";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}