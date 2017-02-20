// Generated from CMM.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CMMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NOTE1=27, NOTE2=28, DIV=29, ADD=30, SUB=31, MUL=32, 
		MOD=33, INTCONSTANT=34, DOUBLECONSTANT=35, ID=36, WS=37, NEWLINE=38, TAB=39;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_stmtblock = 2, RULE_note = 3, RULE_vardecl = 4, 
		RULE_type = 5, RULE_constant = 6, RULE_varlist = 7, RULE_ifstmt = 8, RULE_whilestmt = 9, 
		RULE_breakstmt = 10, RULE_readstmt = 11, RULE_writestmt = 12, RULE_assignstmt = 13, 
		RULE_var = 14, RULE_expr = 15;
	public static final String[] ruleNames = {
		"prog", "stmt", "stmtblock", "note", "vardecl", "type", "constant", "varlist", 
		"ifstmt", "whilestmt", "breakstmt", "readstmt", "writestmt", "assignstmt", 
		"var", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'int'", "'real'", "'['", "']'", "'true'", 
		"'false'", "','", "'if'", "'('", "')'", "'else'", "'while'", "'break'", 
		"'read'", "'write'", "'='", "'<>'", "'<='", "'<'", "'>'", "'>='", "'!='", 
		"'=='", null, null, "'/'", "'+'", "'-'", "'*'", "'%'", null, null, null, 
		"' '"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NOTE1", "NOTE2", "DIV", "ADD", "SUB", "MUL", "MOD", 
		"INTCONSTANT", "DOUBLECONSTANT", "ID", "WS", "NEWLINE", "TAB"
	};
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
	public String getGrammarFileName() { return "CMM.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CMMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<NoteContext> note() {
			return getRuleContexts(NoteContext.class);
		}
		public NoteContext note(int i) {
			return getRuleContext(NoteContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				switch (_input.LA(1)) {
				case T__0:
				case T__3:
				case T__4:
				case T__10:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case ID:
					{
					setState(32);
					stmt();
					}
					break;
				case NOTE1:
				case NOTE2:
					{
					setState(33);
					note();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << NOTE1) | (1L << NOTE2) | (1L << ID))) != 0) );
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

	public static class StmtContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public IfstmtContext ifstmt() {
			return getRuleContext(IfstmtContext.class,0);
		}
		public BreakstmtContext breakstmt() {
			return getRuleContext(BreakstmtContext.class,0);
		}
		public AssignstmtContext assignstmt() {
			return getRuleContext(AssignstmtContext.class,0);
		}
		public WhilestmtContext whilestmt() {
			return getRuleContext(WhilestmtContext.class,0);
		}
		public ReadstmtContext readstmt() {
			return getRuleContext(ReadstmtContext.class,0);
		}
		public WritestmtContext writestmt() {
			return getRuleContext(WritestmtContext.class,0);
		}
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(46);
			switch (_input.LA(1)) {
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				vardecl();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				ifstmt();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				breakstmt();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				assignstmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				whilestmt();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				readstmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 7);
				{
				setState(44);
				writestmt();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 8);
				{
				setState(45);
				stmtblock();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StmtblockContext extends ParserRuleContext {
		public StmtblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtblock; }
	 
		public StmtblockContext() { }
		public void copyFrom(StmtblockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Stmt_blockContext extends StmtblockContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(StmtblockContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtblockContext stmtblock() throws RecognitionException {
		StmtblockContext _localctx = new StmtblockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmtblock);
		int _la;
		try {
			_localctx = new Stmt_blockContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				stmt();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << ID))) != 0) );
			setState(54);
			match(T__1);
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

	public static class NoteContext extends ParserRuleContext {
		public TerminalNode NOTE1() { return getToken(CMMParser.NOTE1, 0); }
		public TerminalNode NOTE2() { return getToken(CMMParser.NOTE2, 0); }
		public NoteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNote(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoteContext note() throws RecognitionException {
		NoteContext _localctx = new NoteContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_note);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_la = _input.LA(1);
			if ( !(_la==NOTE1 || _la==NOTE2) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class VardeclContext extends ParserRuleContext {
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	 
		public VardeclContext() { }
		public void copyFrom(VardeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Var_declContext extends VardeclContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Var_declContext(VardeclContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_vardecl);
		try {
			_localctx = new Var_declContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			type(0);
			setState(59);
			varlist();
			setState(60);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode INTCONSTANT() { return getToken(CMMParser.INTCONSTANT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			switch (_input.LA(1)) {
			case T__3:
				{
				setState(63);
				match(T__3);
				}
				break;
			case T__4:
				{
				setState(64);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(67);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(68);
					match(T__5);
					setState(69);
					match(INTCONSTANT);
					setState(70);
					match(T__6);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INTCONSTANT() { return getToken(CMMParser.INTCONSTANT, 0); }
		public TerminalNode DOUBLECONSTANT() { return getToken(CMMParser.DOUBLECONSTANT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << INTCONSTANT) | (1L << DOUBLECONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CMMParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CMMParser.ID, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(ID);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(79);
				match(T__9);
				setState(80);
				match(ID);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class IfstmtContext extends ParserRuleContext {
		public IfstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstmt; }
	 
		public IfstmtContext() { }
		public void copyFrom(IfstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class If_stmtContext extends IfstmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtblockContext> stmtblock() {
			return getRuleContexts(StmtblockContext.class);
		}
		public StmtblockContext stmtblock(int i) {
			return getRuleContext(StmtblockContext.class,i);
		}
		public If_stmtContext(IfstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitIf_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfstmtContext ifstmt() throws RecognitionException {
		IfstmtContext _localctx = new IfstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifstmt);
		int _la;
		try {
			_localctx = new If_stmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__10);
			setState(87);
			match(T__11);
			setState(88);
			expr(0);
			setState(89);
			match(T__12);
			setState(90);
			stmtblock();
			setState(93);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(91);
				match(T__13);
				setState(92);
				stmtblock();
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

	public static class WhilestmtContext extends ParserRuleContext {
		public WhilestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilestmt; }
	 
		public WhilestmtContext() { }
		public void copyFrom(WhilestmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class While_stmtContext extends WhilestmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtblockContext stmtblock() {
			return getRuleContext(StmtblockContext.class,0);
		}
		public While_stmtContext(WhilestmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWhile_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhilestmtContext whilestmt() throws RecognitionException {
		WhilestmtContext _localctx = new WhilestmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilestmt);
		try {
			_localctx = new While_stmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__14);
			setState(96);
			match(T__11);
			setState(97);
			expr(0);
			setState(98);
			match(T__12);
			setState(99);
			stmtblock();
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

	public static class BreakstmtContext extends ParserRuleContext {
		public BreakstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakstmt; }
	 
		public BreakstmtContext() { }
		public void copyFrom(BreakstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Break_stmtContext extends BreakstmtContext {
		public Break_stmtContext(BreakstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBreak_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakstmtContext breakstmt() throws RecognitionException {
		BreakstmtContext _localctx = new BreakstmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_breakstmt);
		try {
			_localctx = new Break_stmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__15);
			setState(102);
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

	public static class ReadstmtContext extends ParserRuleContext {
		public ReadstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstmt; }
	 
		public ReadstmtContext() { }
		public void copyFrom(ReadstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Read_stmtContext extends ReadstmtContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public Read_stmtContext(ReadstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitRead_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadstmtContext readstmt() throws RecognitionException {
		ReadstmtContext _localctx = new ReadstmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_readstmt);
		try {
			_localctx = new Read_stmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__16);
			setState(105);
			match(T__11);
			setState(106);
			var();
			setState(107);
			match(T__12);
			setState(108);
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

	public static class WritestmtContext extends ParserRuleContext {
		public WritestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writestmt; }
	 
		public WritestmtContext() { }
		public void copyFrom(WritestmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Write_stmtContext extends WritestmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Write_stmtContext(WritestmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitWrite_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WritestmtContext writestmt() throws RecognitionException {
		WritestmtContext _localctx = new WritestmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_writestmt);
		try {
			_localctx = new Write_stmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__17);
			setState(111);
			match(T__11);
			setState(112);
			expr(0);
			setState(113);
			match(T__12);
			setState(114);
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

	public static class AssignstmtContext extends ParserRuleContext {
		public AssignstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignstmt; }
	 
		public AssignstmtContext() { }
		public void copyFrom(AssignstmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Assign_stmtContext extends AssignstmtContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(AssignstmtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignstmtContext assignstmt() throws RecognitionException {
		AssignstmtContext _localctx = new AssignstmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignstmt);
		try {
			_localctx = new Assign_stmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			var();
			setState(117);
			match(T__18);
			setState(118);
			expr(0);
			setState(119);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CMMParser.ID, 0); }
		public TerminalNode INTCONSTANT() { return getToken(CMMParser.INTCONSTANT, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(ID);
				setState(123);
				match(T__5);
				setState(124);
				match(INTCONSTANT);
				setState(125);
				match(T__6);
				}
				break;
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConstContext extends ExprContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Less_or_greaterContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Less_or_greaterContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLess_or_greater(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddsubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD() { return getToken(CMMParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CMMParser.SUB, 0); }
		public AddsubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitAddsub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLess(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BracketsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitBrackets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Greater_or_equalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Greater_or_equalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitGreater_or_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_equalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Not_equalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitNot_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivmulmodContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIV() { return getToken(CMMParser.DIV, 0); }
		public TerminalNode MUL() { return getToken(CMMParser.MUL, 0); }
		public TerminalNode MOD() { return getToken(CMMParser.MOD, 0); }
		public DivmulmodContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitDivmulmod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Less_or_equalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Less_or_equalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitLess_or_equal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FlipContext extends ExprContext {
		public TerminalNode SUB() { return getToken(CMMParser.SUB, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FlipContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitFlip(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CMMVisitor ) return ((CMMVisitor<? extends T>)visitor).visitGreater(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch (_input.LA(1)) {
			case T__11:
				{
				_localctx = new BracketsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				match(T__11);
				setState(130);
				expr(0);
				setState(131);
				match(T__12);
				}
				break;
			case SUB:
				{
				_localctx = new FlipContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(SUB);
				setState(134);
				expr(12);
				}
				break;
			case ID:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				var();
				}
				break;
			case T__7:
			case T__8:
			case INTCONSTANT:
			case DOUBLECONSTANT:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				constant();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(166);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new DivmulmodContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(139);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(140);
						((DivmulmodContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIV) | (1L << MUL) | (1L << MOD))) != 0)) ) {
							((DivmulmodContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(141);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new AddsubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(142);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(143);
						((AddsubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddsubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(144);
						expr(11);
						}
						break;
					case 3:
						{
						_localctx = new Less_or_greaterContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						match(T__19);
						setState(147);
						expr(10);
						}
						break;
					case 4:
						{
						_localctx = new Less_or_equalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						match(T__20);
						setState(150);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new LessContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(151);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(152);
						match(T__21);
						setState(153);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new GreaterContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						match(T__22);
						setState(156);
						expr(7);
						}
						break;
					case 7:
						{
						_localctx = new Greater_or_equalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(T__23);
						setState(159);
						expr(6);
						}
						break;
					case 8:
						{
						_localctx = new Not_equalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(T__24);
						setState(162);
						expr(5);
						}
						break;
					case 9:
						{
						_localctx = new EqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(T__25);
						setState(165);
						expr(4);
						}
						break;
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 15:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 7);
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 5);
		case 8:
			return precpred(_ctx, 4);
		case 9:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00ae\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\6"+
		"\2%\n\2\r\2\16\2&\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3\4\6"+
		"\4\65\n\4\r\4\16\4\66\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\5\7"+
		"D\n\7\3\7\3\7\3\7\3\7\7\7J\n\7\f\7\16\7M\13\7\3\b\3\b\3\t\3\t\3\t\7\t"+
		"T\n\t\f\t\16\tW\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n`\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u0081\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u008c\n"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7"+
		"\21\u00a9\n\21\f\21\16\21\u00ac\13\21\3\21\2\4\f \22\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \2\6\3\2\35\36\4\2\n\13$%\4\2\37\37\"#\3\2 !\u00b8"+
		"\2$\3\2\2\2\4\60\3\2\2\2\6\62\3\2\2\2\b:\3\2\2\2\n<\3\2\2\2\fC\3\2\2\2"+
		"\16N\3\2\2\2\20P\3\2\2\2\22X\3\2\2\2\24a\3\2\2\2\26g\3\2\2\2\30j\3\2\2"+
		"\2\32p\3\2\2\2\34v\3\2\2\2\36\u0080\3\2\2\2 \u008b\3\2\2\2\"%\5\4\3\2"+
		"#%\5\b\5\2$\"\3\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\3\3\2"+
		"\2\2(\61\5\n\6\2)\61\5\22\n\2*\61\5\26\f\2+\61\5\34\17\2,\61\5\24\13\2"+
		"-\61\5\30\r\2.\61\5\32\16\2/\61\5\6\4\2\60(\3\2\2\2\60)\3\2\2\2\60*\3"+
		"\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2\2\2\61"+
		"\5\3\2\2\2\62\64\7\3\2\2\63\65\5\4\3\2\64\63\3\2\2\2\65\66\3\2\2\2\66"+
		"\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7\4\2\29\7\3\2\2\2:;\t\2\2\2;"+
		"\t\3\2\2\2<=\5\f\7\2=>\5\20\t\2>?\7\5\2\2?\13\3\2\2\2@A\b\7\1\2AD\7\6"+
		"\2\2BD\7\7\2\2C@\3\2\2\2CB\3\2\2\2DK\3\2\2\2EF\f\3\2\2FG\7\b\2\2GH\7$"+
		"\2\2HJ\7\t\2\2IE\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\r\3\2\2\2MK\3"+
		"\2\2\2NO\t\3\2\2O\17\3\2\2\2PU\7&\2\2QR\7\f\2\2RT\7&\2\2SQ\3\2\2\2TW\3"+
		"\2\2\2US\3\2\2\2UV\3\2\2\2V\21\3\2\2\2WU\3\2\2\2XY\7\r\2\2YZ\7\16\2\2"+
		"Z[\5 \21\2[\\\7\17\2\2\\_\5\6\4\2]^\7\20\2\2^`\5\6\4\2_]\3\2\2\2_`\3\2"+
		"\2\2`\23\3\2\2\2ab\7\21\2\2bc\7\16\2\2cd\5 \21\2de\7\17\2\2ef\5\6\4\2"+
		"f\25\3\2\2\2gh\7\22\2\2hi\7\5\2\2i\27\3\2\2\2jk\7\23\2\2kl\7\16\2\2lm"+
		"\5\36\20\2mn\7\17\2\2no\7\5\2\2o\31\3\2\2\2pq\7\24\2\2qr\7\16\2\2rs\5"+
		" \21\2st\7\17\2\2tu\7\5\2\2u\33\3\2\2\2vw\5\36\20\2wx\7\25\2\2xy\5 \21"+
		"\2yz\7\5\2\2z\35\3\2\2\2{\u0081\7&\2\2|}\7&\2\2}~\7\b\2\2~\177\7$\2\2"+
		"\177\u0081\7\t\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0081\37\3\2\2\2\u0082"+
		"\u0083\b\21\1\2\u0083\u0084\7\16\2\2\u0084\u0085\5 \21\2\u0085\u0086\7"+
		"\17\2\2\u0086\u008c\3\2\2\2\u0087\u0088\7!\2\2\u0088\u008c\5 \21\16\u0089"+
		"\u008c\5\36\20\2\u008a\u008c\5\16\b\2\u008b\u0082\3\2\2\2\u008b\u0087"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u00aa\3\2\2\2\u008d"+
		"\u008e\f\r\2\2\u008e\u008f\t\4\2\2\u008f\u00a9\5 \21\16\u0090\u0091\f"+
		"\f\2\2\u0091\u0092\t\5\2\2\u0092\u00a9\5 \21\r\u0093\u0094\f\13\2\2\u0094"+
		"\u0095\7\26\2\2\u0095\u00a9\5 \21\f\u0096\u0097\f\n\2\2\u0097\u0098\7"+
		"\27\2\2\u0098\u00a9\5 \21\13\u0099\u009a\f\t\2\2\u009a\u009b\7\30\2\2"+
		"\u009b\u00a9\5 \21\n\u009c\u009d\f\b\2\2\u009d\u009e\7\31\2\2\u009e\u00a9"+
		"\5 \21\t\u009f\u00a0\f\7\2\2\u00a0\u00a1\7\32\2\2\u00a1\u00a9\5 \21\b"+
		"\u00a2\u00a3\f\6\2\2\u00a3\u00a4\7\33\2\2\u00a4\u00a9\5 \21\7\u00a5\u00a6"+
		"\f\5\2\2\u00a6\u00a7\7\34\2\2\u00a7\u00a9\5 \21\6\u00a8\u008d\3\2\2\2"+
		"\u00a8\u0090\3\2\2\2\u00a8\u0093\3\2\2\2\u00a8\u0096\3\2\2\2\u00a8\u0099"+
		"\3\2\2\2\u00a8\u009c\3\2\2\2\u00a8\u009f\3\2\2\2\u00a8\u00a2\3\2\2\2\u00a8"+
		"\u00a5\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab!\3\2\2\2\u00ac\u00aa\3\2\2\2\16$&\60\66CKU_\u0080\u008b\u00a8"+
		"\u00aa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}