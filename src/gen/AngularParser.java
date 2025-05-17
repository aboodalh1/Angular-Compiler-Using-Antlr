// Generated from D:/Spring projects/Learn/angular_compiler/src/AngularParser.g4 by ANTLR 4.13.2
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
		Extends=7, Implements=8, Console=9, Log=10, Component=11, Service=12, 
		Class=13, InlineAttributeName=14, BackgroundColorAttributeName=15, TextColorAttributeName=16, 
		TypeAttributeName=17, LabelAttributeName=18, ValueAttributeName=19, PlaceHolderAttributeName=20, 
		CheckedAttributeName=21, TargetAttributeName=22, OnSubmitAttributeName=23, 
		OnChangeAttributeName=24, OnClickAttributeName=25, HeadingLevelAttributeName=26, 
		DirectionAttributeName=27, DurationAttributeName=28, RepeatAttributeName=29, 
		OpenBracket=30, CloseBracket=31, OpenParen=32, CloseParen=33, OpenBrace=34, 
		CloseBrace=35, SemiColon=36, Comma=37, Assign=38, Colon=39, QuestionMark=40, 
		Dot=41, Plus=42, Minus=43, Multiply=44, At=45, Divide=46, Modulus=47, 
		Not=48, LessThan=49, GreaterThan=50, LessThanEquals=51, GreaterThanEquals=52, 
		NOT_EQUAL=53, WeakEqual=54, StrongEqual=55, And=56, Or=57, AngularExpressionStart=58, 
		AngularExpressionEnd=59, Let_Identify=60, If=61, Else=62, While=63, Break=64, 
		Void=65, Continue=66, Function=67, Return=68, From=69, Null=70, Enum=71, 
		Array=72, Any=73, TypeNumber=74, TypeString=75, TypeBoolean=76, This=77, 
		Constructor=78, Private=79, Public=80, Static=81, Protected=82, New=83, 
		NumberLiteral=84, StringLiteral=85, BooleanLiteral=86, Backtick=87, Identifier=88, 
		CssPixel=89, SingleLineComment=90, MultiLineComment=91, WS=92, HtmlClassAttribute=93, 
		GapAttributeName=94;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_component = 2, RULE_exportClass = 3, 
		RULE_class = 4, RULE_classBody = 5, RULE_decorator = 6, RULE_argumentList = 7, 
		RULE_argument = 8, RULE_importStatement = 9, RULE_thisVarible = 10, RULE_enum = 11, 
		RULE_enumValues = 12, RULE_enumValue = 13, RULE_consoleLog = 14, RULE_abstractClass = 15, 
		RULE_interface = 16, RULE_accessModifier = 17, RULE_variableDeclaration = 18, 
		RULE_arrayDeclaration = 19, RULE_abstractFunctionDeclaration = 20, RULE_functionDeclaration = 21, 
		RULE_objectDeclataion = 22, RULE_type = 23, RULE_literalValue = 24, RULE_mapLiteral = 25, 
		RULE_listLiteral = 26, RULE_assignmentStatement = 27, RULE_ifStatement = 28, 
		RULE_whileStatement = 29, RULE_elseIfStatement = 30, RULE_breakStatement = 31, 
		RULE_continueStatement = 32, RULE_block = 33, RULE_expression = 34, RULE_parameter = 35, 
		RULE_function_call = 36, RULE_html = 37, RULE_html_content = 38, RULE_html_element = 39, 
		RULE_html_tag_name = 40, RULE_html_attributes = 41, RULE_html_attribute = 42, 
		RULE_access_suffix = 43, RULE_html_attribute_value = 44, RULE_css = 45, 
		RULE_css_content = 46, RULE_css_class_content = 47, RULE_checkedAttribute = 48, 
		RULE_onChangeAttribute = 49, RULE_onClickAttribute = 50, RULE_onSubmitAttribute = 51, 
		RULE_gapAttribute = 52, RULE_directionAttribute = 53, RULE_durationAttribute = 54, 
		RULE_repeatAttribute = 55, RULE_ngForAttribute = 56, RULE_ngIfAttribute = 57;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "component", "exportClass", "class", "classBody", 
			"decorator", "argumentList", "argument", "importStatement", "thisVarible", 
			"enum", "enumValues", "enumValue", "consoleLog", "abstractClass", "interface", 
			"accessModifier", "variableDeclaration", "arrayDeclaration", "abstractFunctionDeclaration", 
			"functionDeclaration", "objectDeclataion", "type", "literalValue", "mapLiteral", 
			"listLiteral", "assignmentStatement", "ifStatement", "whileStatement", 
			"elseIfStatement", "breakStatement", "continueStatement", "block", "expression", 
			"parameter", "function_call", "html", "html_content", "html_element", 
			"html_tag_name", "html_attributes", "html_attribute", "access_suffix", 
			"html_attribute_value", "css", "css_content", "css_class_content", "checkedAttribute", 
			"onChangeAttribute", "onClickAttribute", "onSubmitAttribute", "gapAttribute", 
			"directionAttribute", "durationAttribute", "repeatAttribute", "ngForAttribute", 
			"ngIfAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngIf'", "'*ngFor'", "'import'", "'export'", "'abstract'", "'interface'", 
			"'extends'", "'implements'", "'console'", "'log'", "'@Component'", "'@Injectable'", 
			"'class'", "'inline'", "'backgroundColor'", "'textColor'", "'type'", 
			"'label'", "'value'", "'placeholder'", "'chacked'", "'target'", "'submit'", 
			"'change'", "'click'", "'level'", "'direction'", "'duration'", "'repeat'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "':'", 
			"'?'", "'.'", "'+'", "'-'", "'*'", "'@'", "'/'", "'%'", "'!'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'==='", "'&&'", "'||'", "'{{'", 
			"'}}'", "'let'", "'if'", "'else'", "'while'", "'break'", "'void'", "'continue'", 
			"'function'", "'return'", "'from'", "'null'", "'enum'", "'Array'", "'any'", 
			"'number'", "'string'", "'boolean'", "'this'", "'constructor'", "'private'", 
			"'public'", "'static'", "'protected'", "'new'", null, null, null, "'`'", 
			null, "'px'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "Import", "Export", "Abstract", 
			"Interface", "Extends", "Implements", "Console", "Log", "Component", 
			"Service", "Class", "InlineAttributeName", "BackgroundColorAttributeName", 
			"TextColorAttributeName", "TypeAttributeName", "LabelAttributeName", 
			"ValueAttributeName", "PlaceHolderAttributeName", "CheckedAttributeName", 
			"TargetAttributeName", "OnSubmitAttributeName", "OnChangeAttributeName", 
			"OnClickAttributeName", "HeadingLevelAttributeName", "DirectionAttributeName", 
			"DurationAttributeName", "RepeatAttributeName", "OpenBracket", "CloseBracket", 
			"OpenParen", "CloseParen", "OpenBrace", "CloseBrace", "SemiColon", "Comma", 
			"Assign", "Colon", "QuestionMark", "Dot", "Plus", "Minus", "Multiply", 
			"At", "Divide", "Modulus", "Not", "LessThan", "GreaterThan", "LessThanEquals", 
			"GreaterThanEquals", "NOT_EQUAL", "WeakEqual", "StrongEqual", "And", 
			"Or", "AngularExpressionStart", "AngularExpressionEnd", "Let_Identify", 
			"If", "Else", "While", "Break", "Void", "Continue", "Function", "Return", 
			"From", "Null", "Enum", "Array", "Any", "TypeNumber", "TypeString", "TypeBoolean", 
			"This", "Constructor", "Private", "Public", "Static", "Protected", "New", 
			"NumberLiteral", "StringLiteral", "BooleanLiteral", "Backtick", "Identifier", 
			"CssPixel", "SingleLineComment", "MultiLineComment", "WS", "HtmlClassAttribute", 
			"GapAttributeName"
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
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5764044573080798664L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 25682053L) != 0)) {
				{
				{
				setState(116);
				statement();
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(122);
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
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
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
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public ThisVaribleContext thisVarible() {
			return getRuleContext(ThisVaribleContext.class,0);
		}
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
		public AbstractClassContext abstractClass() {
			return getRuleContext(AbstractClassContext.class,0);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public ConsoleLogContext consoleLog() {
			return getRuleContext(ConsoleLogContext.class,0);
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
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				arrayDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				enum_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				assignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(132);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(133);
				html_element();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(134);
				importStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(135);
				component();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(136);
				exportClass();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(137);
				thisVarible();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(138);
				class_();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(139);
				abstractClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(140);
				html();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(141);
				consoleLog();
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
		public DecoratorContext decorator() {
			return getRuleContext(DecoratorContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public TerminalNode Service() { return getToken(AngularParser.Service, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
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
			setState(144);
			_la = _input.LA(1);
			if ( !(_la==Component || _la==Service) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(145);
			match(OpenParen);
			setState(146);
			match(OpenBrace);
			setState(147);
			decorator();
			setState(148);
			match(CloseBrace);
			setState(149);
			match(CloseParen);
			setState(150);
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
	public static class ExportClassContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(AngularParser.Export, 0); }
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
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
		enterRule(_localctx, 6, RULE_exportClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(Export);
			setState(153);
			class_();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 8, RULE_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(Class);
			setState(156);
			match(Identifier);
			setState(157);
			match(OpenBrace);
			setState(158);
			classBody();
			setState(159);
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
		enterRule(_localctx, 10, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Abstract || _la==Let_Identify || ((((_la - 78)) & ~0x3f) == 0 && ((1L << (_la - 78)) & 1055L) != 0)) {
				{
				setState(166);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(161);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(162);
					objectDeclataion();
					}
					break;
				case 3:
					{
					setState(163);
					arrayDeclaration();
					}
					break;
				case 4:
					{
					setState(164);
					abstractFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(165);
					functionDeclaration();
					}
					break;
				}
				}
				setState(170);
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
	public static class DecoratorContext extends ParserRuleContext {
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public DecoratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decorator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDecorator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDecorator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decorator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(171);
				argumentList();
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
	public static class ArgumentListContext extends ParserRuleContext {
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
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArgumentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			argument();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					match(Comma);
					setState(176);
					argument();
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(182);
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
		enterRule(_localctx, 16, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(Identifier);
			setState(186);
			match(Colon);
			setState(187);
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
	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(AngularParser.Import, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
		enterRule(_localctx, 18, RULE_importStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(Import);
			setState(190);
			match(OpenBrace);
			setState(191);
			match(Identifier);
			setState(192);
			match(CloseBrace);
			setState(193);
			match(From);
			setState(194);
			match(StringLiteral);
			setState(195);
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
	public static class ThisVaribleContext extends ParserRuleContext {
		public List<TerminalNode> This() { return getTokens(AngularParser.This); }
		public TerminalNode This(int i) {
			return getToken(AngularParser.This, i);
		}
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public ThisVaribleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thisVarible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisVarible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisVarible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisVarible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisVaribleContext thisVarible() throws RecognitionException {
		ThisVaribleContext _localctx = new ThisVaribleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_thisVarible);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(This);
			setState(198);
			match(Dot);
			setState(199);
			match(Identifier);
			setState(200);
			match(Assign);
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case This:
				{
				{
				setState(201);
				match(This);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot) {
					{
					{
					setState(202);
					match(Dot);
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(203);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(204);
						function_call();
						}
						break;
					}
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case Identifier:
				{
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(212);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(213);
					match(Identifier);
					setState(214);
					match(Dot);
					setState(215);
					match(Identifier);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
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
	public static class EnumContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(AngularParser.Enum, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<EnumValuesContext> enumValues() {
			return getRuleContexts(EnumValuesContext.class);
		}
		public EnumValuesContext enumValues(int i) {
			return getRuleContext(EnumValuesContext.class,i);
		}
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
		enterRule(_localctx, 22, RULE_enum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(Enum);
			setState(223);
			match(Identifier);
			setState(224);
			match(OpenBrace);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(225);
				enumValues();
				}
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(231);
			match(CloseBrace);
			setState(232);
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
		enterRule(_localctx, 24, RULE_enumValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(234);
			enumValue();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(235);
				match(Comma);
				setState(236);
				enumValue();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		enterRule(_localctx, 26, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(Identifier);
			setState(243);
			match(Assign);
			setState(244);
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
	public static class ConsoleLogContext extends ParserRuleContext {
		public TerminalNode Console() { return getToken(AngularParser.Console, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Log() { return getToken(AngularParser.Log, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
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
		enterRule(_localctx, 28, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Console);
			setState(247);
			match(Dot);
			setState(248);
			match(Log);
			setState(249);
			match(OpenParen);
			setState(250);
			match(Identifier);
			setState(251);
			match(CloseParen);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(252);
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
	public static class AbstractClassContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(AngularParser.Abstract, 0); }
		public ClassContext class_() {
			return getRuleContext(ClassContext.class,0);
		}
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
		enterRule(_localctx, 30, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(Abstract);
			setState(256);
			class_();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
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
		enterRule(_localctx, 32, RULE_interface);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(Interface);
			setState(259);
			match(OpenBrace);
			setState(260);
			classBody();
			setState(261);
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
		enterRule(_localctx, 34, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 15L) != 0)) ) {
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
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Let_Identify() { return getToken(AngularParser.Let_Identify, 0); }
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
		enterRule(_localctx, 36, RULE_variableDeclaration);
		int _la;
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 15L) != 0)) {
					{
					setState(265);
					accessModifier();
					}
				}

				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(268);
					match(Let_Identify);
					}
				}

				setState(271);
				match(Identifier);
				setState(272);
				match(Colon);
				{
				setState(273);
				type();
				}
				setState(274);
				match(Assign);
				setState(275);
				expression(0);
				setState(276);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 15L) != 0)) {
					{
					setState(278);
					accessModifier();
					}
				}

				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(281);
					match(Let_Identify);
					}
				}

				setState(284);
				match(Identifier);
				setState(285);
				match(Assign);
				setState(286);
				expression(0);
				setState(287);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 15L) != 0)) {
					{
					setState(289);
					accessModifier();
					}
				}

				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(292);
					match(Let_Identify);
					}
				}

				setState(295);
				match(Identifier);
				setState(296);
				match(Colon);
				setState(297);
				type();
				setState(298);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 15L) != 0)) {
					{
					setState(300);
					accessModifier();
					}
				}

				setState(303);
				match(Identifier);
				setState(304);
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
		enterRule(_localctx, 38, RULE_arrayDeclaration);
		int _la;
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(307);
					match(Let_Identify);
					}
				}

				setState(310);
				match(Identifier);
				setState(311);
				match(Colon);
				setState(312);
				type();
				setState(313);
				match(OpenBracket);
				setState(314);
				match(CloseBracket);
				setState(315);
				match(Assign);
				setState(316);
				match(OpenBracket);
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 270217077153857553L) != 0)) {
					{
					setState(317);
					literalValue();
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(318);
						match(Comma);
						setState(319);
						literalValue();
						}
						}
						setState(324);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(327);
				match(CloseBracket);
				setState(328);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				match(Identifier);
				setState(331);
				match(Assign);
				setState(332);
				match(OpenBracket);
				setState(334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(333);
					literalValue();
					}
					break;
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 270217077153857553L) != 0)) {
					{
					{
					setState(336);
					literalValue();
					setState(338);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(337);
						match(Comma);
						}
					}

					}
					}
					setState(344);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(345);
				match(CloseBracket);
				setState(346);
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
	public static class AbstractFunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(AngularParser.Abstract, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Void() { return getToken(AngularParser.Void, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
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
		enterRule(_localctx, 40, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(Abstract);
			setState(350);
			match(Identifier);
			setState(351);
			match(OpenParen);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(352);
				parameter();
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(353);
					match(Comma);
					setState(354);
					parameter();
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(362);
			match(CloseParen);
			setState(363);
			match(Colon);
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
				{
				setState(364);
				type();
				}
				break;
			case Void:
				{
				setState(365);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(368);
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode Return() { return getToken(AngularParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Constructor() { return getToken(AngularParser.Constructor, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(AngularParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(AngularParser.Colon, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> Void() { return getTokens(AngularParser.Void); }
		public TerminalNode Void(int i) {
			return getToken(AngularParser.Void, i);
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
		enterRule(_localctx, 42, RULE_functionDeclaration);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				_la = _input.LA(1);
				if ( !(_la==Constructor || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(371);
				match(OpenParen);
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(372);
					parameter();
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(373);
						match(Comma);
						setState(374);
						parameter();
						}
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(382);
				match(CloseParen);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(383);
					match(Colon);
					setState(384);
					type();
					}
					}
					setState(389);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(390);
				match(OpenBrace);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5764044573080798664L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 25682053L) != 0)) {
					{
					{
					setState(391);
					statement();
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(397);
				match(Return);
				setState(398);
				expression(0);
				setState(399);
				match(SemiColon);
				setState(400);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				_la = _input.LA(1);
				if ( !(_la==Constructor || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(403);
				match(OpenParen);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(404);
					parameter();
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(405);
						match(Comma);
						setState(406);
						parameter();
						}
						}
						setState(411);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(414);
				match(CloseParen);
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(415);
					match(Colon);
					setState(416);
					match(Void);
					}
					}
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(422);
				block();
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
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
		enterRule(_localctx, 44, RULE_objectDeclataion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			match(Identifier);
			setState(426);
			match(Colon);
			setState(427);
			match(Identifier);
			setState(428);
			match(Assign);
			setState(429);
			match(New);
			setState(430);
			match(Identifier);
			setState(431);
			match(OpenParen);
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 270217077153857553L) != 0)) {
				{
				{
				setState(432);
				literalValue();
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(433);
					match(Comma);
					setState(434);
					literalValue();
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(CloseParen);
			setState(446);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TypeNumber() { return getToken(AngularParser.TypeNumber, 0); }
		public TerminalNode TypeString() { return getToken(AngularParser.TypeString, 0); }
		public TerminalNode TypeBoolean() { return getToken(AngularParser.TypeBoolean, 0); }
		public TerminalNode Array() { return getToken(AngularParser.Array, 0); }
		public TerminalNode Any() { return getToken(AngularParser.Any, 0); }
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
		enterRule(_localctx, 46, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & 31L) != 0)) ) {
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
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public CssContext css() {
			return getRuleContext(CssContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_literalValue);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(NumberLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
				listLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(454);
				mapLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(455);
				match(Null);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(456);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(457);
				css();
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
	public static class MapLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
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
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
		enterRule(_localctx, 50, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			match(OpenBrace);
			setState(461);
			match(Identifier);
			setState(462);
			match(Colon);
			setState(463);
			literalValue();
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(464);
				match(Comma);
				{
				setState(465);
				match(Identifier);
				setState(466);
				match(Colon);
				setState(467);
				literalValue();
				}
				setState(470);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(469);
					match(Comma);
					}
					break;
				}
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
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
		enterRule(_localctx, 52, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(OpenBracket);
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 558447453305569297L) != 0)) {
				{
				setState(482);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(480);
					match(Identifier);
					}
					break;
				case OpenBracket:
				case OpenBrace:
				case Null:
				case NumberLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case Backtick:
					{
					setState(481);
					literalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					match(Comma);
					setState(490);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(488);
						match(Identifier);
						}
						break;
					case OpenBracket:
					case OpenBrace:
					case Null:
					case NumberLiteral:
					case StringLiteral:
					case BooleanLiteral:
					case Backtick:
						{
						setState(489);
						literalValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(497);
				match(Comma);
				}
			}

			setState(500);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
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
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<LiteralValueContext> literalValue() {
			return getRuleContexts(LiteralValueContext.class);
		}
		public LiteralValueContext literalValue(int i) {
			return getRuleContext(LiteralValueContext.class,i);
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
		enterRule(_localctx, 54, RULE_assignmentStatement);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				match(Identifier);
				setState(503);
				match(Assign);
				setState(504);
				expression(0);
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(505);
					match(Comma);
					setState(506);
					expression(0);
					}
					}
					setState(511);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(512);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(Identifier);
				setState(515);
				match(Assign);
				setState(516);
				match(OpenBracket);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 270217077153857553L) != 0)) {
					{
					setState(517);
					literalValue();
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(518);
						match(Comma);
						setState(519);
						literalValue();
						}
						}
						setState(524);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(527);
				match(CloseBracket);
				setState(528);
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
			setState(531);
			match(If);
			setState(532);
			match(OpenParen);
			setState(533);
			expression(0);
			setState(534);
			match(CloseParen);
			setState(535);
			block();
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(536);
					elseIfStatement();
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(542);
				match(Else);
				setState(543);
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
			setState(546);
			match(While);
			setState(547);
			match(OpenParen);
			setState(548);
			expression(0);
			setState(549);
			match(CloseParen);
			setState(550);
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
			setState(552);
			match(Else);
			setState(553);
			match(If);
			setState(554);
			match(OpenParen);
			setState(555);
			expression(0);
			setState(556);
			match(CloseParen);
			setState(557);
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
			setState(559);
			match(Break);
			setState(560);
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
			setState(562);
			match(Continue);
			setState(563);
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
			setState(565);
			match(OpenBrace);
			setState(569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5764044573080798664L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 25682053L) != 0)) {
				{
				{
				setState(566);
				statement();
				}
				}
				setState(571);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(572);
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DdContext extends ExpressionContext {
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public DdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public NotEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNotEqualsComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNotEqualsComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNotEqualsComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOrExpressionStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public LogicalOrExpressionStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalOrExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalOrExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalOrExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMultiplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMultiplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMultiplication(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAddition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAddition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAddition(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StrongEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode StrongEqual() { return getToken(AngularParser.StrongEqual, 0); }
		public StrongEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStrongEqualsComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStrongEqualsComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStrongEqualsComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLiteralExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AngularExpreissionContext extends ExpressionContext {
		public TerminalNode AngularExpressionStart() { return getToken(AngularParser.AngularExpressionStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AngularExpressionEnd() { return getToken(AngularParser.AngularExpressionEnd, 0); }
		public AngularExpreissionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularExpreission(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularExpreission(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularExpreission(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GreaterThanEquals() { return getToken(AngularParser.GreaterThanEquals, 0); }
		public GreaterThanEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGreaterThanEqualsComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGreaterThanEqualsComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGreaterThanEqualsComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GreaterThanComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public GreaterThanComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterGreaterThanComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitGreaterThanComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitGreaterThanComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PropertyAccessContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public PropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitPropertyAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitPropertyAccess(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterBracketExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitBracketExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitBracketExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubtractionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSubtraction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSubtraction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSubtraction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModulusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Modulus() { return getToken(AngularParser.Modulus, 0); }
		public ModulusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterModulus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitModulus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitModulus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WeakEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WeakEqual() { return getToken(AngularParser.WeakEqual, 0); }
		public WeakEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterWeakEqualsComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitWeakEqualsComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitWeakEqualsComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalAndExpressionStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public LogicalAndExpressionStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLogicalAndExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLogicalAndExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLogicalAndExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThanEquals() { return getToken(AngularParser.LessThanEquals, 0); }
		public LessThanEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLessThanEqualsComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLessThanEqualsComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLessThanEqualsComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LessThanComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public LessThanComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterLessThanComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitLessThanComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLessThanComparison(this);
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
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(575);
				match(OpenParen);
				setState(576);
				expression(0);
				setState(577);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(579);
				match(Identifier);
				setState(580);
				match(OpenBracket);
				setState(581);
				expression(0);
				setState(582);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new AngularExpreissionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(584);
				match(AngularExpressionStart);
				setState(585);
				expression(0);
				setState(586);
				match(AngularExpressionEnd);
				}
				break;
			case 4:
				{
				_localctx = new PropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(588);
				match(Identifier);
				setState(589);
				match(Dot);
				setState(590);
				match(Identifier);
				}
				break;
			case 5:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(591);
				literalValue();
				}
				break;
			case 6:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(592);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new DdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(593);
				html();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(640);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(638);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(596);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(597);
						match(Multiply);
						setState(598);
						expression(22);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(599);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(600);
						match(Divide);
						setState(601);
						expression(21);
						}
						break;
					case 3:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(602);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(603);
						match(Modulus);
						setState(604);
						expression(20);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(605);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(606);
						match(Plus);
						setState(607);
						expression(19);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(608);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(609);
						match(Minus);
						setState(610);
						expression(18);
						}
						break;
					case 6:
						{
						_localctx = new LessThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(611);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(612);
						match(LessThan);
						setState(613);
						expression(17);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(614);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(615);
						match(GreaterThan);
						setState(616);
						expression(16);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(617);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(618);
						match(LessThanEquals);
						setState(619);
						expression(15);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(620);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(621);
						match(GreaterThanEquals);
						setState(622);
						expression(14);
						}
						break;
					case 10:
						{
						_localctx = new WeakEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(623);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(624);
						match(WeakEqual);
						setState(625);
						expression(13);
						}
						break;
					case 11:
						{
						_localctx = new StrongEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(626);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(627);
						match(StrongEqual);
						setState(628);
						expression(12);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(629);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(630);
						match(NOT_EQUAL);
						setState(631);
						expression(11);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(632);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(633);
						match(And);
						setState(634);
						expression(10);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(635);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(636);
						match(Or);
						setState(637);
						expression(9);
						}
						break;
					}
					} 
				}
				setState(642);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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
		enterRule(_localctx, 70, RULE_parameter);
		try {
			setState(652);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(643);
				match(Identifier);
				setState(644);
				match(Colon);
				setState(645);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(646);
				match(Identifier);
				setState(647);
				match(Colon);
				setState(648);
				type();
				setState(649);
				match(Assign);
				setState(650);
				literalValue();
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
		enterRule(_localctx, 72, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			match(Identifier);
			setState(655);
			match(OpenParen);
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & 558447453574004757L) != 0)) {
				{
				setState(656);
				expression(0);
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(657);
					match(Comma);
					setState(658);
					expression(0);
					}
					}
					setState(663);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(666);
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
		enterRule(_localctx, 74, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(Backtick);
			setState(669);
			html_content();
			setState(670);
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
		enterRule(_localctx, 76, RULE_html_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(694);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(673); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(672);
								html_element();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(675); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case AngularExpressionStart:
						{
						setState(677);
						match(AngularExpressionStart);
						setState(678);
						expression(0);
						setState(679);
						match(AngularExpressionEnd);
						}
						break;
					case NumberLiteral:
					case Identifier:
						{
						setState(684);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NumberLiteral) {
							{
							{
							setState(681);
							match(NumberLiteral);
							}
							}
							setState(686);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(687);
						match(Identifier);
						setState(691);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(688);
								match(NumberLiteral);
								}
								} 
							}
							setState(693);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
				setState(696); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 78, RULE_html_element);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(LessThan);
				setState(699);
				html_tag_name();
				setState(701);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(700);
					html_attributes();
					}
					break;
				}
				setState(703);
				match(GreaterThan);
				setState(705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(704);
					html_content();
					}
					break;
				}
				setState(707);
				match(LessThan);
				setState(708);
				match(Divide);
				setState(709);
				html_tag_name();
				setState(710);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(712);
				match(LessThan);
				setState(713);
				html_tag_name();
				setState(715);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(714);
					html_attributes();
					}
					break;
				}
				setState(717);
				match(GreaterThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
				match(LessThan);
				setState(720);
				html_tag_name();
				setState(721);
				html_attributes();
				setState(722);
				match(Divide);
				setState(723);
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
		enterRule(_localctx, 80, RULE_html_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
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
		enterRule(_localctx, 82, RULE_html_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17597554753542L) != 0) || _la==Identifier || _la==HtmlClassAttribute) {
				{
				{
				setState(729);
				html_attribute();
				}
				}
				setState(734);
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
		enterRule(_localctx, 84, RULE_html_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(735);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(736);
				ngIfAttribute();
				}
				break;
			case 3:
				{
				setState(737);
				ngForAttribute();
				}
				break;
			case 4:
				{
				setState(738);
				onChangeAttribute();
				}
				break;
			case 5:
				{
				setState(739);
				onClickAttribute();
				}
				break;
			case 6:
				{
				setState(740);
				match(HtmlClassAttribute);
				}
				break;
			case 7:
				{
				setState(741);
				match(OpenBracket);
				setState(750);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(742);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(743);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==HtmlClassAttribute) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(747);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(744);
						access_suffix();
						}
						}
						setState(749);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(752);
				match(CloseBracket);
				}
				break;
			case 8:
				{
				setState(753);
				match(OpenParen);
				setState(754);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==HtmlClassAttribute) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(755);
				match(CloseParen);
				}
				break;
			case 9:
				{
				setState(756);
				match(Multiply);
				}
				break;
			}
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(759);
				match(Assign);
				setState(760);
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
		enterRule(_localctx, 86, RULE_access_suffix);
		try {
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				match(Dot);
				setState(764);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(765);
				match(OpenBracket);
				setState(766);
				expression(0);
				setState(767);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(769);
				match(Dot);
				setState(770);
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
		enterRule(_localctx, 88, RULE_html_attribute_value);
		try {
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(774);
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
		enterRule(_localctx, 90, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(OpenBracket);
			setState(778);
			match(Backtick);
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(779);
				css_content();
				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			match(Backtick);
			setState(786);
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
		enterRule(_localctx, 92, RULE_css_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(788);
				match(Dot);
				}
			}

			setState(791);
			match(Identifier);
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(792);
				match(Colon);
				setState(793);
				match(Identifier);
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			match(OpenBrace);
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(800);
				css_class_content();
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
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
		enterRule(_localctx, 94, RULE_css_class_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(Identifier);
			setState(809);
			match(Colon);
			setState(816); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(810);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(811);
					match(NumberLiteral);
					setState(813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(812);
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
					setState(815);
					function_call();
					}
					break;
				}
				}
				setState(818); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(833);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(820);
				match(Comma);
				setState(827); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						setState(821);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(822);
						match(NumberLiteral);
						setState(824);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(823);
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
						setState(826);
						function_call();
						}
						break;
					}
					}
					setState(829); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(836);
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
		enterRule(_localctx, 96, RULE_checkedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(CheckedAttributeName);
			setState(839);
			match(Assign);
			setState(840);
			match(OpenBrace);
			setState(841);
			expression(0);
			setState(842);
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
		enterRule(_localctx, 98, RULE_onChangeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(OpenParen);
			setState(845);
			match(OnChangeAttributeName);
			setState(846);
			match(CloseParen);
			setState(847);
			match(Assign);
			setState(848);
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
		enterRule(_localctx, 100, RULE_onClickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(OpenParen);
			setState(851);
			match(OnClickAttributeName);
			setState(852);
			match(CloseParen);
			setState(853);
			match(Assign);
			setState(854);
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
		enterRule(_localctx, 102, RULE_onSubmitAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(OpenParen);
			setState(857);
			match(OnSubmitAttributeName);
			setState(858);
			match(CloseParen);
			setState(859);
			match(Assign);
			setState(860);
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
		enterRule(_localctx, 104, RULE_gapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(GapAttributeName);
			setState(863);
			match(Assign);
			setState(864);
			match(OpenBrace);
			setState(865);
			expression(0);
			setState(866);
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
		enterRule(_localctx, 106, RULE_directionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			match(DirectionAttributeName);
			setState(869);
			match(Assign);
			setState(870);
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
		enterRule(_localctx, 108, RULE_durationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(DurationAttributeName);
			setState(873);
			match(Assign);
			setState(874);
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
		enterRule(_localctx, 110, RULE_repeatAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			match(RepeatAttributeName);
			setState(877);
			match(Assign);
			setState(878);
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
		enterRule(_localctx, 112, RULE_ngForAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(880);
			match(NgForDirective);
			setState(881);
			match(Assign);
			setState(882);
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
		enterRule(_localctx, 114, RULE_ngIfAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(NgIfDirective);
			setState(885);
			match(Assign);
			setState(886);
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
		case 34:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 21);
		case 1:
			return precpred(_ctx, 20);
		case 2:
			return precpred(_ctx, 19);
		case 3:
			return precpred(_ctx, 18);
		case 4:
			return precpred(_ctx, 17);
		case 5:
			return precpred(_ctx, 16);
		case 6:
			return precpred(_ctx, 15);
		case 7:
			return precpred(_ctx, 14);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001^\u0379\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0001\u0000\u0005\u0000v\b\u0000"+
		"\n\u0000\f\u0000y\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u008f\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00a7\b\u0005"+
		"\n\u0005\f\u0005\u00aa\t\u0005\u0001\u0006\u0003\u0006\u00ad\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b2\b\u0007\n\u0007\f\u0007"+
		"\u00b5\t\u0007\u0001\u0007\u0003\u0007\u00b8\b\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00ce\b\n\u0005\n\u00d0\b\n\n\n\f\n\u00d3\t\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u00d9\b\n\u0003\n\u00db\b\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e3\b\u000b\n\u000b"+
		"\f\u000b\u00e6\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00ee\b\f\n\f\f\f\u00f1\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00fe\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0003\u0012\u010b\b\u0012\u0001\u0012\u0003"+
		"\u0012\u010e\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0118\b\u0012\u0001"+
		"\u0012\u0003\u0012\u011b\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0123\b\u0012\u0001\u0012\u0003"+
		"\u0012\u0126\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u012e\b\u0012\u0001\u0012\u0001\u0012\u0003"+
		"\u0012\u0132\b\u0012\u0001\u0013\u0003\u0013\u0135\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0141\b\u0013\n\u0013"+
		"\f\u0013\u0144\t\u0013\u0003\u0013\u0146\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u014f\b\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u0153\b\u0013\u0005"+
		"\u0013\u0155\b\u0013\n\u0013\f\u0013\u0158\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u015c\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0164\b\u0014\n\u0014\f\u0014\u0167"+
		"\t\u0014\u0003\u0014\u0169\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u016f\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0178\b\u0015"+
		"\n\u0015\f\u0015\u017b\t\u0015\u0003\u0015\u017d\b\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u0182\b\u0015\n\u0015\f\u0015\u0185\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u0189\b\u0015\n\u0015\f\u0015\u018c"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u0198"+
		"\b\u0015\n\u0015\f\u0015\u019b\t\u0015\u0003\u0015\u019d\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01a2\b\u0015\n\u0015\f\u0015"+
		"\u01a5\t\u0015\u0001\u0015\u0003\u0015\u01a8\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u01b4\b\u0016\n\u0016\f\u0016"+
		"\u01b7\t\u0016\u0005\u0016\u01b9\b\u0016\n\u0016\f\u0016\u01bc\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0003\u0018\u01cb\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0003\u0019\u01d7\b\u0019\u0005\u0019\u01d9\b\u0019\n\u0019"+
		"\f\u0019\u01dc\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u01e3\b\u001a\n\u001a\f\u001a\u01e6\t\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01eb\b\u001a\u0005\u001a\u01ed"+
		"\b\u001a\n\u001a\f\u001a\u01f0\t\u001a\u0001\u001a\u0003\u001a\u01f3\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u01fc\b\u001b\n\u001b\f\u001b\u01ff\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0209\b\u001b\n\u001b\f\u001b\u020c"+
		"\t\u001b\u0003\u001b\u020e\b\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u0212\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0005\u001c\u021a\b\u001c\n\u001c\f\u001c\u021d\t\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u0221\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0005!\u0238\b!"+
		"\n!\f!\u023b\t!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u0253\b\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0005\"\u027f\b\"\n\"\f\"\u0282"+
		"\t\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u028d\b#\u0001$\u0001$\u0001$\u0001$\u0001$\u0005$\u0294\b$\n$\f$\u0297"+
		"\t$\u0003$\u0299\b$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001&\u0004"+
		"&\u02a2\b&\u000b&\f&\u02a3\u0001&\u0001&\u0001&\u0001&\u0001&\u0005&\u02ab"+
		"\b&\n&\f&\u02ae\t&\u0001&\u0001&\u0005&\u02b2\b&\n&\f&\u02b5\t&\u0004"+
		"&\u02b7\b&\u000b&\f&\u02b8\u0001\'\u0001\'\u0001\'\u0003\'\u02be\b\'\u0001"+
		"\'\u0001\'\u0003\'\u02c2\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u02cc\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0003\'\u02d6\b\'\u0001(\u0001(\u0001)\u0005"+
		")\u02db\b)\n)\f)\u02de\t)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0005*\u02ea\b*\n*\f*\u02ed\t*\u0003*\u02ef\b*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02f6\b*\u0001*\u0001*\u0003"+
		"*\u02fa\b*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u0304\b+\u0001,\u0001,\u0003,\u0308\b,\u0001-\u0001-\u0001-\u0005-\u030d"+
		"\b-\n-\f-\u0310\t-\u0001-\u0001-\u0001-\u0001.\u0003.\u0316\b.\u0001."+
		"\u0001.\u0001.\u0005.\u031b\b.\n.\f.\u031e\t.\u0001.\u0001.\u0005.\u0322"+
		"\b.\n.\f.\u0325\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0003"+
		"/\u032e\b/\u0001/\u0004/\u0331\b/\u000b/\f/\u0332\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u0339\b/\u0001/\u0004/\u033c\b/\u000b/\f/\u033d\u0005"+
		"/\u0340\b/\n/\f/\u0343\t/\u0001/\u0001/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00013\u00013\u00013\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00016\u00016\u00017\u00017\u00017\u00017\u00018\u00018\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u0000\u0001D:\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\u0000\u0007\u0001\u0000\u000b"+
		"\f\u0001\u0000OR\u0002\u0000NNXX\u0001\u0000HL\u0002\u0000XX]]\u0002\u0000"+
		"//YY\u0001\u0000TU\u03d0\u0000w\u0001\u0000\u0000\u0000\u0002\u008e\u0001"+
		"\u0000\u0000\u0000\u0004\u0090\u0001\u0000\u0000\u0000\u0006\u0098\u0001"+
		"\u0000\u0000\u0000\b\u009b\u0001\u0000\u0000\u0000\n\u00a8\u0001\u0000"+
		"\u0000\u0000\f\u00ac\u0001\u0000\u0000\u0000\u000e\u00ae\u0001\u0000\u0000"+
		"\u0000\u0010\u00b9\u0001\u0000\u0000\u0000\u0012\u00bd\u0001\u0000\u0000"+
		"\u0000\u0014\u00c5\u0001\u0000\u0000\u0000\u0016\u00de\u0001\u0000\u0000"+
		"\u0000\u0018\u00ea\u0001\u0000\u0000\u0000\u001a\u00f2\u0001\u0000\u0000"+
		"\u0000\u001c\u00f6\u0001\u0000\u0000\u0000\u001e\u00ff\u0001\u0000\u0000"+
		"\u0000 \u0102\u0001\u0000\u0000\u0000\"\u0107\u0001\u0000\u0000\u0000"+
		"$\u0131\u0001\u0000\u0000\u0000&\u015b\u0001\u0000\u0000\u0000(\u015d"+
		"\u0001\u0000\u0000\u0000*\u01a7\u0001\u0000\u0000\u0000,\u01a9\u0001\u0000"+
		"\u0000\u0000.\u01c0\u0001\u0000\u0000\u00000\u01ca\u0001\u0000\u0000\u0000"+
		"2\u01cc\u0001\u0000\u0000\u00004\u01df\u0001\u0000\u0000\u00006\u0211"+
		"\u0001\u0000\u0000\u00008\u0213\u0001\u0000\u0000\u0000:\u0222\u0001\u0000"+
		"\u0000\u0000<\u0228\u0001\u0000\u0000\u0000>\u022f\u0001\u0000\u0000\u0000"+
		"@\u0232\u0001\u0000\u0000\u0000B\u0235\u0001\u0000\u0000\u0000D\u0252"+
		"\u0001\u0000\u0000\u0000F\u028c\u0001\u0000\u0000\u0000H\u028e\u0001\u0000"+
		"\u0000\u0000J\u029c\u0001\u0000\u0000\u0000L\u02b6\u0001\u0000\u0000\u0000"+
		"N\u02d5\u0001\u0000\u0000\u0000P\u02d7\u0001\u0000\u0000\u0000R\u02dc"+
		"\u0001\u0000\u0000\u0000T\u02f5\u0001\u0000\u0000\u0000V\u0303\u0001\u0000"+
		"\u0000\u0000X\u0307\u0001\u0000\u0000\u0000Z\u0309\u0001\u0000\u0000\u0000"+
		"\\\u0315\u0001\u0000\u0000\u0000^\u0328\u0001\u0000\u0000\u0000`\u0346"+
		"\u0001\u0000\u0000\u0000b\u034c\u0001\u0000\u0000\u0000d\u0352\u0001\u0000"+
		"\u0000\u0000f\u0358\u0001\u0000\u0000\u0000h\u035e\u0001\u0000\u0000\u0000"+
		"j\u0364\u0001\u0000\u0000\u0000l\u0368\u0001\u0000\u0000\u0000n\u036c"+
		"\u0001\u0000\u0000\u0000p\u0370\u0001\u0000\u0000\u0000r\u0374\u0001\u0000"+
		"\u0000\u0000tv\u0003\u0002\u0001\u0000ut\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0000\u0000"+
		"\u0001{\u0001\u0001\u0000\u0000\u0000|\u008f\u0003&\u0013\u0000}\u008f"+
		"\u0003\u0016\u000b\u0000~\u008f\u0003$\u0012\u0000\u007f\u008f\u0003*"+
		"\u0015\u0000\u0080\u008f\u00038\u001c\u0000\u0081\u008f\u0003:\u001d\u0000"+
		"\u0082\u008f\u00036\u001b\u0000\u0083\u008f\u0003>\u001f\u0000\u0084\u008f"+
		"\u0003@ \u0000\u0085\u008f\u0003N\'\u0000\u0086\u008f\u0003\u0012\t\u0000"+
		"\u0087\u008f\u0003\u0004\u0002\u0000\u0088\u008f\u0003\u0006\u0003\u0000"+
		"\u0089\u008f\u0003\u0014\n\u0000\u008a\u008f\u0003\b\u0004\u0000\u008b"+
		"\u008f\u0003\u001e\u000f\u0000\u008c\u008f\u0003J%\u0000\u008d\u008f\u0003"+
		"\u001c\u000e\u0000\u008e|\u0001\u0000\u0000\u0000\u008e}\u0001\u0000\u0000"+
		"\u0000\u008e~\u0001\u0000\u0000\u0000\u008e\u007f\u0001\u0000\u0000\u0000"+
		"\u008e\u0080\u0001\u0000\u0000\u0000\u008e\u0081\u0001\u0000\u0000\u0000"+
		"\u008e\u0082\u0001\u0000\u0000\u0000\u008e\u0083\u0001\u0000\u0000\u0000"+
		"\u008e\u0084\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000\u0000\u0000"+
		"\u008e\u0086\u0001\u0000\u0000\u0000\u008e\u0087\u0001\u0000\u0000\u0000"+
		"\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u0089\u0001\u0000\u0000\u0000"+
		"\u008e\u008a\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000\u0000"+
		"\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0003\u0001\u0000\u0000\u0000\u0090\u0091\u0007\u0000\u0000\u0000"+
		"\u0091\u0092\u0005 \u0000\u0000\u0092\u0093\u0005\"\u0000\u0000\u0093"+
		"\u0094\u0003\f\u0006\u0000\u0094\u0095\u0005#\u0000\u0000\u0095\u0096"+
		"\u0005!\u0000\u0000\u0096\u0097\u0003\u0006\u0003\u0000\u0097\u0005\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005\u0004\u0000\u0000\u0099\u009a\u0003"+
		"\b\u0004\u0000\u009a\u0007\u0001\u0000\u0000\u0000\u009b\u009c\u0005\r"+
		"\u0000\u0000\u009c\u009d\u0005X\u0000\u0000\u009d\u009e\u0005\"\u0000"+
		"\u0000\u009e\u009f\u0003\n\u0005\u0000\u009f\u00a0\u0005#\u0000\u0000"+
		"\u00a0\t\u0001\u0000\u0000\u0000\u00a1\u00a7\u0003$\u0012\u0000\u00a2"+
		"\u00a7\u0003,\u0016\u0000\u00a3\u00a7\u0003&\u0013\u0000\u00a4\u00a7\u0003"+
		"(\u0014\u0000\u00a5\u00a7\u0003*\u0015\u0000\u00a6\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000\u00a6\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u000b\u0001\u0000\u0000"+
		"\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ad\u0003\u000e\u0007"+
		"\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000"+
		"\u0000\u00ad\r\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003\u0010\b\u0000"+
		"\u00af\u00b0\u0005%\u0000\u0000\u00b0\u00b2\u0003\u0010\b\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\u0005%\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u000f\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005X\u0000\u0000\u00ba\u00bb\u0005\'\u0000\u0000\u00bb\u00bc\u0003"+
		"0\u0018\u0000\u00bc\u0011\u0001\u0000\u0000\u0000\u00bd\u00be\u0005\u0003"+
		"\u0000\u0000\u00be\u00bf\u0005\"\u0000\u0000\u00bf\u00c0\u0005X\u0000"+
		"\u0000\u00c0\u00c1\u0005#\u0000\u0000\u00c1\u00c2\u0005E\u0000\u0000\u00c2"+
		"\u00c3\u0005U\u0000\u0000\u00c3\u00c4\u0005$\u0000\u0000\u00c4\u0013\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c6\u0005M\u0000\u0000\u00c6\u00c7\u0005)\u0000"+
		"\u0000\u00c7\u00c8\u0005X\u0000\u0000\u00c8\u00da\u0005&\u0000\u0000\u00c9"+
		"\u00d1\u0005M\u0000\u0000\u00ca\u00cd\u0005)\u0000\u0000\u00cb\u00ce\u0005"+
		"X\u0000\u0000\u00cc\u00ce\u0003H$\u0000\u00cd\u00cb\u0001\u0000\u0000"+
		"\u0000\u00cd\u00cc\u0001\u0000\u0000\u0000\u00ce\u00d0\u0001\u0000\u0000"+
		"\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00d0\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d2\u00db\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d9\u0005X\u0000\u0000\u00d5\u00d6\u0005X\u0000\u0000\u00d6"+
		"\u00d7\u0005)\u0000\u0000\u00d7\u00d9\u0005X\u0000\u0000\u00d8\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d8\u00d5\u0001\u0000\u0000\u0000\u00d9\u00db\u0001"+
		"\u0000\u0000\u0000\u00da\u00c9\u0001\u0000\u0000\u0000\u00da\u00d8\u0001"+
		"\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005"+
		"$\u0000\u0000\u00dd\u0015\u0001\u0000\u0000\u0000\u00de\u00df\u0005G\u0000"+
		"\u0000\u00df\u00e0\u0005X\u0000\u0000\u00e0\u00e4\u0005\"\u0000\u0000"+
		"\u00e1\u00e3\u0003\u0018\f\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005#\u0000\u0000\u00e8\u00e9"+
		"\u0005$\u0000\u0000\u00e9\u0017\u0001\u0000\u0000\u0000\u00ea\u00ef\u0003"+
		"\u001a\r\u0000\u00eb\u00ec\u0005%\u0000\u0000\u00ec\u00ee\u0003\u001a"+
		"\r\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
		"\u0000\u00f0\u0019\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0005X\u0000\u0000\u00f3\u00f4\u0005&\u0000\u0000\u00f4"+
		"\u00f5\u00030\u0018\u0000\u00f5\u001b\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\t\u0000\u0000\u00f7\u00f8\u0005)\u0000\u0000\u00f8\u00f9\u0005"+
		"\n\u0000\u0000\u00f9\u00fa\u0005 \u0000\u0000\u00fa\u00fb\u0005X\u0000"+
		"\u0000\u00fb\u00fd\u0005!\u0000\u0000\u00fc\u00fe\u0005$\u0000\u0000\u00fd"+
		"\u00fc\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe"+
		"\u001d\u0001\u0000\u0000\u0000\u00ff\u0100\u0005\u0005\u0000\u0000\u0100"+
		"\u0101\u0003\b\u0004\u0000\u0101\u001f\u0001\u0000\u0000\u0000\u0102\u0103"+
		"\u0005\u0006\u0000\u0000\u0103\u0104\u0005\"\u0000\u0000\u0104\u0105\u0003"+
		"\n\u0005\u0000\u0105\u0106\u0005#\u0000\u0000\u0106!\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0007\u0001\u0000\u0000\u0108#\u0001\u0000\u0000\u0000"+
		"\u0109\u010b\u0003\"\u0011\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\u010d\u0001\u0000\u0000\u0000\u010c"+
		"\u010e\u0005<\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\u0110"+
		"\u0005X\u0000\u0000\u0110\u0111\u0005\'\u0000\u0000\u0111\u0112\u0003"+
		".\u0017\u0000\u0112\u0113\u0005&\u0000\u0000\u0113\u0114\u0003D\"\u0000"+
		"\u0114\u0115\u0005$\u0000\u0000\u0115\u0132\u0001\u0000\u0000\u0000\u0116"+
		"\u0118\u0003\"\u0011\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118"+
		"\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000\u0000\u0119\u011b"+
		"\u0005<\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001"+
		"\u0000\u0000\u0000\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"X\u0000\u0000\u011d\u011e\u0005&\u0000\u0000\u011e\u011f\u0003D\"\u0000"+
		"\u011f\u0120\u0005$\u0000\u0000\u0120\u0132\u0001\u0000\u0000\u0000\u0121"+
		"\u0123\u0003\"\u0011\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0126"+
		"\u0005<\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001"+
		"\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"X\u0000\u0000\u0128\u0129\u0005\'\u0000\u0000\u0129\u012a\u0003.\u0017"+
		"\u0000\u012a\u012b\u0005$\u0000\u0000\u012b\u0132\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0003\"\u0011\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005X\u0000\u0000\u0130\u0132\u0005$\u0000\u0000\u0131\u010a\u0001"+
		"\u0000\u0000\u0000\u0131\u0117\u0001\u0000\u0000\u0000\u0131\u0122\u0001"+
		"\u0000\u0000\u0000\u0131\u012d\u0001\u0000\u0000\u0000\u0132%\u0001\u0000"+
		"\u0000\u0000\u0133\u0135\u0005<\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135\u0136\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0005X\u0000\u0000\u0137\u0138\u0005\'\u0000\u0000"+
		"\u0138\u0139\u0003.\u0017\u0000\u0139\u013a\u0005\u001e\u0000\u0000\u013a"+
		"\u013b\u0005\u001f\u0000\u0000\u013b\u013c\u0005&\u0000\u0000\u013c\u0145"+
		"\u0005\u001e\u0000\u0000\u013d\u0142\u00030\u0018\u0000\u013e\u013f\u0005"+
		"%\u0000\u0000\u013f\u0141\u00030\u0018\u0000\u0140\u013e\u0001\u0000\u0000"+
		"\u0000\u0141\u0144\u0001\u0000\u0000\u0000\u0142\u0140\u0001\u0000\u0000"+
		"\u0000\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000"+
		"\u0000\u0144\u0142\u0001\u0000\u0000\u0000\u0145\u013d\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000"+
		"\u0000\u0147\u0148\u0005\u001f\u0000\u0000\u0148\u0149\u0005$\u0000\u0000"+
		"\u0149\u015c\u0001\u0000\u0000\u0000\u014a\u014b\u0005X\u0000\u0000\u014b"+
		"\u014c\u0005&\u0000\u0000\u014c\u014e\u0005\u001e\u0000\u0000\u014d\u014f"+
		"\u00030\u0018\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0156\u0001\u0000\u0000\u0000\u0150\u0152\u0003"+
		"0\u0018\u0000\u0151\u0153\u0005%\u0000\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000"+
		"\u0000\u0154\u0150\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005\u001f\u0000\u0000\u015a\u015c\u0005$\u0000\u0000"+
		"\u015b\u0134\u0001\u0000\u0000\u0000\u015b\u014a\u0001\u0000\u0000\u0000"+
		"\u015c\'\u0001\u0000\u0000\u0000\u015d\u015e\u0005\u0005\u0000\u0000\u015e"+
		"\u015f\u0005X\u0000\u0000\u015f\u0168\u0005 \u0000\u0000\u0160\u0165\u0003"+
		"F#\u0000\u0161\u0162\u0005%\u0000\u0000\u0162\u0164\u0003F#\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0164\u0167\u0001\u0000\u0000\u0000\u0165"+
		"\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0168"+
		"\u0160\u0001\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169"+
		"\u016a\u0001\u0000\u0000\u0000\u016a\u016b\u0005!\u0000\u0000\u016b\u016e"+
		"\u0005\'\u0000\u0000\u016c\u016f\u0003.\u0017\u0000\u016d\u016f\u0005"+
		"A\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016d\u0001\u0000"+
		"\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0171\u0005$\u0000"+
		"\u0000\u0171)\u0001\u0000\u0000\u0000\u0172\u0173\u0007\u0002\u0000\u0000"+
		"\u0173\u017c\u0005 \u0000\u0000\u0174\u0179\u0003F#\u0000\u0175\u0176"+
		"\u0005%\u0000\u0000\u0176\u0178\u0003F#\u0000\u0177\u0175\u0001\u0000"+
		"\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179\u0177\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000"+
		"\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u0174\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u0183\u0005!\u0000\u0000\u017f\u0180\u0005\'\u0000"+
		"\u0000\u0180\u0182\u0003.\u0017\u0000\u0181\u017f\u0001\u0000\u0000\u0000"+
		"\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u018a\u0005\"\u0000\u0000\u0187"+
		"\u0189\u0003\u0002\u0001\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018c\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018d\u0001\u0000\u0000\u0000\u018c"+
		"\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0005D\u0000\u0000\u018e\u018f"+
		"\u0003D\"\u0000\u018f\u0190\u0005$\u0000\u0000\u0190\u0191\u0005#\u0000"+
		"\u0000\u0191\u01a8\u0001\u0000\u0000\u0000\u0192\u0193\u0007\u0002\u0000"+
		"\u0000\u0193\u019c\u0005 \u0000\u0000\u0194\u0199\u0003F#\u0000\u0195"+
		"\u0196\u0005%\u0000\u0000\u0196\u0198\u0003F#\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019d\u0001"+
		"\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u0194\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0001"+
		"\u0000\u0000\u0000\u019e\u01a3\u0005!\u0000\u0000\u019f\u01a0\u0005\'"+
		"\u0000\u0000\u01a0\u01a2\u0005A\u0000\u0000\u01a1\u019f\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000"+
		"\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a6\u01a8\u0003B!\u0000\u01a7"+
		"\u0172\u0001\u0000\u0000\u0000\u01a7\u0192\u0001\u0000\u0000\u0000\u01a8"+
		"+\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005X\u0000\u0000\u01aa\u01ab\u0005"+
		"\'\u0000\u0000\u01ab\u01ac\u0005X\u0000\u0000\u01ac\u01ad\u0005&\u0000"+
		"\u0000\u01ad\u01ae\u0005S\u0000\u0000\u01ae\u01af\u0005X\u0000\u0000\u01af"+
		"\u01ba\u0005 \u0000\u0000\u01b0\u01b5\u00030\u0018\u0000\u01b1\u01b2\u0005"+
		"%\u0000\u0000\u01b2\u01b4\u00030\u0018\u0000\u01b3\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000\u01b6\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b0\u0001\u0000\u0000"+
		"\u0000\u01b9\u01bc\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bd\u01be\u0005!\u0000\u0000"+
		"\u01be\u01bf\u0005$\u0000\u0000\u01bf-\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0007\u0003\u0000\u0000\u01c1/\u0001\u0000\u0000\u0000\u01c2\u01cb\u0005"+
		"T\u0000\u0000\u01c3\u01cb\u0005U\u0000\u0000\u01c4\u01cb\u0005V\u0000"+
		"\u0000\u01c5\u01cb\u00034\u001a\u0000\u01c6\u01cb\u00032\u0019\u0000\u01c7"+
		"\u01cb\u0005F\u0000\u0000\u01c8\u01cb\u0003J%\u0000\u01c9\u01cb\u0003"+
		"Z-\u0000\u01ca\u01c2\u0001\u0000\u0000\u0000\u01ca\u01c3\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c4\u0001\u0000\u0000\u0000\u01ca\u01c5\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01ca\u01c7\u0001\u0000\u0000"+
		"\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01c9\u0001\u0000\u0000"+
		"\u0000\u01cb1\u0001\u0000\u0000\u0000\u01cc\u01cd\u0005\"\u0000\u0000"+
		"\u01cd\u01ce\u0005X\u0000\u0000\u01ce\u01cf\u0005\'\u0000\u0000\u01cf"+
		"\u01da\u00030\u0018\u0000\u01d0\u01d1\u0005%\u0000\u0000\u01d1\u01d2\u0005"+
		"X\u0000\u0000\u01d2\u01d3\u0005\'\u0000\u0000\u01d3\u01d4\u00030\u0018"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005%\u0000\u0000"+
		"\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000"+
		"\u01d7\u01d9\u0001\u0000\u0000\u0000\u01d8\u01d0\u0001\u0000\u0000\u0000"+
		"\u01d9\u01dc\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000"+
		"\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000"+
		"\u01dc\u01da\u0001\u0000\u0000\u0000\u01dd\u01de\u0005#\u0000\u0000\u01de"+
		"3\u0001\u0000\u0000\u0000\u01df\u01e4\u0005\u001e\u0000\u0000\u01e0\u01e3"+
		"\u0005X\u0000\u0000\u01e1\u01e3\u00030\u0018\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e4\u01e2\u0001\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000"+
		"\u0000\u0000\u01e5\u01ee\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000"+
		"\u0000\u0000\u01e7\u01ea\u0005%\u0000\u0000\u01e8\u01eb\u0005X\u0000\u0000"+
		"\u01e9\u01eb\u00030\u0018\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01ea"+
		"\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ed\u0001\u0000\u0000\u0000\u01ec"+
		"\u01e7\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f2\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1"+
		"\u01f3\u0005%\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5"+
		"\u0005\u001f\u0000\u0000\u01f55\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005"+
		"X\u0000\u0000\u01f7\u01f8\u0005&\u0000\u0000\u01f8\u01fd\u0003D\"\u0000"+
		"\u01f9\u01fa\u0005%\u0000\u0000\u01fa\u01fc\u0003D\"\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fc\u01ff\u0001\u0000\u0000\u0000\u01fd\u01fb"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u0200"+
		"\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000\u0000\u0000\u0200\u0201"+
		"\u0005$\u0000\u0000\u0201\u0212\u0001\u0000\u0000\u0000\u0202\u0203\u0005"+
		"X\u0000\u0000\u0203\u0204\u0005&\u0000\u0000\u0204\u020d\u0005\u001e\u0000"+
		"\u0000\u0205\u020a\u00030\u0018\u0000\u0206\u0207\u0005%\u0000\u0000\u0207"+
		"\u0209\u00030\u0018\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020c"+
		"\u0001\u0000\u0000\u0000\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a"+
		"\u0001\u0000\u0000\u0000\u020d\u0205\u0001\u0000\u0000\u0000\u020d\u020e"+
		"\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210"+
		"\u0005\u001f\u0000\u0000\u0210\u0212\u0005$\u0000\u0000\u0211\u01f6\u0001"+
		"\u0000\u0000\u0000\u0211\u0202\u0001\u0000\u0000\u0000\u02127\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0005=\u0000\u0000\u0214\u0215\u0005 \u0000\u0000"+
		"\u0215\u0216\u0003D\"\u0000\u0216\u0217\u0005!\u0000\u0000\u0217\u021b"+
		"\u0003B!\u0000\u0218\u021a\u0003<\u001e\u0000\u0219\u0218\u0001\u0000"+
		"\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219\u0001\u0000"+
		"\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u0220\u0001\u0000"+
		"\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u021f\u0005>\u0000"+
		"\u0000\u021f\u0221\u0003B!\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0001\u0000\u0000\u0000\u02219\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0005?\u0000\u0000\u0223\u0224\u0005 \u0000\u0000\u0224\u0225\u0003D"+
		"\"\u0000\u0225\u0226\u0005!\u0000\u0000\u0226\u0227\u0003B!\u0000\u0227"+
		";\u0001\u0000\u0000\u0000\u0228\u0229\u0005>\u0000\u0000\u0229\u022a\u0005"+
		"=\u0000\u0000\u022a\u022b\u0005 \u0000\u0000\u022b\u022c\u0003D\"\u0000"+
		"\u022c\u022d\u0005!\u0000\u0000\u022d\u022e\u0003B!\u0000\u022e=\u0001"+
		"\u0000\u0000\u0000\u022f\u0230\u0005@\u0000\u0000\u0230\u0231\u0005$\u0000"+
		"\u0000\u0231?\u0001\u0000\u0000\u0000\u0232\u0233\u0005B\u0000\u0000\u0233"+
		"\u0234\u0005$\u0000\u0000\u0234A\u0001\u0000\u0000\u0000\u0235\u0239\u0005"+
		"\"\u0000\u0000\u0236\u0238\u0003\u0002\u0001\u0000\u0237\u0236\u0001\u0000"+
		"\u0000\u0000\u0238\u023b\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000"+
		"\u0000\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023c\u0001\u0000"+
		"\u0000\u0000\u023b\u0239\u0001\u0000\u0000\u0000\u023c\u023d\u0005#\u0000"+
		"\u0000\u023dC\u0001\u0000\u0000\u0000\u023e\u023f\u0006\"\uffff\uffff"+
		"\u0000\u023f\u0240\u0005 \u0000\u0000\u0240\u0241\u0003D\"\u0000\u0241"+
		"\u0242\u0005!\u0000\u0000\u0242\u0253\u0001\u0000\u0000\u0000\u0243\u0244"+
		"\u0005X\u0000\u0000\u0244\u0245\u0005\u001e\u0000\u0000\u0245\u0246\u0003"+
		"D\"\u0000\u0246\u0247\u0005\u001f\u0000\u0000\u0247\u0253\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0005:\u0000\u0000\u0249\u024a\u0003D\"\u0000"+
		"\u024a\u024b\u0005;\u0000\u0000\u024b\u0253\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0005X\u0000\u0000\u024d\u024e\u0005)\u0000\u0000\u024e\u0253\u0005"+
		"X\u0000\u0000\u024f\u0253\u00030\u0018\u0000\u0250\u0253\u0005X\u0000"+
		"\u0000\u0251\u0253\u0003J%\u0000\u0252\u023e\u0001\u0000\u0000\u0000\u0252"+
		"\u0243\u0001\u0000\u0000\u0000\u0252\u0248\u0001\u0000\u0000\u0000\u0252"+
		"\u024c\u0001\u0000\u0000\u0000\u0252\u024f\u0001\u0000\u0000\u0000\u0252"+
		"\u0250\u0001\u0000\u0000\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0253"+
		"\u0280\u0001\u0000\u0000\u0000\u0254\u0255\n\u0015\u0000\u0000\u0255\u0256"+
		"\u0005,\u0000\u0000\u0256\u027f\u0003D\"\u0016\u0257\u0258\n\u0014\u0000"+
		"\u0000\u0258\u0259\u0005.\u0000\u0000\u0259\u027f\u0003D\"\u0015\u025a"+
		"\u025b\n\u0013\u0000\u0000\u025b\u025c\u0005/\u0000\u0000\u025c\u027f"+
		"\u0003D\"\u0014\u025d\u025e\n\u0012\u0000\u0000\u025e\u025f\u0005*\u0000"+
		"\u0000\u025f\u027f\u0003D\"\u0013\u0260\u0261\n\u0011\u0000\u0000\u0261"+
		"\u0262\u0005+\u0000\u0000\u0262\u027f\u0003D\"\u0012\u0263\u0264\n\u0010"+
		"\u0000\u0000\u0264\u0265\u00051\u0000\u0000\u0265\u027f\u0003D\"\u0011"+
		"\u0266\u0267\n\u000f\u0000\u0000\u0267\u0268\u00052\u0000\u0000\u0268"+
		"\u027f\u0003D\"\u0010\u0269\u026a\n\u000e\u0000\u0000\u026a\u026b\u0005"+
		"3\u0000\u0000\u026b\u027f\u0003D\"\u000f\u026c\u026d\n\r\u0000\u0000\u026d"+
		"\u026e\u00054\u0000\u0000\u026e\u027f\u0003D\"\u000e\u026f\u0270\n\f\u0000"+
		"\u0000\u0270\u0271\u00056\u0000\u0000\u0271\u027f\u0003D\"\r\u0272\u0273"+
		"\n\u000b\u0000\u0000\u0273\u0274\u00057\u0000\u0000\u0274\u027f\u0003"+
		"D\"\f\u0275\u0276\n\n\u0000\u0000\u0276\u0277\u00055\u0000\u0000\u0277"+
		"\u027f\u0003D\"\u000b\u0278\u0279\n\t\u0000\u0000\u0279\u027a\u00058\u0000"+
		"\u0000\u027a\u027f\u0003D\"\n\u027b\u027c\n\b\u0000\u0000\u027c\u027d"+
		"\u00059\u0000\u0000\u027d\u027f\u0003D\"\t\u027e\u0254\u0001\u0000\u0000"+
		"\u0000\u027e\u0257\u0001\u0000\u0000\u0000\u027e\u025a\u0001\u0000\u0000"+
		"\u0000\u027e\u025d\u0001\u0000\u0000\u0000\u027e\u0260\u0001\u0000\u0000"+
		"\u0000\u027e\u0263\u0001\u0000\u0000\u0000\u027e\u0266\u0001\u0000\u0000"+
		"\u0000\u027e\u0269\u0001\u0000\u0000\u0000\u027e\u026c\u0001\u0000\u0000"+
		"\u0000\u027e\u026f\u0001\u0000\u0000\u0000\u027e\u0272\u0001\u0000\u0000"+
		"\u0000\u027e\u0275\u0001\u0000\u0000\u0000\u027e\u0278\u0001\u0000\u0000"+
		"\u0000\u027e\u027b\u0001\u0000\u0000\u0000\u027f\u0282\u0001\u0000\u0000"+
		"\u0000\u0280\u027e\u0001\u0000\u0000\u0000\u0280\u0281\u0001\u0000\u0000"+
		"\u0000\u0281E\u0001\u0000\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0283\u0284\u0005X\u0000\u0000\u0284\u0285\u0005\'\u0000\u0000\u0285"+
		"\u028d\u0003.\u0017\u0000\u0286\u0287\u0005X\u0000\u0000\u0287\u0288\u0005"+
		"\'\u0000\u0000\u0288\u0289\u0003.\u0017\u0000\u0289\u028a\u0005&\u0000"+
		"\u0000\u028a\u028b\u00030\u0018\u0000\u028b\u028d\u0001\u0000\u0000\u0000"+
		"\u028c\u0283\u0001\u0000\u0000\u0000\u028c\u0286\u0001\u0000\u0000\u0000"+
		"\u028dG\u0001\u0000\u0000\u0000\u028e\u028f\u0005X\u0000\u0000\u028f\u0298"+
		"\u0005 \u0000\u0000\u0290\u0295\u0003D\"\u0000\u0291\u0292\u0005%\u0000"+
		"\u0000\u0292\u0294\u0003D\"\u0000\u0293\u0291\u0001\u0000\u0000\u0000"+
		"\u0294\u0297\u0001\u0000\u0000\u0000\u0295\u0293\u0001\u0000\u0000\u0000"+
		"\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0299\u0001\u0000\u0000\u0000"+
		"\u0297\u0295\u0001\u0000\u0000\u0000\u0298\u0290\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0001\u0000\u0000\u0000"+
		"\u029a\u029b\u0005!\u0000\u0000\u029bI\u0001\u0000\u0000\u0000\u029c\u029d"+
		"\u0005W\u0000\u0000\u029d\u029e\u0003L&\u0000\u029e\u029f\u0005W\u0000"+
		"\u0000\u029fK\u0001\u0000\u0000\u0000\u02a0\u02a2\u0003N\'\u0000\u02a1"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3"+
		"\u02a1\u0001\u0000\u0000\u0000\u02a3\u02a4\u0001\u0000\u0000\u0000\u02a4"+
		"\u02b7\u0001\u0000\u0000\u0000\u02a5\u02a6\u0005:\u0000\u0000\u02a6\u02a7"+
		"\u0003D\"\u0000\u02a7\u02a8\u0005;\u0000\u0000\u02a8\u02b7\u0001\u0000"+
		"\u0000\u0000\u02a9\u02ab\u0005T\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000"+
		"\u0000\u02ab\u02ae\u0001\u0000\u0000\u0000\u02ac\u02aa\u0001\u0000\u0000"+
		"\u0000\u02ac\u02ad\u0001\u0000\u0000\u0000\u02ad\u02af\u0001\u0000\u0000"+
		"\u0000\u02ae\u02ac\u0001\u0000\u0000\u0000\u02af\u02b3\u0005X\u0000\u0000"+
		"\u02b0\u02b2\u0005T\u0000\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b7\u0001\u0000\u0000\u0000\u02b5"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b6\u02a1\u0001\u0000\u0000\u0000\u02b6"+
		"\u02a5\u0001\u0000\u0000\u0000\u02b6\u02ac\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0001\u0000\u0000\u0000\u02b9M\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u00051\u0000\u0000\u02bb\u02bd\u0003P(\u0000\u02bc\u02be\u0003R)\u0000"+
		"\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000"+
		"\u02be\u02bf\u0001\u0000\u0000\u0000\u02bf\u02c1\u00052\u0000\u0000\u02c0"+
		"\u02c2\u0003L&\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001"+
		"\u0000\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0005"+
		"1\u0000\u0000\u02c4\u02c5\u0005.\u0000\u0000\u02c5\u02c6\u0003P(\u0000"+
		"\u02c6\u02c7\u00052\u0000\u0000\u02c7\u02d6\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u00051\u0000\u0000\u02c9\u02cb\u0003P(\u0000\u02ca\u02cc\u0003"+
		"R)\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cb\u02cc\u0001\u0000\u0000"+
		"\u0000\u02cc\u02cd\u0001\u0000\u0000\u0000\u02cd\u02ce\u00052\u0000\u0000"+
		"\u02ce\u02d6\u0001\u0000\u0000\u0000\u02cf\u02d0\u00051\u0000\u0000\u02d0"+
		"\u02d1\u0003P(\u0000\u02d1\u02d2\u0003R)\u0000\u02d2\u02d3\u0005.\u0000"+
		"\u0000\u02d3\u02d4\u00052\u0000\u0000\u02d4\u02d6\u0001\u0000\u0000\u0000"+
		"\u02d5\u02ba\u0001\u0000\u0000\u0000\u02d5\u02c8\u0001\u0000\u0000\u0000"+
		"\u02d5\u02cf\u0001\u0000\u0000\u0000\u02d6O\u0001\u0000\u0000\u0000\u02d7"+
		"\u02d8\u0005X\u0000\u0000\u02d8Q\u0001\u0000\u0000\u0000\u02d9\u02db\u0003"+
		"T*\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02db\u02de\u0001\u0000\u0000"+
		"\u0000\u02dc\u02da\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000"+
		"\u0000\u02ddS\u0001\u0000\u0000\u0000\u02de\u02dc\u0001\u0000\u0000\u0000"+
		"\u02df\u02f6\u0005X\u0000\u0000\u02e0\u02f6\u0003r9\u0000\u02e1\u02f6"+
		"\u0003p8\u0000\u02e2\u02f6\u0003b1\u0000\u02e3\u02f6\u0003d2\u0000\u02e4"+
		"\u02f6\u0005]\u0000\u0000\u02e5\u02ee\u0005\u001e\u0000\u0000\u02e6\u02ef"+
		"\u0005X\u0000\u0000\u02e7\u02eb\u0007\u0004\u0000\u0000\u02e8\u02ea\u0003"+
		"V+\u0000\u02e9\u02e8\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ef\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ee\u02e6\u0001\u0000\u0000\u0000\u02ee\u02e7\u0001\u0000\u0000"+
		"\u0000\u02ef\u02f0\u0001\u0000\u0000\u0000\u02f0\u02f6\u0005\u001f\u0000"+
		"\u0000\u02f1\u02f2\u0005 \u0000\u0000\u02f2\u02f3\u0007\u0004\u0000\u0000"+
		"\u02f3\u02f6\u0005!\u0000\u0000\u02f4\u02f6\u0005,\u0000\u0000\u02f5\u02df"+
		"\u0001\u0000\u0000\u0000\u02f5\u02e0\u0001\u0000\u0000\u0000\u02f5\u02e1"+
		"\u0001\u0000\u0000\u0000\u02f5\u02e2\u0001\u0000\u0000\u0000\u02f5\u02e3"+
		"\u0001\u0000\u0000\u0000\u02f5\u02e4\u0001\u0000\u0000\u0000\u02f5\u02e5"+
		"\u0001\u0000\u0000\u0000\u02f5\u02f1\u0001\u0000\u0000\u0000\u02f5\u02f4"+
		"\u0001\u0000\u0000\u0000\u02f6\u02f9\u0001\u0000\u0000\u0000\u02f7\u02f8"+
		"\u0005&\u0000\u0000\u02f8\u02fa\u0003X,\u0000\u02f9\u02f7\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0001\u0000\u0000\u0000\u02faU\u0001\u0000\u0000"+
		"\u0000\u02fb\u02fc\u0005)\u0000\u0000\u02fc\u0304\u0005X\u0000\u0000\u02fd"+
		"\u02fe\u0005\u001e\u0000\u0000\u02fe\u02ff\u0003D\"\u0000\u02ff\u0300"+
		"\u0005\u001f\u0000\u0000\u0300\u0304\u0001\u0000\u0000\u0000\u0301\u0302"+
		"\u0005)\u0000\u0000\u0302\u0304\u0003H$\u0000\u0303\u02fb\u0001\u0000"+
		"\u0000\u0000\u0303\u02fd\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000"+
		"\u0000\u0000\u0304W\u0001\u0000\u0000\u0000\u0305\u0308\u00030\u0018\u0000"+
		"\u0306\u0308\u0003D\"\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307"+
		"\u0306\u0001\u0000\u0000\u0000\u0308Y\u0001\u0000\u0000\u0000\u0309\u030a"+
		"\u0005\u001e\u0000\u0000\u030a\u030e\u0005W\u0000\u0000\u030b\u030d\u0003"+
		"\\.\u0000\u030c\u030b\u0001\u0000\u0000\u0000\u030d\u0310\u0001\u0000"+
		"\u0000\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030f\u0001\u0000"+
		"\u0000\u0000\u030f\u0311\u0001\u0000\u0000\u0000\u0310\u030e\u0001\u0000"+
		"\u0000\u0000\u0311\u0312\u0005W\u0000\u0000\u0312\u0313\u0005\u001f\u0000"+
		"\u0000\u0313[\u0001\u0000\u0000\u0000\u0314\u0316\u0005)\u0000\u0000\u0315"+
		"\u0314\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0317\u0001\u0000\u0000\u0000\u0317\u031c\u0005X\u0000\u0000\u0318\u0319"+
		"\u0005\'\u0000\u0000\u0319\u031b\u0005X\u0000\u0000\u031a\u0318\u0001"+
		"\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u031f\u0001"+
		"\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0323\u0005"+
		"\"\u0000\u0000\u0320\u0322\u0003^/\u0000\u0321\u0320\u0001\u0000\u0000"+
		"\u0000\u0322\u0325\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000"+
		"\u0000\u0323\u0324\u0001\u0000\u0000\u0000\u0324\u0326\u0001\u0000\u0000"+
		"\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0326\u0327\u0005#\u0000\u0000"+
		"\u0327]\u0001\u0000\u0000\u0000\u0328\u0329\u0005X\u0000\u0000\u0329\u0330"+
		"\u0005\'\u0000\u0000\u032a\u0331\u0005X\u0000\u0000\u032b\u032d\u0005"+
		"T\u0000\u0000\u032c\u032e\u0007\u0005\u0000\u0000\u032d\u032c\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0001\u0000\u0000\u0000\u032e\u0331\u0001\u0000"+
		"\u0000\u0000\u032f\u0331\u0003H$\u0000\u0330\u032a\u0001\u0000\u0000\u0000"+
		"\u0330\u032b\u0001\u0000\u0000\u0000\u0330\u032f\u0001\u0000\u0000\u0000"+
		"\u0331\u0332\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0341\u0001\u0000\u0000\u0000"+
		"\u0334\u033b\u0005%\u0000\u0000\u0335\u033c\u0005X\u0000\u0000\u0336\u0338"+
		"\u0005T\u0000\u0000\u0337\u0339\u0007\u0005\u0000\u0000\u0338\u0337\u0001"+
		"\u0000\u0000\u0000\u0338\u0339\u0001\u0000\u0000\u0000\u0339\u033c\u0001"+
		"\u0000\u0000\u0000\u033a\u033c\u0003H$\u0000\u033b\u0335\u0001\u0000\u0000"+
		"\u0000\u033b\u0336\u0001\u0000\u0000\u0000\u033b\u033a\u0001\u0000\u0000"+
		"\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000"+
		"\u0000\u033d\u033e\u0001\u0000\u0000\u0000\u033e\u0340\u0001\u0000\u0000"+
		"\u0000\u033f\u0334\u0001\u0000\u0000\u0000\u0340\u0343\u0001\u0000\u0000"+
		"\u0000\u0341\u033f\u0001\u0000\u0000\u0000\u0341\u0342\u0001\u0000\u0000"+
		"\u0000\u0342\u0344\u0001\u0000\u0000\u0000\u0343\u0341\u0001\u0000\u0000"+
		"\u0000\u0344\u0345\u0005$\u0000\u0000\u0345_\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0005\u0015\u0000\u0000\u0347\u0348\u0005&\u0000\u0000\u0348\u0349"+
		"\u0005\"\u0000\u0000\u0349\u034a\u0003D\"\u0000\u034a\u034b\u0005#\u0000"+
		"\u0000\u034ba\u0001\u0000\u0000\u0000\u034c\u034d\u0005 \u0000\u0000\u034d"+
		"\u034e\u0005\u0018\u0000\u0000\u034e\u034f\u0005!\u0000\u0000\u034f\u0350"+
		"\u0005&\u0000\u0000\u0350\u0351\u0005U\u0000\u0000\u0351c\u0001\u0000"+
		"\u0000\u0000\u0352\u0353\u0005 \u0000\u0000\u0353\u0354\u0005\u0019\u0000"+
		"\u0000\u0354\u0355\u0005!\u0000\u0000\u0355\u0356\u0005&\u0000\u0000\u0356"+
		"\u0357\u0005U\u0000\u0000\u0357e\u0001\u0000\u0000\u0000\u0358\u0359\u0005"+
		" \u0000\u0000\u0359\u035a\u0005\u0017\u0000\u0000\u035a\u035b\u0005!\u0000"+
		"\u0000\u035b\u035c\u0005&\u0000\u0000\u035c\u035d\u0005U\u0000\u0000\u035d"+
		"g\u0001\u0000\u0000\u0000\u035e\u035f\u0005^\u0000\u0000\u035f\u0360\u0005"+
		"&\u0000\u0000\u0360\u0361\u0005\"\u0000\u0000\u0361\u0362\u0003D\"\u0000"+
		"\u0362\u0363\u0005#\u0000\u0000\u0363i\u0001\u0000\u0000\u0000\u0364\u0365"+
		"\u0005\u001b\u0000\u0000\u0365\u0366\u0005&\u0000\u0000\u0366\u0367\u0005"+
		"U\u0000\u0000\u0367k\u0001\u0000\u0000\u0000\u0368\u0369\u0005\u001c\u0000"+
		"\u0000\u0369\u036a\u0005&\u0000\u0000\u036a\u036b\u0005U\u0000\u0000\u036b"+
		"m\u0001\u0000\u0000\u0000\u036c\u036d\u0005\u001d\u0000\u0000\u036d\u036e"+
		"\u0005&\u0000\u0000\u036e\u036f\u0007\u0006\u0000\u0000\u036fo\u0001\u0000"+
		"\u0000\u0000\u0370\u0371\u0005\u0002\u0000\u0000\u0371\u0372\u0005&\u0000"+
		"\u0000\u0372\u0373\u0003D\"\u0000\u0373q\u0001\u0000\u0000\u0000\u0374"+
		"\u0375\u0005\u0001\u0000\u0000\u0375\u0376\u0005&\u0000\u0000\u0376\u0377"+
		"\u0003D\"\u0000\u0377s\u0001\u0000\u0000\u0000Zw\u008e\u00a6\u00a8\u00ac"+
		"\u00b3\u00b7\u00cd\u00d1\u00d8\u00da\u00e4\u00ef\u00fd\u010a\u010d\u0117"+
		"\u011a\u0122\u0125\u012d\u0131\u0134\u0142\u0145\u014e\u0152\u0156\u015b"+
		"\u0165\u0168\u016e\u0179\u017c\u0183\u018a\u0199\u019c\u01a3\u01a7\u01b5"+
		"\u01ba\u01ca\u01d6\u01da\u01e2\u01e4\u01ea\u01ee\u01f2\u01fd\u020a\u020d"+
		"\u0211\u021b\u0220\u0239\u0252\u027e\u0280\u028c\u0295\u0298\u02a3\u02ac"+
		"\u02b3\u02b6\u02b8\u02bd\u02c1\u02cb\u02d5\u02dc\u02eb\u02ee\u02f5\u02f9"+
		"\u0303\u0307\u030e\u0315\u031c\u0323\u032d\u0330\u0332\u0338\u033b\u033d"+
		"\u0341";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}