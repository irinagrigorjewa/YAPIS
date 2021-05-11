// Generated from /home/irina/BSUIR/IdeaProjects/compiler/grammar/Grammar.g4 by ANTLR 4.9.1
package com.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, IF=6, PRINT=7, FOR=8, ELSE=9, 
		END=10, CONST=11, WHILE=12, INT=13, CHAR=14, ADD=15, REMOVE=16, STRING=17, 
		STRING_ARRAY=18, RETURN=19, CALL=20, GLOBAL=21, VOID=22, DOT=23, DOT_COMMA=24, 
		COLON=25, PLUS=26, MINUS=27, MULTIPLY=28, AND=29, NEGATION=30, EQUAL=31, 
		NON_EQUAL=32, LESS=33, LESS_OR_EQUALS=34, GREATER=35, GREATER_OR_EQUALS=36, 
		O_BRACKET=37, C_BRACKET=38, K_O_BRACKET=39, K_C_BRACKET=40, SQ_O_BRACKET=41, 
		SQ_C_BRACKET=42, LINE=43, NUMBER=44, SYMBOL=45, ID=46, WS=47;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_expression = 3, 
		RULE_intialize_char = 4, RULE_initialize_string = 5, RULE_initialize_string_array = 6, 
		RULE_global_assign_var = 7, RULE_global_assign_string = 8, RULE_global_assign_string_array = 9, 
		RULE_print = 10, RULE_assign_var_method_invocation = 11, RULE_assign_string = 12, 
		RULE_assign_string_array = 13, RULE_assign_var = 14, RULE_operarions_with_string_array = 15, 
		RULE_operations = 16, RULE_simple_compare = 17, RULE_multi_compare = 18, 
		RULE_while_cycle = 19, RULE_if_else = 20, RULE_for_each = 21, RULE_type = 22, 
		RULE_simple_type = 23, RULE_signature = 24, RULE_subprogram_return = 25, 
		RULE_subprogram_non_return = 26, RULE_block_return = 27, RULE_block_non_return = 28, 
		RULE_signature_method_invocation = 29, RULE_method_invocation = 30, RULE_global_program = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "block", "statement", "expression", "intialize_char", "initialize_string", 
			"initialize_string_array", "global_assign_var", "global_assign_string", 
			"global_assign_string_array", "print", "assign_var_method_invocation", 
			"assign_string", "assign_string_array", "assign_var", "operarions_with_string_array", 
			"operations", "simple_compare", "multi_compare", "while_cycle", "if_else", 
			"for_each", "type", "simple_type", "signature", "subprogram_return", 
			"subprogram_non_return", "block_return", "block_non_return", "signature_method_invocation", 
			"method_invocation", "global_program"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "','", "'='", "'func'", "'begin'", "'if'", "'print'", 
			"'for'", "'else'", "'end'", "'const'", "'while'", "'int'", "'char'", 
			"'add'", "'remove'", "'string'", "'stringArray'", "'return'", "'call'", 
			"'global'", "'void'", "'.'", "';'", "':'", "'+'", "'-'", "'*'", "'&'", 
			"'!'", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'('", "')'", "'{'", 
			"'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "BEGIN", "IF", "PRINT", "FOR", "ELSE", 
			"END", "CONST", "WHILE", "INT", "CHAR", "ADD", "REMOVE", "STRING", "STRING_ARRAY", 
			"RETURN", "CALL", "GLOBAL", "VOID", "DOT", "DOT_COMMA", "COLON", "PLUS", 
			"MINUS", "MULTIPLY", "AND", "NEGATION", "EQUAL", "NON_EQUAL", "LESS", 
			"LESS_OR_EQUALS", "GREATER", "GREATER_OR_EQUALS", "O_BRACKET", "C_BRACKET", 
			"K_O_BRACKET", "K_C_BRACKET", "SQ_O_BRACKET", "SQ_C_BRACKET", "LINE", 
			"NUMBER", "SYMBOL", "ID", "WS"
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
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__0);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(65);
					subprogram_non_return();
					}
					break;
				case 2:
					{
					setState(66);
					subprogram_return();
					}
					break;
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(BEGIN);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << ID))) != 0)) {
				{
				{
				setState(75);
				statement();
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Assign_stringContext assign_string() {
			return getRuleContext(Assign_stringContext.class,0);
		}
		public Assign_string_arrayContext assign_string_array() {
			return getRuleContext(Assign_string_arrayContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Operarions_with_string_arrayContext operarions_with_string_array() {
			return getRuleContext(Operarions_with_string_arrayContext.class,0);
		}
		public Assign_var_method_invocationContext assign_var_method_invocation() {
			return getRuleContext(Assign_var_method_invocationContext.class,0);
		}
		public While_cycleContext while_cycle() {
			return getRuleContext(While_cycleContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public Method_invocationContext method_invocation() {
			return getRuleContext(Method_invocationContext.class,0);
		}
		public For_eachContext for_each() {
			return getRuleContext(For_eachContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				assign_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				assign_string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				assign_string_array();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				operations();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				operarions_with_string_array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				assign_var_method_invocation();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				while_cycle();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				if_else();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				method_invocation();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
				for_each();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(97);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(98);
				match(O_BRACKET);
				setState(99);
				expression(0);
				setState(100);
				match(C_BRACKET);
				}
				break;
			case NUMBER:
				{
				setState(102);
				match(NUMBER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(105);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(106);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==AND) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(108);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(109);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expression(5);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class Intialize_charContext extends ParserRuleContext {
		public TerminalNode SYMBOL() { return getToken(GrammarParser.SYMBOL, 0); }
		public Intialize_charContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialize_char; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIntialize_char(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIntialize_char(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIntialize_char(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intialize_charContext intialize_char() throws RecognitionException {
		Intialize_charContext _localctx = new Intialize_charContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intialize_char);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(SYMBOL);
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

	public static class Initialize_stringContext extends ParserRuleContext {
		public TerminalNode LINE() { return getToken(GrammarParser.LINE, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode MULTIPLY() { return getToken(GrammarParser.MULTIPLY, 0); }
		public TerminalNode AND() { return getToken(GrammarParser.AND, 0); }
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(GrammarParser.MINUS, 0); }
		public Initialize_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitialize_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitialize_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInitialize_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialize_stringContext initialize_string() throws RecognitionException {
		Initialize_stringContext _localctx = new Initialize_stringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_initialize_string);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(LINE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(119);
				match(ID);
				setState(120);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << MULTIPLY) | (1L << AND))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(121);
				match(ID);
				}
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

	public static class Initialize_string_arrayContext extends ParserRuleContext {
		public TerminalNode SQ_O_BRACKET() { return getToken(GrammarParser.SQ_O_BRACKET, 0); }
		public TerminalNode SQ_C_BRACKET() { return getToken(GrammarParser.SQ_C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public Initialize_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initialize_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterInitialize_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitInitialize_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitInitialize_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initialize_string_arrayContext initialize_string_array() throws RecognitionException {
		Initialize_string_arrayContext _localctx = new Initialize_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_initialize_string_array);
		try {
			int _alt;
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(124);
				match(SQ_O_BRACKET);
				setState(125);
				match(SQ_C_BRACKET);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(126);
				match(SQ_O_BRACKET);
				setState(131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(127);
						match(ID);
						setState(128);
						match(T__1);
						}
						} 
					}
					setState(133);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(134);
				match(ID);
				setState(135);
				match(SQ_C_BRACKET);
				}
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

	public static class Global_assign_varContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(GrammarParser.GLOBAL, 0); }
		public Assign_varContext assign_var() {
			return getRuleContext(Assign_varContext.class,0);
		}
		public Global_assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGlobal_assign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGlobal_assign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGlobal_assign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_varContext global_assign_var() throws RecognitionException {
		Global_assign_varContext _localctx = new Global_assign_varContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_global_assign_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(GLOBAL);
			setState(139);
			assign_var();
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

	public static class Global_assign_stringContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(GrammarParser.GLOBAL, 0); }
		public Assign_stringContext assign_string() {
			return getRuleContext(Assign_stringContext.class,0);
		}
		public Global_assign_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGlobal_assign_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGlobal_assign_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGlobal_assign_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_stringContext global_assign_string() throws RecognitionException {
		Global_assign_stringContext _localctx = new Global_assign_stringContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_global_assign_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(GLOBAL);
			setState(142);
			assign_string();
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

	public static class Global_assign_string_arrayContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(GrammarParser.GLOBAL, 0); }
		public Assign_string_arrayContext assign_string_array() {
			return getRuleContext(Assign_string_arrayContext.class,0);
		}
		public Global_assign_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_assign_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGlobal_assign_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGlobal_assign_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGlobal_assign_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_assign_string_arrayContext global_assign_string_array() throws RecognitionException {
		Global_assign_string_arrayContext _localctx = new Global_assign_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_global_assign_string_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(GLOBAL);
			setState(145);
			assign_string_array();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode LINE() { return getToken(GrammarParser.LINE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(PRINT);
			setState(148);
			match(O_BRACKET);
			setState(149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LINE) | (1L << NUMBER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(C_BRACKET);
			setState(151);
			match(DOT_COMMA);
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

	public static class Assign_var_method_invocationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Method_invocationContext method_invocation() {
			return getRuleContext(Method_invocationContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public Assign_var_method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_var_method_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_var_method_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_var_method_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_var_method_invocationContext assign_var_method_invocation() throws RecognitionException {
		Assign_var_method_invocationContext _localctx = new Assign_var_method_invocationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign_var_method_invocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			type();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(154);
				match(CONST);
				}
			}

			setState(157);
			match(ID);
			setState(158);
			match(T__2);
			setState(159);
			method_invocation();
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

	public static class Assign_stringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public Initialize_stringContext initialize_string() {
			return getRuleContext(Initialize_stringContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public Assign_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stringContext assign_string() throws RecognitionException {
		Assign_stringContext _localctx = new Assign_stringContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(STRING);
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(162);
				match(CONST);
				}
			}

			setState(165);
			match(ID);
			setState(166);
			match(T__2);
			{
			setState(167);
			initialize_string();
			}
			setState(168);
			match(DOT_COMMA);
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

	public static class Assign_string_arrayContext extends ParserRuleContext {
		public TerminalNode STRING_ARRAY() { return getToken(GrammarParser.STRING_ARRAY, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public Initialize_string_arrayContext initialize_string_array() {
			return getRuleContext(Initialize_string_arrayContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public Assign_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_string_arrayContext assign_string_array() throws RecognitionException {
		Assign_string_arrayContext _localctx = new Assign_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_string_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(STRING_ARRAY);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(171);
				match(CONST);
				}
			}

			setState(174);
			match(ID);
			setState(175);
			match(T__2);
			{
			setState(176);
			initialize_string_array();
			}
			setState(177);
			match(DOT_COMMA);
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

	public static class Assign_varContext extends ParserRuleContext {
		public Simple_typeContext simple_type() {
			return getRuleContext(Simple_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Intialize_charContext intialize_char() {
			return getRuleContext(Intialize_charContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GrammarParser.CONST, 0); }
		public Assign_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAssign_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAssign_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAssign_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_varContext assign_var() throws RecognitionException {
		Assign_varContext _localctx = new Assign_varContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assign_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			simple_type();
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONST) {
				{
				setState(180);
				match(CONST);
				}
			}

			setState(183);
			match(ID);
			setState(184);
			match(T__2);
			setState(187);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case O_BRACKET:
			case NUMBER:
			case ID:
				{
				setState(185);
				expression(0);
				}
				break;
			case SYMBOL:
				{
				setState(186);
				intialize_char();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(189);
			match(DOT_COMMA);
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

	public static class Operarions_with_string_arrayContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(GrammarParser.DOT, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode REMOVE() { return getToken(GrammarParser.REMOVE, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public Operarions_with_string_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operarions_with_string_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOperarions_with_string_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOperarions_with_string_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperarions_with_string_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operarions_with_string_arrayContext operarions_with_string_array() throws RecognitionException {
		Operarions_with_string_arrayContext _localctx = new Operarions_with_string_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_operarions_with_string_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ID);
			setState(192);
			match(DOT);
			setState(193);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==REMOVE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(194);
			match(O_BRACKET);
			setState(195);
			match(ID);
			setState(196);
			match(C_BRACKET);
			}
			setState(198);
			match(DOT_COMMA);
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

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_operations);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(ID);
			setState(201);
			match(T__2);
			setState(202);
			expression(0);
			setState(203);
			match(DOT_COMMA);
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

	public static class Simple_compareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(GrammarParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(GrammarParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(GrammarParser.GREATER, 0); }
		public TerminalNode LESS_OR_EQUALS() { return getToken(GrammarParser.LESS_OR_EQUALS, 0); }
		public TerminalNode GREATER_OR_EQUALS() { return getToken(GrammarParser.GREATER_OR_EQUALS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimple_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimple_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(205);
			expression(0);
			}
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << LESS_OR_EQUALS) | (1L << GREATER) | (1L << GREATER_OR_EQUALS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			{
			setState(207);
			expression(0);
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

	public static class Multi_compareContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(GrammarParser.NEGATION, 0); }
		public Multi_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multi_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMulti_compare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMulti_compare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMulti_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multi_compareContext multi_compare() throws RecognitionException {
		Multi_compareContext _localctx = new Multi_compareContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_multi_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(209);
				match(NEGATION);
				}
			}

			setState(212);
			match(O_BRACKET);
			setState(213);
			simple_compare();
			setState(214);
			match(C_BRACKET);
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

	public static class While_cycleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GrammarParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Multi_compareContext multi_compare() {
			return getRuleContext(Multi_compareContext.class,0);
		}
		public While_cycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterWhile_cycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitWhile_cycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitWhile_cycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cycleContext while_cycle() throws RecognitionException {
		While_cycleContext _localctx = new While_cycleContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_cycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(WHILE);
			setState(217);
			match(O_BRACKET);
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(218);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(219);
				multi_compare();
				}
				break;
			}
			setState(222);
			match(C_BRACKET);
			setState(223);
			block();
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

	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Multi_compareContext multi_compare() {
			return getRuleContext(Multi_compareContext.class,0);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(IF);
			setState(226);
			match(O_BRACKET);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(227);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(228);
				multi_compare();
				}
				break;
			}
			setState(231);
			match(C_BRACKET);
			setState(232);
			block();
			setState(233);
			match(ELSE);
			setState(234);
			block();
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

	public static class For_eachContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(GrammarParser.COLON, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public For_eachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_each; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFor_each(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFor_each(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFor_each(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_eachContext for_each() throws RecognitionException {
		For_eachContext _localctx = new For_eachContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_for_each);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(FOR);
			setState(237);
			match(O_BRACKET);
			setState(238);
			match(ID);
			setState(239);
			match(COLON);
			setState(240);
			match(ID);
			setState(241);
			match(C_BRACKET);
			setState(242);
			block();
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
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode STRING_ARRAY() { return getToken(GrammarParser.STRING_ARRAY, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY))) != 0)) ) {
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

	public static class Simple_typeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(GrammarParser.INT, 0); }
		public TerminalNode CHAR() { return getToken(GrammarParser.CHAR, 0); }
		public Simple_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSimple_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSimple_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSimple_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_typeContext simple_type() throws RecognitionException {
		Simple_typeContext _localctx = new Simple_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_simple_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==CHAR) ) {
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(248);
			match(O_BRACKET);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(249);
					type();
					setState(250);
					match(ID);
					setState(251);
					match(T__1);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			{
			setState(258);
			type();
			setState(259);
			match(ID);
			}
			setState(261);
			match(C_BRACKET);
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSubprogram_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSubprogram_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__3);
			setState(264);
			type();
			setState(265);
			match(ID);
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(266);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(267);
				match(O_BRACKET);
				setState(268);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(271);
			block_return();
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GrammarParser.VOID, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSubprogram_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSubprogram_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__3);
			setState(274);
			match(VOID);
			setState(275);
			match(ID);
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(276);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(277);
				match(O_BRACKET);
				setState(278);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(281);
				block_non_return();
				}
				break;
			case 2:
				{
				setState(282);
				block();
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(BEGIN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << ID))) != 0)) {
				{
				{
				setState(286);
				statement();
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			match(RETURN);
			setState(293);
			match(ID);
			setState(294);
			match(DOT_COMMA);
			setState(295);
			match(END);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(GrammarParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(GrammarParser.RETURN, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public TerminalNode END() { return getToken(GrammarParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock_non_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock_non_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(BEGIN);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINT) | (1L << FOR) | (1L << WHILE) | (1L << INT) | (1L << CHAR) | (1L << STRING) | (1L << STRING_ARRAY) | (1L << ID))) != 0)) {
				{
				{
				setState(298);
				statement();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(RETURN);
			setState(305);
			match(DOT_COMMA);
			setState(306);
			match(END);
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

	public static class Signature_method_invocationContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GrammarParser.ID, i);
		}
		public Signature_method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSignature_method_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSignature_method_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSignature_method_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signature_method_invocationContext signature_method_invocation() throws RecognitionException {
		Signature_method_invocationContext _localctx = new Signature_method_invocationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_signature_method_invocation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(308);
			match(O_BRACKET);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(ID);
					setState(310);
					match(T__1);
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			{
			setState(316);
			match(ID);
			}
			setState(317);
			match(C_BRACKET);
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

	public static class Method_invocationContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GrammarParser.ID, 0); }
		public TerminalNode DOT_COMMA() { return getToken(GrammarParser.DOT_COMMA, 0); }
		public Signature_method_invocationContext signature_method_invocation() {
			return getRuleContext(Signature_method_invocationContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(GrammarParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(GrammarParser.C_BRACKET, 0); }
		public Method_invocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_invocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterMethod_invocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitMethod_invocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitMethod_invocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_invocationContext method_invocation() throws RecognitionException {
		Method_invocationContext _localctx = new Method_invocationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_method_invocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(ID);
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(320);
				signature_method_invocation();
				}
				break;
			case 2:
				{
				{
				setState(321);
				match(O_BRACKET);
				setState(322);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(325);
			match(DOT_COMMA);
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Global_assign_varContext> global_assign_var() {
			return getRuleContexts(Global_assign_varContext.class);
		}
		public Global_assign_varContext global_assign_var(int i) {
			return getRuleContext(Global_assign_varContext.class,i);
		}
		public List<Global_assign_stringContext> global_assign_string() {
			return getRuleContexts(Global_assign_stringContext.class);
		}
		public Global_assign_stringContext global_assign_string(int i) {
			return getRuleContext(Global_assign_stringContext.class,i);
		}
		public List<Global_assign_string_arrayContext> global_assign_string_array() {
			return getRuleContexts(Global_assign_string_arrayContext.class);
		}
		public Global_assign_string_arrayContext global_assign_string_array(int i) {
			return getRuleContext(Global_assign_string_arrayContext.class,i);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGlobal_program(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGlobal_program(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GLOBAL) {
				{
				setState(330);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(327);
					global_assign_var();
					}
					break;
				case 2:
					{
					setState(328);
					global_assign_string();
					}
					break;
				case 3:
					{
					setState(329);
					global_assign_string_array();
					}
					break;
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			program();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0154\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\7\3O\n\3\f\3\16"+
		"\3R\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5r\n\5"+
		"\f\5\16\5u\13\5\3\6\3\6\3\7\3\7\3\7\3\7\5\7}\n\7\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u0084\n\b\f\b\16\b\u0087\13\b\3\b\3\b\5\b\u008b\n\b\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u009e\n\r"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\5\16\u00a6\n\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\5\17\u00af\n\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\5\20\u00b8"+
		"\n\20\3\20\3\20\3\20\3\20\5\20\u00be\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\5\24\u00d5\n\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00df"+
		"\n\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00e8\n\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u0100\n\32\f\32\16\32\u0103\13\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0110\n\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u011a\n\34\3\34\3\34\5\34\u011e"+
		"\n\34\3\35\3\35\7\35\u0122\n\35\f\35\16\35\u0125\13\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\7\36\u012e\n\36\f\36\16\36\u0131\13\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\7\37\u013a\n\37\f\37\16\37\u013d\13\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \5 \u0146\n \3 \3 \3!\3!\3!\7!\u014d\n!\f!\16!\u0150"+
		"\13!\3!\3!\3!\2\3\b\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,."+
		"\60\62\64\668:<>@\2\n\3\2\36\37\3\2\34\35\3\2\34\37\4\2-.\60\60\3\2\21"+
		"\22\3\2!&\4\2\17\20\23\24\3\2\17\20\2\u015a\2B\3\2\2\2\4L\3\2\2\2\6`\3"+
		"\2\2\2\bi\3\2\2\2\nv\3\2\2\2\f|\3\2\2\2\16\u008a\3\2\2\2\20\u008c\3\2"+
		"\2\2\22\u008f\3\2\2\2\24\u0092\3\2\2\2\26\u0095\3\2\2\2\30\u009b\3\2\2"+
		"\2\32\u00a3\3\2\2\2\34\u00ac\3\2\2\2\36\u00b5\3\2\2\2 \u00c1\3\2\2\2\""+
		"\u00ca\3\2\2\2$\u00cf\3\2\2\2&\u00d4\3\2\2\2(\u00da\3\2\2\2*\u00e3\3\2"+
		"\2\2,\u00ee\3\2\2\2.\u00f6\3\2\2\2\60\u00f8\3\2\2\2\62\u00fa\3\2\2\2\64"+
		"\u0109\3\2\2\2\66\u0113\3\2\2\28\u011f\3\2\2\2:\u012b\3\2\2\2<\u0136\3"+
		"\2\2\2>\u0141\3\2\2\2@\u014e\3\2\2\2BG\7\3\2\2CF\5\66\34\2DF\5\64\33\2"+
		"EC\3\2\2\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2"+
		"JK\5\4\3\2K\3\3\2\2\2LP\7\7\2\2MO\5\6\4\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2"+
		"\2PQ\3\2\2\2QS\3\2\2\2RP\3\2\2\2ST\7\f\2\2T\5\3\2\2\2Ua\5\36\20\2Va\5"+
		"\32\16\2Wa\5\34\17\2Xa\5\26\f\2Ya\5\"\22\2Za\5 \21\2[a\5\30\r\2\\a\5("+
		"\25\2]a\5*\26\2^a\5> \2_a\5,\27\2`U\3\2\2\2`V\3\2\2\2`W\3\2\2\2`X\3\2"+
		"\2\2`Y\3\2\2\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3"+
		"\2\2\2a\7\3\2\2\2bc\b\5\1\2cj\7\60\2\2de\7\'\2\2ef\5\b\5\2fg\7(\2\2gj"+
		"\3\2\2\2hj\7.\2\2ib\3\2\2\2id\3\2\2\2ih\3\2\2\2js\3\2\2\2kl\f\7\2\2lm"+
		"\t\2\2\2mr\5\b\5\bno\f\6\2\2op\t\3\2\2pr\5\b\5\7qk\3\2\2\2qn\3\2\2\2r"+
		"u\3\2\2\2sq\3\2\2\2st\3\2\2\2t\t\3\2\2\2us\3\2\2\2vw\7/\2\2w\13\3\2\2"+
		"\2x}\7-\2\2yz\7\60\2\2z{\t\4\2\2{}\7\60\2\2|x\3\2\2\2|y\3\2\2\2}\r\3\2"+
		"\2\2~\177\7+\2\2\177\u008b\7,\2\2\u0080\u0085\7+\2\2\u0081\u0082\7\60"+
		"\2\2\u0082\u0084\7\4\2\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085"+
		"\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0088\u0089\7\60\2\2\u0089\u008b\7,\2\2\u008a~\3\2\2\2\u008a\u0080"+
		"\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d\7\27\2\2\u008d\u008e\5\36\20\2\u008e"+
		"\21\3\2\2\2\u008f\u0090\7\27\2\2\u0090\u0091\5\32\16\2\u0091\23\3\2\2"+
		"\2\u0092\u0093\7\27\2\2\u0093\u0094\5\34\17\2\u0094\25\3\2\2\2\u0095\u0096"+
		"\7\t\2\2\u0096\u0097\7\'\2\2\u0097\u0098\t\5\2\2\u0098\u0099\7(\2\2\u0099"+
		"\u009a\7\32\2\2\u009a\27\3\2\2\2\u009b\u009d\5.\30\2\u009c\u009e\7\r\2"+
		"\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0"+
		"\7\60\2\2\u00a0\u00a1\7\5\2\2\u00a1\u00a2\5> \2\u00a2\31\3\2\2\2\u00a3"+
		"\u00a5\7\23\2\2\u00a4\u00a6\7\r\2\2\u00a5\u00a4\3\2\2\2\u00a5\u00a6\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\7\5\2\2\u00a9"+
		"\u00aa\5\f\7\2\u00aa\u00ab\7\32\2\2\u00ab\33\3\2\2\2\u00ac\u00ae\7\24"+
		"\2\2\u00ad\u00af\7\r\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\u00b1\7\60\2\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\5"+
		"\16\b\2\u00b3\u00b4\7\32\2\2\u00b4\35\3\2\2\2\u00b5\u00b7\5\60\31\2\u00b6"+
		"\u00b8\7\r\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\7\60\2\2\u00ba\u00bd\7\5\2\2\u00bb\u00be\5\b\5\2\u00bc"+
		"\u00be\5\n\6\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c0\7\32\2\2\u00c0\37\3\2\2\2\u00c1\u00c2\7\60\2\2\u00c2"+
		"\u00c3\7\31\2\2\u00c3\u00c4\t\6\2\2\u00c4\u00c5\7\'\2\2\u00c5\u00c6\7"+
		"\60\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\32\2\2\u00c9"+
		"!\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb\u00cc\7\5\2\2\u00cc\u00cd\5\b\5\2"+
		"\u00cd\u00ce\7\32\2\2\u00ce#\3\2\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\t"+
		"\7\2\2\u00d1\u00d2\5\b\5\2\u00d2%\3\2\2\2\u00d3\u00d5\7 \2\2\u00d4\u00d3"+
		"\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\'\2\2\u00d7"+
		"\u00d8\5$\23\2\u00d8\u00d9\7(\2\2\u00d9\'\3\2\2\2\u00da\u00db\7\16\2\2"+
		"\u00db\u00de\7\'\2\2\u00dc\u00df\5$\23\2\u00dd\u00df\5&\24\2\u00de\u00dc"+
		"\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7(\2\2\u00e1"+
		"\u00e2\5\4\3\2\u00e2)\3\2\2\2\u00e3\u00e4\7\b\2\2\u00e4\u00e7\7\'\2\2"+
		"\u00e5\u00e8\5$\23\2\u00e6\u00e8\5&\24\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\7(\2\2\u00ea\u00eb\5\4\3\2\u00eb"+
		"\u00ec\7\13\2\2\u00ec\u00ed\5\4\3\2\u00ed+\3\2\2\2\u00ee\u00ef\7\n\2\2"+
		"\u00ef\u00f0\7\'\2\2\u00f0\u00f1\7\60\2\2\u00f1\u00f2\7\33\2\2\u00f2\u00f3"+
		"\7\60\2\2\u00f3\u00f4\7(\2\2\u00f4\u00f5\5\4\3\2\u00f5-\3\2\2\2\u00f6"+
		"\u00f7\t\b\2\2\u00f7/\3\2\2\2\u00f8\u00f9\t\t\2\2\u00f9\61\3\2\2\2\u00fa"+
		"\u0101\7\'\2\2\u00fb\u00fc\5.\30\2\u00fc\u00fd\7\60\2\2\u00fd\u00fe\7"+
		"\4\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\u0103\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0104\u0105\5.\30\2\u0105\u0106\7\60\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0108\7(\2\2\u0108\63\3\2\2\2\u0109\u010a\7\6\2\2\u010a\u010b\5.\30\2"+
		"\u010b\u010f\7\60\2\2\u010c\u0110\5\62\32\2\u010d\u010e\7\'\2\2\u010e"+
		"\u0110\7(\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0112\58\35\2\u0112\65\3\2\2\2\u0113\u0114\7\6\2\2\u0114\u0115"+
		"\7\30\2\2\u0115\u0119\7\60\2\2\u0116\u011a\5\62\32\2\u0117\u0118\7\'\2"+
		"\2\u0118\u011a\7(\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011d"+
		"\3\2\2\2\u011b\u011e\5:\36\2\u011c\u011e\5\4\3\2\u011d\u011b\3\2\2\2\u011d"+
		"\u011c\3\2\2\2\u011e\67\3\2\2\2\u011f\u0123\7\7\2\2\u0120\u0122\5\6\4"+
		"\2\u0121\u0120\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124"+
		"\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126\u0127\7\25\2\2"+
		"\u0127\u0128\7\60\2\2\u0128\u0129\7\32\2\2\u0129\u012a\7\f\2\2\u012a9"+
		"\3\2\2\2\u012b\u012f\7\7\2\2\u012c\u012e\5\6\4\2\u012d\u012c\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2"+
		"\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\25\2\2\u0133\u0134\7\32\2\2\u0134"+
		"\u0135\7\f\2\2\u0135;\3\2\2\2\u0136\u013b\7\'\2\2\u0137\u0138\7\60\2\2"+
		"\u0138\u013a\7\4\2\2\u0139\u0137\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139"+
		"\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e"+
		"\u013f\7\60\2\2\u013f\u0140\7(\2\2\u0140=\3\2\2\2\u0141\u0145\7\60\2\2"+
		"\u0142\u0146\5<\37\2\u0143\u0144\7\'\2\2\u0144\u0146\7(\2\2\u0145\u0142"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\7\32\2\2"+
		"\u0148?\3\2\2\2\u0149\u014d\5\20\t\2\u014a\u014d\5\22\n\2\u014b\u014d"+
		"\5\24\13\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014b\3\2\2\2"+
		"\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151"+
		"\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\5\2\2\2\u0152A\3\2\2\2\36EGP"+
		"`iqs|\u0085\u008a\u009d\u00a5\u00ae\u00b7\u00bd\u00d4\u00de\u00e7\u0101"+
		"\u010f\u0119\u011d\u0123\u012f\u013b\u0145\u014c\u014e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}