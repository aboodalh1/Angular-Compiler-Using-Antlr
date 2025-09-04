// Generated from src/AngularParser.g4 by ANTLR 4.13.2
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
		BackgroundColorAttributeName=13, TextColorAttributeName=14, LabelAttributeName=15, 
		CheckedAttributeName=16, TargetAttributeName=17, OnSubmitAttributeName=18, 
		OnChangeAttributeName=19, OnClickAttributeName=20, HeadingLevelAttributeName=21, 
		DirectionAttributeName=22, DurationAttributeName=23, RepeatAttributeName=24, 
		OpenBracket=25, CloseBracket=26, OpenParen=27, CloseParen=28, OpenBrace=29, 
		CloseBrace=30, SemiColon=31, Comma=32, Assign=33, Colon=34, QuestionMark=35, 
		DollarSign=36, Dot=37, Plus=38, Minus=39, Multiply=40, At=41, Divide=42, 
		Modulus=43, Not=44, LessThan=45, GreaterThan=46, LessThanEquals=47, GreaterThanEquals=48, 
		NOT_EQUAL=49, WeakEqual=50, StrongEqual=51, And=52, Or=53, AngularExpressionStart=54, 
		AngularExpressionEnd=55, Let_Identify=56, If=57, Else=58, While=59, Break=60, 
		Void=61, Continue=62, Function=63, Return=64, From=65, Null=66, Enum=67, 
		Array=68, Any=69, TypeNumber=70, TypeString=71, TypeBoolean=72, This=73, 
		Constructor=74, Private=75, Public=76, Static=77, Const=78, Protected=79, 
		New=80, NumberLiteral=81, StringLiteral=82, BooleanLiteral=83, Backtick=84, 
		Identifier=85, CssPixel=86, Hash=87, SingleLineComment=88, MultiLineComment=89, 
		WS=90, Component=91, Injectable=92, Pipe=93, Directive=94, Module=95, 
		Service=96, Star=97, As=98, GapAttributeName=99;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_component = 2, RULE_decoratorArgs = 3, 
		RULE_argument = 4, RULE_exportClass = 5, RULE_classRule = 6, RULE_classBody = 7, 
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
			"classRule", "classBody", "abstractClass", "interface", "interfaceBody", 
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
			"'backgroundColor'", "'textColor'", "'label'", "'chacked'", "'target'", 
			"'submit'", "'change'", "'click'", "'level'", "'direction'", "'duration'", 
			"'repeat'", "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", 
			"':'", "'?'", "'$'", "'.'", "'+'", "'-'", "'*'", "'@'", "'/'", "'%'", 
			"'!'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'==='", "'&&'", 
			"'||'", "'{{'", "'}}'", "'let'", "'if'", "'else'", "'while'", "'break'", 
			"'void'", "'continue'", "'function'", "'return'", "'from'", "'null'", 
			"'enum'", "'Array'", "'any'", "'number'", "'string'", "'boolean'", "'this'", 
			"'constructor'", "'private'", "'public'", "'static'", "'const'", "'protected'", 
			"'new'", null, null, null, "'`'", null, "'px'", "'#'", null, null, null, 
			"'@Component'", "'@Injectable'", "'@Pipe'", "'@Directive'", "'@NgModule'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "Import", "Export", "Abstract", 
			"Interface", "Extends", "Implements", "Console", "Log", "Class", "InlineAttributeName", 
			"BackgroundColorAttributeName", "TextColorAttributeName", "LabelAttributeName", 
			"CheckedAttributeName", "TargetAttributeName", "OnSubmitAttributeName", 
			"OnChangeAttributeName", "OnClickAttributeName", "HeadingLevelAttributeName", 
			"DirectionAttributeName", "DurationAttributeName", "RepeatAttributeName", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "Colon", "QuestionMark", 
			"DollarSign", "Dot", "Plus", "Minus", "Multiply", "At", "Divide", "Modulus", 
			"Not", "LessThan", "GreaterThan", "LessThanEquals", "GreaterThanEquals", 
			"NOT_EQUAL", "WeakEqual", "StrongEqual", "And", "Or", "AngularExpressionStart", 
			"AngularExpressionEnd", "Let_Identify", "If", "Else", "While", "Break", 
			"Void", "Continue", "Function", "Return", "From", "Null", "Enum", "Array", 
			"Any", "TypeNumber", "TypeString", "TypeBoolean", "This", "Constructor", 
			"Private", "Public", "Static", "Const", "Protected", "New", "NumberLiteral", 
			"StringLiteral", "BooleanLiteral", "Backtick", "Identifier", "CssPixel", 
			"Hash", "SingleLineComment", "MultiLineComment", "WS", "Component", "Injectable", 
			"Pipe", "Directive", "Module", "Service", "Star", "As", "GapAttributeName"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6557241057451444856L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1057234881L) != 0)) {
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
		public ClassRuleContext classRule() {
			return getRuleContext(ClassRuleContext.class,0);
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
		public NestedThisAccessContext nestedThisAccess() {
			return getRuleContext(NestedThisAccessContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(147);
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
				classRule();
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
				nestedThisAccess();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(143);
				breakStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(144);
				continueStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(145);
				consoleLog();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(146);
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
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			_la = _input.LA(1);
			if ( !(((((_la - 91)) & ~0x3f) == 0 && ((1L << (_la - 91)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(150);
			match(OpenParen);
			setState(151);
			match(OpenBrace);
			setState(152);
			decoratorArgs();
			setState(153);
			match(CloseBrace);
			setState(154);
			match(CloseParen);
			setState(155);
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
	}

	public final DecoratorArgsContext decoratorArgs() throws RecognitionException {
		DecoratorArgsContext _localctx = new DecoratorArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decoratorArgs);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			argument();
			setState(162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(158);
					match(Comma);
					setState(159);
					argument();
					}
					} 
				}
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(165);
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
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
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
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(168);
			match(Identifier);
			setState(169);
			match(Colon);
			}
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(171);
				literalValue();
				}
				break;
			case 2:
				{
				setState(172);
				html();
				}
				break;
			case 3:
				{
				setState(173);
				css();
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
	}

	public final ExportClassContext exportClass() throws RecognitionException {
		ExportClassContext _localctx = new ExportClassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_exportClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Export);
			setState(177);
			match(Class);
			setState(178);
			match(Identifier);
			setState(179);
			match(OpenBrace);
			setState(180);
			classBody();
			setState(181);
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
	public static class ClassRuleContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ClassRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassRule(this);
		}
	}

	public final ClassRuleContext classRule() throws RecognitionException {
		ClassRuleContext _localctx = new ClassRuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_classRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Class);
			setState(184);
			match(Identifier);
			setState(185);
			match(OpenBrace);
			setState(186);
			classBody();
			setState(187);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Let_Identify || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 2111L) != 0)) {
				{
				setState(194);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(189);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(190);
					objectDeclataion();
					}
					break;
				case 3:
					{
					setState(191);
					arrayDeclaration();
					}
					break;
				case 4:
					{
					setState(192);
					abstractFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(193);
					functionDeclaration();
					}
					break;
				}
				}
				setState(198);
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
	}

	public final AbstractClassContext abstractClass() throws RecognitionException {
		AbstractClassContext _localctx = new AbstractClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(Abstract);
			setState(200);
			match(Class);
			setState(201);
			match(Identifier);
			setState(202);
			match(OpenBrace);
			setState(203);
			classBody();
			setState(204);
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
	}

	public final InterfaceContext interface_() throws RecognitionException {
		InterfaceContext _localctx = new InterfaceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Interface);
			setState(207);
			match(Identifier);
			setState(208);
			match(OpenBrace);
			setState(209);
			interfaceBody();
			setState(210);
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
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interfaceBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Let_Identify || ((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 1055L) != 0)) {
				{
				setState(214);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Let_Identify:
				case Private:
				case Public:
				case Static:
				case Const:
				case Protected:
				case Identifier:
					{
					setState(212);
					variableDeclaration();
					}
					break;
				case Abstract:
					{
					setState(213);
					abstractFunctionDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(218);
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
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_la = _input.LA(1);
			if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 23L) != 0)) ) {
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
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
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
		public NestedThisAccessContext nestedThisAccess() {
			return getRuleContext(NestedThisAccessContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(221);
				match(Const);
				}
			}

			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 23L) != 0)) {
				{
				setState(224);
				accessModifier();
				}
			}

			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Let_Identify) {
				{
				setState(227);
				match(Let_Identify);
				}
			}

			setState(230);
			match(Identifier);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(231);
				match(Colon);
				setState(232);
				type();
				}
			}

			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(235);
				match(Assign);
				setState(236);
				expression(0);
				}
				break;
			case 2:
				{
				setState(237);
				match(Assign);
				setState(238);
				nestedThisAccess();
				}
				break;
			}
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(241);
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
		public TerminalNode Const() { return getToken(AngularParser.Const, 0); }
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
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDeclaration);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const) {
					{
					setState(244);
					match(Const);
					}
				}

				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(247);
					match(Let_Identify);
					}
				}

				setState(250);
				match(Identifier);
				setState(251);
				match(Colon);
				setState(252);
				type();
				setState(253);
				match(OpenBracket);
				setState(254);
				match(CloseBracket);
				setState(255);
				match(Assign);
				setState(256);
				match(OpenBracket);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 504405357288751121L) != 0)) {
					{
					setState(257);
					literalValue();
					setState(262);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(258);
						match(Comma);
						setState(259);
						literalValue();
						}
						}
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(267);
				match(CloseBracket);
				setState(268);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				match(Identifier);
				setState(271);
				match(Assign);
				setState(272);
				match(OpenBracket);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 504405357288751121L) != 0)) {
					{
					setState(273);
					literalValue();
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(274);
						match(Comma);
						setState(275);
						literalValue();
						}
						}
						setState(280);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(283);
				match(CloseBracket);
				setState(284);
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
	}

	public final ObjectDeclataionContext objectDeclataion() throws RecognitionException {
		ObjectDeclataionContext _localctx = new ObjectDeclataionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_objectDeclataion);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 23L) != 0)) {
					{
					setState(287);
					accessModifier();
					}
				}

				setState(290);
				match(Identifier);
				setState(291);
				match(Colon);
				setState(292);
				match(Identifier);
				setState(293);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 23L) != 0)) {
					{
					setState(294);
					accessModifier();
					}
				}

				setState(297);
				match(Identifier);
				setState(298);
				match(Colon);
				setState(299);
				match(Identifier);
				setState(300);
				match(Assign);
				setState(301);
				match(New);
				setState(302);
				match(Identifier);
				setState(303);
				match(OpenParen);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 1657608336872308757L) != 0)) {
					{
					{
					setState(304);
					expression(0);
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(305);
						match(Comma);
						setState(306);
						expression(0);
						}
						}
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(316);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(317);
				match(CloseParen);
				setState(318);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & 23L) != 0)) {
					{
					setState(319);
					accessModifier();
					}
				}

				setState(322);
				match(Identifier);
				setState(323);
				match(Assign);
				setState(324);
				match(OpenBrace);
				setState(337);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(325);
					match(Identifier);
					setState(326);
					match(Colon);
					setState(327);
					literalValue();
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(328);
						match(Comma);
						setState(329);
						match(Identifier);
						setState(330);
						match(Colon);
						setState(331);
						literalValue();
						}
						}
						setState(336);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(339);
				match(CloseBrace);
				setState(340);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 131103L) != 0)) ) {
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
	}

	public final EnumContext enum_() throws RecognitionException {
		EnumContext _localctx = new EnumContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_enum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(Enum);
			setState(346);
			match(Identifier);
			setState(347);
			match(OpenBrace);
			setState(348);
			enumValues();
			setState(349);
			match(CloseBrace);
			setState(350);
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
	}

	public final EnumValuesContext enumValues() throws RecognitionException {
		EnumValuesContext _localctx = new EnumValuesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_enumValues);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			enumValue();
			setState(357);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(353);
					match(Comma);
					setState(354);
					enumValue();
					}
					} 
				}
				setState(359);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(360);
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
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_enumValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(Identifier);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(364);
				match(Assign);
				setState(365);
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
	}

	public final AbstractFunctionDeclarationContext abstractFunctionDeclaration() throws RecognitionException {
		AbstractFunctionDeclarationContext _localctx = new AbstractFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Abstract);
			setState(369);
			match(Identifier);
			setState(370);
			match(OpenParen);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(371);
				parameter();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(372);
					match(Comma);
					setState(373);
					parameter();
					}
					}
					setState(378);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(381);
			match(CloseParen);
			{
			setState(382);
			match(Colon);
			setState(385);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
			case Identifier:
				{
				setState(383);
				type();
				}
				break;
			case Void:
				{
				setState(384);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(387);
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
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionDeclaration);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				_la = _input.LA(1);
				if ( !(_la==Constructor || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(390);
				match(OpenParen);
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(391);
					parameter();
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(392);
						match(Comma);
						setState(393);
						parameter();
						}
						}
						setState(398);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(401);
				match(CloseParen);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(402);
					match(Colon);
					setState(405);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Array:
					case Any:
					case TypeNumber:
					case TypeString:
					case TypeBoolean:
					case Identifier:
						{
						setState(403);
						type();
						}
						break;
					case Void:
						{
						setState(404);
						match(Void);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(409);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				_la = _input.LA(1);
				if ( !(_la==Constructor || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(411);
				match(OpenParen);
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(412);
					parameter();
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(413);
						match(Comma);
						setState(414);
						parameter();
						}
						}
						setState(419);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(422);
				match(CloseParen);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon) {
					{
					setState(423);
					match(Colon);
					setState(426);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Array:
					case Any:
					case TypeNumber:
					case TypeString:
					case TypeBoolean:
					case Identifier:
						{
						setState(424);
						type();
						}
						break;
					case Void:
						{
						setState(425);
						match(Void);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6557241057451444856L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8457879049L) != 0)) {
					{
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6557241057451444856L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1057234881L) != 0)) {
						{
						{
						setState(430);
						statement();
						}
						}
						setState(435);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(436);
					match(Return);
					setState(437);
					expression(0);
					setState(438);
					match(SemiColon);
					}
				}

				setState(442);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(Identifier);
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(446);
				match(Colon);
				setState(447);
				type();
				}
			}

			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(450);
				match(Assign);
				setState(451);
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(Identifier);
			setState(455);
			match(OpenParen);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 1657608336872308757L) != 0)) {
				{
				setState(456);
				expression(0);
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(457);
					match(Comma);
					setState(458);
					expression(0);
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(466);
			match(CloseParen);
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(467);
				match(SemiColon);
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
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				{
				setState(470);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(471);
				nestedThisAccess();
				}
				break;
			case 3:
				{
				setState(472);
				identifierOrPropertyAccess();
				}
				break;
			}
			setState(475);
			match(Assign);
			setState(476);
			expression(0);
			setState(477);
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
	}

	public final ThisAssignmentContext thisAssignment() throws RecognitionException {
		ThisAssignmentContext _localctx = new ThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_thisAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(This);
			setState(480);
			match(Dot);
			setState(481);
			match(Identifier);
			setState(482);
			match(Assign);
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				setState(483);
				newInstanceAssignment();
				}
				break;
			case This:
				{
				setState(484);
				nestedThisAccess();
				}
				break;
			case Identifier:
				{
				setState(485);
				identifierOrPropertyAccess();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(488);
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
	}

	public final NewInstanceAssignmentContext newInstanceAssignment() throws RecognitionException {
		NewInstanceAssignmentContext _localctx = new NewInstanceAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_newInstanceAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(New);
			setState(491);
			match(Identifier);
			setState(492);
			match(OpenParen);
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 1657608336872308757L) != 0)) {
				{
				setState(493);
				expression(0);
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(494);
					match(Comma);
					setState(495);
					expression(0);
					}
					}
					setState(500);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(503);
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
	}

	public final NestedThisAccessContext nestedThisAccess() throws RecognitionException {
		NestedThisAccessContext _localctx = new NestedThisAccessContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_nestedThisAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(This);
			setState(511); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(506);
				match(Dot);
				setState(509);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(507);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(508);
					function_call();
					}
					break;
				}
				}
				}
				setState(513); 
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
	}

	public final IdentifierOrPropertyAccessContext identifierOrPropertyAccess() throws RecognitionException {
		IdentifierOrPropertyAccessContext _localctx = new IdentifierOrPropertyAccessContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_identifierOrPropertyAccess);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(Identifier);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(516);
				match(Dot);
				setState(517);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			match(If);
			setState(521);
			match(OpenParen);
			setState(522);
			expression(0);
			setState(523);
			match(CloseParen);
			setState(524);
			block();
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(525);
					elseIfStatement();
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(531);
				match(Else);
				setState(532);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			match(While);
			setState(536);
			match(OpenParen);
			setState(537);
			expression(0);
			setState(538);
			match(CloseParen);
			setState(539);
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
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(Else);
			setState(542);
			match(If);
			setState(543);
			match(OpenParen);
			setState(544);
			expression(0);
			setState(545);
			match(CloseParen);
			setState(546);
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
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(Break);
			setState(549);
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
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(551);
			match(Continue);
			setState(552);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			match(OpenBrace);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6557241057451444856L) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 1057234881L) != 0)) {
				{
				{
				setState(555);
				statement();
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
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
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_importStatement);
		int _la;
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(Import);
				setState(564);
				match(OpenBrace);
				setState(565);
				match(Identifier);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(566);
					match(Comma);
					setState(567);
					match(Identifier);
					}
					}
					setState(572);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(573);
				match(CloseBrace);
				setState(574);
				match(From);
				setState(575);
				match(StringLiteral);
				setState(576);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(577);
				match(Import);
				setState(578);
				match(Identifier);
				setState(579);
				match(From);
				setState(580);
				match(StringLiteral);
				setState(581);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(Import);
				setState(583);
				match(Star);
				setState(584);
				match(As);
				setState(585);
				match(Identifier);
				setState(586);
				match(From);
				setState(587);
				match(StringLiteral);
				setState(588);
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
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(Console);
			setState(592);
			match(Dot);
			setState(593);
			match(Log);
			setState(594);
			match(OpenParen);
			setState(595);
			expression(0);
			setState(596);
			match(CloseParen);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(597);
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
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
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
		public TerminalNode QuestionMark() { return getToken(AngularParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
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
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(601);
				match(OpenParen);
				setState(602);
				expression(0);
				setState(603);
				match(CloseParen);
				}
				break;
			case 2:
				{
				setState(605);
				match(Identifier);
				setState(606);
				match(OpenBracket);
				setState(607);
				expression(0);
				setState(608);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				setState(610);
				match(Identifier);
				setState(611);
				match(Dot);
				setState(612);
				match(Identifier);
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(Dot);
						setState(614);
						expression(0);
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case 4:
				{
				setState(620);
				match(Identifier);
				setState(621);
				match(OpenBracket);
				setState(622);
				match(NumberLiteral);
				setState(623);
				match(CloseBracket);
				setState(624);
				match(Dot);
				setState(625);
				match(Identifier);
				}
				break;
			case 5:
				{
				setState(626);
				function_call();
				}
				break;
			case 6:
				{
				setState(627);
				literalValue();
				}
				break;
			case 7:
				{
				setState(628);
				match(Identifier);
				}
				break;
			case 8:
				{
				setState(629);
				match(This);
				}
				break;
			case 9:
				{
				setState(630);
				match(This);
				setState(631);
				match(Dot);
				setState(632);
				match(Identifier);
				setState(633);
				match(Dot);
				setState(634);
				match(Identifier);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(637);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(638);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15118284881920L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(639);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(640);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(641);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 527765581332480L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(642);
						expression(17);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(643);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(644);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3940649673949184L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(645);
						expression(16);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(646);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(647);
						match(And);
						setState(648);
						expression(15);
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(649);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(650);
						match(Or);
						setState(651);
						expression(14);
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(652);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(653);
						match(QuestionMark);
						setState(654);
						expression(0);
						setState(655);
						match(Colon);
						setState(656);
						expression(12);
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(658);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(659);
						match(Assign);
						setState(660);
						match(GreaterThan);
						}
						setState(662);
						expression(11);
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(663);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(664);
						match(Assign);
						setState(665);
						match(Assign);
						setState(666);
						match(Assign);
						setState(667);
						expression(10);
						}
						break;
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literalValue);
		try {
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NumberLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				match(NumberLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(675);
				match(BooleanLiteral);
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 4);
				{
				setState(676);
				listLiteral();
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(677);
				mapLiteral();
				}
				break;
			case Null:
				enterOuterAlt(_localctx, 6);
				{
				setState(678);
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
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(OpenBrace);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(682);
				match(Identifier);
				setState(683);
				match(Colon);
				setState(684);
				literalValue();
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(685);
					match(Comma);
					{
					setState(686);
					match(Identifier);
					setState(687);
					match(Colon);
					setState(688);
					literalValue();
					}
					setState(691);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						setState(690);
						match(Comma);
						}
						break;
					}
					}
					}
					setState(697);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(700);
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
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(OpenBracket);
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & 504405357288751121L) != 0)) {
				{
				setState(703);
				literalValue();
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(704);
					match(Comma);
					setState(705);
					literalValue();
					}
					}
					setState(710);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(713);
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
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(Backtick);
			setState(716);
			html_content();
			setState(717);
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
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> OpenParen() { return getTokens(AngularParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(AngularParser.OpenParen, i);
		}
		public List<Html_contentContext> html_content() {
			return getRuleContexts(Html_contentContext.class);
		}
		public Html_contentContext html_content(int i) {
			return getRuleContext(Html_contentContext.class,i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(AngularParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(AngularParser.CloseParen, i);
		}
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
		public List<TerminalNode> OpenBracket() { return getTokens(AngularParser.OpenBracket); }
		public TerminalNode OpenBracket(int i) {
			return getToken(AngularParser.OpenBracket, i);
		}
		public List<TerminalNode> CloseBracket() { return getTokens(AngularParser.CloseBracket); }
		public TerminalNode CloseBracket(int i) {
			return getToken(AngularParser.CloseBracket, i);
		}
		public List<TerminalNode> Assign() { return getTokens(AngularParser.Assign); }
		public TerminalNode Assign(int i) {
			return getToken(AngularParser.Assign, i);
		}
		public List<TerminalNode> Minus() { return getTokens(AngularParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(AngularParser.Minus, i);
		}
		public List<TerminalNode> Plus() { return getTokens(AngularParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(AngularParser.Plus, i);
		}
		public List<Html_elementContext> html_element() {
			return getRuleContexts(Html_elementContext.class);
		}
		public Html_elementContext html_element(int i) {
			return getRuleContext(Html_elementContext.class,i);
		}
		public List<TerminalNode> DollarSign() { return getTokens(AngularParser.DollarSign); }
		public TerminalNode DollarSign(int i) {
			return getToken(AngularParser.DollarSign, i);
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
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_html_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(758);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(720); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(719);
								html_element();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(722); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						setState(724);
						match(Identifier);
						setState(725);
						match(OpenParen);
						setState(726);
						html_content();
						setState(727);
						match(CloseParen);
						}
						break;
					case 3:
						{
						setState(730);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==DollarSign) {
							{
							setState(729);
							match(DollarSign);
							}
						}

						setState(732);
						match(AngularExpressionStart);
						setState(733);
						expression(0);
						setState(734);
						match(AngularExpressionEnd);
						}
						break;
					case 4:
						{
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NumberLiteral) {
							{
							{
							setState(736);
							match(NumberLiteral);
							}
							}
							setState(741);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(742);
						match(Identifier);
						setState(746);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(743);
								match(NumberLiteral);
								}
								} 
							}
							setState(748);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
						}
						}
						break;
					case 5:
						{
						setState(749);
						match(OpenBracket);
						setState(750);
						match(OpenParen);
						setState(751);
						match(Identifier);
						setState(752);
						match(CloseParen);
						setState(753);
						match(CloseBracket);
						setState(754);
						match(Assign);
						setState(755);
						match(Identifier);
						}
						break;
					case 6:
						{
						setState(756);
						match(Minus);
						}
						break;
					case 7:
						{
						setState(757);
						match(Plus);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(760); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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
		public TerminalNode Hash() { return getToken(AngularParser.Hash, 0); }
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
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_html_element);
		int _la;
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				match(LessThan);
				setState(763);
				html_tag_name();
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(764);
					html_attributes();
					}
					break;
				}
				setState(767);
				match(GreaterThan);
				setState(769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(768);
					html_content();
					}
					break;
				}
				setState(771);
				match(LessThan);
				setState(772);
				match(Divide);
				setState(773);
				html_tag_name();
				setState(774);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(LessThan);
				setState(777);
				html_tag_name();
				setState(779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(778);
					html_attributes();
					}
					break;
				}
				setState(781);
				match(GreaterThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(LessThan);
				setState(784);
				html_tag_name();
				setState(785);
				html_attributes();
				setState(786);
				match(Divide);
				setState(787);
				match(GreaterThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				match(LessThan);
				setState(790);
				html_tag_name();
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Hash) {
					{
					setState(791);
					match(Hash);
					}
				}

				setState(795);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(794);
					html_attributes();
					}
					break;
				}
				setState(797);
				match(GreaterThan);
				setState(799);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(798);
					html_content();
					}
					break;
				}
				setState(801);
				match(LessThan);
				setState(802);
				match(Divide);
				setState(803);
				html_tag_name();
				setState(804);
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
		public TerminalNode LabelAttributeName() { return getToken(AngularParser.LabelAttributeName, 0); }
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
	}

	public final Html_tag_nameContext html_tag_name() throws RecognitionException {
		Html_tag_nameContext _localctx = new Html_tag_nameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_html_tag_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_la = _input.LA(1);
			if ( !(_la==LabelAttributeName || _la==Identifier) ) {
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
	}

	public final Html_attributesContext html_attributes() throws RecognitionException {
		Html_attributesContext _localctx = new Html_attributesContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_html_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099679401990L) != 0) || _la==Identifier) {
				{
				{
				setState(810);
				html_attribute();
				}
				}
				setState(815);
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
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
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
	}

	public final Html_attributeContext html_attribute() throws RecognitionException {
		Html_attributeContext _localctx = new Html_attributeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_html_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(816);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(817);
				ngIfAttribute();
				}
				break;
			case 3:
				{
				setState(818);
				ngForAttribute();
				}
				break;
			case 4:
				{
				setState(819);
				onChangeAttribute();
				}
				break;
			case 5:
				{
				setState(820);
				onClickAttribute();
				}
				break;
			case 6:
				{
				setState(821);
				match(Class);
				}
				break;
			case 7:
				{
				setState(822);
				match(OpenBracket);
				setState(835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(823);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(827);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(824);
						match(Identifier);
						}
						break;
					case OpenBracket:
					case CloseBracket:
					case Dot:
						{
						}
						break;
					case Class:
						{
						setState(826);
						match(Class);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(829);
						access_suffix();
						}
						}
						setState(834);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(837);
				match(CloseBracket);
				}
				break;
			case 8:
				{
				setState(838);
				match(OpenBracket);
				setState(839);
				match(OpenParen);
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(840);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(844);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(841);
						match(Identifier);
						}
						break;
					case OpenBracket:
					case CloseParen:
					case Dot:
						{
						}
						break;
					case Class:
						{
						setState(843);
						match(Class);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(849);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(846);
						access_suffix();
						}
						}
						setState(851);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(854);
				match(CloseParen);
				setState(855);
				match(CloseBracket);
				}
				break;
			case 9:
				{
				setState(856);
				match(OpenParen);
				setState(860);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(857);
					match(Identifier);
					}
					break;
				case CloseParen:
					{
					}
					break;
				case Class:
					{
					setState(859);
					match(Class);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(862);
				match(CloseParen);
				}
				break;
			case 10:
				{
				setState(863);
				match(Multiply);
				}
				break;
			}
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(866);
				match(Assign);
				setState(867);
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
	}

	public final Access_suffixContext access_suffix() throws RecognitionException {
		Access_suffixContext _localctx = new Access_suffixContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_access_suffix);
		try {
			setState(878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				match(Dot);
				setState(871);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(872);
				match(OpenBracket);
				setState(873);
				expression(0);
				setState(874);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				match(Dot);
				setState(877);
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
	}

	public final Html_attribute_valueContext html_attribute_value() throws RecognitionException {
		Html_attribute_valueContext _localctx = new Html_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_html_attribute_value);
		try {
			setState(882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(880);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(881);
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
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(OpenBracket);
			setState(885);
			match(Backtick);
			setState(889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(886);
				css_content();
				}
				}
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(892);
			match(Backtick);
			setState(893);
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
	}

	public final Css_contentContext css_content() throws RecognitionException {
		Css_contentContext _localctx = new Css_contentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_css_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(895);
				match(Dot);
				}
			}

			setState(898);
			match(Identifier);
			setState(903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(899);
				match(Colon);
				setState(900);
				match(Identifier);
				}
				}
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(906);
			match(OpenBrace);
			setState(910);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(907);
				css_class_content();
				}
				}
				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(913);
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
		public List<TerminalNode> Hash() { return getTokens(AngularParser.Hash); }
		public TerminalNode Hash(int i) {
			return getToken(AngularParser.Hash, i);
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
		public List<TerminalNode> NumberLiteral() { return getTokens(AngularParser.NumberLiteral); }
		public TerminalNode NumberLiteral(int i) {
			return getToken(AngularParser.NumberLiteral, i);
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
	}

	public final Css_class_contentContext css_class_content() throws RecognitionException {
		Css_class_contentContext _localctx = new Css_class_contentContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_css_class_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			match(Identifier);
			setState(916);
			match(Colon);
			setState(928); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(917);
					match(Hash);
					setState(919); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(918);
							_la = _input.LA(1);
							if ( !(_la==NumberLiteral || _la==Identifier) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(921); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 2:
					{
					setState(923);
					_la = _input.LA(1);
					if ( !(_la==NumberLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(925);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(924);
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
					setState(927);
					function_call();
					}
					break;
				}
				}
				setState(930); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 81L) != 0) );
			setState(950);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(932);
				match(Comma);
				setState(944); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(944);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(933);
						match(Hash);
						setState(935); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(934);
								_la = _input.LA(1);
								if ( !(_la==NumberLiteral || _la==Identifier) ) {
								_errHandler.recoverInline(this);
								}
								else {
									if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
									_errHandler.reportMatch(this);
									consume();
								}
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(937); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 2:
						{
						setState(939);
						_la = _input.LA(1);
						if ( !(_la==NumberLiteral || _la==Identifier) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(941);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(940);
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
						setState(943);
						function_call();
						}
						break;
					}
					}
					setState(946); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 81L) != 0) );
				}
				}
				setState(952);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(953);
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
	}

	public final CheckedAttributeContext checkedAttribute() throws RecognitionException {
		CheckedAttributeContext _localctx = new CheckedAttributeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_checkedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(CheckedAttributeName);
			setState(956);
			match(Assign);
			setState(957);
			match(OpenBrace);
			setState(958);
			expression(0);
			setState(959);
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
	}

	public final OnChangeAttributeContext onChangeAttribute() throws RecognitionException {
		OnChangeAttributeContext _localctx = new OnChangeAttributeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_onChangeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			match(OpenParen);
			setState(962);
			match(OnChangeAttributeName);
			setState(963);
			match(CloseParen);
			setState(964);
			match(Assign);
			setState(965);
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
	}

	public final OnClickAttributeContext onClickAttribute() throws RecognitionException {
		OnClickAttributeContext _localctx = new OnClickAttributeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_onClickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(967);
			match(OpenParen);
			setState(968);
			match(OnClickAttributeName);
			setState(969);
			match(CloseParen);
			setState(970);
			match(Assign);
			setState(971);
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
	}

	public final OnSubmitAttributeContext onSubmitAttribute() throws RecognitionException {
		OnSubmitAttributeContext _localctx = new OnSubmitAttributeContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_onSubmitAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(973);
			match(OpenParen);
			setState(974);
			match(OnSubmitAttributeName);
			setState(975);
			match(CloseParen);
			setState(976);
			match(Assign);
			setState(977);
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
	}

	public final GapAttributeContext gapAttribute() throws RecognitionException {
		GapAttributeContext _localctx = new GapAttributeContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_gapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(GapAttributeName);
			setState(980);
			match(Assign);
			setState(981);
			match(OpenBrace);
			setState(982);
			expression(0);
			setState(983);
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
	}

	public final DirectionAttributeContext directionAttribute() throws RecognitionException {
		DirectionAttributeContext _localctx = new DirectionAttributeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_directionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(985);
			match(DirectionAttributeName);
			setState(986);
			match(Assign);
			setState(987);
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
	}

	public final DurationAttributeContext durationAttribute() throws RecognitionException {
		DurationAttributeContext _localctx = new DurationAttributeContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_durationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			match(DurationAttributeName);
			setState(990);
			match(Assign);
			setState(991);
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
	}

	public final RepeatAttributeContext repeatAttribute() throws RecognitionException {
		RepeatAttributeContext _localctx = new RepeatAttributeContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_repeatAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(993);
			match(RepeatAttributeName);
			setState(994);
			match(Assign);
			setState(995);
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
	}

	public final NgForAttributeContext ngForAttribute() throws RecognitionException {
		NgForAttributeContext _localctx = new NgForAttributeContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_ngForAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(NgForDirective);
			setState(998);
			match(Assign);
			setState(999);
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
	}

	public final NgIfAttributeContext ngIfAttribute() throws RecognitionException {
		NgIfAttributeContext _localctx = new NgIfAttributeContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_ngIfAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1001);
			match(NgIfDirective);
			setState(1002);
			match(Assign);
			setState(1003);
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
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001c\u03ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\u0001\u0001\u0003\u0001\u0094\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u00a1\b\u0003\n\u0003\f\u0003\u00a4"+
		"\t\u0003\u0001\u0003\u0003\u0003\u00a7\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00af\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007\u00c3\b\u0007\n\u0007\f\u0007\u00c6\t\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n\u00d7\b\n\n\n\f\n\u00da\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0003\f\u00df\b\f\u0001\f\u0003\f\u00e2"+
		"\b\f\u0001\f\u0003\f\u00e5\b\f\u0001\f\u0001\f\u0001\f\u0003\f\u00ea\b"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f0\b\f\u0001\f\u0003\f\u00f3"+
		"\b\f\u0001\r\u0003\r\u00f6\b\r\u0001\r\u0003\r\u00f9\b\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005"+
		"\r\u0105\b\r\n\r\f\r\u0108\t\r\u0003\r\u010a\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0115\b\r\n"+
		"\r\f\r\u0118\t\r\u0003\r\u011a\b\r\u0001\r\u0001\r\u0003\r\u011e\b\r\u0001"+
		"\u000e\u0003\u000e\u0121\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0128\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u0134\b\u000e\n\u000e\f\u000e\u0137\t\u000e"+
		"\u0005\u000e\u0139\b\u000e\n\u000e\f\u000e\u013c\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0141\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u014d\b\u000e\n\u000e\f\u000e\u0150\t\u000e"+
		"\u0003\u000e\u0152\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0156\b"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u0164\b\u0011\n\u0011\f\u0011\u0167\t\u0011\u0001\u0011"+
		"\u0003\u0011\u016a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u016f\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0005\u0013\u0177\b\u0013\n\u0013\f\u0013\u017a\t\u0013\u0003"+
		"\u0013\u017c\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003"+
		"\u0013\u0182\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u018b\b\u0014\n\u0014\f\u0014"+
		"\u018e\t\u0014\u0003\u0014\u0190\b\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u0196\b\u0014\u0003\u0014\u0198\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0005\u0014\u01a0\b\u0014\n\u0014\f\u0014\u01a3\t\u0014\u0003\u0014\u01a5"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ab"+
		"\b\u0014\u0003\u0014\u01ad\b\u0014\u0001\u0014\u0005\u0014\u01b0\b\u0014"+
		"\n\u0014\f\u0014\u01b3\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01b9\b\u0014\u0001\u0014\u0003\u0014\u01bc\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01c1\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01c5\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u01cc\b\u0016\n\u0016\f\u0016\u01cf"+
		"\t\u0016\u0003\u0016\u01d1\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01d5\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01da\b"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01e7\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u01f1\b\u0019\n"+
		"\u0019\f\u0019\u01f4\t\u0019\u0003\u0019\u01f6\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01fe"+
		"\b\u001a\u0004\u001a\u0200\b\u001a\u000b\u001a\f\u001a\u0201\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u0207\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u020f\b\u001c"+
		"\n\u001c\f\u001c\u0212\t\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0216"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0005!\u022d\b!\n!\f!\u0230\t!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u0239\b\"\n\"\f\"\u023c\t\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u024e\b\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0257\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0005$\u0268\b$\n$\f$\u026b\t$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u027c\b$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u029d\b$\n$\f$\u02a0\t$\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u02a8\b%\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u02b4\b&\u0005"+
		"&\u02b6\b&\n&\f&\u02b9\t&\u0003&\u02bb\b&\u0001&\u0001&\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u02c3\b\'\n\'\f\'\u02c6\t\'\u0003\'\u02c8\b"+
		"\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0004)\u02d1\b)"+
		"\u000b)\f)\u02d2\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0003)\u02db"+
		"\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u02e2\b)\n)\f)\u02e5\t)"+
		"\u0001)\u0001)\u0005)\u02e9\b)\n)\f)\u02ec\t)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0004)\u02f7\b)\u000b)\f)\u02f8\u0001"+
		"*\u0001*\u0001*\u0003*\u02fe\b*\u0001*\u0001*\u0003*\u0302\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u030c\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u0319\b*\u0001*\u0003*\u031c\b*\u0001*\u0001*\u0003*\u0320\b*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0003*\u0327\b*\u0001+\u0001+\u0001,\u0005"+
		",\u032c\b,\n,\f,\u032f\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u033c\b-\u0001-\u0005-\u033f\b-\n"+
		"-\f-\u0342\t-\u0003-\u0344\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0003-\u034d\b-\u0001-\u0005-\u0350\b-\n-\f-\u0353\t-\u0003-"+
		"\u0355\b-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u035d\b-\u0001"+
		"-\u0001-\u0003-\u0361\b-\u0001-\u0001-\u0003-\u0365\b-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u036f\b.\u0001/\u0001/\u0003"+
		"/\u0373\b/\u00010\u00010\u00010\u00050\u0378\b0\n0\f0\u037b\t0\u00010"+
		"\u00010\u00010\u00011\u00031\u0381\b1\u00011\u00011\u00011\u00051\u0386"+
		"\b1\n1\f1\u0389\t1\u00011\u00011\u00051\u038d\b1\n1\f1\u0390\t1\u0001"+
		"1\u00011\u00012\u00012\u00012\u00012\u00042\u0398\b2\u000b2\f2\u0399\u0001"+
		"2\u00012\u00032\u039e\b2\u00012\u00042\u03a1\b2\u000b2\f2\u03a2\u0001"+
		"2\u00012\u00012\u00042\u03a8\b2\u000b2\f2\u03a9\u00012\u00012\u00032\u03ae"+
		"\b2\u00012\u00042\u03b1\b2\u000b2\f2\u03b2\u00052\u03b5\b2\n2\f2\u03b8"+
		"\t2\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00016\u00016\u00016\u00016\u00016\u00016\u00017\u00017\u00017\u0001"+
		"7\u00017\u00017\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0001"+
		"9\u0001:\u0001:\u0001:\u0001:\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0000\u0001H=\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvx\u0000\u000b\u0001\u0000[`\u0002\u0000KMOO\u0002"+
		"\u0000DHUU\u0002\u0000JJUU\u0002\u0000&(*+\u0001\u0000-0\u0001\u00001"+
		"3\u0002\u0000\u000f\u000fUU\u0002\u0000QQUU\u0002\u0000++VV\u0001\u0000"+
		"QR\u045f\u0000}\u0001\u0000\u0000\u0000\u0002\u0093\u0001\u0000\u0000"+
		"\u0000\u0004\u0095\u0001\u0000\u0000\u0000\u0006\u009d\u0001\u0000\u0000"+
		"\u0000\b\u00a8\u0001\u0000\u0000\u0000\n\u00b0\u0001\u0000\u0000\u0000"+
		"\f\u00b7\u0001\u0000\u0000\u0000\u000e\u00c4\u0001\u0000\u0000\u0000\u0010"+
		"\u00c7\u0001\u0000\u0000\u0000\u0012\u00ce\u0001\u0000\u0000\u0000\u0014"+
		"\u00d8\u0001\u0000\u0000\u0000\u0016\u00db\u0001\u0000\u0000\u0000\u0018"+
		"\u00de\u0001\u0000\u0000\u0000\u001a\u011d\u0001\u0000\u0000\u0000\u001c"+
		"\u0155\u0001\u0000\u0000\u0000\u001e\u0157\u0001\u0000\u0000\u0000 \u0159"+
		"\u0001\u0000\u0000\u0000\"\u0160\u0001\u0000\u0000\u0000$\u016b\u0001"+
		"\u0000\u0000\u0000&\u0170\u0001\u0000\u0000\u0000(\u01bb\u0001\u0000\u0000"+
		"\u0000*\u01bd\u0001\u0000\u0000\u0000,\u01c6\u0001\u0000\u0000\u0000."+
		"\u01d9\u0001\u0000\u0000\u00000\u01df\u0001\u0000\u0000\u00002\u01ea\u0001"+
		"\u0000\u0000\u00004\u01f9\u0001\u0000\u0000\u00006\u0203\u0001\u0000\u0000"+
		"\u00008\u0208\u0001\u0000\u0000\u0000:\u0217\u0001\u0000\u0000\u0000<"+
		"\u021d\u0001\u0000\u0000\u0000>\u0224\u0001\u0000\u0000\u0000@\u0227\u0001"+
		"\u0000\u0000\u0000B\u022a\u0001\u0000\u0000\u0000D\u024d\u0001\u0000\u0000"+
		"\u0000F\u024f\u0001\u0000\u0000\u0000H\u027b\u0001\u0000\u0000\u0000J"+
		"\u02a7\u0001\u0000\u0000\u0000L\u02a9\u0001\u0000\u0000\u0000N\u02be\u0001"+
		"\u0000\u0000\u0000P\u02cb\u0001\u0000\u0000\u0000R\u02f6\u0001\u0000\u0000"+
		"\u0000T\u0326\u0001\u0000\u0000\u0000V\u0328\u0001\u0000\u0000\u0000X"+
		"\u032d\u0001\u0000\u0000\u0000Z\u0360\u0001\u0000\u0000\u0000\\\u036e"+
		"\u0001\u0000\u0000\u0000^\u0372\u0001\u0000\u0000\u0000`\u0374\u0001\u0000"+
		"\u0000\u0000b\u0380\u0001\u0000\u0000\u0000d\u0393\u0001\u0000\u0000\u0000"+
		"f\u03bb\u0001\u0000\u0000\u0000h\u03c1\u0001\u0000\u0000\u0000j\u03c7"+
		"\u0001\u0000\u0000\u0000l\u03cd\u0001\u0000\u0000\u0000n\u03d3\u0001\u0000"+
		"\u0000\u0000p\u03d9\u0001\u0000\u0000\u0000r\u03dd\u0001\u0000\u0000\u0000"+
		"t\u03e1\u0001\u0000\u0000\u0000v\u03e5\u0001\u0000\u0000\u0000x\u03e9"+
		"\u0001\u0000\u0000\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000"+
		"\u0000|\u007f\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001"+
		"\u0000\u0000\u0000~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u0080\u0081\u0005\u0000\u0000\u0001\u0081\u0001\u0001\u0000\u0000"+
		"\u0000\u0082\u0094\u0003D\"\u0000\u0083\u0094\u0003\n\u0005\u0000\u0084"+
		"\u0094\u0003\u0004\u0002\u0000\u0085\u0094\u0003\f\u0006\u0000\u0086\u0094"+
		"\u0003\u0010\b\u0000\u0087\u0094\u0003\u0012\t\u0000\u0088\u0094\u0003"+
		" \u0010\u0000\u0089\u0094\u0003\u0018\f\u0000\u008a\u0094\u0003(\u0014"+
		"\u0000\u008b\u0094\u00038\u001c\u0000\u008c\u0094\u0003:\u001d\u0000\u008d"+
		"\u0094\u0003.\u0017\u0000\u008e\u0094\u00034\u001a\u0000\u008f\u0094\u0003"+
		">\u001f\u0000\u0090\u0094\u0003@ \u0000\u0091\u0094\u0003F#\u0000\u0092"+
		"\u0094\u0003\u001c\u000e\u0000\u0093\u0082\u0001\u0000\u0000\u0000\u0093"+
		"\u0083\u0001\u0000\u0000\u0000\u0093\u0084\u0001\u0000\u0000\u0000\u0093"+
		"\u0085\u0001\u0000\u0000\u0000\u0093\u0086\u0001\u0000\u0000\u0000\u0093"+
		"\u0087\u0001\u0000\u0000\u0000\u0093\u0088\u0001\u0000\u0000\u0000\u0093"+
		"\u0089\u0001\u0000\u0000\u0000\u0093\u008a\u0001\u0000\u0000\u0000\u0093"+
		"\u008b\u0001\u0000\u0000\u0000\u0093\u008c\u0001\u0000\u0000\u0000\u0093"+
		"\u008d\u0001\u0000\u0000\u0000\u0093\u008e\u0001\u0000\u0000\u0000\u0093"+
		"\u008f\u0001\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0093\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0003\u0001\u0000\u0000\u0000\u0095\u0096\u0007\u0000\u0000\u0000\u0096"+
		"\u0097\u0005\u001b\u0000\u0000\u0097\u0098\u0005\u001d\u0000\u0000\u0098"+
		"\u0099\u0003\u0006\u0003\u0000\u0099\u009a\u0005\u001e\u0000\u0000\u009a"+
		"\u009b\u0005\u001c\u0000\u0000\u009b\u009c\u0003\n\u0005\u0000\u009c\u0005"+
		"\u0001\u0000\u0000\u0000\u009d\u00a2\u0003\b\u0004\u0000\u009e\u009f\u0005"+
		" \u0000\u0000\u009f\u00a1\u0003\b\u0004\u0000\u00a0\u009e\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u0005 \u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7\u0007\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005U\u0000\u0000"+
		"\u00a9\u00aa\u0005\"\u0000\u0000\u00aa\u00ae\u0001\u0000\u0000\u0000\u00ab"+
		"\u00af\u0003J%\u0000\u00ac\u00af\u0003P(\u0000\u00ad\u00af\u0003`0\u0000"+
		"\u00ae\u00ab\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\t\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\u0005\u0004\u0000\u0000\u00b1\u00b2\u0005\u000b\u0000\u0000\u00b2"+
		"\u00b3\u0005U\u0000\u0000\u00b3\u00b4\u0005\u001d\u0000\u0000\u00b4\u00b5"+
		"\u0003\u000e\u0007\u0000\u00b5\u00b6\u0005\u001e\u0000\u0000\u00b6\u000b"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u000b\u0000\u0000\u00b8\u00b9"+
		"\u0005U\u0000\u0000\u00b9\u00ba\u0005\u001d\u0000\u0000\u00ba\u00bb\u0003"+
		"\u000e\u0007\u0000\u00bb\u00bc\u0005\u001e\u0000\u0000\u00bc\r\u0001\u0000"+
		"\u0000\u0000\u00bd\u00c3\u0003\u0018\f\u0000\u00be\u00c3\u0003\u001c\u000e"+
		"\u0000\u00bf\u00c3\u0003\u001a\r\u0000\u00c0\u00c3\u0003&\u0013\u0000"+
		"\u00c1\u00c3\u0003(\u0014\u0000\u00c2\u00bd\u0001\u0000\u0000\u0000\u00c2"+
		"\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c5\u000f\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u0005\u0000\u0000\u00c8"+
		"\u00c9\u0005\u000b\u0000\u0000\u00c9\u00ca\u0005U\u0000\u0000\u00ca\u00cb"+
		"\u0005\u001d\u0000\u0000\u00cb\u00cc\u0003\u000e\u0007\u0000\u00cc\u00cd"+
		"\u0005\u001e\u0000\u0000\u00cd\u0011\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005\u0006\u0000\u0000\u00cf\u00d0\u0005U\u0000\u0000\u00d0\u00d1\u0005"+
		"\u001d\u0000\u0000\u00d1\u00d2\u0003\u0014\n\u0000\u00d2\u00d3\u0005\u001e"+
		"\u0000\u0000\u00d3\u0013\u0001\u0000\u0000\u0000\u00d4\u00d7\u0003\u0018"+
		"\f\u0000\u00d5\u00d7\u0003&\u0013\u0000\u00d6\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u0015\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0007\u0001\u0000\u0000\u00dc\u0017\u0001\u0000\u0000"+
		"\u0000\u00dd\u00df\u0005N\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000"+
		"\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e2\u0003\u0016\u000b\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e5\u00058\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e9\u0005U\u0000\u0000\u00e7\u00e8\u0005\"\u0000\u0000\u00e8\u00ea"+
		"\u0003\u001e\u000f\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea"+
		"\u0001\u0000\u0000\u0000\u00ea\u00ef\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005!\u0000\u0000\u00ec\u00f0\u0003H$\u0000\u00ed\u00ee\u0005!\u0000"+
		"\u0000\u00ee\u00f0\u00034\u001a\u0000\u00ef\u00eb\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005\u001f\u0000\u0000"+
		"\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u0019\u0001\u0000\u0000\u0000\u00f4\u00f6\u0005N\u0000\u0000\u00f5"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f7\u00f9\u00058\u0000\u0000\u00f8\u00f7"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005U\u0000\u0000\u00fb\u00fc\u0005"+
		"\"\u0000\u0000\u00fc\u00fd\u0003\u001e\u000f\u0000\u00fd\u00fe\u0005\u0019"+
		"\u0000\u0000\u00fe\u00ff\u0005\u001a\u0000\u0000\u00ff\u0100\u0005!\u0000"+
		"\u0000\u0100\u0109\u0005\u0019\u0000\u0000\u0101\u0106\u0003J%\u0000\u0102"+
		"\u0103\u0005 \u0000\u0000\u0103\u0105\u0003J%\u0000\u0104\u0102\u0001"+
		"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a\u0001"+
		"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0101\u0001"+
		"\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0005\u001a\u0000\u0000\u010c\u010d\u0005"+
		"\u001f\u0000\u0000\u010d\u011e\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"U\u0000\u0000\u010f\u0110\u0005!\u0000\u0000\u0110\u0119\u0005\u0019\u0000"+
		"\u0000\u0111\u0116\u0003J%\u0000\u0112\u0113\u0005 \u0000\u0000\u0113"+
		"\u0115\u0003J%\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0118\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000\u0000\u0118\u0116\u0001"+
		"\u0000\u0000\u0000\u0119\u0111\u0001\u0000\u0000\u0000\u0119\u011a\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"\u001a\u0000\u0000\u011c\u011e\u0005\u001f\u0000\u0000\u011d\u00f5\u0001"+
		"\u0000\u0000\u0000\u011d\u010e\u0001\u0000\u0000\u0000\u011e\u001b\u0001"+
		"\u0000\u0000\u0000\u011f\u0121\u0003\u0016\u000b\u0000\u0120\u011f\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0122\u0001"+
		"\u0000\u0000\u0000\u0122\u0123\u0005U\u0000\u0000\u0123\u0124\u0005\""+
		"\u0000\u0000\u0124\u0125\u0005U\u0000\u0000\u0125\u0156\u0005\u001f\u0000"+
		"\u0000\u0126\u0128\u0003\u0016\u000b\u0000\u0127\u0126\u0001\u0000\u0000"+
		"\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0005U\u0000\u0000\u012a\u012b\u0005\"\u0000\u0000"+
		"\u012b\u012c\u0005U\u0000\u0000\u012c\u012d\u0005!\u0000\u0000\u012d\u012e"+
		"\u0005P\u0000\u0000\u012e\u012f\u0005U\u0000\u0000\u012f\u013a\u0005\u001b"+
		"\u0000\u0000\u0130\u0135\u0003H$\u0000\u0131\u0132\u0005 \u0000\u0000"+
		"\u0132\u0134\u0003H$\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134\u0137"+
		"\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135"+
		"\u0001\u0000\u0000\u0000\u0138\u0130\u0001\u0000\u0000\u0000\u0139\u013c"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013a"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u001c\u0000\u0000\u013e\u0156"+
		"\u0005\u001f\u0000\u0000\u013f\u0141\u0003\u0016\u000b\u0000\u0140\u013f"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\u0005U\u0000\u0000\u0143\u0144\u0005"+
		"!\u0000\u0000\u0144\u0151\u0005\u001d\u0000\u0000\u0145\u0146\u0005U\u0000"+
		"\u0000\u0146\u0147\u0005\"\u0000\u0000\u0147\u014e\u0003J%\u0000\u0148"+
		"\u0149\u0005 \u0000\u0000\u0149\u014a\u0005U\u0000\u0000\u014a\u014b\u0005"+
		"\"\u0000\u0000\u014b\u014d\u0003J%\u0000\u014c\u0148\u0001\u0000\u0000"+
		"\u0000\u014d\u0150\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u0152\u0001\u0000\u0000"+
		"\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0151\u0145\u0001\u0000\u0000"+
		"\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000"+
		"\u0000\u0153\u0154\u0005\u001e\u0000\u0000\u0154\u0156\u0005\u001f\u0000"+
		"\u0000\u0155\u0120\u0001\u0000\u0000\u0000\u0155\u0127\u0001\u0000\u0000"+
		"\u0000\u0155\u0140\u0001\u0000\u0000\u0000\u0156\u001d\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0007\u0002\u0000\u0000\u0158\u001f\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005C\u0000\u0000\u015a\u015b\u0005U\u0000\u0000\u015b"+
		"\u015c\u0005\u001d\u0000\u0000\u015c\u015d\u0003\"\u0011\u0000\u015d\u015e"+
		"\u0005\u001e\u0000\u0000\u015e\u015f\u0005\u001f\u0000\u0000\u015f!\u0001"+
		"\u0000\u0000\u0000\u0160\u0165\u0003$\u0012\u0000\u0161\u0162\u0005 \u0000"+
		"\u0000\u0162\u0164\u0003$\u0012\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
		"\u0164\u0167\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000"+
		"\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000"+
		"\u0167\u0165\u0001\u0000\u0000\u0000\u0168\u016a\u0005 \u0000\u0000\u0169"+
		"\u0168\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"#\u0001\u0000\u0000\u0000\u016b\u016e\u0005U\u0000\u0000\u016c\u016d\u0005"+
		"!\u0000\u0000\u016d\u016f\u0003J%\u0000\u016e\u016c\u0001\u0000\u0000"+
		"\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f%\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0005\u0005\u0000\u0000\u0171\u0172\u0005U\u0000\u0000\u0172"+
		"\u017b\u0005\u001b\u0000\u0000\u0173\u0178\u0003*\u0015\u0000\u0174\u0175"+
		"\u0005 \u0000\u0000\u0175\u0177\u0003*\u0015\u0000\u0176\u0174\u0001\u0000"+
		"\u0000\u0000\u0177\u017a\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017c\u0001\u0000"+
		"\u0000\u0000\u017a\u0178\u0001\u0000\u0000\u0000\u017b\u0173\u0001\u0000"+
		"\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0005\u001c\u0000\u0000\u017e\u0181\u0005\"\u0000"+
		"\u0000\u017f\u0182\u0003\u001e\u000f\u0000\u0180\u0182\u0005=\u0000\u0000"+
		"\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0005\u001f\u0000\u0000"+
		"\u0184\'\u0001\u0000\u0000\u0000\u0185\u0186\u0007\u0003\u0000\u0000\u0186"+
		"\u018f\u0005\u001b\u0000\u0000\u0187\u018c\u0003*\u0015\u0000\u0188\u0189"+
		"\u0005 \u0000\u0000\u0189\u018b\u0003*\u0015\u0000\u018a\u0188\u0001\u0000"+
		"\u0000\u0000\u018b\u018e\u0001\u0000\u0000\u0000\u018c\u018a\u0001\u0000"+
		"\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u0190\u0001\u0000"+
		"\u0000\u0000\u018e\u018c\u0001\u0000\u0000\u0000\u018f\u0187\u0001\u0000"+
		"\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000"+
		"\u0000\u0000\u0191\u0197\u0005\u001c\u0000\u0000\u0192\u0195\u0005\"\u0000"+
		"\u0000\u0193\u0196\u0003\u001e\u000f\u0000\u0194\u0196\u0005=\u0000\u0000"+
		"\u0195\u0193\u0001\u0000\u0000\u0000\u0195\u0194\u0001\u0000\u0000\u0000"+
		"\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0192\u0001\u0000\u0000\u0000"+
		"\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000"+
		"\u0199\u01bc\u0003B!\u0000\u019a\u019b\u0007\u0003\u0000\u0000\u019b\u01a4"+
		"\u0005\u001b\u0000\u0000\u019c\u01a1\u0003*\u0015\u0000\u019d\u019e\u0005"+
		" \u0000\u0000\u019e\u01a0\u0003*\u0015\u0000\u019f\u019d\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a5\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u019c\u0001\u0000\u0000"+
		"\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01ac\u0005\u001c\u0000\u0000\u01a7\u01aa\u0005\"\u0000\u0000"+
		"\u01a8\u01ab\u0003\u001e\u000f\u0000\u01a9\u01ab\u0005=\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000\u01ab"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0001\u0000\u0000\u0000\u01ad\u01b8\u0001\u0000\u0000\u0000\u01ae"+
		"\u01b0\u0003\u0002\u0001\u0000\u01af\u01ae\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b4\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005@\u0000\u0000\u01b5\u01b6"+
		"\u0003H$\u0000\u01b6\u01b7\u0005\u001f\u0000\u0000\u01b7\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b1\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000\u01ba\u01bc\u0005\u001e"+
		"\u0000\u0000\u01bb\u0185\u0001\u0000\u0000\u0000\u01bb\u019a\u0001\u0000"+
		"\u0000\u0000\u01bc)\u0001\u0000\u0000\u0000\u01bd\u01c0\u0005U\u0000\u0000"+
		"\u01be\u01bf\u0005\"\u0000\u0000\u01bf\u01c1\u0003\u001e\u000f\u0000\u01c0"+
		"\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005!\u0000\u0000\u01c3\u01c5"+
		"\u0003J%\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5+\u0001\u0000\u0000\u0000\u01c6\u01c7\u0005U\u0000\u0000"+
		"\u01c7\u01d0\u0005\u001b\u0000\u0000\u01c8\u01cd\u0003H$\u0000\u01c9\u01ca"+
		"\u0005 \u0000\u0000\u01ca\u01cc\u0003H$\u0000\u01cb\u01c9\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cf\u0001\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1\u0001\u0000"+
		"\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01d0\u01c8\u0001\u0000"+
		"\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d4\u0005\u001c\u0000\u0000\u01d3\u01d5\u0005\u001f"+
		"\u0000\u0000\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d5-\u0001\u0000\u0000\u0000\u01d6\u01da\u0005U\u0000\u0000"+
		"\u01d7\u01da\u00034\u001a\u0000\u01d8\u01da\u00036\u001b\u0000\u01d9\u01d6"+
		"\u0001\u0000\u0000\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01d9\u01d8"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0005!\u0000\u0000\u01dc\u01dd\u0003H$\u0000\u01dd\u01de\u0005\u001f"+
		"\u0000\u0000\u01de/\u0001\u0000\u0000\u0000\u01df\u01e0\u0005I\u0000\u0000"+
		"\u01e0\u01e1\u0005%\u0000\u0000\u01e1\u01e2\u0005U\u0000\u0000\u01e2\u01e6"+
		"\u0005!\u0000\u0000\u01e3\u01e7\u00032\u0019\u0000\u01e4\u01e7\u00034"+
		"\u001a\u0000\u01e5\u01e7\u00036\u001b\u0000\u01e6\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000\u01e6\u01e5\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8\u01e9\u0005\u001f\u0000"+
		"\u0000\u01e91\u0001\u0000\u0000\u0000\u01ea\u01eb\u0005P\u0000\u0000\u01eb"+
		"\u01ec\u0005U\u0000\u0000\u01ec\u01f5\u0005\u001b\u0000\u0000\u01ed\u01f2"+
		"\u0003H$\u0000\u01ee\u01ef\u0005 \u0000\u0000\u01ef\u01f1\u0003H$\u0000"+
		"\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f2\u01f0\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000\u0000"+
		"\u01f5\u01ed\u0001\u0000\u0000\u0000\u01f5\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f6\u01f7\u0001\u0000\u0000\u0000\u01f7\u01f8\u0005\u001c\u0000\u0000"+
		"\u01f83\u0001\u0000\u0000\u0000\u01f9\u01ff\u0005I\u0000\u0000\u01fa\u01fd"+
		"\u0005%\u0000\u0000\u01fb\u01fe\u0005U\u0000\u0000\u01fc\u01fe\u0003,"+
		"\u0016\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fd\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fe\u0200\u0001\u0000\u0000\u0000\u01ff\u01fa\u0001\u0000"+
		"\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u02025\u0001\u0000\u0000"+
		"\u0000\u0203\u0206\u0005U\u0000\u0000\u0204\u0205\u0005%\u0000\u0000\u0205"+
		"\u0207\u0005U\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u02077\u0001\u0000\u0000\u0000\u0208\u0209\u0005"+
		"9\u0000\u0000\u0209\u020a\u0005\u001b\u0000\u0000\u020a\u020b\u0003H$"+
		"\u0000\u020b\u020c\u0005\u001c\u0000\u0000\u020c\u0210\u0003B!\u0000\u020d"+
		"\u020f\u0003<\u001e\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020f\u0212"+
		"\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211"+
		"\u0001\u0000\u0000\u0000\u0211\u0215\u0001\u0000\u0000\u0000\u0212\u0210"+
		"\u0001\u0000\u0000\u0000\u0213\u0214\u0005:\u0000\u0000\u0214\u0216\u0003"+
		"B!\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000"+
		"\u0000\u02169\u0001\u0000\u0000\u0000\u0217\u0218\u0005;\u0000\u0000\u0218"+
		"\u0219\u0005\u001b\u0000\u0000\u0219\u021a\u0003H$\u0000\u021a\u021b\u0005"+
		"\u001c\u0000\u0000\u021b\u021c\u0003B!\u0000\u021c;\u0001\u0000\u0000"+
		"\u0000\u021d\u021e\u0005:\u0000\u0000\u021e\u021f\u00059\u0000\u0000\u021f"+
		"\u0220\u0005\u001b\u0000\u0000\u0220\u0221\u0003H$\u0000\u0221\u0222\u0005"+
		"\u001c\u0000\u0000\u0222\u0223\u0003B!\u0000\u0223=\u0001\u0000\u0000"+
		"\u0000\u0224\u0225\u0005<\u0000\u0000\u0225\u0226\u0005\u001f\u0000\u0000"+
		"\u0226?\u0001\u0000\u0000\u0000\u0227\u0228\u0005>\u0000\u0000\u0228\u0229"+
		"\u0005\u001f\u0000\u0000\u0229A\u0001\u0000\u0000\u0000\u022a\u022e\u0005"+
		"\u001d\u0000\u0000\u022b\u022d\u0003\u0002\u0001\u0000\u022c\u022b\u0001"+
		"\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000\u022e\u022c\u0001"+
		"\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0231\u0001"+
		"\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0231\u0232\u0005"+
		"\u001e\u0000\u0000\u0232C\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u0003"+
		"\u0000\u0000\u0234\u0235\u0005\u001d\u0000\u0000\u0235\u023a\u0005U\u0000"+
		"\u0000\u0236\u0237\u0005 \u0000\u0000\u0237\u0239\u0005U\u0000\u0000\u0238"+
		"\u0236\u0001\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a"+
		"\u0238\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b"+
		"\u023d\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0005\u001e\u0000\u0000\u023e\u023f\u0005A\u0000\u0000\u023f\u0240"+
		"\u0005R\u0000\u0000\u0240\u024e\u0005\u001f\u0000\u0000\u0241\u0242\u0005"+
		"\u0003\u0000\u0000\u0242\u0243\u0005U\u0000\u0000\u0243\u0244\u0005A\u0000"+
		"\u0000\u0244\u0245\u0005R\u0000\u0000\u0245\u024e\u0005\u001f\u0000\u0000"+
		"\u0246\u0247\u0005\u0003\u0000\u0000\u0247\u0248\u0005a\u0000\u0000\u0248"+
		"\u0249\u0005b\u0000\u0000\u0249\u024a\u0005U\u0000\u0000\u024a\u024b\u0005"+
		"A\u0000\u0000\u024b\u024c\u0005R\u0000\u0000\u024c\u024e\u0005\u001f\u0000"+
		"\u0000\u024d\u0233\u0001\u0000\u0000\u0000\u024d\u0241\u0001\u0000\u0000"+
		"\u0000\u024d\u0246\u0001\u0000\u0000\u0000\u024eE\u0001\u0000\u0000\u0000"+
		"\u024f\u0250\u0005\t\u0000\u0000\u0250\u0251\u0005%\u0000\u0000\u0251"+
		"\u0252\u0005\n\u0000\u0000\u0252\u0253\u0005\u001b\u0000\u0000\u0253\u0254"+
		"\u0003H$\u0000\u0254\u0256\u0005\u001c\u0000\u0000\u0255\u0257\u0005\u001f"+
		"\u0000\u0000\u0256\u0255\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000"+
		"\u0000\u0000\u0257G\u0001\u0000\u0000\u0000\u0258\u0259\u0006$\uffff\uffff"+
		"\u0000\u0259\u025a\u0005\u001b\u0000\u0000\u025a\u025b\u0003H$\u0000\u025b"+
		"\u025c\u0005\u001c\u0000\u0000\u025c\u027c\u0001\u0000\u0000\u0000\u025d"+
		"\u025e\u0005U\u0000\u0000\u025e\u025f\u0005\u0019\u0000\u0000\u025f\u0260"+
		"\u0003H$\u0000\u0260\u0261\u0005\u001a\u0000\u0000\u0261\u027c\u0001\u0000"+
		"\u0000\u0000\u0262\u0263\u0005U\u0000\u0000\u0263\u0264\u0005%\u0000\u0000"+
		"\u0264\u0269\u0005U\u0000\u0000\u0265\u0266\u0005%\u0000\u0000\u0266\u0268"+
		"\u0003H$\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000"+
		"\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000"+
		"\u0000\u0000\u026a\u027c\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000"+
		"\u0000\u0000\u026c\u026d\u0005U\u0000\u0000\u026d\u026e\u0005\u0019\u0000"+
		"\u0000\u026e\u026f\u0005Q\u0000\u0000\u026f\u0270\u0005\u001a\u0000\u0000"+
		"\u0270\u0271\u0005%\u0000\u0000\u0271\u027c\u0005U\u0000\u0000\u0272\u027c"+
		"\u0003,\u0016\u0000\u0273\u027c\u0003J%\u0000\u0274\u027c\u0005U\u0000"+
		"\u0000\u0275\u027c\u0005I\u0000\u0000\u0276\u0277\u0005I\u0000\u0000\u0277"+
		"\u0278\u0005%\u0000\u0000\u0278\u0279\u0005U\u0000\u0000\u0279\u027a\u0005"+
		"%\u0000\u0000\u027a\u027c\u0005U\u0000\u0000\u027b\u0258\u0001\u0000\u0000"+
		"\u0000\u027b\u025d\u0001\u0000\u0000\u0000\u027b\u0262\u0001\u0000\u0000"+
		"\u0000\u027b\u026c\u0001\u0000\u0000\u0000\u027b\u0272\u0001\u0000\u0000"+
		"\u0000\u027b\u0273\u0001\u0000\u0000\u0000\u027b\u0274\u0001\u0000\u0000"+
		"\u0000\u027b\u0275\u0001\u0000\u0000\u0000\u027b\u0276\u0001\u0000\u0000"+
		"\u0000\u027c\u029e\u0001\u0000\u0000\u0000\u027d\u027e\n\u0011\u0000\u0000"+
		"\u027e\u027f\u0007\u0004\u0000\u0000\u027f\u029d\u0003H$\u0012\u0280\u0281"+
		"\n\u0010\u0000\u0000\u0281\u0282\u0007\u0005\u0000\u0000\u0282\u029d\u0003"+
		"H$\u0011\u0283\u0284\n\u000f\u0000\u0000\u0284\u0285\u0007\u0006\u0000"+
		"\u0000\u0285\u029d\u0003H$\u0010\u0286\u0287\n\u000e\u0000\u0000\u0287"+
		"\u0288\u00054\u0000\u0000\u0288\u029d\u0003H$\u000f\u0289\u028a\n\r\u0000"+
		"\u0000\u028a\u028b\u00055\u0000\u0000\u028b\u029d\u0003H$\u000e\u028c"+
		"\u028d\n\u000b\u0000\u0000\u028d\u028e\u0005#\u0000\u0000\u028e\u028f"+
		"\u0003H$\u0000\u028f\u0290\u0005\"\u0000\u0000\u0290\u0291\u0003H$\f\u0291"+
		"\u029d\u0001\u0000\u0000\u0000\u0292\u0293\n\n\u0000\u0000\u0293\u0294"+
		"\u0005!\u0000\u0000\u0294\u0295\u0005.\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296\u029d\u0003H$\u000b\u0297\u0298\n\t\u0000\u0000\u0298"+
		"\u0299\u0005!\u0000\u0000\u0299\u029a\u0005!\u0000\u0000\u029a\u029b\u0005"+
		"!\u0000\u0000\u029b\u029d\u0003H$\n\u029c\u027d\u0001\u0000\u0000\u0000"+
		"\u029c\u0280\u0001\u0000\u0000\u0000\u029c\u0283\u0001\u0000\u0000\u0000"+
		"\u029c\u0286\u0001\u0000\u0000\u0000\u029c\u0289\u0001\u0000\u0000\u0000"+
		"\u029c\u028c\u0001\u0000\u0000\u0000\u029c\u0292\u0001\u0000\u0000\u0000"+
		"\u029c\u0297\u0001\u0000\u0000\u0000\u029d\u02a0\u0001\u0000\u0000\u0000"+
		"\u029e\u029c\u0001\u0000\u0000\u0000\u029e\u029f\u0001\u0000\u0000\u0000"+
		"\u029fI\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a8\u0005Q\u0000\u0000\u02a2\u02a8\u0005R\u0000\u0000\u02a3\u02a8\u0005"+
		"S\u0000\u0000\u02a4\u02a8\u0003N\'\u0000\u02a5\u02a8\u0003L&\u0000\u02a6"+
		"\u02a8\u0005B\u0000\u0000\u02a7\u02a1\u0001\u0000\u0000\u0000\u02a7\u02a2"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a3\u0001\u0000\u0000\u0000\u02a7\u02a4"+
		"\u0001\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a7\u02a6"+
		"\u0001\u0000\u0000\u0000\u02a8K\u0001\u0000\u0000\u0000\u02a9\u02ba\u0005"+
		"\u001d\u0000\u0000\u02aa\u02ab\u0005U\u0000\u0000\u02ab\u02ac\u0005\""+
		"\u0000\u0000\u02ac\u02b7\u0003J%\u0000\u02ad\u02ae\u0005 \u0000\u0000"+
		"\u02ae\u02af\u0005U\u0000\u0000\u02af\u02b0\u0005\"\u0000\u0000\u02b0"+
		"\u02b1\u0003J%\u0000\u02b1\u02b3\u0001\u0000\u0000\u0000\u02b2\u02b4\u0005"+
		" \u0000\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b6\u0001\u0000\u0000\u0000\u02b5\u02ad\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b9\u0001\u0000\u0000\u0000\u02b7\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02bb\u0001\u0000"+
		"\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000\u02ba\u02aa\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0001\u0000"+
		"\u0000\u0000\u02bc\u02bd\u0005\u001e\u0000\u0000\u02bdM\u0001\u0000\u0000"+
		"\u0000\u02be\u02c7\u0005\u0019\u0000\u0000\u02bf\u02c4\u0003J%\u0000\u02c0"+
		"\u02c1\u0005 \u0000\u0000\u02c1\u02c3\u0003J%\u0000\u02c2\u02c0\u0001"+
		"\u0000\u0000\u0000\u02c3\u02c6\u0001\u0000\u0000\u0000\u02c4\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c4\u02c5\u0001\u0000\u0000\u0000\u02c5\u02c8\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c4\u0001\u0000\u0000\u0000\u02c7\u02bf\u0001"+
		"\u0000\u0000\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02c9\u0001"+
		"\u0000\u0000\u0000\u02c9\u02ca\u0005\u001a\u0000\u0000\u02caO\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0005T\u0000\u0000\u02cc\u02cd\u0003R)\u0000"+
		"\u02cd\u02ce\u0005T\u0000\u0000\u02ceQ\u0001\u0000\u0000\u0000\u02cf\u02d1"+
		"\u0003T*\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000"+
		"\u0000\u0000\u02d3\u02f7\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005U\u0000"+
		"\u0000\u02d5\u02d6\u0005\u001b\u0000\u0000\u02d6\u02d7\u0003R)\u0000\u02d7"+
		"\u02d8\u0005\u001c\u0000\u0000\u02d8\u02f7\u0001\u0000\u0000\u0000\u02d9"+
		"\u02db\u0005$\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd"+
		"\u00056\u0000\u0000\u02dd\u02de\u0003H$\u0000\u02de\u02df\u00057\u0000"+
		"\u0000\u02df\u02f7\u0001\u0000\u0000\u0000\u02e0\u02e2\u0005Q\u0000\u0000"+
		"\u02e1\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e4\u02e6\u0001\u0000\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e6\u02ea\u0005U\u0000\u0000\u02e7\u02e9\u0005Q\u0000\u0000\u02e8\u02e7"+
		"\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8"+
		"\u0001\u0000\u0000\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02f7"+
		"\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ee"+
		"\u0005\u0019\u0000\u0000\u02ee\u02ef\u0005\u001b\u0000\u0000\u02ef\u02f0"+
		"\u0005U\u0000\u0000\u02f0\u02f1\u0005\u001c\u0000\u0000\u02f1\u02f2\u0005"+
		"\u001a\u0000\u0000\u02f2\u02f3\u0005!\u0000\u0000\u02f3\u02f7\u0005U\u0000"+
		"\u0000\u02f4\u02f7\u0005\'\u0000\u0000\u02f5\u02f7\u0005&\u0000\u0000"+
		"\u02f6\u02d0\u0001\u0000\u0000\u0000\u02f6\u02d4\u0001\u0000\u0000\u0000"+
		"\u02f6\u02da\u0001\u0000\u0000\u0000\u02f6\u02e3\u0001\u0000\u0000\u0000"+
		"\u02f6\u02ed\u0001\u0000\u0000\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000"+
		"\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001\u0000\u0000\u0000"+
		"\u02f9S\u0001\u0000\u0000\u0000\u02fa\u02fb\u0005-\u0000\u0000\u02fb\u02fd"+
		"\u0003V+\u0000\u02fc\u02fe\u0003X,\u0000\u02fd\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000"+
		"\u0000\u02ff\u0301\u0005.\u0000\u0000\u0300\u0302\u0003R)\u0000\u0301"+
		"\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302"+
		"\u0303\u0001\u0000\u0000\u0000\u0303\u0304\u0005-\u0000\u0000\u0304\u0305"+
		"\u0005*\u0000\u0000\u0305\u0306\u0003V+\u0000\u0306\u0307\u0005.\u0000"+
		"\u0000\u0307\u0327\u0001\u0000\u0000\u0000\u0308\u0309\u0005-\u0000\u0000"+
		"\u0309\u030b\u0003V+\u0000\u030a\u030c\u0003X,\u0000\u030b\u030a\u0001"+
		"\u0000\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030d\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0005.\u0000\u0000\u030e\u0327\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0005-\u0000\u0000\u0310\u0311\u0003V+\u0000"+
		"\u0311\u0312\u0003X,\u0000\u0312\u0313\u0005*\u0000\u0000\u0313\u0314"+
		"\u0005.\u0000\u0000\u0314\u0327\u0001\u0000\u0000\u0000\u0315\u0316\u0005"+
		"-\u0000\u0000\u0316\u0318\u0003V+\u0000\u0317\u0319\u0005W\u0000\u0000"+
		"\u0318\u0317\u0001\u0000\u0000\u0000\u0318\u0319\u0001\u0000\u0000\u0000"+
		"\u0319\u031b\u0001\u0000\u0000\u0000\u031a\u031c\u0003X,\u0000\u031b\u031a"+
		"\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000\u0000\u031c\u031d"+
		"\u0001\u0000\u0000\u0000\u031d\u031f\u0005.\u0000\u0000\u031e\u0320\u0003"+
		"R)\u0000\u031f\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000"+
		"\u0000\u0320\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0005-\u0000\u0000"+
		"\u0322\u0323\u0005*\u0000\u0000\u0323\u0324\u0003V+\u0000\u0324\u0325"+
		"\u0005.\u0000\u0000\u0325\u0327\u0001\u0000\u0000\u0000\u0326\u02fa\u0001"+
		"\u0000\u0000\u0000\u0326\u0308\u0001\u0000\u0000\u0000\u0326\u030f\u0001"+
		"\u0000\u0000\u0000\u0326\u0315\u0001\u0000\u0000\u0000\u0327U\u0001\u0000"+
		"\u0000\u0000\u0328\u0329\u0007\u0007\u0000\u0000\u0329W\u0001\u0000\u0000"+
		"\u0000\u032a\u032c\u0003Z-\u0000\u032b\u032a\u0001\u0000\u0000\u0000\u032c"+
		"\u032f\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d"+
		"\u032e\u0001\u0000\u0000\u0000\u032eY\u0001\u0000\u0000\u0000\u032f\u032d"+
		"\u0001\u0000\u0000\u0000\u0330\u0361\u0005U\u0000\u0000\u0331\u0361\u0003"+
		"x<\u0000\u0332\u0361\u0003v;\u0000\u0333\u0361\u0003h4\u0000\u0334\u0361"+
		"\u0003j5\u0000\u0335\u0361\u0005\u000b\u0000\u0000\u0336\u0343\u0005\u0019"+
		"\u0000\u0000\u0337\u0344\u0005U\u0000\u0000\u0338\u033c\u0005U\u0000\u0000"+
		"\u0339\u033c\u0001\u0000\u0000\u0000\u033a\u033c\u0005\u000b\u0000\u0000"+
		"\u033b\u0338\u0001\u0000\u0000\u0000\u033b\u0339\u0001\u0000\u0000\u0000"+
		"\u033b\u033a\u0001\u0000\u0000\u0000\u033c\u0340\u0001\u0000\u0000\u0000"+
		"\u033d\u033f\u0003\\.\u0000\u033e\u033d\u0001\u0000\u0000\u0000\u033f"+
		"\u0342\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0340"+
		"\u0341\u0001\u0000\u0000\u0000\u0341\u0344\u0001\u0000\u0000\u0000\u0342"+
		"\u0340\u0001\u0000\u0000\u0000\u0343\u0337\u0001\u0000\u0000\u0000\u0343"+
		"\u033b\u0001\u0000\u0000\u0000\u0344\u0345\u0001\u0000\u0000\u0000\u0345"+
		"\u0361\u0005\u001a\u0000\u0000\u0346\u0347\u0005\u0019\u0000\u0000\u0347"+
		"\u0354\u0005\u001b\u0000\u0000\u0348\u0355\u0005U\u0000\u0000\u0349\u034d"+
		"\u0005U\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u034d\u0005"+
		"\u000b\u0000\u0000\u034c\u0349\u0001\u0000\u0000\u0000\u034c\u034a\u0001"+
		"\u0000\u0000\u0000\u034c\u034b\u0001\u0000\u0000\u0000\u034d\u0351\u0001"+
		"\u0000\u0000\u0000\u034e\u0350\u0003\\.\u0000\u034f\u034e\u0001\u0000"+
		"\u0000\u0000\u0350\u0353\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000"+
		"\u0000\u0000\u0351\u0352\u0001\u0000\u0000\u0000\u0352\u0355\u0001\u0000"+
		"\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0354\u0348\u0001\u0000"+
		"\u0000\u0000\u0354\u034c\u0001\u0000\u0000\u0000\u0355\u0356\u0001\u0000"+
		"\u0000\u0000\u0356\u0357\u0005\u001c\u0000\u0000\u0357\u0361\u0005\u001a"+
		"\u0000\u0000\u0358\u035c\u0005\u001b\u0000\u0000\u0359\u035d\u0005U\u0000"+
		"\u0000\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u035d\u0005\u000b\u0000"+
		"\u0000\u035c\u0359\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000"+
		"\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035d\u035e\u0001\u0000\u0000"+
		"\u0000\u035e\u0361\u0005\u001c\u0000\u0000\u035f\u0361\u0005(\u0000\u0000"+
		"\u0360\u0330\u0001\u0000\u0000\u0000\u0360\u0331\u0001\u0000\u0000\u0000"+
		"\u0360\u0332\u0001\u0000\u0000\u0000\u0360\u0333\u0001\u0000\u0000\u0000"+
		"\u0360\u0334\u0001\u0000\u0000\u0000\u0360\u0335\u0001\u0000\u0000\u0000"+
		"\u0360\u0336\u0001\u0000\u0000\u0000\u0360\u0346\u0001\u0000\u0000\u0000"+
		"\u0360\u0358\u0001\u0000\u0000\u0000\u0360\u035f\u0001\u0000\u0000\u0000"+
		"\u0361\u0364\u0001\u0000\u0000\u0000\u0362\u0363\u0005!\u0000\u0000\u0363"+
		"\u0365\u0003^/\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001"+
		"\u0000\u0000\u0000\u0365[\u0001\u0000\u0000\u0000\u0366\u0367\u0005%\u0000"+
		"\u0000\u0367\u036f\u0005U\u0000\u0000\u0368\u0369\u0005\u0019\u0000\u0000"+
		"\u0369\u036a\u0003H$\u0000\u036a\u036b\u0005\u001a\u0000\u0000\u036b\u036f"+
		"\u0001\u0000\u0000\u0000\u036c\u036d\u0005%\u0000\u0000\u036d\u036f\u0003"+
		",\u0016\u0000\u036e\u0366\u0001\u0000\u0000\u0000\u036e\u0368\u0001\u0000"+
		"\u0000\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036f]\u0001\u0000\u0000"+
		"\u0000\u0370\u0373\u0003J%\u0000\u0371\u0373\u0003H$\u0000\u0372\u0370"+
		"\u0001\u0000\u0000\u0000\u0372\u0371\u0001\u0000\u0000\u0000\u0373_\u0001"+
		"\u0000\u0000\u0000\u0374\u0375\u0005\u0019\u0000\u0000\u0375\u0379\u0005"+
		"T\u0000\u0000\u0376\u0378\u0003b1\u0000\u0377\u0376\u0001\u0000\u0000"+
		"\u0000\u0378\u037b\u0001\u0000\u0000\u0000\u0379\u0377\u0001\u0000\u0000"+
		"\u0000\u0379\u037a\u0001\u0000\u0000\u0000\u037a\u037c\u0001\u0000\u0000"+
		"\u0000\u037b\u0379\u0001\u0000\u0000\u0000\u037c\u037d\u0005T\u0000\u0000"+
		"\u037d\u037e\u0005\u001a\u0000\u0000\u037ea\u0001\u0000\u0000\u0000\u037f"+
		"\u0381\u0005%\u0000\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381"+
		"\u0001\u0000\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0387"+
		"\u0005U\u0000\u0000\u0383\u0384\u0005\"\u0000\u0000\u0384\u0386\u0005"+
		"U\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0386\u0389\u0001\u0000"+
		"\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000\u0387\u0388\u0001\u0000"+
		"\u0000\u0000\u0388\u038a\u0001\u0000\u0000\u0000\u0389\u0387\u0001\u0000"+
		"\u0000\u0000\u038a\u038e\u0005\u001d\u0000\u0000\u038b\u038d\u0003d2\u0000"+
		"\u038c\u038b\u0001\u0000\u0000\u0000\u038d\u0390\u0001\u0000\u0000\u0000"+
		"\u038e\u038c\u0001\u0000\u0000\u0000\u038e\u038f\u0001\u0000\u0000\u0000"+
		"\u038f\u0391\u0001\u0000\u0000\u0000\u0390\u038e\u0001\u0000\u0000\u0000"+
		"\u0391\u0392\u0005\u001e\u0000\u0000\u0392c\u0001\u0000\u0000\u0000\u0393"+
		"\u0394\u0005U\u0000\u0000\u0394\u03a0\u0005\"\u0000\u0000\u0395\u0397"+
		"\u0005W\u0000\u0000\u0396\u0398\u0007\b\u0000\u0000\u0397\u0396\u0001"+
		"\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u0397\u0001"+
		"\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u03a1\u0001"+
		"\u0000\u0000\u0000\u039b\u039d\u0007\b\u0000\u0000\u039c\u039e\u0007\t"+
		"\u0000\u0000\u039d\u039c\u0001\u0000\u0000\u0000\u039d\u039e\u0001\u0000"+
		"\u0000\u0000\u039e\u03a1\u0001\u0000\u0000\u0000\u039f\u03a1\u0003,\u0016"+
		"\u0000\u03a0\u0395\u0001\u0000\u0000\u0000\u03a0\u039b\u0001\u0000\u0000"+
		"\u0000\u03a0\u039f\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000"+
		"\u0000\u03a2\u03a0\u0001\u0000\u0000\u0000\u03a2\u03a3\u0001\u0000\u0000"+
		"\u0000\u03a3\u03b6\u0001\u0000\u0000\u0000\u03a4\u03b0\u0005 \u0000\u0000"+
		"\u03a5\u03a7\u0005W\u0000\u0000\u03a6\u03a8\u0007\b\u0000\u0000\u03a7"+
		"\u03a6\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000\u0000\u03a9"+
		"\u03a7\u0001\u0000\u0000\u0000\u03a9\u03aa\u0001\u0000\u0000\u0000\u03aa"+
		"\u03b1\u0001\u0000\u0000\u0000\u03ab\u03ad\u0007\b\u0000\u0000\u03ac\u03ae"+
		"\u0007\t\u0000\u0000\u03ad\u03ac\u0001\u0000\u0000\u0000\u03ad\u03ae\u0001"+
		"\u0000\u0000\u0000\u03ae\u03b1\u0001\u0000\u0000\u0000\u03af\u03b1\u0003"+
		",\u0016\u0000\u03b0\u03a5\u0001\u0000\u0000\u0000\u03b0\u03ab\u0001\u0000"+
		"\u0000\u0000\u03b0\u03af\u0001\u0000\u0000\u0000\u03b1\u03b2\u0001\u0000"+
		"\u0000\u0000\u03b2\u03b0\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001\u0000"+
		"\u0000\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u03a4\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b8\u0001\u0000\u0000\u0000\u03b6\u03b4\u0001\u0000"+
		"\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7\u03b9\u0001\u0000"+
		"\u0000\u0000\u03b8\u03b6\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005\u001f"+
		"\u0000\u0000\u03bae\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005\u0010\u0000"+
		"\u0000\u03bc\u03bd\u0005!\u0000\u0000\u03bd\u03be\u0005\u001d\u0000\u0000"+
		"\u03be\u03bf\u0003H$\u0000\u03bf\u03c0\u0005\u001e\u0000\u0000\u03c0g"+
		"\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005\u001b\u0000\u0000\u03c2\u03c3"+
		"\u0005\u0013\u0000\u0000\u03c3\u03c4\u0005\u001c\u0000\u0000\u03c4\u03c5"+
		"\u0005!\u0000\u0000\u03c5\u03c6\u0005R\u0000\u0000\u03c6i\u0001\u0000"+
		"\u0000\u0000\u03c7\u03c8\u0005\u001b\u0000\u0000\u03c8\u03c9\u0005\u0014"+
		"\u0000\u0000\u03c9\u03ca\u0005\u001c\u0000\u0000\u03ca\u03cb\u0005!\u0000"+
		"\u0000\u03cb\u03cc\u0005R\u0000\u0000\u03cck\u0001\u0000\u0000\u0000\u03cd"+
		"\u03ce\u0005\u001b\u0000\u0000\u03ce\u03cf\u0005\u0012\u0000\u0000\u03cf"+
		"\u03d0\u0005\u001c\u0000\u0000\u03d0\u03d1\u0005!\u0000\u0000\u03d1\u03d2"+
		"\u0005R\u0000\u0000\u03d2m\u0001\u0000\u0000\u0000\u03d3\u03d4\u0005c"+
		"\u0000\u0000\u03d4\u03d5\u0005!\u0000\u0000\u03d5\u03d6\u0005\u001d\u0000"+
		"\u0000\u03d6\u03d7\u0003H$\u0000\u03d7\u03d8\u0005\u001e\u0000\u0000\u03d8"+
		"o\u0001\u0000\u0000\u0000\u03d9\u03da\u0005\u0016\u0000\u0000\u03da\u03db"+
		"\u0005!\u0000\u0000\u03db\u03dc\u0005R\u0000\u0000\u03dcq\u0001\u0000"+
		"\u0000\u0000\u03dd\u03de\u0005\u0017\u0000\u0000\u03de\u03df\u0005!\u0000"+
		"\u0000\u03df\u03e0\u0005R\u0000\u0000\u03e0s\u0001\u0000\u0000\u0000\u03e1"+
		"\u03e2\u0005\u0018\u0000\u0000\u03e2\u03e3\u0005!\u0000\u0000\u03e3\u03e4"+
		"\u0007\n\u0000\u0000\u03e4u\u0001\u0000\u0000\u0000\u03e5\u03e6\u0005"+
		"\u0002\u0000\u0000\u03e6\u03e7\u0005!\u0000\u0000\u03e7\u03e8\u0003H$"+
		"\u0000\u03e8w\u0001\u0000\u0000\u0000\u03e9\u03ea\u0005\u0001\u0000\u0000"+
		"\u03ea\u03eb\u0005!\u0000\u0000\u03eb\u03ec\u0003H$\u0000\u03ecy\u0001"+
		"\u0000\u0000\u0000q}\u0093\u00a2\u00a6\u00ae\u00c2\u00c4\u00d6\u00d8\u00de"+
		"\u00e1\u00e4\u00e9\u00ef\u00f2\u00f5\u00f8\u0106\u0109\u0116\u0119\u011d"+
		"\u0120\u0127\u0135\u013a\u0140\u014e\u0151\u0155\u0165\u0169\u016e\u0178"+
		"\u017b\u0181\u018c\u018f\u0195\u0197\u01a1\u01a4\u01aa\u01ac\u01b1\u01b8"+
		"\u01bb\u01c0\u01c4\u01cd\u01d0\u01d4\u01d9\u01e6\u01f2\u01f5\u01fd\u0201"+
		"\u0206\u0210\u0215\u022e\u023a\u024d\u0256\u0269\u027b\u029c\u029e\u02a7"+
		"\u02b3\u02b7\u02ba\u02c4\u02c7\u02d2\u02da\u02e3\u02ea\u02f6\u02f8\u02fd"+
		"\u0301\u030b\u0318\u031b\u031f\u0326\u032d\u033b\u0340\u0343\u034c\u0351"+
		"\u0354\u035c\u0360\u0364\u036e\u0372\u0379\u0380\u0387\u038e\u0399\u039d"+
		"\u03a0\u03a2\u03a9\u03ad\u03b0\u03b2\u03b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}