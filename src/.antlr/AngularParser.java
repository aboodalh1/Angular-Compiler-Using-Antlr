// Generated from c:\Users\KEMO\OneDrive\Desktop\compiler 2\Angular-Compiler-Using-Antlr\src\AngularParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngularParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NgIfDirective=1, NgForDirective=2, State=3, Action=4, Store=5, Dispatch=6, 
		Select=7, RouterLink=8, RouterOutlet=9, Router=10, Navigate=11, NgModel=12, 
		NgSubmit=13, NgClick=14, Name=15, Id=16, Src=17, Alt=18, Import=19, Export=20, 
		Abstract=21, Interface=22, Extends=23, Implements=24, Console=25, Log=26, 
		Class=27, InlineAttributeName=28, BackgroundColorAttributeName=29, TextColorAttributeName=30, 
		TypeAttributeName=31, LabelAttributeName=32, ValueAttributeName=33, PlaceHolderAttributeName=34, 
		CheckedAttributeName=35, TargetAttributeName=36, OnSubmitAttributeName=37, 
		OnChangeAttributeName=38, OnClickAttributeName=39, HeadingLevelAttributeName=40, 
		DirectionAttributeName=41, DurationAttributeName=42, RepeatAttributeName=43, 
		GapAttributeName=44, OpenBracket=45, CloseBracket=46, OpenParen=47, CloseParen=48, 
		OpenBrace=49, CloseBrace=50, SemiColon=51, Comma=52, Assign=53, Colon=54, 
		QuestionMark=55, Dot=56, Plus=57, Minus=58, Multiply=59, At=60, Divide=61, 
		Modulus=62, Not=63, LessThan=64, GreaterThan=65, LessThanEquals=66, GreaterThanEquals=67, 
		NOT_EQUAL=68, WeakEqual=69, StrongEqual=70, And=71, Or=72, AngularExpressionStart=73, 
		AngularExpressionEnd=74, Let_Identify=75, If=76, Else=77, While=78, Break=79, 
		Void=80, Continue=81, Function=82, Return=83, From=84, Null=85, Enum=86, 
		Array=87, Any=88, Arrow=89, TypeNumber=90, TypeString=91, TypeBoolean=92, 
		This=93, Constructor=94, Private=95, Public=96, Static=97, Protected=98, 
		New=99, NumberLiteral=100, StringLiteral=101, BooleanLiteral=102, Backtick=103, 
		Identifier=104, CssPixel=105, SingleLineComment=106, MultiLineComment=107, 
		WS=108, Component=109, Injectable=110, Pipe=111, Directive=112, Module=113, 
		Service=114;
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
		RULE_identifierOrPropertyAssignment = 30, RULE_enumDeclaration = 31, RULE_enumValues = 32, 
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
		RULE_repeatAttribute = 75, RULE_ngForAttribute = 76, RULE_ngIfAttribute = 77;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "stateManagement", "stateDeclaration", "actionDeclaration", 
			"storeOperation", "storeDispatch", "storeSelect", "actionCall", "navigation", 
			"routerLink", "routerOutlet", "routerNavigate", "navigationArray", "angularTemplate", 
			"ngModel", "ngSubmit", "ngClick", "methodCallStatement", "component", 
			"exportClass", "classDeclaration", "classBody", "decorator", "argumentList", 
			"argument", "importStatement", "thisVarible", "newInstanceAssignment", 
			"nestedThisAssignment", "identifierOrPropertyAssignment", "enumDeclaration", 
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
			"ngIfAttribute"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngIf'", "'*ngFor'", "'@State'", "'@Action'", "'store'", "'dispatch'", 
			"'select'", "'routerLink'", "'router-outlet'", "'router'", "'navigate'", 
			"'[(ngModel)]'", "'(ngSubmit)'", "'(click)'", "'name'", "'id'", "'src'", 
			"'alt'", "'import'", "'export'", "'abstract'", "'interface'", "'extends'", 
			"'implements'", "'console'", "'log'", "'class'", "'inline'", "'backgroundColor'", 
			"'textColor'", "'type'", "'label'", "'value'", "'placeholder'", "'chacked'", 
			"'target'", "'submit'", "'change'", "'click'", "'level'", "'direction'", 
			"'duration'", "'repeat'", "'gap'", "'['", "']'", "'('", "')'", "'{'", 
			"'}'", "';'", "','", "'='", "':'", "'?'", "'.'", "'+'", "'-'", "'*'", 
			"'@'", "'/'", "'%'", "'!'", "'<'", "'>'", "'<='", "'>='", "'!='", "'=='", 
			"'==='", "'&&'", "'||'", "'{{'", "'}}'", "'let'", "'if'", "'else'", "'while'", 
			"'break'", "'void'", "'continue'", "'function'", "'return'", "'from'", 
			"'null'", "'enum'", "'Array'", "'any'", "'=>'", "'number'", "'string'", 
			"'boolean'", "'this'", "'constructor'", "'private'", "'public'", "'static'", 
			"'protected'", "'new'", null, null, null, "'`'", null, "'px'", null, 
			null, null, "'@Component'", "'@Injectable'", "'@Pipe'", "'@Directive'", 
			"'@NgModule'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "State", "Action", "Store", 
			"Dispatch", "Select", "RouterLink", "RouterOutlet", "Router", "Navigate", 
			"NgModel", "NgSubmit", "NgClick", "Name", "Id", "Src", "Alt", "Import", 
			"Export", "Abstract", "Interface", "Extends", "Implements", "Console", 
			"Log", "Class", "InlineAttributeName", "BackgroundColorAttributeName", 
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
			"From", "Null", "Enum", "Array", "Any", "Arrow", "TypeNumber", "TypeString", 
			"TypeBoolean", "This", "Constructor", "Private", "Public", "Static", 
			"Protected", "New", "NumberLiteral", "StringLiteral", "BooleanLiteral", 
			"Backtick", "Identifier", "CssPixel", "SingleLineComment", "MultiLineComment", 
			"WS", "Component", "Injectable", "Pipe", "Directive", "Module", "Service"
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
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessThan - 64)) | (1L << (AngularExpressionStart - 64)) | (1L << (Let_Identify - 64)) | (1L << (If - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Null - 64)) | (1L << (Enum - 64)) | (1L << (This - 64)) | (1L << (Constructor - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Static - 64)) | (1L << (Protected - 64)) | (1L << (NumberLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (Backtick - 64)) | (1L << (Identifier - 64)) | (1L << (Component - 64)) | (1L << (Service - 64)))) != 0)) {
				{
				{
				setState(156);
				statement();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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

	public static class StatementContext extends ParserRuleContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
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
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				arrayDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(166);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(168);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(169);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(170);
				assignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(171);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(172);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(173);
				html_element();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(174);
				importStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(175);
				component();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(176);
				exportClass();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(177);
				thisVarible();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(178);
				classDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(179);
				abstractClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(180);
				html();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(181);
				consoleLog();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(182);
				stateManagement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(183);
				navigation();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(184);
				angularTemplate();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(185);
				methodCallStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(186);
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
	}

	public final StateManagementContext stateManagement() throws RecognitionException {
		StateManagementContext _localctx = new StateManagementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stateManagement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case State:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				stateDeclaration();
				}
				break;
			case Action:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				actionDeclaration();
				}
				break;
			case Store:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
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
	}

	public final StateDeclarationContext stateDeclaration() throws RecognitionException {
		StateDeclarationContext _localctx = new StateDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stateDeclaration);
		try {
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(State);
				setState(195);
				match(OpenParen);
				setState(196);
				match(CloseParen);
				setState(197);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(State);
				setState(199);
				match(OpenParen);
				setState(200);
				match(StringLiteral);
				setState(201);
				match(CloseParen);
				setState(202);
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
	}

	public final ActionDeclarationContext actionDeclaration() throws RecognitionException {
		ActionDeclarationContext _localctx = new ActionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_actionDeclaration);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(Action);
				setState(206);
				match(OpenParen);
				setState(207);
				match(CloseParen);
				setState(208);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(Action);
				setState(210);
				match(OpenParen);
				setState(211);
				match(StringLiteral);
				setState(212);
				match(CloseParen);
				setState(213);
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
	}

	public final StoreOperationContext storeOperation() throws RecognitionException {
		StoreOperationContext _localctx = new StoreOperationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_storeOperation);
		try {
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				storeDispatch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
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
	}

	public final StoreDispatchContext storeDispatch() throws RecognitionException {
		StoreDispatchContext _localctx = new StoreDispatchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_storeDispatch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(Store);
			setState(221);
			match(Dot);
			setState(222);
			match(Dispatch);
			setState(223);
			match(OpenParen);
			setState(224);
			actionCall();
			setState(225);
			match(CloseParen);
			setState(226);
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
	}

	public final StoreSelectContext storeSelect() throws RecognitionException {
		StoreSelectContext _localctx = new StoreSelectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_storeSelect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(Store);
			setState(229);
			match(Dot);
			setState(230);
			match(Select);
			setState(231);
			match(OpenParen);
			setState(232);
			match(StringLiteral);
			setState(233);
			match(CloseParen);
			setState(234);
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
	}

	public final ActionCallContext actionCall() throws RecognitionException {
		ActionCallContext _localctx = new ActionCallContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_actionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(Identifier);
			setState(237);
			match(OpenParen);
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenParen - 45)) | (1L << (OpenBrace - 45)) | (1L << (AngularExpressionStart - 45)) | (1L << (Null - 45)) | (1L << (This - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(238);
				expression(0);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(239);
					match(Comma);
					setState(240);
					expression(0);
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(248);
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
	}

	public final NavigationContext navigation() throws RecognitionException {
		NavigationContext _localctx = new NavigationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_navigation);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RouterLink:
				enterOuterAlt(_localctx, 1);
				{
				setState(250);
				routerLink();
				}
				break;
			case RouterOutlet:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				routerOutlet();
				}
				break;
			case Router:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
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

	public static class RouterLinkContext extends ParserRuleContext {
		public TerminalNode RouterLink() { return getToken(AngularParser.RouterLink, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public RouterLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerLink; }
	}

	public final RouterLinkContext routerLink() throws RecognitionException {
		RouterLinkContext _localctx = new RouterLinkContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_routerLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(RouterLink);
			setState(256);
			match(Assign);
			setState(257);
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

	public static class RouterOutletContext extends ParserRuleContext {
		public TerminalNode RouterOutlet() { return getToken(AngularParser.RouterOutlet, 0); }
		public RouterOutletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routerOutlet; }
	}

	public final RouterOutletContext routerOutlet() throws RecognitionException {
		RouterOutletContext _localctx = new RouterOutletContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_routerOutlet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
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
	}

	public final RouterNavigateContext routerNavigate() throws RecognitionException {
		RouterNavigateContext _localctx = new RouterNavigateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_routerNavigate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(Router);
			setState(262);
			match(Dot);
			setState(263);
			match(Navigate);
			setState(264);
			match(OpenParen);
			setState(265);
			navigationArray();
			setState(266);
			match(CloseParen);
			setState(267);
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
	}

	public final NavigationArrayContext navigationArray() throws RecognitionException {
		NavigationArrayContext _localctx = new NavigationArrayContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_navigationArray);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(OpenBracket);
			setState(270);
			match(StringLiteral);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(271);
				match(Comma);
				setState(272);
				match(StringLiteral);
				}
				}
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
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
	}

	public final AngularTemplateContext angularTemplate() throws RecognitionException {
		AngularTemplateContext _localctx = new AngularTemplateContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_angularTemplate);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				ngModel();
				}
				break;
			case NgSubmit:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				ngSubmit();
				}
				break;
			case NgClick:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
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
	}

	public final NgModelContext ngModel() throws RecognitionException {
		NgModelContext _localctx = new NgModelContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ngModel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(OpenBracket);
			setState(286);
			match(NgModel);
			setState(287);
			match(CloseBracket);
			setState(288);
			match(Assign);
			setState(289);
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

	public static class NgSubmitContext extends ParserRuleContext {
		public TerminalNode NgSubmit() { return getToken(AngularParser.NgSubmit, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public NgSubmitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngSubmit; }
	}

	public final NgSubmitContext ngSubmit() throws RecognitionException {
		NgSubmitContext _localctx = new NgSubmitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ngSubmit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(NgSubmit);
			setState(292);
			match(Assign);
			setState(293);
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

	public static class NgClickContext extends ParserRuleContext {
		public TerminalNode NgClick() { return getToken(AngularParser.NgClick, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public NgClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ngClick; }
	}

	public final NgClickContext ngClick() throws RecognitionException {
		NgClickContext _localctx = new NgClickContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ngClick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(NgClick);
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
	}

	public final MethodCallStatementContext methodCallStatement() throws RecognitionException {
		MethodCallStatementContext _localctx = new MethodCallStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_methodCallStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			expression(0);
			setState(300);
			match(Dot);
			setState(301);
			match(Identifier);
			setState(302);
			match(OpenParen);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenParen - 45)) | (1L << (OpenBrace - 45)) | (1L << (AngularExpressionStart - 45)) | (1L << (Null - 45)) | (1L << (This - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(303);
				expression(0);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(304);
					match(Comma);
					setState(305);
					expression(0);
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(313);
			match(CloseParen);
			setState(314);
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

	public static class ComponentContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ExportClassContext exportClass() {
			return getRuleContext(ExportClassContext.class,0);
		}
		public TerminalNode Service() { return getToken(AngularParser.Service, 0); }
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
	}

	public final ComponentContext component() throws RecognitionException {
		ComponentContext _localctx = new ComponentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_component);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			_la = _input.LA(1);
			if ( !(_la==Component || _la==Service) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(317);
			match(OpenParen);
			setState(321);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(318);
				argumentList();
				}
				break;
			case OpenBrace:
				{
				setState(319);
				match(OpenBrace);
				setState(320);
				match(CloseBrace);
				}
				break;
			case CloseParen:
				break;
			default:
				break;
			}
			setState(323);
			match(CloseParen);
			setState(324);
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
	}

	public final ExportClassContext exportClass() throws RecognitionException {
		ExportClassContext _localctx = new ExportClassContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exportClass);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(Export);
				setState(327);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(Export);
				setState(329);
				match(Identifier);
				setState(330);
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
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(Class);
			setState(334);
			match(Identifier);
			setState(335);
			match(OpenBrace);
			setState(336);
			classBody();
			setState(337);
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
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessThan - 64)) | (1L << (AngularExpressionStart - 64)) | (1L << (Let_Identify - 64)) | (1L << (If - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Null - 64)) | (1L << (Enum - 64)) | (1L << (This - 64)) | (1L << (Constructor - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Static - 64)) | (1L << (Protected - 64)) | (1L << (NumberLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (Backtick - 64)) | (1L << (Identifier - 64)) | (1L << (Component - 64)) | (1L << (Service - 64)))) != 0)) {
				{
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(339);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(340);
					objectDeclataion();
					}
					break;
				case 3:
					{
					setState(341);
					arrayDeclaration();
					}
					break;
				case 4:
					{
					setState(342);
					abstractFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(343);
					functionDeclaration();
					}
					break;
				case 6:
					{
					setState(344);
					statement();
					}
					break;
				}
				}
				setState(349);
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
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decorator);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(350);
					argumentList();
					}
				}

				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				match(OpenBrace);
				setState(354);
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
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_argumentList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			argument();
			setState(362);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(358);
					match(Comma);
					setState(359);
					argument();
					}
					} 
				}
				setState(364);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(365);
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
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			match(Identifier);
			setState(369);
			match(Colon);
			setState(370);
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
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_importStatement);
		try {
			setState(384);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(Import);
				setState(373);
				match(OpenBrace);
				setState(374);
				match(Identifier);
				setState(375);
				match(CloseBrace);
				setState(376);
				match(From);
				setState(377);
				match(StringLiteral);
				setState(378);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(Import);
				setState(380);
				match(Identifier);
				setState(381);
				match(From);
				setState(382);
				match(StringLiteral);
				setState(383);
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
	}

	public final ThisVaribleContext thisVarible() throws RecognitionException {
		ThisVaribleContext _localctx = new ThisVaribleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thisVarible);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(This);
			setState(387);
			match(Dot);
			setState(388);
			match(Identifier);
			setState(389);
			match(Assign);
			setState(393);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				setState(390);
				newInstanceAssignment();
				}
				break;
			case This:
				{
				setState(391);
				nestedThisAssignment();
				}
				break;
			case Identifier:
				{
				setState(392);
				identifierOrPropertyAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(395);
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
	}

	public final NewInstanceAssignmentContext newInstanceAssignment() throws RecognitionException {
		NewInstanceAssignmentContext _localctx = new NewInstanceAssignmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_newInstanceAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(New);
			setState(398);
			match(Identifier);
			setState(399);
			match(OpenParen);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenParen - 45)) | (1L << (OpenBrace - 45)) | (1L << (AngularExpressionStart - 45)) | (1L << (Null - 45)) | (1L << (This - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(400);
				expression(0);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(401);
					match(Comma);
					setState(402);
					expression(0);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(410);
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
	}

	public final NestedThisAssignmentContext nestedThisAssignment() throws RecognitionException {
		NestedThisAssignmentContext _localctx = new NestedThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nestedThisAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(This);
			setState(418); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				match(Dot);
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(414);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(415);
					function_call();
					}
					break;
				}
				}
				}
				setState(420); 
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
	}

	public final IdentifierOrPropertyAssignmentContext identifierOrPropertyAssignment() throws RecognitionException {
		IdentifierOrPropertyAssignmentContext _localctx = new IdentifierOrPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifierOrPropertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(Identifier);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(423);
				match(Dot);
				setState(424);
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

	public static class EnumDeclarationContext extends ParserRuleContext {
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
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			match(Enum);
			setState(428);
			match(Identifier);
			setState(429);
			match(OpenBrace);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(430);
				enumValues();
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			match(CloseBrace);
			setState(437);
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
	}

	public final EnumValuesContext enumValues() throws RecognitionException {
		EnumValuesContext _localctx = new EnumValuesContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_enumValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(439);
			enumValue();
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(440);
				match(Comma);
				setState(441);
				enumValue();
				}
				}
				setState(446);
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
	}

	public final EnumValueContext enumValue() throws RecognitionException {
		EnumValueContext _localctx = new EnumValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(Identifier);
			setState(448);
			match(Assign);
			setState(449);
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
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(Console);
			setState(452);
			match(Dot);
			setState(453);
			match(Log);
			setState(454);
			match(OpenParen);
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(455);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(456);
				match(StringLiteral);
				}
				break;
			case 3:
				{
				setState(457);
				literalValue();
				}
				break;
			}
			setState(460);
			match(CloseParen);
			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(461);
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

	public static class AbstractClassContext extends ParserRuleContext {
		public TerminalNode Abstract() { return getToken(AngularParser.Abstract, 0); }
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public AbstractClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractClass; }
	}

	public final AbstractClassContext abstractClass() throws RecognitionException {
		AbstractClassContext _localctx = new AbstractClassContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(Abstract);
			setState(465);
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
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			match(Interface);
			setState(468);
			match(OpenBrace);
			setState(469);
			classBody();
			setState(470);
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

	public static class AccessModifierContext extends ParserRuleContext {
		public TerminalNode Private() { return getToken(AngularParser.Private, 0); }
		public TerminalNode Public() { return getToken(AngularParser.Public, 0); }
		public TerminalNode Protected() { return getToken(AngularParser.Protected, 0); }
		public TerminalNode Static() { return getToken(AngularParser.Static, 0); }
		public AccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessModifier; }
	}

	public final AccessModifierContext accessModifier() throws RecognitionException {
		AccessModifierContext _localctx = new AccessModifierContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(472);
			_la = _input.LA(1);
			if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) ) {
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
		public AccessModifierContext accessModifier() {
			return getRuleContext(AccessModifierContext.class,0);
		}
		public TerminalNode Let_Identify() { return getToken(AngularParser.Let_Identify, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableDeclaration);
		int _la;
		try {
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(474);
					accessModifier();
					}
				}

				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(477);
					match(Let_Identify);
					}
				}

				setState(480);
				match(Identifier);
				setState(481);
				match(Colon);
				{
				setState(482);
				type();
				}
				setState(483);
				match(Assign);
				setState(486);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(484);
					expression(0);
					}
					break;
				case 2:
					{
					setState(485);
					literalValue();
					}
					break;
				}
				setState(488);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(490);
					accessModifier();
					}
				}

				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(493);
					match(Let_Identify);
					}
				}

				setState(496);
				match(Identifier);
				setState(497);
				match(Assign);
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(498);
					expression(0);
					}
					break;
				case 2:
					{
					setState(499);
					literalValue();
					}
					break;
				}
				setState(502);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(504);
					accessModifier();
					}
				}

				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(507);
					match(Let_Identify);
					}
				}

				setState(510);
				match(Identifier);
				setState(511);
				match(Colon);
				setState(512);
				type();
				setState(513);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(515);
					accessModifier();
					}
				}

				setState(518);
				match(Identifier);
				setState(519);
				match(Assign);
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(520);
					expression(0);
					}
					break;
				case 2:
					{
					setState(521);
					literalValue();
					}
					break;
				}
				setState(524);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(526);
					accessModifier();
					}
				}

				setState(529);
				match(Identifier);
				setState(530);
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
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayDeclaration);
		int _la;
		try {
			setState(573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(533);
					match(Let_Identify);
					}
				}

				setState(536);
				match(Identifier);
				setState(537);
				match(Colon);
				setState(538);
				type();
				setState(539);
				match(OpenBracket);
				setState(540);
				match(CloseBracket);
				setState(541);
				match(Assign);
				setState(542);
				match(OpenBracket);
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenBrace - 45)) | (1L << (Null - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)))) != 0)) {
					{
					setState(543);
					literalValue();
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(544);
						match(Comma);
						setState(545);
						literalValue();
						}
						}
						setState(550);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(553);
				match(CloseBracket);
				setState(554);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				match(Identifier);
				setState(557);
				match(Assign);
				setState(558);
				match(OpenBracket);
				setState(560);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(559);
					literalValue();
					}
					break;
				}
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenBrace - 45)) | (1L << (Null - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)))) != 0)) {
					{
					{
					setState(562);
					literalValue();
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(563);
						match(Comma);
						}
					}

					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(571);
				match(CloseBracket);
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
	}

	public final AbstractFunctionDeclarationContext abstractFunctionDeclaration() throws RecognitionException {
		AbstractFunctionDeclarationContext _localctx = new AbstractFunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(Abstract);
			setState(576);
			match(Identifier);
			setState(577);
			match(OpenParen);
			setState(586);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(578);
				parameter();
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(579);
					match(Comma);
					setState(580);
					parameter();
					}
					}
					setState(585);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(588);
			match(CloseParen);
			setState(589);
			match(Colon);
			setState(592);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
				{
				setState(590);
				type();
				}
				break;
			case Void:
				{
				setState(591);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(594);
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
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_la = _input.LA(1);
			if ( !(_la==Constructor || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(597);
			match(OpenParen);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(598);
				parameter();
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(599);
					match(Comma);
					setState(600);
					parameter();
					}
					}
					setState(605);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(608);
			match(CloseParen);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(609);
				match(Colon);
				setState(610);
				type();
				}
			}

			setState(613);
			match(OpenBrace);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessThan - 64)) | (1L << (AngularExpressionStart - 64)) | (1L << (Let_Identify - 64)) | (1L << (If - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Null - 64)) | (1L << (Enum - 64)) | (1L << (This - 64)) | (1L << (Constructor - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Static - 64)) | (1L << (Protected - 64)) | (1L << (NumberLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (Backtick - 64)) | (1L << (Identifier - 64)) | (1L << (Component - 64)) | (1L << (Service - 64)))) != 0)) {
				{
				{
				setState(614);
				statement();
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
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
	}

	public final ObjectDeclataionContext objectDeclataion() throws RecognitionException {
		ObjectDeclataionContext _localctx = new ObjectDeclataionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectDeclataion);
		int _la;
		try {
			setState(654);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(622);
					accessModifier();
					}
				}

				setState(625);
				match(Identifier);
				setState(626);
				match(Colon);
				setState(627);
				match(Identifier);
				setState(628);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Private - 95)) | (1L << (Public - 95)) | (1L << (Static - 95)) | (1L << (Protected - 95)))) != 0)) {
					{
					setState(629);
					accessModifier();
					}
				}

				setState(632);
				match(Identifier);
				setState(633);
				match(Colon);
				setState(634);
				match(Identifier);
				setState(635);
				match(Assign);
				setState(636);
				match(New);
				setState(637);
				match(Identifier);
				setState(638);
				match(OpenParen);
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenBrace - 45)) | (1L << (Null - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)))) != 0)) {
					{
					{
					setState(639);
					literalValue();
					setState(644);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(640);
						match(Comma);
						setState(641);
						literalValue();
						}
						}
						setState(646);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(652);
				match(CloseParen);
				setState(653);
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
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (Array - 87)) | (1L << (Any - 87)) | (1L << (TypeNumber - 87)) | (1L << (TypeString - 87)) | (1L << (TypeBoolean - 87)))) != 0)) ) {
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
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literalValue);
		try {
			setState(666);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658);
				match(NumberLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(661);
				listLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(662);
				mapLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(663);
				match(Null);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(664);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(665);
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
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(668);
			match(OpenBrace);
			setState(669);
			match(Identifier);
			setState(670);
			match(Colon);
			setState(671);
			literalValue();
			setState(682);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(672);
				match(Comma);
				{
				setState(673);
				match(Identifier);
				setState(674);
				match(Colon);
				setState(675);
				literalValue();
				}
				setState(678);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(677);
					match(Comma);
					}
					break;
				}
				}
				}
				setState(684);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(685);
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
	}

	public final ListLiteralContext listLiteral() throws RecognitionException {
		ListLiteralContext _localctx = new ListLiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			match(OpenBracket);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenBrace - 45)) | (1L << (Null - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(690);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(688);
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
					setState(689);
					literalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(702);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(695);
					match(Comma);
					setState(698);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(696);
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
						setState(697);
						literalValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(704);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(705);
				match(Comma);
				}
			}

			setState(708);
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
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignmentStatement);
		int _la;
		try {
			setState(744);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(710);
				match(Identifier);
				setState(711);
				match(Assign);
				setState(712);
				expression(0);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(713);
					match(Comma);
					setState(714);
					expression(0);
					}
					}
					setState(719);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(720);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(722);
				match(This);
				setState(723);
				match(Dot);
				setState(724);
				match(Identifier);
				setState(725);
				match(Assign);
				setState(726);
				expression(0);
				setState(727);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(729);
				match(Identifier);
				setState(730);
				match(Assign);
				setState(731);
				match(OpenBracket);
				setState(740);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenBrace - 45)) | (1L << (Null - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)))) != 0)) {
					{
					setState(732);
					literalValue();
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(733);
						match(Comma);
						setState(734);
						literalValue();
						}
						}
						setState(739);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(742);
				match(CloseBracket);
				setState(743);
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
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(746);
			match(If);
			setState(747);
			match(OpenParen);
			setState(748);
			expression(0);
			setState(749);
			match(CloseParen);
			setState(750);
			block();
			setState(754);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(751);
					elseIfStatement();
					}
					} 
				}
				setState(756);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			}
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(757);
				match(Else);
				setState(758);
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
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			match(While);
			setState(762);
			match(OpenParen);
			setState(763);
			expression(0);
			setState(764);
			match(CloseParen);
			setState(765);
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
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(Else);
			setState(768);
			match(If);
			setState(769);
			match(OpenParen);
			setState(770);
			expression(0);
			setState(771);
			match(CloseParen);
			setState(772);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(AngularParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(774);
			match(Break);
			setState(775);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(AngularParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(Continue);
			setState(778);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(OpenBrace);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessThan - 64)) | (1L << (AngularExpressionStart - 64)) | (1L << (Let_Identify - 64)) | (1L << (If - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Null - 64)) | (1L << (Enum - 64)) | (1L << (This - 64)) | (1L << (Constructor - 64)) | (1L << (Private - 64)) | (1L << (Public - 64)) | (1L << (Static - 64)) | (1L << (Protected - 64)) | (1L << (NumberLiteral - 64)) | (1L << (StringLiteral - 64)) | (1L << (BooleanLiteral - 64)) | (1L << (Backtick - 64)) | (1L << (Identifier - 64)) | (1L << (Component - 64)) | (1L << (Service - 64)))) != 0)) {
				{
				{
				setState(781);
				statement();
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
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
	public static class NotEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT_EQUAL() { return getToken(AngularParser.NOT_EQUAL, 0); }
		public NotEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpressionStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(AngularParser.Or, 0); }
		public LogicalOrExpressionStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(AngularParser.Multiply, 0); }
		public MultiplicationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class StrongEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode StrongEqual() { return getToken(AngularParser.StrongEqual, 0); }
		public StrongEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GreaterThanEquals() { return getToken(AngularParser.GreaterThanEquals, 0); }
		public GreaterThanEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class GreaterThanComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GreaterThan() { return getToken(AngularParser.GreaterThan, 0); }
		public GreaterThanComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
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
	}
	public static class DivisionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Divide() { return getToken(AngularParser.Divide, 0); }
		public DivisionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class SimpleArrowFunctionContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public SimpleArrowFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(AngularParser.LessThan, 0); }
		public LessThanComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParenthesizedExpressionContext extends ExpressionContext {
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public ParenthesizedExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AdditionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(AngularParser.Plus, 0); }
		public AdditionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends ExpressionContext {
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public LiteralExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrowFunctionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(AngularParser.Arrow, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class HtmlExpressionContext extends ExpressionContext {
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public HtmlExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AngularExpreissionContext extends ExpressionContext {
		public TerminalNode AngularExpressionStart() { return getToken(AngularParser.AngularExpressionStart, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AngularExpressionEnd() { return getToken(AngularParser.AngularExpressionEnd, 0); }
		public AngularExpreissionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisPropertyAccessContext extends ExpressionContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public ThisPropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PropertyAccessContext extends ExpressionContext {
		public List<TerminalNode> Identifier() { return getTokens(AngularParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(AngularParser.Identifier, i);
		}
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public PropertyAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public IdentifierExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BracketExpressionContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenBracket() { return getToken(AngularParser.OpenBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(AngularParser.CloseBracket, 0); }
		public BracketExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
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
	}
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
	}
	public static class SubtractionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Minus() { return getToken(AngularParser.Minus, 0); }
		public SubtractionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ModulusContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Modulus() { return getToken(AngularParser.Modulus, 0); }
		public ModulusContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisPropertyAssignmentContext extends ExpressionContext {
		public TerminalNode This() { return getToken(AngularParser.This, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThisPropertyAssignmentContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class WeakEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WeakEqual() { return getToken(AngularParser.WeakEqual, 0); }
		public WeakEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpressionStatementContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(AngularParser.And, 0); }
		public LogicalAndExpressionStatementContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LessThanEqualsComparisonContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LessThanEquals() { return getToken(AngularParser.LessThanEquals, 0); }
		public LessThanEqualsComparisonContext(ExpressionContext ctx) { copyFrom(ctx); }
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
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(790);
				match(OpenParen);
				setState(791);
				expression(0);
				setState(792);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(794);
				match(Identifier);
				setState(795);
				match(OpenBracket);
				setState(796);
				expression(0);
				setState(797);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new AngularExpreissionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(799);
				match(AngularExpressionStart);
				setState(800);
				expression(0);
				setState(801);
				match(AngularExpressionEnd);
				}
				break;
			case 4:
				{
				_localctx = new ThisMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(803);
				match(This);
				setState(804);
				match(Dot);
				setState(805);
				match(Identifier);
				setState(806);
				match(Dot);
				setState(807);
				match(Identifier);
				setState(808);
				match(OpenParen);
				setState(817);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenParen - 45)) | (1L << (OpenBrace - 45)) | (1L << (AngularExpressionStart - 45)) | (1L << (Null - 45)) | (1L << (This - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
					{
					setState(809);
					expression(0);
					setState(814);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(810);
						match(Comma);
						setState(811);
						expression(0);
						}
						}
						setState(816);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(819);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new ArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(820);
				match(Identifier);
				setState(821);
				match(Arrow);
				setState(822);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new SimpleArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(823);
				match(Identifier);
				setState(824);
				match(Arrow);
				setState(825);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ThisPropertyAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(826);
				match(This);
				setState(827);
				match(Dot);
				setState(828);
				match(Identifier);
				setState(829);
				match(Assign);
				setState(830);
				expression(6);
				}
				break;
			case 8:
				{
				_localctx = new ThisPropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(831);
				match(This);
				setState(832);
				match(Dot);
				setState(833);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new PropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(834);
				match(Identifier);
				setState(835);
				match(Dot);
				setState(836);
				match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(837);
				literalValue();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(838);
				match(Identifier);
				}
				break;
			case 12:
				{
				_localctx = new HtmlExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(839);
				html();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(911);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(909);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(842);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(843);
						match(Multiply);
						setState(844);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(845);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(846);
						match(Divide);
						setState(847);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(848);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(849);
						match(Modulus);
						setState(850);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(851);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(852);
						match(Plus);
						setState(853);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(854);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(855);
						match(Minus);
						setState(856);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new LessThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(857);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(858);
						match(LessThan);
						setState(859);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(860);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(861);
						match(GreaterThan);
						setState(862);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(863);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(864);
						match(LessThanEquals);
						setState(865);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(866);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(867);
						match(GreaterThanEquals);
						setState(868);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new WeakEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(869);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(870);
						match(WeakEqual);
						setState(871);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new StrongEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(872);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(873);
						match(StrongEqual);
						setState(874);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(875);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(876);
						match(NOT_EQUAL);
						setState(877);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(878);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(879);
						match(And);
						setState(880);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(881);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(882);
						match(Or);
						setState(883);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(884);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(885);
						match(Dot);
						setState(886);
						match(Identifier);
						setState(887);
						match(OpenParen);
						setState(896);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenParen - 45)) | (1L << (OpenBrace - 45)) | (1L << (AngularExpressionStart - 45)) | (1L << (Null - 45)) | (1L << (This - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
							{
							setState(888);
							expression(0);
							setState(893);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(889);
								match(Comma);
								setState(890);
								expression(0);
								}
								}
								setState(895);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(898);
						match(CloseParen);
						}
						break;
					case 16:
						{
						_localctx = new ArrayMethodWithArrowFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(900);
						match(Dot);
						setState(901);
						match(Identifier);
						setState(902);
						match(OpenParen);
						{
						setState(903);
						match(Identifier);
						setState(904);
						match(Arrow);
						setState(905);
						expression(0);
						}
						setState(907);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(913);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
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
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_parameter);
		try {
			setState(924);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(914);
				match(Identifier);
				setState(915);
				match(Colon);
				setState(916);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(917);
				match(Identifier);
				setState(918);
				match(Colon);
				setState(919);
				type();
				setState(920);
				match(Assign);
				setState(921);
				literalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(923);
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
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(926);
			match(Identifier);
			setState(927);
			match(OpenParen);
			setState(936);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 45)) & ~0x3f) == 0 && ((1L << (_la - 45)) & ((1L << (OpenBracket - 45)) | (1L << (OpenParen - 45)) | (1L << (OpenBrace - 45)) | (1L << (AngularExpressionStart - 45)) | (1L << (Null - 45)) | (1L << (This - 45)) | (1L << (NumberLiteral - 45)) | (1L << (StringLiteral - 45)) | (1L << (BooleanLiteral - 45)) | (1L << (Backtick - 45)) | (1L << (Identifier - 45)))) != 0)) {
				{
				setState(928);
				expression(0);
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(929);
					match(Comma);
					setState(930);
					expression(0);
					}
					}
					setState(935);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(938);
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
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(940);
			match(Backtick);
			setState(941);
			html_content();
			setState(942);
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
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_html_content);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(966); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(966);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(945); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(944);
								html_element();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(947); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case AngularExpressionStart:
						{
						setState(949);
						match(AngularExpressionStart);
						setState(950);
						expression(0);
						setState(951);
						match(AngularExpressionEnd);
						}
						break;
					case NumberLiteral:
					case Identifier:
						{
						setState(956);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==NumberLiteral) {
							{
							{
							setState(953);
							match(NumberLiteral);
							}
							}
							setState(958);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(959);
						match(Identifier);
						setState(963);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(960);
								match(NumberLiteral);
								}
								} 
							}
							setState(965);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
				setState(968); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
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
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_html_element);
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(970);
				match(LessThan);
				setState(971);
				html_tag_name();
				setState(973);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(972);
					html_attributes();
					}
					break;
				}
				setState(975);
				match(GreaterThan);
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(976);
					html_content();
					}
					break;
				}
				setState(979);
				match(LessThan);
				setState(980);
				match(Divide);
				setState(981);
				html_tag_name();
				setState(982);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(984);
				match(LessThan);
				setState(985);
				html_tag_name();
				setState(987);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(986);
					html_attributes();
					}
					break;
				}
				setState(989);
				match(GreaterThan);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(991);
				match(LessThan);
				setState(992);
				html_tag_name();
				setState(993);
				html_attributes();
				setState(994);
				match(Divide);
				setState(995);
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

	public static class Html_tag_nameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public Html_tag_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_tag_name; }
	}

	public final Html_tag_nameContext html_tag_name() throws RecognitionException {
		Html_tag_nameContext _localctx = new Html_tag_nameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_html_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(999);
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
	}

	public final Html_attributesContext html_attributes() throws RecognitionException {
		Html_attributesContext _localctx = new Html_attributesContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_html_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NgIfDirective) | (1L << NgForDirective) | (1L << OpenBracket) | (1L << OpenParen) | (1L << Multiply))) != 0) || _la==Identifier) {
				{
				{
				setState(1001);
				html_attribute();
				}
				}
				setState(1006);
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
	}

	public final Html_attributeContext html_attribute() throws RecognitionException {
		Html_attributeContext _localctx = new Html_attributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_html_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(1007);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1008);
				ngIfAttribute();
				}
				break;
			case 3:
				{
				setState(1009);
				ngForAttribute();
				}
				break;
			case 4:
				{
				setState(1010);
				onChangeAttribute();
				}
				break;
			case 5:
				{
				setState(1011);
				onClickAttribute();
				}
				break;
			case 6:
				{
				setState(1012);
				match(OpenBracket);
				setState(1021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(1013);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(1014);
					match(Identifier);
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(1015);
						access_suffix();
						}
						}
						setState(1020);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(1023);
				match(CloseBracket);
				}
				break;
			case 7:
				{
				setState(1024);
				match(OpenParen);
				{
				setState(1025);
				match(Identifier);
				}
				setState(1026);
				match(CloseParen);
				}
				break;
			case 8:
				{
				setState(1027);
				match(Multiply);
				}
				break;
			}
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1030);
				match(Assign);
				setState(1031);
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
	}

	public final Access_suffixContext access_suffix() throws RecognitionException {
		Access_suffixContext _localctx = new Access_suffixContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_access_suffix);
		try {
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1034);
				match(Dot);
				setState(1035);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				match(OpenBracket);
				setState(1037);
				expression(0);
				setState(1038);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1040);
				match(Dot);
				setState(1041);
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
	}

	public final Html_attribute_valueContext html_attribute_value() throws RecognitionException {
		Html_attribute_valueContext _localctx = new Html_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_html_attribute_value);
		try {
			setState(1046);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1045);
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
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1048);
			match(OpenBracket);
			setState(1049);
			match(Backtick);
			setState(1053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(1050);
				css_content();
				}
				}
				setState(1055);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1056);
			match(Backtick);
			setState(1057);
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
	}

	public final Css_contentContext css_content() throws RecognitionException {
		Css_contentContext _localctx = new Css_contentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_css_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(1059);
				match(Dot);
				}
			}

			setState(1062);
			match(Identifier);
			setState(1067);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1063);
				match(Colon);
				setState(1064);
				match(Identifier);
				}
				}
				setState(1069);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1070);
			match(OpenBrace);
			setState(1074);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(1071);
				css_class_content();
				}
				}
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1077);
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
	}

	public final Css_class_contentContext css_class_content() throws RecognitionException {
		Css_class_contentContext _localctx = new Css_class_contentContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_css_class_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1079);
			match(Identifier);
			setState(1080);
			match(Colon);
			setState(1087); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1087);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(1081);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1082);
					match(NumberLiteral);
					setState(1084);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(1083);
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
					setState(1086);
					function_call();
					}
					break;
				}
				}
				setState(1089); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1091);
				match(Comma);
				setState(1098); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1098);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
					case 1:
						{
						setState(1092);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1093);
						match(NumberLiteral);
						setState(1095);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(1094);
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
						setState(1097);
						function_call();
						}
						break;
					}
					}
					setState(1100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1107);
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
	}

	public final CheckedAttributeContext checkedAttribute() throws RecognitionException {
		CheckedAttributeContext _localctx = new CheckedAttributeContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_checkedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			match(CheckedAttributeName);
			setState(1110);
			match(Assign);
			setState(1111);
			match(OpenBrace);
			setState(1112);
			expression(0);
			setState(1113);
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
	}

	public final OnChangeAttributeContext onChangeAttribute() throws RecognitionException {
		OnChangeAttributeContext _localctx = new OnChangeAttributeContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_onChangeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1115);
			match(OpenParen);
			setState(1116);
			match(OnChangeAttributeName);
			setState(1117);
			match(CloseParen);
			setState(1118);
			match(Assign);
			setState(1119);
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
	}

	public final OnClickAttributeContext onClickAttribute() throws RecognitionException {
		OnClickAttributeContext _localctx = new OnClickAttributeContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_onClickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1121);
			match(OpenParen);
			setState(1122);
			match(OnClickAttributeName);
			setState(1123);
			match(CloseParen);
			setState(1124);
			match(Assign);
			setState(1125);
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
	}

	public final OnSubmitAttributeContext onSubmitAttribute() throws RecognitionException {
		OnSubmitAttributeContext _localctx = new OnSubmitAttributeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_onSubmitAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1127);
			match(OpenParen);
			setState(1128);
			match(OnSubmitAttributeName);
			setState(1129);
			match(CloseParen);
			setState(1130);
			match(Assign);
			setState(1131);
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
	}

	public final GapAttributeContext gapAttribute() throws RecognitionException {
		GapAttributeContext _localctx = new GapAttributeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_gapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1133);
			match(GapAttributeName);
			setState(1134);
			match(Assign);
			setState(1135);
			match(OpenBrace);
			setState(1136);
			expression(0);
			setState(1137);
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

	public static class DirectionAttributeContext extends ParserRuleContext {
		public TerminalNode DirectionAttributeName() { return getToken(AngularParser.DirectionAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public DirectionAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directionAttribute; }
	}

	public final DirectionAttributeContext directionAttribute() throws RecognitionException {
		DirectionAttributeContext _localctx = new DirectionAttributeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_directionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(DirectionAttributeName);
			setState(1140);
			match(Assign);
			setState(1141);
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

	public static class DurationAttributeContext extends ParserRuleContext {
		public TerminalNode DurationAttributeName() { return getToken(AngularParser.DurationAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public DurationAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_durationAttribute; }
	}

	public final DurationAttributeContext durationAttribute() throws RecognitionException {
		DurationAttributeContext _localctx = new DurationAttributeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_durationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1143);
			match(DurationAttributeName);
			setState(1144);
			match(Assign);
			setState(1145);
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

	public static class RepeatAttributeContext extends ParserRuleContext {
		public TerminalNode RepeatAttributeName() { return getToken(AngularParser.RepeatAttributeName, 0); }
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode NumberLiteral() { return getToken(AngularParser.NumberLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public RepeatAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatAttribute; }
	}

	public final RepeatAttributeContext repeatAttribute() throws RecognitionException {
		RepeatAttributeContext _localctx = new RepeatAttributeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_repeatAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(RepeatAttributeName);
			setState(1148);
			match(Assign);
			setState(1149);
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
	}

	public final NgForAttributeContext ngForAttribute() throws RecognitionException {
		NgForAttributeContext _localctx = new NgForAttributeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_ngForAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(NgForDirective);
			setState(1152);
			match(Assign);
			setState(1153);
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
	}

	public final NgIfAttributeContext ngIfAttribute() throws RecognitionException {
		NgIfAttributeContext _localctx = new NgIfAttributeContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ngIfAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(NgIfDirective);
			setState(1156);
			match(Assign);
			setState(1157);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3t\u048a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\7\2\u00a0\n\2\f\2\16\2\u00a3"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00be\n\3\3\4\3\4\3\4\5\4\u00c3"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00ce\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\u00d9\n\6\3\7\3\7\5\7\u00dd\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n"+
		"\7\n\u00f4\n\n\f\n\16\n\u00f7\13\n\5\n\u00f9\n\n\3\n\3\n\3\13\3\13\3\13"+
		"\5\13\u0100\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0114\n\17\f\17\16\17\u0117\13\17"+
		"\3\17\3\17\3\20\3\20\3\20\5\20\u011e\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0135\n\24\f\24\16\24\u0138\13\24\5\24\u013a\n\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0144\n\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u014e\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u015c\n\30\f\30\16\30\u015f\13\30\3\31\5\31"+
		"\u0162\n\31\3\31\3\31\5\31\u0166\n\31\3\32\3\32\3\32\7\32\u016b\n\32\f"+
		"\32\16\32\u016e\13\32\3\32\5\32\u0171\n\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0183\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u018c\n\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u0196\n\36\f\36\16\36\u0199\13\36\5\36\u019b"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01a3\n\37\6\37\u01a5\n\37\r"+
		"\37\16\37\u01a6\3 \3 \3 \5 \u01ac\n \3!\3!\3!\3!\7!\u01b2\n!\f!\16!\u01b5"+
		"\13!\3!\3!\3!\3\"\3\"\3\"\7\"\u01bd\n\"\f\"\16\"\u01c0\13\"\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\5$\u01cd\n$\3$\3$\5$\u01d1\n$\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3(\5(\u01de\n(\3(\5(\u01e1\n(\3(\3(\3(\3(\3(\3(\5(\u01e9"+
		"\n(\3(\3(\3(\5(\u01ee\n(\3(\5(\u01f1\n(\3(\3(\3(\3(\5(\u01f7\n(\3(\3("+
		"\3(\5(\u01fc\n(\3(\5(\u01ff\n(\3(\3(\3(\3(\3(\3(\5(\u0207\n(\3(\3(\3("+
		"\3(\5(\u020d\n(\3(\3(\3(\5(\u0212\n(\3(\3(\5(\u0216\n(\3)\5)\u0219\n)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0225\n)\f)\16)\u0228\13)\5)\u022a\n"+
		")\3)\3)\3)\3)\3)\3)\3)\5)\u0233\n)\3)\3)\5)\u0237\n)\7)\u0239\n)\f)\16"+
		")\u023c\13)\3)\3)\5)\u0240\n)\3*\3*\3*\3*\3*\3*\7*\u0248\n*\f*\16*\u024b"+
		"\13*\5*\u024d\n*\3*\3*\3*\3*\5*\u0253\n*\3*\3*\3+\3+\3+\3+\3+\7+\u025c"+
		"\n+\f+\16+\u025f\13+\5+\u0261\n+\3+\3+\3+\5+\u0266\n+\3+\3+\7+\u026a\n"+
		"+\f+\16+\u026d\13+\3+\3+\3,\5,\u0272\n,\3,\3,\3,\3,\3,\5,\u0279\n,\3,"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0285\n,\f,\16,\u0288\13,\7,\u028a\n,\f"+
		",\16,\u028d\13,\3,\3,\5,\u0291\n,\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\5.\u029d"+
		"\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02a9\n/\7/\u02ab\n/\f/\16/\u02ae"+
		"\13/\3/\3/\3\60\3\60\3\60\7\60\u02b5\n\60\f\60\16\60\u02b8\13\60\3\60"+
		"\3\60\3\60\5\60\u02bd\n\60\7\60\u02bf\n\60\f\60\16\60\u02c2\13\60\3\60"+
		"\5\60\u02c5\n\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\7\61\u02ce\n\61\f"+
		"\61\16\61\u02d1\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\7\61\u02e2\n\61\f\61\16\61\u02e5\13\61\5\61"+
		"\u02e7\n\61\3\61\3\61\5\61\u02eb\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7"+
		"\62\u02f3\n\62\f\62\16\62\u02f6\13\62\3\62\3\62\5\62\u02fa\n\62\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\7\67\u0311\n\67\f\67\16\67\u0314\13\67\3"+
		"\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\78\u032f\n8\f8\168\u0332\138\58\u0334\n8\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u034b\n8\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u037e"+
		"\n8\f8\168\u0381\138\58\u0383\n8\38\38\38\38\38\38\38\38\38\38\38\78\u0390"+
		"\n8\f8\168\u0393\138\39\39\39\39\39\39\39\39\39\39\59\u039f\n9\3:\3:\3"+
		":\3:\3:\7:\u03a6\n:\f:\16:\u03a9\13:\5:\u03ab\n:\3:\3:\3;\3;\3;\3;\3<"+
		"\6<\u03b4\n<\r<\16<\u03b5\3<\3<\3<\3<\3<\7<\u03bd\n<\f<\16<\u03c0\13<"+
		"\3<\3<\7<\u03c4\n<\f<\16<\u03c7\13<\6<\u03c9\n<\r<\16<\u03ca\3=\3=\3="+
		"\5=\u03d0\n=\3=\3=\5=\u03d4\n=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03de\n=\3="+
		"\3=\3=\3=\3=\3=\3=\3=\5=\u03e8\n=\3>\3>\3?\7?\u03ed\n?\f?\16?\u03f0\13"+
		"?\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u03fb\n@\f@\16@\u03fe\13@\5@\u0400\n@"+
		"\3@\3@\3@\3@\3@\5@\u0407\n@\3@\3@\5@\u040b\n@\3A\3A\3A\3A\3A\3A\3A\3A"+
		"\5A\u0415\nA\3B\3B\5B\u0419\nB\3C\3C\3C\7C\u041e\nC\fC\16C\u0421\13C\3"+
		"C\3C\3C\3D\5D\u0427\nD\3D\3D\3D\7D\u042c\nD\fD\16D\u042f\13D\3D\3D\7D"+
		"\u0433\nD\fD\16D\u0436\13D\3D\3D\3E\3E\3E\3E\3E\5E\u043f\nE\3E\6E\u0442"+
		"\nE\rE\16E\u0443\3E\3E\3E\3E\5E\u044a\nE\3E\6E\u044d\nE\rE\16E\u044e\7"+
		"E\u0451\nE\fE\16E\u0454\13E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G"+
		"\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L"+
		"\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\3O\2\3nP\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd"+
		"fhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\2\b\4\2oott\3\2ad\4\2``jj\4\2YZ\\^\4\2"+
		"@@kk\3\2fg\2\u04fb\2\u00a1\3\2\2\2\4\u00bd\3\2\2\2\6\u00c2\3\2\2\2\b\u00cd"+
		"\3\2\2\2\n\u00d8\3\2\2\2\f\u00dc\3\2\2\2\16\u00de\3\2\2\2\20\u00e6\3\2"+
		"\2\2\22\u00ee\3\2\2\2\24\u00ff\3\2\2\2\26\u0101\3\2\2\2\30\u0105\3\2\2"+
		"\2\32\u0107\3\2\2\2\34\u010f\3\2\2\2\36\u011d\3\2\2\2 \u011f\3\2\2\2\""+
		"\u0125\3\2\2\2$\u0129\3\2\2\2&\u012d\3\2\2\2(\u013e\3\2\2\2*\u014d\3\2"+
		"\2\2,\u014f\3\2\2\2.\u015d\3\2\2\2\60\u0165\3\2\2\2\62\u0167\3\2\2\2\64"+
		"\u0172\3\2\2\2\66\u0182\3\2\2\28\u0184\3\2\2\2:\u018f\3\2\2\2<\u019e\3"+
		"\2\2\2>\u01a8\3\2\2\2@\u01ad\3\2\2\2B\u01b9\3\2\2\2D\u01c1\3\2\2\2F\u01c5"+
		"\3\2\2\2H\u01d2\3\2\2\2J\u01d5\3\2\2\2L\u01da\3\2\2\2N\u0215\3\2\2\2P"+
		"\u023f\3\2\2\2R\u0241\3\2\2\2T\u0256\3\2\2\2V\u0290\3\2\2\2X\u0292\3\2"+
		"\2\2Z\u029c\3\2\2\2\\\u029e\3\2\2\2^\u02b1\3\2\2\2`\u02ea\3\2\2\2b\u02ec"+
		"\3\2\2\2d\u02fb\3\2\2\2f\u0301\3\2\2\2h\u0308\3\2\2\2j\u030b\3\2\2\2l"+
		"\u030e\3\2\2\2n\u034a\3\2\2\2p\u039e\3\2\2\2r\u03a0\3\2\2\2t\u03ae\3\2"+
		"\2\2v\u03c8\3\2\2\2x\u03e7\3\2\2\2z\u03e9\3\2\2\2|\u03ee\3\2\2\2~\u0406"+
		"\3\2\2\2\u0080\u0414\3\2\2\2\u0082\u0418\3\2\2\2\u0084\u041a\3\2\2\2\u0086"+
		"\u0426\3\2\2\2\u0088\u0439\3\2\2\2\u008a\u0457\3\2\2\2\u008c\u045d\3\2"+
		"\2\2\u008e\u0463\3\2\2\2\u0090\u0469\3\2\2\2\u0092\u046f\3\2\2\2\u0094"+
		"\u0475\3\2\2\2\u0096\u0479\3\2\2\2\u0098\u047d\3\2\2\2\u009a\u0481\3\2"+
		"\2\2\u009c\u0485\3\2\2\2\u009e\u00a0\5\4\3\2\u009f\u009e\3\2\2\2\u00a0"+
		"\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\7\2\2\3\u00a5\3\3\2\2\2\u00a6\u00be"+
		"\5P)\2\u00a7\u00be\5@!\2\u00a8\u00be\5N(\2\u00a9\u00be\5T+\2\u00aa\u00be"+
		"\5b\62\2\u00ab\u00be\5d\63\2\u00ac\u00be\5`\61\2\u00ad\u00be\5h\65\2\u00ae"+
		"\u00be\5j\66\2\u00af\u00be\5x=\2\u00b0\u00be\5\66\34\2\u00b1\u00be\5("+
		"\25\2\u00b2\u00be\5*\26\2\u00b3\u00be\58\35\2\u00b4\u00be\5,\27\2\u00b5"+
		"\u00be\5H%\2\u00b6\u00be\5t;\2\u00b7\u00be\5F$\2\u00b8\u00be\5\6\4\2\u00b9"+
		"\u00be\5\24\13\2\u00ba\u00be\5\36\20\2\u00bb\u00be\5&\24\2\u00bc\u00be"+
		"\5r:\2\u00bd\u00a6\3\2\2\2\u00bd\u00a7\3\2\2\2\u00bd\u00a8\3\2\2\2\u00bd"+
		"\u00a9\3\2\2\2\u00bd\u00aa\3\2\2\2\u00bd\u00ab\3\2\2\2\u00bd\u00ac\3\2"+
		"\2\2\u00bd\u00ad\3\2\2\2\u00bd\u00ae\3\2\2\2\u00bd\u00af\3\2\2\2\u00bd"+
		"\u00b0\3\2\2\2\u00bd\u00b1\3\2\2\2\u00bd\u00b2\3\2\2\2\u00bd\u00b3\3\2"+
		"\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00b6\3\2\2\2\u00bd"+
		"\u00b7\3\2\2\2\u00bd\u00b8\3\2\2\2\u00bd\u00b9\3\2\2\2\u00bd\u00ba\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be\5\3\2\2\2\u00bf\u00c3"+
		"\5\b\5\2\u00c0\u00c3\5\n\6\2\u00c1\u00c3\5\f\7\2\u00c2\u00bf\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c1\3\2\2\2\u00c3\7\3\2\2\2\u00c4\u00c5\7\5\2\2"+
		"\u00c5\u00c6\7\61\2\2\u00c6\u00c7\7\62\2\2\u00c7\u00ce\5N(\2\u00c8\u00c9"+
		"\7\5\2\2\u00c9\u00ca\7\61\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7\62\2\2"+
		"\u00cc\u00ce\5N(\2\u00cd\u00c4\3\2\2\2\u00cd\u00c8\3\2\2\2\u00ce\t\3\2"+
		"\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\7\61\2\2\u00d1\u00d2\7\62\2\2\u00d2"+
		"\u00d9\5T+\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5\7\61\2\2\u00d5\u00d6\7g\2"+
		"\2\u00d6\u00d7\7\62\2\2\u00d7\u00d9\5T+\2\u00d8\u00cf\3\2\2\2\u00d8\u00d3"+
		"\3\2\2\2\u00d9\13\3\2\2\2\u00da\u00dd\5\16\b\2\u00db\u00dd\5\20\t\2\u00dc"+
		"\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd\r\3\2\2\2\u00de\u00df\7\7\2\2"+
		"\u00df\u00e0\7:\2\2\u00e0\u00e1\7\b\2\2\u00e1\u00e2\7\61\2\2\u00e2\u00e3"+
		"\5\22\n\2\u00e3\u00e4\7\62\2\2\u00e4\u00e5\7\65\2\2\u00e5\17\3\2\2\2\u00e6"+
		"\u00e7\7\7\2\2\u00e7\u00e8\7:\2\2\u00e8\u00e9\7\t\2\2\u00e9\u00ea\7\61"+
		"\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7\62\2\2\u00ec\u00ed\7\65\2\2\u00ed"+
		"\21\3\2\2\2\u00ee\u00ef\7j\2\2\u00ef\u00f8\7\61\2\2\u00f0\u00f5\5n8\2"+
		"\u00f1\u00f2\7\66\2\2\u00f2\u00f4\5n8\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f8\u00f0\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\7\62\2\2\u00fb\23\3\2\2\2\u00fc\u0100\5\26\f\2\u00fd"+
		"\u0100\5\30\r\2\u00fe\u0100\5\32\16\2\u00ff\u00fc\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u00fe\3\2\2\2\u0100\25\3\2\2\2\u0101\u0102\7\n\2\2\u0102"+
		"\u0103\7\67\2\2\u0103\u0104\7g\2\2\u0104\27\3\2\2\2\u0105\u0106\7\13\2"+
		"\2\u0106\31\3\2\2\2\u0107\u0108\7\f\2\2\u0108\u0109\7:\2\2\u0109\u010a"+
		"\7\r\2\2\u010a\u010b\7\61\2\2\u010b\u010c\5\34\17\2\u010c\u010d\7\62\2"+
		"\2\u010d\u010e\7\65\2\2\u010e\33\3\2\2\2\u010f\u0110\7/\2\2\u0110\u0115"+
		"\7g\2\2\u0111\u0112\7\66\2\2\u0112\u0114\7g\2\2\u0113\u0111\3\2\2\2\u0114"+
		"\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\3\2"+
		"\2\2\u0117\u0115\3\2\2\2\u0118\u0119\7\60\2\2\u0119\35\3\2\2\2\u011a\u011e"+
		"\5 \21\2\u011b\u011e\5\"\22\2\u011c\u011e\5$\23\2\u011d\u011a\3\2\2\2"+
		"\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\37\3\2\2\2\u011f\u0120"+
		"\7/\2\2\u0120\u0121\7\16\2\2\u0121\u0122\7\60\2\2\u0122\u0123\7\67\2\2"+
		"\u0123\u0124\7j\2\2\u0124!\3\2\2\2\u0125\u0126\7\17\2\2\u0126\u0127\7"+
		"\67\2\2\u0127\u0128\7g\2\2\u0128#\3\2\2\2\u0129\u012a\7\20\2\2\u012a\u012b"+
		"\7\67\2\2\u012b\u012c\7g\2\2\u012c%\3\2\2\2\u012d\u012e\5n8\2\u012e\u012f"+
		"\7:\2\2\u012f\u0130\7j\2\2\u0130\u0139\7\61\2\2\u0131\u0136\5n8\2\u0132"+
		"\u0133\7\66\2\2\u0133\u0135\5n8\2\u0134\u0132\3\2\2\2\u0135\u0138\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u013a\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u0131\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\3\2"+
		"\2\2\u013b\u013c\7\62\2\2\u013c\u013d\7\65\2\2\u013d\'\3\2\2\2\u013e\u013f"+
		"\t\2\2\2\u013f\u0143\7\61\2\2\u0140\u0144\5\62\32\2\u0141\u0142\7\63\2"+
		"\2\u0142\u0144\7\64\2\2\u0143\u0140\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\62\2\2\u0146\u0147\5"+
		"*\26\2\u0147)\3\2\2\2\u0148\u0149\7\26\2\2\u0149\u014e\5,\27\2\u014a\u014b"+
		"\7\26\2\2\u014b\u014c\7j\2\2\u014c\u014e\7\65\2\2\u014d\u0148\3\2\2\2"+
		"\u014d\u014a\3\2\2\2\u014e+\3\2\2\2\u014f\u0150\7\35\2\2\u0150\u0151\7"+
		"j\2\2\u0151\u0152\7\63\2\2\u0152\u0153\5.\30\2\u0153\u0154\7\64\2\2\u0154"+
		"-\3\2\2\2\u0155\u015c\5N(\2\u0156\u015c\5V,\2\u0157\u015c\5P)\2\u0158"+
		"\u015c\5R*\2\u0159\u015c\5T+\2\u015a\u015c\5\4\3\2\u015b\u0155\3\2\2\2"+
		"\u015b\u0156\3\2\2\2\u015b\u0157\3\2\2\2\u015b\u0158\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e/\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0162\5\62\32"+
		"\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0166\3\2\2\2\u0163\u0164"+
		"\7\63\2\2\u0164\u0166\7\64\2\2\u0165\u0161\3\2\2\2\u0165\u0163\3\2\2\2"+
		"\u0166\61\3\2\2\2\u0167\u016c\5\64\33\2\u0168\u0169\7\66\2\2\u0169\u016b"+
		"\5\64\33\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2"+
		"\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0171"+
		"\7\66\2\2\u0170\u016f\3\2\2\2\u0170\u0171\3\2\2\2\u0171\63\3\2\2\2\u0172"+
		"\u0173\7j\2\2\u0173\u0174\78\2\2\u0174\u0175\5Z.\2\u0175\65\3\2\2\2\u0176"+
		"\u0177\7\25\2\2\u0177\u0178\7\63\2\2\u0178\u0179\7j\2\2\u0179\u017a\7"+
		"\64\2\2\u017a\u017b\7V\2\2\u017b\u017c\7g\2\2\u017c\u0183\7\65\2\2\u017d"+
		"\u017e\7\25\2\2\u017e\u017f\7j\2\2\u017f\u0180\7V\2\2\u0180\u0181\7g\2"+
		"\2\u0181\u0183\7\65\2\2\u0182\u0176\3\2\2\2\u0182\u017d\3\2\2\2\u0183"+
		"\67\3\2\2\2\u0184\u0185\7_\2\2\u0185\u0186\7:\2\2\u0186\u0187\7j\2\2\u0187"+
		"\u018b\7\67\2\2\u0188\u018c\5:\36\2\u0189\u018c\5<\37\2\u018a\u018c\5"+
		"> \2\u018b\u0188\3\2\2\2\u018b\u0189\3\2\2\2\u018b\u018a\3\2\2\2\u018c"+
		"\u018d\3\2\2\2\u018d\u018e\7\65\2\2\u018e9\3\2\2\2\u018f\u0190\7e\2\2"+
		"\u0190\u0191\7j\2\2\u0191\u019a\7\61\2\2\u0192\u0197\5n8\2\u0193\u0194"+
		"\7\66\2\2\u0194\u0196\5n8\2\u0195\u0193\3\2\2\2\u0196\u0199\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u019a\u0192\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\7\62\2\2\u019d;\3\2\2\2\u019e\u01a4\7_\2\2\u019f\u01a2\7:\2\2\u01a0"+
		"\u01a3\7j\2\2\u01a1\u01a3\5r:\2\u01a2\u01a0\3\2\2\2\u01a2\u01a1\3\2\2"+
		"\2\u01a3\u01a5\3\2\2\2\u01a4\u019f\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7=\3\2\2\2\u01a8\u01ab\7j\2\2\u01a9\u01aa"+
		"\7:\2\2\u01aa\u01ac\7j\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac"+
		"?\3\2\2\2\u01ad\u01ae\7X\2\2\u01ae\u01af\7j\2\2\u01af\u01b3\7\63\2\2\u01b0"+
		"\u01b2\5B\"\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2"+
		"\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01b7\7\64\2\2\u01b7\u01b8\7\65\2\2\u01b8A\3\2\2\2\u01b9\u01be\5D#\2"+
		"\u01ba\u01bb\7\66\2\2\u01bb\u01bd\5D#\2\u01bc\u01ba\3\2\2\2\u01bd\u01c0"+
		"\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bfC\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c1\u01c2\7j\2\2\u01c2\u01c3\7\67\2\2\u01c3\u01c4\5Z"+
		".\2\u01c4E\3\2\2\2\u01c5\u01c6\7\33\2\2\u01c6\u01c7\7:\2\2\u01c7\u01c8"+
		"\7\34\2\2\u01c8\u01cc\7\61\2\2\u01c9\u01cd\7j\2\2\u01ca\u01cd\7g\2\2\u01cb"+
		"\u01cd\5Z.\2\u01cc\u01c9\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cb\3\2\2"+
		"\2\u01cd\u01ce\3\2\2\2\u01ce\u01d0\7\62\2\2\u01cf\u01d1\7\65\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1G\3\2\2\2\u01d2\u01d3\7\27\2\2"+
		"\u01d3\u01d4\5,\27\2\u01d4I\3\2\2\2\u01d5\u01d6\7\30\2\2\u01d6\u01d7\7"+
		"\63\2\2\u01d7\u01d8\5.\30\2\u01d8\u01d9\7\64\2\2\u01d9K\3\2\2\2\u01da"+
		"\u01db\t\3\2\2\u01dbM\3\2\2\2\u01dc\u01de\5L\'\2\u01dd\u01dc\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01e1\7M\2\2\u01e0\u01df\3\2"+
		"\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7j\2\2\u01e3"+
		"\u01e4\78\2\2\u01e4\u01e5\5X-\2\u01e5\u01e8\7\67\2\2\u01e6\u01e9\5n8\2"+
		"\u01e7\u01e9\5Z.\2\u01e8\u01e6\3\2\2\2\u01e8\u01e7\3\2\2\2\u01e9\u01ea"+
		"\3\2\2\2\u01ea\u01eb\7\65\2\2\u01eb\u0216\3\2\2\2\u01ec\u01ee\5L\'\2\u01ed"+
		"\u01ec\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01f1\7M"+
		"\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"\u01f3\7j\2\2\u01f3\u01f6\7\67\2\2\u01f4\u01f7\5n8\2\u01f5\u01f7\5Z.\2"+
		"\u01f6\u01f4\3\2\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9"+
		"\7\65\2\2\u01f9\u0216\3\2\2\2\u01fa\u01fc\5L\'\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01ff\7M\2\2\u01fe\u01fd\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7j\2\2\u0201"+
		"\u0202\78\2\2\u0202\u0203\5X-\2\u0203\u0204\7\65\2\2\u0204\u0216\3\2\2"+
		"\2\u0205\u0207\5L\'\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208"+
		"\3\2\2\2\u0208\u0209\7j\2\2\u0209\u020c\7\67\2\2\u020a\u020d\5n8\2\u020b"+
		"\u020d\5Z.\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2"+
		"\2\u020e\u020f\7\65\2\2\u020f\u0216\3\2\2\2\u0210\u0212\5L\'\2\u0211\u0210"+
		"\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7j\2\2\u0214"+
		"\u0216\7\65\2\2\u0215\u01dd\3\2\2\2\u0215\u01ed\3\2\2\2\u0215\u01fb\3"+
		"\2\2\2\u0215\u0206\3\2\2\2\u0215\u0211\3\2\2\2\u0216O\3\2\2\2\u0217\u0219"+
		"\7M\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u021b\7j\2\2\u021b\u021c\78\2\2\u021c\u021d\5X-\2\u021d\u021e\7/\2\2"+
		"\u021e\u021f\7\60\2\2\u021f\u0220\7\67\2\2\u0220\u0229\7/\2\2\u0221\u0226"+
		"\5Z.\2\u0222\u0223\7\66\2\2\u0223\u0225\5Z.\2\u0224\u0222\3\2\2\2\u0225"+
		"\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2"+
		"\2\2\u0228\u0226\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\7\60\2\2\u022c\u022d\7\65\2\2\u022d\u0240\3"+
		"\2\2\2\u022e\u022f\7j\2\2\u022f\u0230\7\67\2\2\u0230\u0232\7/\2\2\u0231"+
		"\u0233\5Z.\2\u0232\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u023a\3\2\2"+
		"\2\u0234\u0236\5Z.\2\u0235\u0237\7\66\2\2\u0236\u0235\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0234\3\2\2\2\u0239\u023c\3\2\2\2\u023a"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2"+
		"\2\2\u023d\u023e\7\60\2\2\u023e\u0240\7\65\2\2\u023f\u0218\3\2\2\2\u023f"+
		"\u022e\3\2\2\2\u0240Q\3\2\2\2\u0241\u0242\7\27\2\2\u0242\u0243\7j\2\2"+
		"\u0243\u024c\7\61\2\2\u0244\u0249\5p9\2\u0245\u0246\7\66\2\2\u0246\u0248"+
		"\5p9\2\u0247\u0245\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u0244\3\2"+
		"\2\2\u024c\u024d\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024f\7\62\2\2\u024f"+
		"\u0252\78\2\2\u0250\u0253\5X-\2\u0251\u0253\7R\2\2\u0252\u0250\3\2\2\2"+
		"\u0252\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\7\65\2\2\u0255S\3"+
		"\2\2\2\u0256\u0257\t\4\2\2\u0257\u0260\7\61\2\2\u0258\u025d\5p9\2\u0259"+
		"\u025a\7\66\2\2\u025a\u025c\5p9\2\u025b\u0259\3\2\2\2\u025c\u025f\3\2"+
		"\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0261\3\2\2\2\u025f"+
		"\u025d\3\2\2\2\u0260\u0258\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262\3\2"+
		"\2\2\u0262\u0265\7\62\2\2\u0263\u0264\78\2\2\u0264\u0266\5X-\2\u0265\u0263"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\3\2\2\2\u0267\u026b\7\63\2\2"+
		"\u0268\u026a\5\4\3\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e"+
		"\u026f\7\64\2\2\u026fU\3\2\2\2\u0270\u0272\5L\'\2\u0271\u0270\3\2\2\2"+
		"\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\7j\2\2\u0274\u0275"+
		"\78\2\2\u0275\u0276\7j\2\2\u0276\u0291\7\65\2\2\u0277\u0279\5L\'\2\u0278"+
		"\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\7j"+
		"\2\2\u027b\u027c\78\2\2\u027c\u027d\7j\2\2\u027d\u027e\7\67\2\2\u027e"+
		"\u027f\7e\2\2\u027f\u0280\7j\2\2\u0280\u028b\7\61\2\2\u0281\u0286\5Z."+
		"\2\u0282\u0283\7\66\2\2\u0283\u0285\5Z.\2\u0284\u0282\3\2\2\2\u0285\u0288"+
		"\3\2\2\2\u0286\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u028a\3\2\2\2\u0288"+
		"\u0286\3\2\2\2\u0289\u0281\3\2\2\2\u028a\u028d\3\2\2\2\u028b\u0289\3\2"+
		"\2\2\u028b\u028c\3\2\2\2\u028c\u028e\3\2\2\2\u028d\u028b\3\2\2\2\u028e"+
		"\u028f\7\62\2\2\u028f\u0291\7\65\2\2\u0290\u0271\3\2\2\2\u0290\u0278\3"+
		"\2\2\2\u0291W\3\2\2\2\u0292\u0293\t\5\2\2\u0293Y\3\2\2\2\u0294\u029d\7"+
		"f\2\2\u0295\u029d\7g\2\2\u0296\u029d\7h\2\2\u0297\u029d\5^\60\2\u0298"+
		"\u029d\5\\/\2\u0299\u029d\7W\2\2\u029a\u029d\5t;\2\u029b\u029d\5\u0084"+
		"C\2\u029c\u0294\3\2\2\2\u029c\u0295\3\2\2\2\u029c\u0296\3\2\2\2\u029c"+
		"\u0297\3\2\2\2\u029c\u0298\3\2\2\2\u029c\u0299\3\2\2\2\u029c\u029a\3\2"+
		"\2\2\u029c\u029b\3\2\2\2\u029d[\3\2\2\2\u029e\u029f\7\63\2\2\u029f\u02a0"+
		"\7j\2\2\u02a0\u02a1\78\2\2\u02a1\u02ac\5Z.\2\u02a2\u02a3\7\66\2\2\u02a3"+
		"\u02a4\7j\2\2\u02a4\u02a5\78\2\2\u02a5\u02a6\5Z.\2\u02a6\u02a8\3\2\2\2"+
		"\u02a7\u02a9\7\66\2\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab"+
		"\3\2\2\2\u02aa\u02a2\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac"+
		"\u02ad\3\2\2\2\u02ad\u02af\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b0\7\64"+
		"\2\2\u02b0]\3\2\2\2\u02b1\u02b6\7/\2\2\u02b2\u02b5\7j\2\2\u02b3\u02b5"+
		"\5Z.\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b8\3\2\2\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02c0\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b9\u02bc\7\66\2\2\u02ba\u02bd\7j\2\2\u02bb\u02bd\5Z.\2\u02bc\u02ba"+
		"\3\2\2\2\u02bc\u02bb\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02b9\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c4\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\7\66\2\2\u02c4\u02c3\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\7\60\2\2\u02c7_\3\2\2\2"+
		"\u02c8\u02c9\7j\2\2\u02c9\u02ca\7\67\2\2\u02ca\u02cf\5n8\2\u02cb\u02cc"+
		"\7\66\2\2\u02cc\u02ce\5n8\2\u02cd\u02cb\3\2\2\2\u02ce\u02d1\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cf\3\2"+
		"\2\2\u02d2\u02d3\7\65\2\2\u02d3\u02eb\3\2\2\2\u02d4\u02d5\7_\2\2\u02d5"+
		"\u02d6\7:\2\2\u02d6\u02d7\7j\2\2\u02d7\u02d8\7\67\2\2\u02d8\u02d9\5n8"+
		"\2\u02d9\u02da\7\65\2\2\u02da\u02eb\3\2\2\2\u02db\u02dc\7j\2\2\u02dc\u02dd"+
		"\7\67\2\2\u02dd\u02e6\7/\2\2\u02de\u02e3\5Z.\2\u02df\u02e0\7\66\2\2\u02e0"+
		"\u02e2\5Z.\2\u02e1\u02df\3\2\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2"+
		"\2\u02e3\u02e4\3\2\2\2\u02e4\u02e7\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02de"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02e9\7\60\2\2"+
		"\u02e9\u02eb\7\65\2\2\u02ea\u02c8\3\2\2\2\u02ea\u02d4\3\2\2\2\u02ea\u02db"+
		"\3\2\2\2\u02eba\3\2\2\2\u02ec\u02ed\7N\2\2\u02ed\u02ee\7\61\2\2\u02ee"+
		"\u02ef\5n8\2\u02ef\u02f0\7\62\2\2\u02f0\u02f4\5l\67\2\u02f1\u02f3\5f\64"+
		"\2\u02f2\u02f1\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f4\u02f5"+
		"\3\2\2\2\u02f5\u02f9\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02f8\7O\2\2\u02f8"+
		"\u02fa\5l\67\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fac\3\2\2\2"+
		"\u02fb\u02fc\7P\2\2\u02fc\u02fd\7\61\2\2\u02fd\u02fe\5n8\2\u02fe\u02ff"+
		"\7\62\2\2\u02ff\u0300\5l\67\2\u0300e\3\2\2\2\u0301\u0302\7O\2\2\u0302"+
		"\u0303\7N\2\2\u0303\u0304\7\61\2\2\u0304\u0305\5n8\2\u0305\u0306\7\62"+
		"\2\2\u0306\u0307\5l\67\2\u0307g\3\2\2\2\u0308\u0309\7Q\2\2\u0309\u030a"+
		"\7\65\2\2\u030ai\3\2\2\2\u030b\u030c\7S\2\2\u030c\u030d\7\65\2\2\u030d"+
		"k\3\2\2\2\u030e\u0312\7\63\2\2\u030f\u0311\5\4\3\2\u0310\u030f\3\2\2\2"+
		"\u0311\u0314\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315"+
		"\3\2\2\2\u0314\u0312\3\2\2\2\u0315\u0316\7\64\2\2\u0316m\3\2\2\2\u0317"+
		"\u0318\b8\1\2\u0318\u0319\7\61\2\2\u0319\u031a\5n8\2\u031a\u031b\7\62"+
		"\2\2\u031b\u034b\3\2\2\2\u031c\u031d\7j\2\2\u031d\u031e\7/\2\2\u031e\u031f"+
		"\5n8\2\u031f\u0320\7\60\2\2\u0320\u034b\3\2\2\2\u0321\u0322\7K\2\2\u0322"+
		"\u0323\5n8\2\u0323\u0324\7L\2\2\u0324\u034b\3\2\2\2\u0325\u0326\7_\2\2"+
		"\u0326\u0327\7:\2\2\u0327\u0328\7j\2\2\u0328\u0329\7:\2\2\u0329\u032a"+
		"\7j\2\2\u032a\u0333\7\61\2\2\u032b\u0330\5n8\2\u032c\u032d\7\66\2\2\u032d"+
		"\u032f\5n8\2\u032e\u032c\3\2\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2"+
		"\2\u0330\u0331\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u032b"+
		"\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u034b\7\62\2\2"+
		"\u0336\u0337\7j\2\2\u0337\u0338\7[\2\2\u0338\u034b\5n8\n\u0339\u033a\7"+
		"j\2\2\u033a\u033b\7[\2\2\u033b\u034b\7j\2\2\u033c\u033d\7_\2\2\u033d\u033e"+
		"\7:\2\2\u033e\u033f\7j\2\2\u033f\u0340\7\67\2\2\u0340\u034b\5n8\b\u0341"+
		"\u0342\7_\2\2\u0342\u0343\7:\2\2\u0343\u034b\7j\2\2\u0344\u0345\7j\2\2"+
		"\u0345\u0346\7:\2\2\u0346\u034b\7j\2\2\u0347\u034b\5Z.\2\u0348\u034b\7"+
		"j\2\2\u0349\u034b\5t;\2\u034a\u0317\3\2\2\2\u034a\u031c\3\2\2\2\u034a"+
		"\u0321\3\2\2\2\u034a\u0325\3\2\2\2\u034a\u0336\3\2\2\2\u034a\u0339\3\2"+
		"\2\2\u034a\u033c\3\2\2\2\u034a\u0341\3\2\2\2\u034a\u0344\3\2\2\2\u034a"+
		"\u0347\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034b\u0391\3\2"+
		"\2\2\u034c\u034d\f\36\2\2\u034d\u034e\7=\2\2\u034e\u0390\5n8\37\u034f"+
		"\u0350\f\35\2\2\u0350\u0351\7?\2\2\u0351\u0390\5n8\36\u0352\u0353\f\34"+
		"\2\2\u0353\u0354\7@\2\2\u0354\u0390\5n8\35\u0355\u0356\f\33\2\2\u0356"+
		"\u0357\7;\2\2\u0357\u0390\5n8\34\u0358\u0359\f\32\2\2\u0359\u035a\7<\2"+
		"\2\u035a\u0390\5n8\33\u035b\u035c\f\31\2\2\u035c\u035d\7B\2\2\u035d\u0390"+
		"\5n8\32\u035e\u035f\f\30\2\2\u035f\u0360\7C\2\2\u0360\u0390\5n8\31\u0361"+
		"\u0362\f\27\2\2\u0362\u0363\7D\2\2\u0363\u0390\5n8\30\u0364\u0365\f\26"+
		"\2\2\u0365\u0366\7E\2\2\u0366\u0390\5n8\27\u0367\u0368\f\25\2\2\u0368"+
		"\u0369\7G\2\2\u0369\u0390\5n8\26\u036a\u036b\f\24\2\2\u036b\u036c\7H\2"+
		"\2\u036c\u0390\5n8\25\u036d\u036e\f\23\2\2\u036e\u036f\7F\2\2\u036f\u0390"+
		"\5n8\24\u0370\u0371\f\22\2\2\u0371\u0372\7I\2\2\u0372\u0390\5n8\23\u0373"+
		"\u0374\f\21\2\2\u0374\u0375\7J\2\2\u0375\u0390\5n8\22\u0376\u0377\f\r"+
		"\2\2\u0377\u0378\7:\2\2\u0378\u0379\7j\2\2\u0379\u0382\7\61\2\2\u037a"+
		"\u037f\5n8\2\u037b\u037c\7\66\2\2\u037c\u037e\5n8\2\u037d\u037b\3\2\2"+
		"\2\u037e\u0381\3\2\2\2\u037f\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0383"+
		"\3\2\2\2\u0381\u037f\3\2\2\2\u0382\u037a\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0390\7\62\2\2\u0385\u0386\f\13\2\2\u0386\u0387\7"+
		":\2\2\u0387\u0388\7j\2\2\u0388\u0389\7\61\2\2\u0389\u038a\7j\2\2\u038a"+
		"\u038b\7[\2\2\u038b\u038c\5n8\2\u038c\u038d\3\2\2\2\u038d\u038e\7\62\2"+
		"\2\u038e\u0390\3\2\2\2\u038f\u034c\3\2\2\2\u038f\u034f\3\2\2\2\u038f\u0352"+
		"\3\2\2\2\u038f\u0355\3\2\2\2\u038f\u0358\3\2\2\2\u038f\u035b\3\2\2\2\u038f"+
		"\u035e\3\2\2\2\u038f\u0361\3\2\2\2\u038f\u0364\3\2\2\2\u038f\u0367\3\2"+
		"\2\2\u038f\u036a\3\2\2\2\u038f\u036d\3\2\2\2\u038f\u0370\3\2\2\2\u038f"+
		"\u0373\3\2\2\2\u038f\u0376\3\2\2\2\u038f\u0385\3\2\2\2\u0390\u0393\3\2"+
		"\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392o\3\2\2\2\u0393\u0391"+
		"\3\2\2\2\u0394\u0395\7j\2\2\u0395\u0396\78\2\2\u0396\u039f\5X-\2\u0397"+
		"\u0398\7j\2\2\u0398\u0399\78\2\2\u0399\u039a\5X-\2\u039a\u039b\7\67\2"+
		"\2\u039b\u039c\5Z.\2\u039c\u039f\3\2\2\2\u039d\u039f\7j\2\2\u039e\u0394"+
		"\3\2\2\2\u039e\u0397\3\2\2\2\u039e\u039d\3\2\2\2\u039fq\3\2\2\2\u03a0"+
		"\u03a1\7j\2\2\u03a1\u03aa\7\61\2\2\u03a2\u03a7\5n8\2\u03a3\u03a4\7\66"+
		"\2\2\u03a4\u03a6\5n8\2\u03a5\u03a3\3\2\2\2\u03a6\u03a9\3\2\2\2\u03a7\u03a5"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03ab\3\2\2\2\u03a9\u03a7\3\2\2\2\u03aa"+
		"\u03a2\3\2\2\2\u03aa\u03ab\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ad\7\62"+
		"\2\2\u03ads\3\2\2\2\u03ae\u03af\7i\2\2\u03af\u03b0\5v<\2\u03b0\u03b1\7"+
		"i\2\2\u03b1u\3\2\2\2\u03b2\u03b4\5x=\2\u03b3\u03b2\3\2\2\2\u03b4\u03b5"+
		"\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03c9\3\2\2\2\u03b7"+
		"\u03b8\7K\2\2\u03b8\u03b9\5n8\2\u03b9\u03ba\7L\2\2\u03ba\u03c9\3\2\2\2"+
		"\u03bb\u03bd\7f\2\2\u03bc\u03bb\3\2\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc"+
		"\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1"+
		"\u03c5\7j\2\2\u03c2\u03c4\7f\2\2\u03c3\u03c2\3\2\2\2\u03c4\u03c7\3\2\2"+
		"\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c9\3\2\2\2\u03c7\u03c5"+
		"\3\2\2\2\u03c8\u03b3\3\2\2\2\u03c8\u03b7\3\2\2\2\u03c8\u03be\3\2\2\2\u03c9"+
		"\u03ca\3\2\2\2\u03ca\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cbw\3\2\2\2"+
		"\u03cc\u03cd\7B\2\2\u03cd\u03cf\5z>\2\u03ce\u03d0\5|?\2\u03cf\u03ce\3"+
		"\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\7C\2\2\u03d2"+
		"\u03d4\5v<\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2"+
		"\2\u03d5\u03d6\7B\2\2\u03d6\u03d7\7?\2\2\u03d7\u03d8\5z>\2\u03d8\u03d9"+
		"\7C\2\2\u03d9\u03e8\3\2\2\2\u03da\u03db\7B\2\2\u03db\u03dd\5z>\2\u03dc"+
		"\u03de\5|?\2\u03dd\u03dc\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\3\2\2"+
		"\2\u03df\u03e0\7C\2\2\u03e0\u03e8\3\2\2\2\u03e1\u03e2\7B\2\2\u03e2\u03e3"+
		"\5z>\2\u03e3\u03e4\5|?\2\u03e4\u03e5\7?\2\2\u03e5\u03e6\7C\2\2\u03e6\u03e8"+
		"\3\2\2\2\u03e7\u03cc\3\2\2\2\u03e7\u03da\3\2\2\2\u03e7\u03e1\3\2\2\2\u03e8"+
		"y\3\2\2\2\u03e9\u03ea\7j\2\2\u03ea{\3\2\2\2\u03eb\u03ed\5~@\2\u03ec\u03eb"+
		"\3\2\2\2\u03ed\u03f0\3\2\2\2\u03ee\u03ec\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef"+
		"}\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f1\u0407\7j\2\2\u03f2\u0407\5\u009cO"+
		"\2\u03f3\u0407\5\u009aN\2\u03f4\u0407\5\u008cG\2\u03f5\u0407\5\u008eH"+
		"\2\u03f6\u03ff\7/\2\2\u03f7\u0400\7j\2\2\u03f8\u03fc\7j\2\2\u03f9\u03fb"+
		"\5\u0080A\2\u03fa\u03f9\3\2\2\2\u03fb\u03fe\3\2\2\2\u03fc\u03fa\3\2\2"+
		"\2\u03fc\u03fd\3\2\2\2\u03fd\u0400\3\2\2\2\u03fe\u03fc\3\2\2\2\u03ff\u03f7"+
		"\3\2\2\2\u03ff\u03f8\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0407\7\60\2\2"+
		"\u0402\u0403\7\61\2\2\u0403\u0404\7j\2\2\u0404\u0407\7\62\2\2\u0405\u0407"+
		"\7=\2\2\u0406\u03f1\3\2\2\2\u0406\u03f2\3\2\2\2\u0406\u03f3\3\2\2\2\u0406"+
		"\u03f4\3\2\2\2\u0406\u03f5\3\2\2\2\u0406\u03f6\3\2\2\2\u0406\u0402\3\2"+
		"\2\2\u0406\u0405\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0409\7\67\2\2\u0409"+
		"\u040b\5\u0082B\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\177\3"+
		"\2\2\2\u040c\u040d\7:\2\2\u040d\u0415\7j\2\2\u040e\u040f\7/\2\2\u040f"+
		"\u0410\5n8\2\u0410\u0411\7\60\2\2\u0411\u0415\3\2\2\2\u0412\u0413\7:\2"+
		"\2\u0413\u0415\5r:\2\u0414\u040c\3\2\2\2\u0414\u040e\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0415\u0081\3\2\2\2\u0416\u0419\5Z.\2\u0417\u0419\5n8\2\u0418"+
		"\u0416\3\2\2\2\u0418\u0417\3\2\2\2\u0419\u0083\3\2\2\2\u041a\u041b\7/"+
		"\2\2\u041b\u041f\7i\2\2\u041c\u041e\5\u0086D\2\u041d\u041c\3\2\2\2\u041e"+
		"\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0422\3\2"+
		"\2\2\u0421\u041f\3\2\2\2\u0422\u0423\7i\2\2\u0423\u0424\7\60\2\2\u0424"+
		"\u0085\3\2\2\2\u0425\u0427\7:\2\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2"+
		"\2\2\u0427\u0428\3\2\2\2\u0428\u042d\7j\2\2\u0429\u042a\78\2\2\u042a\u042c"+
		"\7j\2\2\u042b\u0429\3\2\2\2\u042c\u042f\3\2\2\2\u042d\u042b\3\2\2\2\u042d"+
		"\u042e\3\2\2\2\u042e\u0430\3\2\2\2\u042f\u042d\3\2\2\2\u0430\u0434\7\63"+
		"\2\2\u0431\u0433\5\u0088E\2\u0432\u0431\3\2\2\2\u0433\u0436\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0434\u0435\3\2\2\2\u0435\u0437\3\2\2\2\u0436\u0434\3\2"+
		"\2\2\u0437\u0438\7\64\2\2\u0438\u0087\3\2\2\2\u0439\u043a\7j\2\2\u043a"+
		"\u0441\78\2\2\u043b\u0442\7j\2\2\u043c\u043e\7f\2\2\u043d\u043f\t\6\2"+
		"\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0442\3\2\2\2\u0440\u0442"+
		"\5r:\2\u0441\u043b\3\2\2\2\u0441\u043c\3\2\2\2\u0441\u0440\3\2\2\2\u0442"+
		"\u0443\3\2\2\2\u0443\u0441\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0452\3\2"+
		"\2\2\u0445\u044c\7\66\2\2\u0446\u044d\7j\2\2\u0447\u0449\7f\2\2\u0448"+
		"\u044a\t\6\2\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044d\3\2"+
		"\2\2\u044b\u044d\5r:\2\u044c\u0446\3\2\2\2\u044c\u0447\3\2\2\2\u044c\u044b"+
		"\3\2\2\2\u044d\u044e\3\2\2\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f"+
		"\u0451\3\2\2\2\u0450\u0445\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2"+
		"\2\2\u0452\u0453\3\2\2\2\u0453\u0455\3\2\2\2\u0454\u0452\3\2\2\2\u0455"+
		"\u0456\7\65\2\2\u0456\u0089\3\2\2\2\u0457\u0458\7%\2\2\u0458\u0459\7\67"+
		"\2\2\u0459\u045a\7\63\2\2\u045a\u045b\5n8\2\u045b\u045c\7\64\2\2\u045c"+
		"\u008b\3\2\2\2\u045d\u045e\7\61\2\2\u045e\u045f\7(\2\2\u045f\u0460\7\62"+
		"\2\2\u0460\u0461\7\67\2\2\u0461\u0462\7g\2\2\u0462\u008d\3\2\2\2\u0463"+
		"\u0464\7\61\2\2\u0464\u0465\7)\2\2\u0465\u0466\7\62\2\2\u0466\u0467\7"+
		"\67\2\2\u0467\u0468\7g\2\2\u0468\u008f\3\2\2\2\u0469\u046a\7\61\2\2\u046a"+
		"\u046b\7\'\2\2\u046b\u046c\7\62\2\2\u046c\u046d\7\67\2\2\u046d\u046e\7"+
		"g\2\2\u046e\u0091\3\2\2\2\u046f\u0470\7.\2\2\u0470\u0471\7\67\2\2\u0471"+
		"\u0472\7\63\2\2\u0472\u0473\5n8\2\u0473\u0474\7\64\2\2\u0474\u0093\3\2"+
		"\2\2\u0475\u0476\7+\2\2\u0476\u0477\7\67\2\2\u0477\u0478\7g\2\2\u0478"+
		"\u0095\3\2\2\2\u0479\u047a\7,\2\2\u047a\u047b\7\67\2\2\u047b\u047c\7g"+
		"\2\2\u047c\u0097\3\2\2\2\u047d\u047e\7-\2\2\u047e\u047f\7\67\2\2\u047f"+
		"\u0480\t\7\2\2\u0480\u0099\3\2\2\2\u0481\u0482\7\4\2\2\u0482\u0483\7\67"+
		"\2\2\u0483\u0484\5n8\2\u0484\u009b\3\2\2\2\u0485\u0486\7\3\2\2\u0486\u0487"+
		"\7\67\2\2\u0487\u0488\5n8\2\u0488\u009d\3\2\2\2u\u00a1\u00bd\u00c2\u00cd"+
		"\u00d8\u00dc\u00f5\u00f8\u00ff\u0115\u011d\u0136\u0139\u0143\u014d\u015b"+
		"\u015d\u0161\u0165\u016c\u0170\u0182\u018b\u0197\u019a\u01a2\u01a6\u01ab"+
		"\u01b3\u01be\u01cc\u01d0\u01dd\u01e0\u01e8\u01ed\u01f0\u01f6\u01fb\u01fe"+
		"\u0206\u020c\u0211\u0215\u0218\u0226\u0229\u0232\u0236\u023a\u023f\u0249"+
		"\u024c\u0252\u025d\u0260\u0265\u026b\u0271\u0278\u0286\u028b\u0290\u029c"+
		"\u02a8\u02ac\u02b4\u02b6\u02bc\u02c0\u02c4\u02cf\u02e3\u02e6\u02ea\u02f4"+
		"\u02f9\u0312\u0330\u0333\u034a\u037f\u0382\u038f\u0391\u039e\u03a7\u03aa"+
		"\u03b5\u03be\u03c5\u03c8\u03ca\u03cf\u03d3\u03dd\u03e7\u03ee\u03fc\u03ff"+
		"\u0406\u040a\u0414\u0418\u041f\u0426\u042d\u0434\u043e\u0441\u0443\u0449"+
		"\u044c\u044e\u0452";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}