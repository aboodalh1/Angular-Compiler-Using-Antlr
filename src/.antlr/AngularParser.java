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
		NgSubmit=13, NgClick=14, Product=15, ProductManager=16, ProductName=17, 
		Price=18, Image=19, Description=20, Injectable=21, Name=22, Id=23, Src=24, 
		Alt=25, Import=26, Export=27, AbstractKeyword=28, InterfaceKeyword=29, 
		ExtendsKeyword=30, ImplementsKeyword=31, ConsoleKeyword=32, LogKeyword=33, 
		Component=34, Service=35, ClassKeyword=36, Class=37, InlineAttributeName=38, 
		BackgroundColorAttributeName=39, TextColorAttributeName=40, TypeAttributeName=41, 
		LabelAttributeName=42, ValueAttributeName=43, PlaceHolderAttributeName=44, 
		CheckedAttributeName=45, TargetAttributeName=46, OnSubmitAttributeName=47, 
		OnChangeAttributeName=48, OnClickAttributeName=49, HeadingLevelAttributeName=50, 
		DirectionAttributeName=51, DurationAttributeName=52, RepeatAttributeName=53, 
		GapAttributeName=54, OpenBracket=55, CloseBracket=56, OpenParen=57, CloseParen=58, 
		OpenBrace=59, CloseBrace=60, SemiColon=61, Comma=62, Assign=63, Colon=64, 
		QuestionMark=65, Dot=66, Plus=67, Minus=68, Multiply=69, At=70, Divide=71, 
		Modulus=72, Not=73, LessThan=74, GreaterThan=75, LessThanEquals=76, GreaterThanEquals=77, 
		NOT_EQUAL=78, WeakEqual=79, StrongEqual=80, And=81, Or=82, AngularExpressionStart=83, 
		AngularExpressionEnd=84, LetKeyword=85, IfKeyword=86, ElseKeyword=87, 
		WhileKeyword=88, BreakKeyword=89, VoidKeyword=90, ContinueKeyword=91, 
		FunctionKeyword=92, ReturnKeyword=93, From=94, NullLiteral=95, EnumKeyword=96, 
		Array=97, Any=98, Arrow=99, TypeNumber=100, TypeString=101, TypeBoolean=102, 
		ThisKeyword=103, ConstructorKeyword=104, PrivateKeyword=105, PublicKeyword=106, 
		StaticKeyword=107, ProtectedKeyword=108, NewKeyword=109, NumberLiteral=110, 
		StringLiteral=111, BooleanLiteral=112, Backtick=113, Identifier=114, CssPixel=115, 
		SingleLineComment=116, MultiLineComment=117, WS=118, This=119, New=120, 
		Enum=121, Console=122, Log=123, Abstract=124, Interface=125, Private=126, 
		Public=127, Protected=128, Static=129, Let_Identify=130, Void=131, Constructor=132, 
		Null=133, If=134, Else=135, While=136, Break=137, Continue=138;
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
		RULE_templateString = 78, RULE_templateContent = 79, RULE_product = 80, 
		RULE_productProperties = 81, RULE_productId = 82, RULE_productProperty = 83, 
		RULE_productBody = 84, RULE_productManager = 85, RULE_productManagerBody = 86;
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
			"ngIfAttribute", "templateString", "templateContent", "product", "productProperties", 
			"productId", "productProperty", "productBody", "productManager", "productManagerBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngIf'", "'*ngFor'", "'@State'", "'@Action'", "'store'", "'dispatch'", 
			"'select'", "'routerLink'", "'router-outlet'", "'router'", "'navigate'", 
			"'[(ngModel)]'", "'(ngSubmit)'", "'(click)'", "'@Product'", "'@ProductManager'", 
			null, "'price'", "'image'", "'description'", null, null, "'id'", "'src'", 
			"'alt'", "'import'", "'export'", "'abstract'", "'interface'", "'extends'", 
			"'implements'", "'console'", "'log'", "'@Component'", null, null, null, 
			"'inline'", "'backgroundColor'", "'textColor'", "'type'", "'label'", 
			"'value'", "'placeholder'", "'chacked'", "'target'", "'submit'", "'change'", 
			"'click'", "'level'", "'direction'", "'duration'", "'repeat'", "'gap'", 
			"'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", "':'", 
			"'?'", "'.'", "'+'", "'-'", "'*'", "'@'", "'/'", "'%'", "'!'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", "'==='", "'&&'", "'||'", "'{{'", 
			"'}}'", "'let'", "'if'", "'else'", "'while'", "'break'", "'void'", "'continue'", 
			"'function'", "'return'", "'from'", "'null'", "'enum'", "'Array'", "'any'", 
			"'=>'", "'number'", "'string'", "'boolean'", "'this'", "'constructor'", 
			"'private'", "'public'", "'static'", "'protected'", "'new'", null, null, 
			null, "'`'", null, "'px'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "State", "Action", "Store", 
			"Dispatch", "Select", "RouterLink", "RouterOutlet", "Router", "Navigate", 
			"NgModel", "NgSubmit", "NgClick", "Product", "ProductManager", "ProductName", 
			"Price", "Image", "Description", "Injectable", "Name", "Id", "Src", "Alt", 
			"Import", "Export", "AbstractKeyword", "InterfaceKeyword", "ExtendsKeyword", 
			"ImplementsKeyword", "ConsoleKeyword", "LogKeyword", "Component", "Service", 
			"ClassKeyword", "Class", "InlineAttributeName", "BackgroundColorAttributeName", 
			"TextColorAttributeName", "TypeAttributeName", "LabelAttributeName", 
			"ValueAttributeName", "PlaceHolderAttributeName", "CheckedAttributeName", 
			"TargetAttributeName", "OnSubmitAttributeName", "OnChangeAttributeName", 
			"OnClickAttributeName", "HeadingLevelAttributeName", "DirectionAttributeName", 
			"DurationAttributeName", "RepeatAttributeName", "GapAttributeName", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"SemiColon", "Comma", "Assign", "Colon", "QuestionMark", "Dot", "Plus", 
			"Minus", "Multiply", "At", "Divide", "Modulus", "Not", "LessThan", "GreaterThan", 
			"LessThanEquals", "GreaterThanEquals", "NOT_EQUAL", "WeakEqual", "StrongEqual", 
			"And", "Or", "AngularExpressionStart", "AngularExpressionEnd", "LetKeyword", 
			"IfKeyword", "ElseKeyword", "WhileKeyword", "BreakKeyword", "VoidKeyword", 
			"ContinueKeyword", "FunctionKeyword", "ReturnKeyword", "From", "NullLiteral", 
			"EnumKeyword", "Array", "Any", "Arrow", "TypeNumber", "TypeString", "TypeBoolean", 
			"ThisKeyword", "ConstructorKeyword", "PrivateKeyword", "PublicKeyword", 
			"StaticKeyword", "ProtectedKeyword", "NewKeyword", "NumberLiteral", "StringLiteral", 
			"BooleanLiteral", "Backtick", "Identifier", "CssPixel", "SingleLineComment", 
			"MultiLineComment", "WS", "This", "New", "Enum", "Console", "Log", "Abstract", 
			"Interface", "Private", "Public", "Protected", "Static", "Let_Identify", 
			"Void", "Constructor", "Null", "If", "Else", "While", "Break", "Continue"
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Product) | (1L << ProductManager) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
				{
				{
				setState(174);
				statement();
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
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
		public ProductContext product() {
			return getRuleContext(ProductContext.class,0);
		}
		public ProductManagerContext productManager() {
			return getRuleContext(ProductManagerContext.class,0);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				arrayDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				enumDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(188);
				assignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(189);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(190);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(191);
				html_element();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(192);
				importStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(193);
				component();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(194);
				exportClass();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(195);
				thisVarible();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(196);
				classDeclaration();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(197);
				abstractClass();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(198);
				html();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(199);
				consoleLog();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(200);
				stateManagement();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(201);
				navigation();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(202);
				angularTemplate();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(203);
				methodCallStatement();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(204);
				function_call();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(205);
				product();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(206);
				productManager();
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
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case State:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				stateDeclaration();
				}
				break;
			case Action:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				actionDeclaration();
				}
				break;
			case Store:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
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
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(State);
				setState(215);
				match(OpenParen);
				setState(216);
				match(CloseParen);
				setState(217);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				match(State);
				setState(219);
				match(OpenParen);
				setState(220);
				match(StringLiteral);
				setState(221);
				match(CloseParen);
				setState(222);
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
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(Action);
				setState(226);
				match(OpenParen);
				setState(227);
				match(CloseParen);
				setState(228);
				functionDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(Action);
				setState(230);
				match(OpenParen);
				setState(231);
				match(StringLiteral);
				setState(232);
				match(CloseParen);
				setState(233);
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
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				storeDispatch();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
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
			setState(240);
			match(Store);
			setState(241);
			match(Dot);
			setState(242);
			match(Dispatch);
			setState(243);
			match(OpenParen);
			setState(244);
			actionCall();
			setState(245);
			match(CloseParen);
			setState(246);
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
			setState(248);
			match(Store);
			setState(249);
			match(Dot);
			setState(250);
			match(Select);
			setState(251);
			match(OpenParen);
			setState(252);
			match(StringLiteral);
			setState(253);
			match(CloseParen);
			setState(254);
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
			setState(256);
			match(Identifier);
			setState(257);
			match(OpenParen);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
				{
				setState(258);
				expression(0);
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(259);
					match(Comma);
					setState(260);
					expression(0);
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(268);
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
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RouterLink:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				routerLink();
				}
				break;
			case RouterOutlet:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				routerOutlet();
				}
				break;
			case Router:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
			setState(275);
			match(RouterLink);
			setState(276);
			match(Assign);
			setState(277);
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
			setState(279);
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
			setState(281);
			match(Router);
			setState(282);
			match(Dot);
			setState(283);
			match(Navigate);
			setState(284);
			match(OpenParen);
			setState(285);
			navigationArray();
			setState(286);
			match(CloseParen);
			setState(287);
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
			setState(289);
			match(OpenBracket);
			setState(290);
			match(StringLiteral);
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(291);
				match(Comma);
				setState(292);
				match(StringLiteral);
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(298);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				ngModel();
				}
				break;
			case NgSubmit:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				ngSubmit();
				}
				break;
			case NgClick:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
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
			setState(305);
			match(OpenBracket);
			setState(306);
			match(NgModel);
			setState(307);
			match(CloseBracket);
			setState(308);
			match(Assign);
			setState(309);
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
			setState(311);
			match(NgSubmit);
			setState(312);
			match(Assign);
			setState(313);
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
			setState(315);
			match(NgClick);
			setState(316);
			match(Assign);
			setState(317);
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
			setState(319);
			expression(0);
			setState(320);
			match(Dot);
			setState(321);
			match(Identifier);
			setState(322);
			match(OpenParen);
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
				{
				setState(323);
				expression(0);
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(324);
					match(Comma);
					setState(325);
					expression(0);
					}
					}
					setState(330);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(333);
			match(CloseParen);
			setState(334);
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
			setState(336);
			_la = _input.LA(1);
			if ( !(_la==Injectable || _la==Component) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
			match(OpenParen);
			setState(341);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(338);
				argumentList();
				}
				break;
			case OpenBrace:
				{
				setState(339);
				match(OpenBrace);
				setState(340);
				match(CloseBrace);
				}
				break;
			case CloseParen:
				break;
			default:
				break;
			}
			setState(343);
			match(CloseParen);
			setState(344);
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
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(Export);
				setState(347);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(Export);
				setState(349);
				match(Identifier);
				setState(350);
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
			setState(353);
			match(Class);
			setState(354);
			match(Identifier);
			setState(355);
			match(OpenBrace);
			setState(356);
			classBody();
			setState(357);
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
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Product) | (1L << ProductManager) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
				{
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(359);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(360);
					objectDeclataion();
					}
					break;
				case 3:
					{
					setState(361);
					arrayDeclaration();
					}
					break;
				case 4:
					{
					setState(362);
					abstractFunctionDeclaration();
					}
					break;
				case 5:
					{
					setState(363);
					functionDeclaration();
					}
					break;
				case 6:
					{
					setState(364);
					statement();
					}
					break;
				}
				}
				setState(369);
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
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(370);
					argumentList();
					}
				}

				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(OpenBrace);
				setState(374);
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
			setState(377);
			argument();
			setState(382);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(378);
					match(Comma);
					setState(379);
					argument();
					}
					} 
				}
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(385);
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
			setState(388);
			match(Identifier);
			setState(389);
			match(Colon);
			setState(390);
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
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
				match(Import);
				setState(393);
				match(OpenBrace);
				setState(394);
				match(Identifier);
				setState(395);
				match(CloseBrace);
				setState(396);
				match(From);
				setState(397);
				match(StringLiteral);
				setState(398);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				match(Import);
				setState(400);
				match(Identifier);
				setState(401);
				match(From);
				setState(402);
				match(StringLiteral);
				setState(403);
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
			setState(406);
			match(This);
			setState(407);
			match(Dot);
			setState(408);
			match(Identifier);
			setState(409);
			match(Assign);
			setState(413);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				setState(410);
				newInstanceAssignment();
				}
				break;
			case This:
				{
				setState(411);
				nestedThisAssignment();
				}
				break;
			case Identifier:
				{
				setState(412);
				identifierOrPropertyAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(415);
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
			setState(417);
			match(New);
			setState(418);
			match(Identifier);
			setState(419);
			match(OpenParen);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
				{
				setState(420);
				expression(0);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(421);
					match(Comma);
					setState(422);
					expression(0);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(430);
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
			setState(432);
			match(This);
			setState(438); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(433);
				match(Dot);
				setState(436);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(434);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(435);
					function_call();
					}
					break;
				}
				}
				}
				setState(440); 
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
			setState(442);
			match(Identifier);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(443);
				match(Dot);
				setState(444);
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
			setState(447);
			match(Enum);
			setState(448);
			match(Identifier);
			setState(449);
			match(OpenBrace);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(450);
				enumValues();
				}
				}
				setState(455);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(456);
			match(CloseBrace);
			setState(457);
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
			setState(459);
			enumValue();
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(460);
				match(Comma);
				setState(461);
				enumValue();
				}
				}
				setState(466);
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
			setState(467);
			match(Identifier);
			setState(468);
			match(Assign);
			setState(469);
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
			setState(471);
			match(Console);
			setState(472);
			match(Dot);
			setState(473);
			match(Log);
			setState(474);
			match(OpenParen);
			setState(478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(475);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(476);
				match(StringLiteral);
				}
				break;
			case 3:
				{
				setState(477);
				literalValue();
				}
				break;
			}
			setState(480);
			match(CloseParen);
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(481);
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
			setState(484);
			match(Abstract);
			setState(485);
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
			setState(487);
			match(Interface);
			setState(488);
			match(OpenBrace);
			setState(489);
			classBody();
			setState(490);
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
			setState(492);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) ) {
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
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(494);
					accessModifier();
					}
				}

				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(497);
					match(Let_Identify);
					}
				}

				setState(500);
				match(Identifier);
				setState(501);
				match(Colon);
				{
				setState(502);
				type();
				}
				setState(503);
				match(Assign);
				setState(507);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(504);
					expression(0);
					}
					break;
				case 2:
					{
					setState(505);
					literalValue();
					}
					break;
				case 3:
					{
					setState(506);
					templateString();
					}
					break;
				}
				setState(509);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(511);
					accessModifier();
					}
				}

				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(514);
					match(Let_Identify);
					}
				}

				setState(517);
				match(Identifier);
				setState(518);
				match(Assign);
				setState(522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(519);
					expression(0);
					}
					break;
				case 2:
					{
					setState(520);
					literalValue();
					}
					break;
				case 3:
					{
					setState(521);
					templateString();
					}
					break;
				}
				setState(524);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(526);
					accessModifier();
					}
				}

				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(529);
					match(Let_Identify);
					}
				}

				setState(532);
				match(Identifier);
				setState(533);
				match(Colon);
				setState(534);
				type();
				setState(535);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(537);
					accessModifier();
					}
				}

				setState(540);
				match(Identifier);
				setState(541);
				match(Assign);
				setState(545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(542);
					expression(0);
					}
					break;
				case 2:
					{
					setState(543);
					literalValue();
					}
					break;
				case 3:
					{
					setState(544);
					templateString();
					}
					break;
				}
				setState(547);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(549);
					accessModifier();
					}
				}

				setState(552);
				match(Identifier);
				setState(553);
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
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
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
				match(OpenBracket);
				setState(563);
				match(CloseBracket);
				setState(564);
				match(Assign);
				setState(565);
				match(OpenBracket);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					setState(566);
					literalValue();
					setState(571);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(567);
						match(Comma);
						setState(568);
						literalValue();
						}
						}
						setState(573);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(576);
				match(CloseBracket);
				setState(577);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				match(Identifier);
				setState(580);
				match(Assign);
				setState(581);
				match(OpenBracket);
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(582);
					literalValue();
					}
					break;
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					{
					setState(585);
					literalValue();
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(586);
						match(Comma);
						}
					}

					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(594);
				match(CloseBracket);
				setState(595);
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
			setState(598);
			match(Abstract);
			setState(599);
			match(Identifier);
			setState(600);
			match(OpenParen);
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(601);
				parameter();
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(602);
					match(Comma);
					setState(603);
					parameter();
					}
					}
					setState(608);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(611);
			match(CloseParen);
			setState(612);
			match(Colon);
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
			case Identifier:
				{
				setState(613);
				type();
				}
				break;
			case Void:
				{
				setState(614);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(617);
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
			setState(619);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constructor) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(620);
			match(OpenParen);
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(621);
				parameter();
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(622);
					match(Comma);
					setState(623);
					parameter();
					}
					}
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(631);
			match(CloseParen);
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(632);
				match(Colon);
				setState(633);
				type();
				}
			}

			setState(636);
			match(OpenBrace);
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Product) | (1L << ProductManager) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
				{
				{
				setState(637);
				statement();
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
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
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(645);
					accessModifier();
					}
				}

				setState(648);
				match(Identifier);
				setState(649);
				match(Colon);
				setState(650);
				match(Identifier);
				setState(651);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(652);
					accessModifier();
					}
				}

				setState(655);
				match(Identifier);
				setState(656);
				match(Colon);
				setState(657);
				match(Identifier);
				setState(658);
				match(Assign);
				setState(659);
				match(New);
				setState(660);
				match(Identifier);
				setState(661);
				match(OpenParen);
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					{
					setState(662);
					literalValue();
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(663);
						match(Comma);
						setState(664);
						literalValue();
						}
						}
						setState(669);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(674);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(675);
				match(CloseParen);
				setState(676);
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
			setState(679);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (Array - 97)) | (1L << (Any - 97)) | (1L << (TypeNumber - 97)) | (1L << (TypeString - 97)) | (1L << (TypeBoolean - 97)) | (1L << (Identifier - 97)))) != 0)) ) {
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
			setState(690);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(681);
				match(NumberLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(683);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(684);
				listLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(685);
				mapLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(686);
				match(Null);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(687);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(688);
				css();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(689);
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
			setState(692);
			match(OpenBrace);
			setState(693);
			match(Identifier);
			setState(694);
			match(Colon);
			setState(695);
			literalValue();
			setState(706);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(696);
				match(Comma);
				{
				setState(697);
				match(Identifier);
				setState(698);
				match(Colon);
				setState(699);
				literalValue();
				}
				setState(702);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(701);
					match(Comma);
					}
					break;
				}
				}
				}
				setState(708);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(709);
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
			setState(711);
			match(OpenBracket);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Identifier - 110)) | (1L << (Null - 110)))) != 0)) {
				{
				setState(714);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(712);
					match(Identifier);
					}
					break;
				case OpenBracket:
				case OpenBrace:
				case NumberLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case Backtick:
				case Null:
					{
					setState(713);
					literalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(718);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(719);
					match(Comma);
					setState(722);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(720);
						match(Identifier);
						}
						break;
					case OpenBracket:
					case OpenBrace:
					case NumberLiteral:
					case StringLiteral:
					case BooleanLiteral:
					case Backtick:
					case Null:
						{
						setState(721);
						literalValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(728);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(729);
				match(Comma);
				}
			}

			setState(732);
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
			setState(771);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				match(Identifier);
				setState(735);
				match(Assign);
				setState(738);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
				case 1:
					{
					setState(736);
					expression(0);
					}
					break;
				case 2:
					{
					setState(737);
					templateString();
					}
					break;
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(740);
					match(Comma);
					setState(741);
					expression(0);
					}
					}
					setState(746);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(747);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(749);
				match(This);
				setState(750);
				match(Dot);
				setState(751);
				match(Identifier);
				setState(752);
				match(Assign);
				setState(753);
				expression(0);
				setState(754);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(756);
				match(Identifier);
				setState(757);
				match(Assign);
				setState(758);
				match(OpenBracket);
				setState(767);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					setState(759);
					literalValue();
					setState(764);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(760);
						match(Comma);
						setState(761);
						literalValue();
						}
						}
						setState(766);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(769);
				match(CloseBracket);
				setState(770);
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
			setState(773);
			match(If);
			setState(774);
			match(OpenParen);
			setState(775);
			expression(0);
			setState(776);
			match(CloseParen);
			setState(777);
			block();
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(778);
					elseIfStatement();
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
			}
			setState(786);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(784);
				match(Else);
				setState(785);
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
			setState(788);
			match(While);
			setState(789);
			match(OpenParen);
			setState(790);
			expression(0);
			setState(791);
			match(CloseParen);
			setState(792);
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
			setState(794);
			match(Else);
			setState(795);
			match(If);
			setState(796);
			match(OpenParen);
			setState(797);
			expression(0);
			setState(798);
			match(CloseParen);
			setState(799);
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
			setState(801);
			match(Break);
			setState(802);
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
			setState(804);
			match(Continue);
			setState(805);
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
			setState(807);
			match(OpenBrace);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Product) | (1L << ProductManager) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
				{
				{
				setState(808);
				statement();
				}
				}
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(814);
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
			setState(867);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(817);
				match(OpenParen);
				setState(818);
				expression(0);
				setState(819);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(821);
				match(Identifier);
				setState(822);
				match(OpenBracket);
				setState(823);
				expression(0);
				setState(824);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new AngularExpreissionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(826);
				match(AngularExpressionStart);
				setState(827);
				expression(0);
				setState(828);
				match(AngularExpressionEnd);
				}
				break;
			case 4:
				{
				_localctx = new ThisMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(830);
				match(This);
				setState(831);
				match(Dot);
				setState(832);
				match(Identifier);
				setState(833);
				match(Dot);
				setState(834);
				match(Identifier);
				setState(835);
				match(OpenParen);
				setState(844);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
					{
					setState(836);
					expression(0);
					setState(841);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(837);
						match(Comma);
						setState(838);
						expression(0);
						}
						}
						setState(843);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(846);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new ArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(847);
				match(Identifier);
				setState(848);
				match(Arrow);
				setState(849);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new SimpleArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(850);
				match(Identifier);
				setState(851);
				match(Arrow);
				setState(852);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ThisPropertyAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(853);
				match(This);
				setState(854);
				match(Dot);
				setState(855);
				match(Identifier);
				setState(856);
				match(Assign);
				setState(857);
				expression(6);
				}
				break;
			case 8:
				{
				_localctx = new ThisPropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(858);
				match(This);
				setState(859);
				match(Dot);
				setState(860);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new PropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(861);
				match(Identifier);
				setState(862);
				match(Dot);
				setState(863);
				match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(864);
				literalValue();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(865);
				match(Identifier);
				}
				break;
			case 12:
				{
				_localctx = new DdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(866);
				html();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(938);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(936);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(869);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(870);
						match(Multiply);
						setState(871);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(872);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(873);
						match(Divide);
						setState(874);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(875);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(876);
						match(Modulus);
						setState(877);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(878);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(879);
						match(Plus);
						setState(880);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(881);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(882);
						match(Minus);
						setState(883);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new LessThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(884);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(885);
						match(LessThan);
						setState(886);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(887);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(888);
						match(GreaterThan);
						setState(889);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(890);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(891);
						match(LessThanEquals);
						setState(892);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(893);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(894);
						match(GreaterThanEquals);
						setState(895);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new WeakEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(897);
						match(WeakEqual);
						setState(898);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new StrongEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(900);
						match(StrongEqual);
						setState(901);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(902);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(903);
						match(NOT_EQUAL);
						setState(904);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(905);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(906);
						match(And);
						setState(907);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(908);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(909);
						match(Or);
						setState(910);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(911);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(912);
						match(Dot);
						setState(913);
						match(Identifier);
						setState(914);
						match(OpenParen);
						setState(923);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
							{
							setState(915);
							expression(0);
							setState(920);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(916);
								match(Comma);
								setState(917);
								expression(0);
								}
								}
								setState(922);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(925);
						match(CloseParen);
						}
						break;
					case 16:
						{
						_localctx = new ArrayMethodWithArrowFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(926);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(927);
						match(Dot);
						setState(928);
						match(Identifier);
						setState(929);
						match(OpenParen);
						{
						setState(930);
						match(Identifier);
						setState(931);
						match(Arrow);
						setState(932);
						expression(0);
						}
						setState(934);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
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
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(Identifier);
				setState(942);
				match(Colon);
				setState(943);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				match(Identifier);
				setState(945);
				match(Colon);
				setState(946);
				type();
				setState(947);
				match(Assign);
				setState(948);
				literalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(950);
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
			setState(953);
			match(Identifier);
			setState(954);
			match(OpenParen);
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
				{
				setState(955);
				expression(0);
				setState(960);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(956);
					match(Comma);
					setState(957);
					expression(0);
					}
					}
					setState(962);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(965);
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
			setState(967);
			match(Backtick);
			setState(968);
			html_content();
			setState(969);
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
			setState(979); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(979);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(971);
						html_element();
						}
						break;
					case AngularExpressionStart:
						{
						setState(972);
						match(AngularExpressionStart);
						setState(973);
						expression(0);
						setState(974);
						match(AngularExpressionEnd);
						}
						break;
					case Identifier:
						{
						setState(976);
						match(Identifier);
						}
						break;
					case StringLiteral:
						{
						setState(977);
						match(StringLiteral);
						}
						break;
					case NumberLiteral:
						{
						setState(978);
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
				setState(981); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
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
			setState(1014);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(983);
				match(LessThan);
				setState(984);
				html_tag_name();
				setState(986);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(985);
					html_attributes();
					}
					break;
				}
				setState(988);
				match(GreaterThan);
				setState(989);
				html_content();
				setState(990);
				match(LessThan);
				setState(991);
				match(Divide);
				setState(992);
				html_tag_name();
				setState(993);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(LessThan);
				setState(996);
				html_tag_name();
				setState(998);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(997);
					html_attributes();
					}
					break;
				}
				setState(1000);
				match(GreaterThan);
				setState(1002);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(1001);
					html_content();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1004);
				match(LessThan);
				setState(1005);
				html_tag_name();
				setState(1006);
				html_attributes();
				setState(1007);
				match(Divide);
				setState(1008);
				match(GreaterThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1010);
				match(LessThan);
				setState(1011);
				html_tag_name();
				setState(1012);
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
			setState(1016);
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
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NgIfDirective) | (1L << NgForDirective) | (1L << Name) | (1L << Id) | (1L << Src) | (1L << Alt) | (1L << Class) | (1L << TypeAttributeName) | (1L << LabelAttributeName) | (1L << ValueAttributeName) | (1L << PlaceHolderAttributeName) | (1L << CheckedAttributeName) | (1L << TargetAttributeName) | (1L << HeadingLevelAttributeName) | (1L << DirectionAttributeName) | (1L << DurationAttributeName) | (1L << RepeatAttributeName) | (1L << GapAttributeName) | (1L << OpenBracket) | (1L << OpenParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Multiply - 69)) | (1L << (NumberLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(1018);
				html_attribute();
				}
				}
				setState(1023);
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
			setState(1066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				setState(1024);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1025);
				match(Class);
				}
				break;
			case 3:
				{
				setState(1026);
				match(Name);
				}
				break;
			case 4:
				{
				setState(1027);
				match(Id);
				}
				break;
			case 5:
				{
				setState(1028);
				match(Src);
				}
				break;
			case 6:
				{
				setState(1029);
				match(Alt);
				}
				break;
			case 7:
				{
				setState(1030);
				match(TypeAttributeName);
				}
				break;
			case 8:
				{
				setState(1031);
				match(LabelAttributeName);
				}
				break;
			case 9:
				{
				setState(1032);
				match(ValueAttributeName);
				}
				break;
			case 10:
				{
				setState(1033);
				match(PlaceHolderAttributeName);
				}
				break;
			case 11:
				{
				setState(1034);
				match(CheckedAttributeName);
				}
				break;
			case 12:
				{
				setState(1035);
				match(TargetAttributeName);
				}
				break;
			case 13:
				{
				setState(1036);
				match(HeadingLevelAttributeName);
				}
				break;
			case 14:
				{
				setState(1037);
				match(DirectionAttributeName);
				}
				break;
			case 15:
				{
				setState(1038);
				match(DurationAttributeName);
				}
				break;
			case 16:
				{
				setState(1039);
				match(RepeatAttributeName);
				}
				break;
			case 17:
				{
				setState(1040);
				match(GapAttributeName);
				}
				break;
			case 18:
				{
				setState(1041);
				ngIfAttribute();
				}
				break;
			case 19:
				{
				setState(1042);
				ngForAttribute();
				}
				break;
			case 20:
				{
				setState(1043);
				onChangeAttribute();
				}
				break;
			case 21:
				{
				setState(1044);
				onClickAttribute();
				}
				break;
			case 22:
				{
				setState(1045);
				match(OpenBracket);
				setState(1054);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(1046);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(1047);
					match(Identifier);
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(1048);
						access_suffix();
						}
						}
						setState(1053);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(1056);
				match(CloseBracket);
				}
				break;
			case 23:
				{
				setState(1057);
				match(OpenParen);
				{
				setState(1058);
				match(Identifier);
				}
				setState(1059);
				match(CloseParen);
				}
				break;
			case 24:
				{
				setState(1060);
				match(Multiply);
				setState(1061);
				match(Identifier);
				}
				break;
			case 25:
				{
				setState(1062);
				match(NgIfDirective);
				}
				break;
			case 26:
				{
				setState(1063);
				match(NgForDirective);
				}
				break;
			case 27:
				{
				setState(1064);
				match(StringLiteral);
				}
				break;
			case 28:
				{
				setState(1065);
				match(NumberLiteral);
				}
				break;
			}
			setState(1070);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1068);
				match(Assign);
				setState(1069);
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
			setState(1080);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1072);
				match(Dot);
				setState(1073);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				match(OpenBracket);
				setState(1075);
				expression(0);
				setState(1076);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1078);
				match(Dot);
				setState(1079);
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
			setState(1086);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1082);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1083);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1084);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1085);
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
			setState(1088);
			match(OpenBracket);
			setState(1089);
			match(Backtick);
			setState(1093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(1090);
				css_content();
				}
				}
				setState(1095);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1096);
			match(Backtick);
			setState(1097);
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
			setState(1100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(1099);
				match(Dot);
				}
			}

			setState(1102);
			match(Identifier);
			setState(1107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1103);
				match(Colon);
				setState(1104);
				match(Identifier);
				}
				}
				setState(1109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1110);
			match(OpenBrace);
			setState(1114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(1111);
				css_class_content();
				}
				}
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1117);
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
			setState(1119);
			match(Identifier);
			setState(1120);
			match(Colon);
			setState(1127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(1121);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1122);
					match(NumberLiteral);
					setState(1124);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(1123);
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
					setState(1126);
					function_call();
					}
					break;
				}
				}
				setState(1129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(1144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1131);
				match(Comma);
				setState(1138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1138);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
					case 1:
						{
						setState(1132);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1133);
						match(NumberLiteral);
						setState(1135);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(1134);
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
						setState(1137);
						function_call();
						}
						break;
					}
					}
					setState(1140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(1146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1147);
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
			setState(1149);
			match(CheckedAttributeName);
			setState(1150);
			match(Assign);
			setState(1151);
			match(OpenBrace);
			setState(1152);
			expression(0);
			setState(1153);
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
			setState(1155);
			match(OpenParen);
			setState(1156);
			match(OnChangeAttributeName);
			setState(1157);
			match(CloseParen);
			setState(1158);
			match(Assign);
			setState(1159);
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
			setState(1161);
			match(OpenParen);
			setState(1162);
			match(OnClickAttributeName);
			setState(1163);
			match(CloseParen);
			setState(1164);
			match(Assign);
			setState(1165);
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
			setState(1167);
			match(OpenParen);
			setState(1168);
			match(OnSubmitAttributeName);
			setState(1169);
			match(CloseParen);
			setState(1170);
			match(Assign);
			setState(1171);
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
			setState(1173);
			match(GapAttributeName);
			setState(1174);
			match(Assign);
			setState(1175);
			match(OpenBrace);
			setState(1176);
			expression(0);
			setState(1177);
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
			setState(1179);
			match(DirectionAttributeName);
			setState(1180);
			match(Assign);
			setState(1181);
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
			setState(1183);
			match(DurationAttributeName);
			setState(1184);
			match(Assign);
			setState(1185);
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
			setState(1187);
			match(RepeatAttributeName);
			setState(1188);
			match(Assign);
			setState(1189);
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
			setState(1191);
			match(NgForDirective);
			setState(1192);
			match(Assign);
			setState(1193);
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
			setState(1195);
			match(NgIfDirective);
			setState(1196);
			match(Assign);
			setState(1197);
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
			setState(1199);
			match(Backtick);
			setState(1200);
			templateContent();
			setState(1201);
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
			setState(1212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1212);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LessThan:
					{
					setState(1203);
					html_element();
					}
					break;
				case AngularExpressionStart:
					{
					setState(1204);
					match(AngularExpressionStart);
					setState(1205);
					expression(0);
					setState(1206);
					match(AngularExpressionEnd);
					}
					break;
				case Identifier:
					{
					setState(1208);
					match(Identifier);
					}
					break;
				case StringLiteral:
					{
					setState(1209);
					match(StringLiteral);
					}
					break;
				case NumberLiteral:
					{
					setState(1210);
					match(NumberLiteral);
					}
					break;
				case BooleanLiteral:
					{
					setState(1211);
					match(BooleanLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Identifier - 74)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProductContext extends ParserRuleContext {
		public TerminalNode Product() { return getToken(AngularParser.Product, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public ProductPropertiesContext productProperties() {
			return getRuleContext(ProductPropertiesContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ProductBodyContext productBody() {
			return getRuleContext(ProductBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public ProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_product; }
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_product);
		try {
			setState(1230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1216);
				match(Product);
				setState(1217);
				match(OpenParen);
				setState(1218);
				productProperties();
				setState(1219);
				match(CloseParen);
				setState(1220);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1222);
				match(Product);
				setState(1223);
				match(OpenParen);
				setState(1224);
				productProperties();
				setState(1225);
				match(CloseParen);
				setState(1226);
				match(OpenBrace);
				setState(1227);
				productBody();
				setState(1228);
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

	public static class ProductPropertiesContext extends ParserRuleContext {
		public ProductIdContext productId() {
			return getRuleContext(ProductIdContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
		public List<ProductPropertyContext> productProperty() {
			return getRuleContexts(ProductPropertyContext.class);
		}
		public ProductPropertyContext productProperty(int i) {
			return getRuleContext(ProductPropertyContext.class,i);
		}
		public ProductPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productProperties; }
	}

	public final ProductPropertiesContext productProperties() throws RecognitionException {
		ProductPropertiesContext _localctx = new ProductPropertiesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_productProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1232);
			productId();
			setState(1237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1233);
				match(Comma);
				setState(1234);
				productProperty();
				}
				}
				setState(1239);
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

	public static class ProductIdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AngularParser.Id, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ProductIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productId; }
	}

	public final ProductIdContext productId() throws RecognitionException {
		ProductIdContext _localctx = new ProductIdContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_productId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			match(Id);
			setState(1241);
			match(Colon);
			setState(1242);
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

	public static class ProductPropertyContext extends ParserRuleContext {
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public TerminalNode ProductName() { return getToken(AngularParser.ProductName, 0); }
		public TerminalNode Price() { return getToken(AngularParser.Price, 0); }
		public TerminalNode Image() { return getToken(AngularParser.Image, 0); }
		public TerminalNode Description() { return getToken(AngularParser.Description, 0); }
		public ProductPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productProperty; }
	}

	public final ProductPropertyContext productProperty() throws RecognitionException {
		ProductPropertyContext _localctx = new ProductPropertyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_productProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ProductName) | (1L << Price) | (1L << Image) | (1L << Description))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1245);
			match(Colon);
			setState(1246);
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

	public static class ProductBodyContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public ProductBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productBody; }
	}

	public final ProductBodyContext productBody() throws RecognitionException {
		ProductBodyContext _localctx = new ProductBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_productBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (Identifier - 114)) | (1L << (Private - 114)) | (1L << (Public - 114)) | (1L << (Protected - 114)) | (1L << (Static - 114)) | (1L << (Let_Identify - 114)) | (1L << (Constructor - 114)))) != 0)) {
				{
				setState(1251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
				case 1:
					{
					setState(1248);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(1249);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(1250);
					product();
					}
					break;
				}
				}
				setState(1255);
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

	public static class ProductManagerContext extends ParserRuleContext {
		public TerminalNode ProductManager() { return getToken(AngularParser.ProductManager, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(AngularParser.OpenBrace, 0); }
		public ProductManagerBodyContext productManagerBody() {
			return getRuleContext(ProductManagerBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(AngularParser.CloseBrace, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ProductManagerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productManager; }
	}

	public final ProductManagerContext productManager() throws RecognitionException {
		ProductManagerContext _localctx = new ProductManagerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_productManager);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			match(ProductManager);
			setState(1257);
			match(OpenParen);
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(1258);
				match(StringLiteral);
				}
			}

			setState(1261);
			match(CloseParen);
			setState(1262);
			match(OpenBrace);
			setState(1263);
			productManagerBody();
			setState(1264);
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

	public static class ProductManagerBodyContext extends ParserRuleContext {
		public List<ProductContext> product() {
			return getRuleContexts(ProductContext.class);
		}
		public ProductContext product(int i) {
			return getRuleContext(ProductContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public ProductManagerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productManagerBody; }
	}

	public final ProductManagerBodyContext productManagerBody() throws RecognitionException {
		ProductManagerBodyContext _localctx = new ProductManagerBodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_productManagerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & ((1L << (Identifier - 114)) | (1L << (Private - 114)) | (1L << (Public - 114)) | (1L << (Protected - 114)) | (1L << (Static - 114)) | (1L << (Let_Identify - 114)) | (1L << (Constructor - 114)))) != 0)) {
				{
				setState(1269);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1266);
					product();
					}
					break;
				case 2:
					{
					setState(1267);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(1268);
					variableDeclaration();
					}
					break;
				}
				}
				setState(1273);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008c\u04fd\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\3\2\7\2\u00b2\n\2\f\2\16\2\u00b5\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00d2\n\3\3\4\3\4\3\4\5\4\u00d7\n\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00e2\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6\u00ed\n\6\3\7\3\7\5\7\u00f1\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u0108\n\n\f\n\16\n\u010b\13\n\5\n\u010d\n\n\3\n\3\n\3\13\3\13\3\13\5"+
		"\13\u0114\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\7\17\u0128\n\17\f\17\16\17\u012b\13\17\3"+
		"\17\3\17\3\20\3\20\3\20\5\20\u0132\n\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0149\n\24\f\24\16\24\u014c\13\24\5\24\u014e\n\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\5\25\u0158\n\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u0162\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u0170\n\30\f\30\16\30\u0173\13\30\3\31\5\31"+
		"\u0176\n\31\3\31\3\31\5\31\u017a\n\31\3\32\3\32\3\32\7\32\u017f\n\32\f"+
		"\32\16\32\u0182\13\32\3\32\5\32\u0185\n\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0197\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a0\n\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\7\36\u01aa\n\36\f\36\16\36\u01ad\13\36\5\36\u01af"+
		"\n\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01b7\n\37\6\37\u01b9\n\37\r"+
		"\37\16\37\u01ba\3 \3 \3 \5 \u01c0\n \3!\3!\3!\3!\7!\u01c6\n!\f!\16!\u01c9"+
		"\13!\3!\3!\3!\3\"\3\"\3\"\7\"\u01d1\n\"\f\"\16\"\u01d4\13\"\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\5$\u01e1\n$\3$\3$\5$\u01e5\n$\3%\3%\3%\3&\3&\3"+
		"&\3&\3&\3\'\3\'\3(\5(\u01f2\n(\3(\5(\u01f5\n(\3(\3(\3(\3(\3(\3(\3(\5("+
		"\u01fe\n(\3(\3(\3(\5(\u0203\n(\3(\5(\u0206\n(\3(\3(\3(\3(\3(\5(\u020d"+
		"\n(\3(\3(\3(\5(\u0212\n(\3(\5(\u0215\n(\3(\3(\3(\3(\3(\3(\5(\u021d\n("+
		"\3(\3(\3(\3(\3(\5(\u0224\n(\3(\3(\3(\5(\u0229\n(\3(\3(\5(\u022d\n(\3)"+
		"\5)\u0230\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u023c\n)\f)\16)\u023f\13"+
		")\5)\u0241\n)\3)\3)\3)\3)\3)\3)\3)\5)\u024a\n)\3)\3)\5)\u024e\n)\7)\u0250"+
		"\n)\f)\16)\u0253\13)\3)\3)\5)\u0257\n)\3*\3*\3*\3*\3*\3*\7*\u025f\n*\f"+
		"*\16*\u0262\13*\5*\u0264\n*\3*\3*\3*\3*\5*\u026a\n*\3*\3*\3+\3+\3+\3+"+
		"\3+\7+\u0273\n+\f+\16+\u0276\13+\5+\u0278\n+\3+\3+\3+\5+\u027d\n+\3+\3"+
		"+\7+\u0281\n+\f+\16+\u0284\13+\3+\3+\3,\5,\u0289\n,\3,\3,\3,\3,\3,\5,"+
		"\u0290\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u029c\n,\f,\16,\u029f\13,\7"+
		",\u02a1\n,\f,\16,\u02a4\13,\3,\3,\5,\u02a8\n,\3-\3-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\5.\u02b5\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02c1\n/\7/\u02c3"+
		"\n/\f/\16/\u02c6\13/\3/\3/\3\60\3\60\3\60\7\60\u02cd\n\60\f\60\16\60\u02d0"+
		"\13\60\3\60\3\60\3\60\5\60\u02d5\n\60\7\60\u02d7\n\60\f\60\16\60\u02da"+
		"\13\60\3\60\5\60\u02dd\n\60\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u02e5\n"+
		"\61\3\61\3\61\7\61\u02e9\n\61\f\61\16\61\u02ec\13\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61\u02fd"+
		"\n\61\f\61\16\61\u0300\13\61\5\61\u0302\n\61\3\61\3\61\5\61\u0306\n\61"+
		"\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u030e\n\62\f\62\16\62\u0311\13\62"+
		"\3\62\3\62\5\62\u0315\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\7\67\u032c"+
		"\n\67\f\67\16\67\u032f\13\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\78\u034a\n8\f8\168\u034d\138\58"+
		"\u034f\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\58\u0366\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\78\u0399\n8\f8\168\u039c\138\58\u039e\n8\38\3"+
		"8\38\38\38\38\38\38\38\38\38\78\u03ab\n8\f8\168\u03ae\138\39\39\39\39"+
		"\39\39\39\39\39\39\59\u03ba\n9\3:\3:\3:\3:\3:\7:\u03c1\n:\f:\16:\u03c4"+
		"\13:\5:\u03c6\n:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\6<\u03d6\n"+
		"<\r<\16<\u03d7\3=\3=\3=\5=\u03dd\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03e9"+
		"\n=\3=\3=\5=\u03ed\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03f9\n=\3>\3>"+
		"\3?\7?\u03fe\n?\f?\16?\u0401\13?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u041c\n@\f@\16@\u041f\13@\5@"+
		"\u0421\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u042d\n@\3@\3@\5@\u0431\n@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\5A\u043b\nA\3B\3B\3B\3B\5B\u0441\nB\3C\3C\3C"+
		"\7C\u0446\nC\fC\16C\u0449\13C\3C\3C\3C\3D\5D\u044f\nD\3D\3D\3D\7D\u0454"+
		"\nD\fD\16D\u0457\13D\3D\3D\7D\u045b\nD\fD\16D\u045e\13D\3D\3D\3E\3E\3"+
		"E\3E\3E\5E\u0467\nE\3E\6E\u046a\nE\rE\16E\u046b\3E\3E\3E\3E\5E\u0472\n"+
		"E\3E\6E\u0475\nE\rE\16E\u0476\7E\u0479\nE\fE\16E\u047c\13E\3E\3E\3F\3"+
		"F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\6Q\u04bf\nQ\rQ\16Q\u04c0"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u04d1\nR\3S\3S\3S\7S\u04d6"+
		"\nS\fS\16S\u04d9\13S\3T\3T\3T\3T\3U\3U\3U\3U\3V\3V\3V\7V\u04e6\nV\fV\16"+
		"V\u04e9\13V\3W\3W\3W\5W\u04ee\nW\3W\3W\3W\3W\3W\3X\3X\3X\7X\u04f8\nX\f"+
		"X\16X\u04fb\13X\3X\2\3nY\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\2\t\4\2\27\27$"+
		"$\3\2\u0080\u0083\4\2tt\u0086\u0086\5\2cdfhtt\4\2JJuu\3\2pq\3\2\23\26"+
		"\2\u0591\2\u00b3\3\2\2\2\4\u00d1\3\2\2\2\6\u00d6\3\2\2\2\b\u00e1\3\2\2"+
		"\2\n\u00ec\3\2\2\2\f\u00f0\3\2\2\2\16\u00f2\3\2\2\2\20\u00fa\3\2\2\2\22"+
		"\u0102\3\2\2\2\24\u0113\3\2\2\2\26\u0115\3\2\2\2\30\u0119\3\2\2\2\32\u011b"+
		"\3\2\2\2\34\u0123\3\2\2\2\36\u0131\3\2\2\2 \u0133\3\2\2\2\"\u0139\3\2"+
		"\2\2$\u013d\3\2\2\2&\u0141\3\2\2\2(\u0152\3\2\2\2*\u0161\3\2\2\2,\u0163"+
		"\3\2\2\2.\u0171\3\2\2\2\60\u0179\3\2\2\2\62\u017b\3\2\2\2\64\u0186\3\2"+
		"\2\2\66\u0196\3\2\2\28\u0198\3\2\2\2:\u01a3\3\2\2\2<\u01b2\3\2\2\2>\u01bc"+
		"\3\2\2\2@\u01c1\3\2\2\2B\u01cd\3\2\2\2D\u01d5\3\2\2\2F\u01d9\3\2\2\2H"+
		"\u01e6\3\2\2\2J\u01e9\3\2\2\2L\u01ee\3\2\2\2N\u022c\3\2\2\2P\u0256\3\2"+
		"\2\2R\u0258\3\2\2\2T\u026d\3\2\2\2V\u02a7\3\2\2\2X\u02a9\3\2\2\2Z\u02b4"+
		"\3\2\2\2\\\u02b6\3\2\2\2^\u02c9\3\2\2\2`\u0305\3\2\2\2b\u0307\3\2\2\2"+
		"d\u0316\3\2\2\2f\u031c\3\2\2\2h\u0323\3\2\2\2j\u0326\3\2\2\2l\u0329\3"+
		"\2\2\2n\u0365\3\2\2\2p\u03b9\3\2\2\2r\u03bb\3\2\2\2t\u03c9\3\2\2\2v\u03d5"+
		"\3\2\2\2x\u03f8\3\2\2\2z\u03fa\3\2\2\2|\u03ff\3\2\2\2~\u042c\3\2\2\2\u0080"+
		"\u043a\3\2\2\2\u0082\u0440\3\2\2\2\u0084\u0442\3\2\2\2\u0086\u044e\3\2"+
		"\2\2\u0088\u0461\3\2\2\2\u008a\u047f\3\2\2\2\u008c\u0485\3\2\2\2\u008e"+
		"\u048b\3\2\2\2\u0090\u0491\3\2\2\2\u0092\u0497\3\2\2\2\u0094\u049d\3\2"+
		"\2\2\u0096\u04a1\3\2\2\2\u0098\u04a5\3\2\2\2\u009a\u04a9\3\2\2\2\u009c"+
		"\u04ad\3\2\2\2\u009e\u04b1\3\2\2\2\u00a0\u04be\3\2\2\2\u00a2\u04d0\3\2"+
		"\2\2\u00a4\u04d2\3\2\2\2\u00a6\u04da\3\2\2\2\u00a8\u04de\3\2\2\2\u00aa"+
		"\u04e7\3\2\2\2\u00ac\u04ea\3\2\2\2\u00ae\u04f9\3\2\2\2\u00b0\u00b2\5\4"+
		"\3\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\7\2"+
		"\2\3\u00b7\3\3\2\2\2\u00b8\u00d2\5P)\2\u00b9\u00d2\5@!\2\u00ba\u00d2\5"+
		"N(\2\u00bb\u00d2\5T+\2\u00bc\u00d2\5b\62\2\u00bd\u00d2\5d\63\2\u00be\u00d2"+
		"\5`\61\2\u00bf\u00d2\5h\65\2\u00c0\u00d2\5j\66\2\u00c1\u00d2\5x=\2\u00c2"+
		"\u00d2\5\66\34\2\u00c3\u00d2\5(\25\2\u00c4\u00d2\5*\26\2\u00c5\u00d2\5"+
		"8\35\2\u00c6\u00d2\5,\27\2\u00c7\u00d2\5H%\2\u00c8\u00d2\5t;\2\u00c9\u00d2"+
		"\5F$\2\u00ca\u00d2\5\6\4\2\u00cb\u00d2\5\24\13\2\u00cc\u00d2\5\36\20\2"+
		"\u00cd\u00d2\5&\24\2\u00ce\u00d2\5r:\2\u00cf\u00d2\5\u00a2R\2\u00d0\u00d2"+
		"\5\u00acW\2\u00d1\u00b8\3\2\2\2\u00d1\u00b9\3\2\2\2\u00d1\u00ba\3\2\2"+
		"\2\u00d1\u00bb\3\2\2\2\u00d1\u00bc\3\2\2\2\u00d1\u00bd\3\2\2\2\u00d1\u00be"+
		"\3\2\2\2\u00d1\u00bf\3\2\2\2\u00d1\u00c0\3\2\2\2\u00d1\u00c1\3\2\2\2\u00d1"+
		"\u00c2\3\2\2\2\u00d1\u00c3\3\2\2\2\u00d1\u00c4\3\2\2\2\u00d1\u00c5\3\2"+
		"\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00c7\3\2\2\2\u00d1\u00c8\3\2\2\2\u00d1"+
		"\u00c9\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cb\3\2\2\2\u00d1\u00cc\3\2"+
		"\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d0\3\2\2\2\u00d2\5\3\2\2\2\u00d3\u00d7\5\b\5\2\u00d4\u00d7\5\n\6\2"+
		"\u00d5\u00d7\5\f\7\2\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\7\3\2\2\2\u00d8\u00d9\7\5\2\2\u00d9\u00da\7;\2\2\u00da"+
		"\u00db\7<\2\2\u00db\u00e2\5N(\2\u00dc\u00dd\7\5\2\2\u00dd\u00de\7;\2\2"+
		"\u00de\u00df\7q\2\2\u00df\u00e0\7<\2\2\u00e0\u00e2\5N(\2\u00e1\u00d8\3"+
		"\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\t\3\2\2\2\u00e3\u00e4\7\6\2\2\u00e4\u00e5"+
		"\7;\2\2\u00e5\u00e6\7<\2\2\u00e6\u00ed\5T+\2\u00e7\u00e8\7\6\2\2\u00e8"+
		"\u00e9\7;\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7<\2\2\u00eb\u00ed\5T+\2"+
		"\u00ec\u00e3\3\2\2\2\u00ec\u00e7\3\2\2\2\u00ed\13\3\2\2\2\u00ee\u00f1"+
		"\5\16\b\2\u00ef\u00f1\5\20\t\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2"+
		"\u00f1\r\3\2\2\2\u00f2\u00f3\7\7\2\2\u00f3\u00f4\7D\2\2\u00f4\u00f5\7"+
		"\b\2\2\u00f5\u00f6\7;\2\2\u00f6\u00f7\5\22\n\2\u00f7\u00f8\7<\2\2\u00f8"+
		"\u00f9\7?\2\2\u00f9\17\3\2\2\2\u00fa\u00fb\7\7\2\2\u00fb\u00fc\7D\2\2"+
		"\u00fc\u00fd\7\t\2\2\u00fd\u00fe\7;\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100"+
		"\7<\2\2\u0100\u0101\7?\2\2\u0101\21\3\2\2\2\u0102\u0103\7t\2\2\u0103\u010c"+
		"\7;\2\2\u0104\u0109\5n8\2\u0105\u0106\7@\2\2\u0106\u0108\5n8\2\u0107\u0105"+
		"\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010d\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\7<\2\2\u010f\23\3\2\2\2\u0110\u0114"+
		"\5\26\f\2\u0111\u0114\5\30\r\2\u0112\u0114\5\32\16\2\u0113\u0110\3\2\2"+
		"\2\u0113\u0111\3\2\2\2\u0113\u0112\3\2\2\2\u0114\25\3\2\2\2\u0115\u0116"+
		"\7\n\2\2\u0116\u0117\7A\2\2\u0117\u0118\7q\2\2\u0118\27\3\2\2\2\u0119"+
		"\u011a\7\13\2\2\u011a\31\3\2\2\2\u011b\u011c\7\f\2\2\u011c\u011d\7D\2"+
		"\2\u011d\u011e\7\r\2\2\u011e\u011f\7;\2\2\u011f\u0120\5\34\17\2\u0120"+
		"\u0121\7<\2\2\u0121\u0122\7?\2\2\u0122\33\3\2\2\2\u0123\u0124\79\2\2\u0124"+
		"\u0129\7q\2\2\u0125\u0126\7@\2\2\u0126\u0128\7q\2\2\u0127\u0125\3\2\2"+
		"\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7:\2\2\u012d\35\3\2\2\2\u012e"+
		"\u0132\5 \21\2\u012f\u0132\5\"\22\2\u0130\u0132\5$\23\2\u0131\u012e\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\37\3\2\2\2\u0133"+
		"\u0134\79\2\2\u0134\u0135\7\16\2\2\u0135\u0136\7:\2\2\u0136\u0137\7A\2"+
		"\2\u0137\u0138\7t\2\2\u0138!\3\2\2\2\u0139\u013a\7\17\2\2\u013a\u013b"+
		"\7A\2\2\u013b\u013c\7q\2\2\u013c#\3\2\2\2\u013d\u013e\7\20\2\2\u013e\u013f"+
		"\7A\2\2\u013f\u0140\7q\2\2\u0140%\3\2\2\2\u0141\u0142\5n8\2\u0142\u0143"+
		"\7D\2\2\u0143\u0144\7t\2\2\u0144\u014d\7;\2\2\u0145\u014a\5n8\2\u0146"+
		"\u0147\7@\2\2\u0147\u0149\5n8\2\u0148\u0146\3\2\2\2\u0149\u014c\3\2\2"+
		"\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a"+
		"\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\7<\2\2\u0150\u0151\7?\2\2\u0151\'\3\2\2\2\u0152\u0153\t\2\2\2\u0153"+
		"\u0157\7;\2\2\u0154\u0158\5\62\32\2\u0155\u0156\7=\2\2\u0156\u0158\7>"+
		"\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0159\3\2\2\2\u0159\u015a\7<\2\2\u015a\u015b\5*\26\2\u015b)\3\2\2\2\u015c"+
		"\u015d\7\35\2\2\u015d\u0162\5,\27\2\u015e\u015f\7\35\2\2\u015f\u0160\7"+
		"t\2\2\u0160\u0162\7?\2\2\u0161\u015c\3\2\2\2\u0161\u015e\3\2\2\2\u0162"+
		"+\3\2\2\2\u0163\u0164\7\'\2\2\u0164\u0165\7t\2\2\u0165\u0166\7=\2\2\u0166"+
		"\u0167\5.\30\2\u0167\u0168\7>\2\2\u0168-\3\2\2\2\u0169\u0170\5N(\2\u016a"+
		"\u0170\5V,\2\u016b\u0170\5P)\2\u016c\u0170\5R*\2\u016d\u0170\5T+\2\u016e"+
		"\u0170\5\4\3\2\u016f\u0169\3\2\2\2\u016f\u016a\3\2\2\2\u016f\u016b\3\2"+
		"\2\2\u016f\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170"+
		"\u0173\3\2\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172/\3\2\2\2"+
		"\u0173\u0171\3\2\2\2\u0174\u0176\5\62\32\2\u0175\u0174\3\2\2\2\u0175\u0176"+
		"\3\2\2\2\u0176\u017a\3\2\2\2\u0177\u0178\7=\2\2\u0178\u017a\7>\2\2\u0179"+
		"\u0175\3\2\2\2\u0179\u0177\3\2\2\2\u017a\61\3\2\2\2\u017b\u0180\5\64\33"+
		"\2\u017c\u017d\7@\2\2\u017d\u017f\5\64\33\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0184\3\2"+
		"\2\2\u0182\u0180\3\2\2\2\u0183\u0185\7@\2\2\u0184\u0183\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\63\3\2\2\2\u0186\u0187\7t\2\2\u0187\u0188\7B\2\2"+
		"\u0188\u0189\5Z.\2\u0189\65\3\2\2\2\u018a\u018b\7\34\2\2\u018b\u018c\7"+
		"=\2\2\u018c\u018d\7t\2\2\u018d\u018e\7>\2\2\u018e\u018f\7`\2\2\u018f\u0190"+
		"\7q\2\2\u0190\u0197\7?\2\2\u0191\u0192\7\34\2\2\u0192\u0193\7t\2\2\u0193"+
		"\u0194\7`\2\2\u0194\u0195\7q\2\2\u0195\u0197\7?\2\2\u0196\u018a\3\2\2"+
		"\2\u0196\u0191\3\2\2\2\u0197\67\3\2\2\2\u0198\u0199\7y\2\2\u0199\u019a"+
		"\7D\2\2\u019a\u019b\7t\2\2\u019b\u019f\7A\2\2\u019c\u01a0\5:\36\2\u019d"+
		"\u01a0\5<\37\2\u019e\u01a0\5> \2\u019f\u019c\3\2\2\2\u019f\u019d\3\2\2"+
		"\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\7?\2\2\u01a29\3"+
		"\2\2\2\u01a3\u01a4\7z\2\2\u01a4\u01a5\7t\2\2\u01a5\u01ae\7;\2\2\u01a6"+
		"\u01ab\5n8\2\u01a7\u01a8\7@\2\2\u01a8\u01aa\5n8\2\u01a9\u01a7\3\2\2\2"+
		"\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01af"+
		"\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0\u01b1\7<\2\2\u01b1;\3\2\2\2\u01b2\u01b8\7y\2\2\u01b3"+
		"\u01b6\7D\2\2\u01b4\u01b7\7t\2\2\u01b5\u01b7\5r:\2\u01b6\u01b4\3\2\2\2"+
		"\u01b6\u01b5\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9\u01ba"+
		"\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb=\3\2\2\2\u01bc"+
		"\u01bf\7t\2\2\u01bd\u01be\7D\2\2\u01be\u01c0\7t\2\2\u01bf\u01bd\3\2\2"+
		"\2\u01bf\u01c0\3\2\2\2\u01c0?\3\2\2\2\u01c1\u01c2\7{\2\2\u01c2\u01c3\7"+
		"t\2\2\u01c3\u01c7\7=\2\2\u01c4\u01c6\5B\"\2\u01c5\u01c4\3\2\2\2\u01c6"+
		"\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2"+
		"\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\7>\2\2\u01cb\u01cc\7?\2\2\u01ccA"+
		"\3\2\2\2\u01cd\u01d2\5D#\2\u01ce\u01cf\7@\2\2\u01cf\u01d1\5D#\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3C\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7"+
		"\7A\2\2\u01d7\u01d8\5Z.\2\u01d8E\3\2\2\2\u01d9\u01da\7|\2\2\u01da\u01db"+
		"\7D\2\2\u01db\u01dc\7}\2\2\u01dc\u01e0\7;\2\2\u01dd\u01e1\7t\2\2\u01de"+
		"\u01e1\7q\2\2\u01df\u01e1\5Z.\2\u01e0\u01dd\3\2\2\2\u01e0\u01de\3\2\2"+
		"\2\u01e0\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\7<\2\2\u01e3\u01e5"+
		"\7?\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5G\3\2\2\2\u01e6\u01e7"+
		"\7~\2\2\u01e7\u01e8\5,\27\2\u01e8I\3\2\2\2\u01e9\u01ea\7\177\2\2\u01ea"+
		"\u01eb\7=\2\2\u01eb\u01ec\5.\30\2\u01ec\u01ed\7>\2\2\u01edK\3\2\2\2\u01ee"+
		"\u01ef\t\3\2\2\u01efM\3\2\2\2\u01f0\u01f2\5L\'\2\u01f1\u01f0\3\2\2\2\u01f1"+
		"\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\7\u0084\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7t\2\2\u01f7"+
		"\u01f8\7B\2\2\u01f8\u01f9\5X-\2\u01f9\u01fd\7A\2\2\u01fa\u01fe\5n8\2\u01fb"+
		"\u01fe\5Z.\2\u01fc\u01fe\5\u009eP\2\u01fd\u01fa\3\2\2\2\u01fd\u01fb\3"+
		"\2\2\2\u01fd\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\7?\2\2\u0200"+
		"\u022d\3\2\2\2\u0201\u0203\5L\'\2\u0202\u0201\3\2\2\2\u0202\u0203\3\2"+
		"\2\2\u0203\u0205\3\2\2\2\u0204\u0206\7\u0084\2\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\7t\2\2\u0208\u020c\7A\2"+
		"\2\u0209\u020d\5n8\2\u020a\u020d\5Z.\2\u020b\u020d\5\u009eP\2\u020c\u0209"+
		"\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e"+
		"\u020f\7?\2\2\u020f\u022d\3\2\2\2\u0210\u0212\5L\'\2\u0211\u0210\3\2\2"+
		"\2\u0211\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0215\7\u0084\2\2\u0214"+
		"\u0213\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\7t"+
		"\2\2\u0217\u0218\7B\2\2\u0218\u0219\5X-\2\u0219\u021a\7?\2\2\u021a\u022d"+
		"\3\2\2\2\u021b\u021d\5L\'\2\u021c\u021b\3\2\2\2\u021c\u021d\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u021f\7t\2\2\u021f\u0223\7A\2\2\u0220\u0224\5n8\2"+
		"\u0221\u0224\5Z.\2\u0222\u0224\5\u009eP\2\u0223\u0220\3\2\2\2\u0223\u0221"+
		"\3\2\2\2\u0223\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\7?\2\2\u0226"+
		"\u022d\3\2\2\2\u0227\u0229\5L\'\2\u0228\u0227\3\2\2\2\u0228\u0229\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7t\2\2\u022b\u022d\7?\2\2\u022c\u01f1"+
		"\3\2\2\2\u022c\u0202\3\2\2\2\u022c\u0211\3\2\2\2\u022c\u021c\3\2\2\2\u022c"+
		"\u0228\3\2\2\2\u022dO\3\2\2\2\u022e\u0230\7\u0084\2\2\u022f\u022e\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7t\2\2\u0232"+
		"\u0233\7B\2\2\u0233\u0234\5X-\2\u0234\u0235\79\2\2\u0235\u0236\7:\2\2"+
		"\u0236\u0237\7A\2\2\u0237\u0240\79\2\2\u0238\u023d\5Z.\2\u0239\u023a\7"+
		"@\2\2\u023a\u023c\5Z.\2\u023b\u0239\3\2\2\2\u023c\u023f\3\2\2\2\u023d"+
		"\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u0240\u0238\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242"+
		"\u0243\7:\2\2\u0243\u0244\7?\2\2\u0244\u0257\3\2\2\2\u0245\u0246\7t\2"+
		"\2\u0246\u0247\7A\2\2\u0247\u0249\79\2\2\u0248\u024a\5Z.\2\u0249\u0248"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0251\3\2\2\2\u024b\u024d\5Z.\2\u024c"+
		"\u024e\7@\2\2\u024d\u024c\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2"+
		"\2\2\u024f\u024b\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0254\3\2\2\2\u0253\u0251\3\2\2\2\u0254\u0255\7:"+
		"\2\2\u0255\u0257\7?\2\2\u0256\u022f\3\2\2\2\u0256\u0245\3\2\2\2\u0257"+
		"Q\3\2\2\2\u0258\u0259\7~\2\2\u0259\u025a\7t\2\2\u025a\u0263\7;\2\2\u025b"+
		"\u0260\5p9\2\u025c\u025d\7@\2\2\u025d\u025f\5p9\2\u025e\u025c\3\2\2\2"+
		"\u025f\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0264"+
		"\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u025b\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\7<\2\2\u0266\u0269\7B\2\2\u0267\u026a\5X-\2"+
		"\u0268\u026a\7\u0085\2\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u026c\7?\2\2\u026cS\3\2\2\2\u026d\u026e\t\4\2\2\u026e"+
		"\u0277\7;\2\2\u026f\u0274\5p9\2\u0270\u0271\7@\2\2\u0271\u0273\5p9\2\u0272"+
		"\u0270\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0274\u0275\3\2"+
		"\2\2\u0275\u0278\3\2\2\2\u0276\u0274\3\2\2\2\u0277\u026f\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027c\7<\2\2\u027a\u027b\7B\2"+
		"\2\u027b\u027d\5X-\2\u027c\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e"+
		"\3\2\2\2\u027e\u0282\7=\2\2\u027f\u0281\5\4\3\2\u0280\u027f\3\2\2\2\u0281"+
		"\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2"+
		"\2\2\u0284\u0282\3\2\2\2\u0285\u0286\7>\2\2\u0286U\3\2\2\2\u0287\u0289"+
		"\5L\'\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\7t\2\2\u028b\u028c\7B\2\2\u028c\u028d\7t\2\2\u028d\u02a8\7?\2\2"+
		"\u028e\u0290\5L\'\2\u028f\u028e\3\2\2\2\u028f\u0290\3\2\2\2\u0290\u0291"+
		"\3\2\2\2\u0291\u0292\7t\2\2\u0292\u0293\7B\2\2\u0293\u0294\7t\2\2\u0294"+
		"\u0295\7A\2\2\u0295\u0296\7z\2\2\u0296\u0297\7t\2\2\u0297\u02a2\7;\2\2"+
		"\u0298\u029d\5Z.\2\u0299\u029a\7@\2\2\u029a\u029c\5Z.\2\u029b\u0299\3"+
		"\2\2\2\u029c\u029f\3\2\2\2\u029d\u029b\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u02a0\u0298\3\2\2\2\u02a1\u02a4\3\2"+
		"\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\3\2\2\2\u02a4"+
		"\u02a2\3\2\2\2\u02a5\u02a6\7<\2\2\u02a6\u02a8\7?\2\2\u02a7\u0288\3\2\2"+
		"\2\u02a7\u028f\3\2\2\2\u02a8W\3\2\2\2\u02a9\u02aa\t\5\2\2\u02aaY\3\2\2"+
		"\2\u02ab\u02b5\7p\2\2\u02ac\u02b5\7q\2\2\u02ad\u02b5\7r\2\2\u02ae\u02b5"+
		"\5^\60\2\u02af\u02b5\5\\/\2\u02b0\u02b5\7\u0087\2\2\u02b1\u02b5\5t;\2"+
		"\u02b2\u02b5\5\u0084C\2\u02b3\u02b5\5\u009eP\2\u02b4\u02ab\3\2\2\2\u02b4"+
		"\u02ac\3\2\2\2\u02b4\u02ad\3\2\2\2\u02b4\u02ae\3\2\2\2\u02b4\u02af\3\2"+
		"\2\2\u02b4\u02b0\3\2\2\2\u02b4\u02b1\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b4"+
		"\u02b3\3\2\2\2\u02b5[\3\2\2\2\u02b6\u02b7\7=\2\2\u02b7\u02b8\7t\2\2\u02b8"+
		"\u02b9\7B\2\2\u02b9\u02c4\5Z.\2\u02ba\u02bb\7@\2\2\u02bb\u02bc\7t\2\2"+
		"\u02bc\u02bd\7B\2\2\u02bd\u02be\5Z.\2\u02be\u02c0\3\2\2\2\u02bf\u02c1"+
		"\7@\2\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2\2\2\u02c2"+
		"\u02ba\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c7\u02c8\7>\2\2\u02c8"+
		"]\3\2\2\2\u02c9\u02ce\79\2\2\u02ca\u02cd\7t\2\2\u02cb\u02cd\5Z.\2\u02cc"+
		"\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd\u02d0\3\2\2\2\u02ce\u02cc\3\2"+
		"\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d8\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d1"+
		"\u02d4\7@\2\2\u02d2\u02d5\7t\2\2\u02d3\u02d5\5Z.\2\u02d4\u02d2\3\2\2\2"+
		"\u02d4\u02d3\3\2\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d1\3\2\2\2\u02d7\u02da"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02dc\3\2\2\2\u02da"+
		"\u02d8\3\2\2\2\u02db\u02dd\7@\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2"+
		"\2\2\u02dd\u02de\3\2\2\2\u02de\u02df\7:\2\2\u02df_\3\2\2\2\u02e0\u02e1"+
		"\7t\2\2\u02e1\u02e4\7A\2\2\u02e2\u02e5\5n8\2\u02e3\u02e5\5\u009eP\2\u02e4"+
		"\u02e2\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5\u02ea\3\2\2\2\u02e6\u02e7\7@"+
		"\2\2\u02e7\u02e9\5n8\2\u02e8\u02e6\3\2\2\2\u02e9\u02ec\3\2\2\2\u02ea\u02e8"+
		"\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ed\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ed"+
		"\u02ee\7?\2\2\u02ee\u0306\3\2\2\2\u02ef\u02f0\7y\2\2\u02f0\u02f1\7D\2"+
		"\2\u02f1\u02f2\7t\2\2\u02f2\u02f3\7A\2\2\u02f3\u02f4\5n8\2\u02f4\u02f5"+
		"\7?\2\2\u02f5\u0306\3\2\2\2\u02f6\u02f7\7t\2\2\u02f7\u02f8\7A\2\2\u02f8"+
		"\u0301\79\2\2\u02f9\u02fe\5Z.\2\u02fa\u02fb\7@\2\2\u02fb\u02fd\5Z.\2\u02fc"+
		"\u02fa\3\2\2\2\u02fd\u0300\3\2\2\2\u02fe\u02fc\3\2\2\2\u02fe\u02ff\3\2"+
		"\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0301\u02f9\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0304\7:\2\2\u0304\u0306\7?\2"+
		"\2\u0305\u02e0\3\2\2\2\u0305\u02ef\3\2\2\2\u0305\u02f6\3\2\2\2\u0306a"+
		"\3\2\2\2\u0307\u0308\7\u0088\2\2\u0308\u0309\7;\2\2\u0309\u030a\5n8\2"+
		"\u030a\u030b\7<\2\2\u030b\u030f\5l\67\2\u030c\u030e\5f\64\2\u030d\u030c"+
		"\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0314\3\2\2\2\u0311\u030f\3\2\2\2\u0312\u0313\7\u0089\2\2\u0313\u0315"+
		"\5l\67\2\u0314\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315c\3\2\2\2\u0316"+
		"\u0317\7\u008a\2\2\u0317\u0318\7;\2\2\u0318\u0319\5n8\2\u0319\u031a\7"+
		"<\2\2\u031a\u031b\5l\67\2\u031be\3\2\2\2\u031c\u031d\7\u0089\2\2\u031d"+
		"\u031e\7\u0088\2\2\u031e\u031f\7;\2\2\u031f\u0320\5n8\2\u0320\u0321\7"+
		"<\2\2\u0321\u0322\5l\67\2\u0322g\3\2\2\2\u0323\u0324\7\u008b\2\2\u0324"+
		"\u0325\7?\2\2\u0325i\3\2\2\2\u0326\u0327\7\u008c\2\2\u0327\u0328\7?\2"+
		"\2\u0328k\3\2\2\2\u0329\u032d\7=\2\2\u032a\u032c\5\4\3\2\u032b\u032a\3"+
		"\2\2\2\u032c\u032f\3\2\2\2\u032d\u032b\3\2\2\2\u032d\u032e\3\2\2\2\u032e"+
		"\u0330\3\2\2\2\u032f\u032d\3\2\2\2\u0330\u0331\7>\2\2\u0331m\3\2\2\2\u0332"+
		"\u0333\b8\1\2\u0333\u0334\7;\2\2\u0334\u0335\5n8\2\u0335\u0336\7<\2\2"+
		"\u0336\u0366\3\2\2\2\u0337\u0338\7t\2\2\u0338\u0339\79\2\2\u0339\u033a"+
		"\5n8\2\u033a\u033b\7:\2\2\u033b\u0366\3\2\2\2\u033c\u033d\7U\2\2\u033d"+
		"\u033e\5n8\2\u033e\u033f\7V\2\2\u033f\u0366\3\2\2\2\u0340\u0341\7y\2\2"+
		"\u0341\u0342\7D\2\2\u0342\u0343\7t\2\2\u0343\u0344\7D\2\2\u0344\u0345"+
		"\7t\2\2\u0345\u034e\7;\2\2\u0346\u034b\5n8\2\u0347\u0348\7@\2\2\u0348"+
		"\u034a\5n8\2\u0349\u0347\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2"+
		"\2\u034b\u034c\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0346"+
		"\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0366\7<\2\2\u0351"+
		"\u0352\7t\2\2\u0352\u0353\7e\2\2\u0353\u0366\5n8\n\u0354\u0355\7t\2\2"+
		"\u0355\u0356\7e\2\2\u0356\u0366\7t\2\2\u0357\u0358\7y\2\2\u0358\u0359"+
		"\7D\2\2\u0359\u035a\7t\2\2\u035a\u035b\7A\2\2\u035b\u0366\5n8\b\u035c"+
		"\u035d\7y\2\2\u035d\u035e\7D\2\2\u035e\u0366\7t\2\2\u035f\u0360\7t\2\2"+
		"\u0360\u0361\7D\2\2\u0361\u0366\7t\2\2\u0362\u0366\5Z.\2\u0363\u0366\7"+
		"t\2\2\u0364\u0366\5t;\2\u0365\u0332\3\2\2\2\u0365\u0337\3\2\2\2\u0365"+
		"\u033c\3\2\2\2\u0365\u0340\3\2\2\2\u0365\u0351\3\2\2\2\u0365\u0354\3\2"+
		"\2\2\u0365\u0357\3\2\2\2\u0365\u035c\3\2\2\2\u0365\u035f\3\2\2\2\u0365"+
		"\u0362\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0364\3\2\2\2\u0366\u03ac\3\2"+
		"\2\2\u0367\u0368\f\36\2\2\u0368\u0369\7G\2\2\u0369\u03ab\5n8\37\u036a"+
		"\u036b\f\35\2\2\u036b\u036c\7I\2\2\u036c\u03ab\5n8\36\u036d\u036e\f\34"+
		"\2\2\u036e\u036f\7J\2\2\u036f\u03ab\5n8\35\u0370\u0371\f\33\2\2\u0371"+
		"\u0372\7E\2\2\u0372\u03ab\5n8\34\u0373\u0374\f\32\2\2\u0374\u0375\7F\2"+
		"\2\u0375\u03ab\5n8\33\u0376\u0377\f\31\2\2\u0377\u0378\7L\2\2\u0378\u03ab"+
		"\5n8\32\u0379\u037a\f\30\2\2\u037a\u037b\7M\2\2\u037b\u03ab\5n8\31\u037c"+
		"\u037d\f\27\2\2\u037d\u037e\7N\2\2\u037e\u03ab\5n8\30\u037f\u0380\f\26"+
		"\2\2\u0380\u0381\7O\2\2\u0381\u03ab\5n8\27\u0382\u0383\f\25\2\2\u0383"+
		"\u0384\7Q\2\2\u0384\u03ab\5n8\26\u0385\u0386\f\24\2\2\u0386\u0387\7R\2"+
		"\2\u0387\u03ab\5n8\25\u0388\u0389\f\23\2\2\u0389\u038a\7P\2\2\u038a\u03ab"+
		"\5n8\24\u038b\u038c\f\22\2\2\u038c\u038d\7S\2\2\u038d\u03ab\5n8\23\u038e"+
		"\u038f\f\21\2\2\u038f\u0390\7T\2\2\u0390\u03ab\5n8\22\u0391\u0392\f\r"+
		"\2\2\u0392\u0393\7D\2\2\u0393\u0394\7t\2\2\u0394\u039d\7;\2\2\u0395\u039a"+
		"\5n8\2\u0396\u0397\7@\2\2\u0397\u0399\5n8\2\u0398\u0396\3\2\2\2\u0399"+
		"\u039c\3\2\2\2\u039a\u0398\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039e\3\2"+
		"\2\2\u039c\u039a\3\2\2\2\u039d\u0395\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03ab\7<\2\2\u03a0\u03a1\f\13\2\2\u03a1\u03a2\7D"+
		"\2\2\u03a2\u03a3\7t\2\2\u03a3\u03a4\7;\2\2\u03a4\u03a5\7t\2\2\u03a5\u03a6"+
		"\7e\2\2\u03a6\u03a7\5n8\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9\7<\2\2\u03a9"+
		"\u03ab\3\2\2\2\u03aa\u0367\3\2\2\2\u03aa\u036a\3\2\2\2\u03aa\u036d\3\2"+
		"\2\2\u03aa\u0370\3\2\2\2\u03aa\u0373\3\2\2\2\u03aa\u0376\3\2\2\2\u03aa"+
		"\u0379\3\2\2\2\u03aa\u037c\3\2\2\2\u03aa\u037f\3\2\2\2\u03aa\u0382\3\2"+
		"\2\2\u03aa\u0385\3\2\2\2\u03aa\u0388\3\2\2\2\u03aa\u038b\3\2\2\2\u03aa"+
		"\u038e\3\2\2\2\u03aa\u0391\3\2\2\2\u03aa\u03a0\3\2\2\2\u03ab\u03ae\3\2"+
		"\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ado\3\2\2\2\u03ae\u03ac"+
		"\3\2\2\2\u03af\u03b0\7t\2\2\u03b0\u03b1\7B\2\2\u03b1\u03ba\5X-\2\u03b2"+
		"\u03b3\7t\2\2\u03b3\u03b4\7B\2\2\u03b4\u03b5\5X-\2\u03b5\u03b6\7A\2\2"+
		"\u03b6\u03b7\5Z.\2\u03b7\u03ba\3\2\2\2\u03b8\u03ba\7t\2\2\u03b9\u03af"+
		"\3\2\2\2\u03b9\u03b2\3\2\2\2\u03b9\u03b8\3\2\2\2\u03baq\3\2\2\2\u03bb"+
		"\u03bc\7t\2\2\u03bc\u03c5\7;\2\2\u03bd\u03c2\5n8\2\u03be\u03bf\7@\2\2"+
		"\u03bf\u03c1\5n8\2\u03c0\u03be\3\2\2\2\u03c1\u03c4\3\2\2\2\u03c2\u03c0"+
		"\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c6\3\2\2\2\u03c4\u03c2\3\2\2\2\u03c5"+
		"\u03bd\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c8\7<"+
		"\2\2\u03c8s\3\2\2\2\u03c9\u03ca\7s\2\2\u03ca\u03cb\5v<\2\u03cb\u03cc\7"+
		"s\2\2\u03ccu\3\2\2\2\u03cd\u03d6\5x=\2\u03ce\u03cf\7U\2\2\u03cf\u03d0"+
		"\5n8\2\u03d0\u03d1\7V\2\2\u03d1\u03d6\3\2\2\2\u03d2\u03d6\7t\2\2\u03d3"+
		"\u03d6\7q\2\2\u03d4\u03d6\7p\2\2\u03d5\u03cd\3\2\2\2\u03d5\u03ce\3\2\2"+
		"\2\u03d5\u03d2\3\2\2\2\u03d5\u03d3\3\2\2\2\u03d5\u03d4\3\2\2\2\u03d6\u03d7"+
		"\3\2\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8w\3\2\2\2\u03d9"+
		"\u03da\7L\2\2\u03da\u03dc\5z>\2\u03db\u03dd\5|?\2\u03dc\u03db\3\2\2\2"+
		"\u03dc\u03dd\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03df\7M\2\2\u03df\u03e0"+
		"\5v<\2\u03e0\u03e1\7L\2\2\u03e1\u03e2\7I\2\2\u03e2\u03e3\5z>\2\u03e3\u03e4"+
		"\7M\2\2\u03e4\u03f9\3\2\2\2\u03e5\u03e6\7L\2\2\u03e6\u03e8\5z>\2\u03e7"+
		"\u03e9\5|?\2\u03e8\u03e7\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\3\2\2"+
		"\2\u03ea\u03ec\7M\2\2\u03eb\u03ed\5v<\2\u03ec\u03eb\3\2\2\2\u03ec\u03ed"+
		"\3\2\2\2\u03ed\u03f9\3\2\2\2\u03ee\u03ef\7L\2\2\u03ef\u03f0\5z>\2\u03f0"+
		"\u03f1\5|?\2\u03f1\u03f2\7I\2\2\u03f2\u03f3\7M\2\2\u03f3\u03f9\3\2\2\2"+
		"\u03f4\u03f5\7L\2\2\u03f5\u03f6\5z>\2\u03f6\u03f7\7M\2\2\u03f7\u03f9\3"+
		"\2\2\2\u03f8\u03d9\3\2\2\2\u03f8\u03e5\3\2\2\2\u03f8\u03ee\3\2\2\2\u03f8"+
		"\u03f4\3\2\2\2\u03f9y\3\2\2\2\u03fa\u03fb\7t\2\2\u03fb{\3\2\2\2\u03fc"+
		"\u03fe\5~@\2\u03fd\u03fc\3\2\2\2\u03fe\u0401\3\2\2\2\u03ff\u03fd\3\2\2"+
		"\2\u03ff\u0400\3\2\2\2\u0400}\3\2\2\2\u0401\u03ff\3\2\2\2\u0402\u042d"+
		"\7t\2\2\u0403\u042d\7\'\2\2\u0404\u042d\7\30\2\2\u0405\u042d\7\31\2\2"+
		"\u0406\u042d\7\32\2\2\u0407\u042d\7\33\2\2\u0408\u042d\7+\2\2\u0409\u042d"+
		"\7,\2\2\u040a\u042d\7-\2\2\u040b\u042d\7.\2\2\u040c\u042d\7/\2\2\u040d"+
		"\u042d\7\60\2\2\u040e\u042d\7\64\2\2\u040f\u042d\7\65\2\2\u0410\u042d"+
		"\7\66\2\2\u0411\u042d\7\67\2\2\u0412\u042d\78\2\2\u0413\u042d\5\u009c"+
		"O\2\u0414\u042d\5\u009aN\2\u0415\u042d\5\u008cG\2\u0416\u042d\5\u008e"+
		"H\2\u0417\u0420\79\2\2\u0418\u0421\7t\2\2\u0419\u041d\7t\2\2\u041a\u041c"+
		"\5\u0080A\2\u041b\u041a\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2"+
		"\2\u041d\u041e\3\2\2\2\u041e\u0421\3\2\2\2\u041f\u041d\3\2\2\2\u0420\u0418"+
		"\3\2\2\2\u0420\u0419\3\2\2\2\u0421\u0422\3\2\2\2\u0422\u042d\7:\2\2\u0423"+
		"\u0424\7;\2\2\u0424\u0425\7t\2\2\u0425\u042d\7<\2\2\u0426\u0427\7G\2\2"+
		"\u0427\u042d\7t\2\2\u0428\u042d\7\3\2\2\u0429\u042d\7\4\2\2\u042a\u042d"+
		"\7q\2\2\u042b\u042d\7p\2\2\u042c\u0402\3\2\2\2\u042c\u0403\3\2\2\2\u042c"+
		"\u0404\3\2\2\2\u042c\u0405\3\2\2\2\u042c\u0406\3\2\2\2\u042c\u0407\3\2"+
		"\2\2\u042c\u0408\3\2\2\2\u042c\u0409\3\2\2\2\u042c\u040a\3\2\2\2\u042c"+
		"\u040b\3\2\2\2\u042c\u040c\3\2\2\2\u042c\u040d\3\2\2\2\u042c\u040e\3\2"+
		"\2\2\u042c\u040f\3\2\2\2\u042c\u0410\3\2\2\2\u042c\u0411\3\2\2\2\u042c"+
		"\u0412\3\2\2\2\u042c\u0413\3\2\2\2\u042c\u0414\3\2\2\2\u042c\u0415\3\2"+
		"\2\2\u042c\u0416\3\2\2\2\u042c\u0417\3\2\2\2\u042c\u0423\3\2\2\2\u042c"+
		"\u0426\3\2\2\2\u042c\u0428\3\2\2\2\u042c\u0429\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042c\u042b\3\2\2\2\u042d\u0430\3\2\2\2\u042e\u042f\7A\2\2\u042f"+
		"\u0431\5\u0082B\2\u0430\u042e\3\2\2\2\u0430\u0431\3\2\2\2\u0431\177\3"+
		"\2\2\2\u0432\u0433\7D\2\2\u0433\u043b\7t\2\2\u0434\u0435\79\2\2\u0435"+
		"\u0436\5n8\2\u0436\u0437\7:\2\2\u0437\u043b\3\2\2\2\u0438\u0439\7D\2\2"+
		"\u0439\u043b\5r:\2\u043a\u0432\3\2\2\2\u043a\u0434\3\2\2\2\u043a\u0438"+
		"\3\2\2\2\u043b\u0081\3\2\2\2\u043c\u0441\5Z.\2\u043d\u0441\5n8\2\u043e"+
		"\u0441\7q\2\2\u043f\u0441\7t\2\2\u0440\u043c\3\2\2\2\u0440\u043d\3\2\2"+
		"\2\u0440\u043e\3\2\2\2\u0440\u043f\3\2\2\2\u0441\u0083\3\2\2\2\u0442\u0443"+
		"\79\2\2\u0443\u0447\7s\2\2\u0444\u0446\5\u0086D\2\u0445\u0444\3\2\2\2"+
		"\u0446\u0449\3\2\2\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u044a"+
		"\3\2\2\2\u0449\u0447\3\2\2\2\u044a\u044b\7s\2\2\u044b\u044c\7:\2\2\u044c"+
		"\u0085\3\2\2\2\u044d\u044f\7D\2\2\u044e\u044d\3\2\2\2\u044e\u044f\3\2"+
		"\2\2\u044f\u0450\3\2\2\2\u0450\u0455\7t\2\2\u0451\u0452\7B\2\2\u0452\u0454"+
		"\7t\2\2\u0453\u0451\3\2\2\2\u0454\u0457\3\2\2\2\u0455\u0453\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0458\3\2\2\2\u0457\u0455\3\2\2\2\u0458\u045c\7="+
		"\2\2\u0459\u045b\5\u0088E\2\u045a\u0459\3\2\2\2\u045b\u045e\3\2\2\2\u045c"+
		"\u045a\3\2\2\2\u045c\u045d\3\2\2\2\u045d\u045f\3\2\2\2\u045e\u045c\3\2"+
		"\2\2\u045f\u0460\7>\2\2\u0460\u0087\3\2\2\2\u0461\u0462\7t\2\2\u0462\u0469"+
		"\7B\2\2\u0463\u046a\7t\2\2\u0464\u0466\7p\2\2\u0465\u0467\t\6\2\2\u0466"+
		"\u0465\3\2\2\2\u0466\u0467\3\2\2\2\u0467\u046a\3\2\2\2\u0468\u046a\5r"+
		":\2\u0469\u0463\3\2\2\2\u0469\u0464\3\2\2\2\u0469\u0468\3\2\2\2\u046a"+
		"\u046b\3\2\2\2\u046b\u0469\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u047a\3\2"+
		"\2\2\u046d\u0474\7@\2\2\u046e\u0475\7t\2\2\u046f\u0471\7p\2\2\u0470\u0472"+
		"\t\6\2\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472\u0475\3\2\2\2\u0473"+
		"\u0475\5r:\2\u0474\u046e\3\2\2\2\u0474\u046f\3\2\2\2\u0474\u0473\3\2\2"+
		"\2\u0475\u0476\3\2\2\2\u0476\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0479"+
		"\3\2\2\2\u0478\u046d\3\2\2\2\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a"+
		"\u047b\3\2\2\2\u047b\u047d\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\7?"+
		"\2\2\u047e\u0089\3\2\2\2\u047f\u0480\7/\2\2\u0480\u0481\7A\2\2\u0481\u0482"+
		"\7=\2\2\u0482\u0483\5n8\2\u0483\u0484\7>\2\2\u0484\u008b\3\2\2\2\u0485"+
		"\u0486\7;\2\2\u0486\u0487\7\62\2\2\u0487\u0488\7<\2\2\u0488\u0489\7A\2"+
		"\2\u0489\u048a\7q\2\2\u048a\u008d\3\2\2\2\u048b\u048c\7;\2\2\u048c\u048d"+
		"\7\63\2\2\u048d\u048e\7<\2\2\u048e\u048f\7A\2\2\u048f\u0490\7q\2\2\u0490"+
		"\u008f\3\2\2\2\u0491\u0492\7;\2\2\u0492\u0493\7\61\2\2\u0493\u0494\7<"+
		"\2\2\u0494\u0495\7A\2\2\u0495\u0496\7q\2\2\u0496\u0091\3\2\2\2\u0497\u0498"+
		"\78\2\2\u0498\u0499\7A\2\2\u0499\u049a\7=\2\2\u049a\u049b\5n8\2\u049b"+
		"\u049c\7>\2\2\u049c\u0093\3\2\2\2\u049d\u049e\7\65\2\2\u049e\u049f\7A"+
		"\2\2\u049f\u04a0\7q\2\2\u04a0\u0095\3\2\2\2\u04a1\u04a2\7\66\2\2\u04a2"+
		"\u04a3\7A\2\2\u04a3\u04a4\7q\2\2\u04a4\u0097\3\2\2\2\u04a5\u04a6\7\67"+
		"\2\2\u04a6\u04a7\7A\2\2\u04a7\u04a8\t\7\2\2\u04a8\u0099\3\2\2\2\u04a9"+
		"\u04aa\7\4\2\2\u04aa\u04ab\7A\2\2\u04ab\u04ac\5n8\2\u04ac\u009b\3\2\2"+
		"\2\u04ad\u04ae\7\3\2\2\u04ae\u04af\7A\2\2\u04af\u04b0\5n8\2\u04b0\u009d"+
		"\3\2\2\2\u04b1\u04b2\7s\2\2\u04b2\u04b3\5\u00a0Q\2\u04b3\u04b4\7s\2\2"+
		"\u04b4\u009f\3\2\2\2\u04b5\u04bf\5x=\2\u04b6\u04b7\7U\2\2\u04b7\u04b8"+
		"\5n8\2\u04b8\u04b9\7V\2\2\u04b9\u04bf\3\2\2\2\u04ba\u04bf\7t\2\2\u04bb"+
		"\u04bf\7q\2\2\u04bc\u04bf\7p\2\2\u04bd\u04bf\7r\2\2\u04be\u04b5\3\2\2"+
		"\2\u04be\u04b6\3\2\2\2\u04be\u04ba\3\2\2\2\u04be\u04bb\3\2\2\2\u04be\u04bc"+
		"\3\2\2\2\u04be\u04bd\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04be\3\2\2\2\u04c0"+
		"\u04c1\3\2\2\2\u04c1\u00a1\3\2\2\2\u04c2\u04c3\7\21\2\2\u04c3\u04c4\7"+
		";\2\2\u04c4\u04c5\5\u00a4S\2\u04c5\u04c6\7<\2\2\u04c6\u04c7\7?\2\2\u04c7"+
		"\u04d1\3\2\2\2\u04c8\u04c9\7\21\2\2\u04c9\u04ca\7;\2\2\u04ca\u04cb\5\u00a4"+
		"S\2\u04cb\u04cc\7<\2\2\u04cc\u04cd\7=\2\2\u04cd\u04ce\5\u00aaV\2\u04ce"+
		"\u04cf\7>\2\2\u04cf\u04d1\3\2\2\2\u04d0\u04c2\3\2\2\2\u04d0\u04c8\3\2"+
		"\2\2\u04d1\u00a3\3\2\2\2\u04d2\u04d7\5\u00a6T\2\u04d3\u04d4\7@\2\2\u04d4"+
		"\u04d6\5\u00a8U\2\u04d5\u04d3\3\2\2\2\u04d6\u04d9\3\2\2\2\u04d7\u04d5"+
		"\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u00a5\3\2\2\2\u04d9\u04d7\3\2\2\2\u04da"+
		"\u04db\7\31\2\2\u04db\u04dc\7B\2\2\u04dc\u04dd\7q\2\2\u04dd\u00a7\3\2"+
		"\2\2\u04de\u04df\t\b\2\2\u04df\u04e0\7B\2\2\u04e0\u04e1\5Z.\2\u04e1\u00a9"+
		"\3\2\2\2\u04e2\u04e6\5N(\2\u04e3\u04e6\5T+\2\u04e4\u04e6\5\u00a2R\2\u04e5"+
		"\u04e2\3\2\2\2\u04e5\u04e3\3\2\2\2\u04e5\u04e4\3\2\2\2\u04e6\u04e9\3\2"+
		"\2\2\u04e7\u04e5\3\2\2\2\u04e7\u04e8\3\2\2\2\u04e8\u00ab\3\2\2\2\u04e9"+
		"\u04e7\3\2\2\2\u04ea\u04eb\7\22\2\2\u04eb\u04ed\7;\2\2\u04ec\u04ee\7q"+
		"\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef"+
		"\u04f0\7<\2\2\u04f0\u04f1\7=\2\2\u04f1\u04f2\5\u00aeX\2\u04f2\u04f3\7"+
		">\2\2\u04f3\u00ad\3\2\2\2\u04f4\u04f8\5\u00a2R\2\u04f5\u04f8\5T+\2\u04f6"+
		"\u04f8\5N(\2\u04f7\u04f4\3\2\2\2\u04f7\u04f5\3\2\2\2\u04f7\u04f6\3\2\2"+
		"\2\u04f8\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u00af"+
		"\3\2\2\2\u04fb\u04f9\3\2\2\2|\u00b3\u00d1\u00d6\u00e1\u00ec\u00f0\u0109"+
		"\u010c\u0113\u0129\u0131\u014a\u014d\u0157\u0161\u016f\u0171\u0175\u0179"+
		"\u0180\u0184\u0196\u019f\u01ab\u01ae\u01b6\u01ba\u01bf\u01c7\u01d2\u01e0"+
		"\u01e4\u01f1\u01f4\u01fd\u0202\u0205\u020c\u0211\u0214\u021c\u0223\u0228"+
		"\u022c\u022f\u023d\u0240\u0249\u024d\u0251\u0256\u0260\u0263\u0269\u0274"+
		"\u0277\u027c\u0282\u0288\u028f\u029d\u02a2\u02a7\u02b4\u02c0\u02c4\u02cc"+
		"\u02ce\u02d4\u02d8\u02dc\u02e4\u02ea\u02fe\u0301\u0305\u030f\u0314\u032d"+
		"\u034b\u034e\u0365\u039a\u039d\u03aa\u03ac\u03b9\u03c2\u03c5\u03d5\u03d7"+
		"\u03dc\u03e8\u03ec\u03f8\u03ff\u041d\u0420\u042c\u0430\u043a\u0440\u0447"+
		"\u044e\u0455\u045c\u0466\u0469\u046b\u0471\u0474\u0476\u047a\u04be\u04c0"+
		"\u04d0\u04d7\u04e5\u04e7\u04ed\u04f7\u04f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}