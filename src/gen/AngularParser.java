// Generated from C:/Users/Abd-LP/Desktop/home/ubuntu/angular_compiler/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NgIfDirective=1, NgForDirective=2, Import=3, Export=4, Abstract=5, Interface=6, 
		Extends=7, Implements=8, Console=9, Log=10, Class=11, InlineAttributeName=12, 
		BackgroundColorAttributeName=13, TextColorAttributeName=14, TypeAttributeName=15, 
		LabelAttributeName=16, ValueAttributeName=17, PlaceHolderAttributeName=18, 
		CheckedAttributeName=19, TargetAttributeName=20, OnSubmitAttributeName=21, 
		OnChangeAttributeName=22, OnClickAttributeName=23, HeadingLevelAttributeName=24, 
		DirectionAttributeName=25, DurationAttributeName=26, RepeatAttributeName=27, 
		OpenBracket=28, CloseBracket=29, OpenParen=30, CloseParen=31, OpenBrace=32, 
		CloseBrace=33, SemiColon=34, Comma=35, Assign=36, Colon=37, QuestionMark=38, 
		Dot=39, Plus=40, Minus=41, Multiply=42, At=43, Divide=44, Modulus=45, 
		Not=46, LessThan=47, GreaterThan=48, LessThanEquals=49, GreaterThanEquals=50, 
		NOT_EQUAL=51, WeakEqual=52, StrongEqual=53, And=54, Or=55, AngularExpressionStart=56, 
		AngularExpressionEnd=57, Let_Identify=58, If=59, Else=60, While=61, Break=62, 
		Void=63, Continue=64, Function=65, Return=66, From=67, Null=68, Enum=69, 
		Array=70, Any=71, TypeNumber=72, TypeString=73, TypeBoolean=74, This=75, 
		Constructor=76, Private=77, Public=78, Static=79, Protected=80, New=81, 
		NumberLiteral=82, StringLiteral=83, BooleanLiteral=84, Backtick=85, Identifier=86, 
		CssPixel=87, SingleLineComment=88, MultiLineComment=89, WS=90, Component=91, 
		Injectable=92, Pipe=93, Directive=94, Module=95, Service=96, Star=97, 
		As=98, HtmlClassAttribute=99, GapAttributeName=100;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_component = 2, RULE_decoratorArgs = 3, 
		RULE_argument = 4, RULE_exportClass = 5, RULE_class = 6, RULE_classBody = 7, 
		RULE_abstractClass = 8, RULE_interface = 9, RULE_interfaceBody = 10, RULE_accessModifier = 11, 
		RULE_variableDeclaration = 12, RULE_arrayDeclaration = 13, RULE_objectDeclataion = 14, 
		RULE_type = 15, RULE_enum = 16, RULE_enumValues = 17, RULE_enumValue = 18, 
		RULE_abstractFunctionDeclaration = 19, RULE_functionDeclaration = 20, 
		RULE_parameter = 21, RULE_function_call = 22, RULE_assignmentStatement = 23, 
		RULE_thisAssignment = 24, RULE_newInstanceAssignment = 25, RULE_nestedThisAccess = 26, 
		RULE_identifierOrPropertyAccess = 27, RULE_ifStatement = 28, RULE_whileStatement = 29, 
		RULE_elseIfStatement = 30, RULE_breakStatement = 31, RULE_continueStatement = 32, 
		RULE_block = 33, RULE_importStatement = 34, RULE_consoleLog = 35, RULE_expression = 36, 
		RULE_literalValue = 37, RULE_mapLiteral = 38, RULE_listLiteral = 39, RULE_html = 40, 
		RULE_html_content = 41, RULE_html_element = 42, RULE_html_tag_name = 43, 
		RULE_html_attributes = 44, RULE_html_attribute = 45, RULE_access_suffix = 46, 
		RULE_html_attribute_value = 47, RULE_css = 48, RULE_css_content = 49, 
		RULE_css_class_content = 50, RULE_checkedAttribute = 51, RULE_onChangeAttribute = 52, 
		RULE_onClickAttribute = 53, RULE_onSubmitAttribute = 54, RULE_gapAttribute = 55, 
		RULE_directionAttribute = 56, RULE_durationAttribute = 57, RULE_repeatAttribute = 58, 
		RULE_ngForAttribute = 59, RULE_ngIfAttribute = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "component", "decoratorArgs", "argument", "exportClass", 
			"class", "classBody", "abstractClass", "interface", "interfaceBody", 
			"accessModifier", "variableDeclaration", "arrayDeclaration", "objectDeclataion", 
			"type", "enum", "enumValues", "enumValue", "abstractFunctionDeclaration", 
			"functionDeclaration", "parameter", "function_call", "assignmentStatement", 
			"thisAssignment", "newInstanceAssignment", "nestedThisAccess", "identifierOrPropertyAccess", 
			"ifStatement", "whileStatement", "elseIfStatement", "breakStatement", 
			"continueStatement", "block", "importStatement", "consoleLog", "expression", 
			"literalValue", "mapLiteral", "listLiteral", "html", "html_content", 
			"html_element", "html_tag_name", "html_attributes", "html_attribute", 
			"access_suffix", "html_attribute_value", "css", "css_content", "css_class_content", 
			"checkedAttribute", "onChangeAttribute", "onClickAttribute", "onSubmitAttribute", 
			"gapAttribute", "directionAttribute", "durationAttribute", "repeatAttribute", 
			"ngForAttribute", "ngIfAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngIf'", "'*ngFor'", "'import'", "'export'", "'abstract'", "'interface'", 
			"'extends'", "'implements'", "'console'", "'log'", "'class'", "'inline'", 
			"'backgroundColor'", "'textColor'", "'type'", "'label'", "'value'", "'placeholder'", 
			"'chacked'", "'target'", "'submit'", "'change'", "'click'", "'level'", 
			"'direction'", "'duration'", "'repeat'", "'['", "']'", "'('", "')'", 
			"'{'", "'}'", "';'", "','", "'='", "':'", "'?'", "'.'", "'+'", "'-'", 
			"'*'", "'@'", "'/'", "'%'", "'!'", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'=='", "'==='", "'&&'", "'||'", "'{{'", "'}}'", "'let'", "'if'", "'else'", 
			"'while'", "'break'", "'void'", "'continue'", "'function'", "'return'", 
			"'from'", "'null'", "'enum'", "'Array'", "'any'", "'number'", "'string'", 
			"'boolean'", "'this'", "'constructor'", "'private'", "'public'", "'static'", 
			"'protected'", "'new'", null, null, null, "'`'", null, "'px'", null, 
			null, null, "'@Component'", "'@Injectable'", "'@Pipe'", "'@Directive'", 
			"'@NgModule'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "Import", "Export", "Abstract", 
			"Interface", "Extends", "Implements", "Console", "Log", "Class", "InlineAttributeName", 
			"BackgroundColorAttributeName", "TextColorAttributeName", "TypeAttributeName", 
			"LabelAttributeName", "ValueAttributeName", "PlaceHolderAttributeName", 
			"CheckedAttributeName", "TargetAttributeName", "OnSubmitAttributeName", 
			"OnChangeAttributeName", "OnClickAttributeName", "HeadingLevelAttributeName", 
			"DirectionAttributeName", "DurationAttributeName", "RepeatAttributeName", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "Colon", "QuestionMark", 
			"Dot", "Plus", "Minus", "Multiply", "At", "Divide", "Modulus", "Not", 
			"LessThan", "GreaterThan", "LessThanEquals", "GreaterThanEquals", "NOT_EQUAL", 
			"WeakEqual", "StrongEqual", "And", "Or", "AngularExpressionStart", "AngularExpressionEnd", 
			"Let_Identify", "If", "Else", "While", "Break", "Void", "Continue", "Function", 
			"Return", "From", "Null", "Enum", "Array", "Any", "TypeNumber", "TypeString", 
			"TypeBoolean", "This", "Constructor", "Private", "Public", "Static", 
			"Protected", "New", "NumberLiteral", "StringLiteral", "BooleanLiteral", 
			"Backtick", "Identifier", "CssPixel", "SingleLineComment", "MultiLineComment", 
			"WS", "Component", "Injectable", "Pipe", "Directive", "Module", "Service", 
			"Star", "As", "HtmlClassAttribute", "GapAttributeName"
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
	public String getGrammarFileName() { return "AngularParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AngularParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(AngularParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProgram(this);
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7782220156096219768L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8460040225L) != 0)) {
				{
				{
				setState(122);
				statement();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public AbstractClassContext abstractClass() {
			return getRuleContext(AbstractClassContext.class,0);
		}
		public InterfaceContext interface_() {
			return getRuleContext(InterfaceContext.class,0);
		}
		public EnumContext enum_() {
			return getRuleContext(EnumContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ConsoleLogContext consoleLog() {
			return getRuleContext(ConsoleLogContext.class,0);
		}
		public ObjectDeclataionContext objectDeclataion() {
			return getRuleContext(ObjectDeclataionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				exportClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				component();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				class_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				abstractClass();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				interface_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				enum_();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
				variableDeclaration();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(138);
				functionDeclaration();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				ifStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(140);
				whileStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(141);
				assignmentStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
				breakStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(143);
				continueStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(144);
				consoleLog();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(145);
				objectDeclataion();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public DecoratorArgsContext decoratorArgs() {
			return getRuleContext(DecoratorArgsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public TerminalNode Service() { return getToken(AngularParser.Service, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public TerminalNode Injectable() { return getToken(AngularParser.Injectable, 0); }
		public TerminalNode Pipe() { return getToken(AngularParser.Pipe, 0); }
		public TerminalNode Directive() { return getToken(AngularParser.Directive, 0); }
		public TerminalNode Module() { return getToken(AngularParser.Module, 0); }
		public ComponentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_component; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterComponent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitComponent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			match(OpenParen);
			setState(150);
			match(OpenBrace);
			setState(151);
			decoratorArgs();
			setState(152);
			match(CloseBrace);
			setState(153);
			match(CloseParen);
			setState(154);
			exportClass();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecoratorArgsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public DecoratorArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decoratorArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecoratorArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecoratorArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecoratorArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorArgsContext decoratorArgs() throws RecognitionException {
		DecoratorArgsContext _localctx = new DecoratorArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decoratorArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			argument();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(Comma);
					setState(158);
					argument();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(164);
				match(Comma);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(Identifier);
			setState(168);
			match(Colon);
			setState(169);
			literalValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExportClassContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ExportClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exportClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExportClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExportClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportClassContext exportClass() throws RecognitionException {
		ExportClassContext _localctx = new ExportClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exportClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(Export);
			setState(172);
			match(Class);
			setState(173);
			match(Identifier);
			setState(174);
			match(OpenBrace);
			setState(175);
			classBody();
			setState(176);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassContext class_() throws RecognitionException {
		ClassContext _localctx = new ClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(Class);
			setState(179);
			match(Identifier);
			setState(180);
			match(OpenBrace);
			setState(181);
			classBody();
			setState(182);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassBodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<ObjectDeclataionContext> objectDeclataion() {
			return getRuleContexts(ObjectDeclataionContext.class);
		}
		public ObjectDeclataionContext objectDeclataion(int i) {
			return getRuleContext(ObjectDeclataionContext.class,i);
		}
		public List<ArrayDeclarationContext> arrayDeclaration() {
			return getRuleContexts(ArrayDeclarationContext.class);
		}
		public ArrayDeclarationContext arrayDeclaration(int i) {
			return getRuleContext(ArrayDeclarationContext.class,i);
		}
		public List<AbstractFunctionDeclarationContext> abstractFunctionDeclaration() {
			return getRuleContexts(AbstractFunctionDeclarationContext.class);
		}
		public AbstractFunctionDeclarationContext abstractFunctionDeclaration(int i) {
			return getRuleContext(AbstractFunctionDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Let_Identify || ((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 1055L) != 0)) {
				{
				setState(189);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(184);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(185);
					objectDeclataion();
					}
					break;
				case 3:
					{
					setState(186);
					arrayDeclaration();
					}
					break;
				case 4:
					{
					setState(187);
					abstractFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(188);
					functionDeclaration();
					}
					break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractClassContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(AngularParser.Abstract, 0); }
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public AbstractClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAbstractClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAbstractClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAbstractClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractClassContext abstractClass() throws RecognitionException {
		AbstractClassContext _localctx = new AbstractClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Abstract);
			setState(195);
			match(Class);
			setState(196);
			match(Identifier);
			setState(197);
			match(OpenBrace);
			setState(198);
			classBody();
			setState(199);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public InterfaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interface; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterface(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterface(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterface(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(Interface);
			setState(202);
			match(Identifier);
			setState(203);
			match(OpenBrace);
			setState(204);
			interfaceBody();
			setState(205);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<AbstractFunctionDeclarationContext> abstractFunctionDeclaration() {
			return getRuleContexts(AbstractFunctionDeclarationContext.class);
		}
		public AbstractFunctionDeclarationContext abstractFunctionDeclaration(int i) {
			return getRuleContext(AbstractFunctionDeclarationContext.class,i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Let_Identify || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 527L) != 0)) {
				{
				setState(209);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Let_Identify:
				case Private:
				case Public:
				case Static:
				case Protected:
				case Identifier:
					{
					setState(207);
					variableDeclaration();
					}
					break;
				case Abstract:
					{
					setState(208);
					abstractFunctionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(213);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TerminalNode Public() { return getToken(AngularParser.Public, 0); }
		public TerminalNode Protected() { return getToken(AngularParser.Protected, 0); }
		public TerminalNode Static() { return getToken(AngularParser.Static, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 15L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Let_Identify() { return getToken(AngularParser.Let_Identify, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 15L) != 0)) {
				{
				setState(216);
				accessModifier();
				}
			}

			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let_Identify) {
				{
				setState(219);
				match(Let_Identify);
				}
			}

			setState(222);
			match(Identifier);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(223);
				match(Colon);
				setState(224);
				type();
				}
			}

			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(227);
				match(Assign);
				setState(228);
				expression(0);
				}
			}

			setState(231);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> OpenBracket() { return getTokens(AngularParser.OpenBracket); }
		public TerminalNode OpenBracket(int i) {
			return getToken(AngularParser.OpenBracket, i);
		}
		public List<TerminalNode> CloseBracket() { return getTokens(AngularParser.CloseBracket); }
		public TerminalNode CloseBracket(int i) {
			return getToken(AngularParser.CloseBracket, i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode Let_Identify() { return getToken(AngularParser.Let_Identify, 0); }
		public List<LiteralValueContext> literalValue() {
			return getRuleContexts(LiteralValueContext.class);
		}
		public LiteralValueContext literalValue(int i) {
			return getRuleContext(LiteralValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDeclaration);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(233);
					match(Let_Identify);
					}
				}

				setState(236);
				match(Identifier);
				setState(237);
				match(Colon);
				setState(238);
				type();
				setState(239);
				match(OpenBracket);
				setState(240);
				match(CloseBracket);
				setState(241);
				match(Assign);
				setState(242);
				match(OpenBracket);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 126101889078001681L) != 0)) {
					{
					setState(243);
					literalValue();
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(244);
						match(Comma);
						setState(245);
						literalValue();
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(253);
				match(CloseBracket);
				setState(254);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(Identifier);
				setState(257);
				match(Assign);
				setState(258);
				match(OpenBracket);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 126101889078001681L) != 0)) {
					{
					setState(259);
					literalValue();
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(260);
						match(Comma);
						setState(261);
						literalValue();
						}
						}
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(269);
				match(CloseBracket);
				setState(270);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclataionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<LiteralValueContext> literalValue() {
			return getRuleContexts(LiteralValueContext.class);
		}
		public LiteralValueContext literalValue(int i) {
			return getRuleContext(LiteralValueContext.class,i);
		}
		public ObjectDeclataionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclataion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterObjectDeclataion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitObjectDeclataion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDeclataion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclataionContext objectDeclataion() throws RecognitionException {
		ObjectDeclataionContext _localctx = new ObjectDeclataionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objectDeclataion);
		int _la;
		try {
			setState(327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 15L) != 0)) {
					{
					setState(273);
					accessModifier();
					}
				}

				setState(276);
				match(Identifier);
				setState(277);
				match(Colon);
				setState(278);
				match(Identifier);
				setState(279);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 15L) != 0)) {
					{
					setState(280);
					accessModifier();
					}
				}

				setState(283);
				match(Identifier);
				setState(284);
				match(Colon);
				setState(285);
				match(Identifier);
				setState(286);
				match(Assign);
				setState(287);
				match(New);
				setState(288);
				match(Identifier);
				setState(289);
				match(OpenParen);
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 414473002718068757L) != 0)) {
					{
					{
					setState(290);
					expression(0);
					setState(295);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(291);
						match(Comma);
						setState(292);
						expression(0);
						}
						}
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(302);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(303);
				match(CloseParen);
				setState(304);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 15L) != 0)) {
					{
					setState(305);
					accessModifier();
					}
				}

				setState(308);
				match(Identifier);
				setState(309);
				match(Assign);
				setState(310);
				match(OpenBrace);
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(311);
					match(Identifier);
					setState(312);
					match(Colon);
					setState(313);
					literalValue();
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(314);
						match(Comma);
						setState(315);
						match(Identifier);
						setState(316);
						match(Colon);
						setState(317);
						literalValue();
						}
						}
						setState(322);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(325);
				match(CloseBrace);
				setState(326);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TypeNumber() { return getToken(AngularParser.TypeNumber, 0); }
		public TerminalNode TypeString() { return getToken(AngularParser.TypeString, 0); }
		public TerminalNode TypeBoolean() { return getToken(AngularParser.TypeBoolean, 0); }
		public TerminalNode Array() { return getToken(AngularParser.Array, 0); }
		public TerminalNode Any() { return getToken(AngularParser.Any, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 65567L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(AngularParser.Enum, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public EnumValuesContext enumValues() {
			return getRuleContext(EnumValuesContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public EnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(Enum);
			setState(332);
			match(Identifier);
			setState(333);
			match(OpenBrace);
			setState(334);
			enumValues();
			setState(335);
			match(CloseBrace);
			setState(336);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValuesContext extends ParserRuleContext {
		public List<EnumValueContext> enumValue() {
			return getRuleContexts(EnumValueContext.class);
		}
		public EnumValueContext enumValue(int i) {
			return getRuleContext(EnumValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public EnumValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValues; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumValues(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValuesContext enumValues() throws RecognitionException {
		EnumValuesContext _localctx = new EnumValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumValues);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			enumValue();
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					match(Comma);
					setState(340);
					enumValue();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(346);
				match(Comma);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EnumValueContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public EnumValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(Identifier);
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(350);
				match(Assign);
				setState(351);
				literalValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AbstractFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(AngularParser.Abstract, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public AbstractFunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractFunctionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAbstractFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAbstractFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAbstractFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractFunctionDeclarationContext abstractFunctionDeclaration() throws RecognitionException {
		AbstractFunctionDeclarationContext _localctx = new AbstractFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(Abstract);
			setState(355);
			match(Identifier);
			setState(356);
			match(OpenParen);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(357);
				parameter();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(358);
					match(Comma);
					setState(359);
					parameter();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(367);
			match(CloseParen);
			{
			setState(368);
			match(Colon);
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
			case Identifier:
				{
				setState(369);
				type();
				}
				break;
			case Void:
				{
				setState(370);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(373);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Constructor() { return getToken(AngularParser.Constructor, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			setState(429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375);
				_la = _input.LA(1);
				if ( !(_la==Constructor || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(376);
				match(OpenParen);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(377);
					parameter();
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(378);
						match(Comma);
						setState(379);
						parameter();
						}
						}
						setState(384);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(387);
				match(CloseParen);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(388);
					match(Colon);
					setState(391);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Array:
					case Any:
					case TypeNumber:
					case TypeString:
					case TypeBoolean:
					case Identifier:
						{
						setState(389);
						type();
						}
						break;
					case Void:
						{
						setState(390);
						match(Void);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(395);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==Constructor || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(397);
				match(OpenParen);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(398);
					parameter();
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(399);
						match(Comma);
						setState(400);
						parameter();
						}
						}
						setState(405);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(408);
				match(CloseParen);
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(409);
					match(Colon);
					setState(412);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Array:
					case Any:
					case TypeNumber:
					case TypeString:
					case TypeBoolean:
					case Identifier:
						{
						setState(410);
						type();
						}
						break;
					case Void:
						{
						setState(411);
						match(Void);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(426);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7782220156096219768L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8460040229L) != 0)) {
					{
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7782220156096219768L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8460040225L) != 0)) {
						{
						{
						setState(416);
						statement();
						}
						}
						setState(421);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(422);
					match(Return);
					setState(423);
					expression(0);
					setState(424);
					match(SemiColon);
					}
				}

				setState(428);
				match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(Identifier);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(432);
				match(Colon);
				setState(433);
				type();
				}
			}

			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(436);
				match(Assign);
				setState(437);
				literalValue();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(Identifier);
			setState(441);
			match(OpenParen);
			setState(450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 414473002718068757L) != 0)) {
				{
				setState(442);
				expression(0);
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(443);
					match(Comma);
					setState(444);
					expression(0);
					}
					}
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(452);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public NestedThisAccessContext nestedThisAccess() {
			return getRuleContext(NestedThisAccessContext.class,0);
		}
		public IdentifierOrPropertyAccessContext identifierOrPropertyAccess() {
			return getRuleContext(IdentifierOrPropertyAccessContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(454);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(455);
				nestedThisAccess();
				}
				break;
			case 3:
				{
				setState(456);
				identifierOrPropertyAccess();
				}
				break;
			}
			setState(459);
			match(Assign);
			setState(460);
			expression(0);
			setState(461);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisAssignmentContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public NewInstanceAssignmentContext newInstanceAssignment() {
			return getRuleContext(NewInstanceAssignmentContext.class,0);
		}
		public NestedThisAccessContext nestedThisAccess() {
			return getRuleContext(NestedThisAccessContext.class,0);
		}
		public IdentifierOrPropertyAccessContext identifierOrPropertyAccess() {
			return getRuleContext(IdentifierOrPropertyAccessContext.class,0);
		}
		public ThisAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisAssignmentContext thisAssignment() throws RecognitionException {
		ThisAssignmentContext _localctx = new ThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thisAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(This);
			setState(464);
			match(Dot);
			setState(465);
			match(Identifier);
			setState(466);
			match(Assign);
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				setState(467);
				newInstanceAssignment();
				}
				break;
			case This:
				{
				setState(468);
				nestedThisAccess();
				}
				break;
			case Identifier:
				{
				setState(469);
				identifierOrPropertyAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(472);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NewInstanceAssignmentContext extends ParserRuleContext {
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public NewInstanceAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newInstanceAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNewInstanceAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNewInstanceAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNewInstanceAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewInstanceAssignmentContext newInstanceAssignment() throws RecognitionException {
		NewInstanceAssignmentContext _localctx = new NewInstanceAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newInstanceAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(New);
			setState(475);
			match(Identifier);
			setState(476);
			match(OpenParen);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 414473002718068757L) != 0)) {
				{
				setState(477);
				expression(0);
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(478);
					match(Comma);
					setState(479);
					expression(0);
					}
					}
					setState(484);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(487);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NestedThisAccessContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public NestedThisAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedThisAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNestedThisAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNestedThisAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNestedThisAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedThisAccessContext nestedThisAccess() throws RecognitionException {
		NestedThisAccessContext _localctx = new NestedThisAccessContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nestedThisAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(This);
			setState(495); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(490);
				match(Dot);
				setState(493);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(491);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(492);
					function_call();
					}
					break;
				}
				}
				}
				setState(497); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Dot );
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierOrPropertyAccessContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public IdentifierOrPropertyAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrPropertyAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierOrPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierOrPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierOrPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrPropertyAccessContext identifierOrPropertyAccess() throws RecognitionException {
		IdentifierOrPropertyAccessContext _localctx = new IdentifierOrPropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifierOrPropertyAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(Identifier);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(500);
				match(Dot);
				setState(501);
				match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(If);
			setState(505);
			match(OpenParen);
			setState(506);
			expression(0);
			setState(507);
			match(CloseParen);
			setState(508);
			block();
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(509);
					elseIfStatement();
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(515);
				match(Else);
				setState(516);
				block();
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(AngularParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(While);
			setState(520);
			match(OpenParen);
			setState(521);
			expression(0);
			setState(522);
			match(CloseParen);
			setState(523);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(AngularParser.Else, 0); }
		public TerminalNode If() { return getToken(AngularParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(Else);
			setState(526);
			match(If);
			setState(527);
			match(OpenParen);
			setState(528);
			expression(0);
			setState(529);
			match(CloseParen);
			setState(530);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(AngularParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(Break);
			setState(533);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(AngularParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(Continue);
			setState(536);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(OpenBrace);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7782220156096219768L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8460040225L) != 0)) {
				{
				{
				setState(539);
				statement();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode Star() { return getToken(AngularParser.Star, 0); }
		public TerminalNode As() { return getToken(AngularParser.As, 0); }
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterImportStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitImportStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitImportStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importStatement);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(Import);
				setState(548);
				match(OpenBrace);
				setState(549);
				match(Identifier);
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(550);
					match(Comma);
					setState(551);
					match(Identifier);
					}
					}
					setState(556);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(557);
				match(CloseBrace);
				setState(558);
				match(From);
				setState(559);
				match(StringLiteral);
				setState(560);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				match(Import);
				setState(562);
				match(Identifier);
				setState(563);
				match(From);
				setState(564);
				match(StringLiteral);
				setState(565);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(566);
				match(Import);
				setState(567);
				match(Star);
				setState(568);
				match(As);
				setState(569);
				match(Identifier);
				setState(570);
				match(From);
				setState(571);
				match(StringLiteral);
				setState(572);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConsoleLogContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(AngularParser.Console, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Log() { return getToken(AngularParser.Log, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ConsoleLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterConsoleLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitConsoleLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsoleLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(Console);
			setState(576);
			match(Dot);
			setState(577);
			match(Log);
			setState(578);
			match(OpenParen);
			setState(579);
			expression(0);
			setState(580);
			match(CloseParen);
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(581);
				match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(AngularParser.Modulus, 0); }
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(AngularParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(AngularParser.GreaterThanEquals, 0); }
		public TerminalNode WeakEqual() { return getToken(AngularParser.WeakEqual, 0); }
		public TerminalNode StrongEqual() { return getToken(AngularParser.StrongEqual, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 72;
		enterRecursionRule(_localctx, 72, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(585);
				match(OpenParen);
				setState(586);
				expression(0);
				setState(587);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(589);
				match(Identifier);
				setState(590);
				match(OpenBracket);
				setState(591);
				expression(0);
				setState(592);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				setState(594);
				match(Identifier);
				setState(595);
				match(Dot);
				setState(596);
				match(Identifier);
				}
				break;
			case 4:
				{
				setState(597);
				function_call();
				}
				break;
			case 5:
				{
				setState(598);
				literalValue();
				}
				break;
			case 6:
				{
				setState(599);
				match(Identifier);
				}
				break;
			case 7:
				{
				setState(600);
				match(This);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(620);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(618);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(603);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(604);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 60473139527680L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(605);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(606);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(607);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2111062325329920L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(608);
						expression(12);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(609);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(610);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15762598695796736L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(611);
						expression(11);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(612);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(613);
						match(And);
						setState(614);
						expression(10);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(615);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(616);
						match(Or);
						setState(617);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(622);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ParserRuleContext {
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(AngularParser.BooleanLiteral, 0); }
		public ListLiteralContext listLiteral() {
			return getRuleContext(ListLiteralContext.class,0);
		}
		public MapLiteralContext mapLiteral() {
			return getRuleContext(MapLiteralContext.class,0);
		}
		public TerminalNode Null() { return getToken(AngularParser.Null, 0); }
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literalValue);
		try {
			setState(629);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumberLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(NumberLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(624);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(625);
				match(BooleanLiteral);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(626);
				listLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(627);
				mapLiteral();
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 6);
				{
				setState(628);
				match(Null);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MapLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public List<LiteralValueContext> literalValue() {
			return getRuleContexts(LiteralValueContext.class);
		}
		public LiteralValueContext literalValue(int i) {
			return getRuleContext(LiteralValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public MapLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMapLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMapLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(OpenBrace);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(632);
				match(Identifier);
				setState(633);
				match(Colon);
				setState(634);
				literalValue();
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(635);
					match(Comma);
					{
					setState(636);
					match(Identifier);
					setState(637);
					match(Colon);
					setState(638);
					literalValue();
					}
					setState(641);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						setState(640);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(650);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<LiteralValueContext> literalValue() {
			return getRuleContexts(LiteralValueContext.class);
		}
		public LiteralValueContext literalValue(int i) {
			return getRuleContext(LiteralValueContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public ListLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterListLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitListLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitListLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			match(OpenBracket);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 126101889078001681L) != 0)) {
				{
				setState(653);
				literalValue();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(654);
					match(Comma);
					setState(655);
					literalValue();
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(663);
			match(CloseBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContext extends ParserRuleContext {
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			match(Backtick);
			setState(666);
			html_content();
			setState(667);
			match(Backtick);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_contentContext extends ParserRuleContext {
		public List<TerminalNode> AngularExpressionStart() { return getTokens(AngularParser.AngularExpressionStart); }
		public TerminalNode AngularExpressionStart(int i) {
			return getToken(AngularParser.AngularExpressionStart, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> AngularExpressionEnd() { return getTokens(AngularParser.AngularExpressionEnd); }
		public TerminalNode AngularExpressionEnd(int i) {
			return getToken(AngularParser.AngularExpressionEnd, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<Html_elementContext> html_element() {
			return getRuleContexts(Html_elementContext.class);
		}
		public Html_elementContext html_element(int i) {
			return getRuleContext(Html_elementContext.class,i);
		}
		public List<TerminalNode> NumberLiteral() { return getTokens(AngularParser.NumberLiteral); }
		public TerminalNode NumberLiteral(int i) {
			return getToken(AngularParser.NumberLiteral, i);
		}
		public Html_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_html_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(691); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(691);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(670); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(669);
								html_element();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(672); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case AngularExpressionStart:
						{
						setState(674);
						match(AngularExpressionStart);
						setState(675);
						expression(0);
						setState(676);
						match(AngularExpressionEnd);
						}
						break;
					case NumberLiteral:
					case Identifier:
						{
						setState(681);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NumberLiteral) {
							{
							{
							setState(678);
							match(NumberLiteral);
							}
							}
							setState(683);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(684);
						match(Identifier);
						setState(688);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(685);
								match(NumberLiteral);
								}
								} 
							}
							setState(690);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(693); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_elementContext extends ParserRuleContext {
		public List<TerminalNode> LessThan() { return getTokens(AngularParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(AngularParser.LessThan, i);
		}
		public List<Html_tag_nameContext> html_tag_name() {
			return getRuleContexts(Html_tag_nameContext.class);
		}
		public Html_tag_nameContext html_tag_name(int i) {
			return getRuleContext(Html_tag_nameContext.class,i);
		}
		public List<TerminalNode> GreaterThan() { return getTokens(AngularParser.GreaterThan); }
		public TerminalNode GreaterThan(int i) {
			return getToken(AngularParser.GreaterThan, i);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public Html_attributesContext html_attributes() {
			return getRuleContext(Html_attributesContext.class,0);
		}
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_html_element);
		try {
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(LessThan);
				setState(696);
				html_tag_name();
				setState(698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(697);
					html_attributes();
					}
					break;
				}
				setState(700);
				match(GreaterThan);
				setState(702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(701);
					html_content();
					}
					break;
				}
				setState(704);
				match(LessThan);
				setState(705);
				match(Divide);
				setState(706);
				html_tag_name();
				setState(707);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(LessThan);
				setState(710);
				html_tag_name();
				setState(712);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(711);
					html_attributes();
					}
					break;
				}
				setState(714);
				match(GreaterThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				match(LessThan);
				setState(717);
				html_tag_name();
				setState(718);
				html_attributes();
				setState(719);
				match(Divide);
				setState(720);
				match(GreaterThan);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_tag_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public Html_tag_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_tag_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml_tag_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml_tag_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_tag_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_tag_nameContext html_tag_name() throws RecognitionException {
		Html_tag_nameContext _localctx = new Html_tag_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_html_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(Identifier);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_attributesContext extends ParserRuleContext {
		public List<Html_attributeContext> html_attribute() {
			return getRuleContexts(Html_attributeContext.class);
		}
		public Html_attributeContext html_attribute(int i) {
			return getRuleContext(Html_attributeContext.class,i);
		}
		public Html_attributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml_attributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml_attributes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_attributes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attributesContext html_attributes() throws RecognitionException {
		Html_attributesContext _localctx = new Html_attributesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_html_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4399388688390L) != 0) || _la==Identifier || _la==HtmlClassAttribute) {
				{
				{
				setState(726);
				html_attribute();
				}
				}
				setState(731);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_attributeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public NgIfAttributeContext ngIfAttribute() {
			return getRuleContext(NgIfAttributeContext.class,0);
		}
		public NgForAttributeContext ngForAttribute() {
			return getRuleContext(NgForAttributeContext.class,0);
		}
		public OnChangeAttributeContext onChangeAttribute() {
			return getRuleContext(OnChangeAttributeContext.class,0);
		}
		public OnClickAttributeContext onClickAttribute() {
			return getRuleContext(OnClickAttributeContext.class,0);
		}
		public TerminalNode HtmlClassAttribute() { return getToken(AngularParser.HtmlClassAttribute, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public Html_attribute_valueContext html_attribute_value() {
			return getRuleContext(Html_attribute_valueContext.class,0);
		}
		public List<Access_suffixContext> access_suffix() {
			return getRuleContexts(Access_suffixContext.class);
		}
		public Access_suffixContext access_suffix(int i) {
			return getRuleContext(Access_suffixContext.class,i);
		}
		public Html_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml_attribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attributeContext html_attribute() throws RecognitionException {
		Html_attributeContext _localctx = new Html_attributeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_html_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(732);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(733);
				ngIfAttribute();
				}
				break;
			case 3:
				{
				setState(734);
				ngForAttribute();
				}
				break;
			case 4:
				{
				setState(735);
				onChangeAttribute();
				}
				break;
			case 5:
				{
				setState(736);
				onClickAttribute();
				}
				break;
			case 6:
				{
				setState(737);
				match(HtmlClassAttribute);
				}
				break;
			case 7:
				{
				setState(738);
				match(OpenBracket);
				setState(747);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(739);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(740);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==HtmlClassAttribute) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(741);
						access_suffix();
						}
						}
						setState(746);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(749);
				match(CloseBracket);
				}
				break;
			case 8:
				{
				setState(750);
				match(OpenParen);
				setState(751);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==HtmlClassAttribute) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(752);
				match(CloseParen);
				}
				break;
			case 9:
				{
				setState(753);
				match(Multiply);
				}
				break;
			}
			setState(758);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(756);
				match(Assign);
				setState(757);
				html_attribute_value();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Access_suffixContext extends ParserRuleContext {
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Access_suffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_suffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAccess_suffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAccess_suffix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAccess_suffix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Access_suffixContext access_suffix() throws RecognitionException {
		Access_suffixContext _localctx = new Access_suffixContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_access_suffix);
		try {
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				match(Dot);
				setState(761);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(762);
				match(OpenBracket);
				setState(763);
				expression(0);
				setState(764);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(766);
				match(Dot);
				setState(767);
				function_call();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Html_attribute_valueContext extends ParserRuleContext {
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Html_attribute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_attribute_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterHtml_attribute_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitHtml_attribute_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_attribute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attribute_valueContext html_attribute_value() throws RecognitionException {
		Html_attribute_valueContext _localctx = new Html_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_html_attribute_value);
		try {
			setState(772);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(770);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(771);
				expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CssContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<Css_contentContext> css_content() {
			return getRuleContexts(Css_contentContext.class);
		}
		public Css_contentContext css_content(int i) {
			return getRuleContext(Css_contentContext.class,i);
		}
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(OpenBracket);
			setState(775);
			match(Backtick);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(776);
				css_content();
				}
				}
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(782);
			match(Backtick);
			setState(783);
			match(CloseBracket);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Css_contentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public List<Css_class_contentContext> css_class_content() {
			return getRuleContexts(Css_class_contentContext.class);
		}
		public Css_class_contentContext css_class_content(int i) {
			return getRuleContext(Css_class_contentContext.class,i);
		}
		public Css_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCss_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCss_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_contentContext css_content() throws RecognitionException {
		Css_contentContext _localctx = new Css_contentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_css_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(785);
				match(Dot);
				}
			}

			setState(788);
			match(Identifier);
			setState(793);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(789);
				match(Colon);
				setState(790);
				match(Identifier);
				}
				}
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(796);
			match(OpenBrace);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(797);
				css_class_content();
				}
				}
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(803);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Css_class_contentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<TerminalNode> NumberLiteral() { return getTokens(AngularParser.NumberLiteral); }
		public TerminalNode NumberLiteral(int i) {
			return getToken(AngularParser.NumberLiteral, i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<TerminalNode> CssPixel() { return getTokens(AngularParser.CssPixel); }
		public TerminalNode CssPixel(int i) {
			return getToken(AngularParser.CssPixel, i);
		}
		public List<TerminalNode> Modulus() { return getTokens(AngularParser.Modulus); }
		public TerminalNode Modulus(int i) {
			return getToken(AngularParser.Modulus, i);
		}
		public Css_class_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css_class_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCss_class_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCss_class_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss_class_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Css_class_contentContext css_class_content() throws RecognitionException {
		Css_class_contentContext _localctx = new Css_class_contentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_css_class_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(Identifier);
			setState(806);
			match(Colon);
			setState(813); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(813);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
				case 1:
					{
					setState(807);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(808);
					match(NumberLiteral);
					setState(810);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(809);
						_la = _input.LA(1);
						if ( !(_la==Modulus || _la==CssPixel) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
					}

					}
					break;
				case 3:
					{
					setState(812);
					function_call();
					}
					break;
				}
				}
				setState(815); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(817);
				match(Comma);
				setState(824); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(824);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
					case 1:
						{
						setState(818);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(819);
						match(NumberLiteral);
						setState(821);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(820);
							_la = _input.LA(1);
							if ( !(_la==Modulus || _la==CssPixel) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
						}

						}
						break;
					case 3:
						{
						setState(823);
						function_call();
						}
						break;
					}
					}
					setState(826); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CheckedAttributeContext extends ParserRuleContext {
		public TerminalNode CheckedAttributeName() { return getToken(AngularParser.CheckedAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public CheckedAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkedAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterCheckedAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitCheckedAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCheckedAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckedAttributeContext checkedAttribute() throws RecognitionException {
		CheckedAttributeContext _localctx = new CheckedAttributeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_checkedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			match(CheckedAttributeName);
			setState(836);
			match(Assign);
			setState(837);
			match(OpenBrace);
			setState(838);
			expression(0);
			setState(839);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnChangeAttributeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode OnChangeAttributeName() { return getToken(AngularParser.OnChangeAttributeName, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public OnChangeAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onChangeAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOnChangeAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOnChangeAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOnChangeAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnChangeAttributeContext onChangeAttribute() throws RecognitionException {
		OnChangeAttributeContext _localctx = new OnChangeAttributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_onChangeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(OpenParen);
			setState(842);
			match(OnChangeAttributeName);
			setState(843);
			match(CloseParen);
			setState(844);
			match(Assign);
			setState(845);
			match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnClickAttributeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode OnClickAttributeName() { return getToken(AngularParser.OnClickAttributeName, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public OnClickAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClickAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOnClickAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOnClickAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOnClickAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickAttributeContext onClickAttribute() throws RecognitionException {
		OnClickAttributeContext _localctx = new OnClickAttributeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_onClickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(OpenParen);
			setState(848);
			match(OnClickAttributeName);
			setState(849);
			match(CloseParen);
			setState(850);
			match(Assign);
			setState(851);
			match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OnSubmitAttributeContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode OnSubmitAttributeName() { return getToken(AngularParser.OnSubmitAttributeName, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public OnSubmitAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onSubmitAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterOnSubmitAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitOnSubmitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitOnSubmitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnSubmitAttributeContext onSubmitAttribute() throws RecognitionException {
		OnSubmitAttributeContext _localctx = new OnSubmitAttributeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_onSubmitAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
			match(OpenParen);
			setState(854);
			match(OnSubmitAttributeName);
			setState(855);
			match(CloseParen);
			setState(856);
			match(Assign);
			setState(857);
			match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class GapAttributeContext extends ParserRuleContext {
		public TerminalNode GapAttributeName() { return getToken(AngularParser.GapAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public GapAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gapAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGapAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGapAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGapAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GapAttributeContext gapAttribute() throws RecognitionException {
		GapAttributeContext _localctx = new GapAttributeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_gapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(GapAttributeName);
			setState(860);
			match(Assign);
			setState(861);
			match(OpenBrace);
			setState(862);
			expression(0);
			setState(863);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectionAttributeContext extends ParserRuleContext {
		public TerminalNode DirectionAttributeName() { return getToken(AngularParser.DirectionAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public DirectionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDirectionAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDirectionAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDirectionAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionAttributeContext directionAttribute() throws RecognitionException {
		DirectionAttributeContext _localctx = new DirectionAttributeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_directionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			match(DirectionAttributeName);
			setState(866);
			match(Assign);
			setState(867);
			match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DurationAttributeContext extends ParserRuleContext {
		public TerminalNode DurationAttributeName() { return getToken(AngularParser.DurationAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public DurationAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDurationAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDurationAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDurationAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DurationAttributeContext durationAttribute() throws RecognitionException {
		DurationAttributeContext _localctx = new DurationAttributeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_durationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(869);
			match(DurationAttributeName);
			setState(870);
			match(Assign);
			setState(871);
			match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeatAttributeContext extends ParserRuleContext {
		public TerminalNode RepeatAttributeName() { return getToken(AngularParser.RepeatAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public RepeatAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRepeatAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRepeatAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRepeatAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatAttributeContext repeatAttribute() throws RecognitionException {
		RepeatAttributeContext _localctx = new RepeatAttributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_repeatAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(873);
			match(RepeatAttributeName);
			setState(874);
			match(Assign);
			setState(875);
			_la = _input.LA(1);
			if ( !(_la==NumberLiteral || _la==StringLiteral) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgForAttributeContext extends ParserRuleContext {
		public TerminalNode NgForDirective() { return getToken(AngularParser.NgForDirective, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgForAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngForAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgForAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgForAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgForAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgForAttributeContext ngForAttribute() throws RecognitionException {
		NgForAttributeContext _localctx = new NgForAttributeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ngForAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(NgForDirective);
			setState(878);
			match(Assign);
			setState(879);
			expression(0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NgIfAttributeContext extends ParserRuleContext {
		public TerminalNode NgIfDirective() { return getToken(AngularParser.NgIfDirective, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NgIfAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngIfAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgIfAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgIfAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgIfAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NgIfAttributeContext ngIfAttribute() throws RecognitionException {
		NgIfAttributeContext _localctx = new NgIfAttributeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ngIfAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			match(NgIfDirective);
			setState(882);
			match(Assign);
			setState(883);
			expression(0);
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
		case 36:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001d\u0376\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000\u007f\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0093\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u00a0\b\u0003\n\u0003\f\u0003\u00a3\t\u0003\u0001"+
		"\u0003\u0003\u0003\u00a6\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007\u00be\b\u0007\n\u0007\f\u0007\u00c1\t\u0007\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00d2\b\n\n\n\f\n\u00d5"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u00da\b\f\u0001\f\u0003\f"+
		"\u00dd\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e2\b\f\u0001\f\u0001\f\u0003"+
		"\f\u00e6\b\f\u0001\f\u0001\f\u0001\r\u0003\r\u00eb\b\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u00f7\b\r\n\r\f\r\u00fa\t\r\u0003\r\u00fc\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0107\b\r\n"+
		"\r\f\r\u010a\t\r\u0003\r\u010c\b\r\u0001\r\u0001\r\u0003\r\u0110\b\r\u0001"+
		"\u000e\u0003\u000e\u0113\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u011a\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0126\b\u000e\n\u000e\f\u000e\u0129\t\u000e"+
		"\u0005\u000e\u012b\b\u000e\n\u000e\f\u000e\u012e\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0133\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u013f\b\u000e\n\u000e\f\u000e\u0142\t\u000e"+
		"\u0003\u000e\u0144\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0148\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0156\b\u0011\n\u0011\f\u0011\u0159\t\u0011\u0001\u0011"+
		"\u0003\u0011\u015c\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0161\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0169\b\u0013\n\u0013\f\u0013\u016c\t\u0013\u0003"+
		"\u0013\u016e\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0174\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u017d\b\u0014\n\u0014\f\u0014"+
		"\u0180\t\u0014\u0003\u0014\u0182\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0188\b\u0014\u0003\u0014\u018a\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u0192\b\u0014\n\u0014\f\u0014\u0195\t\u0014\u0003\u0014\u0197"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u019d"+
		"\b\u0014\u0003\u0014\u019f\b\u0014\u0001\u0014\u0005\u0014\u01a2\b\u0014"+
		"\n\u0014\f\u0014\u01a5\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01ab\b\u0014\u0001\u0014\u0003\u0014\u01ae\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01b3\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01b7\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01be\b\u0016\n\u0016\f\u0016\u01c1"+
		"\t\u0016\u0003\u0016\u01c3\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01ca\b\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d7\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u01e1\b\u0019\n\u0019\f\u0019\u01e4\t\u0019\u0003"+
		"\u0019\u01e6\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01ee\b\u001a\u0004\u001a\u01f0\b\u001a"+
		"\u000b\u001a\f\u001a\u01f1\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u01f7\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u01ff\b\u001c\n\u001c\f\u001c\u0202\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0206\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0005!\u021d\b!"+
		"\n!\f!\u0220\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0005\"\u0229\b\"\n\"\f\"\u022c\t\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u023e\b\"\u0001#\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0003#\u0247\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0003$\u025a\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u026b"+
		"\b$\n$\f$\u026e\t$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0276"+
		"\b%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0003&\u0282\b&\u0005&\u0284\b&\n&\f&\u0287\t&\u0003&\u0289\b&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0005\'\u0291\b\'\n\'\f\'\u0294"+
		"\t\'\u0003\'\u0296\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001"+
		")\u0004)\u029f\b)\u000b)\f)\u02a0\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u02a8\b)\n)\f)\u02ab\t)\u0001)\u0001)\u0005)\u02af\b)\n)\f)\u02b2\t"+
		")\u0004)\u02b4\b)\u000b)\f)\u02b5\u0001*\u0001*\u0001*\u0003*\u02bb\b"+
		"*\u0001*\u0001*\u0003*\u02bf\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u02c9\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u02d3\b*\u0001+\u0001+\u0001,\u0005,\u02d8\b,\n"+
		",\f,\u02db\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-"+
		"\u0001-\u0001-\u0005-\u02e7\b-\n-\f-\u02ea\t-\u0003-\u02ec\b-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0003-\u02f3\b-\u0001-\u0001-\u0003-\u02f7\b-\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u0301\b.\u0001"+
		"/\u0001/\u0003/\u0305\b/\u00010\u00010\u00010\u00050\u030a\b0\n0\f0\u030d"+
		"\t0\u00010\u00010\u00010\u00011\u00031\u0313\b1\u00011\u00011\u00011\u0005"+
		"1\u0318\b1\n1\f1\u031b\t1\u00011\u00011\u00051\u031f\b1\n1\f1\u0322\t"+
		"1\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u00032\u032b\b2\u0001"+
		"2\u00042\u032e\b2\u000b2\f2\u032f\u00012\u00012\u00012\u00012\u00032\u0336"+
		"\b2\u00012\u00042\u0339\b2\u000b2\f2\u033a\u00052\u033d\b2\n2\f2\u0340"+
		"\t2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0000\u0001H=\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\n\u0001\u0000[`\u0001\u0000MP\u0002\u0000"+
		"FJVV\u0002\u0000LLVV\u0002\u0000(*,-\u0001\u0000/2\u0001\u000035\u0002"+
		"\u0000VVcc\u0002\u0000--WW\u0001\u0000RS\u03c5\u0000}\u0001\u0000\u0000"+
		"\u0000\u0002\u0092\u0001\u0000\u0000\u0000\u0004\u0094\u0001\u0000\u0000"+
		"\u0000\u0006\u009c\u0001\u0000\u0000\u0000\b\u00a7\u0001\u0000\u0000\u0000"+
		"\n\u00ab\u0001\u0000\u0000\u0000\f\u00b2\u0001\u0000\u0000\u0000\u000e"+
		"\u00bf\u0001\u0000\u0000\u0000\u0010\u00c2\u0001\u0000\u0000\u0000\u0012"+
		"\u00c9\u0001\u0000\u0000\u0000\u0014\u00d3\u0001\u0000\u0000\u0000\u0016"+
		"\u00d6\u0001\u0000\u0000\u0000\u0018\u00d9\u0001\u0000\u0000\u0000\u001a"+
		"\u010f\u0001\u0000\u0000\u0000\u001c\u0147\u0001\u0000\u0000\u0000\u001e"+
		"\u0149\u0001\u0000\u0000\u0000 \u014b\u0001\u0000\u0000\u0000\"\u0152"+
		"\u0001\u0000\u0000\u0000$\u015d\u0001\u0000\u0000\u0000&\u0162\u0001\u0000"+
		"\u0000\u0000(\u01ad\u0001\u0000\u0000\u0000*\u01af\u0001\u0000\u0000\u0000"+
		",\u01b8\u0001\u0000\u0000\u0000.\u01c9\u0001\u0000\u0000\u00000\u01cf"+
		"\u0001\u0000\u0000\u00002\u01da\u0001\u0000\u0000\u00004\u01e9\u0001\u0000"+
		"\u0000\u00006\u01f3\u0001\u0000\u0000\u00008\u01f8\u0001\u0000\u0000\u0000"+
		":\u0207\u0001\u0000\u0000\u0000<\u020d\u0001\u0000\u0000\u0000>\u0214"+
		"\u0001\u0000\u0000\u0000@\u0217\u0001\u0000\u0000\u0000B\u021a\u0001\u0000"+
		"\u0000\u0000D\u023d\u0001\u0000\u0000\u0000F\u023f\u0001\u0000\u0000\u0000"+
		"H\u0259\u0001\u0000\u0000\u0000J\u0275\u0001\u0000\u0000\u0000L\u0277"+
		"\u0001\u0000\u0000\u0000N\u028c\u0001\u0000\u0000\u0000P\u0299\u0001\u0000"+
		"\u0000\u0000R\u02b3\u0001\u0000\u0000\u0000T\u02d2\u0001\u0000\u0000\u0000"+
		"V\u02d4\u0001\u0000\u0000\u0000X\u02d9\u0001\u0000\u0000\u0000Z\u02f2"+
		"\u0001\u0000\u0000\u0000\\\u0300\u0001\u0000\u0000\u0000^\u0304\u0001"+
		"\u0000\u0000\u0000`\u0306\u0001\u0000\u0000\u0000b\u0312\u0001\u0000\u0000"+
		"\u0000d\u0325\u0001\u0000\u0000\u0000f\u0343\u0001\u0000\u0000\u0000h"+
		"\u0349\u0001\u0000\u0000\u0000j\u034f\u0001\u0000\u0000\u0000l\u0355\u0001"+
		"\u0000\u0000\u0000n\u035b\u0001\u0000\u0000\u0000p\u0361\u0001\u0000\u0000"+
		"\u0000r\u0365\u0001\u0000\u0000\u0000t\u0369\u0001\u0000\u0000\u0000v"+
		"\u036d\u0001\u0000\u0000\u0000x\u0371\u0001\u0000\u0000\u0000z|\u0003"+
		"\u0002\u0001\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001\u0000\u0000"+
		"\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0000"+
		"\u0000\u0001\u0081\u0001\u0001\u0000\u0000\u0000\u0082\u0093\u0003D\""+
		"\u0000\u0083\u0093\u0003\n\u0005\u0000\u0084\u0093\u0003\u0004\u0002\u0000"+
		"\u0085\u0093\u0003\f\u0006\u0000\u0086\u0093\u0003\u0010\b\u0000\u0087"+
		"\u0093\u0003\u0012\t\u0000\u0088\u0093\u0003 \u0010\u0000\u0089\u0093"+
		"\u0003\u0018\f\u0000\u008a\u0093\u0003(\u0014\u0000\u008b\u0093\u0003"+
		"8\u001c\u0000\u008c\u0093\u0003:\u001d\u0000\u008d\u0093\u0003.\u0017"+
		"\u0000\u008e\u0093\u0003>\u001f\u0000\u008f\u0093\u0003@ \u0000\u0090"+
		"\u0093\u0003F#\u0000\u0091\u0093\u0003\u001c\u000e\u0000\u0092\u0082\u0001"+
		"\u0000\u0000\u0000\u0092\u0083\u0001\u0000\u0000\u0000\u0092\u0084\u0001"+
		"\u0000\u0000\u0000\u0092\u0085\u0001\u0000\u0000\u0000\u0092\u0086\u0001"+
		"\u0000\u0000\u0000\u0092\u0087\u0001\u0000\u0000\u0000\u0092\u0088\u0001"+
		"\u0000\u0000\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0092\u008a\u0001"+
		"\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092\u008c\u0001"+
		"\u0000\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001"+
		"\u0000\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001"+
		"\u0000\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0003\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u0000\u0000\u0000\u0095\u0096\u0005"+
		"\u001e\u0000\u0000\u0096\u0097\u0005 \u0000\u0000\u0097\u0098\u0003\u0006"+
		"\u0003\u0000\u0098\u0099\u0005!\u0000\u0000\u0099\u009a\u0005\u001f\u0000"+
		"\u0000\u009a\u009b\u0003\n\u0005\u0000\u009b\u0005\u0001\u0000\u0000\u0000"+
		"\u009c\u00a1\u0003\b\u0004\u0000\u009d\u009e\u0005#\u0000\u0000\u009e"+
		"\u00a0\u0003\b\u0004\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a3"+
		"\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a6\u0005#\u0000\u0000\u00a5\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u0007\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005V\u0000\u0000\u00a8\u00a9\u0005%\u0000"+
		"\u0000\u00a9\u00aa\u0003J%\u0000\u00aa\t\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\u0004\u0000\u0000\u00ac\u00ad\u0005\u000b\u0000\u0000\u00ad"+
		"\u00ae\u0005V\u0000\u0000\u00ae\u00af\u0005 \u0000\u0000\u00af\u00b0\u0003"+
		"\u000e\u0007\u0000\u00b0\u00b1\u0005!\u0000\u0000\u00b1\u000b\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b3\u0005\u000b\u0000\u0000\u00b3\u00b4\u0005V\u0000"+
		"\u0000\u00b4\u00b5\u0005 \u0000\u0000\u00b5\u00b6\u0003\u000e\u0007\u0000"+
		"\u00b6\u00b7\u0005!\u0000\u0000\u00b7\r\u0001\u0000\u0000\u0000\u00b8"+
		"\u00be\u0003\u0018\f\u0000\u00b9\u00be\u0003\u001c\u000e\u0000\u00ba\u00be"+
		"\u0003\u001a\r\u0000\u00bb\u00be\u0003&\u0013\u0000\u00bc\u00be\u0003"+
		"(\u0014\u0000\u00bd\u00b8\u0001\u0000\u0000\u0000\u00bd\u00b9\u0001\u0000"+
		"\u0000\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000"+
		"\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000"+
		"\u0000\u0000\u00c0\u000f\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c2\u00c3\u0005\u0005\u0000\u0000\u00c3\u00c4\u0005\u000b"+
		"\u0000\u0000\u00c4\u00c5\u0005V\u0000\u0000\u00c5\u00c6\u0005 \u0000\u0000"+
		"\u00c6\u00c7\u0003\u000e\u0007\u0000\u00c7\u00c8\u0005!\u0000\u0000\u00c8"+
		"\u0011\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005\u0006\u0000\u0000\u00ca"+
		"\u00cb\u0005V\u0000\u0000\u00cb\u00cc\u0005 \u0000\u0000\u00cc\u00cd\u0003"+
		"\u0014\n\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u0013\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d2\u0003\u0018\f\u0000\u00d0\u00d2\u0003&\u0013"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u0015\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0007\u0001\u0000"+
		"\u0000\u00d7\u0017\u0001\u0000\u0000\u0000\u00d8\u00da\u0003\u0016\u000b"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000"+
		"\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db\u00dd\u0005:\u0000\u0000"+
		"\u00dc\u00db\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000"+
		"\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e1\u0005V\u0000\u0000\u00df"+
		"\u00e0\u0005%\u0000\u0000\u00e0\u00e2\u0003\u001e\u000f\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005$\u0000\u0000\u00e4\u00e6\u0003"+
		"H$\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\"\u0000\u0000"+
		"\u00e8\u0019\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005:\u0000\u0000\u00ea"+
		"\u00e9\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ec\u0001\u0000\u0000\u0000\u00ec\u00ed\u0005V\u0000\u0000\u00ed\u00ee"+
		"\u0005%\u0000\u0000\u00ee\u00ef\u0003\u001e\u000f\u0000\u00ef\u00f0\u0005"+
		"\u001c\u0000\u0000\u00f0\u00f1\u0005\u001d\u0000\u0000\u00f1\u00f2\u0005"+
		"$\u0000\u0000\u00f2\u00fb\u0005\u001c\u0000\u0000\u00f3\u00f8\u0003J%"+
		"\u0000\u00f4\u00f5\u0005#\u0000\u0000\u00f5\u00f7\u0003J%\u0000\u00f6"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb"+
		"\u00f3\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u001d\u0000\u0000\u00fe"+
		"\u00ff\u0005\"\u0000\u0000\u00ff\u0110\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0005V\u0000\u0000\u0101\u0102\u0005$\u0000\u0000\u0102\u010b\u0005\u001c"+
		"\u0000\u0000\u0103\u0108\u0003J%\u0000\u0104\u0105\u0005#\u0000\u0000"+
		"\u0105\u0107\u0003J%\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108"+
		"\u0001\u0000\u0000\u0000\u010b\u0103\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0005\u001d\u0000\u0000\u010e\u0110\u0005\"\u0000\u0000\u010f\u00ea\u0001"+
		"\u0000\u0000\u0000\u010f\u0100\u0001\u0000\u0000\u0000\u0110\u001b\u0001"+
		"\u0000\u0000\u0000\u0111\u0113\u0003\u0016\u000b\u0000\u0112\u0111\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0001"+
		"\u0000\u0000\u0000\u0114\u0115\u0005V\u0000\u0000\u0115\u0116\u0005%\u0000"+
		"\u0000\u0116\u0117\u0005V\u0000\u0000\u0117\u0148\u0005\"\u0000\u0000"+
		"\u0118\u011a\u0003\u0016\u000b\u0000\u0119\u0118\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0005V\u0000\u0000\u011c\u011d\u0005%\u0000\u0000\u011d\u011e"+
		"\u0005V\u0000\u0000\u011e\u011f\u0005$\u0000\u0000\u011f\u0120\u0005Q"+
		"\u0000\u0000\u0120\u0121\u0005V\u0000\u0000\u0121\u012c\u0005\u001e\u0000"+
		"\u0000\u0122\u0127\u0003H$\u0000\u0123\u0124\u0005#\u0000\u0000\u0124"+
		"\u0126\u0003H$\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001"+
		"\u0000\u0000\u0000\u012a\u0122\u0001\u0000\u0000\u0000\u012b\u012e\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012d\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0001\u0000\u0000\u0000\u012e\u012c\u0001"+
		"\u0000\u0000\u0000\u012f\u0130\u0005\u001f\u0000\u0000\u0130\u0148\u0005"+
		"\"\u0000\u0000\u0131\u0133\u0003\u0016\u000b\u0000\u0132\u0131\u0001\u0000"+
		"\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000"+
		"\u0000\u0000\u0134\u0135\u0005V\u0000\u0000\u0135\u0136\u0005$\u0000\u0000"+
		"\u0136\u0143\u0005 \u0000\u0000\u0137\u0138\u0005V\u0000\u0000\u0138\u0139"+
		"\u0005%\u0000\u0000\u0139\u0140\u0003J%\u0000\u013a\u013b\u0005#\u0000"+
		"\u0000\u013b\u013c\u0005V\u0000\u0000\u013c\u013d\u0005%\u0000\u0000\u013d"+
		"\u013f\u0003J%\u0000\u013e\u013a\u0001\u0000\u0000\u0000\u013f\u0142\u0001"+
		"\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0140\u0141\u0001"+
		"\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001"+
		"\u0000\u0000\u0000\u0143\u0137\u0001\u0000\u0000\u0000\u0143\u0144\u0001"+
		"\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145\u0146\u0005"+
		"!\u0000\u0000\u0146\u0148\u0005\"\u0000\u0000\u0147\u0112\u0001\u0000"+
		"\u0000\u0000\u0147\u0119\u0001\u0000\u0000\u0000\u0147\u0132\u0001\u0000"+
		"\u0000\u0000\u0148\u001d\u0001\u0000\u0000\u0000\u0149\u014a\u0007\u0002"+
		"\u0000\u0000\u014a\u001f\u0001\u0000\u0000\u0000\u014b\u014c\u0005E\u0000"+
		"\u0000\u014c\u014d\u0005V\u0000\u0000\u014d\u014e\u0005 \u0000\u0000\u014e"+
		"\u014f\u0003\"\u0011\u0000\u014f\u0150\u0005!\u0000\u0000\u0150\u0151"+
		"\u0005\"\u0000\u0000\u0151!\u0001\u0000\u0000\u0000\u0152\u0157\u0003"+
		"$\u0012\u0000\u0153\u0154\u0005#\u0000\u0000\u0154\u0156\u0003$\u0012"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000"+
		"\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000"+
		"\u0000\u0158\u015b\u0001\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000"+
		"\u0000\u015a\u015c\u0005#\u0000\u0000\u015b\u015a\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c#\u0001\u0000\u0000\u0000\u015d"+
		"\u0160\u0005V\u0000\u0000\u015e\u015f\u0005$\u0000\u0000\u015f\u0161\u0003"+
		"J%\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000"+
		"\u0000\u0161%\u0001\u0000\u0000\u0000\u0162\u0163\u0005\u0005\u0000\u0000"+
		"\u0163\u0164\u0005V\u0000\u0000\u0164\u016d\u0005\u001e\u0000\u0000\u0165"+
		"\u016a\u0003*\u0015\u0000\u0166\u0167\u0005#\u0000\u0000\u0167\u0169\u0003"+
		"*\u0015\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0169\u016c\u0001\u0000"+
		"\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016a\u016b\u0001\u0000"+
		"\u0000\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000"+
		"\u0000\u0000\u016d\u0165\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u001f"+
		"\u0000\u0000\u0170\u0173\u0005%\u0000\u0000\u0171\u0174\u0003\u001e\u000f"+
		"\u0000\u0172\u0174\u0005?\u0000\u0000\u0173\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000"+
		"\u0175\u0176\u0005\"\u0000\u0000\u0176\'\u0001\u0000\u0000\u0000\u0177"+
		"\u0178\u0007\u0003\u0000\u0000\u0178\u0181\u0005\u001e\u0000\u0000\u0179"+
		"\u017e\u0003*\u0015\u0000\u017a\u017b\u0005#\u0000\u0000\u017b\u017d\u0003"+
		"*\u0015\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017d\u0180\u0001\u0000"+
		"\u0000\u0000\u017e\u017c\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0182\u0001\u0000\u0000\u0000\u0180\u017e\u0001\u0000"+
		"\u0000\u0000\u0181\u0179\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000"+
		"\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0189\u0005\u001f"+
		"\u0000\u0000\u0184\u0187\u0005%\u0000\u0000\u0185\u0188\u0003\u001e\u000f"+
		"\u0000\u0186\u0188\u0005?\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000"+
		"\u0189\u0184\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000"+
		"\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u01ae\u0003B!\u0000\u018c\u018d"+
		"\u0007\u0003\u0000\u0000\u018d\u0196\u0005\u001e\u0000\u0000\u018e\u0193"+
		"\u0003*\u0015\u0000\u018f\u0190\u0005#\u0000\u0000\u0190\u0192\u0003*"+
		"\u0015\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000"+
		"\u0000\u0000\u0193\u0191\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000"+
		"\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000"+
		"\u0000\u0000\u0196\u018e\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000"+
		"\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019e\u0005\u001f"+
		"\u0000\u0000\u0199\u019c\u0005%\u0000\u0000\u019a\u019d\u0003\u001e\u000f"+
		"\u0000\u019b\u019d\u0005?\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000"+
		"\u019e\u0199\u0001\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000"+
		"\u019f\u01aa\u0001\u0000\u0000\u0000\u01a0\u01a2\u0003\u0002\u0001\u0000"+
		"\u01a1\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a7\u0005B\u0000\u0000\u01a7\u01a8\u0003H$\u0000\u01a8\u01a9"+
		"\u0005\"\u0000\u0000\u01a9\u01ab\u0001\u0000\u0000\u0000\u01aa\u01a3\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u0001"+
		"\u0000\u0000\u0000\u01ac\u01ae\u0005!\u0000\u0000\u01ad\u0177\u0001\u0000"+
		"\u0000\u0000\u01ad\u018c\u0001\u0000\u0000\u0000\u01ae)\u0001\u0000\u0000"+
		"\u0000\u01af\u01b2\u0005V\u0000\u0000\u01b0\u01b1\u0005%\u0000\u0000\u01b1"+
		"\u01b3\u0003\u001e\u000f\u0000\u01b2\u01b0\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b6\u0001\u0000\u0000\u0000\u01b4"+
		"\u01b5\u0005$\u0000\u0000\u01b5\u01b7\u0003J%\u0000\u01b6\u01b4\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7+\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0005V\u0000\u0000\u01b9\u01c2\u0005\u001e\u0000"+
		"\u0000\u01ba\u01bf\u0003H$\u0000\u01bb\u01bc\u0005#\u0000\u0000\u01bc"+
		"\u01be\u0003H$\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01c1\u0001"+
		"\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001"+
		"\u0000\u0000\u0000\u01c2\u01ba\u0001\u0000\u0000\u0000\u01c2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0005"+
		"\u001f\u0000\u0000\u01c5-\u0001\u0000\u0000\u0000\u01c6\u01ca\u0005V\u0000"+
		"\u0000\u01c7\u01ca\u00034\u001a\u0000\u01c8\u01ca\u00036\u001b\u0000\u01c9"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\u0005$\u0000\u0000\u01cc\u01cd\u0003H$\u0000\u01cd\u01ce\u0005"+
		"\"\u0000\u0000\u01ce/\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005K\u0000"+
		"\u0000\u01d0\u01d1\u0005\'\u0000\u0000\u01d1\u01d2\u0005V\u0000\u0000"+
		"\u01d2\u01d6\u0005$\u0000\u0000\u01d3\u01d7\u00032\u0019\u0000\u01d4\u01d7"+
		"\u00034\u001a\u0000\u01d5\u01d7\u00036\u001b\u0000\u01d6\u01d3\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005\"\u0000"+
		"\u0000\u01d91\u0001\u0000\u0000\u0000\u01da\u01db\u0005Q\u0000\u0000\u01db"+
		"\u01dc\u0005V\u0000\u0000\u01dc\u01e5\u0005\u001e\u0000\u0000\u01dd\u01e2"+
		"\u0003H$\u0000\u01de\u01df\u0005#\u0000\u0000\u01df\u01e1\u0003H$\u0000"+
		"\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e6\u0001\u0000\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e5\u01dd\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005\u001f\u0000\u0000"+
		"\u01e83\u0001\u0000\u0000\u0000\u01e9\u01ef\u0005K\u0000\u0000\u01ea\u01ed"+
		"\u0005\'\u0000\u0000\u01eb\u01ee\u0005V\u0000\u0000\u01ec\u01ee\u0003"+
		",\u0016\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ed\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ee\u01f0\u0001\u0000\u0000\u0000\u01ef\u01ea\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000"+
		"\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f25\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f6\u0005V\u0000\u0000\u01f4\u01f5\u0005\'\u0000\u0000"+
		"\u01f5\u01f7\u0005V\u0000\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6"+
		"\u01f7\u0001\u0000\u0000\u0000\u01f77\u0001\u0000\u0000\u0000\u01f8\u01f9"+
		"\u0005;\u0000\u0000\u01f9\u01fa\u0005\u001e\u0000\u0000\u01fa\u01fb\u0003"+
		"H$\u0000\u01fb\u01fc\u0005\u001f\u0000\u0000\u01fc\u0200\u0003B!\u0000"+
		"\u01fd\u01ff\u0003<\u001e\u0000\u01fe\u01fd\u0001\u0000\u0000\u0000\u01ff"+
		"\u0202\u0001\u0000\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200"+
		"\u0201\u0001\u0000\u0000\u0000\u0201\u0205\u0001\u0000\u0000\u0000\u0202"+
		"\u0200\u0001\u0000\u0000\u0000\u0203\u0204\u0005<\u0000\u0000\u0204\u0206"+
		"\u0003B!\u0000\u0205\u0203\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000"+
		"\u0000\u0000\u02069\u0001\u0000\u0000\u0000\u0207\u0208\u0005=\u0000\u0000"+
		"\u0208\u0209\u0005\u001e\u0000\u0000\u0209\u020a\u0003H$\u0000\u020a\u020b"+
		"\u0005\u001f\u0000\u0000\u020b\u020c\u0003B!\u0000\u020c;\u0001\u0000"+
		"\u0000\u0000\u020d\u020e\u0005<\u0000\u0000\u020e\u020f\u0005;\u0000\u0000"+
		"\u020f\u0210\u0005\u001e\u0000\u0000\u0210\u0211\u0003H$\u0000\u0211\u0212"+
		"\u0005\u001f\u0000\u0000\u0212\u0213\u0003B!\u0000\u0213=\u0001\u0000"+
		"\u0000\u0000\u0214\u0215\u0005>\u0000\u0000\u0215\u0216\u0005\"\u0000"+
		"\u0000\u0216?\u0001\u0000\u0000\u0000\u0217\u0218\u0005@\u0000\u0000\u0218"+
		"\u0219\u0005\"\u0000\u0000\u0219A\u0001\u0000\u0000\u0000\u021a\u021e"+
		"\u0005 \u0000\u0000\u021b\u021d\u0003\u0002\u0001\u0000\u021c\u021b\u0001"+
		"\u0000\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u0221\u0001"+
		"\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0005"+
		"!\u0000\u0000\u0222C\u0001\u0000\u0000\u0000\u0223\u0224\u0005\u0003\u0000"+
		"\u0000\u0224\u0225\u0005 \u0000\u0000\u0225\u022a\u0005V\u0000\u0000\u0226"+
		"\u0227\u0005#\u0000\u0000\u0227\u0229\u0005V\u0000\u0000\u0228\u0226\u0001"+
		"\u0000\u0000\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u0228\u0001"+
		"\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000\u0000\u022b\u022d\u0001"+
		"\u0000\u0000\u0000\u022c\u022a\u0001\u0000\u0000\u0000\u022d\u022e\u0005"+
		"!\u0000\u0000\u022e\u022f\u0005C\u0000\u0000\u022f\u0230\u0005S\u0000"+
		"\u0000\u0230\u023e\u0005\"\u0000\u0000\u0231\u0232\u0005\u0003\u0000\u0000"+
		"\u0232\u0233\u0005V\u0000\u0000\u0233\u0234\u0005C\u0000\u0000\u0234\u0235"+
		"\u0005S\u0000\u0000\u0235\u023e\u0005\"\u0000\u0000\u0236\u0237\u0005"+
		"\u0003\u0000\u0000\u0237\u0238\u0005a\u0000\u0000\u0238\u0239\u0005b\u0000"+
		"\u0000\u0239\u023a\u0005V\u0000\u0000\u023a\u023b\u0005C\u0000\u0000\u023b"+
		"\u023c\u0005S\u0000\u0000\u023c\u023e\u0005\"\u0000\u0000\u023d\u0223"+
		"\u0001\u0000\u0000\u0000\u023d\u0231\u0001\u0000\u0000\u0000\u023d\u0236"+
		"\u0001\u0000\u0000\u0000\u023eE\u0001\u0000\u0000\u0000\u023f\u0240\u0005"+
		"\t\u0000\u0000\u0240\u0241\u0005\'\u0000\u0000\u0241\u0242\u0005\n\u0000"+
		"\u0000\u0242\u0243\u0005\u001e\u0000\u0000\u0243\u0244\u0003H$\u0000\u0244"+
		"\u0246\u0005\u001f\u0000\u0000\u0245\u0247\u0005\"\u0000\u0000\u0246\u0245"+
		"\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000\u0000\u0000\u0247G\u0001"+
		"\u0000\u0000\u0000\u0248\u0249\u0006$\uffff\uffff\u0000\u0249\u024a\u0005"+
		"\u001e\u0000\u0000\u024a\u024b\u0003H$\u0000\u024b\u024c\u0005\u001f\u0000"+
		"\u0000\u024c\u025a\u0001\u0000\u0000\u0000\u024d\u024e\u0005V\u0000\u0000"+
		"\u024e\u024f\u0005\u001c\u0000\u0000\u024f\u0250\u0003H$\u0000\u0250\u0251"+
		"\u0005\u001d\u0000\u0000\u0251\u025a\u0001\u0000\u0000\u0000\u0252\u0253"+
		"\u0005V\u0000\u0000\u0253\u0254\u0005\'\u0000\u0000\u0254\u025a\u0005"+
		"V\u0000\u0000\u0255\u025a\u0003,\u0016\u0000\u0256\u025a\u0003J%\u0000"+
		"\u0257\u025a\u0005V\u0000\u0000\u0258\u025a\u0005K\u0000\u0000\u0259\u0248"+
		"\u0001\u0000\u0000\u0000\u0259\u024d\u0001\u0000\u0000\u0000\u0259\u0252"+
		"\u0001\u0000\u0000\u0000\u0259\u0255\u0001\u0000\u0000\u0000\u0259\u0256"+
		"\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000\u0000\u0259\u0258"+
		"\u0001\u0000\u0000\u0000\u025a\u026c\u0001\u0000\u0000\u0000\u025b\u025c"+
		"\n\f\u0000\u0000\u025c\u025d\u0007\u0004\u0000\u0000\u025d\u026b\u0003"+
		"H$\r\u025e\u025f\n\u000b\u0000\u0000\u025f\u0260\u0007\u0005\u0000\u0000"+
		"\u0260\u026b\u0003H$\f\u0261\u0262\n\n\u0000\u0000\u0262\u0263\u0007\u0006"+
		"\u0000\u0000\u0263\u026b\u0003H$\u000b\u0264\u0265\n\t\u0000\u0000\u0265"+
		"\u0266\u00056\u0000\u0000\u0266\u026b\u0003H$\n\u0267\u0268\n\b\u0000"+
		"\u0000\u0268\u0269\u00057\u0000\u0000\u0269\u026b\u0003H$\t\u026a\u025b"+
		"\u0001\u0000\u0000\u0000\u026a\u025e\u0001\u0000\u0000\u0000\u026a\u0261"+
		"\u0001\u0000\u0000\u0000\u026a\u0264\u0001\u0000\u0000\u0000\u026a\u0267"+
		"\u0001\u0000\u0000\u0000\u026b\u026e\u0001\u0000\u0000\u0000\u026c\u026a"+
		"\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026dI\u0001"+
		"\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0276\u0005"+
		"R\u0000\u0000\u0270\u0276\u0005S\u0000\u0000\u0271\u0276\u0005T\u0000"+
		"\u0000\u0272\u0276\u0003N\'\u0000\u0273\u0276\u0003L&\u0000\u0274\u0276"+
		"\u0005D\u0000\u0000\u0275\u026f\u0001\u0000\u0000\u0000\u0275\u0270\u0001"+
		"\u0000\u0000\u0000\u0275\u0271\u0001\u0000\u0000\u0000\u0275\u0272\u0001"+
		"\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000\u0275\u0274\u0001"+
		"\u0000\u0000\u0000\u0276K\u0001\u0000\u0000\u0000\u0277\u0288\u0005 \u0000"+
		"\u0000\u0278\u0279\u0005V\u0000\u0000\u0279\u027a\u0005%\u0000\u0000\u027a"+
		"\u0285\u0003J%\u0000\u027b\u027c\u0005#\u0000\u0000\u027c\u027d\u0005"+
		"V\u0000\u0000\u027d\u027e\u0005%\u0000\u0000\u027e\u027f\u0003J%\u0000"+
		"\u027f\u0281\u0001\u0000\u0000\u0000\u0280\u0282\u0005#\u0000\u0000\u0281"+
		"\u0280\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282"+
		"\u0284\u0001\u0000\u0000\u0000\u0283\u027b\u0001\u0000\u0000\u0000\u0284"+
		"\u0287\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285"+
		"\u0286\u0001\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287"+
		"\u0285\u0001\u0000\u0000\u0000\u0288\u0278\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a"+
		"\u028b\u0005!\u0000\u0000\u028bM\u0001\u0000\u0000\u0000\u028c\u0295\u0005"+
		"\u001c\u0000\u0000\u028d\u0292\u0003J%\u0000\u028e\u028f\u0005#\u0000"+
		"\u0000\u028f\u0291\u0003J%\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291"+
		"\u0294\u0001\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292"+
		"\u0293\u0001\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294"+
		"\u0292\u0001\u0000\u0000\u0000\u0295\u028d\u0001\u0000\u0000\u0000\u0295"+
		"\u0296\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000\u0000\u0297"+
		"\u0298\u0005\u001d\u0000\u0000\u0298O\u0001\u0000\u0000\u0000\u0299\u029a"+
		"\u0005U\u0000\u0000\u029a\u029b\u0003R)\u0000\u029b\u029c\u0005U\u0000"+
		"\u0000\u029cQ\u0001\u0000\u0000\u0000\u029d\u029f\u0003T*\u0000\u029e"+
		"\u029d\u0001\u0000\u0000\u0000\u029f\u02a0\u0001\u0000\u0000\u0000\u02a0"+
		"\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1"+
		"\u02b4\u0001\u0000\u0000\u0000\u02a2\u02a3\u00058\u0000\u0000\u02a3\u02a4"+
		"\u0003H$\u0000\u02a4\u02a5\u00059\u0000\u0000\u02a5\u02b4\u0001\u0000"+
		"\u0000\u0000\u02a6\u02a8\u0005R\u0000\u0000\u02a7\u02a6\u0001\u0000\u0000"+
		"\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000"+
		"\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000\u0000"+
		"\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02b0\u0005V\u0000\u0000"+
		"\u02ad\u02af\u0005R\u0000\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b0\u0001\u0000\u0000\u0000\u02b3\u029e\u0001\u0000\u0000\u0000\u02b3"+
		"\u02a2\u0001\u0000\u0000\u0000\u02b3\u02a9\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b6\u0001\u0000\u0000\u0000\u02b6S\u0001\u0000\u0000\u0000\u02b7\u02b8"+
		"\u0005/\u0000\u0000\u02b8\u02ba\u0003V+\u0000\u02b9\u02bb\u0003X,\u0000"+
		"\u02ba\u02b9\u0001\u0000\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02be\u00050\u0000\u0000\u02bd"+
		"\u02bf\u0003R)\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001"+
		"\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000\u02c0\u02c1\u0005"+
		"/\u0000\u0000\u02c1\u02c2\u0005,\u0000\u0000\u02c2\u02c3\u0003V+\u0000"+
		"\u02c3\u02c4\u00050\u0000\u0000\u02c4\u02d3\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0005/\u0000\u0000\u02c6\u02c8\u0003V+\u0000\u02c7\u02c9\u0003"+
		"X,\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001\u0000\u0000"+
		"\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02cb\u00050\u0000\u0000"+
		"\u02cb\u02d3\u0001\u0000\u0000\u0000\u02cc\u02cd\u0005/\u0000\u0000\u02cd"+
		"\u02ce\u0003V+\u0000\u02ce\u02cf\u0003X,\u0000\u02cf\u02d0\u0005,\u0000"+
		"\u0000\u02d0\u02d1\u00050\u0000\u0000\u02d1\u02d3\u0001\u0000\u0000\u0000"+
		"\u02d2\u02b7\u0001\u0000\u0000\u0000\u02d2\u02c5\u0001\u0000\u0000\u0000"+
		"\u02d2\u02cc\u0001\u0000\u0000\u0000\u02d3U\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d5\u0005V\u0000\u0000\u02d5W\u0001\u0000\u0000\u0000\u02d6\u02d8\u0003"+
		"Z-\u0000\u02d7\u02d6\u0001\u0000\u0000\u0000\u02d8\u02db\u0001\u0000\u0000"+
		"\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000"+
		"\u0000\u02daY\u0001\u0000\u0000\u0000\u02db\u02d9\u0001\u0000\u0000\u0000"+
		"\u02dc\u02f3\u0005V\u0000\u0000\u02dd\u02f3\u0003x<\u0000\u02de\u02f3"+
		"\u0003v;\u0000\u02df\u02f3\u0003h4\u0000\u02e0\u02f3\u0003j5\u0000\u02e1"+
		"\u02f3\u0005c\u0000\u0000\u02e2\u02eb\u0005\u001c\u0000\u0000\u02e3\u02ec"+
		"\u0005V\u0000\u0000\u02e4\u02e8\u0007\u0007\u0000\u0000\u02e5\u02e7\u0003"+
		"\\.\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000"+
		"\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000"+
		"\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000"+
		"\u0000\u0000\u02eb\u02e3\u0001\u0000\u0000\u0000\u02eb\u02e4\u0001\u0000"+
		"\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed\u02f3\u0005\u001d"+
		"\u0000\u0000\u02ee\u02ef\u0005\u001e\u0000\u0000\u02ef\u02f0\u0007\u0007"+
		"\u0000\u0000\u02f0\u02f3\u0005\u001f\u0000\u0000\u02f1\u02f3\u0005*\u0000"+
		"\u0000\u02f2\u02dc\u0001\u0000\u0000\u0000\u02f2\u02dd\u0001\u0000\u0000"+
		"\u0000\u02f2\u02de\u0001\u0000\u0000\u0000\u02f2\u02df\u0001\u0000\u0000"+
		"\u0000\u02f2\u02e0\u0001\u0000\u0000\u0000\u02f2\u02e1\u0001\u0000\u0000"+
		"\u0000\u02f2\u02e2\u0001\u0000\u0000\u0000\u02f2\u02ee\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f6\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0005$\u0000\u0000\u02f5\u02f7\u0003^/\u0000\u02f6"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f6\u02f7\u0001\u0000\u0000\u0000\u02f7"+
		"[\u0001\u0000\u0000\u0000\u02f8\u02f9\u0005\'\u0000\u0000\u02f9\u0301"+
		"\u0005V\u0000\u0000\u02fa\u02fb\u0005\u001c\u0000\u0000\u02fb\u02fc\u0003"+
		"H$\u0000\u02fc\u02fd\u0005\u001d\u0000\u0000\u02fd\u0301\u0001\u0000\u0000"+
		"\u0000\u02fe\u02ff\u0005\'\u0000\u0000\u02ff\u0301\u0003,\u0016\u0000"+
		"\u0300\u02f8\u0001\u0000\u0000\u0000\u0300\u02fa\u0001\u0000\u0000\u0000"+
		"\u0300\u02fe\u0001\u0000\u0000\u0000\u0301]\u0001\u0000\u0000\u0000\u0302"+
		"\u0305\u0003J%\u0000\u0303\u0305\u0003H$\u0000\u0304\u0302\u0001\u0000"+
		"\u0000\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305_\u0001\u0000\u0000"+
		"\u0000\u0306\u0307\u0005\u001c\u0000\u0000\u0307\u030b\u0005U\u0000\u0000"+
		"\u0308\u030a\u0003b1\u0000\u0309\u0308\u0001\u0000\u0000\u0000\u030a\u030d"+
		"\u0001\u0000\u0000\u0000\u030b\u0309\u0001\u0000\u0000\u0000\u030b\u030c"+
		"\u0001\u0000\u0000\u0000\u030c\u030e\u0001\u0000\u0000\u0000\u030d\u030b"+
		"\u0001\u0000\u0000\u0000\u030e\u030f\u0005U\u0000\u0000\u030f\u0310\u0005"+
		"\u001d\u0000\u0000\u0310a\u0001\u0000\u0000\u0000\u0311\u0313\u0005\'"+
		"\u0000\u0000\u0312\u0311\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000"+
		"\u0000\u0000\u0313\u0314\u0001\u0000\u0000\u0000\u0314\u0319\u0005V\u0000"+
		"\u0000\u0315\u0316\u0005%\u0000\u0000\u0316\u0318\u0005V\u0000\u0000\u0317"+
		"\u0315\u0001\u0000\u0000\u0000\u0318\u031b\u0001\u0000\u0000\u0000\u0319"+
		"\u0317\u0001\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a"+
		"\u031c\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031c"+
		"\u0320\u0005 \u0000\u0000\u031d\u031f\u0003d2\u0000\u031e\u031d\u0001"+
		"\u0000\u0000\u0000\u031f\u0322\u0001\u0000\u0000\u0000\u0320\u031e\u0001"+
		"\u0000\u0000\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0323\u0001"+
		"\u0000\u0000\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0323\u0324\u0005"+
		"!\u0000\u0000\u0324c\u0001\u0000\u0000\u0000\u0325\u0326\u0005V\u0000"+
		"\u0000\u0326\u032d\u0005%\u0000\u0000\u0327\u032e\u0005V\u0000\u0000\u0328"+
		"\u032a\u0005R\u0000\u0000\u0329\u032b\u0007\b\u0000\u0000\u032a\u0329"+
		"\u0001\u0000\u0000\u0000\u032a\u032b\u0001\u0000\u0000\u0000\u032b\u032e"+
		"\u0001\u0000\u0000\u0000\u032c\u032e\u0003,\u0016\u0000\u032d\u0327\u0001"+
		"\u0000\u0000\u0000\u032d\u0328\u0001\u0000\u0000\u0000\u032d\u032c\u0001"+
		"\u0000\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u032d\u0001"+
		"\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u033e\u0001"+
		"\u0000\u0000\u0000\u0331\u0338\u0005#\u0000\u0000\u0332\u0339\u0005V\u0000"+
		"\u0000\u0333\u0335\u0005R\u0000\u0000\u0334\u0336\u0007\b\u0000\u0000"+
		"\u0335\u0334\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000\u0000"+
		"\u0336\u0339\u0001\u0000\u0000\u0000\u0337\u0339\u0003,\u0016\u0000\u0338"+
		"\u0332\u0001\u0000\u0000\u0000\u0338\u0333\u0001\u0000\u0000\u0000\u0338"+
		"\u0337\u0001\u0000\u0000\u0000\u0339\u033a\u0001\u0000\u0000\u0000\u033a"+
		"\u0338\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b"+
		"\u033d\u0001\u0000\u0000\u0000\u033c\u0331\u0001\u0000\u0000\u0000\u033d"+
		"\u0340\u0001\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033e"+
		"\u033f\u0001\u0000\u0000\u0000\u033f\u0341\u0001\u0000\u0000\u0000\u0340"+
		"\u033e\u0001\u0000\u0000\u0000\u0341\u0342\u0005\"\u0000\u0000\u0342e"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0005\u0013\u0000\u0000\u0344\u0345"+
		"\u0005$\u0000\u0000\u0345\u0346\u0005 \u0000\u0000\u0346\u0347\u0003H"+
		"$\u0000\u0347\u0348\u0005!\u0000\u0000\u0348g\u0001\u0000\u0000\u0000"+
		"\u0349\u034a\u0005\u001e\u0000\u0000\u034a\u034b\u0005\u0016\u0000\u0000"+
		"\u034b\u034c\u0005\u001f\u0000\u0000\u034c\u034d\u0005$\u0000\u0000\u034d"+
		"\u034e\u0005S\u0000\u0000\u034ei\u0001\u0000\u0000\u0000\u034f\u0350\u0005"+
		"\u001e\u0000\u0000\u0350\u0351\u0005\u0017\u0000\u0000\u0351\u0352\u0005"+
		"\u001f\u0000\u0000\u0352\u0353\u0005$\u0000\u0000\u0353\u0354\u0005S\u0000"+
		"\u0000\u0354k\u0001\u0000\u0000\u0000\u0355\u0356\u0005\u001e\u0000\u0000"+
		"\u0356\u0357\u0005\u0015\u0000\u0000\u0357\u0358\u0005\u001f\u0000\u0000"+
		"\u0358\u0359\u0005$\u0000\u0000\u0359\u035a\u0005S\u0000\u0000\u035am"+
		"\u0001\u0000\u0000\u0000\u035b\u035c\u0005d\u0000\u0000\u035c\u035d\u0005"+
		"$\u0000\u0000\u035d\u035e\u0005 \u0000\u0000\u035e\u035f\u0003H$\u0000"+
		"\u035f\u0360\u0005!\u0000\u0000\u0360o\u0001\u0000\u0000\u0000\u0361\u0362"+
		"\u0005\u0019\u0000\u0000\u0362\u0363\u0005$\u0000\u0000\u0363\u0364\u0005"+
		"S\u0000\u0000\u0364q\u0001\u0000\u0000\u0000\u0365\u0366\u0005\u001a\u0000"+
		"\u0000\u0366\u0367\u0005$\u0000\u0000\u0367\u0368\u0005S\u0000\u0000\u0368"+
		"s\u0001\u0000\u0000\u0000\u0369\u036a\u0005\u001b\u0000\u0000\u036a\u036b"+
		"\u0005$\u0000\u0000\u036b\u036c\u0007\t\u0000\u0000\u036cu\u0001\u0000"+
		"\u0000\u0000\u036d\u036e\u0005\u0002\u0000\u0000\u036e\u036f\u0005$\u0000"+
		"\u0000\u036f\u0370\u0003H$\u0000\u0370w\u0001\u0000\u0000\u0000\u0371"+
		"\u0372\u0005\u0001\u0000\u0000\u0372\u0373\u0005$\u0000\u0000\u0373\u0374"+
		"\u0003H$\u0000\u0374y\u0001\u0000\u0000\u0000`}\u0092\u00a1\u00a5\u00bd"+
		"\u00bf\u00d1\u00d3\u00d9\u00dc\u00e1\u00e5\u00ea\u00f8\u00fb\u0108\u010b"+
		"\u010f\u0112\u0119\u0127\u012c\u0132\u0140\u0143\u0147\u0157\u015b\u0160"+
		"\u016a\u016d\u0173\u017e\u0181\u0187\u0189\u0193\u0196\u019c\u019e\u01a3"+
		"\u01aa\u01ad\u01b2\u01b6\u01bf\u01c2\u01c9\u01d6\u01e2\u01e5\u01ed\u01f1"+
		"\u01f6\u0200\u0205\u021e\u022a\u023d\u0246\u0259\u026a\u026c\u0275\u0281"+
		"\u0285\u0288\u0292\u0295\u02a0\u02a9\u02b0\u02b3\u02b5\u02ba\u02be\u02c8"+
		"\u02d2\u02d9\u02e8\u02eb\u02f2\u02f6\u0300\u0304\u030b\u0312\u0319\u0320"+
		"\u032a\u032d\u032f\u0335\u0338\u033a\u033e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}