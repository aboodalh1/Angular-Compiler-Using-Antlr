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
		NgSubmit=13, NgClick=14, Product=15, ProductManager=16, ProductName=17, 
		Price=18, Image=19, Description=20, Injectable=21, Name=22, Id=23, Src=24, 
		Alt=25, Import=26, Export=27, Abstract=28, Interface=29, Extends=30, Implements=31, 
		Console=32, Log=33, Component=34, Service=35, Class=36, InlineAttributeName=37, 
		BackgroundColorAttributeName=38, TextColorAttributeName=39, TypeAttributeName=40, 
		LabelAttributeName=41, ValueAttributeName=42, PlaceHolderAttributeName=43, 
		CheckedAttributeName=44, TargetAttributeName=45, OnSubmitAttributeName=46, 
		OnChangeAttributeName=47, OnClickAttributeName=48, HeadingLevelAttributeName=49, 
		DirectionAttributeName=50, DurationAttributeName=51, RepeatAttributeName=52, 
		GapAttributeName=53, OpenBracket=54, CloseBracket=55, OpenParen=56, CloseParen=57, 
		OpenBrace=58, CloseBrace=59, SemiColon=60, Comma=61, Assign=62, Colon=63, 
		QuestionMark=64, Dot=65, Plus=66, Minus=67, Multiply=68, At=69, Divide=70, 
		Modulus=71, Not=72, LessThan=73, GreaterThan=74, LessThanEquals=75, GreaterThanEquals=76, 
		NOT_EQUAL=77, WeakEqual=78, StrongEqual=79, And=80, Or=81, AngularExpressionStart=82, 
		AngularExpressionEnd=83, Let_Identify=84, If=85, Else=86, While=87, Break=88, 
		Void=89, Continue=90, Function=91, Return=92, From=93, Null=94, Enum=95, 
		Array=96, Any=97, Arrow=98, TypeNumber=99, TypeString=100, TypeBoolean=101, 
		This=102, Constructor=103, Private=104, Public=105, Static=106, Protected=107, 
		New=108, NumberLiteral=109, StringLiteral=110, BooleanLiteral=111, Backtick=112, 
		Identifier=113, CssPixel=114, SingleLineComment=115, MultiLineComment=116, 
		WS=117, ClassKeyword=118, ThisKeyword=119, NewKeyword=120, EnumKeyword=121, 
		ConsoleKeyword=122, LogKeyword=123, AbstractKeyword=124, InterfaceKeyword=125, 
		PrivateKeyword=126, PublicKeyword=127, ProtectedKeyword=128, StaticKeyword=129, 
		LetKeyword=130, VoidKeyword=131, ConstructorKeyword=132, NullLiteral=133, 
		IfKeyword=134, ElseKeyword=135, WhileKeyword=136, BreakKeyword=137, ContinueKeyword=138;
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
			"'implements'", "'console'", "'log'", "'@Component'", null, "'class'", 
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
			"Import", "Export", "Abstract", "Interface", "Extends", "Implements", 
			"Console", "Log", "Component", "Service", "Class", "InlineAttributeName", 
			"BackgroundColorAttributeName", "TextColorAttributeName", "TypeAttributeName", 
			"LabelAttributeName", "ValueAttributeName", "PlaceHolderAttributeName", 
			"CheckedAttributeName", "TargetAttributeName", "OnSubmitAttributeName", 
			"OnChangeAttributeName", "OnClickAttributeName", "HeadingLevelAttributeName", 
			"DirectionAttributeName", "DurationAttributeName", "RepeatAttributeName", 
			"GapAttributeName", "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", 
			"OpenBrace", "CloseBrace", "SemiColon", "Comma", "Assign", "Colon", "QuestionMark", 
			"Dot", "Plus", "Minus", "Multiply", "At", "Divide", "Modulus", "Not", 
			"LessThan", "GreaterThan", "LessThanEquals", "GreaterThanEquals", "NOT_EQUAL", 
			"WeakEqual", "StrongEqual", "And", "Or", "AngularExpressionStart", "AngularExpressionEnd", 
			"Let_Identify", "If", "Else", "While", "Break", "Void", "Continue", "Function", 
			"Return", "From", "Null", "Enum", "Array", "Any", "Arrow", "TypeNumber", 
			"TypeString", "TypeBoolean", "This", "Constructor", "Private", "Public", 
			"Static", "Protected", "New", "NumberLiteral", "StringLiteral", "BooleanLiteral", 
			"Backtick", "Identifier", "CssPixel", "SingleLineComment", "MultiLineComment", 
			"WS", "ClassKeyword", "ThisKeyword", "NewKeyword", "EnumKeyword", "ConsoleKeyword", 
			"LogKeyword", "AbstractKeyword", "InterfaceKeyword", "PrivateKeyword", 
			"PublicKeyword", "ProtectedKeyword", "StaticKeyword", "LetKeyword", "VoidKeyword", 
			"ConstructorKeyword", "NullLiteral", "IfKeyword", "ElseKeyword", "WhileKeyword", 
			"BreakKeyword", "ContinueKeyword"
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
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302386082539320L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & -4905719685669977599L) != 0) || _la==BreakKeyword || _la==ContinueKeyword) {
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

	@SuppressWarnings("CheckReturnValue")
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
				enumDeclaration();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStateManagement(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStateDeclaration(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionDeclaration(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreOperation(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreDispatch(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitStoreSelect(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitActionCall(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302368699121664L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 2251941413388289L) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigation(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterLink(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterOutlet(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitRouterNavigate(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNavigationArray(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAngularTemplate(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgModel(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgSubmit(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNgClick(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodCallStatement(this);
			else return visitor.visitChildren(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302368699121664L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 2251941413388289L) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitComponent(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitExportClass(this);
			else return visitor.visitChildren(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode ClassKeyword() { return getToken(AngularParser.ClassKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_classDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(ClassKeyword);
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
		enterRule(_localctx, 44, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 780289L) != 0)) {
				{
				setState(364);
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
				}
				}
				setState(368);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitDecorator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecoratorContext decorator() throws RecognitionException {
		DecoratorContext _localctx = new DecoratorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_decorator);
		int _la;
		try {
			setState(374);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(369);
					argumentList();
					}
				}

				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				match(OpenBrace);
				setState(373);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArgumentList(this);
			else return visitor.visitChildren(this);
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
			setState(376);
			argument();
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(377);
					match(Comma);
					setState(378);
					argument();
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(384);
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
		enterRule(_localctx, 50, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(Identifier);
			setState(388);
			match(Colon);
			setState(389);
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
		enterRule(_localctx, 52, RULE_importStatement);
		try {
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(Import);
				setState(392);
				match(OpenBrace);
				setState(393);
				match(Identifier);
				setState(394);
				match(CloseBrace);
				setState(395);
				match(From);
				setState(396);
				match(StringLiteral);
				setState(397);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(Import);
				setState(399);
				match(Identifier);
				setState(400);
				match(From);
				setState(401);
				match(StringLiteral);
				setState(402);
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
	public static class ThisVaribleContext extends ParserRuleContext {
		public TerminalNode ThisKeyword() { return getToken(AngularParser.ThisKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisVarible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThisVaribleContext thisVarible() throws RecognitionException {
		ThisVaribleContext _localctx = new ThisVaribleContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_thisVarible);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(ThisKeyword);
			setState(406);
			match(Dot);
			setState(407);
			match(Identifier);
			setState(408);
			match(Assign);
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NewKeyword:
				{
				setState(409);
				newInstanceAssignment();
				}
				break;
			case ThisKeyword:
				{
				setState(410);
				nestedThisAssignment();
				}
				break;
			case Identifier:
				{
				setState(411);
				identifierOrPropertyAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(414);
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
		public TerminalNode NewKeyword() { return getToken(AngularParser.NewKeyword, 0); }
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
		enterRule(_localctx, 56, RULE_newInstanceAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(NewKeyword);
			setState(417);
			match(Identifier);
			setState(418);
			match(OpenParen);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302368699121664L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 2251941413388289L) != 0)) {
				{
				setState(419);
				expression(0);
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(420);
					match(Comma);
					setState(421);
					expression(0);
					}
					}
					setState(426);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(429);
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
		public TerminalNode ThisKeyword() { return getToken(AngularParser.ThisKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitNestedThisAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedThisAssignmentContext nestedThisAssignment() throws RecognitionException {
		NestedThisAssignmentContext _localctx = new NestedThisAssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_nestedThisAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			match(ThisKeyword);
			setState(437); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(432);
				match(Dot);
				setState(435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(433);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(434);
					function_call();
					}
					break;
				}
				}
				}
				setState(439); 
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitIdentifierOrPropertyAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierOrPropertyAssignmentContext identifierOrPropertyAssignment() throws RecognitionException {
		IdentifierOrPropertyAssignmentContext _localctx = new IdentifierOrPropertyAssignmentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_identifierOrPropertyAssignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Identifier);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(442);
				match(Dot);
				setState(443);
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
	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode EnumKeyword() { return getToken(AngularParser.EnumKeyword, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitEnumDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(EnumKeyword);
			setState(447);
			match(Identifier);
			setState(448);
			match(OpenBrace);
			setState(452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(449);
				enumValues();
				}
				}
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(455);
			match(CloseBrace);
			setState(456);
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
		enterRule(_localctx, 64, RULE_enumValues);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(458);
			enumValue();
			setState(463);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(459);
				match(Comma);
				setState(460);
				enumValue();
				}
				}
				setState(465);
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
		enterRule(_localctx, 66, RULE_enumValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(Identifier);
			setState(467);
			match(Assign);
			setState(468);
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
		public TerminalNode ConsoleKeyword() { return getToken(AngularParser.ConsoleKeyword, 0); }
		public TerminalNode Dot() { return getToken(AngularParser.Dot, 0); }
		public TerminalNode LogKeyword() { return getToken(AngularParser.LogKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitConsoleLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogContext consoleLog() throws RecognitionException {
		ConsoleLogContext _localctx = new ConsoleLogContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_consoleLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(ConsoleKeyword);
			setState(471);
			match(Dot);
			setState(472);
			match(LogKeyword);
			setState(473);
			match(OpenParen);
			setState(477);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(474);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(475);
				match(StringLiteral);
				}
				break;
			case 3:
				{
				setState(476);
				literalValue();
				}
				break;
			}
			setState(479);
			match(CloseParen);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(480);
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
		public TerminalNode AbstractKeyword() { return getToken(AngularParser.AbstractKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAbstractClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractClassContext abstractClass() throws RecognitionException {
		AbstractClassContext _localctx = new AbstractClassContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_abstractClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(AbstractKeyword);
			setState(484);
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
		public TerminalNode InterfaceKeyword() { return getToken(AngularParser.InterfaceKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitInterfaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_interfaceDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(InterfaceKeyword);
			setState(487);
			match(OpenBrace);
			setState(488);
			classBody();
			setState(489);
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
		public TerminalNode PrivateKeyword() { return getToken(AngularParser.PrivateKeyword, 0); }
		public TerminalNode PublicKeyword() { return getToken(AngularParser.PublicKeyword, 0); }
		public TerminalNode ProtectedKeyword() { return getToken(AngularParser.ProtectedKeyword, 0); }
		public TerminalNode StaticKeyword() { return getToken(AngularParser.StaticKeyword, 0); }
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
		enterRule(_localctx, 74, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(491);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) ) {
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(AngularParser.Assign, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
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
		public TerminalNode LetKeyword() { return getToken(AngularParser.LetKeyword, 0); }
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
		enterRule(_localctx, 76, RULE_variableDeclaration);
		int _la;
		try {
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(493);
					accessModifier();
					}
				}

				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LetKeyword) {
					{
					setState(496);
					match(LetKeyword);
					}
				}

				setState(499);
				match(Identifier);
				setState(500);
				match(Colon);
				setState(501);
				type();
				setState(502);
				match(Assign);
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(503);
					expression(0);
					}
					break;
				case 2:
					{
					setState(504);
					literalValue();
					}
					break;
				case 3:
					{
					setState(505);
					templateString();
					}
					break;
				}
				setState(508);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(510);
					accessModifier();
					}
				}

				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LetKeyword) {
					{
					setState(513);
					match(LetKeyword);
					}
				}

				setState(516);
				match(Identifier);
				setState(517);
				match(Assign);
				setState(521);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(518);
					expression(0);
					}
					break;
				case 2:
					{
					setState(519);
					literalValue();
					}
					break;
				case 3:
					{
					setState(520);
					templateString();
					}
					break;
				}
				setState(523);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(525);
					accessModifier();
					}
				}

				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LetKeyword) {
					{
					setState(528);
					match(LetKeyword);
					}
				}

				setState(531);
				match(Identifier);
				setState(532);
				match(Colon);
				setState(533);
				type();
				setState(534);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(536);
					accessModifier();
					}
				}

				setState(539);
				match(Identifier);
				setState(540);
				match(Assign);
				setState(544);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(541);
					expression(0);
					}
					break;
				case 2:
					{
					setState(542);
					literalValue();
					}
					break;
				case 3:
					{
					setState(543);
					templateString();
					}
					break;
				}
				setState(546);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(548);
					accessModifier();
					}
				}

				setState(551);
				match(Identifier);
				setState(552);
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
		public TerminalNode LetKeyword() { return getToken(AngularParser.LetKeyword, 0); }
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
		public TerminalNode Array() { return getToken(AngularParser.Array, 0); }
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
		enterRule(_localctx, 78, RULE_arrayDeclaration);
		int _la;
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LetKeyword) {
					{
					setState(555);
					match(LetKeyword);
					}
				}

				setState(558);
				match(Identifier);
				setState(559);
				match(Colon);
				setState(560);
				type();
				setState(561);
				match(OpenBracket);
				setState(562);
				match(CloseBracket);
				setState(563);
				match(Assign);
				setState(564);
				match(OpenBracket);
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777231L) != 0)) {
					{
					setState(565);
					literalValue();
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(566);
						match(Comma);
						setState(567);
						literalValue();
						}
						}
						setState(572);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(575);
				match(CloseBracket);
				setState(576);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LetKeyword) {
					{
					setState(578);
					match(LetKeyword);
					}
				}

				setState(581);
				match(Identifier);
				setState(582);
				match(Colon);
				setState(583);
				match(Array);
				setState(584);
				match(Assign);
				setState(585);
				match(OpenBracket);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777231L) != 0)) {
					{
					setState(586);
					literalValue();
					setState(591);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(587);
						match(Comma);
						setState(588);
						literalValue();
						}
						}
						setState(593);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(596);
				match(CloseBracket);
				setState(597);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(598);
				match(Identifier);
				setState(599);
				match(Assign);
				setState(600);
				match(OpenBracket);
				setState(602);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(601);
					literalValue();
					}
					break;
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777231L) != 0)) {
					{
					{
					setState(604);
					literalValue();
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(605);
						match(Comma);
						}
					}

					}
					}
					setState(612);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(613);
				match(CloseBracket);
				setState(614);
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
		public TerminalNode AbstractKeyword() { return getToken(AngularParser.AbstractKeyword, 0); }
		public TerminalNode Identifier() { return getToken(AngularParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(AngularParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(AngularParser.CloseParen, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VoidKeyword() { return getToken(AngularParser.VoidKeyword, 0); }
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
		enterRule(_localctx, 80, RULE_abstractFunctionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			match(AbstractKeyword);
			setState(618);
			match(Identifier);
			setState(619);
			match(OpenParen);
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(620);
				parameter();
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(621);
					match(Comma);
					setState(622);
					parameter();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(630);
			match(CloseParen);
			setState(631);
			match(Colon);
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
			case Identifier:
				{
				setState(632);
				type();
				}
				break;
			case VoidKeyword:
				{
				setState(633);
				match(VoidKeyword);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(636);
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
		public TerminalNode ConstructorKeyword() { return getToken(AngularParser.ConstructorKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==ConstructorKeyword) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(639);
			match(OpenParen);
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(640);
				parameter();
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(641);
					match(Comma);
					setState(642);
					parameter();
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(650);
			match(CloseParen);
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(651);
				match(Colon);
				setState(652);
				type();
				}
			}

			setState(655);
			match(OpenBrace);
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302386082539320L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & -4905719685669977599L) != 0) || _la==BreakKeyword || _la==ContinueKeyword) {
				{
				{
				setState(656);
				statement();
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
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
		public TerminalNode NewKeyword() { return getToken(AngularParser.NewKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitObjectDeclataion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectDeclataionContext objectDeclataion() throws RecognitionException {
		ObjectDeclataionContext _localctx = new ObjectDeclataionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_objectDeclataion);
		int _la;
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(664);
					accessModifier();
					}
				}

				setState(667);
				match(Identifier);
				setState(668);
				match(Colon);
				setState(669);
				match(Identifier);
				setState(670);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
					{
					setState(671);
					accessModifier();
					}
				}

				setState(674);
				match(Identifier);
				setState(675);
				match(Colon);
				setState(676);
				match(Identifier);
				setState(677);
				match(Assign);
				setState(678);
				match(NewKeyword);
				setState(679);
				match(Identifier);
				setState(680);
				match(OpenParen);
				setState(691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777231L) != 0)) {
					{
					{
					setState(681);
					literalValue();
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(682);
						match(Comma);
						setState(683);
						literalValue();
						}
						}
						setState(688);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					setState(693);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(694);
				match(CloseParen);
				setState(695);
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
		enterRule(_localctx, 86, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(698);
			_la = _input.LA(1);
			if ( !(((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 131131L) != 0)) ) {
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
		public TerminalNode NullLiteral() { return getToken(AngularParser.NullLiteral, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_literalValue);
		try {
			setState(709);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(700);
				match(NumberLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(702);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(703);
				listLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(704);
				mapLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(705);
				match(NullLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(706);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(707);
				css();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(708);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMapLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapLiteralContext mapLiteral() throws RecognitionException {
		MapLiteralContext _localctx = new MapLiteralContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_mapLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
			match(OpenBrace);
			setState(712);
			match(Identifier);
			setState(713);
			match(Colon);
			setState(714);
			literalValue();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(715);
				match(Comma);
				{
				setState(716);
				match(Identifier);
				setState(717);
				match(Colon);
				setState(718);
				literalValue();
				}
				setState(721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(720);
					match(Comma);
					}
					break;
				}
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
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
		enterRule(_localctx, 92, RULE_listLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(OpenBracket);
			setState(735);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBracket || _la==OpenBrace || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777247L) != 0)) {
				{
				setState(733);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(731);
					match(Identifier);
					}
					break;
				case OpenBracket:
				case OpenBrace:
				case NumberLiteral:
				case StringLiteral:
				case BooleanLiteral:
				case Backtick:
				case NullLiteral:
					{
					setState(732);
					literalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(745);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(738);
					match(Comma);
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
					case NumberLiteral:
					case StringLiteral:
					case BooleanLiteral:
					case Backtick:
					case NullLiteral:
						{
						setState(740);
						literalValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(749);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(748);
				match(Comma);
				}
			}

			setState(751);
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
		public TerminalNode ThisKeyword() { return getToken(AngularParser.ThisKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_assignmentStatement);
		int _la;
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				match(Identifier);
				setState(754);
				match(Assign);
				setState(757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(755);
					expression(0);
					}
					break;
				case 2:
					{
					setState(756);
					templateString();
					}
					break;
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(759);
					match(Comma);
					setState(760);
					expression(0);
					}
					}
					setState(765);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(766);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				match(ThisKeyword);
				setState(769);
				match(Dot);
				setState(770);
				match(Identifier);
				setState(771);
				match(Assign);
				setState(772);
				expression(0);
				setState(773);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(775);
				match(Identifier);
				setState(776);
				match(Assign);
				setState(777);
				match(OpenBracket);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 16777231L) != 0)) {
					{
					setState(778);
					literalValue();
					setState(783);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(779);
						match(Comma);
						setState(780);
						literalValue();
						}
						}
						setState(785);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(788);
				match(CloseBracket);
				setState(789);
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
		public TerminalNode IfKeyword() { return getToken(AngularParser.IfKeyword, 0); }
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
		public TerminalNode ElseKeyword() { return getToken(AngularParser.ElseKeyword, 0); }
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
		enterRule(_localctx, 96, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(IfKeyword);
			setState(793);
			match(OpenParen);
			setState(794);
			expression(0);
			setState(795);
			match(CloseParen);
			setState(796);
			block();
			setState(800);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(797);
					elseIfStatement();
					}
					} 
				}
				setState(802);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,79,_ctx);
			}
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ElseKeyword) {
				{
				setState(803);
				match(ElseKeyword);
				setState(804);
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
		public TerminalNode WhileKeyword() { return getToken(AngularParser.WhileKeyword, 0); }
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
		enterRule(_localctx, 98, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(WhileKeyword);
			setState(808);
			match(OpenParen);
			setState(809);
			expression(0);
			setState(810);
			match(CloseParen);
			setState(811);
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
		public TerminalNode ElseKeyword() { return getToken(AngularParser.ElseKeyword, 0); }
		public TerminalNode IfKeyword() { return getToken(AngularParser.IfKeyword, 0); }
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
		enterRule(_localctx, 100, RULE_elseIfStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			match(ElseKeyword);
			setState(814);
			match(IfKeyword);
			setState(815);
			match(OpenParen);
			setState(816);
			expression(0);
			setState(817);
			match(CloseParen);
			setState(818);
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
		public TerminalNode BreakKeyword() { return getToken(AngularParser.BreakKeyword, 0); }
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
		enterRule(_localctx, 102, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			match(BreakKeyword);
			setState(821);
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
		public TerminalNode ContinueKeyword() { return getToken(AngularParser.ContinueKeyword, 0); }
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
		enterRule(_localctx, 104, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			match(ContinueKeyword);
			setState(824);
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
		enterRule(_localctx, 106, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(OpenBrace);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302386082539320L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & -4905719685669977599L) != 0) || _la==BreakKeyword || _la==ContinueKeyword) {
				{
				{
				setState(827);
				statement();
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitMethodCall(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitSimpleArrowFunction(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrowFunction(this);
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
	public static class ThisPropertyAccessContext extends ExpressionContext {
		public TerminalNode ThisKeyword() { return getToken(AngularParser.ThisKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisPropertyAccess(this);
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
	public static class ThisMethodCallContext extends ExpressionContext {
		public TerminalNode ThisKeyword() { return getToken(AngularParser.ThisKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisMethodCall(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitArrayMethodWithArrowFunction(this);
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
	public static class ThisPropertyAssignmentContext extends ExpressionContext {
		public TerminalNode ThisKeyword() { return getToken(AngularParser.ThisKeyword, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitThisPropertyAssignment(this);
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
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(836);
				match(OpenParen);
				setState(837);
				expression(0);
				setState(838);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(840);
				match(Identifier);
				setState(841);
				match(OpenBracket);
				setState(842);
				expression(0);
				setState(843);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new AngularExpreissionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(845);
				match(AngularExpressionStart);
				setState(846);
				expression(0);
				setState(847);
				match(AngularExpressionEnd);
				}
				break;
			case 4:
				{
				_localctx = new ThisMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(849);
				match(ThisKeyword);
				setState(850);
				match(Dot);
				setState(851);
				match(Identifier);
				setState(852);
				match(Dot);
				setState(853);
				match(Identifier);
				setState(854);
				match(OpenParen);
				setState(863);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302368699121664L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 2251941413388289L) != 0)) {
					{
					setState(855);
					expression(0);
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(856);
						match(Comma);
						setState(857);
						expression(0);
						}
						}
						setState(862);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(865);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new ArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(866);
				match(Identifier);
				setState(867);
				match(Arrow);
				setState(868);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new SimpleArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(869);
				match(Identifier);
				setState(870);
				match(Arrow);
				setState(871);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ThisPropertyAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(872);
				match(ThisKeyword);
				setState(873);
				match(Dot);
				setState(874);
				match(Identifier);
				setState(875);
				match(Assign);
				setState(876);
				expression(6);
				}
				break;
			case 8:
				{
				_localctx = new ThisPropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(877);
				match(ThisKeyword);
				setState(878);
				match(Dot);
				setState(879);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new PropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(880);
				match(Identifier);
				setState(881);
				match(Dot);
				setState(882);
				match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(883);
				literalValue();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(884);
				match(Identifier);
				}
				break;
			case 12:
				{
				_localctx = new DdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(885);
				html();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(957);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(955);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(888);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(889);
						match(Multiply);
						setState(890);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(891);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(892);
						match(Divide);
						setState(893);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(894);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(895);
						match(Modulus);
						setState(896);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(897);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(898);
						match(Plus);
						setState(899);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(900);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(901);
						match(Minus);
						setState(902);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new LessThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(903);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(904);
						match(LessThan);
						setState(905);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(906);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(907);
						match(GreaterThan);
						setState(908);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(909);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(910);
						match(LessThanEquals);
						setState(911);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(912);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(913);
						match(GreaterThanEquals);
						setState(914);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new WeakEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(915);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(916);
						match(WeakEqual);
						setState(917);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new StrongEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(918);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(919);
						match(StrongEqual);
						setState(920);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(921);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(922);
						match(NOT_EQUAL);
						setState(923);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(924);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(925);
						match(And);
						setState(926);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(927);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(928);
						match(Or);
						setState(929);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(930);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(931);
						match(Dot);
						setState(932);
						match(Identifier);
						setState(933);
						match(OpenParen);
						setState(942);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302368699121664L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 2251941413388289L) != 0)) {
							{
							setState(934);
							expression(0);
							setState(939);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(935);
								match(Comma);
								setState(936);
								expression(0);
								}
								}
								setState(941);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(944);
						match(CloseParen);
						}
						break;
					case 16:
						{
						_localctx = new ArrayMethodWithArrowFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(945);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(946);
						match(Dot);
						setState(947);
						match(Identifier);
						setState(948);
						match(OpenParen);
						{
						setState(949);
						match(Identifier);
						setState(950);
						match(Arrow);
						setState(951);
						expression(0);
						}
						setState(953);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(959);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,88,_ctx);
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
		enterRule(_localctx, 110, RULE_parameter);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(960);
				match(Identifier);
				setState(961);
				match(Colon);
				setState(962);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(963);
				match(Identifier);
				setState(964);
				match(Colon);
				setState(965);
				type();
				setState(966);
				match(Assign);
				setState(967);
				literalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(969);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(972);
			match(Identifier);
			setState(973);
			match(OpenParen);
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 378302368699121664L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & 2251941413388289L) != 0)) {
				{
				setState(974);
				expression(0);
				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(975);
					match(Comma);
					setState(976);
					expression(0);
					}
					}
					setState(981);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(984);
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
		enterRule(_localctx, 114, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986);
			match(Backtick);
			setState(987);
			html_content();
			setState(988);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_contentContext html_content() throws RecognitionException {
		Html_contentContext _localctx = new Html_contentContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_html_content);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(998); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(998);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(990);
						html_element();
						}
						break;
					case AngularExpressionStart:
						{
						setState(991);
						match(AngularExpressionStart);
						setState(992);
						expression(0);
						setState(993);
						match(AngularExpressionEnd);
						}
						break;
					case Identifier:
						{
						setState(995);
						match(Identifier);
						}
						break;
					case StringLiteral:
						{
						setState(996);
						match(StringLiteral);
						}
						break;
					case NumberLiteral:
						{
						setState(997);
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
				setState(1000); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_html_element);
		try {
			setState(1033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1002);
				match(LessThan);
				setState(1003);
				html_tag_name();
				setState(1005);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(1004);
					html_attributes();
					}
					break;
				}
				setState(1007);
				match(GreaterThan);
				setState(1008);
				html_content();
				setState(1009);
				match(LessThan);
				setState(1010);
				match(Divide);
				setState(1011);
				html_tag_name();
				setState(1012);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1014);
				match(LessThan);
				setState(1015);
				html_tag_name();
				setState(1017);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(1016);
					html_attributes();
					}
					break;
				}
				setState(1019);
				match(GreaterThan);
				setState(1021);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(1020);
					html_content();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1023);
				match(LessThan);
				setState(1024);
				html_tag_name();
				setState(1025);
				html_attributes();
				setState(1026);
				match(Divide);
				setState(1027);
				match(GreaterThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1029);
				match(LessThan);
				setState(1030);
				html_tag_name();
				setState(1031);
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
		enterRule(_localctx, 120, RULE_html_tag_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
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
		enterRule(_localctx, 122, RULE_html_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 107592779118411782L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 41781441855489L) != 0)) {
				{
				{
				setState(1037);
				html_attribute();
				}
				}
				setState(1042);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attributeContext html_attribute() throws RecognitionException {
		Html_attributeContext _localctx = new Html_attributeContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_html_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(1043);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1044);
				match(Class);
				}
				break;
			case 3:
				{
				setState(1045);
				match(Name);
				}
				break;
			case 4:
				{
				setState(1046);
				match(Id);
				}
				break;
			case 5:
				{
				setState(1047);
				match(Src);
				}
				break;
			case 6:
				{
				setState(1048);
				match(Alt);
				}
				break;
			case 7:
				{
				setState(1049);
				match(TypeAttributeName);
				}
				break;
			case 8:
				{
				setState(1050);
				match(LabelAttributeName);
				}
				break;
			case 9:
				{
				setState(1051);
				match(ValueAttributeName);
				}
				break;
			case 10:
				{
				setState(1052);
				match(PlaceHolderAttributeName);
				}
				break;
			case 11:
				{
				setState(1053);
				match(CheckedAttributeName);
				}
				break;
			case 12:
				{
				setState(1054);
				match(TargetAttributeName);
				}
				break;
			case 13:
				{
				setState(1055);
				match(HeadingLevelAttributeName);
				}
				break;
			case 14:
				{
				setState(1056);
				match(DirectionAttributeName);
				}
				break;
			case 15:
				{
				setState(1057);
				match(DurationAttributeName);
				}
				break;
			case 16:
				{
				setState(1058);
				match(RepeatAttributeName);
				}
				break;
			case 17:
				{
				setState(1059);
				match(GapAttributeName);
				}
				break;
			case 18:
				{
				setState(1060);
				ngIfAttribute();
				}
				break;
			case 19:
				{
				setState(1061);
				ngForAttribute();
				}
				break;
			case 20:
				{
				setState(1062);
				onChangeAttribute();
				}
				break;
			case 21:
				{
				setState(1063);
				onClickAttribute();
				}
				break;
			case 22:
				{
				setState(1064);
				match(OpenBracket);
				setState(1073);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1065);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(1066);
					match(Identifier);
					setState(1070);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(1067);
						access_suffix();
						}
						}
						setState(1072);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(1075);
				match(CloseBracket);
				}
				break;
			case 23:
				{
				setState(1076);
				match(OpenParen);
				{
				setState(1077);
				match(Identifier);
				}
				setState(1078);
				match(CloseParen);
				}
				break;
			case 24:
				{
				setState(1079);
				match(Multiply);
				setState(1080);
				match(Identifier);
				}
				break;
			case 25:
				{
				setState(1081);
				match(NgIfDirective);
				}
				break;
			case 26:
				{
				setState(1082);
				match(NgForDirective);
				}
				break;
			case 27:
				{
				setState(1083);
				match(StringLiteral);
				}
				break;
			case 28:
				{
				setState(1084);
				match(NumberLiteral);
				}
				break;
			}
			setState(1089);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1087);
				match(Assign);
				setState(1088);
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
		enterRule(_localctx, 126, RULE_access_suffix);
		try {
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1091);
				match(Dot);
				setState(1092);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1093);
				match(OpenBracket);
				setState(1094);
				expression(0);
				setState(1095);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				match(Dot);
				setState(1098);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitHtml_attribute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_attribute_valueContext html_attribute_value() throws RecognitionException {
		Html_attribute_valueContext _localctx = new Html_attribute_valueContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_html_attribute_value);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1102);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1103);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1104);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(OpenBracket);
			setState(1108);
			match(Backtick);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(1109);
				css_content();
				}
				}
				setState(1114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1115);
			match(Backtick);
			setState(1116);
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
		enterRule(_localctx, 132, RULE_css_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(1118);
				match(Dot);
				}
			}

			setState(1121);
			match(Identifier);
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1122);
				match(Colon);
				setState(1123);
				match(Identifier);
				}
				}
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1129);
			match(OpenBrace);
			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(1130);
				css_class_content();
				}
				}
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1136);
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
		enterRule(_localctx, 134, RULE_css_class_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1138);
			match(Identifier);
			setState(1139);
			match(Colon);
			setState(1146); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1146);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,110,_ctx) ) {
				case 1:
					{
					setState(1140);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1141);
					match(NumberLiteral);
					setState(1143);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(1142);
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
					setState(1145);
					function_call();
					}
					break;
				}
				}
				setState(1148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(1163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1150);
				match(Comma);
				setState(1157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1157);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
					case 1:
						{
						setState(1151);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1152);
						match(NumberLiteral);
						setState(1154);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(1153);
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
						setState(1156);
						function_call();
						}
						break;
					}
					}
					setState(1159); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(1165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1166);
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
		enterRule(_localctx, 136, RULE_checkedAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			match(CheckedAttributeName);
			setState(1169);
			match(Assign);
			setState(1170);
			match(OpenBrace);
			setState(1171);
			expression(0);
			setState(1172);
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
		enterRule(_localctx, 138, RULE_onChangeAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			match(OpenParen);
			setState(1175);
			match(OnChangeAttributeName);
			setState(1176);
			match(CloseParen);
			setState(1177);
			match(Assign);
			setState(1178);
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
		enterRule(_localctx, 140, RULE_onClickAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(OpenParen);
			setState(1181);
			match(OnClickAttributeName);
			setState(1182);
			match(CloseParen);
			setState(1183);
			match(Assign);
			setState(1184);
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
		enterRule(_localctx, 142, RULE_onSubmitAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			match(OpenParen);
			setState(1187);
			match(OnSubmitAttributeName);
			setState(1188);
			match(CloseParen);
			setState(1189);
			match(Assign);
			setState(1190);
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
		enterRule(_localctx, 144, RULE_gapAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(GapAttributeName);
			setState(1193);
			match(Assign);
			setState(1194);
			match(OpenBrace);
			setState(1195);
			expression(0);
			setState(1196);
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
		enterRule(_localctx, 146, RULE_directionAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			match(DirectionAttributeName);
			setState(1199);
			match(Assign);
			setState(1200);
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
		enterRule(_localctx, 148, RULE_durationAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			match(DurationAttributeName);
			setState(1203);
			match(Assign);
			setState(1204);
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
		enterRule(_localctx, 150, RULE_repeatAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1206);
			match(RepeatAttributeName);
			setState(1207);
			match(Assign);
			setState(1208);
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
		enterRule(_localctx, 152, RULE_ngForAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			match(NgForDirective);
			setState(1211);
			match(Assign);
			setState(1212);
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
		enterRule(_localctx, 154, RULE_ngIfAttribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(NgIfDirective);
			setState(1215);
			match(Assign);
			setState(1216);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateStringContext templateString() throws RecognitionException {
		TemplateStringContext _localctx = new TemplateStringContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_templateString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1218);
			match(Backtick);
			setState(1219);
			templateContent();
			setState(1220);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_templateContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1231); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1231);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LessThan:
					{
					setState(1222);
					html_element();
					}
					break;
				case AngularExpressionStart:
					{
					setState(1223);
					match(AngularExpressionStart);
					setState(1224);
					expression(0);
					setState(1225);
					match(AngularExpressionEnd);
					}
					break;
				case Identifier:
					{
					setState(1227);
					match(Identifier);
					}
					break;
				case StringLiteral:
					{
					setState(1228);
					match(StringLiteral);
					}
					break;
				case NumberLiteral:
					{
					setState(1229);
					match(NumberLiteral);
					}
					break;
				case BooleanLiteral:
					{
					setState(1230);
					match(BooleanLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1233); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1580547965441L) != 0) );
			}
		}
		catch (RecognitionException re) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductContext product() throws RecognitionException {
		ProductContext _localctx = new ProductContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_product);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1235);
				match(Product);
				setState(1236);
				match(OpenParen);
				setState(1237);
				productProperties();
				setState(1238);
				match(CloseParen);
				setState(1239);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1241);
				match(Product);
				setState(1242);
				match(OpenParen);
				setState(1243);
				productProperties();
				setState(1244);
				match(CloseParen);
				setState(1245);
				match(OpenBrace);
				setState(1246);
				productBody();
				setState(1247);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPropertiesContext productProperties() throws RecognitionException {
		ProductPropertiesContext _localctx = new ProductPropertiesContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_productProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			productId();
			setState(1256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1252);
				match(Comma);
				setState(1253);
				productProperty();
				}
				}
				setState(1258);
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
	public static class ProductIdContext extends ParserRuleContext {
		public TerminalNode Id() { return getToken(AngularParser.Id, 0); }
		public TerminalNode Colon() { return getToken(AngularParser.Colon, 0); }
		public TerminalNode StringLiteral() { return getToken(AngularParser.StringLiteral, 0); }
		public ProductIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductIdContext productId() throws RecognitionException {
		ProductIdContext _localctx = new ProductIdContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_productId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			match(Id);
			setState(1260);
			match(Colon);
			setState(1261);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductPropertyContext productProperty() throws RecognitionException {
		ProductPropertyContext _localctx = new ProductPropertyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_productProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1264);
			match(Colon);
			setState(1265);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductBodyContext productBody() throws RecognitionException {
		ProductBodyContext _localctx = new ProductBodyContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_productBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 778241L) != 0)) {
				{
				setState(1270);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1267);
					variableDeclaration();
					}
					break;
				case 2:
					{
					setState(1268);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(1269);
					product();
					}
					break;
				}
				}
				setState(1274);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductManager(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductManager(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductManager(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductManagerContext productManager() throws RecognitionException {
		ProductManagerContext _localctx = new ProductManagerContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_productManager);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1275);
			match(ProductManager);
			setState(1276);
			match(OpenParen);
			setState(1278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==StringLiteral) {
				{
				setState(1277);
				match(StringLiteral);
				}
			}

			setState(1280);
			match(CloseParen);
			setState(1281);
			match(OpenBrace);
			setState(1282);
			productManagerBody();
			setState(1283);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).enterProductManagerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AngularParserListener ) ((AngularParserListener)listener).exitProductManagerBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitProductManagerBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductManagerBodyContext productManagerBody() throws RecognitionException {
		ProductManagerBodyContext _localctx = new ProductManagerBodyContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_productManagerBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product || ((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 778241L) != 0)) {
				{
				setState(1288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
				case 1:
					{
					setState(1285);
					product();
					}
					break;
				case 2:
					{
					setState(1286);
					functionDeclaration();
					}
					break;
				case 3:
					{
					setState(1287);
					variableDeclaration();
					}
					break;
				}
				}
				setState(1292);
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
		"\u0004\u0001\u008a\u050e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0001\u0000\u0005\u0000\u00b0\b\u0000\n"+
		"\u0000\f\u0000\u00b3\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00d0\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00d5"+
		"\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00e0\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00eb\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00ef\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005\b\u0106\b\b\n\b\f"+
		"\b\u0109\t\b\u0003\b\u010b\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0003\t\u0112\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0005\r\u0126\b\r\n\r\f\r\u0129\t\r\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0130\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0147\b\u0012\n\u0012"+
		"\f\u0012\u014a\t\u0012\u0003\u0012\u014c\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0156\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0160\b\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016"+
		"\u016d\b\u0016\n\u0016\f\u0016\u0170\t\u0016\u0001\u0017\u0003\u0017\u0173"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0177\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0005\u0018\u017c\b\u0018\n\u0018\f\u0018\u017f"+
		"\t\u0018\u0001\u0018\u0003\u0018\u0182\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u0194\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b"+
		"\u019d\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01a7\b\u001c\n\u001c"+
		"\f\u001c\u01aa\t\u001c\u0003\u001c\u01ac\b\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b4\b\u001d"+
		"\u0004\u001d\u01b6\b\u001d\u000b\u001d\f\u001d\u01b7\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01bd\b\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0005\u001f\u01c3\b\u001f\n\u001f\f\u001f\u01c6\t\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005 \u01ce"+
		"\b \n \f \u01d1\t \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01de\b\"\u0001\"\u0001\"\u0003"+
		"\"\u01e2\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"%\u0001%\u0001&\u0003&\u01ef\b&\u0001&\u0003&\u01f2\b&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u01fb\b&\u0001&\u0001&\u0001&\u0003"+
		"&\u0200\b&\u0001&\u0003&\u0203\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003"+
		"&\u020a\b&\u0001&\u0001&\u0001&\u0003&\u020f\b&\u0001&\u0003&\u0212\b"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u021a\b&\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0221\b&\u0001&\u0001&\u0001&\u0003&\u0226"+
		"\b&\u0001&\u0001&\u0003&\u022a\b&\u0001\'\u0003\'\u022d\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u0239\b\'\n\'\f\'\u023c\t\'\u0003\'\u023e\b\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0003\'\u0244\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0005\'\u024e\b\'\n\'\f\'\u0251\t\'\u0003\'\u0253\b"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u025b\b\'\u0001"+
		"\'\u0001\'\u0003\'\u025f\b\'\u0005\'\u0261\b\'\n\'\f\'\u0264\t\'\u0001"+
		"\'\u0001\'\u0003\'\u0268\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u0270\b(\n(\f(\u0273\t(\u0003(\u0275\b(\u0001(\u0001(\u0001("+
		"\u0001(\u0003(\u027b\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u0284\b)\n)\f)\u0287\t)\u0003)\u0289\b)\u0001)\u0001)\u0001)"+
		"\u0003)\u028e\b)\u0001)\u0001)\u0005)\u0292\b)\n)\f)\u0295\t)\u0001)\u0001"+
		")\u0001*\u0003*\u029a\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02a1"+
		"\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u02ad\b*\n*\f*\u02b0\t*\u0005*\u02b2\b*\n*\f*\u02b5\t*\u0001"+
		"*\u0001*\u0003*\u02b9\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0003,\u02c6\b,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u02d2\b-\u0005-\u02d4"+
		"\b-\n-\f-\u02d7\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u02de\b."+
		"\n.\f.\u02e1\t.\u0001.\u0001.\u0001.\u0003.\u02e6\b.\u0005.\u02e8\b.\n"+
		".\f.\u02eb\t.\u0001.\u0003.\u02ee\b.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0003/\u02f6\b/\u0001/\u0001/\u0005/\u02fa\b/\n/\f/\u02fd\t/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u030e\b/\n/\f/\u0311\t/\u0003"+
		"/\u0313\b/\u0001/\u0001/\u0003/\u0317\b/\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00050\u031f\b0\n0\f0\u0322\t0\u00010\u00010\u00030\u0326\b0"+
		"\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u0001"+
		"2\u00012\u00012\u00012\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"5\u00015\u00055\u033d\b5\n5\f5\u0340\t5\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00056\u035b\b6\n6\f6\u035e\t6\u00036\u0360\b6\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0377"+
		"\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0005"+
		"6\u03aa\b6\n6\f6\u03ad\t6\u00036\u03af\b6\u00016\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u03bc\b6\n6\f"+
		"6\u03bf\t6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00037\u03cb\b7\u00018\u00018\u00018\u00018\u00018\u00058\u03d2"+
		"\b8\n8\f8\u03d5\t8\u00038\u03d7\b8\u00018\u00018\u00019\u00019\u00019"+
		"\u00019\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0004"+
		":\u03e7\b:\u000b:\f:\u03e8\u0001;\u0001;\u0001;\u0003;\u03ee\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u03fa\b;\u0001;\u0001;\u0003;\u03fe\b;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u040a\b;\u0001<\u0001<\u0001"+
		"=\u0005=\u040f\b=\n=\f=\u0412\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005"+
		">\u042d\b>\n>\f>\u0430\t>\u0003>\u0432\b>\u0001>\u0001>\u0001>\u0001>"+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u043e\b>\u0001>\u0001"+
		">\u0003>\u0442\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0003?\u044c\b?\u0001@\u0001@\u0001@\u0001@\u0003@\u0452\b@\u0001A\u0001"+
		"A\u0001A\u0005A\u0457\bA\nA\fA\u045a\tA\u0001A\u0001A\u0001A\u0001B\u0003"+
		"B\u0460\bB\u0001B\u0001B\u0001B\u0005B\u0465\bB\nB\fB\u0468\tB\u0001B"+
		"\u0001B\u0005B\u046c\bB\nB\fB\u046f\tB\u0001B\u0001B\u0001C\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u0478\bC\u0001C\u0004C\u047b\bC\u000bC\fC\u047c"+
		"\u0001C\u0001C\u0001C\u0001C\u0003C\u0483\bC\u0001C\u0004C\u0486\bC\u000b"+
		"C\fC\u0487\u0005C\u048a\bC\nC\fC\u048d\tC\u0001C\u0001C\u0001D\u0001D"+
		"\u0001D\u0001D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001"+
		"E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001"+
		"I\u0001I\u0001I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001"+
		"K\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001"+
		"N\u0001N\u0001N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001"+
		"O\u0001O\u0004O\u04d0\bO\u000bO\fO\u04d1\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003"+
		"P\u04e2\bP\u0001Q\u0001Q\u0001Q\u0005Q\u04e7\bQ\nQ\fQ\u04ea\tQ\u0001R"+
		"\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001"+
		"T\u0005T\u04f7\bT\nT\fT\u04fa\tT\u0001U\u0001U\u0001U\u0003U\u04ff\bU"+
		"\u0001U\u0001U\u0001U\u0001U\u0001U\u0001V\u0001V\u0001V\u0005V\u0509"+
		"\bV\nV\fV\u050c\tV\u0001V\u0000\u0001lW\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:"+
		"<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u0000\u0007\u0002\u0000\u0015\u0015\"\""+
		"\u0001\u0000~\u0081\u0002\u0000qq\u0084\u0084\u0003\u0000`aceqq\u0002"+
		"\u0000GGrr\u0001\u0000mn\u0001\u0000\u0011\u0014\u05a5\u0000\u00b1\u0001"+
		"\u0000\u0000\u0000\u0002\u00cf\u0001\u0000\u0000\u0000\u0004\u00d4\u0001"+
		"\u0000\u0000\u0000\u0006\u00df\u0001\u0000\u0000\u0000\b\u00ea\u0001\u0000"+
		"\u0000\u0000\n\u00ee\u0001\u0000\u0000\u0000\f\u00f0\u0001\u0000\u0000"+
		"\u0000\u000e\u00f8\u0001\u0000\u0000\u0000\u0010\u0100\u0001\u0000\u0000"+
		"\u0000\u0012\u0111\u0001\u0000\u0000\u0000\u0014\u0113\u0001\u0000\u0000"+
		"\u0000\u0016\u0117\u0001\u0000\u0000\u0000\u0018\u0119\u0001\u0000\u0000"+
		"\u0000\u001a\u0121\u0001\u0000\u0000\u0000\u001c\u012f\u0001\u0000\u0000"+
		"\u0000\u001e\u0131\u0001\u0000\u0000\u0000 \u0137\u0001\u0000\u0000\u0000"+
		"\"\u013b\u0001\u0000\u0000\u0000$\u013f\u0001\u0000\u0000\u0000&\u0150"+
		"\u0001\u0000\u0000\u0000(\u015f\u0001\u0000\u0000\u0000*\u0161\u0001\u0000"+
		"\u0000\u0000,\u016e\u0001\u0000\u0000\u0000.\u0176\u0001\u0000\u0000\u0000"+
		"0\u0178\u0001\u0000\u0000\u00002\u0183\u0001\u0000\u0000\u00004\u0193"+
		"\u0001\u0000\u0000\u00006\u0195\u0001\u0000\u0000\u00008\u01a0\u0001\u0000"+
		"\u0000\u0000:\u01af\u0001\u0000\u0000\u0000<\u01b9\u0001\u0000\u0000\u0000"+
		">\u01be\u0001\u0000\u0000\u0000@\u01ca\u0001\u0000\u0000\u0000B\u01d2"+
		"\u0001\u0000\u0000\u0000D\u01d6\u0001\u0000\u0000\u0000F\u01e3\u0001\u0000"+
		"\u0000\u0000H\u01e6\u0001\u0000\u0000\u0000J\u01eb\u0001\u0000\u0000\u0000"+
		"L\u0229\u0001\u0000\u0000\u0000N\u0267\u0001\u0000\u0000\u0000P\u0269"+
		"\u0001\u0000\u0000\u0000R\u027e\u0001\u0000\u0000\u0000T\u02b8\u0001\u0000"+
		"\u0000\u0000V\u02ba\u0001\u0000\u0000\u0000X\u02c5\u0001\u0000\u0000\u0000"+
		"Z\u02c7\u0001\u0000\u0000\u0000\\\u02da\u0001\u0000\u0000\u0000^\u0316"+
		"\u0001\u0000\u0000\u0000`\u0318\u0001\u0000\u0000\u0000b\u0327\u0001\u0000"+
		"\u0000\u0000d\u032d\u0001\u0000\u0000\u0000f\u0334\u0001\u0000\u0000\u0000"+
		"h\u0337\u0001\u0000\u0000\u0000j\u033a\u0001\u0000\u0000\u0000l\u0376"+
		"\u0001\u0000\u0000\u0000n\u03ca\u0001\u0000\u0000\u0000p\u03cc\u0001\u0000"+
		"\u0000\u0000r\u03da\u0001\u0000\u0000\u0000t\u03e6\u0001\u0000\u0000\u0000"+
		"v\u0409\u0001\u0000\u0000\u0000x\u040b\u0001\u0000\u0000\u0000z\u0410"+
		"\u0001\u0000\u0000\u0000|\u043d\u0001\u0000\u0000\u0000~\u044b\u0001\u0000"+
		"\u0000\u0000\u0080\u0451\u0001\u0000\u0000\u0000\u0082\u0453\u0001\u0000"+
		"\u0000\u0000\u0084\u045f\u0001\u0000\u0000\u0000\u0086\u0472\u0001\u0000"+
		"\u0000\u0000\u0088\u0490\u0001\u0000\u0000\u0000\u008a\u0496\u0001\u0000"+
		"\u0000\u0000\u008c\u049c\u0001\u0000\u0000\u0000\u008e\u04a2\u0001\u0000"+
		"\u0000\u0000\u0090\u04a8\u0001\u0000\u0000\u0000\u0092\u04ae\u0001\u0000"+
		"\u0000\u0000\u0094\u04b2\u0001\u0000\u0000\u0000\u0096\u04b6\u0001\u0000"+
		"\u0000\u0000\u0098\u04ba\u0001\u0000\u0000\u0000\u009a\u04be\u0001\u0000"+
		"\u0000\u0000\u009c\u04c2\u0001\u0000\u0000\u0000\u009e\u04cf\u0001\u0000"+
		"\u0000\u0000\u00a0\u04e1\u0001\u0000\u0000\u0000\u00a2\u04e3\u0001\u0000"+
		"\u0000\u0000\u00a4\u04eb\u0001\u0000\u0000\u0000\u00a6\u04ef\u0001\u0000"+
		"\u0000\u0000\u00a8\u04f8\u0001\u0000\u0000\u0000\u00aa\u04fb\u0001\u0000"+
		"\u0000\u0000\u00ac\u050a\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0002"+
		"\u0001\u0000\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b2\u00b4\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0000\u0000\u0001\u00b5\u0001\u0001\u0000"+
		"\u0000\u0000\u00b6\u00d0\u0003N\'\u0000\u00b7\u00d0\u0003>\u001f\u0000"+
		"\u00b8\u00d0\u0003L&\u0000\u00b9\u00d0\u0003R)\u0000\u00ba\u00d0\u0003"+
		"`0\u0000\u00bb\u00d0\u0003b1\u0000\u00bc\u00d0\u0003^/\u0000\u00bd\u00d0"+
		"\u0003f3\u0000\u00be\u00d0\u0003h4\u0000\u00bf\u00d0\u0003v;\u0000\u00c0"+
		"\u00d0\u00034\u001a\u0000\u00c1\u00d0\u0003&\u0013\u0000\u00c2\u00d0\u0003"+
		"(\u0014\u0000\u00c3\u00d0\u00036\u001b\u0000\u00c4\u00d0\u0003*\u0015"+
		"\u0000\u00c5\u00d0\u0003F#\u0000\u00c6\u00d0\u0003r9\u0000\u00c7\u00d0"+
		"\u0003D\"\u0000\u00c8\u00d0\u0003\u0004\u0002\u0000\u00c9\u00d0\u0003"+
		"\u0012\t\u0000\u00ca\u00d0\u0003\u001c\u000e\u0000\u00cb\u00d0\u0003$"+
		"\u0012\u0000\u00cc\u00d0\u0003p8\u0000\u00cd\u00d0\u0003\u00a0P\u0000"+
		"\u00ce\u00d0\u0003\u00aaU\u0000\u00cf\u00b6\u0001\u0000\u0000\u0000\u00cf"+
		"\u00b7\u0001\u0000\u0000\u0000\u00cf\u00b8\u0001\u0000\u0000\u0000\u00cf"+
		"\u00b9\u0001\u0000\u0000\u0000\u00cf\u00ba\u0001\u0000\u0000\u0000\u00cf"+
		"\u00bb\u0001\u0000\u0000\u0000\u00cf\u00bc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00bd\u0001\u0000\u0000\u0000\u00cf\u00be\u0001\u0000\u0000\u0000\u00cf"+
		"\u00bf\u0001\u0000\u0000\u0000\u00cf\u00c0\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c1\u0001\u0000\u0000\u0000\u00cf\u00c2\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c3\u0001\u0000\u0000\u0000\u00cf\u00c4\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c5\u0001\u0000\u0000\u0000\u00cf\u00c6\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c7\u0001\u0000\u0000\u0000\u00cf\u00c8\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cf\u00ca\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cb\u0001\u0000\u0000\u0000\u00cf\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u0003\u0001\u0000\u0000\u0000\u00d1\u00d5\u0003\u0006\u0003\u0000\u00d2"+
		"\u00d5\u0003\b\u0004\u0000\u00d3\u00d5\u0003\n\u0005\u0000\u00d4\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d5\u0005\u0001\u0000\u0000\u0000\u00d6\u00d7"+
		"\u0005\u0003\u0000\u0000\u00d7\u00d8\u00058\u0000\u0000\u00d8\u00d9\u0005"+
		"9\u0000\u0000\u00d9\u00e0\u0003L&\u0000\u00da\u00db\u0005\u0003\u0000"+
		"\u0000\u00db\u00dc\u00058\u0000\u0000\u00dc\u00dd\u0005n\u0000\u0000\u00dd"+
		"\u00de\u00059\u0000\u0000\u00de\u00e0\u0003L&\u0000\u00df\u00d6\u0001"+
		"\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000\u0000\u00e0\u0007\u0001"+
		"\u0000\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000\u00e2\u00e3\u0005"+
		"8\u0000\u0000\u00e3\u00e4\u00059\u0000\u0000\u00e4\u00eb\u0003R)\u0000"+
		"\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u00058\u0000\u0000\u00e7"+
		"\u00e8\u0005n\u0000\u0000\u00e8\u00e9\u00059\u0000\u0000\u00e9\u00eb\u0003"+
		"R)\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea\u00e5\u0001\u0000\u0000"+
		"\u0000\u00eb\t\u0001\u0000\u0000\u0000\u00ec\u00ef\u0003\f\u0006\u0000"+
		"\u00ed\u00ef\u0003\u000e\u0007\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u000b\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1\u00f2\u0005A\u0000\u0000\u00f2"+
		"\u00f3\u0005\u0006\u0000\u0000\u00f3\u00f4\u00058\u0000\u0000\u00f4\u00f5"+
		"\u0003\u0010\b\u0000\u00f5\u00f6\u00059\u0000\u0000\u00f6\u00f7\u0005"+
		"<\u0000\u0000\u00f7\r\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0005"+
		"\u0000\u0000\u00f9\u00fa\u0005A\u0000\u0000\u00fa\u00fb\u0005\u0007\u0000"+
		"\u0000\u00fb\u00fc\u00058\u0000\u0000\u00fc\u00fd\u0005n\u0000\u0000\u00fd"+
		"\u00fe\u00059\u0000\u0000\u00fe\u00ff\u0005<\u0000\u0000\u00ff\u000f\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0005q\u0000\u0000\u0101\u010a\u00058\u0000"+
		"\u0000\u0102\u0107\u0003l6\u0000\u0103\u0104\u0005=\u0000\u0000\u0104"+
		"\u0106\u0003l6\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000\u0000\u010a\u010b\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d\u0005"+
		"9\u0000\u0000\u010d\u0011\u0001\u0000\u0000\u0000\u010e\u0112\u0003\u0014"+
		"\n\u0000\u010f\u0112\u0003\u0016\u000b\u0000\u0110\u0112\u0003\u0018\f"+
		"\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112\u0013\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0005\b\u0000\u0000\u0114\u0115\u0005>\u0000\u0000"+
		"\u0115\u0116\u0005n\u0000\u0000\u0116\u0015\u0001\u0000\u0000\u0000\u0117"+
		"\u0118\u0005\t\u0000\u0000\u0118\u0017\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005\n\u0000\u0000\u011a\u011b\u0005A\u0000\u0000\u011b\u011c\u0005"+
		"\u000b\u0000\u0000\u011c\u011d\u00058\u0000\u0000\u011d\u011e\u0003\u001a"+
		"\r\u0000\u011e\u011f\u00059\u0000\u0000\u011f\u0120\u0005<\u0000\u0000"+
		"\u0120\u0019\u0001\u0000\u0000\u0000\u0121\u0122\u00056\u0000\u0000\u0122"+
		"\u0127\u0005n\u0000\u0000\u0123\u0124\u0005=\u0000\u0000\u0124\u0126\u0005"+
		"n\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000"+
		"\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000"+
		"\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u012b\u00057\u0000\u0000\u012b\u001b\u0001\u0000\u0000"+
		"\u0000\u012c\u0130\u0003\u001e\u000f\u0000\u012d\u0130\u0003 \u0010\u0000"+
		"\u012e\u0130\u0003\"\u0011\u0000\u012f\u012c\u0001\u0000\u0000\u0000\u012f"+
		"\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u0130"+
		"\u001d\u0001\u0000\u0000\u0000\u0131\u0132\u00056\u0000\u0000\u0132\u0133"+
		"\u0005\f\u0000\u0000\u0133\u0134\u00057\u0000\u0000\u0134\u0135\u0005"+
		">\u0000\u0000\u0135\u0136\u0005q\u0000\u0000\u0136\u001f\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0005\r\u0000\u0000\u0138\u0139\u0005>\u0000\u0000"+
		"\u0139\u013a\u0005n\u0000\u0000\u013a!\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005\u000e\u0000\u0000\u013c\u013d\u0005>\u0000\u0000\u013d\u013e\u0005"+
		"n\u0000\u0000\u013e#\u0001\u0000\u0000\u0000\u013f\u0140\u0003l6\u0000"+
		"\u0140\u0141\u0005A\u0000\u0000\u0141\u0142\u0005q\u0000\u0000\u0142\u014b"+
		"\u00058\u0000\u0000\u0143\u0148\u0003l6\u0000\u0144\u0145\u0005=\u0000"+
		"\u0000\u0145\u0147\u0003l6\u0000\u0146\u0144\u0001\u0000\u0000\u0000\u0147"+
		"\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148"+
		"\u0149\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a"+
		"\u0148\u0001\u0000\u0000\u0000\u014b\u0143\u0001\u0000\u0000\u0000\u014b"+
		"\u014c\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"+
		"\u014e\u00059\u0000\u0000\u014e\u014f\u0005<\u0000\u0000\u014f%\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0007\u0000\u0000\u0000\u0151\u0155\u0005"+
		"8\u0000\u0000\u0152\u0156\u00030\u0018\u0000\u0153\u0154\u0005:\u0000"+
		"\u0000\u0154\u0156\u0005;\u0000\u0000\u0155\u0152\u0001\u0000\u0000\u0000"+
		"\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000\u0000"+
		"\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0158\u00059\u0000\u0000\u0158"+
		"\u0159\u0003(\u0014\u0000\u0159\'\u0001\u0000\u0000\u0000\u015a\u015b"+
		"\u0005\u001b\u0000\u0000\u015b\u0160\u0003*\u0015\u0000\u015c\u015d\u0005"+
		"\u001b\u0000\u0000\u015d\u015e\u0005q\u0000\u0000\u015e\u0160\u0005<\u0000"+
		"\u0000\u015f\u015a\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000"+
		"\u0000\u0160)\u0001\u0000\u0000\u0000\u0161\u0162\u0005v\u0000\u0000\u0162"+
		"\u0163\u0005q\u0000\u0000\u0163\u0164\u0005:\u0000\u0000\u0164\u0165\u0003"+
		",\u0016\u0000\u0165\u0166\u0005;\u0000\u0000\u0166+\u0001\u0000\u0000"+
		"\u0000\u0167\u016d\u0003L&\u0000\u0168\u016d\u0003T*\u0000\u0169\u016d"+
		"\u0003N\'\u0000\u016a\u016d\u0003P(\u0000\u016b\u016d\u0003R)\u0000\u016c"+
		"\u0167\u0001\u0000\u0000\u0000\u016c\u0168\u0001\u0000\u0000\u0000\u016c"+
		"\u0169\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c"+
		"\u016b\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000\u016e"+
		"\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f"+
		"-\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0171\u0173"+
		"\u00030\u0018\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0172\u0173\u0001"+
		"\u0000\u0000\u0000\u0173\u0177\u0001\u0000\u0000\u0000\u0174\u0175\u0005"+
		":\u0000\u0000\u0175\u0177\u0005;\u0000\u0000\u0176\u0172\u0001\u0000\u0000"+
		"\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177/\u0001\u0000\u0000\u0000"+
		"\u0178\u017d\u00032\u0019\u0000\u0179\u017a\u0005=\u0000\u0000\u017a\u017c"+
		"\u00032\u0019\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f\u0001"+
		"\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u0180\u0182\u0005=\u0000\u0000\u0181\u0180\u0001\u0000"+
		"\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u01821\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\u0005q\u0000\u0000\u0184\u0185\u0005?\u0000\u0000\u0185"+
		"\u0186\u0003X,\u0000\u01863\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"\u001a\u0000\u0000\u0188\u0189\u0005:\u0000\u0000\u0189\u018a\u0005q\u0000"+
		"\u0000\u018a\u018b\u0005;\u0000\u0000\u018b\u018c\u0005]\u0000\u0000\u018c"+
		"\u018d\u0005n\u0000\u0000\u018d\u0194\u0005<\u0000\u0000\u018e\u018f\u0005"+
		"\u001a\u0000\u0000\u018f\u0190\u0005q\u0000\u0000\u0190\u0191\u0005]\u0000"+
		"\u0000\u0191\u0192\u0005n\u0000\u0000\u0192\u0194\u0005<\u0000\u0000\u0193"+
		"\u0187\u0001\u0000\u0000\u0000\u0193\u018e\u0001\u0000\u0000\u0000\u0194"+
		"5\u0001\u0000\u0000\u0000\u0195\u0196\u0005w\u0000\u0000\u0196\u0197\u0005"+
		"A\u0000\u0000\u0197\u0198\u0005q\u0000\u0000\u0198\u019c\u0005>\u0000"+
		"\u0000\u0199\u019d\u00038\u001c\u0000\u019a\u019d\u0003:\u001d\u0000\u019b"+
		"\u019d\u0003<\u001e\u0000\u019c\u0199\u0001\u0000\u0000\u0000\u019c\u019a"+
		"\u0001\u0000\u0000\u0000\u019c\u019b\u0001\u0000\u0000\u0000\u019d\u019e"+
		"\u0001\u0000\u0000\u0000\u019e\u019f\u0005<\u0000\u0000\u019f7\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0005x\u0000\u0000\u01a1\u01a2\u0005q\u0000\u0000"+
		"\u01a2\u01ab\u00058\u0000\u0000\u01a3\u01a8\u0003l6\u0000\u01a4\u01a5"+
		"\u0005=\u0000\u0000\u01a5\u01a7\u0003l6\u0000\u01a6\u01a4\u0001\u0000"+
		"\u0000\u0000\u01a7\u01aa\u0001\u0000\u0000\u0000\u01a8\u01a6\u0001\u0000"+
		"\u0000\u0000\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9\u01ac\u0001\u0000"+
		"\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01a3\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u00059\u0000\u0000\u01ae9\u0001\u0000\u0000\u0000"+
		"\u01af\u01b5\u0005w\u0000\u0000\u01b0\u01b3\u0005A\u0000\u0000\u01b1\u01b4"+
		"\u0005q\u0000\u0000\u01b2\u01b4\u0003p8\u0000\u01b3\u01b1\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b5\u01b0\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b8;\u0001\u0000\u0000\u0000\u01b9\u01bc\u0005q\u0000\u0000"+
		"\u01ba\u01bb\u0005A\u0000\u0000\u01bb\u01bd\u0005q\u0000\u0000\u01bc\u01ba"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bd\u0001\u0000\u0000\u0000\u01bd=\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005y\u0000\u0000\u01bf\u01c0\u0005q\u0000"+
		"\u0000\u01c0\u01c4\u0005:\u0000\u0000\u01c1\u01c3\u0003@ \u0000\u01c2"+
		"\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c6\u0001\u0000\u0000\u0000\u01c4"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005;\u0000\u0000\u01c8\u01c9\u0005<\u0000\u0000\u01c9?\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cf\u0003B!\u0000\u01cb\u01cc\u0005=\u0000"+
		"\u0000\u01cc\u01ce\u0003B!\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01ce"+
		"\u01d1\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf"+
		"\u01d0\u0001\u0000\u0000\u0000\u01d0A\u0001\u0000\u0000\u0000\u01d1\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d3\u0005q\u0000\u0000\u01d3\u01d4\u0005"+
		">\u0000\u0000\u01d4\u01d5\u0003X,\u0000\u01d5C\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0005z\u0000\u0000\u01d7\u01d8\u0005A\u0000\u0000\u01d8\u01d9"+
		"\u0005{\u0000\u0000\u01d9\u01dd\u00058\u0000\u0000\u01da\u01de\u0005q"+
		"\u0000\u0000\u01db\u01de\u0005n\u0000\u0000\u01dc\u01de\u0003X,\u0000"+
		"\u01dd\u01da\u0001\u0000\u0000\u0000\u01dd\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd\u01dc\u0001\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000"+
		"\u01df\u01e1\u00059\u0000\u0000\u01e0\u01e2\u0005<\u0000\u0000\u01e1\u01e0"+
		"\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2E\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0005|\u0000\u0000\u01e4\u01e5\u0003*\u0015"+
		"\u0000\u01e5G\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005}\u0000\u0000\u01e7"+
		"\u01e8\u0005:\u0000\u0000\u01e8\u01e9\u0003,\u0016\u0000\u01e9\u01ea\u0005"+
		";\u0000\u0000\u01eaI\u0001\u0000\u0000\u0000\u01eb\u01ec\u0007\u0001\u0000"+
		"\u0000\u01ecK\u0001\u0000\u0000\u0000\u01ed\u01ef\u0003J%\u0000\u01ee"+
		"\u01ed\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f0\u01f2\u0005\u0082\u0000\u0000\u01f1"+
		"\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005q\u0000\u0000\u01f4\u01f5"+
		"\u0005?\u0000\u0000\u01f5\u01f6\u0003V+\u0000\u01f6\u01fa\u0005>\u0000"+
		"\u0000\u01f7\u01fb\u0003l6\u0000\u01f8\u01fb\u0003X,\u0000\u01f9\u01fb"+
		"\u0003\u009cN\u0000\u01fa\u01f7\u0001\u0000\u0000\u0000\u01fa\u01f8\u0001"+
		"\u0000\u0000\u0000\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001"+
		"\u0000\u0000\u0000\u01fc\u01fd\u0005<\u0000\u0000\u01fd\u022a\u0001\u0000"+
		"\u0000\u0000\u01fe\u0200\u0003J%\u0000\u01ff\u01fe\u0001\u0000\u0000\u0000"+
		"\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001\u0000\u0000\u0000"+
		"\u0201\u0203\u0005\u0082\u0000\u0000\u0202\u0201\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000"+
		"\u0204\u0205\u0005q\u0000\u0000\u0205\u0209\u0005>\u0000\u0000\u0206\u020a"+
		"\u0003l6\u0000\u0207\u020a\u0003X,\u0000\u0208\u020a\u0003\u009cN\u0000"+
		"\u0209\u0206\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000"+
		"\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020c\u0005<\u0000\u0000\u020c\u022a\u0001\u0000\u0000\u0000\u020d"+
		"\u020f\u0003J%\u0000\u020e\u020d\u0001\u0000\u0000\u0000\u020e\u020f\u0001"+
		"\u0000\u0000\u0000\u020f\u0211\u0001\u0000\u0000\u0000\u0210\u0212\u0005"+
		"\u0082\u0000\u0000\u0211\u0210\u0001\u0000\u0000\u0000\u0211\u0212\u0001"+
		"\u0000\u0000\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0005"+
		"q\u0000\u0000\u0214\u0215\u0005?\u0000\u0000\u0215\u0216\u0003V+\u0000"+
		"\u0216\u0217\u0005<\u0000\u0000\u0217\u022a\u0001\u0000\u0000\u0000\u0218"+
		"\u021a\u0003J%\u0000\u0219\u0218\u0001\u0000\u0000\u0000\u0219\u021a\u0001"+
		"\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0005"+
		"q\u0000\u0000\u021c\u0220\u0005>\u0000\u0000\u021d\u0221\u0003l6\u0000"+
		"\u021e\u0221\u0003X,\u0000\u021f\u0221\u0003\u009cN\u0000\u0220\u021d"+
		"\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u021f"+
		"\u0001\u0000\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222\u0223"+
		"\u0005<\u0000\u0000\u0223\u022a\u0001\u0000\u0000\u0000\u0224\u0226\u0003"+
		"J%\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0005q\u0000\u0000"+
		"\u0228\u022a\u0005<\u0000\u0000\u0229\u01ee\u0001\u0000\u0000\u0000\u0229"+
		"\u01ff\u0001\u0000\u0000\u0000\u0229\u020e\u0001\u0000\u0000\u0000\u0229"+
		"\u0219\u0001\u0000\u0000\u0000\u0229\u0225\u0001\u0000\u0000\u0000\u022a"+
		"M\u0001\u0000\u0000\u0000\u022b\u022d\u0005\u0082\u0000\u0000\u022c\u022b"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d\u022e"+
		"\u0001\u0000\u0000\u0000\u022e\u022f\u0005q\u0000\u0000\u022f\u0230\u0005"+
		"?\u0000\u0000\u0230\u0231\u0003V+\u0000\u0231\u0232\u00056\u0000\u0000"+
		"\u0232\u0233\u00057\u0000\u0000\u0233\u0234\u0005>\u0000\u0000\u0234\u023d"+
		"\u00056\u0000\u0000\u0235\u023a\u0003X,\u0000\u0236\u0237\u0005=\u0000"+
		"\u0000\u0237\u0239\u0003X,\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0239"+
		"\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000\u0000\u023a"+
		"\u023b\u0001\u0000\u0000\u0000\u023b\u023e\u0001\u0000\u0000\u0000\u023c"+
		"\u023a\u0001\u0000\u0000\u0000\u023d\u0235\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f"+
		"\u0240\u00057\u0000\u0000\u0240\u0241\u0005<\u0000\u0000\u0241\u0268\u0001"+
		"\u0000\u0000\u0000\u0242\u0244\u0005\u0082\u0000\u0000\u0243\u0242\u0001"+
		"\u0000\u0000\u0000\u0243\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0001"+
		"\u0000\u0000\u0000\u0245\u0246\u0005q\u0000\u0000\u0246\u0247\u0005?\u0000"+
		"\u0000\u0247\u0248\u0005`\u0000\u0000\u0248\u0249\u0005>\u0000\u0000\u0249"+
		"\u0252\u00056\u0000\u0000\u024a\u024f\u0003X,\u0000\u024b\u024c\u0005"+
		"=\u0000\u0000\u024c\u024e\u0003X,\u0000\u024d\u024b\u0001\u0000\u0000"+
		"\u0000\u024e\u0251\u0001\u0000\u0000\u0000\u024f\u024d\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0253\u0001\u0000\u0000"+
		"\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0252\u024a\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u00057\u0000\u0000\u0255\u0268\u0005<\u0000\u0000\u0256"+
		"\u0257\u0005q\u0000\u0000\u0257\u0258\u0005>\u0000\u0000\u0258\u025a\u0005"+
		"6\u0000\u0000\u0259\u025b\u0003X,\u0000\u025a\u0259\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0001\u0000\u0000\u0000\u025b\u0262\u0001\u0000\u0000"+
		"\u0000\u025c\u025e\u0003X,\u0000\u025d\u025f\u0005=\u0000\u0000\u025e"+
		"\u025d\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f"+
		"\u0261\u0001\u0000\u0000\u0000\u0260\u025c\u0001\u0000\u0000\u0000\u0261"+
		"\u0264\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000\u0000\u0000\u0262"+
		"\u0263\u0001\u0000\u0000\u0000\u0263\u0265\u0001\u0000\u0000\u0000\u0264"+
		"\u0262\u0001\u0000\u0000\u0000\u0265\u0266\u00057\u0000\u0000\u0266\u0268"+
		"\u0005<\u0000\u0000\u0267\u022c\u0001\u0000\u0000\u0000\u0267\u0243\u0001"+
		"\u0000\u0000\u0000\u0267\u0256\u0001\u0000\u0000\u0000\u0268O\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0005|\u0000\u0000\u026a\u026b\u0005q\u0000\u0000"+
		"\u026b\u0274\u00058\u0000\u0000\u026c\u0271\u0003n7\u0000\u026d\u026e"+
		"\u0005=\u0000\u0000\u026e\u0270\u0003n7\u0000\u026f\u026d\u0001\u0000"+
		"\u0000\u0000\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000"+
		"\u0000\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u026c\u0001\u0000"+
		"\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000"+
		"\u0000\u0000\u0276\u0277\u00059\u0000\u0000\u0277\u027a\u0005?\u0000\u0000"+
		"\u0278\u027b\u0003V+\u0000\u0279\u027b\u0005\u0083\u0000\u0000\u027a\u0278"+
		"\u0001\u0000\u0000\u0000\u027a\u0279\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027c\u027d\u0005<\u0000\u0000\u027dQ\u0001\u0000"+
		"\u0000\u0000\u027e\u027f\u0007\u0002\u0000\u0000\u027f\u0288\u00058\u0000"+
		"\u0000\u0280\u0285\u0003n7\u0000\u0281\u0282\u0005=\u0000\u0000\u0282"+
		"\u0284\u0003n7\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u0287\u0001"+
		"\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000\u0285\u0286\u0001"+
		"\u0000\u0000\u0000\u0286\u0289\u0001\u0000\u0000\u0000\u0287\u0285\u0001"+
		"\u0000\u0000\u0000\u0288\u0280\u0001\u0000\u0000\u0000\u0288\u0289\u0001"+
		"\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028d\u0005"+
		"9\u0000\u0000\u028b\u028c\u0005?\u0000\u0000\u028c\u028e\u0003V+\u0000"+
		"\u028d\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000"+
		"\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0293\u0005:\u0000\u0000\u0290"+
		"\u0292\u0003\u0002\u0001\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292"+
		"\u0295\u0001\u0000\u0000\u0000\u0293\u0291\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0001\u0000\u0000\u0000\u0294\u0296\u0001\u0000\u0000\u0000\u0295"+
		"\u0293\u0001\u0000\u0000\u0000\u0296\u0297\u0005;\u0000\u0000\u0297S\u0001"+
		"\u0000\u0000\u0000\u0298\u029a\u0003J%\u0000\u0299\u0298\u0001\u0000\u0000"+
		"\u0000\u0299\u029a\u0001\u0000\u0000\u0000\u029a\u029b\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0005q\u0000\u0000\u029c\u029d\u0005?\u0000\u0000\u029d"+
		"\u029e\u0005q\u0000\u0000\u029e\u02b9\u0005<\u0000\u0000\u029f\u02a1\u0003"+
		"J%\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a2\u0001\u0000\u0000\u0000\u02a2\u02a3\u0005q\u0000\u0000"+
		"\u02a3\u02a4\u0005?\u0000\u0000\u02a4\u02a5\u0005q\u0000\u0000\u02a5\u02a6"+
		"\u0005>\u0000\u0000\u02a6\u02a7\u0005x\u0000\u0000\u02a7\u02a8\u0005q"+
		"\u0000\u0000\u02a8\u02b3\u00058\u0000\u0000\u02a9\u02ae\u0003X,\u0000"+
		"\u02aa\u02ab\u0005=\u0000\u0000\u02ab\u02ad\u0003X,\u0000\u02ac\u02aa"+
		"\u0001\u0000\u0000\u0000\u02ad\u02b0\u0001\u0000\u0000\u0000\u02ae\u02ac"+
		"\u0001\u0000\u0000\u0000\u02ae\u02af\u0001\u0000\u0000\u0000\u02af\u02b2"+
		"\u0001\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1\u02a9"+
		"\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000\u0000\u02b3\u02b1"+
		"\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000\u0000\u02b4\u02b6"+
		"\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b7"+
		"\u00059\u0000\u0000\u02b7\u02b9\u0005<\u0000\u0000\u02b8\u0299\u0001\u0000"+
		"\u0000\u0000\u02b8\u02a0\u0001\u0000\u0000\u0000\u02b9U\u0001\u0000\u0000"+
		"\u0000\u02ba\u02bb\u0007\u0003\u0000\u0000\u02bbW\u0001\u0000\u0000\u0000"+
		"\u02bc\u02c6\u0005m\u0000\u0000\u02bd\u02c6\u0005n\u0000\u0000\u02be\u02c6"+
		"\u0005o\u0000\u0000\u02bf\u02c6\u0003\\.\u0000\u02c0\u02c6\u0003Z-\u0000"+
		"\u02c1\u02c6\u0005\u0085\u0000\u0000\u02c2\u02c6\u0003r9\u0000\u02c3\u02c6"+
		"\u0003\u0082A\u0000\u02c4\u02c6\u0003\u009cN\u0000\u02c5\u02bc\u0001\u0000"+
		"\u0000\u0000\u02c5\u02bd\u0001\u0000\u0000\u0000\u02c5\u02be\u0001\u0000"+
		"\u0000\u0000\u02c5\u02bf\u0001\u0000\u0000\u0000\u02c5\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c1\u0001\u0000\u0000\u0000\u02c5\u02c2\u0001\u0000"+
		"\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c4\u0001\u0000"+
		"\u0000\u0000\u02c6Y\u0001\u0000\u0000\u0000\u02c7\u02c8\u0005:\u0000\u0000"+
		"\u02c8\u02c9\u0005q\u0000\u0000\u02c9\u02ca\u0005?\u0000\u0000\u02ca\u02d5"+
		"\u0003X,\u0000\u02cb\u02cc\u0005=\u0000\u0000\u02cc\u02cd\u0005q\u0000"+
		"\u0000\u02cd\u02ce\u0005?\u0000\u0000\u02ce\u02cf\u0003X,\u0000\u02cf"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d0\u02d2\u0005=\u0000\u0000\u02d1\u02d0"+
		"\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d4"+
		"\u0001\u0000\u0000\u0000\u02d3\u02cb\u0001\u0000\u0000\u0000\u02d4\u02d7"+
		"\u0001\u0000\u0000\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6"+
		"\u0001\u0000\u0000\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d5"+
		"\u0001\u0000\u0000\u0000\u02d8\u02d9\u0005;\u0000\u0000\u02d9[\u0001\u0000"+
		"\u0000\u0000\u02da\u02df\u00056\u0000\u0000\u02db\u02de\u0005q\u0000\u0000"+
		"\u02dc\u02de\u0003X,\u0000\u02dd\u02db\u0001\u0000\u0000\u0000\u02dd\u02dc"+
		"\u0001\u0000\u0000\u0000\u02de\u02e1\u0001\u0000\u0000\u0000\u02df\u02dd"+
		"\u0001\u0000\u0000\u0000\u02df\u02e0\u0001\u0000\u0000\u0000\u02e0\u02e9"+
		"\u0001\u0000\u0000\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e2\u02e5"+
		"\u0005=\u0000\u0000\u02e3\u02e6\u0005q\u0000\u0000\u02e4\u02e6\u0003X"+
		",\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e8\u0001\u0000\u0000\u0000\u02e7\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e8\u02eb\u0001\u0000\u0000\u0000\u02e9\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02ec\u02ee\u0005=\u0000\u0000"+
		"\u02ed\u02ec\u0001\u0000\u0000\u0000\u02ed\u02ee\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ef\u0001\u0000\u0000\u0000\u02ef\u02f0\u00057\u0000\u0000\u02f0"+
		"]\u0001\u0000\u0000\u0000\u02f1\u02f2\u0005q\u0000\u0000\u02f2\u02f5\u0005"+
		">\u0000\u0000\u02f3\u02f6\u0003l6\u0000\u02f4\u02f6\u0003\u009cN\u0000"+
		"\u02f5\u02f3\u0001\u0000\u0000\u0000\u02f5\u02f4\u0001\u0000\u0000\u0000"+
		"\u02f6\u02fb\u0001\u0000\u0000\u0000\u02f7\u02f8\u0005=\u0000\u0000\u02f8"+
		"\u02fa\u0003l6\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02fa\u02fd\u0001"+
		"\u0000\u0000\u0000\u02fb\u02f9\u0001\u0000\u0000\u0000\u02fb\u02fc\u0001"+
		"\u0000\u0000\u0000\u02fc\u02fe\u0001\u0000\u0000\u0000\u02fd\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fe\u02ff\u0005<\u0000\u0000\u02ff\u0317\u0001\u0000"+
		"\u0000\u0000\u0300\u0301\u0005w\u0000\u0000\u0301\u0302\u0005A\u0000\u0000"+
		"\u0302\u0303\u0005q\u0000\u0000\u0303\u0304\u0005>\u0000\u0000\u0304\u0305"+
		"\u0003l6\u0000\u0305\u0306\u0005<\u0000\u0000\u0306\u0317\u0001\u0000"+
		"\u0000\u0000\u0307\u0308\u0005q\u0000\u0000\u0308\u0309\u0005>\u0000\u0000"+
		"\u0309\u0312\u00056\u0000\u0000\u030a\u030f\u0003X,\u0000\u030b\u030c"+
		"\u0005=\u0000\u0000\u030c\u030e\u0003X,\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030e\u0311\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000"+
		"\u0000\u0000\u030f\u0310\u0001\u0000\u0000\u0000\u0310\u0313\u0001\u0000"+
		"\u0000\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0312\u030a\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313\u0314\u0001\u0000"+
		"\u0000\u0000\u0314\u0315\u00057\u0000\u0000\u0315\u0317\u0005<\u0000\u0000"+
		"\u0316\u02f1\u0001\u0000\u0000\u0000\u0316\u0300\u0001\u0000\u0000\u0000"+
		"\u0316\u0307\u0001\u0000\u0000\u0000\u0317_\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0005\u0086\u0000\u0000\u0319\u031a\u00058\u0000\u0000\u031a\u031b"+
		"\u0003l6\u0000\u031b\u031c\u00059\u0000\u0000\u031c\u0320\u0003j5\u0000"+
		"\u031d\u031f\u0003d2\u0000\u031e\u031d\u0001\u0000\u0000\u0000\u031f\u0322"+
		"\u0001\u0000\u0000\u0000\u0320\u031e\u0001\u0000\u0000\u0000\u0320\u0321"+
		"\u0001\u0000\u0000\u0000\u0321\u0325\u0001\u0000\u0000\u0000\u0322\u0320"+
		"\u0001\u0000\u0000\u0000\u0323\u0324\u0005\u0087\u0000\u0000\u0324\u0326"+
		"\u0003j5\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326\u0001\u0000"+
		"\u0000\u0000\u0326a\u0001\u0000\u0000\u0000\u0327\u0328\u0005\u0088\u0000"+
		"\u0000\u0328\u0329\u00058\u0000\u0000\u0329\u032a\u0003l6\u0000\u032a"+
		"\u032b\u00059\u0000\u0000\u032b\u032c\u0003j5\u0000\u032cc\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0005\u0087\u0000\u0000\u032e\u032f\u0005\u0086"+
		"\u0000\u0000\u032f\u0330\u00058\u0000\u0000\u0330\u0331\u0003l6\u0000"+
		"\u0331\u0332\u00059\u0000\u0000\u0332\u0333\u0003j5\u0000\u0333e\u0001"+
		"\u0000\u0000\u0000\u0334\u0335\u0005\u0089\u0000\u0000\u0335\u0336\u0005"+
		"<\u0000\u0000\u0336g\u0001\u0000\u0000\u0000\u0337\u0338\u0005\u008a\u0000"+
		"\u0000\u0338\u0339\u0005<\u0000\u0000\u0339i\u0001\u0000\u0000\u0000\u033a"+
		"\u033e\u0005:\u0000\u0000\u033b\u033d\u0003\u0002\u0001\u0000\u033c\u033b"+
		"\u0001\u0000\u0000\u0000\u033d\u0340\u0001\u0000\u0000\u0000\u033e\u033c"+
		"\u0001\u0000\u0000\u0000\u033e\u033f\u0001\u0000\u0000\u0000\u033f\u0341"+
		"\u0001\u0000\u0000\u0000\u0340\u033e\u0001\u0000\u0000\u0000\u0341\u0342"+
		"\u0005;\u0000\u0000\u0342k\u0001\u0000\u0000\u0000\u0343\u0344\u00066"+
		"\uffff\uffff\u0000\u0344\u0345\u00058\u0000\u0000\u0345\u0346\u0003l6"+
		"\u0000\u0346\u0347\u00059\u0000\u0000\u0347\u0377\u0001\u0000\u0000\u0000"+
		"\u0348\u0349\u0005q\u0000\u0000\u0349\u034a\u00056\u0000\u0000\u034a\u034b"+
		"\u0003l6\u0000\u034b\u034c\u00057\u0000\u0000\u034c\u0377\u0001\u0000"+
		"\u0000\u0000\u034d\u034e\u0005R\u0000\u0000\u034e\u034f\u0003l6\u0000"+
		"\u034f\u0350\u0005S\u0000\u0000\u0350\u0377\u0001\u0000\u0000\u0000\u0351"+
		"\u0352\u0005w\u0000\u0000\u0352\u0353\u0005A\u0000\u0000\u0353\u0354\u0005"+
		"q\u0000\u0000\u0354\u0355\u0005A\u0000\u0000\u0355\u0356\u0005q\u0000"+
		"\u0000\u0356\u035f\u00058\u0000\u0000\u0357\u035c\u0003l6\u0000\u0358"+
		"\u0359\u0005=\u0000\u0000\u0359\u035b\u0003l6\u0000\u035a\u0358\u0001"+
		"\u0000\u0000\u0000\u035b\u035e\u0001\u0000\u0000\u0000\u035c\u035a\u0001"+
		"\u0000\u0000\u0000\u035c\u035d\u0001\u0000\u0000\u0000\u035d\u0360\u0001"+
		"\u0000\u0000\u0000\u035e\u035c\u0001\u0000\u0000\u0000\u035f\u0357\u0001"+
		"\u0000\u0000\u0000\u035f\u0360\u0001\u0000\u0000\u0000\u0360\u0361\u0001"+
		"\u0000\u0000\u0000\u0361\u0377\u00059\u0000\u0000\u0362\u0363\u0005q\u0000"+
		"\u0000\u0363\u0364\u0005b\u0000\u0000\u0364\u0377\u0003l6\b\u0365\u0366"+
		"\u0005q\u0000\u0000\u0366\u0367\u0005b\u0000\u0000\u0367\u0377\u0005q"+
		"\u0000\u0000\u0368\u0369\u0005w\u0000\u0000\u0369\u036a\u0005A\u0000\u0000"+
		"\u036a\u036b\u0005q\u0000\u0000\u036b\u036c\u0005>\u0000\u0000\u036c\u0377"+
		"\u0003l6\u0006\u036d\u036e\u0005w\u0000\u0000\u036e\u036f\u0005A\u0000"+
		"\u0000\u036f\u0377\u0005q\u0000\u0000\u0370\u0371\u0005q\u0000\u0000\u0371"+
		"\u0372\u0005A\u0000\u0000\u0372\u0377\u0005q\u0000\u0000\u0373\u0377\u0003"+
		"X,\u0000\u0374\u0377\u0005q\u0000\u0000\u0375\u0377\u0003r9\u0000\u0376"+
		"\u0343\u0001\u0000\u0000\u0000\u0376\u0348\u0001\u0000\u0000\u0000\u0376"+
		"\u034d\u0001\u0000\u0000\u0000\u0376\u0351\u0001\u0000\u0000\u0000\u0376"+
		"\u0362\u0001\u0000\u0000\u0000\u0376\u0365\u0001\u0000\u0000\u0000\u0376"+
		"\u0368\u0001\u0000\u0000\u0000\u0376\u036d\u0001\u0000\u0000\u0000\u0376"+
		"\u0370\u0001\u0000\u0000\u0000\u0376\u0373\u0001\u0000\u0000\u0000\u0376"+
		"\u0374\u0001\u0000\u0000\u0000\u0376\u0375\u0001\u0000\u0000\u0000\u0377"+
		"\u03bd\u0001\u0000\u0000\u0000\u0378\u0379\n\u001c\u0000\u0000\u0379\u037a"+
		"\u0005D\u0000\u0000\u037a\u03bc\u0003l6\u001d\u037b\u037c\n\u001b\u0000"+
		"\u0000\u037c\u037d\u0005F\u0000\u0000\u037d\u03bc\u0003l6\u001c\u037e"+
		"\u037f\n\u001a\u0000\u0000\u037f\u0380\u0005G\u0000\u0000\u0380\u03bc"+
		"\u0003l6\u001b\u0381\u0382\n\u0019\u0000\u0000\u0382\u0383\u0005B\u0000"+
		"\u0000\u0383\u03bc\u0003l6\u001a\u0384\u0385\n\u0018\u0000\u0000\u0385"+
		"\u0386\u0005C\u0000\u0000\u0386\u03bc\u0003l6\u0019\u0387\u0388\n\u0017"+
		"\u0000\u0000\u0388\u0389\u0005I\u0000\u0000\u0389\u03bc\u0003l6\u0018"+
		"\u038a\u038b\n\u0016\u0000\u0000\u038b\u038c\u0005J\u0000\u0000\u038c"+
		"\u03bc\u0003l6\u0017\u038d\u038e\n\u0015\u0000\u0000\u038e\u038f\u0005"+
		"K\u0000\u0000\u038f\u03bc\u0003l6\u0016\u0390\u0391\n\u0014\u0000\u0000"+
		"\u0391\u0392\u0005L\u0000\u0000\u0392\u03bc\u0003l6\u0015\u0393\u0394"+
		"\n\u0013\u0000\u0000\u0394\u0395\u0005N\u0000\u0000\u0395\u03bc\u0003"+
		"l6\u0014\u0396\u0397\n\u0012\u0000\u0000\u0397\u0398\u0005O\u0000\u0000"+
		"\u0398\u03bc\u0003l6\u0013\u0399\u039a\n\u0011\u0000\u0000\u039a\u039b"+
		"\u0005M\u0000\u0000\u039b\u03bc\u0003l6\u0012\u039c\u039d\n\u0010\u0000"+
		"\u0000\u039d\u039e\u0005P\u0000\u0000\u039e\u03bc\u0003l6\u0011\u039f"+
		"\u03a0\n\u000f\u0000\u0000\u03a0\u03a1\u0005Q\u0000\u0000\u03a1\u03bc"+
		"\u0003l6\u0010\u03a2\u03a3\n\u000b\u0000\u0000\u03a3\u03a4\u0005A\u0000"+
		"\u0000\u03a4\u03a5\u0005q\u0000\u0000\u03a5\u03ae\u00058\u0000\u0000\u03a6"+
		"\u03ab\u0003l6\u0000\u03a7\u03a8\u0005=\u0000\u0000\u03a8\u03aa\u0003"+
		"l6\u0000\u03a9\u03a7\u0001\u0000\u0000\u0000\u03aa\u03ad\u0001\u0000\u0000"+
		"\u0000\u03ab\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000"+
		"\u0000\u03ac\u03af\u0001\u0000\u0000\u0000\u03ad\u03ab\u0001\u0000\u0000"+
		"\u0000\u03ae\u03a6\u0001\u0000\u0000\u0000\u03ae\u03af\u0001\u0000\u0000"+
		"\u0000\u03af\u03b0\u0001\u0000\u0000\u0000\u03b0\u03bc\u00059\u0000\u0000"+
		"\u03b1\u03b2\n\t\u0000\u0000\u03b2\u03b3\u0005A\u0000\u0000\u03b3\u03b4"+
		"\u0005q\u0000\u0000\u03b4\u03b5\u00058\u0000\u0000\u03b5\u03b6\u0005q"+
		"\u0000\u0000\u03b6\u03b7\u0005b\u0000\u0000\u03b7\u03b8\u0003l6\u0000"+
		"\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03ba\u00059\u0000\u0000\u03ba"+
		"\u03bc\u0001\u0000\u0000\u0000\u03bb\u0378\u0001\u0000\u0000\u0000\u03bb"+
		"\u037b\u0001\u0000\u0000\u0000\u03bb\u037e\u0001\u0000\u0000\u0000\u03bb"+
		"\u0381\u0001\u0000\u0000\u0000\u03bb\u0384\u0001\u0000\u0000\u0000\u03bb"+
		"\u0387\u0001\u0000\u0000\u0000\u03bb\u038a\u0001\u0000\u0000\u0000\u03bb"+
		"\u038d\u0001\u0000\u0000\u0000\u03bb\u0390\u0001\u0000\u0000\u0000\u03bb"+
		"\u0393\u0001\u0000\u0000\u0000\u03bb\u0396\u0001\u0000\u0000\u0000\u03bb"+
		"\u0399\u0001\u0000\u0000\u0000\u03bb\u039c\u0001\u0000\u0000\u0000\u03bb"+
		"\u039f\u0001\u0000\u0000\u0000\u03bb\u03a2\u0001\u0000\u0000\u0000\u03bb"+
		"\u03b1\u0001\u0000\u0000\u0000\u03bc\u03bf\u0001\u0000\u0000\u0000\u03bd"+
		"\u03bb\u0001\u0000\u0000\u0000\u03bd\u03be\u0001\u0000\u0000\u0000\u03be"+
		"m\u0001\u0000\u0000\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03c0\u03c1"+
		"\u0005q\u0000\u0000\u03c1\u03c2\u0005?\u0000\u0000\u03c2\u03cb\u0003V"+
		"+\u0000\u03c3\u03c4\u0005q\u0000\u0000\u03c4\u03c5\u0005?\u0000\u0000"+
		"\u03c5\u03c6\u0003V+\u0000\u03c6\u03c7\u0005>\u0000\u0000\u03c7\u03c8"+
		"\u0003X,\u0000\u03c8\u03cb\u0001\u0000\u0000\u0000\u03c9\u03cb\u0005q"+
		"\u0000\u0000\u03ca\u03c0\u0001\u0000\u0000\u0000\u03ca\u03c3\u0001\u0000"+
		"\u0000\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03cbo\u0001\u0000\u0000"+
		"\u0000\u03cc\u03cd\u0005q\u0000\u0000\u03cd\u03d6\u00058\u0000\u0000\u03ce"+
		"\u03d3\u0003l6\u0000\u03cf\u03d0\u0005=\u0000\u0000\u03d0\u03d2\u0003"+
		"l6\u0000\u03d1\u03cf\u0001\u0000\u0000\u0000\u03d2\u03d5\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d4\u0001\u0000\u0000"+
		"\u0000\u03d4\u03d7\u0001\u0000\u0000\u0000\u03d5\u03d3\u0001\u0000\u0000"+
		"\u0000\u03d6\u03ce\u0001\u0000\u0000\u0000\u03d6\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8\u03d9\u00059\u0000\u0000"+
		"\u03d9q\u0001\u0000\u0000\u0000\u03da\u03db\u0005p\u0000\u0000\u03db\u03dc"+
		"\u0003t:\u0000\u03dc\u03dd\u0005p\u0000\u0000\u03dds\u0001\u0000\u0000"+
		"\u0000\u03de\u03e7\u0003v;\u0000\u03df\u03e0\u0005R\u0000\u0000\u03e0"+
		"\u03e1\u0003l6\u0000\u03e1\u03e2\u0005S\u0000\u0000\u03e2\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e7\u0005q\u0000\u0000\u03e4\u03e7\u0005n\u0000"+
		"\u0000\u03e5\u03e7\u0005m\u0000\u0000\u03e6\u03de\u0001\u0000\u0000\u0000"+
		"\u03e6\u03df\u0001\u0000\u0000\u0000\u03e6\u03e3\u0001\u0000\u0000\u0000"+
		"\u03e6\u03e4\u0001\u0000\u0000\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000"+
		"\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03e6\u0001\u0000\u0000\u0000"+
		"\u03e8\u03e9\u0001\u0000\u0000\u0000\u03e9u\u0001\u0000\u0000\u0000\u03ea"+
		"\u03eb\u0005I\u0000\u0000\u03eb\u03ed\u0003x<\u0000\u03ec\u03ee\u0003"+
		"z=\u0000\u03ed\u03ec\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000"+
		"\u0000\u03ee\u03ef\u0001\u0000\u0000\u0000\u03ef\u03f0\u0005J\u0000\u0000"+
		"\u03f0\u03f1\u0003t:\u0000\u03f1\u03f2\u0005I\u0000\u0000\u03f2\u03f3"+
		"\u0005F\u0000\u0000\u03f3\u03f4\u0003x<\u0000\u03f4\u03f5\u0005J\u0000"+
		"\u0000\u03f5\u040a\u0001\u0000\u0000\u0000\u03f6\u03f7\u0005I\u0000\u0000"+
		"\u03f7\u03f9\u0003x<\u0000\u03f8\u03fa\u0003z=\u0000\u03f9\u03f8\u0001"+
		"\u0000\u0000\u0000\u03f9\u03fa\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fd\u0005J\u0000\u0000\u03fc\u03fe\u0003t:"+
		"\u0000\u03fd\u03fc\u0001\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000"+
		"\u0000\u03fe\u040a\u0001\u0000\u0000\u0000\u03ff\u0400\u0005I\u0000\u0000"+
		"\u0400\u0401\u0003x<\u0000\u0401\u0402\u0003z=\u0000\u0402\u0403\u0005"+
		"F\u0000\u0000\u0403\u0404\u0005J\u0000\u0000\u0404\u040a\u0001\u0000\u0000"+
		"\u0000\u0405\u0406\u0005I\u0000\u0000\u0406\u0407\u0003x<\u0000\u0407"+
		"\u0408\u0005J\u0000\u0000\u0408\u040a\u0001\u0000\u0000\u0000\u0409\u03ea"+
		"\u0001\u0000\u0000\u0000\u0409\u03f6\u0001\u0000\u0000\u0000\u0409\u03ff"+
		"\u0001\u0000\u0000\u0000\u0409\u0405\u0001\u0000\u0000\u0000\u040aw\u0001"+
		"\u0000\u0000\u0000\u040b\u040c\u0005q\u0000\u0000\u040cy\u0001\u0000\u0000"+
		"\u0000\u040d\u040f\u0003|>\u0000\u040e\u040d\u0001\u0000\u0000\u0000\u040f"+
		"\u0412\u0001\u0000\u0000\u0000\u0410\u040e\u0001\u0000\u0000\u0000\u0410"+
		"\u0411\u0001\u0000\u0000\u0000\u0411{\u0001\u0000\u0000\u0000\u0412\u0410"+
		"\u0001\u0000\u0000\u0000\u0413\u043e\u0005q\u0000\u0000\u0414\u043e\u0005"+
		"$\u0000\u0000\u0415\u043e\u0005\u0016\u0000\u0000\u0416\u043e\u0005\u0017"+
		"\u0000\u0000\u0417\u043e\u0005\u0018\u0000\u0000\u0418\u043e\u0005\u0019"+
		"\u0000\u0000\u0419\u043e\u0005(\u0000\u0000\u041a\u043e\u0005)\u0000\u0000"+
		"\u041b\u043e\u0005*\u0000\u0000\u041c\u043e\u0005+\u0000\u0000\u041d\u043e"+
		"\u0005,\u0000\u0000\u041e\u043e\u0005-\u0000\u0000\u041f\u043e\u00051"+
		"\u0000\u0000\u0420\u043e\u00052\u0000\u0000\u0421\u043e\u00053\u0000\u0000"+
		"\u0422\u043e\u00054\u0000\u0000\u0423\u043e\u00055\u0000\u0000\u0424\u043e"+
		"\u0003\u009aM\u0000\u0425\u043e\u0003\u0098L\u0000\u0426\u043e\u0003\u008a"+
		"E\u0000\u0427\u043e\u0003\u008cF\u0000\u0428\u0431\u00056\u0000\u0000"+
		"\u0429\u0432\u0005q\u0000\u0000\u042a\u042e\u0005q\u0000\u0000\u042b\u042d"+
		"\u0003~?\u0000\u042c\u042b\u0001\u0000\u0000\u0000\u042d\u0430\u0001\u0000"+
		"\u0000\u0000\u042e\u042c\u0001\u0000\u0000\u0000\u042e\u042f\u0001\u0000"+
		"\u0000\u0000\u042f\u0432\u0001\u0000\u0000\u0000\u0430\u042e\u0001\u0000"+
		"\u0000\u0000\u0431\u0429\u0001\u0000\u0000\u0000\u0431\u042a\u0001\u0000"+
		"\u0000\u0000\u0432\u0433\u0001\u0000\u0000\u0000\u0433\u043e\u00057\u0000"+
		"\u0000\u0434\u0435\u00058\u0000\u0000\u0435\u0436\u0005q\u0000\u0000\u0436"+
		"\u043e\u00059\u0000\u0000\u0437\u0438\u0005D\u0000\u0000\u0438\u043e\u0005"+
		"q\u0000\u0000\u0439\u043e\u0005\u0001\u0000\u0000\u043a\u043e\u0005\u0002"+
		"\u0000\u0000\u043b\u043e\u0005n\u0000\u0000\u043c\u043e\u0005m\u0000\u0000"+
		"\u043d\u0413\u0001\u0000\u0000\u0000\u043d\u0414\u0001\u0000\u0000\u0000"+
		"\u043d\u0415\u0001\u0000\u0000\u0000\u043d\u0416\u0001\u0000\u0000\u0000"+
		"\u043d\u0417\u0001\u0000\u0000\u0000\u043d\u0418\u0001\u0000\u0000\u0000"+
		"\u043d\u0419\u0001\u0000\u0000\u0000\u043d\u041a\u0001\u0000\u0000\u0000"+
		"\u043d\u041b\u0001\u0000\u0000\u0000\u043d\u041c\u0001\u0000\u0000\u0000"+
		"\u043d\u041d\u0001\u0000\u0000\u0000\u043d\u041e\u0001\u0000\u0000\u0000"+
		"\u043d\u041f\u0001\u0000\u0000\u0000\u043d\u0420\u0001\u0000\u0000\u0000"+
		"\u043d\u0421\u0001\u0000\u0000\u0000\u043d\u0422\u0001\u0000\u0000\u0000"+
		"\u043d\u0423\u0001\u0000\u0000\u0000\u043d\u0424\u0001\u0000\u0000\u0000"+
		"\u043d\u0425\u0001\u0000\u0000\u0000\u043d\u0426\u0001\u0000\u0000\u0000"+
		"\u043d\u0427\u0001\u0000\u0000\u0000\u043d\u0428\u0001\u0000\u0000\u0000"+
		"\u043d\u0434\u0001\u0000\u0000\u0000\u043d\u0437\u0001\u0000\u0000\u0000"+
		"\u043d\u0439\u0001\u0000\u0000\u0000\u043d\u043a\u0001\u0000\u0000\u0000"+
		"\u043d\u043b\u0001\u0000\u0000\u0000\u043d\u043c\u0001\u0000\u0000\u0000"+
		"\u043e\u0441\u0001\u0000\u0000\u0000\u043f\u0440\u0005>\u0000\u0000\u0440"+
		"\u0442\u0003\u0080@\u0000\u0441\u043f\u0001\u0000\u0000\u0000\u0441\u0442"+
		"\u0001\u0000\u0000\u0000\u0442}\u0001\u0000\u0000\u0000\u0443\u0444\u0005"+
		"A\u0000\u0000\u0444\u044c\u0005q\u0000\u0000\u0445\u0446\u00056\u0000"+
		"\u0000\u0446\u0447\u0003l6\u0000\u0447\u0448\u00057\u0000\u0000\u0448"+
		"\u044c\u0001\u0000\u0000\u0000\u0449\u044a\u0005A\u0000\u0000\u044a\u044c"+
		"\u0003p8\u0000\u044b\u0443\u0001\u0000\u0000\u0000\u044b\u0445\u0001\u0000"+
		"\u0000\u0000\u044b\u0449\u0001\u0000\u0000\u0000\u044c\u007f\u0001\u0000"+
		"\u0000\u0000\u044d\u0452\u0003X,\u0000\u044e\u0452\u0003l6\u0000\u044f"+
		"\u0452\u0005n\u0000\u0000\u0450\u0452\u0005q\u0000\u0000\u0451\u044d\u0001"+
		"\u0000\u0000\u0000\u0451\u044e\u0001\u0000\u0000\u0000\u0451\u044f\u0001"+
		"\u0000\u0000\u0000\u0451\u0450\u0001\u0000\u0000\u0000\u0452\u0081\u0001"+
		"\u0000\u0000\u0000\u0453\u0454\u00056\u0000\u0000\u0454\u0458\u0005p\u0000"+
		"\u0000\u0455\u0457\u0003\u0084B\u0000\u0456\u0455\u0001\u0000\u0000\u0000"+
		"\u0457\u045a\u0001\u0000\u0000\u0000\u0458\u0456\u0001\u0000\u0000\u0000"+
		"\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u045b\u0001\u0000\u0000\u0000"+
		"\u045a\u0458\u0001\u0000\u0000\u0000\u045b\u045c\u0005p\u0000\u0000\u045c"+
		"\u045d\u00057\u0000\u0000\u045d\u0083\u0001\u0000\u0000\u0000\u045e\u0460"+
		"\u0005A\u0000\u0000\u045f\u045e\u0001\u0000\u0000\u0000\u045f\u0460\u0001"+
		"\u0000\u0000\u0000\u0460\u0461\u0001\u0000\u0000\u0000\u0461\u0466\u0005"+
		"q\u0000\u0000\u0462\u0463\u0005?\u0000\u0000\u0463\u0465\u0005q\u0000"+
		"\u0000\u0464\u0462\u0001\u0000\u0000\u0000\u0465\u0468\u0001\u0000\u0000"+
		"\u0000\u0466\u0464\u0001\u0000\u0000\u0000\u0466\u0467\u0001\u0000\u0000"+
		"\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000"+
		"\u0000\u0469\u046d\u0005:\u0000\u0000\u046a\u046c\u0003\u0086C\u0000\u046b"+
		"\u046a\u0001\u0000\u0000\u0000\u046c\u046f\u0001\u0000\u0000\u0000\u046d"+
		"\u046b\u0001\u0000\u0000\u0000\u046d\u046e\u0001\u0000\u0000\u0000\u046e"+
		"\u0470\u0001\u0000\u0000\u0000\u046f\u046d\u0001\u0000\u0000\u0000\u0470"+
		"\u0471\u0005;\u0000\u0000\u0471\u0085\u0001\u0000\u0000\u0000\u0472\u0473"+
		"\u0005q\u0000\u0000\u0473\u047a\u0005?\u0000\u0000\u0474\u047b\u0005q"+
		"\u0000\u0000\u0475\u0477\u0005m\u0000\u0000\u0476\u0478\u0007\u0004\u0000"+
		"\u0000\u0477\u0476\u0001\u0000\u0000\u0000\u0477\u0478\u0001\u0000\u0000"+
		"\u0000\u0478\u047b\u0001\u0000\u0000\u0000\u0479\u047b\u0003p8\u0000\u047a"+
		"\u0474\u0001\u0000\u0000\u0000\u047a\u0475\u0001\u0000\u0000\u0000\u047a"+
		"\u0479\u0001\u0000\u0000\u0000\u047b\u047c\u0001\u0000\u0000\u0000\u047c"+
		"\u047a\u0001\u0000\u0000\u0000\u047c\u047d\u0001\u0000\u0000\u0000\u047d"+
		"\u048b\u0001\u0000\u0000\u0000\u047e\u0485\u0005=\u0000\u0000\u047f\u0486"+
		"\u0005q\u0000\u0000\u0480\u0482\u0005m\u0000\u0000\u0481\u0483\u0007\u0004"+
		"\u0000\u0000\u0482\u0481\u0001\u0000\u0000\u0000\u0482\u0483\u0001\u0000"+
		"\u0000\u0000\u0483\u0486\u0001\u0000\u0000\u0000\u0484\u0486\u0003p8\u0000"+
		"\u0485\u047f\u0001\u0000\u0000\u0000\u0485\u0480\u0001\u0000\u0000\u0000"+
		"\u0485\u0484\u0001\u0000\u0000\u0000\u0486\u0487\u0001\u0000\u0000\u0000"+
		"\u0487\u0485\u0001\u0000\u0000\u0000\u0487\u0488\u0001\u0000\u0000\u0000"+
		"\u0488\u048a\u0001\u0000\u0000\u0000\u0489\u047e\u0001\u0000\u0000\u0000"+
		"\u048a\u048d\u0001\u0000\u0000\u0000\u048b\u0489\u0001\u0000\u0000\u0000"+
		"\u048b\u048c\u0001\u0000\u0000\u0000\u048c\u048e\u0001\u0000\u0000\u0000"+
		"\u048d\u048b\u0001\u0000\u0000\u0000\u048e\u048f\u0005<\u0000\u0000\u048f"+
		"\u0087\u0001\u0000\u0000\u0000\u0490\u0491\u0005,\u0000\u0000\u0491\u0492"+
		"\u0005>\u0000\u0000\u0492\u0493\u0005:\u0000\u0000\u0493\u0494\u0003l"+
		"6\u0000\u0494\u0495\u0005;\u0000\u0000\u0495\u0089\u0001\u0000\u0000\u0000"+
		"\u0496\u0497\u00058\u0000\u0000\u0497\u0498\u0005/\u0000\u0000\u0498\u0499"+
		"\u00059\u0000\u0000\u0499\u049a\u0005>\u0000\u0000\u049a\u049b\u0005n"+
		"\u0000\u0000\u049b\u008b\u0001\u0000\u0000\u0000\u049c\u049d\u00058\u0000"+
		"\u0000\u049d\u049e\u00050\u0000\u0000\u049e\u049f\u00059\u0000\u0000\u049f"+
		"\u04a0\u0005>\u0000\u0000\u04a0\u04a1\u0005n\u0000\u0000\u04a1\u008d\u0001"+
		"\u0000\u0000\u0000\u04a2\u04a3\u00058\u0000\u0000\u04a3\u04a4\u0005.\u0000"+
		"\u0000\u04a4\u04a5\u00059\u0000\u0000\u04a5\u04a6\u0005>\u0000\u0000\u04a6"+
		"\u04a7\u0005n\u0000\u0000\u04a7\u008f\u0001\u0000\u0000\u0000\u04a8\u04a9"+
		"\u00055\u0000\u0000\u04a9\u04aa\u0005>\u0000\u0000\u04aa\u04ab\u0005:"+
		"\u0000\u0000\u04ab\u04ac\u0003l6\u0000\u04ac\u04ad\u0005;\u0000\u0000"+
		"\u04ad\u0091\u0001\u0000\u0000\u0000\u04ae\u04af\u00052\u0000\u0000\u04af"+
		"\u04b0\u0005>\u0000\u0000\u04b0\u04b1\u0005n\u0000\u0000\u04b1\u0093\u0001"+
		"\u0000\u0000\u0000\u04b2\u04b3\u00053\u0000\u0000\u04b3\u04b4\u0005>\u0000"+
		"\u0000\u04b4\u04b5\u0005n\u0000\u0000\u04b5\u0095\u0001\u0000\u0000\u0000"+
		"\u04b6\u04b7\u00054\u0000\u0000\u04b7\u04b8\u0005>\u0000\u0000\u04b8\u04b9"+
		"\u0007\u0005\u0000\u0000\u04b9\u0097\u0001\u0000\u0000\u0000\u04ba\u04bb"+
		"\u0005\u0002\u0000\u0000\u04bb\u04bc\u0005>\u0000\u0000\u04bc\u04bd\u0003"+
		"l6\u0000\u04bd\u0099\u0001\u0000\u0000\u0000\u04be\u04bf\u0005\u0001\u0000"+
		"\u0000\u04bf\u04c0\u0005>\u0000\u0000\u04c0\u04c1\u0003l6\u0000\u04c1"+
		"\u009b\u0001\u0000\u0000\u0000\u04c2\u04c3\u0005p\u0000\u0000\u04c3\u04c4"+
		"\u0003\u009eO\u0000\u04c4\u04c5\u0005p\u0000\u0000\u04c5\u009d\u0001\u0000"+
		"\u0000\u0000\u04c6\u04d0\u0003v;\u0000\u04c7\u04c8\u0005R\u0000\u0000"+
		"\u04c8\u04c9\u0003l6\u0000\u04c9\u04ca\u0005S\u0000\u0000\u04ca\u04d0"+
		"\u0001\u0000\u0000\u0000\u04cb\u04d0\u0005q\u0000\u0000\u04cc\u04d0\u0005"+
		"n\u0000\u0000\u04cd\u04d0\u0005m\u0000\u0000\u04ce\u04d0\u0005o\u0000"+
		"\u0000\u04cf\u04c6\u0001\u0000\u0000\u0000\u04cf\u04c7\u0001\u0000\u0000"+
		"\u0000\u04cf\u04cb\u0001\u0000\u0000\u0000\u04cf\u04cc\u0001\u0000\u0000"+
		"\u0000\u04cf\u04cd\u0001\u0000\u0000\u0000\u04cf\u04ce\u0001\u0000\u0000"+
		"\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u04cf\u0001\u0000\u0000"+
		"\u0000\u04d1\u04d2\u0001\u0000\u0000\u0000\u04d2\u009f\u0001\u0000\u0000"+
		"\u0000\u04d3\u04d4\u0005\u000f\u0000\u0000\u04d4\u04d5\u00058\u0000\u0000"+
		"\u04d5\u04d6\u0003\u00a2Q\u0000\u04d6\u04d7\u00059\u0000\u0000\u04d7\u04d8"+
		"\u0005<\u0000\u0000\u04d8\u04e2\u0001\u0000\u0000\u0000\u04d9\u04da\u0005"+
		"\u000f\u0000\u0000\u04da\u04db\u00058\u0000\u0000\u04db\u04dc\u0003\u00a2"+
		"Q\u0000\u04dc\u04dd\u00059\u0000\u0000\u04dd\u04de\u0005:\u0000\u0000"+
		"\u04de\u04df\u0003\u00a8T\u0000\u04df\u04e0\u0005;\u0000\u0000\u04e0\u04e2"+
		"\u0001\u0000\u0000\u0000\u04e1\u04d3\u0001\u0000\u0000\u0000\u04e1\u04d9"+
		"\u0001\u0000\u0000\u0000\u04e2\u00a1\u0001\u0000\u0000\u0000\u04e3\u04e8"+
		"\u0003\u00a4R\u0000\u04e4\u04e5\u0005=\u0000\u0000\u04e5\u04e7\u0003\u00a6"+
		"S\u0000\u04e6\u04e4\u0001\u0000\u0000\u0000\u04e7\u04ea\u0001\u0000\u0000"+
		"\u0000\u04e8\u04e6\u0001\u0000\u0000\u0000\u04e8\u04e9\u0001\u0000\u0000"+
		"\u0000\u04e9\u00a3\u0001\u0000\u0000\u0000\u04ea\u04e8\u0001\u0000\u0000"+
		"\u0000\u04eb\u04ec\u0005\u0017\u0000\u0000\u04ec\u04ed\u0005?\u0000\u0000"+
		"\u04ed\u04ee\u0005n\u0000\u0000\u04ee\u00a5\u0001\u0000\u0000\u0000\u04ef"+
		"\u04f0\u0007\u0006\u0000\u0000\u04f0\u04f1\u0005?\u0000\u0000\u04f1\u04f2"+
		"\u0003X,\u0000\u04f2\u00a7\u0001\u0000\u0000\u0000\u04f3\u04f7\u0003L"+
		"&\u0000\u04f4\u04f7\u0003R)\u0000\u04f5\u04f7\u0003\u00a0P\u0000\u04f6"+
		"\u04f3\u0001\u0000\u0000\u0000\u04f6\u04f4\u0001\u0000\u0000\u0000\u04f6"+
		"\u04f5\u0001\u0000\u0000\u0000\u04f7\u04fa\u0001\u0000\u0000\u0000\u04f8"+
		"\u04f6\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"+
		"\u00a9\u0001\u0000\u0000\u0000\u04fa\u04f8\u0001\u0000\u0000\u0000\u04fb"+
		"\u04fc\u0005\u0010\u0000\u0000\u04fc\u04fe\u00058\u0000\u0000\u04fd\u04ff"+
		"\u0005n\u0000\u0000\u04fe\u04fd\u0001\u0000\u0000\u0000\u04fe\u04ff\u0001"+
		"\u0000\u0000\u0000\u04ff\u0500\u0001\u0000\u0000\u0000\u0500\u0501\u0005"+
		"9\u0000\u0000\u0501\u0502\u0005:\u0000\u0000\u0502\u0503\u0003\u00acV"+
		"\u0000\u0503\u0504\u0005;\u0000\u0000\u0504\u00ab\u0001\u0000\u0000\u0000"+
		"\u0505\u0509\u0003\u00a0P\u0000\u0506\u0509\u0003R)\u0000\u0507\u0509"+
		"\u0003L&\u0000\u0508\u0505\u0001\u0000\u0000\u0000\u0508\u0506\u0001\u0000"+
		"\u0000\u0000\u0508\u0507\u0001\u0000\u0000\u0000\u0509\u050c\u0001\u0000"+
		"\u0000\u0000\u050a\u0508\u0001\u0000\u0000\u0000\u050a\u050b\u0001\u0000"+
		"\u0000\u0000\u050b\u00ad\u0001\u0000\u0000\u0000\u050c\u050a\u0001\u0000"+
		"\u0000\u0000}\u00b1\u00cf\u00d4\u00df\u00ea\u00ee\u0107\u010a\u0111\u0127"+
		"\u012f\u0148\u014b\u0155\u015f\u016c\u016e\u0172\u0176\u017d\u0181\u0193"+
		"\u019c\u01a8\u01ab\u01b3\u01b7\u01bc\u01c4\u01cf\u01dd\u01e1\u01ee\u01f1"+
		"\u01fa\u01ff\u0202\u0209\u020e\u0211\u0219\u0220\u0225\u0229\u022c\u023a"+
		"\u023d\u0243\u024f\u0252\u025a\u025e\u0262\u0267\u0271\u0274\u027a\u0285"+
		"\u0288\u028d\u0293\u0299\u02a0\u02ae\u02b3\u02b8\u02c5\u02d1\u02d5\u02dd"+
		"\u02df\u02e5\u02e9\u02ed\u02f5\u02fb\u030f\u0312\u0316\u0320\u0325\u033e"+
		"\u035c\u035f\u0376\u03ab\u03ae\u03bb\u03bd\u03ca\u03d3\u03d6\u03e6\u03e8"+
		"\u03ed\u03f9\u03fd\u0409\u0410\u042e\u0431\u043d\u0441\u044b\u0451\u0458"+
		"\u045f\u0466\u046d\u0477\u047a\u047c\u0482\u0485\u0487\u048b\u04cf\u04d1"+
		"\u04e1\u04e8\u04f6\u04f8\u04fe\u0508\u050a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}