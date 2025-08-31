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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (AngularExpressionStart - 66)) | (1L << (Let_Identify - 66)) | (1L << (If - 66)) | (1L << (While - 66)) | (1L << (Break - 66)) | (1L << (Continue - 66)) | (1L << (Null - 66)) | (1L << (Enum - 66)) | (1L << (This - 66)) | (1L << (Constructor - 66)) | (1L << (Private - 66)) | (1L << (Public - 66)) | (1L << (Static - 66)) | (1L << (Protected - 66)) | (1L << (NumberLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (Backtick - 66)) | (1L << (Identifier - 66)))) != 0)) {
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
			setState(240);
			match(Identifier);
			setState(241);
			match(OpenParen);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenParen - 47)) | (1L << (OpenBrace - 47)) | (1L << (AngularExpressionStart - 47)) | (1L << (Null - 47)) | (1L << (This - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenParen - 47)) | (1L << (OpenBrace - 47)) | (1L << (AngularExpressionStart - 47)) | (1L << (Null - 47)) | (1L << (This - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (AngularExpressionStart - 66)) | (1L << (Let_Identify - 66)) | (1L << (If - 66)) | (1L << (While - 66)) | (1L << (Break - 66)) | (1L << (Continue - 66)) | (1L << (Null - 66)) | (1L << (Enum - 66)) | (1L << (This - 66)) | (1L << (Constructor - 66)) | (1L << (Private - 66)) | (1L << (Public - 66)) | (1L << (Static - 66)) | (1L << (Protected - 66)) | (1L << (NumberLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (Backtick - 66)) | (1L << (Identifier - 66)))) != 0)) {
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
			setState(444);
			match(New);
			setState(445);
			match(Identifier);
			setState(446);
			match(OpenParen);
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenParen - 47)) | (1L << (OpenBrace - 47)) | (1L << (AngularExpressionStart - 47)) | (1L << (Null - 47)) | (1L << (This - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
			setState(519);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) ) {
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
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenBrace - 47)) | (1L << (Null - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)))) != 0)) {
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
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenBrace - 47)) | (1L << (Null - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (AngularExpressionStart - 66)) | (1L << (Let_Identify - 66)) | (1L << (If - 66)) | (1L << (While - 66)) | (1L << (Break - 66)) | (1L << (Continue - 66)) | (1L << (Null - 66)) | (1L << (Enum - 66)) | (1L << (This - 66)) | (1L << (Constructor - 66)) | (1L << (Private - 66)) | (1L << (Public - 66)) | (1L << (Static - 66)) | (1L << (Protected - 66)) | (1L << (NumberLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (Backtick - 66)) | (1L << (Identifier - 66)))) != 0)) {
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
			setState(704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				if (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Private - 98)) | (1L << (Public - 98)) | (1L << (Static - 98)) | (1L << (Protected - 98)))) != 0)) {
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
				while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenBrace - 47)) | (1L << (Null - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)))) != 0)) {
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
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (Array - 90)) | (1L << (Any - 90)) | (1L << (TypeNumber - 90)) | (1L << (TypeString - 90)) | (1L << (TypeBoolean - 90)) | (1L << (Identifier - 90)))) != 0)) ) {
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
		public TemplateStringContext templateString() {
			return getRuleContext(TemplateStringContext.class,0);
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
			setState(738);
			match(OpenBracket);
			setState(743);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenBrace - 47)) | (1L << (Null - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenBrace - 47)) | (1L << (Null - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)))) != 0)) {
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
			setState(834);
			match(OpenBrace);
			setState(838);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Abstract) | (1L << Console) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (AngularExpressionStart - 66)) | (1L << (Let_Identify - 66)) | (1L << (If - 66)) | (1L << (While - 66)) | (1L << (Break - 66)) | (1L << (Continue - 66)) | (1L << (Null - 66)) | (1L << (Enum - 66)) | (1L << (This - 66)) | (1L << (Constructor - 66)) | (1L << (Private - 66)) | (1L << (Public - 66)) | (1L << (Static - 66)) | (1L << (Protected - 66)) | (1L << (NumberLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (Backtick - 66)) | (1L << (Identifier - 66)))) != 0)) {
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
	public static class DdContext extends ExpressionContext {
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public DdContext(ExpressionContext ctx) { copyFrom(ctx); }
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
				if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenParen - 47)) | (1L << (OpenBrace - 47)) | (1L << (AngularExpressionStart - 47)) | (1L << (Null - 47)) | (1L << (This - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
						if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenParen - 47)) | (1L << (OpenBrace - 47)) | (1L << (AngularExpressionStart - 47)) | (1L << (Null - 47)) | (1L << (This - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
			setState(980);
			match(Identifier);
			setState(981);
			match(OpenParen);
			setState(990);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & ((1L << (OpenBracket - 47)) | (1L << (OpenParen - 47)) | (1L << (OpenBrace - 47)) | (1L << (AngularExpressionStart - 47)) | (1L << (Null - 47)) | (1L << (This - 47)) | (1L << (NumberLiteral - 47)) | (1L << (StringLiteral - 47)) | (1L << (BooleanLiteral - 47)) | (1L << (Backtick - 47)) | (1L << (Identifier - 47)))) != 0)) {
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
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NgIfDirective) | (1L << NgForDirective) | (1L << Name) | (1L << Id) | (1L << Src) | (1L << Alt) | (1L << Class) | (1L << TypeAttributeName) | (1L << LabelAttributeName) | (1L << ValueAttributeName) | (1L << PlaceHolderAttributeName) | (1L << CheckedAttributeName) | (1L << TargetAttributeName) | (1L << HeadingLevelAttributeName) | (1L << DirectionAttributeName) | (1L << DurationAttributeName) | (1L << RepeatAttributeName) | (1L << GapAttributeName) | (1L << OpenBracket) | (1L << OpenParen) | (1L << Multiply))) != 0) || ((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (NumberLiteral - 103)) | (1L << (StringLiteral - 103)) | (1L << (Identifier - 103)))) != 0)) {
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
			} while ( ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (LessThan - 66)) | (1L << (AngularExpressionStart - 66)) | (1L << (NumberLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3q\u04de\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\7\2\u00a4\n\2"+
		"\f\2\16\2\u00a7\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00c2\n\3\3\4\3"+
		"\4\3\4\5\4\u00c7\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00d2\n\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00dd\n\6\3\7\3\7\5\7\u00e1\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u00f8\n\n\f\n\16\n\u00fb\13\n\5\n\u00fd\n\n\3\n\3"+
		"\n\3\13\3\13\3\13\5\13\u0104\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u0118\n\17\f\17"+
		"\16\17\u011b\13\17\3\17\3\17\3\20\3\20\3\20\5\20\u0122\n\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0139\n\24\f\24\16\24\u013c\13\24\5\24"+
		"\u013e\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0148\n\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\5\26\u0152\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0160\n\30\f\30\16"+
		"\30\u0163\13\30\3\31\5\31\u0166\n\31\3\31\3\31\5\31\u016a\n\31\3\32\3"+
		"\32\3\32\7\32\u016f\n\32\f\32\16\32\u0172\13\32\3\32\5\32\u0175\n\32\3"+
		"\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\7\34\u0180\n\34\f\34\16\34"+
		"\u0183\13\34\3\34\3\34\3\34\3\34\5\34\u0189\n\34\3\34\3\34\3\34\3\34\3"+
		"\34\5\34\u0190\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0199\n\34"+
		"\3\34\3\34\3\34\5\34\u019e\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u01a7\n\34\f\34\16\34\u01aa\13\34\3\34\3\34\3\34\3\34\5\34\u01b0\n\34"+
		"\5\34\u01b2\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01bb\n\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01c5\n\36\f\36\16\36\u01c8"+
		"\13\36\5\36\u01ca\n\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01d2\n\37\6"+
		"\37\u01d4\n\37\r\37\16\37\u01d5\3 \3 \3 \5 \u01db\n \3!\3!\3!\3!\7!\u01e1"+
		"\n!\f!\16!\u01e4\13!\3!\3!\3!\3\"\3\"\3\"\7\"\u01ec\n\"\f\"\16\"\u01ef"+
		"\13\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01fc\n$\3$\3$\5$\u0200\n$\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3(\5(\u020d\n(\3(\5(\u0210\n(\3(\3(\3("+
		"\3(\3(\3(\3(\5(\u0219\n(\3(\3(\3(\5(\u021e\n(\3(\5(\u0221\n(\3(\3(\3("+
		"\3(\3(\5(\u0228\n(\3(\3(\3(\5(\u022d\n(\3(\5(\u0230\n(\3(\3(\3(\3(\3("+
		"\3(\5(\u0238\n(\3(\3(\3(\3(\3(\5(\u023f\n(\3(\3(\3(\5(\u0244\n(\3(\3("+
		"\5(\u0248\n(\3)\5)\u024b\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0257\n)"+
		"\f)\16)\u025a\13)\5)\u025c\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0265\n)\3)\3)\5"+
		")\u0269\n)\7)\u026b\n)\f)\16)\u026e\13)\3)\3)\5)\u0272\n)\3*\3*\3*\3*"+
		"\3*\3*\7*\u027a\n*\f*\16*\u027d\13*\5*\u027f\n*\3*\3*\3*\3*\5*\u0285\n"+
		"*\3*\3*\3+\3+\3+\3+\3+\7+\u028e\n+\f+\16+\u0291\13+\5+\u0293\n+\3+\3+"+
		"\3+\5+\u0298\n+\3+\3+\7+\u029c\n+\f+\16+\u029f\13+\3+\3+\3,\5,\u02a4\n"+
		",\3,\3,\3,\3,\3,\5,\u02ab\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u02b7\n"+
		",\f,\16,\u02ba\13,\7,\u02bc\n,\f,\16,\u02bf\13,\3,\3,\5,\u02c3\n,\3-\3"+
		"-\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u02d0\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3"+
		"/\5/\u02dc\n/\7/\u02de\n/\f/\16/\u02e1\13/\3/\3/\3\60\3\60\3\60\7\60\u02e8"+
		"\n\60\f\60\16\60\u02eb\13\60\3\60\3\60\3\60\5\60\u02f0\n\60\7\60\u02f2"+
		"\n\60\f\60\16\60\u02f5\13\60\3\60\5\60\u02f8\n\60\3\60\3\60\3\61\3\61"+
		"\3\61\3\61\5\61\u0300\n\61\3\61\3\61\7\61\u0304\n\61\f\61\16\61\u0307"+
		"\13\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u0318\n\61\f\61\16\61\u031b\13\61\5\61\u031d\n\61\3\61"+
		"\3\61\5\61\u0321\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0329\n\62\f"+
		"\62\16\62\u032c\13\62\3\62\3\62\5\62\u0330\n\62\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3"+
		"\66\3\67\3\67\7\67\u0347\n\67\f\67\16\67\u034a\13\67\3\67\3\67\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u0365"+
		"\n8\f8\168\u0368\138\58\u036a\n8\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\58\u0381\n8\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u03b4\n8\f8\168\u03b7"+
		"\138\58\u03b9\n8\38\38\38\38\38\38\38\38\38\38\38\78\u03c6\n8\f8\168\u03c9"+
		"\138\39\39\39\39\39\39\39\39\39\39\59\u03d5\n9\3:\3:\3:\3:\3:\7:\u03dc"+
		"\n:\f:\16:\u03df\13:\5:\u03e1\n:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3"+
		"<\3<\6<\u03f1\n<\r<\16<\u03f2\3=\3=\3=\5=\u03f8\n=\3=\3=\3=\3=\3=\3=\3"+
		"=\3=\3=\3=\5=\u0404\n=\3=\3=\5=\u0408\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3"+
		"=\5=\u0414\n=\3>\3>\3?\7?\u0419\n?\f?\16?\u041c\13?\3@\3@\3@\3@\3@\3@"+
		"\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0437\n@"+
		"\f@\16@\u043a\13@\5@\u043c\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0448\n"+
		"@\3@\3@\5@\u044c\n@\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0456\nA\3B\3B\3B\3B\5"+
		"B\u045c\nB\3C\3C\3C\7C\u0461\nC\fC\16C\u0464\13C\3C\3C\3C\3D\5D\u046a"+
		"\nD\3D\3D\3D\7D\u046f\nD\fD\16D\u0472\13D\3D\3D\7D\u0476\nD\fD\16D\u0479"+
		"\13D\3D\3D\3E\3E\3E\3E\3E\5E\u0482\nE\3E\6E\u0485\nE\rE\16E\u0486\3E\3"+
		"E\3E\3E\5E\u048d\nE\3E\6E\u0490\nE\rE\16E\u0491\7E\u0494\nE\fE\16E\u0497"+
		"\13E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3"+
		"I\3I\3I\3I\3I\3J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3"+
		"N\3N\3N\3N\3O\3O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\6Q\u04da"+
		"\nQ\rQ\16Q\u04db\3Q\2\3nR\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\2\b\4\2\21\21\36\36\3\2dg\4\2ccmm\5\2\\]_amm\4\2BBnn\3\2"+
		"ij\2\u0578\2\u00a5\3\2\2\2\4\u00c1\3\2\2\2\6\u00c6\3\2\2\2\b\u00d1\3\2"+
		"\2\2\n\u00dc\3\2\2\2\f\u00e0\3\2\2\2\16\u00e2\3\2\2\2\20\u00ea\3\2\2\2"+
		"\22\u00f2\3\2\2\2\24\u0103\3\2\2\2\26\u0105\3\2\2\2\30\u0109\3\2\2\2\32"+
		"\u010b\3\2\2\2\34\u0113\3\2\2\2\36\u0121\3\2\2\2 \u0123\3\2\2\2\"\u0129"+
		"\3\2\2\2$\u012d\3\2\2\2&\u0131\3\2\2\2(\u0142\3\2\2\2*\u0151\3\2\2\2,"+
		"\u0153\3\2\2\2.\u0161\3\2\2\2\60\u0169\3\2\2\2\62\u016b\3\2\2\2\64\u0176"+
		"\3\2\2\2\66\u01b1\3\2\2\28\u01b3\3\2\2\2:\u01be\3\2\2\2<\u01cd\3\2\2\2"+
		">\u01d7\3\2\2\2@\u01dc\3\2\2\2B\u01e8\3\2\2\2D\u01f0\3\2\2\2F\u01f4\3"+
		"\2\2\2H\u0201\3\2\2\2J\u0204\3\2\2\2L\u0209\3\2\2\2N\u0247\3\2\2\2P\u0271"+
		"\3\2\2\2R\u0273\3\2\2\2T\u0288\3\2\2\2V\u02c2\3\2\2\2X\u02c4\3\2\2\2Z"+
		"\u02cf\3\2\2\2\\\u02d1\3\2\2\2^\u02e4\3\2\2\2`\u0320\3\2\2\2b\u0322\3"+
		"\2\2\2d\u0331\3\2\2\2f\u0337\3\2\2\2h\u033e\3\2\2\2j\u0341\3\2\2\2l\u0344"+
		"\3\2\2\2n\u0380\3\2\2\2p\u03d4\3\2\2\2r\u03d6\3\2\2\2t\u03e4\3\2\2\2v"+
		"\u03f0\3\2\2\2x\u0413\3\2\2\2z\u0415\3\2\2\2|\u041a\3\2\2\2~\u0447\3\2"+
		"\2\2\u0080\u0455\3\2\2\2\u0082\u045b\3\2\2\2\u0084\u045d\3\2\2\2\u0086"+
		"\u0469\3\2\2\2\u0088\u047c\3\2\2\2\u008a\u049a\3\2\2\2\u008c\u04a0\3\2"+
		"\2\2\u008e\u04a6\3\2\2\2\u0090\u04ac\3\2\2\2\u0092\u04b2\3\2\2\2\u0094"+
		"\u04b8\3\2\2\2\u0096\u04bc\3\2\2\2\u0098\u04c0\3\2\2\2\u009a\u04c4\3\2"+
		"\2\2\u009c\u04c8\3\2\2\2\u009e\u04cc\3\2\2\2\u00a0\u04d9\3\2\2\2\u00a2"+
		"\u00a4\5\4\3\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\2\2\3\u00a9\3\3\2\2\2\u00aa\u00c2\5\66\34\2\u00ab\u00c2\5(\25"+
		"\2\u00ac\u00c2\5*\26\2\u00ad\u00c2\5P)\2\u00ae\u00c2\5@!\2\u00af\u00c2"+
		"\5N(\2\u00b0\u00c2\5T+\2\u00b1\u00c2\5b\62\2\u00b2\u00c2\5d\63\2\u00b3"+
		"\u00c2\5`\61\2\u00b4\u00c2\5h\65\2\u00b5\u00c2\5j\66\2\u00b6\u00c2\5x"+
		"=\2\u00b7\u00c2\58\35\2\u00b8\u00c2\5,\27\2\u00b9\u00c2\5H%\2\u00ba\u00c2"+
		"\5t;\2\u00bb\u00c2\5F$\2\u00bc\u00c2\5\6\4\2\u00bd\u00c2\5\24\13\2\u00be"+
		"\u00c2\5\36\20\2\u00bf\u00c2\5&\24\2\u00c0\u00c2\5r:\2\u00c1\u00aa\3\2"+
		"\2\2\u00c1\u00ab\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1"+
		"\u00ae\3\2\2\2\u00c1\u00af\3\2\2\2\u00c1\u00b0\3\2\2\2\u00c1\u00b1\3\2"+
		"\2\2\u00c1\u00b2\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1"+
		"\u00b5\3\2\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00b8\3\2"+
		"\2\2\u00c1\u00b9\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1"+
		"\u00bc\3\2\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c2\5\3\2\2\2\u00c3\u00c7\5\b\5\2\u00c4\u00c7"+
		"\5\n\6\2\u00c5\u00c7\5\f\7\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c7\7\3\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\7\63\2"+
		"\2\u00ca\u00cb\7\64\2\2\u00cb\u00d2\5N(\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce"+
		"\7\63\2\2\u00ce\u00cf\7j\2\2\u00cf\u00d0\7\64\2\2\u00d0\u00d2\5N(\2\u00d1"+
		"\u00c8\3\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\t\3\2\2\2\u00d3\u00d4\7\6\2\2"+
		"\u00d4\u00d5\7\63\2\2\u00d5\u00d6\7\64\2\2\u00d6\u00dd\5T+\2\u00d7\u00d8"+
		"\7\6\2\2\u00d8\u00d9\7\63\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7\64\2\2"+
		"\u00db\u00dd\5T+\2\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\13\3"+
		"\2\2\2\u00de\u00e1\5\16\b\2\u00df\u00e1\5\20\t\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00df\3\2\2\2\u00e1\r\3\2\2\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\7<\2\2"+
		"\u00e4\u00e5\7\b\2\2\u00e5\u00e6\7\63\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8"+
		"\7\64\2\2\u00e8\u00e9\7\67\2\2\u00e9\17\3\2\2\2\u00ea\u00eb\7\7\2\2\u00eb"+
		"\u00ec\7<\2\2\u00ec\u00ed\7\t\2\2\u00ed\u00ee\7\63\2\2\u00ee\u00ef\7j"+
		"\2\2\u00ef\u00f0\7\64\2\2\u00f0\u00f1\7\67\2\2\u00f1\21\3\2\2\2\u00f2"+
		"\u00f3\7m\2\2\u00f3\u00fc\7\63\2\2\u00f4\u00f9\5n8\2\u00f5\u00f6\78\2"+
		"\2\u00f6\u00f8\5n8\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00f4\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\64"+
		"\2\2\u00ff\23\3\2\2\2\u0100\u0104\5\26\f\2\u0101\u0104\5\30\r\2\u0102"+
		"\u0104\5\32\16\2\u0103\u0100\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0102\3"+
		"\2\2\2\u0104\25\3\2\2\2\u0105\u0106\7\n\2\2\u0106\u0107\79\2\2\u0107\u0108"+
		"\7j\2\2\u0108\27\3\2\2\2\u0109\u010a\7\13\2\2\u010a\31\3\2\2\2\u010b\u010c"+
		"\7\f\2\2\u010c\u010d\7<\2\2\u010d\u010e\7\r\2\2\u010e\u010f\7\63\2\2\u010f"+
		"\u0110\5\34\17\2\u0110\u0111\7\64\2\2\u0111\u0112\7\67\2\2\u0112\33\3"+
		"\2\2\2\u0113\u0114\7\61\2\2\u0114\u0119\7j\2\2\u0115\u0116\78\2\2\u0116"+
		"\u0118\7j\2\2\u0117\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c"+
		"\u011d\7\62\2\2\u011d\35\3\2\2\2\u011e\u0122\5 \21\2\u011f\u0122\5\"\22"+
		"\2\u0120\u0122\5$\23\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120"+
		"\3\2\2\2\u0122\37\3\2\2\2\u0123\u0124\7\61\2\2\u0124\u0125\7\16\2\2\u0125"+
		"\u0126\7\62\2\2\u0126\u0127\79\2\2\u0127\u0128\7m\2\2\u0128!\3\2\2\2\u0129"+
		"\u012a\7\17\2\2\u012a\u012b\79\2\2\u012b\u012c\7j\2\2\u012c#\3\2\2\2\u012d"+
		"\u012e\7\20\2\2\u012e\u012f\79\2\2\u012f\u0130\7j\2\2\u0130%\3\2\2\2\u0131"+
		"\u0132\5n8\2\u0132\u0133\7<\2\2\u0133\u0134\7m\2\2\u0134\u013d\7\63\2"+
		"\2\u0135\u013a\5n8\2\u0136\u0137\78\2\2\u0137\u0139\5n8\2\u0138\u0136"+
		"\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b"+
		"\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7\64\2\2\u0140\u0141\7\67\2\2\u0141"+
		"\'\3\2\2\2\u0142\u0143\t\2\2\2\u0143\u0147\7\63\2\2\u0144\u0148\5\62\32"+
		"\2\u0145\u0146\7\65\2\2\u0146\u0148\7\66\2\2\u0147\u0144\3\2\2\2\u0147"+
		"\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\7\64"+
		"\2\2\u014a\u014b\5*\26\2\u014b)\3\2\2\2\u014c\u014d\7\27\2\2\u014d\u0152"+
		"\5,\27\2\u014e\u014f\7\27\2\2\u014f\u0150\7m\2\2\u0150\u0152\7\67\2\2"+
		"\u0151\u014c\3\2\2\2\u0151\u014e\3\2\2\2\u0152+\3\2\2\2\u0153\u0154\7"+
		"\37\2\2\u0154\u0155\7m\2\2\u0155\u0156\7\65\2\2\u0156\u0157\5.\30\2\u0157"+
		"\u0158\7\66\2\2\u0158-\3\2\2\2\u0159\u0160\5N(\2\u015a\u0160\5V,\2\u015b"+
		"\u0160\5P)\2\u015c\u0160\5R*\2\u015d\u0160\5T+\2\u015e\u0160\5\4\3\2\u015f"+
		"\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2\2\2\u015f\u015c\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161"+
		"\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162/\3\2\2\2\u0163\u0161\3\2\2\2"+
		"\u0164\u0166\5\62\32\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u016a"+
		"\3\2\2\2\u0167\u0168\7\65\2\2\u0168\u016a\7\66\2\2\u0169\u0165\3\2\2\2"+
		"\u0169\u0167\3\2\2\2\u016a\61\3\2\2\2\u016b\u0170\5\64\33\2\u016c\u016d"+
		"\78\2\2\u016d\u016f\5\64\33\2\u016e\u016c\3\2\2\2\u016f\u0172\3\2\2\2"+
		"\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170"+
		"\3\2\2\2\u0173\u0175\78\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\63\3\2\2\2\u0176\u0177\7m\2\2\u0177\u0178\7:\2\2\u0178\u0179\5Z.\2\u0179"+
		"\65\3\2\2\2\u017a\u017b\7\26\2\2\u017b\u017c\7\65\2\2\u017c\u0181\7m\2"+
		"\2\u017d\u017e\78\2\2\u017e\u0180\7m\2\2\u017f\u017d\3\2\2\2\u0180\u0183"+
		"\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0184\3\2\2\2\u0183"+
		"\u0181\3\2\2\2\u0184\u0185\7\66\2\2\u0185\u0186\7X\2\2\u0186\u0188\7j"+
		"\2\2\u0187\u0189\7\67\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u01b2\3\2\2\2\u018a\u018b\7\26\2\2\u018b\u018c\7m\2\2\u018c\u018d\7X"+
		"\2\2\u018d\u018f\7j\2\2\u018e\u0190\7\67\2\2\u018f\u018e\3\2\2\2\u018f"+
		"\u0190\3\2\2\2\u0190\u01b2\3\2\2\2\u0191\u0192\7\26\2\2\u0192\u0193\7"+
		"?\2\2\u0193\u0194\7Y\2\2\u0194\u0195\7m\2\2\u0195\u0196\7X\2\2\u0196\u0198"+
		"\7j\2\2\u0197\u0199\7\67\2\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u01b2\3\2\2\2\u019a\u019b\7\26\2\2\u019b\u019d\7j\2\2\u019c\u019e\7\67"+
		"\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01b2\3\2\2\2\u019f"+
		"\u01a0\7\26\2\2\u01a0\u01a1\7m\2\2\u01a1\u01a2\78\2\2\u01a2\u01a3\7\65"+
		"\2\2\u01a3\u01a8\7m\2\2\u01a4\u01a5\78\2\2\u01a5\u01a7\7m\2\2\u01a6\u01a4"+
		"\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\66\2\2\u01ac\u01ad\7"+
		"X\2\2\u01ad\u01af\7j\2\2\u01ae\u01b0\7\67\2\2\u01af\u01ae\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u017a\3\2\2\2\u01b1\u018a\3\2"+
		"\2\2\u01b1\u0191\3\2\2\2\u01b1\u019a\3\2\2\2\u01b1\u019f\3\2\2\2\u01b2"+
		"\67\3\2\2\2\u01b3\u01b4\7b\2\2\u01b4\u01b5\7<\2\2\u01b5\u01b6\7m\2\2\u01b6"+
		"\u01ba\79\2\2\u01b7\u01bb\5:\36\2\u01b8\u01bb\5<\37\2\u01b9\u01bb\5> "+
		"\2\u01ba\u01b7\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\u01bd\7\67\2\2\u01bd9\3\2\2\2\u01be\u01bf\7h\2\2\u01bf"+
		"\u01c0\7m\2\2\u01c0\u01c9\7\63\2\2\u01c1\u01c6\5n8\2\u01c2\u01c3\78\2"+
		"\2\u01c3\u01c5\5n8\2\u01c4\u01c2\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01c1\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\64"+
		"\2\2\u01cc;\3\2\2\2\u01cd\u01d3\7b\2\2\u01ce\u01d1\7<\2\2\u01cf\u01d2"+
		"\7m\2\2\u01d0\u01d2\5r:\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\u01d4\3\2\2\2\u01d3\u01ce\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6=\3\2\2\2\u01d7\u01da\7m\2\2\u01d8\u01d9"+
		"\7<\2\2\u01d9\u01db\7m\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db"+
		"?\3\2\2\2\u01dc\u01dd\7[\2\2\u01dd\u01de\7m\2\2\u01de\u01e2\7\65\2\2\u01df"+
		"\u01e1\5B\"\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5"+
		"\u01e6\7\66\2\2\u01e6\u01e7\7\67\2\2\u01e7A\3\2\2\2\u01e8\u01ed\5D#\2"+
		"\u01e9\u01ea\78\2\2\u01ea\u01ec\5D#\2\u01eb\u01e9\3\2\2\2\u01ec\u01ef"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01eeC\3\2\2\2\u01ef"+
		"\u01ed\3\2\2\2\u01f0\u01f1\7m\2\2\u01f1\u01f2\79\2\2\u01f2\u01f3\5Z.\2"+
		"\u01f3E\3\2\2\2\u01f4\u01f5\7\34\2\2\u01f5\u01f6\7<\2\2\u01f6\u01f7\7"+
		"\35\2\2\u01f7\u01fb\7\63\2\2\u01f8\u01fc\7m\2\2\u01f9\u01fc\7j\2\2\u01fa"+
		"\u01fc\5Z.\2\u01fb\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2"+
		"\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7\64\2\2\u01fe\u0200\7\67\2\2\u01ff"+
		"\u01fe\3\2\2\2\u01ff\u0200\3\2\2\2\u0200G\3\2\2\2\u0201\u0202\7\30\2\2"+
		"\u0202\u0203\5,\27\2\u0203I\3\2\2\2\u0204\u0205\7\31\2\2\u0205\u0206\7"+
		"\65\2\2\u0206\u0207\5.\30\2\u0207\u0208\7\66\2\2\u0208K\3\2\2\2\u0209"+
		"\u020a\t\3\2\2\u020aM\3\2\2\2\u020b\u020d\5L\'\2\u020c\u020b\3\2\2\2\u020c"+
		"\u020d\3\2\2\2\u020d\u020f\3\2\2\2\u020e\u0210\7O\2\2\u020f\u020e\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7m\2\2\u0212"+
		"\u0213\7:\2\2\u0213\u0214\5X-\2\u0214\u0218\79\2\2\u0215\u0219\5n8\2\u0216"+
		"\u0219\5Z.\2\u0217\u0219\5\u009eP\2\u0218\u0215\3\2\2\2\u0218\u0216\3"+
		"\2\2\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7\67\2\2\u021b"+
		"\u0248\3\2\2\2\u021c\u021e\5L\'\2\u021d\u021c\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u0220\3\2\2\2\u021f\u0221\7O\2\2\u0220\u021f\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\7m\2\2\u0223\u0227\79\2"+
		"\2\u0224\u0228\5n8\2\u0225\u0228\5Z.\2\u0226\u0228\5\u009eP\2\u0227\u0224"+
		"\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\7\67\2\2\u022a\u0248\3\2\2\2\u022b\u022d\5L\'\2\u022c\u022b\3\2"+
		"\2\2\u022c\u022d\3\2\2\2\u022d\u022f\3\2\2\2\u022e\u0230\7O\2\2\u022f"+
		"\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7m"+
		"\2\2\u0232\u0233\7:\2\2\u0233\u0234\5X-\2\u0234\u0235\7\67\2\2\u0235\u0248"+
		"\3\2\2\2\u0236\u0238\5L\'\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\7m\2\2\u023a\u023e\79\2\2\u023b\u023f\5n8\2"+
		"\u023c\u023f\5Z.\2\u023d\u023f\5\u009eP\2\u023e\u023b\3\2\2\2\u023e\u023c"+
		"\3\2\2\2\u023e\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\7\67\2\2"+
		"\u0241\u0248\3\2\2\2\u0242\u0244\5L\'\2\u0243\u0242\3\2\2\2\u0243\u0244"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\7m\2\2\u0246\u0248\7\67\2\2\u0247"+
		"\u020c\3\2\2\2\u0247\u021d\3\2\2\2\u0247\u022c\3\2\2\2\u0247\u0237\3\2"+
		"\2\2\u0247\u0243\3\2\2\2\u0248O\3\2\2\2\u0249\u024b\7O\2\2\u024a\u0249"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7m\2\2\u024d"+
		"\u024e\7:\2\2\u024e\u024f\5X-\2\u024f\u0250\7\61\2\2\u0250\u0251\7\62"+
		"\2\2\u0251\u0252\79\2\2\u0252\u025b\7\61\2\2\u0253\u0258\5Z.\2\u0254\u0255"+
		"\78\2\2\u0255\u0257\5Z.\2\u0256\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2"+
		"\2\2\u025b\u0253\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d"+
		"\u025e\7\62\2\2\u025e\u025f\7\67\2\2\u025f\u0272\3\2\2\2\u0260\u0261\7"+
		"m\2\2\u0261\u0262\79\2\2\u0262\u0264\7\61\2\2\u0263\u0265\5Z.\2\u0264"+
		"\u0263\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u026c\3\2\2\2\u0266\u0268\5Z"+
		".\2\u0267\u0269\78\2\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b"+
		"\3\2\2\2\u026a\u0266\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f\u0270\7\62"+
		"\2\2\u0270\u0272\7\67\2\2\u0271\u024a\3\2\2\2\u0271\u0260\3\2\2\2\u0272"+
		"Q\3\2\2\2\u0273\u0274\7\30\2\2\u0274\u0275\7m\2\2\u0275\u027e\7\63\2\2"+
		"\u0276\u027b\5p9\2\u0277\u0278\78\2\2\u0278\u027a\5p9\2\u0279\u0277\3"+
		"\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c"+
		"\u027f\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0276\3\2\2\2\u027e\u027f\3\2"+
		"\2\2\u027f\u0280\3\2\2\2\u0280\u0281\7\64\2\2\u0281\u0284\7:\2\2\u0282"+
		"\u0285\5X-\2\u0283\u0285\7T\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2"+
		"\2\u0285\u0286\3\2\2\2\u0286\u0287\7\67\2\2\u0287S\3\2\2\2\u0288\u0289"+
		"\t\4\2\2\u0289\u0292\7\63\2\2\u028a\u028f\5p9\2\u028b\u028c\78\2\2\u028c"+
		"\u028e\5p9\2\u028d\u028b\3\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2"+
		"\2\u028f\u0290\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u028a"+
		"\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294\3\2\2\2\u0294\u0297\7\64\2\2"+
		"\u0295\u0296\7:\2\2\u0296\u0298\5X-\2\u0297\u0295\3\2\2\2\u0297\u0298"+
		"\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029d\7\65\2\2\u029a\u029c\5\4\3\2"+
		"\u029b\u029a\3\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e"+
		"\3\2\2\2\u029e\u02a0\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u02a1\7\66\2\2"+
		"\u02a1U\3\2\2\2\u02a2\u02a4\5L\'\2\u02a3\u02a2\3\2\2\2\u02a3\u02a4\3\2"+
		"\2\2\u02a4\u02a5\3\2\2\2\u02a5\u02a6\7m\2\2\u02a6\u02a7\7:\2\2\u02a7\u02a8"+
		"\7m\2\2\u02a8\u02c3\7\67\2\2\u02a9\u02ab\5L\'\2\u02aa\u02a9\3\2\2\2\u02aa"+
		"\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7m\2\2\u02ad\u02ae\7:\2"+
		"\2\u02ae\u02af\7m\2\2\u02af\u02b0\79\2\2\u02b0\u02b1\7h\2\2\u02b1\u02b2"+
		"\7m\2\2\u02b2\u02bd\7\63\2\2\u02b3\u02b8\5Z.\2\u02b4\u02b5\78\2\2\u02b5"+
		"\u02b7\5Z.\2\u02b6\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2"+
		"\2\u02b8\u02b9\3\2\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02b3"+
		"\3\2\2\2\u02bc\u02bf\3\2\2\2\u02bd\u02bb\3\2\2\2\u02bd\u02be\3\2\2\2\u02be"+
		"\u02c0\3\2\2\2\u02bf\u02bd\3\2\2\2\u02c0\u02c1\7\64\2\2\u02c1\u02c3\7"+
		"\67\2\2\u02c2\u02a3\3\2\2\2\u02c2\u02aa\3\2\2\2\u02c3W\3\2\2\2\u02c4\u02c5"+
		"\t\5\2\2\u02c5Y\3\2\2\2\u02c6\u02d0\7i\2\2\u02c7\u02d0\7j\2\2\u02c8\u02d0"+
		"\7k\2\2\u02c9\u02d0\5^\60\2\u02ca\u02d0\5\\/\2\u02cb\u02d0\7Z\2\2\u02cc"+
		"\u02d0\5t;\2\u02cd\u02d0\5\u0084C\2\u02ce\u02d0\5\u009eP\2\u02cf\u02c6"+
		"\3\2\2\2\u02cf\u02c7\3\2\2\2\u02cf\u02c8\3\2\2\2\u02cf\u02c9\3\2\2\2\u02cf"+
		"\u02ca\3\2\2\2\u02cf\u02cb\3\2\2\2\u02cf\u02cc\3\2\2\2\u02cf\u02cd\3\2"+
		"\2\2\u02cf\u02ce\3\2\2\2\u02d0[\3\2\2\2\u02d1\u02d2\7\65\2\2\u02d2\u02d3"+
		"\7m\2\2\u02d3\u02d4\7:\2\2\u02d4\u02df\5Z.\2\u02d5\u02d6\78\2\2\u02d6"+
		"\u02d7\7m\2\2\u02d7\u02d8\7:\2\2\u02d8\u02d9\5Z.\2\u02d9\u02db\3\2\2\2"+
		"\u02da\u02dc\78\2\2\u02db\u02da\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02de"+
		"\3\2\2\2\u02dd\u02d5\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2\2\2\u02df"+
		"\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u02e3\7\66"+
		"\2\2\u02e3]\3\2\2\2\u02e4\u02e9\7\61\2\2\u02e5\u02e8\7m\2\2\u02e6\u02e8"+
		"\5Z.\2\u02e7\u02e5\3\2\2\2\u02e7\u02e6\3\2\2\2\u02e8\u02eb\3\2\2\2\u02e9"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02f3\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02ec\u02ef\78\2\2\u02ed\u02f0\7m\2\2\u02ee\u02f0\5Z.\2\u02ef\u02ed"+
		"\3\2\2\2\u02ef\u02ee\3\2\2\2\u02f0\u02f2\3\2\2\2\u02f1\u02ec\3\2\2\2\u02f2"+
		"\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4\u02f7\3\2"+
		"\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f8\78\2\2\u02f7\u02f6\3\2\2\2\u02f7"+
		"\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u02fa\7\62\2\2\u02fa_\3\2\2\2"+
		"\u02fb\u02fc\7m\2\2\u02fc\u02ff\79\2\2\u02fd\u0300\5n8\2\u02fe\u0300\5"+
		"\u009eP\2\u02ff\u02fd\3\2\2\2\u02ff\u02fe\3\2\2\2\u0300\u0305\3\2\2\2"+
		"\u0301\u0302\78\2\2\u0302\u0304\5n8\2\u0303\u0301\3\2\2\2\u0304\u0307"+
		"\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0308\u0309\7\67\2\2\u0309\u0321\3\2\2\2\u030a\u030b\7"+
		"b\2\2\u030b\u030c\7<\2\2\u030c\u030d\7m\2\2\u030d\u030e\79\2\2\u030e\u030f"+
		"\5n8\2\u030f\u0310\7\67\2\2\u0310\u0321\3\2\2\2\u0311\u0312\7m\2\2\u0312"+
		"\u0313\79\2\2\u0313\u031c\7\61\2\2\u0314\u0319\5Z.\2\u0315\u0316\78\2"+
		"\2\u0316\u0318\5Z.\2\u0317\u0315\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031a\u031d\3\2\2\2\u031b\u0319\3\2\2\2\u031c"+
		"\u0314\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\7\62"+
		"\2\2\u031f\u0321\7\67\2\2\u0320\u02fb\3\2\2\2\u0320\u030a\3\2\2\2\u0320"+
		"\u0311\3\2\2\2\u0321a\3\2\2\2\u0322\u0323\7P\2\2\u0323\u0324\7\63\2\2"+
		"\u0324\u0325\5n8\2\u0325\u0326\7\64\2\2\u0326\u032a\5l\67\2\u0327\u0329"+
		"\5f\64\2\u0328\u0327\3\2\2\2\u0329\u032c\3\2\2\2\u032a\u0328\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032f\3\2\2\2\u032c\u032a\3\2\2\2\u032d\u032e\7Q"+
		"\2\2\u032e\u0330\5l\67\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"c\3\2\2\2\u0331\u0332\7R\2\2\u0332\u0333\7\63\2\2\u0333\u0334\5n8\2\u0334"+
		"\u0335\7\64\2\2\u0335\u0336\5l\67\2\u0336e\3\2\2\2\u0337\u0338\7Q\2\2"+
		"\u0338\u0339\7P\2\2\u0339\u033a\7\63\2\2\u033a\u033b\5n8\2\u033b\u033c"+
		"\7\64\2\2\u033c\u033d\5l\67\2\u033dg\3\2\2\2\u033e\u033f\7S\2\2\u033f"+
		"\u0340\7\67\2\2\u0340i\3\2\2\2\u0341\u0342\7U\2\2\u0342\u0343\7\67\2\2"+
		"\u0343k\3\2\2\2\u0344\u0348\7\65\2\2\u0345\u0347\5\4\3\2\u0346\u0345\3"+
		"\2\2\2\u0347\u034a\3\2\2\2\u0348\u0346\3\2\2\2\u0348\u0349\3\2\2\2\u0349"+
		"\u034b\3\2\2\2\u034a\u0348\3\2\2\2\u034b\u034c\7\66\2\2\u034cm\3\2\2\2"+
		"\u034d\u034e\b8\1\2\u034e\u034f\7\63\2\2\u034f\u0350\5n8\2\u0350\u0351"+
		"\7\64\2\2\u0351\u0381\3\2\2\2\u0352\u0353\7m\2\2\u0353\u0354\7\61\2\2"+
		"\u0354\u0355\5n8\2\u0355\u0356\7\62\2\2\u0356\u0381\3\2\2\2\u0357\u0358"+
		"\7M\2\2\u0358\u0359\5n8\2\u0359\u035a\7N\2\2\u035a\u0381\3\2\2\2\u035b"+
		"\u035c\7b\2\2\u035c\u035d\7<\2\2\u035d\u035e\7m\2\2\u035e\u035f\7<\2\2"+
		"\u035f\u0360\7m\2\2\u0360\u0369\7\63\2\2\u0361\u0366\5n8\2\u0362\u0363"+
		"\78\2\2\u0363\u0365\5n8\2\u0364\u0362\3\2\2\2\u0365\u0368\3\2\2\2\u0366"+
		"\u0364\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u036a\3\2\2\2\u0368\u0366\3\2"+
		"\2\2\u0369\u0361\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u0381\7\64\2\2\u036c\u036d\7m\2\2\u036d\u036e\7^\2\2\u036e\u0381\5n8"+
		"\n\u036f\u0370\7m\2\2\u0370\u0371\7^\2\2\u0371\u0381\7m\2\2\u0372\u0373"+
		"\7b\2\2\u0373\u0374\7<\2\2\u0374\u0375\7m\2\2\u0375\u0376\79\2\2\u0376"+
		"\u0381\5n8\b\u0377\u0378\7b\2\2\u0378\u0379\7<\2\2\u0379\u0381\7m\2\2"+
		"\u037a\u037b\7m\2\2\u037b\u037c\7<\2\2\u037c\u0381\7m\2\2\u037d\u0381"+
		"\5Z.\2\u037e\u0381\7m\2\2\u037f\u0381\5t;\2\u0380\u034d\3\2\2\2\u0380"+
		"\u0352\3\2\2\2\u0380\u0357\3\2\2\2\u0380\u035b\3\2\2\2\u0380\u036c\3\2"+
		"\2\2\u0380\u036f\3\2\2\2\u0380\u0372\3\2\2\2\u0380\u0377\3\2\2\2\u0380"+
		"\u037a\3\2\2\2\u0380\u037d\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u037f\3\2"+
		"\2\2\u0381\u03c7\3\2\2\2\u0382\u0383\f\36\2\2\u0383\u0384\7?\2\2\u0384"+
		"\u03c6\5n8\37\u0385\u0386\f\35\2\2\u0386\u0387\7A\2\2\u0387\u03c6\5n8"+
		"\36\u0388\u0389\f\34\2\2\u0389\u038a\7B\2\2\u038a\u03c6\5n8\35\u038b\u038c"+
		"\f\33\2\2\u038c\u038d\7=\2\2\u038d\u03c6\5n8\34\u038e\u038f\f\32\2\2\u038f"+
		"\u0390\7>\2\2\u0390\u03c6\5n8\33\u0391\u0392\f\31\2\2\u0392\u0393\7D\2"+
		"\2\u0393\u03c6\5n8\32\u0394\u0395\f\30\2\2\u0395\u0396\7E\2\2\u0396\u03c6"+
		"\5n8\31\u0397\u0398\f\27\2\2\u0398\u0399\7F\2\2\u0399\u03c6\5n8\30\u039a"+
		"\u039b\f\26\2\2\u039b\u039c\7G\2\2\u039c\u03c6\5n8\27\u039d\u039e\f\25"+
		"\2\2\u039e\u039f\7I\2\2\u039f\u03c6\5n8\26\u03a0\u03a1\f\24\2\2\u03a1"+
		"\u03a2\7J\2\2\u03a2\u03c6\5n8\25\u03a3\u03a4\f\23\2\2\u03a4\u03a5\7H\2"+
		"\2\u03a5\u03c6\5n8\24\u03a6\u03a7\f\22\2\2\u03a7\u03a8\7K\2\2\u03a8\u03c6"+
		"\5n8\23\u03a9\u03aa\f\21\2\2\u03aa\u03ab\7L\2\2\u03ab\u03c6\5n8\22\u03ac"+
		"\u03ad\f\r\2\2\u03ad\u03ae\7<\2\2\u03ae\u03af\7m\2\2\u03af\u03b8\7\63"+
		"\2\2\u03b0\u03b5\5n8\2\u03b1\u03b2\78\2\2\u03b2\u03b4\5n8\2\u03b3\u03b1"+
		"\3\2\2\2\u03b4\u03b7\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u03b9\3\2\2\2\u03b7\u03b5\3\2\2\2\u03b8\u03b0\3\2\2\2\u03b8\u03b9\3\2"+
		"\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03c6\7\64\2\2\u03bb\u03bc\f\13\2\2\u03bc"+
		"\u03bd\7<\2\2\u03bd\u03be\7m\2\2\u03be\u03bf\7\63\2\2\u03bf\u03c0\7m\2"+
		"\2\u03c0\u03c1\7^\2\2\u03c1\u03c2\5n8\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4"+
		"\7\64\2\2\u03c4\u03c6\3\2\2\2\u03c5\u0382\3\2\2\2\u03c5\u0385\3\2\2\2"+
		"\u03c5\u0388\3\2\2\2\u03c5\u038b\3\2\2\2\u03c5\u038e\3\2\2\2\u03c5\u0391"+
		"\3\2\2\2\u03c5\u0394\3\2\2\2\u03c5\u0397\3\2\2\2\u03c5\u039a\3\2\2\2\u03c5"+
		"\u039d\3\2\2\2\u03c5\u03a0\3\2\2\2\u03c5\u03a3\3\2\2\2\u03c5\u03a6\3\2"+
		"\2\2\u03c5\u03a9\3\2\2\2\u03c5\u03ac\3\2\2\2\u03c5\u03bb\3\2\2\2\u03c6"+
		"\u03c9\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8o\3\2\2\2"+
		"\u03c9\u03c7\3\2\2\2\u03ca\u03cb\7m\2\2\u03cb\u03cc\7:\2\2\u03cc\u03d5"+
		"\5X-\2\u03cd\u03ce\7m\2\2\u03ce\u03cf\7:\2\2\u03cf\u03d0\5X-\2\u03d0\u03d1"+
		"\79\2\2\u03d1\u03d2\5Z.\2\u03d2\u03d5\3\2\2\2\u03d3\u03d5\7m\2\2\u03d4"+
		"\u03ca\3\2\2\2\u03d4\u03cd\3\2\2\2\u03d4\u03d3\3\2\2\2\u03d5q\3\2\2\2"+
		"\u03d6\u03d7\7m\2\2\u03d7\u03e0\7\63\2\2\u03d8\u03dd\5n8\2\u03d9\u03da"+
		"\78\2\2\u03da\u03dc\5n8\2\u03db\u03d9\3\2\2\2\u03dc\u03df\3\2\2\2\u03dd"+
		"\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03e1\3\2\2\2\u03df\u03dd\3\2"+
		"\2\2\u03e0\u03d8\3\2\2\2\u03e0\u03e1\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2"+
		"\u03e3\7\64\2\2\u03e3s\3\2\2\2\u03e4\u03e5\7l\2\2\u03e5\u03e6\5v<\2\u03e6"+
		"\u03e7\7l\2\2\u03e7u\3\2\2\2\u03e8\u03f1\5x=\2\u03e9\u03ea\7M\2\2\u03ea"+
		"\u03eb\5n8\2\u03eb\u03ec\7N\2\2\u03ec\u03f1\3\2\2\2\u03ed\u03f1\7m\2\2"+
		"\u03ee\u03f1\7j\2\2\u03ef\u03f1\7i\2\2\u03f0\u03e8\3\2\2\2\u03f0\u03e9"+
		"\3\2\2\2\u03f0\u03ed\3\2\2\2\u03f0\u03ee\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3w\3\2\2\2"+
		"\u03f4\u03f5\7D\2\2\u03f5\u03f7\5z>\2\u03f6\u03f8\5|?\2\u03f7\u03f6\3"+
		"\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fa\7E\2\2\u03fa"+
		"\u03fb\5v<\2\u03fb\u03fc\7D\2\2\u03fc\u03fd\7A\2\2\u03fd\u03fe\5z>\2\u03fe"+
		"\u03ff\7E\2\2\u03ff\u0414\3\2\2\2\u0400\u0401\7D\2\2\u0401\u0403\5z>\2"+
		"\u0402\u0404\5|?\2\u0403\u0402\3\2\2\2\u0403\u0404\3\2\2\2\u0404\u0405"+
		"\3\2\2\2\u0405\u0407\7E\2\2\u0406\u0408\5v<\2\u0407\u0406\3\2\2\2\u0407"+
		"\u0408\3\2\2\2\u0408\u0414\3\2\2\2\u0409\u040a\7D\2\2\u040a\u040b\5z>"+
		"\2\u040b\u040c\5|?\2\u040c\u040d\7A\2\2\u040d\u040e\7E\2\2\u040e\u0414"+
		"\3\2\2\2\u040f\u0410\7D\2\2\u0410\u0411\5z>\2\u0411\u0412\7E\2\2\u0412"+
		"\u0414\3\2\2\2\u0413\u03f4\3\2\2\2\u0413\u0400\3\2\2\2\u0413\u0409\3\2"+
		"\2\2\u0413\u040f\3\2\2\2\u0414y\3\2\2\2\u0415\u0416\7m\2\2\u0416{\3\2"+
		"\2\2\u0417\u0419\5~@\2\u0418\u0417\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u0418"+
		"\3\2\2\2\u041a\u041b\3\2\2\2\u041b}\3\2\2\2\u041c\u041a\3\2\2\2\u041d"+
		"\u0448\7m\2\2\u041e\u0448\7\37\2\2\u041f\u0448\7\22\2\2\u0420\u0448\7"+
		"\23\2\2\u0421\u0448\7\24\2\2\u0422\u0448\7\25\2\2\u0423\u0448\7#\2\2\u0424"+
		"\u0448\7$\2\2\u0425\u0448\7%\2\2\u0426\u0448\7&\2\2\u0427\u0448\7\'\2"+
		"\2\u0428\u0448\7(\2\2\u0429\u0448\7,\2\2\u042a\u0448\7-\2\2\u042b\u0448"+
		"\7.\2\2\u042c\u0448\7/\2\2\u042d\u0448\7\60\2\2\u042e\u0448\5\u009cO\2"+
		"\u042f\u0448\5\u009aN\2\u0430\u0448\5\u008cG\2\u0431\u0448\5\u008eH\2"+
		"\u0432\u043b\7\61\2\2\u0433\u043c\7m\2\2\u0434\u0438\7m\2\2\u0435\u0437"+
		"\5\u0080A\2\u0436\u0435\3\2\2\2\u0437\u043a\3\2\2\2\u0438\u0436\3\2\2"+
		"\2\u0438\u0439\3\2\2\2\u0439\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043b\u0433"+
		"\3\2\2\2\u043b\u0434\3\2\2\2\u043c\u043d\3\2\2\2\u043d\u0448\7\62\2\2"+
		"\u043e\u043f\7\63\2\2\u043f\u0440\7m\2\2\u0440\u0448\7\64\2\2\u0441\u0442"+
		"\7?\2\2\u0442\u0448\7m\2\2\u0443\u0448\7\3\2\2\u0444\u0448\7\4\2\2\u0445"+
		"\u0448\7j\2\2\u0446\u0448\7i\2\2\u0447\u041d\3\2\2\2\u0447\u041e\3\2\2"+
		"\2\u0447\u041f\3\2\2\2\u0447\u0420\3\2\2\2\u0447\u0421\3\2\2\2\u0447\u0422"+
		"\3\2\2\2\u0447\u0423\3\2\2\2\u0447\u0424\3\2\2\2\u0447\u0425\3\2\2\2\u0447"+
		"\u0426\3\2\2\2\u0447\u0427\3\2\2\2\u0447\u0428\3\2\2\2\u0447\u0429\3\2"+
		"\2\2\u0447\u042a\3\2\2\2\u0447\u042b\3\2\2\2\u0447\u042c\3\2\2\2\u0447"+
		"\u042d\3\2\2\2\u0447\u042e\3\2\2\2\u0447\u042f\3\2\2\2\u0447\u0430\3\2"+
		"\2\2\u0447\u0431\3\2\2\2\u0447\u0432\3\2\2\2\u0447\u043e\3\2\2\2\u0447"+
		"\u0441\3\2\2\2\u0447\u0443\3\2\2\2\u0447\u0444\3\2\2\2\u0447\u0445\3\2"+
		"\2\2\u0447\u0446\3\2\2\2\u0448\u044b\3\2\2\2\u0449\u044a\79\2\2\u044a"+
		"\u044c\5\u0082B\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c\177\3"+
		"\2\2\2\u044d\u044e\7<\2\2\u044e\u0456\7m\2\2\u044f\u0450\7\61\2\2\u0450"+
		"\u0451\5n8\2\u0451\u0452\7\62\2\2\u0452\u0456\3\2\2\2\u0453\u0454\7<\2"+
		"\2\u0454\u0456\5r:\2\u0455\u044d\3\2\2\2\u0455\u044f\3\2\2\2\u0455\u0453"+
		"\3\2\2\2\u0456\u0081\3\2\2\2\u0457\u045c\5Z.\2\u0458\u045c\5n8\2\u0459"+
		"\u045c\7j\2\2\u045a\u045c\7m\2\2\u045b\u0457\3\2\2\2\u045b\u0458\3\2\2"+
		"\2\u045b\u0459\3\2\2\2\u045b\u045a\3\2\2\2\u045c\u0083\3\2\2\2\u045d\u045e"+
		"\7\61\2\2\u045e\u0462\7l\2\2\u045f\u0461\5\u0086D\2\u0460\u045f\3\2\2"+
		"\2\u0461\u0464\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0465"+
		"\3\2\2\2\u0464\u0462\3\2\2\2\u0465\u0466\7l\2\2\u0466\u0467\7\62\2\2\u0467"+
		"\u0085\3\2\2\2\u0468\u046a\7<\2\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2"+
		"\2\2\u046a\u046b\3\2\2\2\u046b\u0470\7m\2\2\u046c\u046d\7:\2\2\u046d\u046f"+
		"\7m\2\2\u046e\u046c\3\2\2\2\u046f\u0472\3\2\2\2\u0470\u046e\3\2\2\2\u0470"+
		"\u0471\3\2\2\2\u0471\u0473\3\2\2\2\u0472\u0470\3\2\2\2\u0473\u0477\7\65"+
		"\2\2\u0474\u0476\5\u0088E\2\u0475\u0474\3\2\2\2\u0476\u0479\3\2\2\2\u0477"+
		"\u0475\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u047a\3\2\2\2\u0479\u0477\3\2"+
		"\2\2\u047a\u047b\7\66\2\2\u047b\u0087\3\2\2\2\u047c\u047d\7m\2\2\u047d"+
		"\u0484\7:\2\2\u047e\u0485\7m\2\2\u047f\u0481\7i\2\2\u0480\u0482\t\6\2"+
		"\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0485\3\2\2\2\u0483\u0485"+
		"\5r:\2\u0484\u047e\3\2\2\2\u0484\u047f\3\2\2\2\u0484\u0483\3\2\2\2\u0485"+
		"\u0486\3\2\2\2\u0486\u0484\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0495\3\2"+
		"\2\2\u0488\u048f\78\2\2\u0489\u0490\7m\2\2\u048a\u048c\7i\2\2\u048b\u048d"+
		"\t\6\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u0490\3\2\2\2\u048e"+
		"\u0490\5r:\2\u048f\u0489\3\2\2\2\u048f\u048a\3\2\2\2\u048f\u048e\3\2\2"+
		"\2\u0490\u0491\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0494"+
		"\3\2\2\2\u0493\u0488\3\2\2\2\u0494\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495"+
		"\u0496\3\2\2\2\u0496\u0498\3\2\2\2\u0497\u0495\3\2\2\2\u0498\u0499\7\67"+
		"\2\2\u0499\u0089\3\2\2\2\u049a\u049b\7\'\2\2\u049b\u049c\79\2\2\u049c"+
		"\u049d\7\65\2\2\u049d\u049e\5n8\2\u049e\u049f\7\66\2\2\u049f\u008b\3\2"+
		"\2\2\u04a0\u04a1\7\63\2\2\u04a1\u04a2\7*\2\2\u04a2\u04a3\7\64\2\2\u04a3"+
		"\u04a4\79\2\2\u04a4\u04a5\7j\2\2\u04a5\u008d\3\2\2\2\u04a6\u04a7\7\63"+
		"\2\2\u04a7\u04a8\7+\2\2\u04a8\u04a9\7\64\2\2\u04a9\u04aa\79\2\2\u04aa"+
		"\u04ab\7j\2\2\u04ab\u008f\3\2\2\2\u04ac\u04ad\7\63\2\2\u04ad\u04ae\7)"+
		"\2\2\u04ae\u04af\7\64\2\2\u04af\u04b0\79\2\2\u04b0\u04b1\7j\2\2\u04b1"+
		"\u0091\3\2\2\2\u04b2\u04b3\7\60\2\2\u04b3\u04b4\79\2\2\u04b4\u04b5\7\65"+
		"\2\2\u04b5\u04b6\5n8\2\u04b6\u04b7\7\66\2\2\u04b7\u0093\3\2\2\2\u04b8"+
		"\u04b9\7-\2\2\u04b9\u04ba\79\2\2\u04ba\u04bb\7j\2\2\u04bb\u0095\3\2\2"+
		"\2\u04bc\u04bd\7.\2\2\u04bd\u04be\79\2\2\u04be\u04bf\7j\2\2\u04bf\u0097"+
		"\3\2\2\2\u04c0\u04c1\7/\2\2\u04c1\u04c2\79\2\2\u04c2\u04c3\t\7\2\2\u04c3"+
		"\u0099\3\2\2\2\u04c4\u04c5\7\4\2\2\u04c5\u04c6\79\2\2\u04c6\u04c7\5n8"+
		"\2\u04c7\u009b\3\2\2\2\u04c8\u04c9\7\3\2\2\u04c9\u04ca\79\2\2\u04ca\u04cb"+
		"\5n8\2\u04cb\u009d\3\2\2\2\u04cc\u04cd\7l\2\2\u04cd\u04ce\5\u00a0Q\2\u04ce"+
		"\u04cf\7l\2\2\u04cf\u009f\3\2\2\2\u04d0\u04da\5x=\2\u04d1\u04d2\7M\2\2"+
		"\u04d2\u04d3\5n8\2\u04d3\u04d4\7N\2\2\u04d4\u04da\3\2\2\2\u04d5\u04da"+
		"\7m\2\2\u04d6\u04da\7j\2\2\u04d7\u04da\7i\2\2\u04d8\u04da\7k\2\2\u04d9"+
		"\u04d0\3\2\2\2\u04d9\u04d1\3\2\2\2\u04d9\u04d5\3\2\2\2\u04d9\u04d6\3\2"+
		"\2\2\u04d9\u04d7\3\2\2\2\u04d9\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04d9\3\2\2\2\u04db\u04dc\3\2\2\2\u04dc\u00a1\3\2\2\2|\u00a5\u00c1\u00c6"+
		"\u00d1\u00dc\u00e0\u00f9\u00fc\u0103\u0119\u0121\u013a\u013d\u0147\u0151"+
		"\u015f\u0161\u0165\u0169\u0170\u0174\u0181\u0188\u018f\u0198\u019d\u01a8"+
		"\u01af\u01b1\u01ba\u01c6\u01c9\u01d1\u01d5\u01da\u01e2\u01ed\u01fb\u01ff"+
		"\u020c\u020f\u0218\u021d\u0220\u0227\u022c\u022f\u0237\u023e\u0243\u0247"+
		"\u024a\u0258\u025b\u0264\u0268\u026c\u0271\u027b\u027e\u0284\u028f\u0292"+
		"\u0297\u029d\u02a3\u02aa\u02b8\u02bd\u02c2\u02cf\u02db\u02df\u02e7\u02e9"+
		"\u02ef\u02f3\u02f7\u02ff\u0305\u0319\u031c\u0320\u032a\u032f\u0348\u0366"+
		"\u0369\u0380\u03b5\u03b8\u03c5\u03c7\u03d4\u03dd\u03e0\u03f0\u03f2\u03f7"+
		"\u0403\u0407\u0413\u041a\u0438\u043b\u0447\u044b\u0455\u045b\u0462\u0469"+
		"\u0470\u0477\u0481\u0484\u0486\u048c\u048f\u0491\u0495\u04d9\u04db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}