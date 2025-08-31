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
		NgIfDirective=1, NgForDirective=2, State=3, Action=4, Store=5, Dispatch=6, 
		Select=7, RouterLink=8, RouterOutlet=9, Router=10, Navigate=11, NgModel=12, 
		NgSubmit=13, NgClick=14, Injectable=15, Name=16, Id=17, Src=18, Alt=19, 
		Import=20, Export=21, Abstract=22, Interface=23, Extends=24, Implements=25, 
		Console=26, Log=27, Component=28, Class=29, InlineAttributeName=30, BackgroundColorAttributeName=31, 
		TextColorAttributeName=32, TypeAttributeName=33, LabelAttributeName=34, 
		ValueAttributeName=35, PlaceHolderAttributeName=36, CheckedAttributeName=37, 
		TargetAttributeName=38, OnSubmitAttributeName=39, OnChangeAttributeName=40, 
		OnClickAttributeName=41, HeadingLevelAttributeName=42, DirectionAttributeName=43, 
		DurationAttributeName=44, RepeatAttributeName=45, GapAttributeName=46, 
		OpenBracket=47, CloseBracket=48, OpenParen=49, CloseParen=50, OpenBrace=51, 
		CloseBrace=52, SemiColon=53, Comma=54, Assign=55, Colon=56, QuestionMark=57, 
		Dot=58, Plus=59, Minus=60, Multiply=61, At=62, Divide=63, Modulus=64, 
		Not=65, LessThan=66, GreaterThan=67, LessThanEquals=68, GreaterThanEquals=69, 
		NOT_EQUAL=70, WeakEqual=71, StrongEqual=72, And=73, Or=74, AngularExpressionStart=75, 
		AngularExpressionEnd=76, Let_Identify=77, If=78, Else=79, While=80, Break=81, 
		Void=82, Continue=83, Function=84, Return=85, From=86, As=87, Null=88, 
		Enum=89, Array=90, Any=91, Arrow=92, TypeNumber=93, TypeString=94, TypeBoolean=95, 
		This=96, Constructor=97, Private=98, Public=99, Static=100, Protected=101, 
		New=102, NumberLiteral=103, StringLiteral=104, BooleanLiteral=105, Backtick=106, 
		Identifier=107, CssPixel=108, SingleLineComment=109, MultiLineComment=110, 
		WS=111;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_stateManagement = 2, RULE_stateDeclaration = 3, 
		RULE_actionDeclaration = 4, RULE_storeOperation = 5, RULE_storeDispatch = 6, 
		RULE_storeSelect = 7, RULE_actionCall = 8, RULE_navigation = 9, RULE_routerLink = 10, 
		RULE_routerOutlet = 11, RULE_routerNavigate = 12, RULE_navigationArray = 13, 
		RULE_angularTemplate = 14, RULE_ngModel = 15, RULE_ngSubmit = 16, RULE_ngClick = 17, 
		RULE_methodCallStatement = 18, RULE_component = 19, RULE_exportClass = 20, 
		RULE_classDeclaration = 21, RULE_classBody = 22, RULE_decorator = 23, 
		RULE_argumentList = 24, RULE_argument = 25, RULE_importStatement = 26, 
		RULE_thisVarible = 27, RULE_newInstanceAssignment = 28, RULE_nestedThisAssignment = 29, 
		RULE_identifierOrPropertyAssignment = 30, RULE_enumDecl = 31, RULE_enumValues = 32, 
		RULE_enumValue = 33, RULE_consoleLog = 34, RULE_abstractClass = 35, RULE_interfaceDeclaration = 36, 
		RULE_accessModifier = 37, RULE_variableDeclaration = 38, RULE_arrayDeclaration = 39, 
		RULE_abstractFunctionDeclaration = 40, RULE_functionDeclaration = 41, 
		RULE_objectDeclataion = 42, RULE_type = 43, RULE_literalValue = 44, RULE_mapLiteral = 45, 
		RULE_listLiteral = 46, RULE_assignmentStatement = 47, RULE_ifStatement = 48, 
		RULE_whileStatement = 49, RULE_elseIfStatement = 50, RULE_breakStatement = 51, 
		RULE_continueStatement = 52, RULE_block = 53, RULE_expression = 54, RULE_parameter = 55, 
		RULE_function_call = 56, RULE_html = 57, RULE_html_content = 58, RULE_html_element = 59, 
		RULE_html_tag_name = 60, RULE_html_attributes = 61, RULE_html_attribute = 62, 
		RULE_access_suffix = 63, RULE_html_attribute_value = 64, RULE_css = 65, 
		RULE_css_content = 66, RULE_css_class_content = 67, RULE_checkedAttribute = 68, 
		RULE_onChangeAttribute = 69, RULE_onClickAttribute = 70, RULE_onSubmitAttribute = 71, 
		RULE_gapAttribute = 72, RULE_directionAttribute = 73, RULE_durationAttribute = 74, 
		RULE_repeatAttribute = 75, RULE_ngForAttribute = 76, RULE_ngIfAttribute = 77, 
		RULE_templateString = 78, RULE_templateContent = 79;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "stateManagement", "stateDeclaration", "actionDeclaration", 
			"storeOperation", "storeDispatch", "storeSelect", "actionCall", "navigation", 
			"routerLink", "routerOutlet", "routerNavigate", "navigationArray", "angularTemplate", 
			"ngModel", "ngSubmit", "ngClick", "methodCallStatement", "component", 
			"exportClass", "classDeclaration", "classBody", "decorator", "argumentList", 
			"argument", "importStatement", "thisVarible", "newInstanceAssignment", 
			"nestedThisAssignment", "identifierOrPropertyAssignment", "enumDecl", 
			"enumValues", "enumValue", "consoleLog", "abstractClass", "interfaceDeclaration", 
			"accessModifier", "variableDeclaration", "arrayDeclaration", "abstractFunctionDeclaration", 
			"functionDeclaration", "objectDeclataion", "type", "literalValue", "mapLiteral", 
			"listLiteral", "assignmentStatement", "ifStatement", "whileStatement", 
			"elseIfStatement", "breakStatement", "continueStatement", "block", "expression", 
			"parameter", "function_call", "html", "html_content", "html_element", 
			"html_tag_name", "html_attributes", "html_attribute", "access_suffix", 
			"html_attribute_value", "css", "css_content", "css_class_content", "checkedAttribute", 
			"onChangeAttribute", "onClickAttribute", "onSubmitAttribute", "gapAttribute", 
			"directionAttribute", "durationAttribute", "repeatAttribute", "ngForAttribute", 
			"ngIfAttribute", "templateString", "templateContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngIf'", "'*ngFor'", "'@State'", "'@Action'", "'store'", "'dispatch'", 
			"'select'", "'routerLink'", "'router-outlet'", "'router'", "'navigate'", 
			"'[(ngModel)]'", "'(ngSubmit)'", "'(click)'", "'@Injectable'", "'name'", 
			"'id'", "'src'", "'alt'", "'import'", "'export'", "'abstract'", "'interface'", 
			"'extends'", "'implements'", "'console'", "'log'", "'@Component'", "'class'", 
			"'inline'", "'backgroundColor'", "'textColor'", "'type'", "'label'", 
			"'value'", "'placeholder'", "'checked'", "'target'", "'submit'", "'change'", 
			"'click'", "'level'", "'direction'", "'duration'", "'repeat'", "'gap'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "':'", 
			"'?'", "'.'", "'+'", "'-'", "'*'", "'@'", "'/'", "'%'", "'!'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'==='", "'&&'", "'||'", "'{{'", 
			"'}}'", "'let'", "'if'", "'else'", "'while'", "'break'", "'void'", "'continue'", 
			"'function'", "'return'", "'from'", "'as'", "'null'", "'enum'", "'Array'", 
			"'any'", "'=>'", "'number'", "'string'", "'boolean'", "'this'", "'constructor'", 
			"'private'", "'public'", "'static'", "'protected'", "'new'", null, null, 
			null, "'`'", null, "'px'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "State", "Action", "Store", 
			"Dispatch", "Select", "RouterLink", "RouterOutlet", "Router", "Navigate", 
			"NgModel", "NgSubmit", "NgClick", "Injectable", "Name", "Id", "Src", 
			"Alt", "Import", "Export", "Abstract", "Interface", "Extends", "Implements", 
			"Console", "Log", "Component", "Class", "InlineAttributeName", "BackgroundColorAttributeName", 
			"TextColorAttributeName", "TypeAttributeName", "LabelAttributeName", 
			"ValueAttributeName", "PlaceHolderAttributeName", "CheckedAttributeName", 
			"TargetAttributeName", "OnSubmitAttributeName", "OnChangeAttributeName", 
			"OnClickAttributeName", "HeadingLevelAttributeName", "DirectionAttributeName", 
			"DurationAttributeName", "RepeatAttributeName", "GapAttributeName", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "Colon", "QuestionMark", "Dot", "Plus", 
			"Minus", "Multiply", "At", "Divide", "Modulus", "Not", "LessThan", "GreaterThan", 
			"LessThanEquals", "GreaterThanEquals", "NOT_EQUAL", "WeakEqual", "StrongEqual", 
			"And", "Or", "AngularExpressionStart", "AngularExpressionEnd", "Let_Identify", 
			"If", "Else", "While", "Break", "Void", "Continue", "Function", "Return", 
			"From", "As", "Null", "Enum", "Array", "Any", "Arrow", "TypeNumber", 
			"TypeString", "TypeBoolean", "This", "Constructor", "Private", "Public", 
			"Static", "Protected", "New", "NumberLiteral", "StringLiteral", "BooleanLiteral", 
			"Backtick", "Identifier", "CssPixel", "SingleLineComment", "MultiLineComment", 
			"WS"
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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955488135276344L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4328266062337L) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
		public ComponentContext component() {
			return getRuleContext(ComponentContext.class,0);
		}
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public EnumDeclContext enumDecl() {
			return getRuleContext(EnumDeclContext.class,0);
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
		public ThisVaribleContext thisVarible() {
			return getRuleContext(ThisVaribleContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
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
		public StateManagementContext stateManagement() {
			return getRuleContext(StateManagementContext.class,0);
		}
		public NavigationContext navigation() {
			return getRuleContext(NavigationContext.class,0);
		}
		public AngularTemplateContext angularTemplate() {
			return getRuleContext(AngularTemplateContext.class,0);
		}
		public MethodCallStatementContext methodCallStatement() {
			return getRuleContext(MethodCallStatementContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				importStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				component();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				exportClass();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				arrayDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				enumDecl();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				variableDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				functionDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				ifStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				whileStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				assignmentStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				breakStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				continueStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				html_element();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(181);
				thisVarible();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(182);
				classDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(183);
				abstractClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(184);
				html();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(185);
				consoleLog();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(186);
				stateManagement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(187);
				navigation();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(188);
				angularTemplate();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(189);
				methodCallStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(190);
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
	public static class StateManagementContext extends ParserRuleContext {
		public StateDeclarationContext stateDeclaration() {
			return getRuleContext(StateDeclarationContext.class,0);
		}
		public ActionDeclarationContext actionDeclaration() {
			return getRuleContext(ActionDeclarationContext.class,0);
		}
		public StoreOperationContext storeOperation() {
			return getRuleContext(StoreOperationContext.class,0);
		}
		public StateManagementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateManagement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStateManagement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStateManagement(this);
		}
	}

	public final StateManagementContext stateManagement() throws RecognitionException {
		StateManagementContext _localctx = new StateManagementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stateManagement);
		try {
			setState(196);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case State:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				stateDeclaration();
				}
				break;
			case Action:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				actionDeclaration();
				}
				break;
			case Store:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				storeOperation();
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
	public static class StateDeclarationContext extends ParserRuleContext {
		public TerminalNode State() { return getToken(AngularParser.State, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public StateDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStateDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStateDeclaration(this);
		}
	}

	public final StateDeclarationContext stateDeclaration() throws RecognitionException {
		StateDeclarationContext _localctx = new StateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stateDeclaration);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				match(State);
				setState(199);
				match(OpenParen);
				setState(200);
				match(CloseParen);
				setState(201);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(State);
				setState(203);
				match(OpenParen);
				setState(204);
				match(StringLiteral);
				setState(205);
				match(CloseParen);
				setState(206);
				variableDeclaration();
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
	public static class ActionDeclarationContext extends ParserRuleContext {
		public TerminalNode Action() { return getToken(AngularParser.Action, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ActionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionDeclaration(this);
		}
	}

	public final ActionDeclarationContext actionDeclaration() throws RecognitionException {
		ActionDeclarationContext _localctx = new ActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actionDeclaration);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(Action);
				setState(210);
				match(OpenParen);
				setState(211);
				match(CloseParen);
				setState(212);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(Action);
				setState(214);
				match(OpenParen);
				setState(215);
				match(StringLiteral);
				setState(216);
				match(CloseParen);
				setState(217);
				functionDeclaration();
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
	public static class StoreOperationContext extends ParserRuleContext {
		public StoreDispatchContext storeDispatch() {
			return getRuleContext(StoreDispatchContext.class,0);
		}
		public StoreSelectContext storeSelect() {
			return getRuleContext(StoreSelectContext.class,0);
		}
		public StoreOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreOperation(this);
		}
	}

	public final StoreOperationContext storeOperation() throws RecognitionException {
		StoreOperationContext _localctx = new StoreOperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_storeOperation);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				storeDispatch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				storeSelect();
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
	public static class StoreDispatchContext extends ParserRuleContext {
		public TerminalNode Store() { return getToken(AngularParser.Store, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Dispatch() { return getToken(AngularParser.Dispatch, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ActionCallContext actionCall() {
			return getRuleContext(ActionCallContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public StoreDispatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeDispatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreDispatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreDispatch(this);
		}
	}

	public final StoreDispatchContext storeDispatch() throws RecognitionException {
		StoreDispatchContext _localctx = new StoreDispatchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_storeDispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(Store);
			setState(225);
			match(Dot);
			setState(226);
			match(Dispatch);
			setState(227);
			match(OpenParen);
			setState(228);
			actionCall();
			setState(229);
			match(CloseParen);
			setState(230);
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
	public static class StoreSelectContext extends ParserRuleContext {
		public TerminalNode Store() { return getToken(AngularParser.Store, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Select() { return getToken(AngularParser.Select, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public StoreSelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storeSelect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterStoreSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitStoreSelect(this);
		}
	}

	public final StoreSelectContext storeSelect() throws RecognitionException {
		StoreSelectContext _localctx = new StoreSelectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_storeSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(Store);
			setState(233);
			match(Dot);
			setState(234);
			match(Select);
			setState(235);
			match(OpenParen);
			setState(236);
			match(StringLiteral);
			setState(237);
			match(CloseParen);
			setState(238);
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
	public static class ActionCallContext extends ParserRuleContext {
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
		public ActionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterActionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitActionCall(this);
		}
	}

	public final ActionCallContext actionCall() throws RecognitionException {
		ActionCallContext _localctx = new ActionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Identifier);
			setState(241);
			match(OpenParen);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2234350564420878357L) != 0)) {
				{
				setState(242);
				expression(0);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(243);
					match(Comma);
					setState(244);
					expression(0);
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(252);
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
	public static class NavigationContext extends ParserRuleContext {
		public RouterLinkContext routerLink() {
			return getRuleContext(RouterLinkContext.class,0);
		}
		public RouterOutletContext routerOutlet() {
			return getRuleContext(RouterOutletContext.class,0);
		}
		public RouterNavigateContext routerNavigate() {
			return getRuleContext(RouterNavigateContext.class,0);
		}
		public NavigationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigation(this);
		}
	}

	public final NavigationContext navigation() throws RecognitionException {
		NavigationContext _localctx = new NavigationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_navigation);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RouterLink:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				routerLink();
				}
				break;
			case RouterOutlet:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				routerOutlet();
				}
				break;
			case Router:
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				routerNavigate();
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
	public static class RouterLinkContext extends ParserRuleContext {
		public TerminalNode RouterLink() { return getToken(AngularParser.RouterLink, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public RouterLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterLink(this);
		}
	}

	public final RouterLinkContext routerLink() throws RecognitionException {
		RouterLinkContext _localctx = new RouterLinkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_routerLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(RouterLink);
			setState(260);
			match(Assign);
			setState(261);
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
	public static class RouterOutletContext extends ParserRuleContext {
		public TerminalNode RouterOutlet() { return getToken(AngularParser.RouterOutlet, 0); }
		public RouterOutletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerOutlet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterOutlet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterOutlet(this);
		}
	}

	public final RouterOutletContext routerOutlet() throws RecognitionException {
		RouterOutletContext _localctx = new RouterOutletContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_routerOutlet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(RouterOutlet);
			}
		}
		catch (RecognitionException re) {
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
	public static class RouterNavigateContext extends ParserRuleContext {
		public TerminalNode Router() { return getToken(AngularParser.Router, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Navigate() { return getToken(AngularParser.Navigate, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public NavigationArrayContext navigationArray() {
			return getRuleContext(NavigationArrayContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public RouterNavigateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerNavigate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterRouterNavigate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitRouterNavigate(this);
		}
	}

	public final RouterNavigateContext routerNavigate() throws RecognitionException {
		RouterNavigateContext _localctx = new RouterNavigateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routerNavigate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(Router);
			setState(266);
			match(Dot);
			setState(267);
			match(Navigate);
			setState(268);
			match(OpenParen);
			setState(269);
			navigationArray();
			setState(270);
			match(CloseParen);
			setState(271);
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
	public static class NavigationArrayContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public NavigationArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_navigationArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNavigationArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNavigationArray(this);
		}
	}

	public final NavigationArrayContext navigationArray() throws RecognitionException {
		NavigationArrayContext _localctx = new NavigationArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_navigationArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(OpenBracket);
			setState(274);
			match(StringLiteral);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(275);
				match(Comma);
				setState(276);
				match(StringLiteral);
				}
				}
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
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
	public static class AngularTemplateContext extends ParserRuleContext {
		public NgModelContext ngModel() {
			return getRuleContext(NgModelContext.class,0);
		}
		public NgSubmitContext ngSubmit() {
			return getRuleContext(NgSubmitContext.class,0);
		}
		public NgClickContext ngClick() {
			return getRuleContext(NgClickContext.class,0);
		}
		public AngularTemplateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angularTemplate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterAngularTemplate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitAngularTemplate(this);
		}
	}

	public final AngularTemplateContext angularTemplate() throws RecognitionException {
		AngularTemplateContext _localctx = new AngularTemplateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_angularTemplate);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				ngModel();
				}
				break;
			case NgSubmit:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				ngSubmit();
				}
				break;
			case NgClick:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				ngClick();
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
	public static class NgModelContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode NgModel() { return getToken(AngularParser.NgModel, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public NgModelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngModel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgModel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgModel(this);
		}
	}

	public final NgModelContext ngModel() throws RecognitionException {
		NgModelContext _localctx = new NgModelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ngModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(OpenBracket);
			setState(290);
			match(NgModel);
			setState(291);
			match(CloseBracket);
			setState(292);
			match(Assign);
			setState(293);
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
	public static class NgSubmitContext extends ParserRuleContext {
		public TerminalNode NgSubmit() { return getToken(AngularParser.NgSubmit, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public NgSubmitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngSubmit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgSubmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgSubmit(this);
		}
	}

	public final NgSubmitContext ngSubmit() throws RecognitionException {
		NgSubmitContext _localctx = new NgSubmitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ngSubmit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(NgSubmit);
			setState(296);
			match(Assign);
			setState(297);
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
	public static class NgClickContext extends ParserRuleContext {
		public TerminalNode NgClick() { return getToken(AngularParser.NgClick, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public NgClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNgClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNgClick(this);
		}
	}

	public final NgClickContext ngClick() throws RecognitionException {
		NgClickContext _localctx = new NgClickContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ngClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(NgClick);
			setState(300);
			match(Assign);
			setState(301);
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
	public static class MethodCallStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public MethodCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodCallStatement(this);
		}
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			expression(0);
			setState(304);
			match(Dot);
			setState(305);
			match(Identifier);
			setState(306);
			match(OpenParen);
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2234350564420878357L) != 0)) {
				{
				setState(307);
				expression(0);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(308);
					match(Comma);
					setState(309);
					expression(0);
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(317);
			match(CloseParen);
			setState(318);
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
	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public TerminalNode Injectable() { return getToken(AngularParser.Injectable, 0); }
		public TerminalNode Component() { return getToken(AngularParser.Component, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
		enterRule(_localctx, 38, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_la = _input.LA(1);
			if ( !(_la==Injectable || _la==Component) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(321);
			match(OpenParen);
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(322);
				argumentList();
				}
				break;
			case OpenBrace:
				{
				setState(323);
				match(OpenBrace);
				setState(324);
				match(CloseBrace);
				}
				break;
			case CloseParen:
				break;
			default:
				break;
			}
			setState(327);
			match(CloseParen);
			setState(328);
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
		enterRule(_localctx, 40, RULE_exportClass);
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(Export);
				setState(331);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332);
				match(Export);
				setState(333);
				match(Identifier);
				setState(334);
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
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Class);
			setState(338);
			match(Identifier);
			setState(339);
			match(OpenBrace);
			setState(340);
			classBody();
			setState(341);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955488135276344L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4328266062337L) != 0)) {
				{
				setState(349);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(343);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(344);
					objectDeclataion();
					}
					break;
				case 3:
					{
					setState(345);
					arrayDeclaration();
					}
					break;
				case 4:
					{
					setState(346);
					abstractFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(347);
					functionDeclaration();
					}
					break;
				case 6:
					{
					setState(348);
					statement();
					}
					break;
				}
				}
				setState(353);
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
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decorator);
		int _la;
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(354);
					argumentList();
					}
				}

				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(357);
				match(OpenBrace);
				setState(358);
				match(CloseBrace);
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
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			argument();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(362);
					match(Comma);
					setState(363);
					argument();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(369);
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
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(Identifier);
			setState(373);
			match(Colon);
			setState(374);
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
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(AngularParser.From, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
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
		enterRule(_localctx, 52, RULE_importStatement);
		int _la;
		try {
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(Import);
				setState(377);
				match(OpenBrace);
				setState(378);
				match(Identifier);
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(379);
					match(Comma);
					setState(380);
					match(Identifier);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386);
				match(CloseBrace);
				setState(387);
				match(From);
				setState(388);
				match(StringLiteral);
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(389);
					match(SemiColon);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(Import);
				setState(393);
				match(Identifier);
				setState(394);
				match(From);
				setState(395);
				match(StringLiteral);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(396);
					match(SemiColon);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(Import);
				setState(400);
				match(Multiply);
				setState(401);
				match(As);
				setState(402);
				match(Identifier);
				setState(403);
				match(From);
				setState(404);
				match(StringLiteral);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(405);
					match(SemiColon);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(408);
				match(Import);
				setState(409);
				match(StringLiteral);
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(410);
					match(SemiColon);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(413);
				match(Import);
				setState(414);
				match(Identifier);
				setState(415);
				match(Comma);
				setState(416);
				match(OpenBrace);
				setState(417);
				match(Identifier);
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(418);
					match(Comma);
					setState(419);
					match(Identifier);
					}
					}
					setState(424);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(425);
				match(CloseBrace);
				setState(426);
				match(From);
				setState(427);
				match(StringLiteral);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(428);
					match(SemiColon);
					}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThisVaribleContext extends ParserRuleContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public NewInstanceAssignmentContext newInstanceAssignment() {
			return getRuleContext(NewInstanceAssignmentContext.class,0);
		}
		public NestedThisAssignmentContext nestedThisAssignment() {
			return getRuleContext(NestedThisAssignmentContext.class,0);
		}
		public IdentifierOrPropertyAssignmentContext identifierOrPropertyAssignment() {
			return getRuleContext(IdentifierOrPropertyAssignmentContext.class,0);
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
	}

	public final ThisVaribleContext thisVarible() throws RecognitionException {
		ThisVaribleContext _localctx = new ThisVaribleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thisVarible);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(This);
			setState(434);
			match(Dot);
			setState(435);
			match(Identifier);
			setState(436);
			match(Assign);
			setState(440);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				setState(437);
				newInstanceAssignment();
				}
				break;
			case This:
				{
				setState(438);
				nestedThisAssignment();
				}
				break;
			case Identifier:
				{
				setState(439);
				identifierOrPropertyAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(442);
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
		enterRule(_localctx, 56, RULE_newInstanceAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(New);
			setState(445);
			match(Identifier);
			setState(446);
			match(OpenParen);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2234350564420878357L) != 0)) {
				{
				setState(447);
				expression(0);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(448);
					match(Comma);
					setState(449);
					expression(0);
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(457);
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
	public static class NestedThisAssignmentContext extends ParserRuleContext {
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
		public NestedThisAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedThisAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterNestedThisAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitNestedThisAssignment(this);
		}
	}

	public final NestedThisAssignmentContext nestedThisAssignment() throws RecognitionException {
		NestedThisAssignmentContext _localctx = new NestedThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nestedThisAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(This);
			setState(465); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(460);
				match(Dot);
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(461);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(462);
					function_call();
					}
					break;
				}
				}
				}
				setState(467); 
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
	public static class IdentifierOrPropertyAssignmentContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public IdentifierOrPropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierOrPropertyAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterIdentifierOrPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitIdentifierOrPropertyAssignment(this);
		}
	}

	public final IdentifierOrPropertyAssignmentContext identifierOrPropertyAssignment() throws RecognitionException {
		IdentifierOrPropertyAssignmentContext _localctx = new IdentifierOrPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifierOrPropertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(Identifier);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(470);
				match(Dot);
				setState(471);
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
	public static class EnumDeclContext extends ParserRuleContext {
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
		public EnumDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumDecl(this);
		}
	}

	public final EnumDeclContext enumDecl() throws RecognitionException {
		EnumDeclContext _localctx = new EnumDeclContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			match(Enum);
			setState(475);
			match(Identifier);
			setState(476);
			match(OpenBrace);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(477);
				enumValues();
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			match(CloseBrace);
			setState(484);
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
		enterRule(_localctx, 64, RULE_enumValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(486);
			enumValue();
			setState(491);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(487);
				match(Comma);
				setState(488);
				enumValue();
				}
				}
				setState(493);
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
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(Identifier);
			setState(495);
			match(Assign);
			setState(496);
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
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(Console);
			setState(499);
			match(Dot);
			setState(500);
			match(Log);
			setState(501);
			match(OpenParen);
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(502);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(503);
				match(StringLiteral);
				}
				break;
			case 3:
				{
				setState(504);
				literalValue();
				}
				break;
			}
			setState(507);
			match(CloseParen);
			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(508);
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
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
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
	}

	public final AbstractClassContext abstractClass() throws RecognitionException {
		AbstractClassContext _localctx = new AbstractClassContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511);
			match(Abstract);
			setState(512);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
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
	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode Interface() { return getToken(AngularParser.Interface, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(Interface);
			setState(515);
			match(OpenBrace);
			setState(516);
			classBody();
			setState(517);
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
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) ) {
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
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
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclaration);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(521);
					accessModifier();
					}
				}

				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(524);
					match(Let_Identify);
					}
				}

				setState(527);
				match(Identifier);
				setState(528);
				match(Colon);
				{
				setState(529);
				type();
				}
				setState(530);
				match(Assign);
				setState(534);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(531);
					expression(0);
					}
					break;
				case 2:
					{
					setState(532);
					literalValue();
					}
					break;
				case 3:
					{
					setState(533);
					templateString();
					}
					break;
				}
				setState(536);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(538);
					accessModifier();
					}
				}

				setState(542);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(541);
					match(Let_Identify);
					}
				}

				setState(544);
				match(Identifier);
				setState(545);
				match(Assign);
				setState(549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(546);
					expression(0);
					}
					break;
				case 2:
					{
					setState(547);
					literalValue();
					}
					break;
				case 3:
					{
					setState(548);
					templateString();
					}
					break;
				}
				setState(551);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(553);
					accessModifier();
					}
				}

				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(556);
					match(Let_Identify);
					}
				}

				setState(559);
				match(Identifier);
				setState(560);
				match(Colon);
				setState(561);
				type();
				setState(562);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(564);
					accessModifier();
					}
				}

				setState(567);
				match(Identifier);
				setState(568);
				match(Assign);
				setState(572);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(569);
					expression(0);
					}
					break;
				case 2:
					{
					setState(570);
					literalValue();
					}
					break;
				case 3:
					{
					setState(571);
					templateString();
					}
					break;
				}
				setState(574);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(576);
					accessModifier();
					}
				}

				setState(579);
				match(Identifier);
				setState(580);
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
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayDeclaration);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(583);
					match(Let_Identify);
					}
				}

				setState(586);
				match(Identifier);
				setState(587);
				match(Colon);
				setState(588);
				type();
				setState(589);
				match(OpenBracket);
				setState(590);
				match(CloseBracket);
				setState(591);
				match(Assign);
				setState(592);
				match(OpenBracket);
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 1080866109592174609L) != 0)) {
					{
					setState(593);
					literalValue();
					setState(598);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(594);
						match(Comma);
						setState(595);
						literalValue();
						}
						}
						setState(600);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(603);
				match(CloseBracket);
				setState(604);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
				match(Identifier);
				setState(607);
				match(Assign);
				setState(608);
				match(OpenBracket);
				setState(610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(609);
					literalValue();
					}
					break;
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 1080866109592174609L) != 0)) {
					{
					{
					setState(612);
					literalValue();
					setState(614);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(613);
						match(Comma);
						}
					}

					}
					}
					setState(620);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(621);
				match(CloseBracket);
				setState(622);
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
	}

	public final AbstractFunctionDeclarationContext abstractFunctionDeclaration() throws RecognitionException {
		AbstractFunctionDeclarationContext _localctx = new AbstractFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(Abstract);
			setState(626);
			match(Identifier);
			setState(627);
			match(OpenParen);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(628);
				parameter();
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(629);
					match(Comma);
					setState(630);
					parameter();
					}
					}
					setState(635);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(638);
			match(CloseParen);
			setState(639);
			match(Colon);
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
			case Identifier:
				{
				setState(640);
				type();
				}
				break;
			case Void:
				{
				setState(641);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(644);
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
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
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
		enterRule(_localctx, 82, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646);
			_la = _input.LA(1);
			if ( !(_la==Constructor || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(647);
			match(OpenParen);
			setState(656);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(648);
				parameter();
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(649);
					match(Comma);
					setState(650);
					parameter();
					}
					}
					setState(655);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(658);
			match(CloseParen);
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(659);
				match(Colon);
				setState(660);
				type();
				}
			}

			setState(663);
			match(OpenBrace);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955488135276344L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4328266062337L) != 0)) {
				{
				{
				setState(664);
				statement();
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(670);
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
	public static class ObjectDeclataionContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode New() { return getToken(AngularParser.New, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
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
	}

	public final ObjectDeclataionContext objectDeclataion() throws RecognitionException {
		ObjectDeclataionContext _localctx = new ObjectDeclataionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectDeclataion);
		int _la;
		try {
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(672);
					accessModifier();
					}
				}

				setState(675);
				match(Identifier);
				setState(676);
				match(Colon);
				setState(677);
				match(Identifier);
				setState(678);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 15L) != 0)) {
					{
					setState(679);
					accessModifier();
					}
				}

				setState(682);
				match(Identifier);
				setState(683);
				match(Colon);
				setState(684);
				match(Identifier);
				setState(685);
				match(Assign);
				setState(686);
				match(New);
				setState(687);
				match(Identifier);
				setState(688);
				match(OpenParen);
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 1080866109592174609L) != 0)) {
					{
					{
					setState(689);
					literalValue();
					setState(694);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(690);
						match(Comma);
						setState(691);
						literalValue();
						}
						}
						setState(696);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(701);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(702);
				match(CloseParen);
				setState(703);
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
		enterRule(_localctx, 86, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 131131L) != 0)) ) {
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
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
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
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literalValue);
		try {
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(708);
				match(NumberLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(709);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(710);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				listLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(712);
				mapLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(713);
				match(Null);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(714);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(715);
				css();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(716);
				templateString();
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
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(OpenBrace);
			setState(720);
			match(Identifier);
			setState(721);
			match(Colon);
			setState(722);
			literalValue();
			setState(733);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(723);
				match(Comma);
				{
				setState(724);
				match(Identifier);
				setState(725);
				match(Colon);
				setState(726);
				literalValue();
				}
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(728);
					match(Comma);
					}
					break;
				}
				}
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(736);
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
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			match(OpenBracket);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2233787614199021585L) != 0)) {
				{
				setState(741);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(739);
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
					setState(740);
					literalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(753);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(746);
					match(Comma);
					setState(749);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(747);
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
						setState(748);
						literalValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(755);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(756);
				match(Comma);
				}
			}

			setState(759);
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
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
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignmentStatement);
		int _la;
		try {
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				match(Identifier);
				setState(762);
				match(Assign);
				setState(765);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(763);
					expression(0);
					}
					break;
				case 2:
					{
					setState(764);
					templateString();
					}
					break;
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(767);
					match(Comma);
					setState(768);
					expression(0);
					}
					}
					setState(773);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(774);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(776);
				match(This);
				setState(777);
				match(Dot);
				setState(778);
				match(Identifier);
				setState(779);
				match(Assign);
				setState(780);
				expression(0);
				setState(781);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				match(Identifier);
				setState(784);
				match(Assign);
				setState(785);
				match(OpenBracket);
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 1080866109592174609L) != 0)) {
					{
					setState(786);
					literalValue();
					setState(791);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(787);
						match(Comma);
						setState(788);
						literalValue();
						}
						}
						setState(793);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(796);
				match(CloseBracket);
				setState(797);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(If);
			setState(801);
			match(OpenParen);
			setState(802);
			expression(0);
			setState(803);
			match(CloseParen);
			setState(804);
			block();
			setState(808);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(805);
					elseIfStatement();
					}
					} 
				}
				setState(810);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,83,_ctx);
			}
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(811);
				match(Else);
				setState(812);
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
		enterRule(_localctx, 98, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(While);
			setState(816);
			match(OpenParen);
			setState(817);
			expression(0);
			setState(818);
			match(CloseParen);
			setState(819);
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
		enterRule(_localctx, 100, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			match(Else);
			setState(822);
			match(If);
			setState(823);
			match(OpenParen);
			setState(824);
			expression(0);
			setState(825);
			match(CloseParen);
			setState(826);
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
		enterRule(_localctx, 102, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(Break);
			setState(829);
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
		enterRule(_localctx, 104, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(Continue);
			setState(832);
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
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(834);
			match(OpenBrace);
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2955488135276344L) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 4328266062337L) != 0)) {
				{
				{
				setState(835);
				statement();
				}
				}
				setState(840);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(841);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public MethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitMethodCall(this);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleArrowFunctionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public SimpleArrowFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterSimpleArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitSimpleArrowFunction(this);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrowFunction(this);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPropertyAccessContext extends ExpressionContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ThisPropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisPropertyAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisPropertyAccess(this);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisMethodCallContext extends ExpressionContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public List<TerminalNode> Dot() { return getTokens(AngularParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(AngularParser.Dot, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
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
		public ThisMethodCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisMethodCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayMethodWithArrowFunctionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public ArrayMethodWithArrowFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterArrayMethodWithArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitArrayMethodWithArrowFunction(this);
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
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ThisPropertyAssignmentContext extends ExpressionContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisPropertyAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterThisPropertyAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitThisPropertyAssignment(this);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(844);
				match(OpenParen);
				setState(845);
				expression(0);
				setState(846);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(848);
				match(Identifier);
				setState(849);
				match(OpenBracket);
				setState(850);
				expression(0);
				setState(851);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new AngularExpreissionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(853);
				match(AngularExpressionStart);
				setState(854);
				expression(0);
				setState(855);
				match(AngularExpressionEnd);
				}
				break;
			case 4:
				{
				_localctx = new ThisMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(857);
				match(This);
				setState(858);
				match(Dot);
				setState(859);
				match(Identifier);
				setState(860);
				match(Dot);
				setState(861);
				match(Identifier);
				setState(862);
				match(OpenParen);
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2234350564420878357L) != 0)) {
					{
					setState(863);
					expression(0);
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(864);
						match(Comma);
						setState(865);
						expression(0);
						}
						}
						setState(870);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(873);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new ArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(874);
				match(Identifier);
				setState(875);
				match(Arrow);
				setState(876);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new SimpleArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(877);
				match(Identifier);
				setState(878);
				match(Arrow);
				setState(879);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ThisPropertyAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(880);
				match(This);
				setState(881);
				match(Dot);
				setState(882);
				match(Identifier);
				setState(883);
				match(Assign);
				setState(884);
				expression(6);
				}
				break;
			case 8:
				{
				_localctx = new ThisPropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(885);
				match(This);
				setState(886);
				match(Dot);
				setState(887);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new PropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(888);
				match(Identifier);
				setState(889);
				match(Dot);
				setState(890);
				match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(891);
				literalValue();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(892);
				match(Identifier);
				}
				break;
			case 12:
				{
				_localctx = new DdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(893);
				html();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(965);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(963);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(897);
						match(Multiply);
						setState(898);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(900);
						match(Divide);
						setState(901);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(902);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(903);
						match(Modulus);
						setState(904);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(905);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(906);
						match(Plus);
						setState(907);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(908);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(909);
						match(Minus);
						setState(910);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new LessThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(911);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(912);
						match(LessThan);
						setState(913);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(914);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(915);
						match(GreaterThan);
						setState(916);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(917);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(918);
						match(LessThanEquals);
						setState(919);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(920);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(921);
						match(GreaterThanEquals);
						setState(922);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new WeakEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(923);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(924);
						match(WeakEqual);
						setState(925);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new StrongEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(926);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(927);
						match(StrongEqual);
						setState(928);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(929);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(930);
						match(NOT_EQUAL);
						setState(931);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(932);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(933);
						match(And);
						setState(934);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(935);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(936);
						match(Or);
						setState(937);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(938);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(939);
						match(Dot);
						setState(940);
						match(Identifier);
						setState(941);
						match(OpenParen);
						setState(950);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2234350564420878357L) != 0)) {
							{
							setState(942);
							expression(0);
							setState(947);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(943);
								match(Comma);
								setState(944);
								expression(0);
								}
								}
								setState(949);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(952);
						match(CloseParen);
						}
						break;
					case 16:
						{
						_localctx = new ArrayMethodWithArrowFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(953);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(954);
						match(Dot);
						setState(955);
						match(Identifier);
						setState(956);
						match(OpenParen);
						{
						setState(957);
						match(Identifier);
						setState(958);
						match(Arrow);
						setState(959);
						expression(0);
						}
						setState(961);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(967);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parameter);
		try {
			setState(978);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				match(Identifier);
				setState(969);
				match(Colon);
				setState(970);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(971);
				match(Identifier);
				setState(972);
				match(Colon);
				setState(973);
				type();
				setState(974);
				match(Assign);
				setState(975);
				literalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				match(Identifier);
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
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			match(Identifier);
			setState(981);
			match(OpenParen);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 2234350564420878357L) != 0)) {
				{
				setState(982);
				expression(0);
				setState(987);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(983);
					match(Comma);
					setState(984);
					expression(0);
					}
					}
					setState(989);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(992);
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
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			match(Backtick);
			setState(995);
			html_content();
			setState(996);
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
		public List<Html_elementContext> html_element() {
			return getRuleContexts(Html_elementContext.class);
		}
		public Html_elementContext html_element(int i) {
			return getRuleContext(Html_elementContext.class,i);
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
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
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
		enterRule(_localctx, 116, RULE_html_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1006); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(1006);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(998);
						html_element();
						}
						break;
					case AngularExpressionStart:
						{
						setState(999);
						match(AngularExpressionStart);
						setState(1000);
						expression(0);
						setState(1001);
						match(AngularExpressionEnd);
						}
						break;
					case Identifier:
						{
						setState(1003);
						match(Identifier);
						}
						break;
					case StringLiteral:
						{
						setState(1004);
						match(StringLiteral);
						}
						break;
					case NumberLiteral:
						{
						setState(1005);
						match(NumberLiteral);
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
				setState(1008); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
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
		public Html_contentContext html_content() {
			return getRuleContext(Html_contentContext.class,0);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public Html_attributesContext html_attributes() {
			return getRuleContext(Html_attributesContext.class,0);
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
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_html_element);
		try {
			setState(1041);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1010);
				match(LessThan);
				setState(1011);
				html_tag_name();
				setState(1013);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1012);
					html_attributes();
					}
					break;
				}
				setState(1015);
				match(GreaterThan);
				setState(1016);
				html_content();
				setState(1017);
				match(LessThan);
				setState(1018);
				match(Divide);
				setState(1019);
				html_tag_name();
				setState(1020);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1022);
				match(LessThan);
				setState(1023);
				html_tag_name();
				setState(1025);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1024);
					html_attributes();
					}
					break;
				}
				setState(1027);
				match(GreaterThan);
				setState(1029);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1028);
					html_content();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1031);
				match(LessThan);
				setState(1032);
				html_tag_name();
				setState(1033);
				html_attributes();
				setState(1034);
				match(Divide);
				setState(1035);
				match(GreaterThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1037);
				match(LessThan);
				setState(1038);
				html_tag_name();
				setState(1039);
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
	}

	public final Html_tag_nameContext html_tag_name() throws RecognitionException {
		Html_tag_nameContext _localctx = new Html_tag_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_html_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
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
	}

	public final Html_attributesContext html_attributes() throws RecognitionException {
		Html_attributesContext _localctx = new Html_attributesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_html_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2306683577801048070L) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & 19L) != 0)) {
				{
				{
				setState(1045);
				html_attribute();
				}
				}
				setState(1050);
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
		public TerminalNode Class() { return getToken(AngularParser.Class, 0); }
		public TerminalNode Name() { return getToken(AngularParser.Name, 0); }
		public TerminalNode Id() { return getToken(AngularParser.Id, 0); }
		public TerminalNode Src() { return getToken(AngularParser.Src, 0); }
		public TerminalNode Alt() { return getToken(AngularParser.Alt, 0); }
		public TerminalNode TypeAttributeName() { return getToken(AngularParser.TypeAttributeName, 0); }
		public TerminalNode LabelAttributeName() { return getToken(AngularParser.LabelAttributeName, 0); }
		public TerminalNode ValueAttributeName() { return getToken(AngularParser.ValueAttributeName, 0); }
		public TerminalNode PlaceHolderAttributeName() { return getToken(AngularParser.PlaceHolderAttributeName, 0); }
		public TerminalNode CheckedAttributeName() { return getToken(AngularParser.CheckedAttributeName, 0); }
		public TerminalNode TargetAttributeName() { return getToken(AngularParser.TargetAttributeName, 0); }
		public TerminalNode HeadingLevelAttributeName() { return getToken(AngularParser.HeadingLevelAttributeName, 0); }
		public TerminalNode DirectionAttributeName() { return getToken(AngularParser.DirectionAttributeName, 0); }
		public TerminalNode DurationAttributeName() { return getToken(AngularParser.DurationAttributeName, 0); }
		public TerminalNode RepeatAttributeName() { return getToken(AngularParser.RepeatAttributeName, 0); }
		public TerminalNode GapAttributeName() { return getToken(AngularParser.GapAttributeName, 0); }
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
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public TerminalNode NgIfDirective() { return getToken(AngularParser.NgIfDirective, 0); }
		public TerminalNode NgForDirective() { return getToken(AngularParser.NgForDirective, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
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
		enterRule(_localctx, 124, RULE_html_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1051);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1052);
				match(Class);
				}
				break;
			case 3:
				{
				setState(1053);
				match(Name);
				}
				break;
			case 4:
				{
				setState(1054);
				match(Id);
				}
				break;
			case 5:
				{
				setState(1055);
				match(Src);
				}
				break;
			case 6:
				{
				setState(1056);
				match(Alt);
				}
				break;
			case 7:
				{
				setState(1057);
				match(TypeAttributeName);
				}
				break;
			case 8:
				{
				setState(1058);
				match(LabelAttributeName);
				}
				break;
			case 9:
				{
				setState(1059);
				match(ValueAttributeName);
				}
				break;
			case 10:
				{
				setState(1060);
				match(PlaceHolderAttributeName);
				}
				break;
			case 11:
				{
				setState(1061);
				match(CheckedAttributeName);
				}
				break;
			case 12:
				{
				setState(1062);
				match(TargetAttributeName);
				}
				break;
			case 13:
				{
				setState(1063);
				match(HeadingLevelAttributeName);
				}
				break;
			case 14:
				{
				setState(1064);
				match(DirectionAttributeName);
				}
				break;
			case 15:
				{
				setState(1065);
				match(DurationAttributeName);
				}
				break;
			case 16:
				{
				setState(1066);
				match(RepeatAttributeName);
				}
				break;
			case 17:
				{
				setState(1067);
				match(GapAttributeName);
				}
				break;
			case 18:
				{
				setState(1068);
				ngIfAttribute();
				}
				break;
			case 19:
				{
				setState(1069);
				ngForAttribute();
				}
				break;
			case 20:
				{
				setState(1070);
				onChangeAttribute();
				}
				break;
			case 21:
				{
				setState(1071);
				onClickAttribute();
				}
				break;
			case 22:
				{
				setState(1072);
				match(OpenBracket);
				setState(1081);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(1073);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(1074);
					match(Identifier);
					setState(1078);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(1075);
						access_suffix();
						}
						}
						setState(1080);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(1083);
				match(CloseBracket);
				}
				break;
			case 23:
				{
				setState(1084);
				match(OpenParen);
				{
				setState(1085);
				match(Identifier);
				}
				setState(1086);
				match(CloseParen);
				}
				break;
			case 24:
				{
				setState(1087);
				match(Multiply);
				setState(1088);
				match(Identifier);
				}
				break;
			case 25:
				{
				setState(1089);
				match(NgIfDirective);
				}
				break;
			case 26:
				{
				setState(1090);
				match(NgForDirective);
				}
				break;
			case 27:
				{
				setState(1091);
				match(StringLiteral);
				}
				break;
			case 28:
				{
				setState(1092);
				match(NumberLiteral);
				}
				break;
			}
			setState(1097);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1095);
				match(Assign);
				setState(1096);
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
		enterRule(_localctx, 126, RULE_access_suffix);
		try {
			setState(1107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1099);
				match(Dot);
				setState(1100);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				match(OpenBracket);
				setState(1102);
				expression(0);
				setState(1103);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1105);
				match(Dot);
				setState(1106);
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
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
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
		enterRule(_localctx, 128, RULE_html_attribute_value);
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1109);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1110);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1111);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1112);
				match(Identifier);
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
		enterRule(_localctx, 130, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(OpenBracket);
			setState(1116);
			match(Backtick);
			setState(1120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(1117);
				css_content();
				}
				}
				setState(1122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1123);
			match(Backtick);
			setState(1124);
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
		enterRule(_localctx, 132, RULE_css_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(1126);
				match(Dot);
				}
			}

			setState(1129);
			match(Identifier);
			setState(1134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1130);
				match(Colon);
				setState(1131);
				match(Identifier);
				}
				}
				setState(1136);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1137);
			match(OpenBrace);
			setState(1141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(1138);
				css_class_content();
				}
				}
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1144);
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
	}

	public final Css_class_contentContext css_class_content() throws RecognitionException {
		Css_class_contentContext _localctx = new Css_class_contentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_css_class_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1146);
			match(Identifier);
			setState(1147);
			match(Colon);
			setState(1154); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1154);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
				case 1:
					{
					setState(1148);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1149);
					match(NumberLiteral);
					setState(1151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(1150);
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
					setState(1153);
					function_call();
					}
					break;
				}
				}
				setState(1156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(1171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1158);
				match(Comma);
				setState(1165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1165);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
					case 1:
						{
						setState(1159);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1160);
						match(NumberLiteral);
						setState(1162);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(1161);
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
						setState(1164);
						function_call();
						}
						break;
					}
					}
					setState(1167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(1173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1174);
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
		enterRule(_localctx, 136, RULE_checkedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1176);
			match(CheckedAttributeName);
			setState(1177);
			match(Assign);
			setState(1178);
			match(OpenBrace);
			setState(1179);
			expression(0);
			setState(1180);
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
		enterRule(_localctx, 138, RULE_onChangeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			match(OpenParen);
			setState(1183);
			match(OnChangeAttributeName);
			setState(1184);
			match(CloseParen);
			setState(1185);
			match(Assign);
			setState(1186);
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
		enterRule(_localctx, 140, RULE_onClickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(OpenParen);
			setState(1189);
			match(OnClickAttributeName);
			setState(1190);
			match(CloseParen);
			setState(1191);
			match(Assign);
			setState(1192);
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
		enterRule(_localctx, 142, RULE_onSubmitAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			match(OpenParen);
			setState(1195);
			match(OnSubmitAttributeName);
			setState(1196);
			match(CloseParen);
			setState(1197);
			match(Assign);
			setState(1198);
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
		enterRule(_localctx, 144, RULE_gapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(GapAttributeName);
			setState(1201);
			match(Assign);
			setState(1202);
			match(OpenBrace);
			setState(1203);
			expression(0);
			setState(1204);
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
		enterRule(_localctx, 146, RULE_directionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(DirectionAttributeName);
			setState(1207);
			match(Assign);
			setState(1208);
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
		enterRule(_localctx, 148, RULE_durationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(DurationAttributeName);
			setState(1211);
			match(Assign);
			setState(1212);
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
		enterRule(_localctx, 150, RULE_repeatAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(RepeatAttributeName);
			setState(1215);
			match(Assign);
			setState(1216);
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
		enterRule(_localctx, 152, RULE_ngForAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(NgForDirective);
			setState(1219);
			match(Assign);
			setState(1220);
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
		enterRule(_localctx, 154, RULE_ngIfAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1222);
			match(NgIfDirective);
			setState(1223);
			match(Assign);
			setState(1224);
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
	public static class TemplateStringContext extends ParserRuleContext {
		public List<TerminalNode> Backtick() { return getTokens(AngularParser.Backtick); }
		public TerminalNode Backtick(int i) {
			return getToken(AngularParser.Backtick, i);
		}
		public TemplateContentContext templateContent() {
			return getRuleContext(TemplateContentContext.class,0);
		}
		public TemplateStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateString(this);
		}
	}

	public final TemplateStringContext templateString() throws RecognitionException {
		TemplateStringContext _localctx = new TemplateStringContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_templateString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1226);
			match(Backtick);
			setState(1227);
			templateContent();
			setState(1228);
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
	public static class TemplateContentContext extends ParserRuleContext {
		public List<Html_elementContext> html_element() {
			return getRuleContexts(Html_elementContext.class);
		}
		public Html_elementContext html_element(int i) {
			return getRuleContext(Html_elementContext.class,i);
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
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public List<TerminalNode> StringLiteral() { return getTokens(AngularParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(AngularParser.StringLiteral, i);
		}
		public List<TerminalNode> NumberLiteral() { return getTokens(AngularParser.NumberLiteral); }
		public TerminalNode NumberLiteral(int i) {
			return getToken(AngularParser.NumberLiteral, i);
		}
		public List<TerminalNode> BooleanLiteral() { return getTokens(AngularParser.BooleanLiteral); }
		public TerminalNode BooleanLiteral(int i) {
			return getToken(AngularParser.BooleanLiteral, i);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitTemplateContent(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_templateContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1239); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1239);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LessThan:
					{
					setState(1230);
					html_element();
					}
					break;
				case AngularExpressionStart:
					{
					setState(1231);
					match(AngularExpressionStart);
					setState(1232);
					expression(0);
					setState(1233);
					match(AngularExpressionEnd);
					}
					break;
				case Identifier:
					{
					setState(1235);
					match(Identifier);
					}
					break;
				case StringLiteral:
					{
					setState(1236);
					match(StringLiteral);
					}
					break;
				case NumberLiteral:
					{
					setState(1237);
					match(NumberLiteral);
					}
					break;
				case BooleanLiteral:
					{
					setState(1238);
					match(BooleanLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1241); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & 3161095930369L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		case 54:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 28);
		case 1:
			return precpred(_ctx, 27);
		case 2:
			return precpred(_ctx, 26);
		case 3:
			return precpred(_ctx, 25);
		case 4:
			return precpred(_ctx, 24);
		case 5:
			return precpred(_ctx, 23);
		case 6:
			return precpred(_ctx, 22);
		case 7:
			return precpred(_ctx, 21);
		case 8:
			return precpred(_ctx, 20);
		case 9:
			return precpred(_ctx, 19);
		case 10:
			return precpred(_ctx, 18);
		case 11:
			return precpred(_ctx, 17);
		case 12:
			return precpred(_ctx, 16);
		case 13:
			return precpred(_ctx, 15);
		case 14:
			return precpred(_ctx, 11);
		case 15:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001o\u04dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0001"+
		"\u0000\u0005\u0000\u00a2\b\u0000\n\u0000\f\u0000\u00a5\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u00c0\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00c5\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00d0\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00db\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005\u00df\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u00f6\b\b"+
		"\n\b\f\b\u00f9\t\b\u0003\b\u00fb\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u0102\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0116\b\r\n\r\f\r\u0119\t\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0120\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0137\b\u0012\n\u0012"+
		"\f\u0012\u013a\t\u0012\u0003\u0012\u013c\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0146\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0150\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u015e\b\u0016\n\u0016\f\u0016\u0161\t\u0016\u0001\u0017\u0003"+
		"\u0017\u0164\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0168\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u016d\b\u0018\n\u0018"+
		"\f\u0018\u0170\t\u0018\u0001\u0018\u0003\u0018\u0173\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u017e\b\u001a\n\u001a\f\u001a\u0181"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0187"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u018e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0197\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u019c\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u01a5"+
		"\b\u001a\n\u001a\f\u001a\u01a8\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01ae\b\u001a\u0003\u001a\u01b0\b\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u01b9\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01c3"+
		"\b\u001c\n\u001c\f\u001c\u01c6\t\u001c\u0003\u001c\u01c8\b\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u01d0\b\u001d\u0004\u001d\u01d2\b\u001d\u000b\u001d\f\u001d\u01d3"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01d9\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01df\b\u001f\n\u001f"+
		"\f\u001f\u01e2\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0005 \u01ea\b \n \f \u01ed\t \u0001!\u0001!\u0001!\u0001!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01fa\b\"\u0001"+
		"\"\u0001\"\u0003\"\u01fe\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001&\u0003&\u020b\b&\u0001&\u0003&\u020e"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0217\b&\u0001"+
		"&\u0001&\u0001&\u0003&\u021c\b&\u0001&\u0003&\u021f\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0003&\u0226\b&\u0001&\u0001&\u0001&\u0003&\u022b\b&\u0001"+
		"&\u0003&\u022e\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u0236"+
		"\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u023d\b&\u0001&\u0001&\u0001"+
		"&\u0003&\u0242\b&\u0001&\u0001&\u0003&\u0246\b&\u0001\'\u0003\'\u0249"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0005\'\u0255\b\'\n\'\f\'\u0258\t\'\u0003\'\u025a\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0263\b\'\u0001"+
		"\'\u0001\'\u0003\'\u0267\b\'\u0005\'\u0269\b\'\n\'\f\'\u026c\t\'\u0001"+
		"\'\u0001\'\u0003\'\u0270\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u0278\b(\n(\f(\u027b\t(\u0003(\u027d\b(\u0001(\u0001(\u0001("+
		"\u0001(\u0003(\u0283\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u028c\b)\n)\f)\u028f\t)\u0003)\u0291\b)\u0001)\u0001)\u0001)"+
		"\u0003)\u0296\b)\u0001)\u0001)\u0005)\u029a\b)\n)\f)\u029d\t)\u0001)\u0001"+
		")\u0001*\u0003*\u02a2\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02a9"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u02b5\b*\n*\f*\u02b8\t*\u0005*\u02ba\b*\n*\f*\u02bd\t*\u0001"+
		"*\u0001*\u0003*\u02c1\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u02ce\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02da\b-\u0005-\u02dc"+
		"\b-\n-\f-\u02df\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u02e6\b."+
		"\n.\f.\u02e9\t.\u0001.\u0001.\u0001.\u0003.\u02ee\b.\u0005.\u02f0\b.\n"+
		".\f.\u02f3\t.\u0001.\u0003.\u02f6\b.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u02fe\b/\u0001/\u0001/\u0005/\u0302\b/\n/\f/\u0305\t/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0316\b/\n/\f/\u0319\t/\u0003"+
		"/\u031b\b/\u0001/\u0001/\u0003/\u031f\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u0327\b0\n0\f0\u032a\t0\u00010\u00010\u00030\u032e\b0"+
		"\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"5\u00015\u00055\u0345\b5\n5\f5\u0348\t5\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00056\u0363\b6\n6\f6\u0366\t6\u00036\u0368\b6\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u037f"+
		"\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0005"+
		"6\u03b2\b6\n6\f6\u03b5\t6\u00036\u03b7\b6\u00016\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u03c4\b6\n6\f"+
		"6\u03c7\t6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u03d3\b7\u00018\u00018\u00018\u00018\u00018\u00058\u03da"+
		"\b8\n8\f8\u03dd\t8\u00038\u03df\b8\u00018\u00018\u00019\u00019\u00019"+
		"\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0004"+
		":\u03ef\b:\u000b:\f:\u03f0\u0001;\u0001;\u0001;\u0003;\u03f6\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u0402\b;\u0001;\u0001;\u0003;\u0406\b;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u0412\b;\u0001<\u0001<\u0001"+
		"=\u0005=\u0417\b=\n=\f=\u041a\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005"+
		">\u0435\b>\n>\f>\u0438\t>\u0003>\u043a\b>\u0001>\u0001>\u0001>\u0001>"+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u0446\b>\u0001>\u0001"+
		">\u0003>\u044a\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u0454\b?\u0001@\u0001@\u0001@\u0001@\u0003@\u045a\b@\u0001A\u0001"+
		"A\u0001A\u0005A\u045f\bA\nA\fA\u0462\tA\u0001A\u0001A\u0001A\u0001B\u0003"+
		"B\u0468\bB\u0001B\u0001B\u0001B\u0005B\u046d\bB\nB\fB\u0470\tB\u0001B"+
		"\u0001B\u0005B\u0474\bB\nB\fB\u0477\tB\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u0480\bC\u0001C\u0004C\u0483\bC\u000bC\fC\u0484"+
		"\u0001C\u0001C\u0001C\u0001C\u0003C\u048b\bC\u0001C\u0004C\u048e\bC\u000b"+
		"C\fC\u048f\u0005C\u0492\bC\nC\fC\u0495\tC\u0001C\u0001C\u0001D\u0001D"+
		"\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001"+
		"K\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001"+
		"N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0004O\u04d8\bO\u000bO\fO\u04d9\u0001O\u0000\u0001lP\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u0000\u0006\u0002\u0000\u000f\u000f\u001c\u001c\u0001\u0000be\u0002\u0000"+
		"aakk\u0003\u0000Z[]_kk\u0002\u0000@@ll\u0001\u0000gh\u0576\u0000\u00a3"+
		"\u0001\u0000\u0000\u0000\u0002\u00bf\u0001\u0000\u0000\u0000\u0004\u00c4"+
		"\u0001\u0000\u0000\u0000\u0006\u00cf\u0001\u0000\u0000\u0000\b\u00da\u0001"+
		"\u0000\u0000\u0000\n\u00de\u0001\u0000\u0000\u0000\f\u00e0\u0001\u0000"+
		"\u0000\u0000\u000e\u00e8\u0001\u0000\u0000\u0000\u0010\u00f0\u0001\u0000"+
		"\u0000\u0000\u0012\u0101\u0001\u0000\u0000\u0000\u0014\u0103\u0001\u0000"+
		"\u0000\u0000\u0016\u0107\u0001\u0000\u0000\u0000\u0018\u0109\u0001\u0000"+
		"\u0000\u0000\u001a\u0111\u0001\u0000\u0000\u0000\u001c\u011f\u0001\u0000"+
		"\u0000\u0000\u001e\u0121\u0001\u0000\u0000\u0000 \u0127\u0001\u0000\u0000"+
		"\u0000\"\u012b\u0001\u0000\u0000\u0000$\u012f\u0001\u0000\u0000\u0000"+
		"&\u0140\u0001\u0000\u0000\u0000(\u014f\u0001\u0000\u0000\u0000*\u0151"+
		"\u0001\u0000\u0000\u0000,\u015f\u0001\u0000\u0000\u0000.\u0167\u0001\u0000"+
		"\u0000\u00000\u0169\u0001\u0000\u0000\u00002\u0174\u0001\u0000\u0000\u0000"+
		"4\u01af\u0001\u0000\u0000\u00006\u01b1\u0001\u0000\u0000\u00008\u01bc"+
		"\u0001\u0000\u0000\u0000:\u01cb\u0001\u0000\u0000\u0000<\u01d5\u0001\u0000"+
		"\u0000\u0000>\u01da\u0001\u0000\u0000\u0000@\u01e6\u0001\u0000\u0000\u0000"+
		"B\u01ee\u0001\u0000\u0000\u0000D\u01f2\u0001\u0000\u0000\u0000F\u01ff"+
		"\u0001\u0000\u0000\u0000H\u0202\u0001\u0000\u0000\u0000J\u0207\u0001\u0000"+
		"\u0000\u0000L\u0245\u0001\u0000\u0000\u0000N\u026f\u0001\u0000\u0000\u0000"+
		"P\u0271\u0001\u0000\u0000\u0000R\u0286\u0001\u0000\u0000\u0000T\u02c0"+
		"\u0001\u0000\u0000\u0000V\u02c2\u0001\u0000\u0000\u0000X\u02cd\u0001\u0000"+
		"\u0000\u0000Z\u02cf\u0001\u0000\u0000\u0000\\\u02e2\u0001\u0000\u0000"+
		"\u0000^\u031e\u0001\u0000\u0000\u0000`\u0320\u0001\u0000\u0000\u0000b"+
		"\u032f\u0001\u0000\u0000\u0000d\u0335\u0001\u0000\u0000\u0000f\u033c\u0001"+
		"\u0000\u0000\u0000h\u033f\u0001\u0000\u0000\u0000j\u0342\u0001\u0000\u0000"+
		"\u0000l\u037e\u0001\u0000\u0000\u0000n\u03d2\u0001\u0000\u0000\u0000p"+
		"\u03d4\u0001\u0000\u0000\u0000r\u03e2\u0001\u0000\u0000\u0000t\u03ee\u0001"+
		"\u0000\u0000\u0000v\u0411\u0001\u0000\u0000\u0000x\u0413\u0001\u0000\u0000"+
		"\u0000z\u0418\u0001\u0000\u0000\u0000|\u0445\u0001\u0000\u0000\u0000~"+
		"\u0453\u0001\u0000\u0000\u0000\u0080\u0459\u0001\u0000\u0000\u0000\u0082"+
		"\u045b\u0001\u0000\u0000\u0000\u0084\u0467\u0001\u0000\u0000\u0000\u0086"+
		"\u047a\u0001\u0000\u0000\u0000\u0088\u0498\u0001\u0000\u0000\u0000\u008a"+
		"\u049e\u0001\u0000\u0000\u0000\u008c\u04a4\u0001\u0000\u0000\u0000\u008e"+
		"\u04aa\u0001\u0000\u0000\u0000\u0090\u04b0\u0001\u0000\u0000\u0000\u0092"+
		"\u04b6\u0001\u0000\u0000\u0000\u0094\u04ba\u0001\u0000\u0000\u0000\u0096"+
		"\u04be\u0001\u0000\u0000\u0000\u0098\u04c2\u0001\u0000\u0000\u0000\u009a"+
		"\u04c6\u0001\u0000\u0000\u0000\u009c\u04ca\u0001\u0000\u0000\u0000\u009e"+
		"\u04d7\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000\u00a1"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6"+
		"\u00a7\u0005\u0000\u0000\u0001\u00a7\u0001\u0001\u0000\u0000\u0000\u00a8"+
		"\u00c0\u00034\u001a\u0000\u00a9\u00c0\u0003&\u0013\u0000\u00aa\u00c0\u0003"+
		"(\u0014\u0000\u00ab\u00c0\u0003N\'\u0000\u00ac\u00c0\u0003>\u001f\u0000"+
		"\u00ad\u00c0\u0003L&\u0000\u00ae\u00c0\u0003R)\u0000\u00af\u00c0\u0003"+
		"`0\u0000\u00b0\u00c0\u0003b1\u0000\u00b1\u00c0\u0003^/\u0000\u00b2\u00c0"+
		"\u0003f3\u0000\u00b3\u00c0\u0003h4\u0000\u00b4\u00c0\u0003v;\u0000\u00b5"+
		"\u00c0\u00036\u001b\u0000\u00b6\u00c0\u0003*\u0015\u0000\u00b7\u00c0\u0003"+
		"F#\u0000\u00b8\u00c0\u0003r9\u0000\u00b9\u00c0\u0003D\"\u0000\u00ba\u00c0"+
		"\u0003\u0004\u0002\u0000\u00bb\u00c0\u0003\u0012\t\u0000\u00bc\u00c0\u0003"+
		"\u001c\u000e\u0000\u00bd\u00c0\u0003$\u0012\u0000\u00be\u00c0\u0003p8"+
		"\u0000\u00bf\u00a8\u0001\u0000\u0000\u0000\u00bf\u00a9\u0001\u0000\u0000"+
		"\u0000\u00bf\u00aa\u0001\u0000\u0000\u0000\u00bf\u00ab\u0001\u0000\u0000"+
		"\u0000\u00bf\u00ac\u0001\u0000\u0000\u0000\u00bf\u00ad\u0001\u0000\u0000"+
		"\u0000\u00bf\u00ae\u0001\u0000\u0000\u0000\u00bf\u00af\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b0\u0001\u0000\u0000\u0000\u00bf\u00b1\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b2\u0001\u0000\u0000\u0000\u00bf\u00b3\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b4\u0001\u0000\u0000\u0000\u00bf\u00b5\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b6\u0001\u0000\u0000\u0000\u00bf\u00b7\u0001\u0000\u0000"+
		"\u0000\u00bf\u00b8\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bf\u00ba\u0001\u0000\u0000\u0000\u00bf\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bf\u00bc\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u0003\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c5\u0003\u0006\u0003\u0000\u00c2\u00c5\u0003\b\u0004\u0000"+
		"\u00c3\u00c5\u0003\n\u0005\u0000\u00c4\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3\u0001\u0000\u0000\u0000\u00c5"+
		"\u0005\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0003\u0000\u0000\u00c7"+
		"\u00c8\u00051\u0000\u0000\u00c8\u00c9\u00052\u0000\u0000\u00c9\u00d0\u0003"+
		"L&\u0000\u00ca\u00cb\u0005\u0003\u0000\u0000\u00cb\u00cc\u00051\u0000"+
		"\u0000\u00cc\u00cd\u0005h\u0000\u0000\u00cd\u00ce\u00052\u0000\u0000\u00ce"+
		"\u00d0\u0003L&\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001"+
		"\u0000\u0000\u0000\u00d0\u0007\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005"+
		"\u0004\u0000\u0000\u00d2\u00d3\u00051\u0000\u0000\u00d3\u00d4\u00052\u0000"+
		"\u0000\u00d4\u00db\u0003R)\u0000\u00d5\u00d6\u0005\u0004\u0000\u0000\u00d6"+
		"\u00d7\u00051\u0000\u0000\u00d7\u00d8\u0005h\u0000\u0000\u00d8\u00d9\u0005"+
		"2\u0000\u0000\u00d9\u00db\u0003R)\u0000\u00da\u00d1\u0001\u0000\u0000"+
		"\u0000\u00da\u00d5\u0001\u0000\u0000\u0000\u00db\t\u0001\u0000\u0000\u0000"+
		"\u00dc\u00df\u0003\f\u0006\u0000\u00dd\u00df\u0003\u000e\u0007\u0000\u00de"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u000b\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u0005\u0000\u0000\u00e1"+
		"\u00e2\u0005:\u0000\u0000\u00e2\u00e3\u0005\u0006\u0000\u0000\u00e3\u00e4"+
		"\u00051\u0000\u0000\u00e4\u00e5\u0003\u0010\b\u0000\u00e5\u00e6\u0005"+
		"2\u0000\u0000\u00e6\u00e7\u00055\u0000\u0000\u00e7\r\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000\u00e9\u00ea\u0005:\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0007\u0000\u0000\u00eb\u00ec\u00051\u0000\u0000\u00ec"+
		"\u00ed\u0005h\u0000\u0000\u00ed\u00ee\u00052\u0000\u0000\u00ee\u00ef\u0005"+
		"5\u0000\u0000\u00ef\u000f\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005k\u0000"+
		"\u0000\u00f1\u00fa\u00051\u0000\u0000\u00f2\u00f7\u0003l6\u0000\u00f3"+
		"\u00f4\u00056\u0000\u0000\u00f4\u00f6\u0003l6\u0000\u00f5\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fb\u0001"+
		"\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00f2\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fd\u00052\u0000\u0000\u00fd\u0011\u0001\u0000"+
		"\u0000\u0000\u00fe\u0102\u0003\u0014\n\u0000\u00ff\u0102\u0003\u0016\u000b"+
		"\u0000\u0100\u0102\u0003\u0018\f\u0000\u0101\u00fe\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0100\u0001\u0000\u0000\u0000"+
		"\u0102\u0013\u0001\u0000\u0000\u0000\u0103\u0104\u0005\b\u0000\u0000\u0104"+
		"\u0105\u00057\u0000\u0000\u0105\u0106\u0005h\u0000\u0000\u0106\u0015\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0005\t\u0000\u0000\u0108\u0017\u0001\u0000"+
		"\u0000\u0000\u0109\u010a\u0005\n\u0000\u0000\u010a\u010b\u0005:\u0000"+
		"\u0000\u010b\u010c\u0005\u000b\u0000\u0000\u010c\u010d\u00051\u0000\u0000"+
		"\u010d\u010e\u0003\u001a\r\u0000\u010e\u010f\u00052\u0000\u0000\u010f"+
		"\u0110\u00055\u0000\u0000\u0110\u0019\u0001\u0000\u0000\u0000\u0111\u0112"+
		"\u0005/\u0000\u0000\u0112\u0117\u0005h\u0000\u0000\u0113\u0114\u00056"+
		"\u0000\u0000\u0114\u0116\u0005h\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0001\u0000\u0000"+
		"\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011b\u00050\u0000\u0000"+
		"\u011b\u001b\u0001\u0000\u0000\u0000\u011c\u0120\u0003\u001e\u000f\u0000"+
		"\u011d\u0120\u0003 \u0010\u0000\u011e\u0120\u0003\"\u0011\u0000\u011f"+
		"\u011c\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f"+
		"\u011e\u0001\u0000\u0000\u0000\u0120\u001d\u0001\u0000\u0000\u0000\u0121"+
		"\u0122\u0005/\u0000\u0000\u0122\u0123\u0005\f\u0000\u0000\u0123\u0124"+
		"\u00050\u0000\u0000\u0124\u0125\u00057\u0000\u0000\u0125\u0126\u0005k"+
		"\u0000\u0000\u0126\u001f\u0001\u0000\u0000\u0000\u0127\u0128\u0005\r\u0000"+
		"\u0000\u0128\u0129\u00057\u0000\u0000\u0129\u012a\u0005h\u0000\u0000\u012a"+
		"!\u0001\u0000\u0000\u0000\u012b\u012c\u0005\u000e\u0000\u0000\u012c\u012d"+
		"\u00057\u0000\u0000\u012d\u012e\u0005h\u0000\u0000\u012e#\u0001\u0000"+
		"\u0000\u0000\u012f\u0130\u0003l6\u0000\u0130\u0131\u0005:\u0000\u0000"+
		"\u0131\u0132\u0005k\u0000\u0000\u0132\u013b\u00051\u0000\u0000\u0133\u0138"+
		"\u0003l6\u0000\u0134\u0135\u00056\u0000\u0000\u0135\u0137\u0003l6\u0000"+
		"\u0136\u0134\u0001\u0000\u0000\u0000\u0137\u013a\u0001\u0000\u0000\u0000"+
		"\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000\u0000"+
		"\u0139\u013c\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000"+
		"\u013b\u0133\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u013e\u00052\u0000\u0000\u013e"+
		"\u013f\u00055\u0000\u0000\u013f%\u0001\u0000\u0000\u0000\u0140\u0141\u0007"+
		"\u0000\u0000\u0000\u0141\u0145\u00051\u0000\u0000\u0142\u0146\u00030\u0018"+
		"\u0000\u0143\u0144\u00053\u0000\u0000\u0144\u0146\u00054\u0000\u0000\u0145"+
		"\u0142\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000\u0145"+
		"\u0146\u0001\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u00052\u0000\u0000\u0148\u0149\u0003(\u0014\u0000\u0149\'\u0001"+
		"\u0000\u0000\u0000\u014a\u014b\u0005\u0015\u0000\u0000\u014b\u0150\u0003"+
		"*\u0015\u0000\u014c\u014d\u0005\u0015\u0000\u0000\u014d\u014e\u0005k\u0000"+
		"\u0000\u014e\u0150\u00055\u0000\u0000\u014f\u014a\u0001\u0000\u0000\u0000"+
		"\u014f\u014c\u0001\u0000\u0000\u0000\u0150)\u0001\u0000\u0000\u0000\u0151"+
		"\u0152\u0005\u001d\u0000\u0000\u0152\u0153\u0005k\u0000\u0000\u0153\u0154"+
		"\u00053\u0000\u0000\u0154\u0155\u0003,\u0016\u0000\u0155\u0156\u00054"+
		"\u0000\u0000\u0156+\u0001\u0000\u0000\u0000\u0157\u015e\u0003L&\u0000"+
		"\u0158\u015e\u0003T*\u0000\u0159\u015e\u0003N\'\u0000\u015a\u015e\u0003"+
		"P(\u0000\u015b\u015e\u0003R)\u0000\u015c\u015e\u0003\u0002\u0001\u0000"+
		"\u015d\u0157\u0001\u0000\u0000\u0000\u015d\u0158\u0001\u0000\u0000\u0000"+
		"\u015d\u0159\u0001\u0000\u0000\u0000\u015d\u015a\u0001\u0000\u0000\u0000"+
		"\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000\u0000\u0000"+
		"\u015e\u0161\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0001\u0000\u0000\u0000\u0160-\u0001\u0000\u0000\u0000\u0161"+
		"\u015f\u0001\u0000\u0000\u0000\u0162\u0164\u00030\u0018\u0000\u0163\u0162"+
		"\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0168"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u00053\u0000\u0000\u0166\u0168\u0005"+
		"4\u0000\u0000\u0167\u0163\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000"+
		"\u0000\u0000\u0168/\u0001\u0000\u0000\u0000\u0169\u016e\u00032\u0019\u0000"+
		"\u016a\u016b\u00056\u0000\u0000\u016b\u016d\u00032\u0019\u0000\u016c\u016a"+
		"\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e\u016c"+
		"\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0172"+
		"\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173"+
		"\u00056\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u01731\u0001\u0000\u0000\u0000\u0174\u0175\u0005k\u0000"+
		"\u0000\u0175\u0176\u00058\u0000\u0000\u0176\u0177\u0003X,\u0000\u0177"+
		"3\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0014\u0000\u0000\u0179\u017a"+
		"\u00053\u0000\u0000\u017a\u017f\u0005k\u0000\u0000\u017b\u017c\u00056"+
		"\u0000\u0000\u017c\u017e\u0005k\u0000\u0000\u017d\u017b\u0001\u0000\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0182\u0001\u0000\u0000"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0182\u0183\u00054\u0000\u0000"+
		"\u0183\u0184\u0005V\u0000\u0000\u0184\u0186\u0005h\u0000\u0000\u0185\u0187"+
		"\u00055\u0000\u0000\u0186\u0185\u0001\u0000\u0000\u0000\u0186\u0187\u0001"+
		"\u0000\u0000\u0000\u0187\u01b0\u0001\u0000\u0000\u0000\u0188\u0189\u0005"+
		"\u0014\u0000\u0000\u0189\u018a\u0005k\u0000\u0000\u018a\u018b\u0005V\u0000"+
		"\u0000\u018b\u018d\u0005h\u0000\u0000\u018c\u018e\u00055\u0000\u0000\u018d"+
		"\u018c\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u01b0\u0001\u0000\u0000\u0000\u018f\u0190\u0005\u0014\u0000\u0000\u0190"+
		"\u0191\u0005=\u0000\u0000\u0191\u0192\u0005W\u0000\u0000\u0192\u0193\u0005"+
		"k\u0000\u0000\u0193\u0194\u0005V\u0000\u0000\u0194\u0196\u0005h\u0000"+
		"\u0000\u0195\u0197\u00055\u0000\u0000\u0196\u0195\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u01b0\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0005\u0014\u0000\u0000\u0199\u019b\u0005h\u0000\u0000\u019a"+
		"\u019c\u00055\u0000\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c"+
		"\u0001\u0000\u0000\u0000\u019c\u01b0\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0005\u0014\u0000\u0000\u019e\u019f\u0005k\u0000\u0000\u019f\u01a0\u0005"+
		"6\u0000\u0000\u01a0\u01a1\u00053\u0000\u0000\u01a1\u01a6\u0005k\u0000"+
		"\u0000\u01a2\u01a3\u00056\u0000\u0000\u01a3\u01a5\u0005k\u0000\u0000\u01a4"+
		"\u01a2\u0001\u0000\u0000\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a9\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u00054\u0000\u0000\u01aa\u01ab\u0005V\u0000\u0000\u01ab\u01ad\u0005"+
		"h\u0000\u0000\u01ac\u01ae\u00055\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01b0\u0001\u0000\u0000"+
		"\u0000\u01af\u0178\u0001\u0000\u0000\u0000\u01af\u0188\u0001\u0000\u0000"+
		"\u0000\u01af\u018f\u0001\u0000\u0000\u0000\u01af\u0198\u0001\u0000\u0000"+
		"\u0000\u01af\u019d\u0001\u0000\u0000\u0000\u01b05\u0001\u0000\u0000\u0000"+
		"\u01b1\u01b2\u0005`\u0000\u0000\u01b2\u01b3\u0005:\u0000\u0000\u01b3\u01b4"+
		"\u0005k\u0000\u0000\u01b4\u01b8\u00057\u0000\u0000\u01b5\u01b9\u00038"+
		"\u001c\u0000\u01b6\u01b9\u0003:\u001d\u0000\u01b7\u01b9\u0003<\u001e\u0000"+
		"\u01b8\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b8\u01b7\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bb\u00055\u0000\u0000\u01bb7\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0005f\u0000\u0000\u01bd\u01be\u0005k\u0000\u0000\u01be\u01c7\u00051"+
		"\u0000\u0000\u01bf\u01c4\u0003l6\u0000\u01c0\u01c1\u00056\u0000\u0000"+
		"\u01c1\u01c3\u0003l6\u0000\u01c2\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c4\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5"+
		"\u0001\u0000\u0000\u0000\u01c5\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c7\u01bf\u0001\u0000\u0000\u0000\u01c7\u01c8"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u00052\u0000\u0000\u01ca9\u0001\u0000\u0000\u0000\u01cb\u01d1\u0005`"+
		"\u0000\u0000\u01cc\u01cf\u0005:\u0000\u0000\u01cd\u01d0\u0005k\u0000\u0000"+
		"\u01ce\u01d0\u0003p8\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01ce"+
		"\u0001\u0000\u0000\u0000\u01d0\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cc"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4;\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d8\u0005k\u0000\u0000\u01d6\u01d7\u0005:\u0000"+
		"\u0000\u01d7\u01d9\u0005k\u0000\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9=\u0001\u0000\u0000\u0000\u01da"+
		"\u01db\u0005Y\u0000\u0000\u01db\u01dc\u0005k\u0000\u0000\u01dc\u01e0\u0005"+
		"3\u0000\u0000\u01dd\u01df\u0003@ \u0000\u01de\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01e2\u0001\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e2\u01e0\u0001\u0000\u0000\u0000\u01e3\u01e4\u00054\u0000\u0000"+
		"\u01e4\u01e5\u00055\u0000\u0000\u01e5?\u0001\u0000\u0000\u0000\u01e6\u01eb"+
		"\u0003B!\u0000\u01e7\u01e8\u00056\u0000\u0000\u01e8\u01ea\u0003B!\u0000"+
		"\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea\u01ed\u0001\u0000\u0000\u0000"+
		"\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000"+
		"\u01ecA\u0001\u0000\u0000\u0000\u01ed\u01eb\u0001\u0000\u0000\u0000\u01ee"+
		"\u01ef\u0005k\u0000\u0000\u01ef\u01f0\u00057\u0000\u0000\u01f0\u01f1\u0003"+
		"X,\u0000\u01f1C\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005\u001a\u0000"+
		"\u0000\u01f3\u01f4\u0005:\u0000\u0000\u01f4\u01f5\u0005\u001b\u0000\u0000"+
		"\u01f5\u01f9\u00051\u0000\u0000\u01f6\u01fa\u0005k\u0000\u0000\u01f7\u01fa"+
		"\u0005h\u0000\u0000\u01f8\u01fa\u0003X,\u0000\u01f9\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u00052\u0000"+
		"\u0000\u01fc\u01fe\u00055\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fe\u0001\u0000\u0000\u0000\u01feE\u0001\u0000\u0000\u0000\u01ff"+
		"\u0200\u0005\u0016\u0000\u0000\u0200\u0201\u0003*\u0015\u0000\u0201G\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0005\u0017\u0000\u0000\u0203\u0204\u0005"+
		"3\u0000\u0000\u0204\u0205\u0003,\u0016\u0000\u0205\u0206\u00054\u0000"+
		"\u0000\u0206I\u0001\u0000\u0000\u0000\u0207\u0208\u0007\u0001\u0000\u0000"+
		"\u0208K\u0001\u0000\u0000\u0000\u0209\u020b\u0003J%\u0000\u020a\u0209"+
		"\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020b\u020d"+
		"\u0001\u0000\u0000\u0000\u020c\u020e\u0005M\u0000\u0000\u020d\u020c\u0001"+
		"\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0210\u0005k\u0000\u0000\u0210\u0211\u00058\u0000"+
		"\u0000\u0211\u0212\u0003V+\u0000\u0212\u0216\u00057\u0000\u0000\u0213"+
		"\u0217\u0003l6\u0000\u0214\u0217\u0003X,\u0000\u0215\u0217\u0003\u009c"+
		"N\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u00055\u0000\u0000\u0219\u0246\u0001\u0000\u0000\u0000"+
		"\u021a\u021c\u0003J%\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c"+
		"\u0001\u0000\u0000\u0000\u021c\u021e\u0001\u0000\u0000\u0000\u021d\u021f"+
		"\u0005M\u0000\u0000\u021e\u021d\u0001\u0000\u0000\u0000\u021e\u021f\u0001"+
		"\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0005"+
		"k\u0000\u0000\u0221\u0225\u00057\u0000\u0000\u0222\u0226\u0003l6\u0000"+
		"\u0223\u0226\u0003X,\u0000\u0224\u0226\u0003\u009cN\u0000\u0225\u0222"+
		"\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0224"+
		"\u0001\u0000\u0000\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228"+
		"\u00055\u0000\u0000\u0228\u0246\u0001\u0000\u0000\u0000\u0229\u022b\u0003"+
		"J%\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022a\u022b\u0001\u0000\u0000"+
		"\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c\u022e\u0005M\u0000\u0000"+
		"\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0005k\u0000\u0000\u0230"+
		"\u0231\u00058\u0000\u0000\u0231\u0232\u0003V+\u0000\u0232\u0233\u0005"+
		"5\u0000\u0000\u0233\u0246\u0001\u0000\u0000\u0000\u0234\u0236\u0003J%"+
		"\u0000\u0235\u0234\u0001\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237\u0238\u0005k\u0000\u0000"+
		"\u0238\u023c\u00057\u0000\u0000\u0239\u023d\u0003l6\u0000\u023a\u023d"+
		"\u0003X,\u0000\u023b\u023d\u0003\u009cN\u0000\u023c\u0239\u0001\u0000"+
		"\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023c\u023b\u0001\u0000"+
		"\u0000\u0000\u023d\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u00055\u0000"+
		"\u0000\u023f\u0246\u0001\u0000\u0000\u0000\u0240\u0242\u0003J%\u0000\u0241"+
		"\u0240\u0001\u0000\u0000\u0000\u0241\u0242\u0001\u0000\u0000\u0000\u0242"+
		"\u0243\u0001\u0000\u0000\u0000\u0243\u0244\u0005k\u0000\u0000\u0244\u0246"+
		"\u00055\u0000\u0000\u0245\u020a\u0001\u0000\u0000\u0000\u0245\u021b\u0001"+
		"\u0000\u0000\u0000\u0245\u022a\u0001\u0000\u0000\u0000\u0245\u0235\u0001"+
		"\u0000\u0000\u0000\u0245\u0241\u0001\u0000\u0000\u0000\u0246M\u0001\u0000"+
		"\u0000\u0000\u0247\u0249\u0005M\u0000\u0000\u0248\u0247\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000"+
		"\u0000\u024a\u024b\u0005k\u0000\u0000\u024b\u024c\u00058\u0000\u0000\u024c"+
		"\u024d\u0003V+\u0000\u024d\u024e\u0005/\u0000\u0000\u024e\u024f\u0005"+
		"0\u0000\u0000\u024f\u0250\u00057\u0000\u0000\u0250\u0259\u0005/\u0000"+
		"\u0000\u0251\u0256\u0003X,\u0000\u0252\u0253\u00056\u0000\u0000\u0253"+
		"\u0255\u0003X,\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0258\u0001"+
		"\u0000\u0000\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001"+
		"\u0000\u0000\u0000\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001"+
		"\u0000\u0000\u0000\u0259\u0251\u0001\u0000\u0000\u0000\u0259\u025a\u0001"+
		"\u0000\u0000\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u025c\u0005"+
		"0\u0000\u0000\u025c\u025d\u00055\u0000\u0000\u025d\u0270\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0005k\u0000\u0000\u025f\u0260\u00057\u0000\u0000\u0260"+
		"\u0262\u0005/\u0000\u0000\u0261\u0263\u0003X,\u0000\u0262\u0261\u0001"+
		"\u0000\u0000\u0000\u0262\u0263\u0001\u0000\u0000\u0000\u0263\u026a\u0001"+
		"\u0000\u0000\u0000\u0264\u0266\u0003X,\u0000\u0265\u0267\u00056\u0000"+
		"\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000"+
		"\u0000\u0267\u0269\u0001\u0000\u0000\u0000\u0268\u0264\u0001\u0000\u0000"+
		"\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001\u0000\u0000"+
		"\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026d\u0001\u0000\u0000"+
		"\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026e\u00050\u0000\u0000"+
		"\u026e\u0270\u00055\u0000\u0000\u026f\u0248\u0001\u0000\u0000\u0000\u026f"+
		"\u025e\u0001\u0000\u0000\u0000\u0270O\u0001\u0000\u0000\u0000\u0271\u0272"+
		"\u0005\u0016\u0000\u0000\u0272\u0273\u0005k\u0000\u0000\u0273\u027c\u0005"+
		"1\u0000\u0000\u0274\u0279\u0003n7\u0000\u0275\u0276\u00056\u0000\u0000"+
		"\u0276\u0278\u0003n7\u0000\u0277\u0275\u0001\u0000\u0000\u0000\u0278\u027b"+
		"\u0001\u0000\u0000\u0000\u0279\u0277\u0001\u0000\u0000\u0000\u0279\u027a"+
		"\u0001\u0000\u0000\u0000\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279"+
		"\u0001\u0000\u0000\u0000\u027c\u0274\u0001\u0000\u0000\u0000\u027c\u027d"+
		"\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000\u0000\u027e\u027f"+
		"\u00052\u0000\u0000\u027f\u0282\u00058\u0000\u0000\u0280\u0283\u0003V"+
		"+\u0000\u0281\u0283\u0005R\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u00055\u0000\u0000\u0285Q\u0001\u0000\u0000\u0000\u0286\u0287"+
		"\u0007\u0002\u0000\u0000\u0287\u0290\u00051\u0000\u0000\u0288\u028d\u0003"+
		"n7\u0000\u0289\u028a\u00056\u0000\u0000\u028a\u028c\u0003n7\u0000\u028b"+
		"\u0289\u0001\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d"+
		"\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		"\u0291\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290"+
		"\u0288\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\u0001\u0000\u0000\u0000\u0292\u0295\u00052\u0000\u0000\u0293\u0294"+
		"\u00058\u0000\u0000\u0294\u0296\u0003V+\u0000\u0295\u0293\u0001\u0000"+
		"\u0000\u0000\u0295\u0296\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000"+
		"\u0000\u0000\u0297\u029b\u00053\u0000\u0000\u0298\u029a\u0003\u0002\u0001"+
		"\u0000\u0299\u0298\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000"+
		"\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000\u0000"+
		"\u0000\u029c\u029e\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u00054\u0000\u0000\u029fS\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a2\u0003J%\u0000\u02a1\u02a0\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a2\u02a3\u0001\u0000\u0000\u0000\u02a3\u02a4\u0005"+
		"k\u0000\u0000\u02a4\u02a5\u00058\u0000\u0000\u02a5\u02a6\u0005k\u0000"+
		"\u0000\u02a6\u02c1\u00055\u0000\u0000\u02a7\u02a9\u0003J%\u0000\u02a8"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9"+
		"\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ab\u0005k\u0000\u0000\u02ab\u02ac"+
		"\u00058\u0000\u0000\u02ac\u02ad\u0005k\u0000\u0000\u02ad\u02ae\u00057"+
		"\u0000\u0000\u02ae\u02af\u0005f\u0000\u0000\u02af\u02b0\u0005k\u0000\u0000"+
		"\u02b0\u02bb\u00051\u0000\u0000\u02b1\u02b6\u0003X,\u0000\u02b2\u02b3"+
		"\u00056\u0000\u0000\u02b3\u02b5\u0003X,\u0000\u02b4\u02b2\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7\u02ba\u0001\u0000"+
		"\u0000\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02b1\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000"+
		"\u0000\u0000\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02be\u0001\u0000"+
		"\u0000\u0000\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02bf\u00052\u0000"+
		"\u0000\u02bf\u02c1\u00055\u0000\u0000\u02c0\u02a1\u0001\u0000\u0000\u0000"+
		"\u02c0\u02a8\u0001\u0000\u0000\u0000\u02c1U\u0001\u0000\u0000\u0000\u02c2"+
		"\u02c3\u0007\u0003\u0000\u0000\u02c3W\u0001\u0000\u0000\u0000\u02c4\u02ce"+
		"\u0005g\u0000\u0000\u02c5\u02ce\u0005h\u0000\u0000\u02c6\u02ce\u0005i"+
		"\u0000\u0000\u02c7\u02ce\u0003\\.\u0000\u02c8\u02ce\u0003Z-\u0000\u02c9"+
		"\u02ce\u0005X\u0000\u0000\u02ca\u02ce\u0003r9\u0000\u02cb\u02ce\u0003"+
		"\u0082A\u0000\u02cc\u02ce\u0003\u009cN\u0000\u02cd\u02c4\u0001\u0000\u0000"+
		"\u0000\u02cd\u02c5\u0001\u0000\u0000\u0000\u02cd\u02c6\u0001\u0000\u0000"+
		"\u0000\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd\u02c8\u0001\u0000\u0000"+
		"\u0000\u02cd\u02c9\u0001\u0000\u0000\u0000\u02cd\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001\u0000\u0000"+
		"\u0000\u02ceY\u0001\u0000\u0000\u0000\u02cf\u02d0\u00053\u0000\u0000\u02d0"+
		"\u02d1\u0005k\u0000\u0000\u02d1\u02d2\u00058\u0000\u0000\u02d2\u02dd\u0003"+
		"X,\u0000\u02d3\u02d4\u00056\u0000\u0000\u02d4\u02d5\u0005k\u0000\u0000"+
		"\u02d5\u02d6\u00058\u0000\u0000\u02d6\u02d7\u0003X,\u0000\u02d7\u02d9"+
		"\u0001\u0000\u0000\u0000\u02d8\u02da\u00056\u0000\u0000\u02d9\u02d8\u0001"+
		"\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02dc\u0001"+
		"\u0000\u0000\u0000\u02db\u02d3\u0001\u0000\u0000\u0000\u02dc\u02df\u0001"+
		"\u0000\u0000\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02de\u02e0\u0001\u0000\u0000\u0000\u02df\u02dd\u0001"+
		"\u0000\u0000\u0000\u02e0\u02e1\u00054\u0000\u0000\u02e1[\u0001\u0000\u0000"+
		"\u0000\u02e2\u02e7\u0005/\u0000\u0000\u02e3\u02e6\u0005k\u0000\u0000\u02e4"+
		"\u02e6\u0003X,\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e6\u02e9\u0001\u0000\u0000\u0000\u02e7\u02e5\u0001"+
		"\u0000\u0000\u0000\u02e7\u02e8\u0001\u0000\u0000\u0000\u02e8\u02f1\u0001"+
		"\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000\u0000\u02ea\u02ed\u0005"+
		"6\u0000\u0000\u02eb\u02ee\u0005k\u0000\u0000\u02ec\u02ee\u0003X,\u0000"+
		"\u02ed\u02eb\u0001\u0000\u0000\u0000\u02ed\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ee\u02f0\u0001\u0000\u0000\u0000\u02ef\u02ea\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f3\u0001\u0000\u0000\u0000\u02f1\u02ef\u0001\u0000\u0000\u0000"+
		"\u02f1\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f5\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f4\u02f6\u00056\u0000\u0000\u02f5"+
		"\u02f4\u0001\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6"+
		"\u02f7\u0001\u0000\u0000\u0000\u02f7\u02f8\u00050\u0000\u0000\u02f8]\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fa\u0005k\u0000\u0000\u02fa\u02fd\u00057\u0000"+
		"\u0000\u02fb\u02fe\u0003l6\u0000\u02fc\u02fe\u0003\u009cN\u0000\u02fd"+
		"\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe"+
		"\u0303\u0001\u0000\u0000\u0000\u02ff\u0300\u00056\u0000\u0000\u0300\u0302"+
		"\u0003l6\u0000\u0301\u02ff\u0001\u0000\u0000\u0000\u0302\u0305\u0001\u0000"+
		"\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0303\u0304\u0001\u0000"+
		"\u0000\u0000\u0304\u0306\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000"+
		"\u0000\u0000\u0306\u0307\u00055\u0000\u0000\u0307\u031f\u0001\u0000\u0000"+
		"\u0000\u0308\u0309\u0005`\u0000\u0000\u0309\u030a\u0005:\u0000\u0000\u030a"+
		"\u030b\u0005k\u0000\u0000\u030b\u030c\u00057\u0000\u0000\u030c\u030d\u0003"+
		"l6\u0000\u030d\u030e\u00055\u0000\u0000\u030e\u031f\u0001\u0000\u0000"+
		"\u0000\u030f\u0310\u0005k\u0000\u0000\u0310\u0311\u00057\u0000\u0000\u0311"+
		"\u031a\u0005/\u0000\u0000\u0312\u0317\u0003X,\u0000\u0313\u0314\u0005"+
		"6\u0000\u0000\u0314\u0316\u0003X,\u0000\u0315\u0313\u0001\u0000\u0000"+
		"\u0000\u0316\u0319\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000"+
		"\u0000\u0317\u0318\u0001\u0000\u0000\u0000\u0318\u031b\u0001\u0000\u0000"+
		"\u0000\u0319\u0317\u0001\u0000\u0000\u0000\u031a\u0312\u0001\u0000\u0000"+
		"\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b\u031c\u0001\u0000\u0000"+
		"\u0000\u031c\u031d\u00050\u0000\u0000\u031d\u031f\u00055\u0000\u0000\u031e"+
		"\u02f9\u0001\u0000\u0000\u0000\u031e\u0308\u0001\u0000\u0000\u0000\u031e"+
		"\u030f\u0001\u0000\u0000\u0000\u031f_\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0005N\u0000\u0000\u0321\u0322\u00051\u0000\u0000\u0322\u0323\u0003l"+
		"6\u0000\u0323\u0324\u00052\u0000\u0000\u0324\u0328\u0003j5\u0000\u0325"+
		"\u0327\u0003d2\u0000\u0326\u0325\u0001\u0000\u0000\u0000\u0327\u032a\u0001"+
		"\u0000\u0000\u0000\u0328\u0326\u0001\u0000\u0000\u0000\u0328\u0329\u0001"+
		"\u0000\u0000\u0000\u0329\u032d\u0001\u0000\u0000\u0000\u032a\u0328\u0001"+
		"\u0000\u0000\u0000\u032b\u032c\u0005O\u0000\u0000\u032c\u032e\u0003j5"+
		"\u0000\u032d\u032b\u0001\u0000\u0000\u0000\u032d\u032e\u0001\u0000\u0000"+
		"\u0000\u032ea\u0001\u0000\u0000\u0000\u032f\u0330\u0005P\u0000\u0000\u0330"+
		"\u0331\u00051\u0000\u0000\u0331\u0332\u0003l6\u0000\u0332\u0333\u0005"+
		"2\u0000\u0000\u0333\u0334\u0003j5\u0000\u0334c\u0001\u0000\u0000\u0000"+
		"\u0335\u0336\u0005O\u0000\u0000\u0336\u0337\u0005N\u0000\u0000\u0337\u0338"+
		"\u00051\u0000\u0000\u0338\u0339\u0003l6\u0000\u0339\u033a\u00052\u0000"+
		"\u0000\u033a\u033b\u0003j5\u0000\u033be\u0001\u0000\u0000\u0000\u033c"+
		"\u033d\u0005Q\u0000\u0000\u033d\u033e\u00055\u0000\u0000\u033eg\u0001"+
		"\u0000\u0000\u0000\u033f\u0340\u0005S\u0000\u0000\u0340\u0341\u00055\u0000"+
		"\u0000\u0341i\u0001\u0000\u0000\u0000\u0342\u0346\u00053\u0000\u0000\u0343"+
		"\u0345\u0003\u0002\u0001\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0345"+
		"\u0348\u0001\u0000\u0000\u0000\u0346\u0344\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0001\u0000\u0000\u0000\u0347\u0349\u0001\u0000\u0000\u0000\u0348"+
		"\u0346\u0001\u0000\u0000\u0000\u0349\u034a\u00054\u0000\u0000\u034ak\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u00066\uffff\uffff\u0000\u034c\u034d\u0005"+
		"1\u0000\u0000\u034d\u034e\u0003l6\u0000\u034e\u034f\u00052\u0000\u0000"+
		"\u034f\u037f\u0001\u0000\u0000\u0000\u0350\u0351\u0005k\u0000\u0000\u0351"+
		"\u0352\u0005/\u0000\u0000\u0352\u0353\u0003l6\u0000\u0353\u0354\u0005"+
		"0\u0000\u0000\u0354\u037f\u0001\u0000\u0000\u0000\u0355\u0356\u0005K\u0000"+
		"\u0000\u0356\u0357\u0003l6\u0000\u0357\u0358\u0005L\u0000\u0000\u0358"+
		"\u037f\u0001\u0000\u0000\u0000\u0359\u035a\u0005`\u0000\u0000\u035a\u035b"+
		"\u0005:\u0000\u0000\u035b\u035c\u0005k\u0000\u0000\u035c\u035d\u0005:"+
		"\u0000\u0000\u035d\u035e\u0005k\u0000\u0000\u035e\u0367\u00051\u0000\u0000"+
		"\u035f\u0364\u0003l6\u0000\u0360\u0361\u00056\u0000\u0000\u0361\u0363"+
		"\u0003l6\u0000\u0362\u0360\u0001\u0000\u0000\u0000\u0363\u0366\u0001\u0000"+
		"\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000"+
		"\u0000\u0000\u0365\u0368\u0001\u0000\u0000\u0000\u0366\u0364\u0001\u0000"+
		"\u0000\u0000\u0367\u035f\u0001\u0000\u0000\u0000\u0367\u0368\u0001\u0000"+
		"\u0000\u0000\u0368\u0369\u0001\u0000\u0000\u0000\u0369\u037f\u00052\u0000"+
		"\u0000\u036a\u036b\u0005k\u0000\u0000\u036b\u036c\u0005\\\u0000\u0000"+
		"\u036c\u037f\u0003l6\b\u036d\u036e\u0005k\u0000\u0000\u036e\u036f\u0005"+
		"\\\u0000\u0000\u036f\u037f\u0005k\u0000\u0000\u0370\u0371\u0005`\u0000"+
		"\u0000\u0371\u0372\u0005:\u0000\u0000\u0372\u0373\u0005k\u0000\u0000\u0373"+
		"\u0374\u00057\u0000\u0000\u0374\u037f\u0003l6\u0006\u0375\u0376\u0005"+
		"`\u0000\u0000\u0376\u0377\u0005:\u0000\u0000\u0377\u037f\u0005k\u0000"+
		"\u0000\u0378\u0379\u0005k\u0000\u0000\u0379\u037a\u0005:\u0000\u0000\u037a"+
		"\u037f\u0005k\u0000\u0000\u037b\u037f\u0003X,\u0000\u037c\u037f\u0005"+
		"k\u0000\u0000\u037d\u037f\u0003r9\u0000\u037e\u034b\u0001\u0000\u0000"+
		"\u0000\u037e\u0350\u0001\u0000\u0000\u0000\u037e\u0355\u0001\u0000\u0000"+
		"\u0000\u037e\u0359\u0001\u0000\u0000\u0000\u037e\u036a\u0001\u0000\u0000"+
		"\u0000\u037e\u036d\u0001\u0000\u0000\u0000\u037e\u0370\u0001\u0000\u0000"+
		"\u0000\u037e\u0375\u0001\u0000\u0000\u0000\u037e\u0378\u0001\u0000\u0000"+
		"\u0000\u037e\u037b\u0001\u0000\u0000\u0000\u037e\u037c\u0001\u0000\u0000"+
		"\u0000\u037e\u037d\u0001\u0000\u0000\u0000\u037f\u03c5\u0001\u0000\u0000"+
		"\u0000\u0380\u0381\n\u001c\u0000\u0000\u0381\u0382\u0005=\u0000\u0000"+
		"\u0382\u03c4\u0003l6\u001d\u0383\u0384\n\u001b\u0000\u0000\u0384\u0385"+
		"\u0005?\u0000\u0000\u0385\u03c4\u0003l6\u001c\u0386\u0387\n\u001a\u0000"+
		"\u0000\u0387\u0388\u0005@\u0000\u0000\u0388\u03c4\u0003l6\u001b\u0389"+
		"\u038a\n\u0019\u0000\u0000\u038a\u038b\u0005;\u0000\u0000\u038b\u03c4"+
		"\u0003l6\u001a\u038c\u038d\n\u0018\u0000\u0000\u038d\u038e\u0005<\u0000"+
		"\u0000\u038e\u03c4\u0003l6\u0019\u038f\u0390\n\u0017\u0000\u0000\u0390"+
		"\u0391\u0005B\u0000\u0000\u0391\u03c4\u0003l6\u0018\u0392\u0393\n\u0016"+
		"\u0000\u0000\u0393\u0394\u0005C\u0000\u0000\u0394\u03c4\u0003l6\u0017"+
		"\u0395\u0396\n\u0015\u0000\u0000\u0396\u0397\u0005D\u0000\u0000\u0397"+
		"\u03c4\u0003l6\u0016\u0398\u0399\n\u0014\u0000\u0000\u0399\u039a\u0005"+
		"E\u0000\u0000\u039a\u03c4\u0003l6\u0015\u039b\u039c\n\u0013\u0000\u0000"+
		"\u039c\u039d\u0005G\u0000\u0000\u039d\u03c4\u0003l6\u0014\u039e\u039f"+
		"\n\u0012\u0000\u0000\u039f\u03a0\u0005H\u0000\u0000\u03a0\u03c4\u0003"+
		"l6\u0013\u03a1\u03a2\n\u0011\u0000\u0000\u03a2\u03a3\u0005F\u0000\u0000"+
		"\u03a3\u03c4\u0003l6\u0012\u03a4\u03a5\n\u0010\u0000\u0000\u03a5\u03a6"+
		"\u0005I\u0000\u0000\u03a6\u03c4\u0003l6\u0011\u03a7\u03a8\n\u000f\u0000"+
		"\u0000\u03a8\u03a9\u0005J\u0000\u0000\u03a9\u03c4\u0003l6\u0010\u03aa"+
		"\u03ab\n\u000b\u0000\u0000\u03ab\u03ac\u0005:\u0000\u0000\u03ac\u03ad"+
		"\u0005k\u0000\u0000\u03ad\u03b6\u00051\u0000\u0000\u03ae\u03b3\u0003l"+
		"6\u0000\u03af\u03b0\u00056\u0000\u0000\u03b0\u03b2\u0003l6\u0000\u03b1"+
		"\u03af\u0001\u0000\u0000\u0000\u03b2\u03b5\u0001\u0000\u0000\u0000\u03b3"+
		"\u03b1\u0001\u0000\u0000\u0000\u03b3\u03b4\u0001\u0000\u0000\u0000\u03b4"+
		"\u03b7\u0001\u0000\u0000\u0000\u03b5\u03b3\u0001\u0000\u0000\u0000\u03b6"+
		"\u03ae\u0001\u0000\u0000\u0000\u03b6\u03b7\u0001\u0000\u0000\u0000\u03b7"+
		"\u03b8\u0001\u0000\u0000\u0000\u03b8\u03c4\u00052\u0000\u0000\u03b9\u03ba"+
		"\n\t\u0000\u0000\u03ba\u03bb\u0005:\u0000\u0000\u03bb\u03bc\u0005k\u0000"+
		"\u0000\u03bc\u03bd\u00051\u0000\u0000\u03bd\u03be\u0005k\u0000\u0000\u03be"+
		"\u03bf\u0005\\\u0000\u0000\u03bf\u03c0\u0003l6\u0000\u03c0\u03c1\u0001"+
		"\u0000\u0000\u0000\u03c1\u03c2\u00052\u0000\u0000\u03c2\u03c4\u0001\u0000"+
		"\u0000\u0000\u03c3\u0380\u0001\u0000\u0000\u0000\u03c3\u0383\u0001\u0000"+
		"\u0000\u0000\u03c3\u0386\u0001\u0000\u0000\u0000\u03c3\u0389\u0001\u0000"+
		"\u0000\u0000\u03c3\u038c\u0001\u0000\u0000\u0000\u03c3\u038f\u0001\u0000"+
		"\u0000\u0000\u03c3\u0392\u0001\u0000\u0000\u0000\u03c3\u0395\u0001\u0000"+
		"\u0000\u0000\u03c3\u0398\u0001\u0000\u0000\u0000\u03c3\u039b\u0001\u0000"+
		"\u0000\u0000\u03c3\u039e\u0001\u0000\u0000\u0000\u03c3\u03a1\u0001\u0000"+
		"\u0000\u0000\u03c3\u03a4\u0001\u0000\u0000\u0000\u03c3\u03a7\u0001\u0000"+
		"\u0000\u0000\u03c3\u03aa\u0001\u0000\u0000\u0000\u03c3\u03b9\u0001\u0000"+
		"\u0000\u0000\u03c4\u03c7\u0001\u0000\u0000\u0000\u03c5\u03c3\u0001\u0000"+
		"\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000\u03c6m\u0001\u0000\u0000"+
		"\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000\u03c8\u03c9\u0005k\u0000\u0000"+
		"\u03c9\u03ca\u00058\u0000\u0000\u03ca\u03d3\u0003V+\u0000\u03cb\u03cc"+
		"\u0005k\u0000\u0000\u03cc\u03cd\u00058\u0000\u0000\u03cd\u03ce\u0003V"+
		"+\u0000\u03ce\u03cf\u00057\u0000\u0000\u03cf\u03d0\u0003X,\u0000\u03d0"+
		"\u03d3\u0001\u0000\u0000\u0000\u03d1\u03d3\u0005k\u0000\u0000\u03d2\u03c8"+
		"\u0001\u0000\u0000\u0000\u03d2\u03cb\u0001\u0000\u0000\u0000\u03d2\u03d1"+
		"\u0001\u0000\u0000\u0000\u03d3o\u0001\u0000\u0000\u0000\u03d4\u03d5\u0005"+
		"k\u0000\u0000\u03d5\u03de\u00051\u0000\u0000\u03d6\u03db\u0003l6\u0000"+
		"\u03d7\u03d8\u00056\u0000\u0000\u03d8\u03da\u0003l6\u0000\u03d9\u03d7"+
		"\u0001\u0000\u0000\u0000\u03da\u03dd\u0001\u0000\u0000\u0000\u03db\u03d9"+
		"\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc\u03df"+
		"\u0001\u0000\u0000\u0000\u03dd\u03db\u0001\u0000\u0000\u0000\u03de\u03d6"+
		"\u0001\u0000\u0000\u0000\u03de\u03df\u0001\u0000\u0000\u0000\u03df\u03e0"+
		"\u0001\u0000\u0000\u0000\u03e0\u03e1\u00052\u0000\u0000\u03e1q\u0001\u0000"+
		"\u0000\u0000\u03e2\u03e3\u0005j\u0000\u0000\u03e3\u03e4\u0003t:\u0000"+
		"\u03e4\u03e5\u0005j\u0000\u0000\u03e5s\u0001\u0000\u0000\u0000\u03e6\u03ef"+
		"\u0003v;\u0000\u03e7\u03e8\u0005K\u0000\u0000\u03e8\u03e9\u0003l6\u0000"+
		"\u03e9\u03ea\u0005L\u0000\u0000\u03ea\u03ef\u0001\u0000\u0000\u0000\u03eb"+
		"\u03ef\u0005k\u0000\u0000\u03ec\u03ef\u0005h\u0000\u0000\u03ed\u03ef\u0005"+
		"g\u0000\u0000\u03ee\u03e6\u0001\u0000\u0000\u0000\u03ee\u03e7\u0001\u0000"+
		"\u0000\u0000\u03ee\u03eb\u0001\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000"+
		"\u0000\u0000\u03ee\u03ed\u0001\u0000\u0000\u0000\u03ef\u03f0\u0001\u0000"+
		"\u0000\u0000\u03f0\u03ee\u0001\u0000\u0000\u0000\u03f0\u03f1\u0001\u0000"+
		"\u0000\u0000\u03f1u\u0001\u0000\u0000\u0000\u03f2\u03f3\u0005B\u0000\u0000"+
		"\u03f3\u03f5\u0003x<\u0000\u03f4\u03f6\u0003z=\u0000\u03f5\u03f4\u0001"+
		"\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f7\u03f8\u0005C\u0000\u0000\u03f8\u03f9\u0003t:"+
		"\u0000\u03f9\u03fa\u0005B\u0000\u0000\u03fa\u03fb\u0005?\u0000\u0000\u03fb"+
		"\u03fc\u0003x<\u0000\u03fc\u03fd\u0005C\u0000\u0000\u03fd\u0412\u0001"+
		"\u0000\u0000\u0000\u03fe\u03ff\u0005B\u0000\u0000\u03ff\u0401\u0003x<"+
		"\u0000\u0400\u0402\u0003z=\u0000\u0401\u0400\u0001\u0000\u0000\u0000\u0401"+
		"\u0402\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000\u0000\u0403"+
		"\u0405\u0005C\u0000\u0000\u0404\u0406\u0003t:\u0000\u0405\u0404\u0001"+
		"\u0000\u0000\u0000\u0405\u0406\u0001\u0000\u0000\u0000\u0406\u0412\u0001"+
		"\u0000\u0000\u0000\u0407\u0408\u0005B\u0000\u0000\u0408\u0409\u0003x<"+
		"\u0000\u0409\u040a\u0003z=\u0000\u040a\u040b\u0005?\u0000\u0000\u040b"+
		"\u040c\u0005C\u0000\u0000\u040c\u0412\u0001\u0000\u0000\u0000\u040d\u040e"+
		"\u0005B\u0000\u0000\u040e\u040f\u0003x<\u0000\u040f\u0410\u0005C\u0000"+
		"\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411\u03f2\u0001\u0000\u0000"+
		"\u0000\u0411\u03fe\u0001\u0000\u0000\u0000\u0411\u0407\u0001\u0000\u0000"+
		"\u0000\u0411\u040d\u0001\u0000\u0000\u0000\u0412w\u0001\u0000\u0000\u0000"+
		"\u0413\u0414\u0005k\u0000\u0000\u0414y\u0001\u0000\u0000\u0000\u0415\u0417"+
		"\u0003|>\u0000\u0416\u0415\u0001\u0000\u0000\u0000\u0417\u041a\u0001\u0000"+
		"\u0000\u0000\u0418\u0416\u0001\u0000\u0000\u0000\u0418\u0419\u0001\u0000"+
		"\u0000\u0000\u0419{\u0001\u0000\u0000\u0000\u041a\u0418\u0001\u0000\u0000"+
		"\u0000\u041b\u0446\u0005k\u0000\u0000\u041c\u0446\u0005\u001d\u0000\u0000"+
		"\u041d\u0446\u0005\u0010\u0000\u0000\u041e\u0446\u0005\u0011\u0000\u0000"+
		"\u041f\u0446\u0005\u0012\u0000\u0000\u0420\u0446\u0005\u0013\u0000\u0000"+
		"\u0421\u0446\u0005!\u0000\u0000\u0422\u0446\u0005\"\u0000\u0000\u0423"+
		"\u0446\u0005#\u0000\u0000\u0424\u0446\u0005$\u0000\u0000\u0425\u0446\u0005"+
		"%\u0000\u0000\u0426\u0446\u0005&\u0000\u0000\u0427\u0446\u0005*\u0000"+
		"\u0000\u0428\u0446\u0005+\u0000\u0000\u0429\u0446\u0005,\u0000\u0000\u042a"+
		"\u0446\u0005-\u0000\u0000\u042b\u0446\u0005.\u0000\u0000\u042c\u0446\u0003"+
		"\u009aM\u0000\u042d\u0446\u0003\u0098L\u0000\u042e\u0446\u0003\u008aE"+
		"\u0000\u042f\u0446\u0003\u008cF\u0000\u0430\u0439\u0005/\u0000\u0000\u0431"+
		"\u043a\u0005k\u0000\u0000\u0432\u0436\u0005k\u0000\u0000\u0433\u0435\u0003"+
		"~?\u0000\u0434\u0433\u0001\u0000\u0000\u0000\u0435\u0438\u0001\u0000\u0000"+
		"\u0000\u0436\u0434\u0001\u0000\u0000\u0000\u0436\u0437\u0001\u0000\u0000"+
		"\u0000\u0437\u043a\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000"+
		"\u0000\u0439\u0431\u0001\u0000\u0000\u0000\u0439\u0432\u0001\u0000\u0000"+
		"\u0000\u043a\u043b\u0001\u0000\u0000\u0000\u043b\u0446\u00050\u0000\u0000"+
		"\u043c\u043d\u00051\u0000\u0000\u043d\u043e\u0005k\u0000\u0000\u043e\u0446"+
		"\u00052\u0000\u0000\u043f\u0440\u0005=\u0000\u0000\u0440\u0446\u0005k"+
		"\u0000\u0000\u0441\u0446\u0005\u0001\u0000\u0000\u0442\u0446\u0005\u0002"+
		"\u0000\u0000\u0443\u0446\u0005h\u0000\u0000\u0444\u0446\u0005g\u0000\u0000"+
		"\u0445\u041b\u0001\u0000\u0000\u0000\u0445\u041c\u0001\u0000\u0000\u0000"+
		"\u0445\u041d\u0001\u0000\u0000\u0000\u0445\u041e\u0001\u0000\u0000\u0000"+
		"\u0445\u041f\u0001\u0000\u0000\u0000\u0445\u0420\u0001\u0000\u0000\u0000"+
		"\u0445\u0421\u0001\u0000\u0000\u0000\u0445\u0422\u0001\u0000\u0000\u0000"+
		"\u0445\u0423\u0001\u0000\u0000\u0000\u0445\u0424\u0001\u0000\u0000\u0000"+
		"\u0445\u0425\u0001\u0000\u0000\u0000\u0445\u0426\u0001\u0000\u0000\u0000"+
		"\u0445\u0427\u0001\u0000\u0000\u0000\u0445\u0428\u0001\u0000\u0000\u0000"+
		"\u0445\u0429\u0001\u0000\u0000\u0000\u0445\u042a\u0001\u0000\u0000\u0000"+
		"\u0445\u042b\u0001\u0000\u0000\u0000\u0445\u042c\u0001\u0000\u0000\u0000"+
		"\u0445\u042d\u0001\u0000\u0000\u0000\u0445\u042e\u0001\u0000\u0000\u0000"+
		"\u0445\u042f\u0001\u0000\u0000\u0000\u0445\u0430\u0001\u0000\u0000\u0000"+
		"\u0445\u043c\u0001\u0000\u0000\u0000\u0445\u043f\u0001\u0000\u0000\u0000"+
		"\u0445\u0441\u0001\u0000\u0000\u0000\u0445\u0442\u0001\u0000\u0000\u0000"+
		"\u0445\u0443\u0001\u0000\u0000\u0000\u0445\u0444\u0001\u0000\u0000\u0000"+
		"\u0446\u0449\u0001\u0000\u0000\u0000\u0447\u0448\u00057\u0000\u0000\u0448"+
		"\u044a\u0003\u0080@\u0000\u0449\u0447\u0001\u0000\u0000\u0000\u0449\u044a"+
		"\u0001\u0000\u0000\u0000\u044a}\u0001\u0000\u0000\u0000\u044b\u044c\u0005"+
		":\u0000\u0000\u044c\u0454\u0005k\u0000\u0000\u044d\u044e\u0005/\u0000"+
		"\u0000\u044e\u044f\u0003l6\u0000\u044f\u0450\u00050\u0000\u0000\u0450"+
		"\u0454\u0001\u0000\u0000\u0000\u0451\u0452\u0005:\u0000\u0000\u0452\u0454"+
		"\u0003p8\u0000\u0453\u044b\u0001\u0000\u0000\u0000\u0453\u044d\u0001\u0000"+
		"\u0000\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0454\u007f\u0001\u0000"+
		"\u0000\u0000\u0455\u045a\u0003X,\u0000\u0456\u045a\u0003l6\u0000\u0457"+
		"\u045a\u0005h\u0000\u0000\u0458\u045a\u0005k\u0000\u0000\u0459\u0455\u0001"+
		"\u0000\u0000\u0000\u0459\u0456\u0001\u0000\u0000\u0000\u0459\u0457\u0001"+
		"\u0000\u0000\u0000\u0459\u0458\u0001\u0000\u0000\u0000\u045a\u0081\u0001"+
		"\u0000\u0000\u0000\u045b\u045c\u0005/\u0000\u0000\u045c\u0460\u0005j\u0000"+
		"\u0000\u045d\u045f\u0003\u0084B\u0000\u045e\u045d\u0001\u0000\u0000\u0000"+
		"\u045f\u0462\u0001\u0000\u0000\u0000\u0460\u045e\u0001\u0000\u0000\u0000"+
		"\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0463\u0001\u0000\u0000\u0000"+
		"\u0462\u0460\u0001\u0000\u0000\u0000\u0463\u0464\u0005j\u0000\u0000\u0464"+
		"\u0465\u00050\u0000\u0000\u0465\u0083\u0001\u0000\u0000\u0000\u0466\u0468"+
		"\u0005:\u0000\u0000\u0467\u0466\u0001\u0000\u0000\u0000\u0467\u0468\u0001"+
		"\u0000\u0000\u0000\u0468\u0469\u0001\u0000\u0000\u0000\u0469\u046e\u0005"+
		"k\u0000\u0000\u046a\u046b\u00058\u0000\u0000\u046b\u046d\u0005k\u0000"+
		"\u0000\u046c\u046a\u0001\u0000\u0000\u0000\u046d\u0470\u0001\u0000\u0000"+
		"\u0000\u046e\u046c\u0001\u0000\u0000\u0000\u046e\u046f\u0001\u0000\u0000"+
		"\u0000\u046f\u0471\u0001\u0000\u0000\u0000\u0470\u046e\u0001\u0000\u0000"+
		"\u0000\u0471\u0475\u00053\u0000\u0000\u0472\u0474\u0003\u0086C\u0000\u0473"+
		"\u0472\u0001\u0000\u0000\u0000\u0474\u0477\u0001\u0000\u0000\u0000\u0475"+
		"\u0473\u0001\u0000\u0000\u0000\u0475\u0476\u0001\u0000\u0000\u0000\u0476"+
		"\u0478\u0001\u0000\u0000\u0000\u0477\u0475\u0001\u0000\u0000\u0000\u0478"+
		"\u0479\u00054\u0000\u0000\u0479\u0085\u0001\u0000\u0000\u0000\u047a\u047b"+
		"\u0005k\u0000\u0000\u047b\u0482\u00058\u0000\u0000\u047c\u0483\u0005k"+
		"\u0000\u0000\u047d\u047f\u0005g\u0000\u0000\u047e\u0480\u0007\u0004\u0000"+
		"\u0000\u047f\u047e\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000"+
		"\u0000\u0480\u0483\u0001\u0000\u0000\u0000\u0481\u0483\u0003p8\u0000\u0482"+
		"\u047c\u0001\u0000\u0000\u0000\u0482\u047d\u0001\u0000\u0000\u0000\u0482"+
		"\u0481\u0001\u0000\u0000\u0000\u0483\u0484\u0001\u0000\u0000\u0000\u0484"+
		"\u0482\u0001\u0000\u0000\u0000\u0484\u0485\u0001\u0000\u0000\u0000\u0485"+
		"\u0493\u0001\u0000\u0000\u0000\u0486\u048d\u00056\u0000\u0000\u0487\u048e"+
		"\u0005k\u0000\u0000\u0488\u048a\u0005g\u0000\u0000\u0489\u048b\u0007\u0004"+
		"\u0000\u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048a\u048b\u0001\u0000"+
		"\u0000\u0000\u048b\u048e\u0001\u0000\u0000\u0000\u048c\u048e\u0003p8\u0000"+
		"\u048d\u0487\u0001\u0000\u0000\u0000\u048d\u0488\u0001\u0000\u0000\u0000"+
		"\u048d\u048c\u0001\u0000\u0000\u0000\u048e\u048f\u0001\u0000\u0000\u0000"+
		"\u048f\u048d\u0001\u0000\u0000\u0000\u048f\u0490\u0001\u0000\u0000\u0000"+
		"\u0490\u0492\u0001\u0000\u0000\u0000\u0491\u0486\u0001\u0000\u0000\u0000"+
		"\u0492\u0495\u0001\u0000\u0000\u0000\u0493\u0491\u0001\u0000\u0000\u0000"+
		"\u0493\u0494\u0001\u0000\u0000\u0000\u0494\u0496\u0001\u0000\u0000\u0000"+
		"\u0495\u0493\u0001\u0000\u0000\u0000\u0496\u0497\u00055\u0000\u0000\u0497"+
		"\u0087\u0001\u0000\u0000\u0000\u0498\u0499\u0005%\u0000\u0000\u0499\u049a"+
		"\u00057\u0000\u0000\u049a\u049b\u00053\u0000\u0000\u049b\u049c\u0003l"+
		"6\u0000\u049c\u049d\u00054\u0000\u0000\u049d\u0089\u0001\u0000\u0000\u0000"+
		"\u049e\u049f\u00051\u0000\u0000\u049f\u04a0\u0005(\u0000\u0000\u04a0\u04a1"+
		"\u00052\u0000\u0000\u04a1\u04a2\u00057\u0000\u0000\u04a2\u04a3\u0005h"+
		"\u0000\u0000\u04a3\u008b\u0001\u0000\u0000\u0000\u04a4\u04a5\u00051\u0000"+
		"\u0000\u04a5\u04a6\u0005)\u0000\u0000\u04a6\u04a7\u00052\u0000\u0000\u04a7"+
		"\u04a8\u00057\u0000\u0000\u04a8\u04a9\u0005h\u0000\u0000\u04a9\u008d\u0001"+
		"\u0000\u0000\u0000\u04aa\u04ab\u00051\u0000\u0000\u04ab\u04ac\u0005\'"+
		"\u0000\u0000\u04ac\u04ad\u00052\u0000\u0000\u04ad\u04ae\u00057\u0000\u0000"+
		"\u04ae\u04af\u0005h\u0000\u0000\u04af\u008f\u0001\u0000\u0000\u0000\u04b0"+
		"\u04b1\u0005.\u0000\u0000\u04b1\u04b2\u00057\u0000\u0000\u04b2\u04b3\u0005"+
		"3\u0000\u0000\u04b3\u04b4\u0003l6\u0000\u04b4\u04b5\u00054\u0000\u0000"+
		"\u04b5\u0091\u0001\u0000\u0000\u0000\u04b6\u04b7\u0005+\u0000\u0000\u04b7"+
		"\u04b8\u00057\u0000\u0000\u04b8\u04b9\u0005h\u0000\u0000\u04b9\u0093\u0001"+
		"\u0000\u0000\u0000\u04ba\u04bb\u0005,\u0000\u0000\u04bb\u04bc\u00057\u0000"+
		"\u0000\u04bc\u04bd\u0005h\u0000\u0000\u04bd\u0095\u0001\u0000\u0000\u0000"+
		"\u04be\u04bf\u0005-\u0000\u0000\u04bf\u04c0\u00057\u0000\u0000\u04c0\u04c1"+
		"\u0007\u0005\u0000\u0000\u04c1\u0097\u0001\u0000\u0000\u0000\u04c2\u04c3"+
		"\u0005\u0002\u0000\u0000\u04c3\u04c4\u00057\u0000\u0000\u04c4\u04c5\u0003"+
		"l6\u0000\u04c5\u0099\u0001\u0000\u0000\u0000\u04c6\u04c7\u0005\u0001\u0000"+
		"\u0000\u04c7\u04c8\u00057\u0000\u0000\u04c8\u04c9\u0003l6\u0000\u04c9"+
		"\u009b\u0001\u0000\u0000\u0000\u04ca\u04cb\u0005j\u0000\u0000\u04cb\u04cc"+
		"\u0003\u009eO\u0000\u04cc\u04cd\u0005j\u0000\u0000\u04cd\u009d\u0001\u0000"+
		"\u0000\u0000\u04ce\u04d8\u0003v;\u0000\u04cf\u04d0\u0005K\u0000\u0000"+
		"\u04d0\u04d1\u0003l6\u0000\u04d1\u04d2\u0005L\u0000\u0000\u04d2\u04d8"+
		"\u0001\u0000\u0000\u0000\u04d3\u04d8\u0005k\u0000\u0000\u04d4\u04d8\u0005"+
		"h\u0000\u0000\u04d5\u04d8\u0005g\u0000\u0000\u04d6\u04d8\u0005i\u0000"+
		"\u0000\u04d7\u04ce\u0001\u0000\u0000\u0000\u04d7\u04cf\u0001\u0000\u0000"+
		"\u0000\u04d7\u04d3\u0001\u0000\u0000\u0000\u04d7\u04d4\u0001\u0000\u0000"+
		"\u0000\u04d7\u04d5\u0001\u0000\u0000\u0000\u04d7\u04d6\u0001\u0000\u0000"+
		"\u0000\u04d8\u04d9\u0001\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000"+
		"\u0000\u04d9\u04da\u0001\u0000\u0000\u0000\u04da\u009f\u0001\u0000\u0000"+
		"\u0000z\u00a3\u00bf\u00c4\u00cf\u00da\u00de\u00f7\u00fa\u0101\u0117\u011f"+
		"\u0138\u013b\u0145\u014f\u015d\u015f\u0163\u0167\u016e\u0172\u017f\u0186"+
		"\u018d\u0196\u019b\u01a6\u01ad\u01af\u01b8\u01c4\u01c7\u01cf\u01d3\u01d8"+
		"\u01e0\u01eb\u01f9\u01fd\u020a\u020d\u0216\u021b\u021e\u0225\u022a\u022d"+
		"\u0235\u023c\u0241\u0245\u0248\u0256\u0259\u0262\u0266\u026a\u026f\u0279"+
		"\u027c\u0282\u028d\u0290\u0295\u029b\u02a1\u02a8\u02b6\u02bb\u02c0\u02cd"+
		"\u02d9\u02dd\u02e5\u02e7\u02ed\u02f1\u02f5\u02fd\u0303\u0317\u031a\u031e"+
		"\u0328\u032d\u0346\u0364\u0367\u037e\u03b3\u03b6\u03c3\u03c5\u03d2\u03db"+
		"\u03de\u03ee\u03f0\u03f5\u0401\u0405\u0411\u0418\u0436\u0439\u0445\u0449"+
		"\u0453\u0459\u0460\u0467\u046e\u0475\u047f\u0482\u0484\u048a\u048d\u048f"+
		"\u0493\u04d7\u04d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}