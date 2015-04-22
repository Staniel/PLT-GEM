// Generated from GEM.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GEMParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__53=1, T__52=2, T__51=3, T__50=4, T__49=5, T__48=6, T__47=7, T__46=8, 
		T__45=9, T__44=10, T__43=11, T__42=12, T__41=13, T__40=14, T__39=15, T__38=16, 
		T__37=17, T__36=18, T__35=19, T__34=20, T__33=21, T__32=22, T__31=23, 
		T__30=24, T__29=25, T__28=26, T__27=27, T__26=28, T__25=29, T__24=30, 
		T__23=31, T__22=32, T__21=33, T__20=34, T__19=35, T__18=36, T__17=37, 
		T__16=38, T__15=39, T__14=40, T__13=41, T__12=42, T__11=43, T__10=44, 
		T__9=45, T__8=46, T__7=47, T__6=48, T__5=49, T__4=50, T__3=51, T__2=52, 
		T__1=53, T__0=54, Identifier=55, BooleanLiteral=56, IntegerLiteral=57, 
		FloatingPointLiteral=58, StringLiteral=59, WS=60;
	public static final String[] tokenNames = {
		"<INVALID>", "'default'", "'+='", "'%='", "'new'", "'!='", "'float'", 
		"'while'", "'{'", "'void'", "'&&'", "'='", "'for'", "'Monster'", "'int'", 
		"'null'", "'('", "','", "'-='", "'/='", "'boolean'", "'>='", "'String'", 
		"'<'", "']'", "'~'", "'Item'", "'+'", "'*='", "'/'", "'continue'", "'return'", 
		"'Hero'", "'||'", "';'", "'}'", "'if'", "'<='", "'break'", "'Event'", 
		"'print'", "'switch'", "'*'", "'case'", "':'", "'['", "'=='", "'>'", "'!'", 
		"'%'", "'else'", "'next'", "')'", "'-'", "'Battle'", "Identifier", "BooleanLiteral", 
		"IntegerLiteral", "FloatingPointLiteral", "StringLiteral", "WS"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_variableDeclaration = 1, RULE_methodDeclaration = 2, 
		RULE_methodBody = 3, RULE_expression = 4, RULE_type = 5, RULE_constructor = 6, 
		RULE_eventBlock = 7, RULE_monsterConstructor = 8, RULE_monsterArguments = 9, 
		RULE_heroConstructor = 10, RULE_heroArguments = 11, RULE_battleConstructor = 12, 
		RULE_battleArguments = 13, RULE_arguments = 14, RULE_expressionList = 15, 
		RULE_eventArguments = 16, RULE_eventExpressionList = 17, RULE_block = 18, 
		RULE_blockStatement = 19, RULE_localVariableDeclarationStatement = 20, 
		RULE_localVariableDeclaration = 21, RULE_variableDeclarators = 22, RULE_variableDeclarator = 23, 
		RULE_variableDeclaratorId = 24, RULE_variableInitializer = 25, RULE_arrayInitializer = 26, 
		RULE_statement = 27, RULE_nextStatement = 28, RULE_switchBlockStatementGroup = 29, 
		RULE_switchLabel = 30, RULE_parExpression = 31, RULE_forControl = 32, 
		RULE_forInit = 33, RULE_forUpdate = 34, RULE_statementExpression = 35, 
		RULE_eventType = 36, RULE_specialType = 37, RULE_primitiveType = 38, RULE_parameterList = 39, 
		RULE_parameter = 40, RULE_primary = 41, RULE_literal = 42;
	public static final String[] ruleNames = {
		"compilationUnit", "variableDeclaration", "methodDeclaration", "methodBody", 
		"expression", "type", "constructor", "eventBlock", "monsterConstructor", 
		"monsterArguments", "heroConstructor", "heroArguments", "battleConstructor", 
		"battleArguments", "arguments", "expressionList", "eventArguments", "eventExpressionList", 
		"block", "blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "statement", "nextStatement", "switchBlockStatementGroup", 
		"switchLabel", "parExpression", "forControl", "forInit", "forUpdate", 
		"statementExpression", "eventType", "specialType", "primitiveType", "parameterList", 
		"parameter", "primary", "literal"
	};

	@Override
	public String getGrammarFileName() { return "GEM.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GEMParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(GEMParser.EOF, 0); }
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(88);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(86); variableDeclaration();
						}
						break;
					case 2:
						{
						setState(87); methodDeclaration();
						}
						break;
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(93); methodDeclaration();
			setState(94); match(EOF);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); type();
			setState(97); variableDeclarators();
			setState(98); match(T__20);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GEMParser.Identifier, 0); }
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			switch (_input.LA(1)) {
			case T__48:
			case T__41:
			case T__40:
			case T__34:
			case T__32:
			case T__28:
			case T__22:
			case T__15:
			case T__0:
				{
				setState(100); type();
				}
				break;
			case T__45:
				{
				setState(101); match(T__45);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104); match(Identifier);
			setState(105); match(T__38);
			setState(107);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__41) | (1L << T__40) | (1L << T__34) | (1L << T__32) | (1L << T__28) | (1L << T__22) | (1L << T__15) | (1L << T__0))) != 0)) {
				{
				setState(106); parameterList();
				}
			}

			setState(109); match(T__2);
			setState(112);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(110); methodBody();
				}
				break;
			case T__20:
				{
				setState(111); match(T__20);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); block();
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
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitExpression(this);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			switch (_input.LA(1)) {
			case T__27:
			case T__1:
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(118); expression(9);
				}
				break;
			case T__29:
			case T__6:
				{
				setState(119);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(120); expression(8);
				}
				break;
			case T__39:
			case T__38:
			case Identifier:
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				{
				setState(121); primary();
				}
				break;
			case T__50:
				{
				setState(122); match(T__50);
				setState(123); constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(158);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(126);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(127);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__12) | (1L << T__5))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(128); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(129);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(130);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(131); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__31) | (1L << T__17) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(134); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(135);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(136);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(137); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(138);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(139); match(T__44);
						setState(140); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(141);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(142); match(T__21);
						setState(143); expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(144);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(145);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__51) | (1L << T__43) | (1L << T__36) | (1L << T__35) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(146); expression(1);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(147);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(148); match(T__9);
						setState(149); expression(0);
						setState(150); match(T__30);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(152);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(153); match(T__38);
						setState(155);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
							{
							setState(154); expressionList();
							}
						}

						setState(157); match(T__2);
						}
						break;
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class TypeContext extends ParserRuleContext {
		public EventTypeContext eventType() {
			return getRuleContext(EventTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public SpecialTypeContext specialType() {
			return getRuleContext(SpecialTypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			setState(187);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(163); eventType();
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(164); match(T__9);
					setState(165); match(T__30);
					}
					}
					setState(170);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__41:
			case T__28:
			case T__22:
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); specialType();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(172); match(T__9);
					setState(173); match(T__30);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__48:
			case T__40:
			case T__34:
			case T__32:
				enterOuterAlt(_localctx, 3);
				{
				setState(179); primitiveType();
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(180); match(T__9);
					setState(181); match(T__30);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class ConstructorContext extends ParserRuleContext {
		public HeroConstructorContext heroConstructor() {
			return getRuleContext(HeroConstructorContext.class,0);
		}
		public EventArgumentsContext eventArguments() {
			return getRuleContext(EventArgumentsContext.class,0);
		}
		public EventTypeContext eventType() {
			return getRuleContext(EventTypeContext.class,0);
		}
		public EventBlockContext eventBlock() {
			return getRuleContext(EventBlockContext.class,0);
		}
		public BattleConstructorContext battleConstructor() {
			return getRuleContext(BattleConstructorContext.class,0);
		}
		public MonsterConstructorContext monsterConstructor() {
			return getRuleContext(MonsterConstructorContext.class,0);
		}
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitConstructor(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_constructor);
		try {
			setState(196);
			switch (_input.LA(1)) {
			case T__41:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); monsterConstructor();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(190); battleConstructor();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(191); heroConstructor();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(192); eventType();
				setState(193); eventArguments();
				setState(194); eventBlock();
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

	public static class EventBlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public NextStatementContext nextStatement() {
			return getRuleContext(NextStatementContext.class,0);
		}
		public EventBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterEventBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitEventBlock(this);
		}
	}

	public final EventBlockContext eventBlock() throws RecognitionException {
		EventBlockContext _localctx = new EventBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_eventBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); match(T__46);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(199); blockStatement();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205); nextStatement();
			setState(206); match(T__19);
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

	public static class MonsterConstructorContext extends ParserRuleContext {
		public MonsterArgumentsContext monsterArguments() {
			return getRuleContext(MonsterArgumentsContext.class,0);
		}
		public MonsterConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monsterConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterMonsterConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitMonsterConstructor(this);
		}
	}

	public final MonsterConstructorContext monsterConstructor() throws RecognitionException {
		MonsterConstructorContext _localctx = new MonsterConstructorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_monsterConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(T__41);
			setState(209); monsterArguments();
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

	public static class MonsterArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MonsterArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monsterArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterMonsterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitMonsterArguments(this);
		}
	}

	public final MonsterArgumentsContext monsterArguments() throws RecognitionException {
		MonsterArgumentsContext _localctx = new MonsterArgumentsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_monsterArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211); match(T__38);
			setState(212); expression(0);
			setState(213); match(T__37);
			setState(214); expression(0);
			setState(215); match(T__37);
			setState(216); expression(0);
			setState(217); match(T__37);
			setState(218); expression(0);
			setState(219); match(T__2);
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

	public static class HeroConstructorContext extends ParserRuleContext {
		public HeroArgumentsContext heroArguments() {
			return getRuleContext(HeroArgumentsContext.class,0);
		}
		public HeroConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heroConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterHeroConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitHeroConstructor(this);
		}
	}

	public final HeroConstructorContext heroConstructor() throws RecognitionException {
		HeroConstructorContext _localctx = new HeroConstructorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_heroConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(T__22);
			setState(222); heroArguments();
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

	public static class HeroArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public HeroArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heroArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterHeroArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitHeroArguments(this);
		}
	}

	public final HeroArgumentsContext heroArguments() throws RecognitionException {
		HeroArgumentsContext _localctx = new HeroArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_heroArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); match(T__38);
			setState(225); expression(0);
			setState(226); match(T__37);
			setState(227); expression(0);
			setState(228); match(T__37);
			setState(229); expression(0);
			setState(230); match(T__37);
			setState(231); expression(0);
			setState(232); match(T__37);
			setState(233); expression(0);
			setState(234); match(T__2);
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

	public static class BattleConstructorContext extends ParserRuleContext {
		public BattleArgumentsContext battleArguments() {
			return getRuleContext(BattleArgumentsContext.class,0);
		}
		public BattleConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_battleConstructor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterBattleConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitBattleConstructor(this);
		}
	}

	public final BattleConstructorContext battleConstructor() throws RecognitionException {
		BattleConstructorContext _localctx = new BattleConstructorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_battleConstructor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); match(T__0);
			setState(237); battleArguments();
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

	public static class BattleArgumentsContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public BattleArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_battleArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterBattleArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitBattleArguments(this);
		}
	}

	public final BattleArgumentsContext battleArguments() throws RecognitionException {
		BattleArgumentsContext _localctx = new BattleArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_battleArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); match(T__38);
			setState(240); expression(0);
			setState(241); match(T__37);
			setState(242); expression(0);
			setState(243); match(T__2);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(T__38);
			setState(247);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(246); expressionList();
				}
			}

			setState(249); match(T__2);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); expression(0);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(252); match(T__37);
				setState(253); expression(0);
				}
				}
				setState(258);
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

	public static class EventArgumentsContext extends ParserRuleContext {
		public EventExpressionListContext eventExpressionList() {
			return getRuleContext(EventExpressionListContext.class,0);
		}
		public EventArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterEventArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitEventArguments(this);
		}
	}

	public final EventArgumentsContext eventArguments() throws RecognitionException {
		EventArgumentsContext _localctx = new EventArgumentsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eventArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(T__38);
			setState(260); eventExpressionList();
			setState(261); match(T__2);
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

	public static class EventExpressionListContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public EventExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterEventExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitEventExpressionList(this);
		}
	}

	public final EventExpressionListContext eventExpressionList() throws RecognitionException {
		EventExpressionListContext _localctx = new EventExpressionListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_eventExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); expression(0);
			setState(264); match(T__37);
			setState(265); expression(0);
			setState(268);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(266); match(T__37);
				setState(267); expressionList();
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

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270); match(T__46);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(271); blockStatement();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(277); match(T__19);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_blockStatement);
		try {
			setState(282);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(279); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(280); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(281); variableDeclaration();
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

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284); localVariableDeclaration();
			setState(285); match(T__20);
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

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); type();
			setState(288); variableDeclarators();
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

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290); variableDeclarator();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(291); match(T__37);
				setState(292); variableDeclarator();
				}
				}
				setState(297);
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

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298); variableDeclaratorId();
			setState(301);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(299); match(T__43);
				setState(300); variableInitializer();
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

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GEMParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303); match(Identifier);
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(304); match(T__9);
				setState(305); match(T__30);
				}
				}
				setState(310);
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

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variableInitializer);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(311); arrayInitializer();
				}
				break;
			case T__50:
			case T__39:
			case T__38:
			case T__29:
			case T__27:
			case T__6:
			case T__1:
			case Identifier:
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(312); expression(0);
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

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315); match(T__46);
			setState(327);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__46) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(316); variableInitializer();
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(317); match(T__37);
						setState(318); variableInitializer();
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(325);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(324); match(T__37);
					}
				}

				}
			}

			setState(329); match(T__19);
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
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(383);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(331); block();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); match(T__18);
				setState(333); parExpression();
				setState(334); statement();
				setState(337);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(335); match(T__4);
					setState(336); statement();
					}
					break;
				}
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(339); match(T__42);
				setState(340); match(T__38);
				setState(341); forControl();
				setState(342); match(T__2);
				setState(343); statement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(345); match(T__47);
				setState(346); parExpression();
				setState(347); statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(349); match(T__13);
				setState(350); parExpression();
				setState(351); match(T__46);
				setState(355);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(352); switchBlockStatementGroup();
						}
						} 
					}
					setState(357);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__53 || _la==T__11) {
					{
					{
					setState(358); switchLabel();
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(364); match(T__19);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(366); match(T__23);
				setState(368);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(367); expression(0);
					}
				}

				setState(370); match(T__20);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 7);
				{
				setState(371); match(T__14);
				setState(372); expression(0);
				setState(373); match(T__20);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 8);
				{
				setState(375); match(T__16);
				setState(376); match(T__20);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 9);
				{
				setState(377); match(T__24);
				setState(378); match(T__20);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 10);
				{
				setState(379); match(T__20);
				}
				break;
			case T__50:
			case T__39:
			case T__38:
			case T__29:
			case T__27:
			case T__6:
			case T__1:
			case Identifier:
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 11);
				{
				setState(380); statementExpression();
				setState(381); match(T__20);
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

	public static class NextStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NextStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterNextStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitNextStatement(this);
		}
	}

	public final NextStatementContext nextStatement() throws RecognitionException {
		NextStatementContext _localctx = new NextStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_nextStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); match(T__3);
			setState(386); expression(0);
			setState(387); match(T__20);
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

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(389); switchLabel();
				}
				}
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 || _la==T__11 );
			setState(395); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(394); blockStatement();
				}
				}
				setState(397); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0) );
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

	public static class SwitchLabelContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_switchLabel);
		try {
			setState(405);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(399); match(T__11);
				setState(400); expression(0);
				setState(401); match(T__10);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); match(T__53);
				setState(404); match(T__10);
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

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407); match(T__38);
			setState(408); expression(0);
			setState(409); match(T__2);
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

	public static class ForControlContext extends ParserRuleContext {
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__22) | (1L << T__15) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(411); forInit();
				}
			}

			setState(414); match(T__20);
			setState(416);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(415); expression(0);
				}
			}

			setState(418); match(T__20);
			setState(420);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(419); forUpdate();
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

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_forInit);
		try {
			setState(424);
			switch (_input.LA(1)) {
			case T__48:
			case T__41:
			case T__40:
			case T__34:
			case T__32:
			case T__28:
			case T__22:
			case T__15:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(422); localVariableDeclaration();
				}
				break;
			case T__50:
			case T__39:
			case T__38:
			case T__29:
			case T__27:
			case T__6:
			case T__1:
			case Identifier:
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(423); expressionList();
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

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); expressionList();
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

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); expression(0);
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

	public static class EventTypeContext extends ParserRuleContext {
		public EventTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterEventType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitEventType(this);
		}
	}

	public final EventTypeContext eventType() throws RecognitionException {
		EventTypeContext _localctx = new EventTypeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_eventType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(T__15);
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

	public static class SpecialTypeContext extends ParserRuleContext {
		public SpecialTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterSpecialType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitSpecialType(this);
		}
	}

	public final SpecialTypeContext specialType() throws RecognitionException {
		SpecialTypeContext _localctx = new SpecialTypeContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_specialType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__28) | (1L << T__22) | (1L << T__0))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__40) | (1L << T__34) | (1L << T__32))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); parameter();
			setState(441);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(437); match(T__37);
				setState(438); parameter();
				}
				}
				setState(443);
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

	public static class ParameterContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444); type();
			setState(445); variableDeclaratorId();
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

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(GEMParser.Identifier, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_primary);
		try {
			setState(453);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(447); match(T__38);
				setState(448); expression(0);
				setState(449); match(T__2);
				}
				break;
			case T__39:
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(452); match(Identifier);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(GEMParser.StringLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(GEMParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(GEMParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(GEMParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__39) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
		case 4: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 7);
		case 1: return precpred(_ctx, 6);
		case 2: return precpred(_ctx, 5);
		case 3: return precpred(_ctx, 4);
		case 4: return precpred(_ctx, 3);
		case 5: return precpred(_ctx, 2);
		case 6: return precpred(_ctx, 1);
		case 7: return precpred(_ctx, 12);
		case 8: return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>\u01cc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\5\4i\n\4\3\4\3\4\3\4\5\4n\n\4\3\4\3\4\3\4\5\4s\n\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u009e\n\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\7\3"+
		"\7\3\7\7\7\u00a9\n\7\f\7\16\7\u00ac\13\7\3\7\3\7\3\7\7\7\u00b1\n\7\f\7"+
		"\16\7\u00b4\13\7\3\7\3\7\3\7\7\7\u00b9\n\7\f\7\16\7\u00bc\13\7\5\7\u00be"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c7\n\b\3\t\3\t\7\t\u00cb\n\t\f"+
		"\t\16\t\u00ce\13\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\5\20\u00fa\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u0101\n\21\f\21\16\21\u0104"+
		"\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u010f\n\23\3"+
		"\24\3\24\7\24\u0113\n\24\f\24\16\24\u0116\13\24\3\24\3\24\3\25\3\25\3"+
		"\25\5\25\u011d\n\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\7\30"+
		"\u0128\n\30\f\30\16\30\u012b\13\30\3\31\3\31\3\31\5\31\u0130\n\31\3\32"+
		"\3\32\3\32\7\32\u0135\n\32\f\32\16\32\u0138\13\32\3\33\3\33\5\33\u013c"+
		"\n\33\3\34\3\34\3\34\3\34\7\34\u0142\n\34\f\34\16\34\u0145\13\34\3\34"+
		"\5\34\u0148\n\34\5\34\u014a\n\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\5\35\u0154\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\7\35\u0164\n\35\f\35\16\35\u0167\13\35\3\35\7\35"+
		"\u016a\n\35\f\35\16\35\u016d\13\35\3\35\3\35\3\35\3\35\5\35\u0173\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0182\n\35\3\36\3\36\3\36\3\36\3\37\6\37\u0189\n\37\r\37\16\37\u018a"+
		"\3\37\6\37\u018e\n\37\r\37\16\37\u018f\3 \3 \3 \3 \3 \3 \5 \u0198\n \3"+
		"!\3!\3!\3!\3\"\5\"\u019f\n\"\3\"\3\"\5\"\u01a3\n\"\3\"\3\"\5\"\u01a7\n"+
		"\"\3#\3#\5#\u01ab\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\7)\u01ba"+
		"\n)\f)\16)\u01bd\13)\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u01c8\n+\3,\3,\3,\2"+
		"\3\n-\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>"+
		"@BDFHJLNPRTV\2\13\4\2\35\35\67\67\4\2\33\33\62\62\5\2\37\37,,\63\63\6"+
		"\2\27\27\31\31\'\'\61\61\4\2\7\7\60\60\6\2\4\5\r\r\24\25\36\36\6\2\17"+
		"\17\34\34\"\"88\6\2\b\b\20\20\26\26\30\30\4\2\21\21:=\u01e0\2\\\3\2\2"+
		"\2\4b\3\2\2\2\6h\3\2\2\2\bt\3\2\2\2\n~\3\2\2\2\f\u00bd\3\2\2\2\16\u00c6"+
		"\3\2\2\2\20\u00c8\3\2\2\2\22\u00d2\3\2\2\2\24\u00d5\3\2\2\2\26\u00df\3"+
		"\2\2\2\30\u00e2\3\2\2\2\32\u00ee\3\2\2\2\34\u00f1\3\2\2\2\36\u00f7\3\2"+
		"\2\2 \u00fd\3\2\2\2\"\u0105\3\2\2\2$\u0109\3\2\2\2&\u0110\3\2\2\2(\u011c"+
		"\3\2\2\2*\u011e\3\2\2\2,\u0121\3\2\2\2.\u0124\3\2\2\2\60\u012c\3\2\2\2"+
		"\62\u0131\3\2\2\2\64\u013b\3\2\2\2\66\u013d\3\2\2\28\u0181\3\2\2\2:\u0183"+
		"\3\2\2\2<\u0188\3\2\2\2>\u0197\3\2\2\2@\u0199\3\2\2\2B\u019e\3\2\2\2D"+
		"\u01aa\3\2\2\2F\u01ac\3\2\2\2H\u01ae\3\2\2\2J\u01b0\3\2\2\2L\u01b2\3\2"+
		"\2\2N\u01b4\3\2\2\2P\u01b6\3\2\2\2R\u01be\3\2\2\2T\u01c7\3\2\2\2V\u01c9"+
		"\3\2\2\2X[\5\4\3\2Y[\5\6\4\2ZX\3\2\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2"+
		"\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\5\6\4\2`a\7\2\2\3a\3\3\2\2\2bc\5\f"+
		"\7\2cd\5.\30\2de\7$\2\2e\5\3\2\2\2fi\5\f\7\2gi\7\13\2\2hf\3\2\2\2hg\3"+
		"\2\2\2ij\3\2\2\2jk\79\2\2km\7\22\2\2ln\5P)\2ml\3\2\2\2mn\3\2\2\2no\3\2"+
		"\2\2or\7\66\2\2ps\5\b\5\2qs\7$\2\2rp\3\2\2\2rq\3\2\2\2s\7\3\2\2\2tu\5"+
		"&\24\2u\t\3\2\2\2vw\b\6\1\2wx\t\2\2\2x\177\5\n\6\13yz\t\3\2\2z\177\5\n"+
		"\6\n{\177\5T+\2|}\7\6\2\2}\177\5\16\b\2~v\3\2\2\2~y\3\2\2\2~{\3\2\2\2"+
		"~|\3\2\2\2\177\u00a2\3\2\2\2\u0080\u0081\f\t\2\2\u0081\u0082\t\4\2\2\u0082"+
		"\u00a1\5\n\6\n\u0083\u0084\f\b\2\2\u0084\u0085\t\2\2\2\u0085\u00a1\5\n"+
		"\6\t\u0086\u0087\f\7\2\2\u0087\u0088\t\5\2\2\u0088\u00a1\5\n\6\b\u0089"+
		"\u008a\f\6\2\2\u008a\u008b\t\6\2\2\u008b\u00a1\5\n\6\7\u008c\u008d\f\5"+
		"\2\2\u008d\u008e\7\f\2\2\u008e\u00a1\5\n\6\6\u008f\u0090\f\4\2\2\u0090"+
		"\u0091\7#\2\2\u0091\u00a1\5\n\6\5\u0092\u0093\f\3\2\2\u0093\u0094\t\7"+
		"\2\2\u0094\u00a1\5\n\6\3\u0095\u0096\f\16\2\2\u0096\u0097\7/\2\2\u0097"+
		"\u0098\5\n\6\2\u0098\u0099\7\32\2\2\u0099\u00a1\3\2\2\2\u009a\u009b\f"+
		"\r\2\2\u009b\u009d\7\22\2\2\u009c\u009e\5 \21\2\u009d\u009c\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\7\66\2\2\u00a0\u0080\3"+
		"\2\2\2\u00a0\u0083\3\2\2\2\u00a0\u0086\3\2\2\2\u00a0\u0089\3\2\2\2\u00a0"+
		"\u008c\3\2\2\2\u00a0\u008f\3\2\2\2\u00a0\u0092\3\2\2\2\u00a0\u0095\3\2"+
		"\2\2\u00a0\u009a\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\13\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00aa\5J&\2"+
		"\u00a6\u00a7\7/\2\2\u00a7\u00a9\7\32\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ac"+
		"\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00be\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00b2\5L\'\2\u00ae\u00af\7/\2\2\u00af\u00b1\7\32"+
		"\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2"+
		"\u00b3\3\2\2\2\u00b3\u00be\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00ba\5N"+
		"(\2\u00b6\u00b7\7/\2\2\u00b7\u00b9\7\32\2\2\u00b8\u00b6\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00be\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00a5\3\2\2\2\u00bd\u00ad\3\2\2\2\u00bd"+
		"\u00b5\3\2\2\2\u00be\r\3\2\2\2\u00bf\u00c7\5\22\n\2\u00c0\u00c7\5\32\16"+
		"\2\u00c1\u00c7\5\26\f\2\u00c2\u00c3\5J&\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5"+
		"\5\20\t\2\u00c5\u00c7\3\2\2\2\u00c6\u00bf\3\2\2\2\u00c6\u00c0\3\2\2\2"+
		"\u00c6\u00c1\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\17\3\2\2\2\u00c8\u00cc"+
		"\7\n\2\2\u00c9\u00cb\5(\25\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2"+
		"\2\2\u00cf\u00d0\5:\36\2\u00d0\u00d1\7%\2\2\u00d1\21\3\2\2\2\u00d2\u00d3"+
		"\7\17\2\2\u00d3\u00d4\5\24\13\2\u00d4\23\3\2\2\2\u00d5\u00d6\7\22\2\2"+
		"\u00d6\u00d7\5\n\6\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da"+
		"\7\23\2\2\u00da\u00db\5\n\6\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\5\n\6\2"+
		"\u00dd\u00de\7\66\2\2\u00de\25\3\2\2\2\u00df\u00e0\7\"\2\2\u00e0\u00e1"+
		"\5\30\r\2\u00e1\27\3\2\2\2\u00e2\u00e3\7\22\2\2\u00e3\u00e4\5\n\6\2\u00e4"+
		"\u00e5\7\23\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\7\23\2\2\u00e7\u00e8\5"+
		"\n\6\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\5\n\6\2\u00ea\u00eb\7\23\2\2\u00eb"+
		"\u00ec\5\n\6\2\u00ec\u00ed\7\66\2\2\u00ed\31\3\2\2\2\u00ee\u00ef\78\2"+
		"\2\u00ef\u00f0\5\34\17\2\u00f0\33\3\2\2\2\u00f1\u00f2\7\22\2\2\u00f2\u00f3"+
		"\5\n\6\2\u00f3\u00f4\7\23\2\2\u00f4\u00f5\5\n\6\2\u00f5\u00f6\7\66\2\2"+
		"\u00f6\35\3\2\2\2\u00f7\u00f9\7\22\2\2\u00f8\u00fa\5 \21\2\u00f9\u00f8"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\66\2\2"+
		"\u00fc\37\3\2\2\2\u00fd\u0102\5\n\6\2\u00fe\u00ff\7\23\2\2\u00ff\u0101"+
		"\5\n\6\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103!\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\22\2\2"+
		"\u0106\u0107\5$\23\2\u0107\u0108\7\66\2\2\u0108#\3\2\2\2\u0109\u010a\5"+
		"\n\6\2\u010a\u010b\7\23\2\2\u010b\u010e\5\n\6\2\u010c\u010d\7\23\2\2\u010d"+
		"\u010f\5 \21\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f%\3\2\2\2"+
		"\u0110\u0114\7\n\2\2\u0111\u0113\5(\25\2\u0112\u0111\3\2\2\2\u0113\u0116"+
		"\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0117\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u0118\7%\2\2\u0118\'\3\2\2\2\u0119\u011d\5*\26\2"+
		"\u011a\u011d\58\35\2\u011b\u011d\5\4\3\2\u011c\u0119\3\2\2\2\u011c\u011a"+
		"\3\2\2\2\u011c\u011b\3\2\2\2\u011d)\3\2\2\2\u011e\u011f\5,\27\2\u011f"+
		"\u0120\7$\2\2\u0120+\3\2\2\2\u0121\u0122\5\f\7\2\u0122\u0123\5.\30\2\u0123"+
		"-\3\2\2\2\u0124\u0129\5\60\31\2\u0125\u0126\7\23\2\2\u0126\u0128\5\60"+
		"\31\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a/\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012f\5\62\32"+
		"\2\u012d\u012e\7\r\2\2\u012e\u0130\5\64\33\2\u012f\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\61\3\2\2\2\u0131\u0136\79\2\2\u0132\u0133\7/\2\2"+
		"\u0133\u0135\7\32\2\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\63\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013c\5\66\34\2\u013a\u013c\5\n\6\2\u013b\u0139\3\2\2\2\u013b\u013a\3"+
		"\2\2\2\u013c\65\3\2\2\2\u013d\u0149\7\n\2\2\u013e\u0143\5\64\33\2\u013f"+
		"\u0140\7\23\2\2\u0140\u0142\5\64\33\2\u0141\u013f\3\2\2\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0146\u0148\7\23\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3"+
		"\2\2\2\u0148\u014a\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u014a\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014c\7%\2\2\u014c\67\3\2\2\2\u014d\u0182\5&\24\2"+
		"\u014e\u014f\7&\2\2\u014f\u0150\5@!\2\u0150\u0153\58\35\2\u0151\u0152"+
		"\7\64\2\2\u0152\u0154\58\35\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2"+
		"\u0154\u0182\3\2\2\2\u0155\u0156\7\16\2\2\u0156\u0157\7\22\2\2\u0157\u0158"+
		"\5B\"\2\u0158\u0159\7\66\2\2\u0159\u015a\58\35\2\u015a\u0182\3\2\2\2\u015b"+
		"\u015c\7\t\2\2\u015c\u015d\5@!\2\u015d\u015e\58\35\2\u015e\u0182\3\2\2"+
		"\2\u015f\u0160\7+\2\2\u0160\u0161\5@!\2\u0161\u0165\7\n\2\2\u0162\u0164"+
		"\5<\37\2\u0163\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u016b\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016a\5>"+
		" \2\u0169\u0168\3\2\2\2\u016a\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b"+
		"\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7%"+
		"\2\2\u016f\u0182\3\2\2\2\u0170\u0172\7!\2\2\u0171\u0173\5\n\6\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0182\7$"+
		"\2\2\u0175\u0176\7*\2\2\u0176\u0177\5\n\6\2\u0177\u0178\7$\2\2\u0178\u0182"+
		"\3\2\2\2\u0179\u017a\7(\2\2\u017a\u0182\7$\2\2\u017b\u017c\7 \2\2\u017c"+
		"\u0182\7$\2\2\u017d\u0182\7$\2\2\u017e\u017f\5H%\2\u017f\u0180\7$\2\2"+
		"\u0180\u0182\3\2\2\2\u0181\u014d\3\2\2\2\u0181\u014e\3\2\2\2\u0181\u0155"+
		"\3\2\2\2\u0181\u015b\3\2\2\2\u0181\u015f\3\2\2\2\u0181\u0170\3\2\2\2\u0181"+
		"\u0175\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u017b\3\2\2\2\u0181\u017d\3\2"+
		"\2\2\u0181\u017e\3\2\2\2\u01829\3\2\2\2\u0183\u0184\7\65\2\2\u0184\u0185"+
		"\5\n\6\2\u0185\u0186\7$\2\2\u0186;\3\2\2\2\u0187\u0189\5> \2\u0188\u0187"+
		"\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018e\5(\25\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190=\3\2\2\2\u0191\u0192"+
		"\7-\2\2\u0192\u0193\5\n\6\2\u0193\u0194\7.\2\2\u0194\u0198\3\2\2\2\u0195"+
		"\u0196\7\3\2\2\u0196\u0198\7.\2\2\u0197\u0191\3\2\2\2\u0197\u0195\3\2"+
		"\2\2\u0198?\3\2\2\2\u0199\u019a\7\22\2\2\u019a\u019b\5\n\6\2\u019b\u019c"+
		"\7\66\2\2\u019cA\3\2\2\2\u019d\u019f\5D#\2\u019e\u019d\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\7$\2\2\u01a1\u01a3\5\n\6\2\u01a2"+
		"\u01a1\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a6\7$"+
		"\2\2\u01a5\u01a7\5F$\2\u01a6\u01a5\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7C"+
		"\3\2\2\2\u01a8\u01ab\5,\27\2\u01a9\u01ab\5 \21\2\u01aa\u01a8\3\2\2\2\u01aa"+
		"\u01a9\3\2\2\2\u01abE\3\2\2\2\u01ac\u01ad\5 \21\2\u01adG\3\2\2\2\u01ae"+
		"\u01af\5\n\6\2\u01afI\3\2\2\2\u01b0\u01b1\7)\2\2\u01b1K\3\2\2\2\u01b2"+
		"\u01b3\t\b\2\2\u01b3M\3\2\2\2\u01b4\u01b5\t\t\2\2\u01b5O\3\2\2\2\u01b6"+
		"\u01bb\5R*\2\u01b7\u01b8\7\23\2\2\u01b8\u01ba\5R*\2\u01b9\u01b7\3\2\2"+
		"\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bcQ"+
		"\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01bf\5\f\7\2\u01bf\u01c0\5\62\32\2"+
		"\u01c0S\3\2\2\2\u01c1\u01c2\7\22\2\2\u01c2\u01c3\5\n\6\2\u01c3\u01c4\7"+
		"\66\2\2\u01c4\u01c8\3\2\2\2\u01c5\u01c8\5V,\2\u01c6\u01c8\79\2\2\u01c7"+
		"\u01c1\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c6\3\2\2\2\u01c8U\3\2\2\2"+
		"\u01c9\u01ca\t\n\2\2\u01caW\3\2\2\2+Z\\hmr~\u009d\u00a0\u00a2\u00aa\u00b2"+
		"\u00ba\u00bd\u00c6\u00cc\u00f9\u0102\u010e\u0114\u011c\u0129\u012f\u0136"+
		"\u013b\u0143\u0147\u0149\u0153\u0165\u016b\u0172\u0181\u018a\u018f\u0197"+
		"\u019e\u01a2\u01a6\u01aa\u01bb\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}