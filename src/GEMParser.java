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
		FloatingPointLiteral=58, StringLiteral=59;
	public static final String[] tokenNames = {
		"<INVALID>", "'default'", "'+='", "'%='", "'new'", "'!='", "'float'", 
		"'while'", "'{'", "'void'", "'&&'", "'='", "'for'", "'Monster'", "'int'", 
		"'null'", "'('", "','", "'-='", "'/='", "'boolean'", "'>='", "'String'", 
		"'<'", "']'", "'~'", "'Item'", "'+'", "'*='", "'/'", "'continue'", "'return'", 
		"'Hero'", "'||'", "';'", "'}'", "'if'", "'<='", "'break'", "'Event'", 
		"'print'", "'switch'", "'*'", "'case'", "':'", "'['", "'=='", "'>'", "'!'", 
		"'%'", "'else'", "'next'", "')'", "'-'", "'Battle'", "Identifier", "BooleanLiteral", 
		"IntegerLiteral", "FloatingPointLiteral", "StringLiteral"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_variableDeclaration = 1, RULE_methodDeclaration = 2, 
		RULE_methodBody = 3, RULE_expression = 4, RULE_type = 5, RULE_constructor = 6, 
		RULE_arguments = 7, RULE_expressionList = 8, RULE_eventArguments = 9, 
		RULE_eventExpressionList = 10, RULE_block = 11, RULE_blockStatement = 12, 
		RULE_specialBlock = 13, RULE_localVariableDeclarationStatement = 14, RULE_localVariableDeclaration = 15, 
		RULE_variableDeclarators = 16, RULE_variableDeclarator = 17, RULE_variableDeclaratorId = 18, 
		RULE_variableInitializer = 19, RULE_arrayInitializer = 20, RULE_statement = 21, 
		RULE_switchBlockStatementGroup = 22, RULE_switchLabel = 23, RULE_parExpression = 24, 
		RULE_forControl = 25, RULE_forInit = 26, RULE_forUpdate = 27, RULE_statementExpression = 28, 
		RULE_specialType = 29, RULE_eventType = 30, RULE_primitiveType = 31, RULE_parameterList = 32, 
		RULE_parameter = 33, RULE_primary = 34, RULE_literal = 35;
	public static final String[] ruleNames = {
		"compilationUnit", "variableDeclaration", "methodDeclaration", "methodBody", 
		"expression", "type", "constructor", "arguments", "expressionList", "eventArguments", 
		"eventExpressionList", "block", "blockStatement", "specialBlock", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "statement", 
		"switchBlockStatementGroup", "switchLabel", "parExpression", "forControl", 
		"forInit", "forUpdate", "statementExpression", "specialType", "eventType", 
		"primitiveType", "parameterList", "parameter", "primary", "literal"
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(72); methodDeclaration();
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
			setState(74); type();
			setState(75); variableDeclarators();
			setState(76); match(T__20);
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
			setState(80);
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
				setState(78); type();
				}
				break;
			case T__45:
				{
				setState(79); match(T__45);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(82); match(Identifier);
			setState(83); parameterList();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(84); match(T__9);
				setState(85); match(T__30);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			switch (_input.LA(1)) {
			case T__46:
				{
				setState(91); methodBody();
				}
				break;
			case T__20:
				{
				setState(92); match(T__20);
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
			setState(95); block();
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
			setState(105);
			switch (_input.LA(1)) {
			case T__27:
			case T__1:
				{
				setState(98);
				_la = _input.LA(1);
				if ( !(_la==T__27 || _la==T__1) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(99); expression(9);
				}
				break;
			case T__29:
			case T__6:
				{
				setState(100);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(101); expression(8);
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
				setState(102); primary();
				}
				break;
			case T__50:
				{
				setState(103); match(T__50);
				setState(104); constructor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(139);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(108);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__25) | (1L << T__12) | (1L << T__5))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(109); expression(8);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(112); expression(7);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(114);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__33) | (1L << T__31) | (1L << T__17) | (1L << T__7))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(115); expression(6);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(116);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(117);
						_la = _input.LA(1);
						if ( !(_la==T__49 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(118); expression(5);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120); match(T__44);
						setState(121); expression(4);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(123); match(T__21);
						setState(124); expression(3);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(126);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__51) | (1L << T__43) | (1L << T__36) | (1L << T__35) | (1L << T__26))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(127); expression(1);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(129); match(T__9);
						setState(130); expression(0);
						setState(131); match(T__30);
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(133);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(134); match(T__38);
						setState(136);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
							{
							setState(135); expressionList();
							}
						}

						setState(138); match(T__2);
						}
						break;
					}
					} 
				}
				setState(143);
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
			setState(168);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(144); eventType();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(145); match(T__9);
					setState(146); match(T__30);
					}
					}
					setState(151);
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
				setState(152); specialType();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(153); match(T__9);
					setState(154); match(T__30);
					}
					}
					setState(159);
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
				setState(160); primitiveType();
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__9) {
					{
					{
					setState(161); match(T__9);
					setState(162); match(T__30);
					}
					}
					setState(167);
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
		public EventArgumentsContext eventArguments() {
			return getRuleContext(EventArgumentsContext.class,0);
		}
		public EventTypeContext eventType() {
			return getRuleContext(EventTypeContext.class,0);
		}
		public SpecialBlockContext specialBlock() {
			return getRuleContext(SpecialBlockContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SpecialTypeContext specialType() {
			return getRuleContext(SpecialTypeContext.class,0);
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
			setState(178);
			switch (_input.LA(1)) {
			case T__41:
			case T__28:
			case T__22:
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(170); specialType();
				setState(171); arguments();
				setState(172); specialBlock();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); eventType();
				setState(175); eventArguments();
				setState(176); block();
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
		enterRule(_localctx, 14, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(T__38);
			setState(182);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(181); expressionList();
				}
			}

			setState(184); match(T__2);
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
		enterRule(_localctx, 16, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); expression(0);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(187); match(T__37);
				setState(188); expression(0);
				}
				}
				setState(193);
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
		enterRule(_localctx, 18, RULE_eventArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194); match(T__38);
			setState(195); eventExpressionList();
			setState(196); match(T__2);
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
		enterRule(_localctx, 20, RULE_eventExpressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198); expression(0);
			setState(199); match(T__37);
			setState(200); expression(0);
			setState(203);
			_la = _input.LA(1);
			if (_la==T__37) {
				{
				setState(201); match(T__37);
				setState(202); expressionList();
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
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205); match(T__46);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(206); blockStatement();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212); match(T__19);
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
		enterRule(_localctx, 24, RULE_blockStatement);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(216); variableDeclaration();
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

	public static class SpecialBlockContext extends ParserRuleContext {
		public StatementExpressionContext statementExpression(int i) {
			return getRuleContext(StatementExpressionContext.class,i);
		}
		public List<StatementExpressionContext> statementExpression() {
			return getRuleContexts(StatementExpressionContext.class);
		}
		public SpecialBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).enterSpecialBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GEMListener ) ((GEMListener)listener).exitSpecialBlock(this);
		}
	}

	public final SpecialBlockContext specialBlock() throws RecognitionException {
		SpecialBlockContext _localctx = new SpecialBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_specialBlock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(219); statementExpression();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		enterRule(_localctx, 28, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); localVariableDeclaration();
			setState(226); match(T__20);
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
		enterRule(_localctx, 30, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); type();
			setState(229); variableDeclarators();
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
		enterRule(_localctx, 32, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231); variableDeclarator();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(232); match(T__37);
				setState(233); variableDeclarator();
				}
				}
				setState(238);
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
		enterRule(_localctx, 34, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239); variableDeclaratorId();
			setState(242);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(240); match(T__43);
				setState(241); variableInitializer();
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
		enterRule(_localctx, 36, RULE_variableDeclaratorId);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(Identifier);
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(245); match(T__9);
					setState(246); match(T__30);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 38, RULE_variableInitializer);
		try {
			setState(254);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); arrayInitializer();
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
				setState(253); expression(0);
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
		enterRule(_localctx, 40, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(T__46);
			setState(268);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__46) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(257); variableInitializer();
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258); match(T__37);
						setState(259); variableInitializer();
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				}
				setState(266);
				_la = _input.LA(1);
				if (_la==T__37) {
					{
					setState(265); match(T__37);
					}
				}

				}
			}

			setState(270); match(T__19);
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
		enterRule(_localctx, 42, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(328);
			switch (_input.LA(1)) {
			case T__46:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); block();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(273); match(T__18);
				setState(274); parExpression();
				setState(275); statement();
				setState(278);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(276); match(T__4);
					setState(277); statement();
					}
					break;
				}
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 3);
				{
				setState(280); match(T__42);
				setState(281); match(T__38);
				setState(282); forControl();
				setState(283); match(T__2);
				setState(284); statement();
				}
				break;
			case T__47:
				enterOuterAlt(_localctx, 4);
				{
				setState(286); match(T__47);
				setState(287); parExpression();
				setState(288); statement();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(290); match(T__13);
				setState(291); parExpression();
				setState(292); match(T__46);
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293); switchBlockStatementGroup();
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__53 || _la==T__11) {
					{
					{
					setState(299); switchLabel();
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305); match(T__19);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 6);
				{
				setState(307); match(T__23);
				setState(309);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
					{
					setState(308); expression(0);
					}
				}

				setState(311); match(T__20);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 7);
				{
				setState(312); match(T__3);
				setState(313); expression(0);
				setState(314); match(T__20);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 8);
				{
				setState(316); match(T__14);
				setState(317); expression(0);
				setState(318); match(T__20);
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 9);
				{
				setState(320); match(T__16);
				setState(321); match(T__20);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 10);
				{
				setState(322); match(T__24);
				setState(323); match(T__20);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 11);
				{
				setState(324); match(T__20);
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
				enterOuterAlt(_localctx, 12);
				{
				setState(325); statementExpression();
				setState(326); match(T__20);
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
		enterRule(_localctx, 44, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(330); switchLabel();
				}
				}
				setState(333); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__53 || _la==T__11 );
			setState(336); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335); blockStatement();
				}
				}
				setState(338); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__47) | (1L << T__46) | (1L << T__42) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__24) | (1L << T__23) | (1L << T__22) | (1L << T__20) | (1L << T__18) | (1L << T__16) | (1L << T__15) | (1L << T__14) | (1L << T__13) | (1L << T__6) | (1L << T__3) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0) );
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
		enterRule(_localctx, 46, RULE_switchLabel);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(340); match(T__11);
				setState(341); expression(0);
				setState(342); match(T__10);
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 2);
				{
				setState(344); match(T__53);
				setState(345); match(T__10);
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
		enterRule(_localctx, 48, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348); match(T__38);
			setState(349); expression(0);
			setState(350); match(T__2);
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
		enterRule(_localctx, 50, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__48) | (1L << T__41) | (1L << T__40) | (1L << T__39) | (1L << T__38) | (1L << T__34) | (1L << T__32) | (1L << T__29) | (1L << T__28) | (1L << T__27) | (1L << T__22) | (1L << T__15) | (1L << T__6) | (1L << T__1) | (1L << T__0) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(352); forInit();
				}
			}

			setState(355); match(T__20);
			setState(357);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(356); expression(0);
				}
			}

			setState(359); match(T__20);
			setState(361);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__50) | (1L << T__39) | (1L << T__38) | (1L << T__29) | (1L << T__27) | (1L << T__6) | (1L << T__1) | (1L << Identifier) | (1L << BooleanLiteral) | (1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << StringLiteral))) != 0)) {
				{
				setState(360); forUpdate();
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
		enterRule(_localctx, 52, RULE_forInit);
		try {
			setState(365);
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
				setState(363); localVariableDeclaration();
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
				setState(364); expressionList();
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
		enterRule(_localctx, 54, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367); expressionList();
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
		enterRule(_localctx, 56, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); expression(0);
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
		enterRule(_localctx, 58, RULE_specialType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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
		enterRule(_localctx, 60, RULE_eventType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(T__15);
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
		enterRule(_localctx, 62, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 64, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); parameter();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__37) {
				{
				{
				setState(378); match(T__37);
				setState(379); parameter();
				}
				}
				setState(384);
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
		enterRule(_localctx, 66, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385); type();
			setState(386); variableDeclaratorId();
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
		enterRule(_localctx, 68, RULE_primary);
		try {
			setState(394);
			switch (_input.LA(1)) {
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(388); match(T__38);
				setState(389); expression(0);
				setState(390); match(T__2);
				}
				break;
			case T__39:
			case BooleanLiteral:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(392); literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(393); match(Identifier);
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
		enterRule(_localctx, 70, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u0191\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\5\4S\n\4"+
		"\3\4\3\4\3\4\3\4\7\4Y\n\4\f\4\16\4\\\13\4\3\4\3\4\5\4`\n\4\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6l\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6\u008b\n\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091\13\6\3\7"+
		"\3\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7\3\7\3\7\7\7\u009e\n\7\f"+
		"\7\16\7\u00a1\13\7\3\7\3\7\3\7\7\7\u00a6\n\7\f\7\16\7\u00a9\13\7\5\7\u00ab"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b5\n\b\3\t\3\t\5\t\u00b9\n"+
		"\t\3\t\3\t\3\n\3\n\3\n\7\n\u00c0\n\n\f\n\16\n\u00c3\13\n\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00ce\n\f\3\r\3\r\7\r\u00d2\n\r\f\r\16\r"+
		"\u00d5\13\r\3\r\3\r\3\16\3\16\3\16\5\16\u00dc\n\16\3\17\7\17\u00df\n\17"+
		"\f\17\16\17\u00e2\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\7"+
		"\22\u00ed\n\22\f\22\16\22\u00f0\13\22\3\23\3\23\3\23\5\23\u00f5\n\23\3"+
		"\24\3\24\3\24\7\24\u00fa\n\24\f\24\16\24\u00fd\13\24\3\25\3\25\5\25\u0101"+
		"\n\25\3\26\3\26\3\26\3\26\7\26\u0107\n\26\f\26\16\26\u010a\13\26\3\26"+
		"\5\26\u010d\n\26\5\26\u010f\n\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\5\27\u0119\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u0129\n\27\f\27\16\27\u012c\13\27\3\27\7\27"+
		"\u012f\n\27\f\27\16\27\u0132\13\27\3\27\3\27\3\27\3\27\5\27\u0138\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u014b\n\27\3\30\6\30\u014e\n\30\r\30\16\30\u014f"+
		"\3\30\6\30\u0153\n\30\r\30\16\30\u0154\3\31\3\31\3\31\3\31\3\31\3\31\5"+
		"\31\u015d\n\31\3\32\3\32\3\32\3\32\3\33\5\33\u0164\n\33\3\33\3\33\5\33"+
		"\u0168\n\33\3\33\3\33\5\33\u016c\n\33\3\34\3\34\5\34\u0170\n\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u017f\n\"\f\"\16\""+
		"\u0182\13\"\3#\3#\3#\3$\3$\3$\3$\3$\3$\5$\u018d\n$\3%\3%\3%\2\3\n&\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\13"+
		"\4\2\35\35\67\67\4\2\33\33\62\62\5\2\37\37,,\63\63\6\2\27\27\31\31\'\'"+
		"\61\61\4\2\7\7\60\60\6\2\4\5\r\r\24\25\36\36\6\2\17\17\34\34\"\"88\6\2"+
		"\b\b\20\20\26\26\30\30\4\2\21\21:=\u01a9\2J\3\2\2\2\4L\3\2\2\2\6R\3\2"+
		"\2\2\ba\3\2\2\2\nk\3\2\2\2\f\u00aa\3\2\2\2\16\u00b4\3\2\2\2\20\u00b6\3"+
		"\2\2\2\22\u00bc\3\2\2\2\24\u00c4\3\2\2\2\26\u00c8\3\2\2\2\30\u00cf\3\2"+
		"\2\2\32\u00db\3\2\2\2\34\u00e0\3\2\2\2\36\u00e3\3\2\2\2 \u00e6\3\2\2\2"+
		"\"\u00e9\3\2\2\2$\u00f1\3\2\2\2&\u00f6\3\2\2\2(\u0100\3\2\2\2*\u0102\3"+
		"\2\2\2,\u014a\3\2\2\2.\u014d\3\2\2\2\60\u015c\3\2\2\2\62\u015e\3\2\2\2"+
		"\64\u0163\3\2\2\2\66\u016f\3\2\2\28\u0171\3\2\2\2:\u0173\3\2\2\2<\u0175"+
		"\3\2\2\2>\u0177\3\2\2\2@\u0179\3\2\2\2B\u017b\3\2\2\2D\u0183\3\2\2\2F"+
		"\u018c\3\2\2\2H\u018e\3\2\2\2JK\5\6\4\2K\3\3\2\2\2LM\5\f\7\2MN\5\"\22"+
		"\2NO\7$\2\2O\5\3\2\2\2PS\5\f\7\2QS\7\13\2\2RP\3\2\2\2RQ\3\2\2\2ST\3\2"+
		"\2\2TU\79\2\2UZ\5B\"\2VW\7/\2\2WY\7\32\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[_\3\2\2\2\\Z\3\2\2\2]`\5\b\5\2^`\7$\2\2_]\3\2\2\2_^\3\2"+
		"\2\2`\7\3\2\2\2ab\5\30\r\2b\t\3\2\2\2cd\b\6\1\2de\t\2\2\2el\5\n\6\13f"+
		"g\t\3\2\2gl\5\n\6\nhl\5F$\2ij\7\6\2\2jl\5\16\b\2kc\3\2\2\2kf\3\2\2\2k"+
		"h\3\2\2\2ki\3\2\2\2l\u008f\3\2\2\2mn\f\t\2\2no\t\4\2\2o\u008e\5\n\6\n"+
		"pq\f\b\2\2qr\t\2\2\2r\u008e\5\n\6\tst\f\7\2\2tu\t\5\2\2u\u008e\5\n\6\b"+
		"vw\f\6\2\2wx\t\6\2\2x\u008e\5\n\6\7yz\f\5\2\2z{\7\f\2\2{\u008e\5\n\6\6"+
		"|}\f\4\2\2}~\7#\2\2~\u008e\5\n\6\5\177\u0080\f\3\2\2\u0080\u0081\t\7\2"+
		"\2\u0081\u008e\5\n\6\3\u0082\u0083\f\16\2\2\u0083\u0084\7/\2\2\u0084\u0085"+
		"\5\n\6\2\u0085\u0086\7\32\2\2\u0086\u008e\3\2\2\2\u0087\u0088\f\r\2\2"+
		"\u0088\u008a\7\22\2\2\u0089\u008b\5\22\n\2\u008a\u0089\3\2\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\7\66\2\2\u008dm\3\2\2\2\u008d"+
		"p\3\2\2\2\u008ds\3\2\2\2\u008dv\3\2\2\2\u008dy\3\2\2\2\u008d|\3\2\2\2"+
		"\u008d\177\3\2\2\2\u008d\u0082\3\2\2\2\u008d\u0087\3\2\2\2\u008e\u0091"+
		"\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\13\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0097\5> \2\u0093\u0094\7/\2\2\u0094\u0096\7\32\2"+
		"\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098"+
		"\3\2\2\2\u0098\u00ab\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009f\5<\37\2\u009b"+
		"\u009c\7/\2\2\u009c\u009e\7\32\2\2\u009d\u009b\3\2\2\2\u009e\u00a1\3\2"+
		"\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00ab\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a7\5@!\2\u00a3\u00a4\7/\2\2\u00a4\u00a6\7\32\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u0092\3\2\2\2\u00aa"+
		"\u009a\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\r\3\2\2\2\u00ac\u00ad\5<\37\2"+
		"\u00ad\u00ae\5\20\t\2\u00ae\u00af\5\34\17\2\u00af\u00b5\3\2\2\2\u00b0"+
		"\u00b1\5> \2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\5\30\r\2\u00b3\u00b5\3"+
		"\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5\17\3\2\2\2\u00b6"+
		"\u00b8\7\22\2\2\u00b7\u00b9\5\22\n\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3"+
		"\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\7\66\2\2\u00bb\21\3\2\2\2\u00bc"+
		"\u00c1\5\n\6\2\u00bd\u00be\7\23\2\2\u00be\u00c0\5\n\6\2\u00bf\u00bd\3"+
		"\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\23\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\22\2\2\u00c5\u00c6\5\26"+
		"\f\2\u00c6\u00c7\7\66\2\2\u00c7\25\3\2\2\2\u00c8\u00c9\5\n\6\2\u00c9\u00ca"+
		"\7\23\2\2\u00ca\u00cd\5\n\6\2\u00cb\u00cc\7\23\2\2\u00cc\u00ce\5\22\n"+
		"\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\27\3\2\2\2\u00cf\u00d3"+
		"\7\n\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3\2\2\2"+
		"\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d7\7%\2\2\u00d7\31\3\2\2\2\u00d8\u00dc\5\36\20\2\u00d9"+
		"\u00dc\5,\27\2\u00da\u00dc\5\4\3\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2"+
		"\2\2\u00db\u00da\3\2\2\2\u00dc\33\3\2\2\2\u00dd\u00df\5:\36\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\35\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e4\5 \21\2\u00e4\u00e5\7$\2\2"+
		"\u00e5\37\3\2\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\5\"\22\2\u00e8!\3\2"+
		"\2\2\u00e9\u00ee\5$\23\2\u00ea\u00eb\7\23\2\2\u00eb\u00ed\5$\23\2\u00ec"+
		"\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef#\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\5&\24\2\u00f2\u00f3"+
		"\7\r\2\2\u00f3\u00f5\5(\25\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"%\3\2\2\2\u00f6\u00fb\79\2\2\u00f7\u00f8\7/\2\2\u00f8\u00fa\7\32\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\'\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\5*\26\2\u00ff\u0101"+
		"\5\n\6\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101)\3\2\2\2\u0102"+
		"\u010e\7\n\2\2\u0103\u0108\5(\25\2\u0104\u0105\7\23\2\2\u0105\u0107\5"+
		"(\25\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010d\7\23"+
		"\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e"+
		"\u0103\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7%"+
		"\2\2\u0111+\3\2\2\2\u0112\u014b\5\30\r\2\u0113\u0114\7&\2\2\u0114\u0115"+
		"\5\62\32\2\u0115\u0118\5,\27\2\u0116\u0117\7\64\2\2\u0117\u0119\5,\27"+
		"\2\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u014b\3\2\2\2\u011a\u011b"+
		"\7\16\2\2\u011b\u011c\7\22\2\2\u011c\u011d\5\64\33\2\u011d\u011e\7\66"+
		"\2\2\u011e\u011f\5,\27\2\u011f\u014b\3\2\2\2\u0120\u0121\7\t\2\2\u0121"+
		"\u0122\5\62\32\2\u0122\u0123\5,\27\2\u0123\u014b\3\2\2\2\u0124\u0125\7"+
		"+\2\2\u0125\u0126\5\62\32\2\u0126\u012a\7\n\2\2\u0127\u0129\5.\30\2\u0128"+
		"\u0127\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2"+
		"\2\2\u012b\u0130\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\5\60\31\2\u012e"+
		"\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2"+
		"\2\2\u0131\u0133\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\7%\2\2\u0134"+
		"\u014b\3\2\2\2\u0135\u0137\7!\2\2\u0136\u0138\5\n\6\2\u0137\u0136\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u014b\7$\2\2\u013a"+
		"\u013b\7\65\2\2\u013b\u013c\5\n\6\2\u013c\u013d\7$\2\2\u013d\u014b\3\2"+
		"\2\2\u013e\u013f\7*\2\2\u013f\u0140\5\n\6\2\u0140\u0141\7$\2\2\u0141\u014b"+
		"\3\2\2\2\u0142\u0143\7(\2\2\u0143\u014b\7$\2\2\u0144\u0145\7 \2\2\u0145"+
		"\u014b\7$\2\2\u0146\u014b\7$\2\2\u0147\u0148\5:\36\2\u0148\u0149\7$\2"+
		"\2\u0149\u014b\3\2\2\2\u014a\u0112\3\2\2\2\u014a\u0113\3\2\2\2\u014a\u011a"+
		"\3\2\2\2\u014a\u0120\3\2\2\2\u014a\u0124\3\2\2\2\u014a\u0135\3\2\2\2\u014a"+
		"\u013a\3\2\2\2\u014a\u013e\3\2\2\2\u014a\u0142\3\2\2\2\u014a\u0144\3\2"+
		"\2\2\u014a\u0146\3\2\2\2\u014a\u0147\3\2\2\2\u014b-\3\2\2\2\u014c\u014e"+
		"\5\60\31\2\u014d\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2"+
		"\u014f\u0150\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u0153\5\32\16\2\u0152\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"/\3\2\2\2\u0156\u0157\7-\2\2\u0157\u0158\5\n\6\2\u0158\u0159\7.\2\2\u0159"+
		"\u015d\3\2\2\2\u015a\u015b\7\3\2\2\u015b\u015d\7.\2\2\u015c\u0156\3\2"+
		"\2\2\u015c\u015a\3\2\2\2\u015d\61\3\2\2\2\u015e\u015f\7\22\2\2\u015f\u0160"+
		"\5\n\6\2\u0160\u0161\7\66\2\2\u0161\63\3\2\2\2\u0162\u0164\5\66\34\2\u0163"+
		"\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0167\7$"+
		"\2\2\u0166\u0168\5\n\6\2\u0167\u0166\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016b\7$\2\2\u016a\u016c\58\35\2\u016b\u016a\3\2"+
		"\2\2\u016b\u016c\3\2\2\2\u016c\65\3\2\2\2\u016d\u0170\5 \21\2\u016e\u0170"+
		"\5\22\n\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\67\3\2\2\2\u0171"+
		"\u0172\5\22\n\2\u01729\3\2\2\2\u0173\u0174\5\n\6\2\u0174;\3\2\2\2\u0175"+
		"\u0176\t\b\2\2\u0176=\3\2\2\2\u0177\u0178\7)\2\2\u0178?\3\2\2\2\u0179"+
		"\u017a\t\t\2\2\u017aA\3\2\2\2\u017b\u0180\5D#\2\u017c\u017d\7\23\2\2\u017d"+
		"\u017f\5D#\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181C\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184"+
		"\5\f\7\2\u0184\u0185\5&\24\2\u0185E\3\2\2\2\u0186\u0187\7\22\2\2\u0187"+
		"\u0188\5\n\6\2\u0188\u0189\7\66\2\2\u0189\u018d\3\2\2\2\u018a\u018d\5"+
		"H%\2\u018b\u018d\79\2\2\u018c\u0186\3\2\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018dG\3\2\2\2\u018e\u018f\t\n\2\2\u018fI\3\2\2\2)RZ_k"+
		"\u008a\u008d\u008f\u0097\u009f\u00a7\u00aa\u00b4\u00b8\u00c1\u00cd\u00d3"+
		"\u00db\u00e0\u00ee\u00f4\u00fb\u0100\u0108\u010c\u010e\u0118\u012a\u0130"+
		"\u0137\u014a\u014f\u0154\u015c\u0163\u0167\u016b\u016f\u0180\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}