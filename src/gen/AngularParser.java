// Generated from C:/Users/KEMO/OneDrive/Desktop/compiler 2/Angular-Compiler-Using-Antlr/src/AngularParser.g4 by ANTLR 4.13.2
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604892220614456L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & -2452876369869143551L) != 0) || _la==Continue) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398243328L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1125972787068929L) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398243328L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1125972787068929L) != 0)) {
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
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604892220614456L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & -2452876369869143551L) != 0) || _la==Continue) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398243328L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1125972787068929L) != 0)) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AngularParserVisitor ) return ((AngularParserVisitor<? extends T>)visitor).visitEnumDecl(this);
			else return visitor.visitChildren(this);
		}
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
		enterRule(_localctx, 74, RULE_accessModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
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
			setState(554);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 8388623L) != 0)) {
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
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 8388623L) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604892220614456L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & -2452876369869143551L) != 0) || _la==Continue) {
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
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 15L) != 0)) {
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
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 8388623L) != 0)) {
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
			setState(679);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 131131L) != 0)) ) {
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
			setState(711);
			match(OpenBracket);
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 8388639L) != 0)) {
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
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & 8388623L) != 0)) {
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
			setState(807);
			match(OpenBrace);
			setState(811);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604892220614456L) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & -2452876369869143551L) != 0) || _la==Continue) {
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
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398243328L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1125972787068929L) != 0)) {
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
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398243328L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1125972787068929L) != 0)) {
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
			setState(953);
			match(Identifier);
			setState(954);
			match(OpenParen);
			setState(963);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 756604737398243328L) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & 1125972787068929L) != 0)) {
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
			setState(1021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 215185558173908998L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 41781441855489L) != 0)) {
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
			} while ( ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 1580547965441L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
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
			setState(1244);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
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
			setState(1253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 389121L) != 0)) {
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
			setState(1271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Product || ((((_la - 114)) & ~0x3f) == 0 && ((1L << (_la - 114)) & 389121L) != 0)) {
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
		"\u0004\u0001\u008a\u04fb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0005\u0016\u016e\b\u0016\n\u0016\f\u0016\u0171\t\u0016\u0001\u0017\u0003"+
		"\u0017\u0174\b\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0178\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u017d\b\u0018\n\u0018"+
		"\f\u0018\u0180\t\u0018\u0001\u0018\u0003\u0018\u0183\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0195\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u019e\b\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01a8\b\u001c"+
		"\n\u001c\f\u001c\u01ab\t\u001c\u0003\u001c\u01ad\b\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b5"+
		"\b\u001d\u0004\u001d\u01b7\b\u001d\u000b\u001d\f\u001d\u01b8\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01be\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0005\u001f\u01c4\b\u001f\n\u001f\f\u001f\u01c7"+
		"\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0005"+
		" \u01cf\b \n \f \u01d2\t \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01df\b\"\u0001\"\u0001"+
		"\"\u0003\"\u01e3\b\"\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$"+
		"\u0001$\u0001%\u0001%\u0001&\u0003&\u01f0\b&\u0001&\u0003&\u01f3\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u01fc\b&\u0001&\u0001"+
		"&\u0001&\u0003&\u0201\b&\u0001&\u0003&\u0204\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0003&\u020b\b&\u0001&\u0001&\u0001&\u0003&\u0210\b&\u0001&\u0003"+
		"&\u0213\b&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0003&\u021b\b&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0003&\u0222\b&\u0001&\u0001&\u0001&\u0003"+
		"&\u0227\b&\u0001&\u0001&\u0003&\u022b\b&\u0001\'\u0003\'\u022e\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0005\'\u023a\b\'\n\'\f\'\u023d\t\'\u0003\'\u023f\b\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0248\b\'\u0001\'\u0001"+
		"\'\u0003\'\u024c\b\'\u0005\'\u024e\b\'\n\'\f\'\u0251\t\'\u0001\'\u0001"+
		"\'\u0003\'\u0255\b\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005("+
		"\u025d\b(\n(\f(\u0260\t(\u0003(\u0262\b(\u0001(\u0001(\u0001(\u0001(\u0003"+
		"(\u0268\b(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0271"+
		"\b)\n)\f)\u0274\t)\u0003)\u0276\b)\u0001)\u0001)\u0001)\u0003)\u027b\b"+
		")\u0001)\u0001)\u0005)\u027f\b)\n)\f)\u0282\t)\u0001)\u0001)\u0001*\u0003"+
		"*\u0287\b*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u028e\b*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u029a"+
		"\b*\n*\f*\u029d\t*\u0005*\u029f\b*\n*\f*\u02a2\t*\u0001*\u0001*\u0003"+
		"*\u02a6\b*\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u02b3\b,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u02bf\b-\u0005-\u02c1\b-\n-\f-\u02c4"+
		"\t-\u0001-\u0001-\u0001.\u0001.\u0001.\u0005.\u02cb\b.\n.\f.\u02ce\t."+
		"\u0001.\u0001.\u0001.\u0003.\u02d3\b.\u0005.\u02d5\b.\n.\f.\u02d8\t.\u0001"+
		".\u0003.\u02db\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0003/\u02e3"+
		"\b/\u0001/\u0001/\u0005/\u02e7\b/\n/\f/\u02ea\t/\u0001/\u0001/\u0001/"+
		"\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0005/\u02fb\b/\n/\f/\u02fe\t/\u0003/\u0300\b/\u0001/"+
		"\u0001/\u0003/\u0304\b/\u00010\u00010\u00010\u00010\u00010\u00010\u0005"+
		"0\u030c\b0\n0\f0\u030f\t0\u00010\u00010\u00030\u0313\b0\u00011\u00011"+
		"\u00011\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00014\u00014\u00014\u00015\u00015\u0005"+
		"5\u032a\b5\n5\f5\u032d\t5\u00015\u00015\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u0348"+
		"\b6\n6\f6\u034b\t6\u00036\u034d\b6\u00016\u00016\u00016\u00016\u00016"+
		"\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00036\u0364\b6\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00056\u0397\b6\n6"+
		"\f6\u039a\t6\u00036\u039c\b6\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00016\u00016\u00056\u03a9\b6\n6\f6\u03ac\t6\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0003"+
		"7\u03b8\b7\u00018\u00018\u00018\u00018\u00018\u00058\u03bf\b8\n8\f8\u03c2"+
		"\t8\u00038\u03c4\b8\u00018\u00018\u00019\u00019\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001:\u0001:\u0001:\u0001:\u0001:\u0004:\u03d4\b:\u000b:\f:"+
		"\u03d5\u0001;\u0001;\u0001;\u0003;\u03db\b;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u03e7\b;\u0001;\u0001"+
		";\u0003;\u03eb\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0003;\u03f7\b;\u0001<\u0001<\u0001=\u0005=\u03fc\b=\n"+
		"=\f=\u03ff\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>"+
		"\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0005>\u041a\b>\n>"+
		"\f>\u041d\t>\u0003>\u041f\b>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0001>\u0001>\u0001>\u0001>\u0003>\u042b\b>\u0001>\u0001>\u0003>\u042f"+
		"\b>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0003?\u0439"+
		"\b?\u0001@\u0001@\u0001@\u0001@\u0003@\u043f\b@\u0001A\u0001A\u0001A\u0005"+
		"A\u0444\bA\nA\fA\u0447\tA\u0001A\u0001A\u0001A\u0001B\u0003B\u044d\bB"+
		"\u0001B\u0001B\u0001B\u0005B\u0452\bB\nB\fB\u0455\tB\u0001B\u0001B\u0005"+
		"B\u0459\bB\nB\fB\u045c\tB\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0001"+
		"C\u0003C\u0465\bC\u0001C\u0004C\u0468\bC\u000bC\fC\u0469\u0001C\u0001"+
		"C\u0001C\u0001C\u0003C\u0470\bC\u0001C\u0004C\u0473\bC\u000bC\fC\u0474"+
		"\u0005C\u0477\bC\nC\fC\u047a\tC\u0001C\u0001C\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001"+
		"I\u0001J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0001"+
		"N\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0004"+
		"O\u04bd\bO\u000bO\fO\u04be\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001"+
		"P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0001P\u0003P\u04cf\bP\u0001"+
		"Q\u0001Q\u0001Q\u0005Q\u04d4\bQ\nQ\fQ\u04d7\tQ\u0001R\u0001R\u0001R\u0001"+
		"R\u0001S\u0001S\u0001S\u0001S\u0001T\u0001T\u0001T\u0005T\u04e4\bT\nT"+
		"\fT\u04e7\tT\u0001U\u0001U\u0001U\u0003U\u04ec\bU\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001V\u0001V\u0001V\u0005V\u04f6\bV\nV\fV\u04f9\tV\u0001"+
		"V\u0000\u0001lW\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfh"+
		"jlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092"+
		"\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa"+
		"\u00ac\u0000\u0007\u0002\u0000\u0015\u0015\"\"\u0001\u0000~\u0081\u0002"+
		"\u0000rr\u0084\u0084\u0003\u0000abdfrr\u0002\u0000HHss\u0001\u0000no\u0001"+
		"\u0000\u0011\u0014\u058f\u0000\u00b1\u0001\u0000\u0000\u0000\u0002\u00cf"+
		"\u0001\u0000\u0000\u0000\u0004\u00d4\u0001\u0000\u0000\u0000\u0006\u00df"+
		"\u0001\u0000\u0000\u0000\b\u00ea\u0001\u0000\u0000\u0000\n\u00ee\u0001"+
		"\u0000\u0000\u0000\f\u00f0\u0001\u0000\u0000\u0000\u000e\u00f8\u0001\u0000"+
		"\u0000\u0000\u0010\u0100\u0001\u0000\u0000\u0000\u0012\u0111\u0001\u0000"+
		"\u0000\u0000\u0014\u0113\u0001\u0000\u0000\u0000\u0016\u0117\u0001\u0000"+
		"\u0000\u0000\u0018\u0119\u0001\u0000\u0000\u0000\u001a\u0121\u0001\u0000"+
		"\u0000\u0000\u001c\u012f\u0001\u0000\u0000\u0000\u001e\u0131\u0001\u0000"+
		"\u0000\u0000 \u0137\u0001\u0000\u0000\u0000\"\u013b\u0001\u0000\u0000"+
		"\u0000$\u013f\u0001\u0000\u0000\u0000&\u0150\u0001\u0000\u0000\u0000("+
		"\u015f\u0001\u0000\u0000\u0000*\u0161\u0001\u0000\u0000\u0000,\u016f\u0001"+
		"\u0000\u0000\u0000.\u0177\u0001\u0000\u0000\u00000\u0179\u0001\u0000\u0000"+
		"\u00002\u0184\u0001\u0000\u0000\u00004\u0194\u0001\u0000\u0000\u00006"+
		"\u0196\u0001\u0000\u0000\u00008\u01a1\u0001\u0000\u0000\u0000:\u01b0\u0001"+
		"\u0000\u0000\u0000<\u01ba\u0001\u0000\u0000\u0000>\u01bf\u0001\u0000\u0000"+
		"\u0000@\u01cb\u0001\u0000\u0000\u0000B\u01d3\u0001\u0000\u0000\u0000D"+
		"\u01d7\u0001\u0000\u0000\u0000F\u01e4\u0001\u0000\u0000\u0000H\u01e7\u0001"+
		"\u0000\u0000\u0000J\u01ec\u0001\u0000\u0000\u0000L\u022a\u0001\u0000\u0000"+
		"\u0000N\u0254\u0001\u0000\u0000\u0000P\u0256\u0001\u0000\u0000\u0000R"+
		"\u026b\u0001\u0000\u0000\u0000T\u02a5\u0001\u0000\u0000\u0000V\u02a7\u0001"+
		"\u0000\u0000\u0000X\u02b2\u0001\u0000\u0000\u0000Z\u02b4\u0001\u0000\u0000"+
		"\u0000\\\u02c7\u0001\u0000\u0000\u0000^\u0303\u0001\u0000\u0000\u0000"+
		"`\u0305\u0001\u0000\u0000\u0000b\u0314\u0001\u0000\u0000\u0000d\u031a"+
		"\u0001\u0000\u0000\u0000f\u0321\u0001\u0000\u0000\u0000h\u0324\u0001\u0000"+
		"\u0000\u0000j\u0327\u0001\u0000\u0000\u0000l\u0363\u0001\u0000\u0000\u0000"+
		"n\u03b7\u0001\u0000\u0000\u0000p\u03b9\u0001\u0000\u0000\u0000r\u03c7"+
		"\u0001\u0000\u0000\u0000t\u03d3\u0001\u0000\u0000\u0000v\u03f6\u0001\u0000"+
		"\u0000\u0000x\u03f8\u0001\u0000\u0000\u0000z\u03fd\u0001\u0000\u0000\u0000"+
		"|\u042a\u0001\u0000\u0000\u0000~\u0438\u0001\u0000\u0000\u0000\u0080\u043e"+
		"\u0001\u0000\u0000\u0000\u0082\u0440\u0001\u0000\u0000\u0000\u0084\u044c"+
		"\u0001\u0000\u0000\u0000\u0086\u045f\u0001\u0000\u0000\u0000\u0088\u047d"+
		"\u0001\u0000\u0000\u0000\u008a\u0483\u0001\u0000\u0000\u0000\u008c\u0489"+
		"\u0001\u0000\u0000\u0000\u008e\u048f\u0001\u0000\u0000\u0000\u0090\u0495"+
		"\u0001\u0000\u0000\u0000\u0092\u049b\u0001\u0000\u0000\u0000\u0094\u049f"+
		"\u0001\u0000\u0000\u0000\u0096\u04a3\u0001\u0000\u0000\u0000\u0098\u04a7"+
		"\u0001\u0000\u0000\u0000\u009a\u04ab\u0001\u0000\u0000\u0000\u009c\u04af"+
		"\u0001\u0000\u0000\u0000\u009e\u04bc\u0001\u0000\u0000\u0000\u00a0\u04ce"+
		"\u0001\u0000\u0000\u0000\u00a2\u04d0\u0001\u0000\u0000\u0000\u00a4\u04d8"+
		"\u0001\u0000\u0000\u0000\u00a6\u04dc\u0001\u0000\u0000\u0000\u00a8\u04e5"+
		"\u0001\u0000\u0000\u0000\u00aa\u04e8\u0001\u0000\u0000\u0000\u00ac\u04f7"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b0\u0003\u0002\u0001\u0000\u00af\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b5"+
		"\u0005\u0000\u0000\u0001\u00b5\u0001\u0001\u0000\u0000\u0000\u00b6\u00d0"+
		"\u0003N\'\u0000\u00b7\u00d0\u0003>\u001f\u0000\u00b8\u00d0\u0003L&\u0000"+
		"\u00b9\u00d0\u0003R)\u0000\u00ba\u00d0\u0003`0\u0000\u00bb\u00d0\u0003"+
		"b1\u0000\u00bc\u00d0\u0003^/\u0000\u00bd\u00d0\u0003f3\u0000\u00be\u00d0"+
		"\u0003h4\u0000\u00bf\u00d0\u0003v;\u0000\u00c0\u00d0\u00034\u001a\u0000"+
		"\u00c1\u00d0\u0003&\u0013\u0000\u00c2\u00d0\u0003(\u0014\u0000\u00c3\u00d0"+
		"\u00036\u001b\u0000\u00c4\u00d0\u0003*\u0015\u0000\u00c5\u00d0\u0003F"+
		"#\u0000\u00c6\u00d0\u0003r9\u0000\u00c7\u00d0\u0003D\"\u0000\u00c8\u00d0"+
		"\u0003\u0004\u0002\u0000\u00c9\u00d0\u0003\u0012\t\u0000\u00ca\u00d0\u0003"+
		"\u001c\u000e\u0000\u00cb\u00d0\u0003$\u0012\u0000\u00cc\u00d0\u0003p8"+
		"\u0000\u00cd\u00d0\u0003\u00a0P\u0000\u00ce\u00d0\u0003\u00aaU\u0000\u00cf"+
		"\u00b6\u0001\u0000\u0000\u0000\u00cf\u00b7\u0001\u0000\u0000\u0000\u00cf"+
		"\u00b8\u0001\u0000\u0000\u0000\u00cf\u00b9\u0001\u0000\u0000\u0000\u00cf"+
		"\u00ba\u0001\u0000\u0000\u0000\u00cf\u00bb\u0001\u0000\u0000\u0000\u00cf"+
		"\u00bc\u0001\u0000\u0000\u0000\u00cf\u00bd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00be\u0001\u0000\u0000\u0000\u00cf\u00bf\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00cf\u00c1\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c2\u0001\u0000\u0000\u0000\u00cf\u00c3\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c4\u0001\u0000\u0000\u0000\u00cf\u00c5\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c6\u0001\u0000\u0000\u0000\u00cf\u00c7\u0001\u0000\u0000\u0000\u00cf"+
		"\u00c8\u0001\u0000\u0000\u0000\u00cf\u00c9\u0001\u0000\u0000\u0000\u00cf"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cf\u00cb\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cc\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d0\u0003\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d5\u0003\u0006\u0003\u0000\u00d2\u00d5\u0003\b\u0004\u0000\u00d3\u00d5"+
		"\u0003\n\u0005\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u0005\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\u0003\u0000\u0000\u00d7\u00d8\u0005"+
		"9\u0000\u0000\u00d8\u00d9\u0005:\u0000\u0000\u00d9\u00e0\u0003L&\u0000"+
		"\u00da\u00db\u0005\u0003\u0000\u0000\u00db\u00dc\u00059\u0000\u0000\u00dc"+
		"\u00dd\u0005o\u0000\u0000\u00dd\u00de\u0005:\u0000\u0000\u00de\u00e0\u0003"+
		"L&\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00df\u00da\u0001\u0000\u0000"+
		"\u0000\u00e0\u0007\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000"+
		"\u0000\u00e2\u00e3\u00059\u0000\u0000\u00e3\u00e4\u0005:\u0000\u0000\u00e4"+
		"\u00eb\u0003R)\u0000\u00e5\u00e6\u0005\u0004\u0000\u0000\u00e6\u00e7\u0005"+
		"9\u0000\u0000\u00e7\u00e8\u0005o\u0000\u0000\u00e8\u00e9\u0005:\u0000"+
		"\u0000\u00e9\u00eb\u0003R)\u0000\u00ea\u00e1\u0001\u0000\u0000\u0000\u00ea"+
		"\u00e5\u0001\u0000\u0000\u0000\u00eb\t\u0001\u0000\u0000\u0000\u00ec\u00ef"+
		"\u0003\f\u0006\u0000\u00ed\u00ef\u0003\u000e\u0007\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef\u000b\u0001"+
		"\u0000\u0000\u0000\u00f0\u00f1\u0005\u0005\u0000\u0000\u00f1\u00f2\u0005"+
		"B\u0000\u0000\u00f2\u00f3\u0005\u0006\u0000\u0000\u00f3\u00f4\u00059\u0000"+
		"\u0000\u00f4\u00f5\u0003\u0010\b\u0000\u00f5\u00f6\u0005:\u0000\u0000"+
		"\u00f6\u00f7\u0005=\u0000\u0000\u00f7\r\u0001\u0000\u0000\u0000\u00f8"+
		"\u00f9\u0005\u0005\u0000\u0000\u00f9\u00fa\u0005B\u0000\u0000\u00fa\u00fb"+
		"\u0005\u0007\u0000\u0000\u00fb\u00fc\u00059\u0000\u0000\u00fc\u00fd\u0005"+
		"o\u0000\u0000\u00fd\u00fe\u0005:\u0000\u0000\u00fe\u00ff\u0005=\u0000"+
		"\u0000\u00ff\u000f\u0001\u0000\u0000\u0000\u0100\u0101\u0005r\u0000\u0000"+
		"\u0101\u010a\u00059\u0000\u0000\u0102\u0107\u0003l6\u0000\u0103\u0104"+
		"\u0005>\u0000\u0000\u0104\u0106\u0003l6\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000"+
		"\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005:\u0000\u0000\u010d\u0011\u0001\u0000\u0000"+
		"\u0000\u010e\u0112\u0003\u0014\n\u0000\u010f\u0112\u0003\u0016\u000b\u0000"+
		"\u0110\u0112\u0003\u0018\f\u0000\u0111\u010e\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0111\u0110\u0001\u0000\u0000\u0000\u0112"+
		"\u0013\u0001\u0000\u0000\u0000\u0113\u0114\u0005\b\u0000\u0000\u0114\u0115"+
		"\u0005?\u0000\u0000\u0115\u0116\u0005o\u0000\u0000\u0116\u0015\u0001\u0000"+
		"\u0000\u0000\u0117\u0118\u0005\t\u0000\u0000\u0118\u0017\u0001\u0000\u0000"+
		"\u0000\u0119\u011a\u0005\n\u0000\u0000\u011a\u011b\u0005B\u0000\u0000"+
		"\u011b\u011c\u0005\u000b\u0000\u0000\u011c\u011d\u00059\u0000\u0000\u011d"+
		"\u011e\u0003\u001a\r\u0000\u011e\u011f\u0005:\u0000\u0000\u011f\u0120"+
		"\u0005=\u0000\u0000\u0120\u0019\u0001\u0000\u0000\u0000\u0121\u0122\u0005"+
		"7\u0000\u0000\u0122\u0127\u0005o\u0000\u0000\u0123\u0124\u0005>\u0000"+
		"\u0000\u0124\u0126\u0005o\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0126\u0129\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000"+
		"\u0127\u0128\u0001\u0000\u0000\u0000\u0128\u012a\u0001\u0000\u0000\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012b\u00058\u0000\u0000\u012b"+
		"\u001b\u0001\u0000\u0000\u0000\u012c\u0130\u0003\u001e\u000f\u0000\u012d"+
		"\u0130\u0003 \u0010\u0000\u012e\u0130\u0003\"\u0011\u0000\u012f\u012c"+
		"\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u0130\u001d\u0001\u0000\u0000\u0000\u0131\u0132"+
		"\u00057\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134\u0005"+
		"8\u0000\u0000\u0134\u0135\u0005?\u0000\u0000\u0135\u0136\u0005r\u0000"+
		"\u0000\u0136\u001f\u0001\u0000\u0000\u0000\u0137\u0138\u0005\r\u0000\u0000"+
		"\u0138\u0139\u0005?\u0000\u0000\u0139\u013a\u0005o\u0000\u0000\u013a!"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u000e\u0000\u0000\u013c\u013d"+
		"\u0005?\u0000\u0000\u013d\u013e\u0005o\u0000\u0000\u013e#\u0001\u0000"+
		"\u0000\u0000\u013f\u0140\u0003l6\u0000\u0140\u0141\u0005B\u0000\u0000"+
		"\u0141\u0142\u0005r\u0000\u0000\u0142\u014b\u00059\u0000\u0000\u0143\u0148"+
		"\u0003l6\u0000\u0144\u0145\u0005>\u0000\u0000\u0145\u0147\u0003l6\u0000"+
		"\u0146\u0144\u0001\u0000\u0000\u0000\u0147\u014a\u0001\u0000\u0000\u0000"+
		"\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0149\u0001\u0000\u0000\u0000"+
		"\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148\u0001\u0000\u0000\u0000"+
		"\u014b\u0143\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0005:\u0000\u0000\u014e"+
		"\u014f\u0005=\u0000\u0000\u014f%\u0001\u0000\u0000\u0000\u0150\u0151\u0007"+
		"\u0000\u0000\u0000\u0151\u0155\u00059\u0000\u0000\u0152\u0156\u00030\u0018"+
		"\u0000\u0153\u0154\u0005;\u0000\u0000\u0154\u0156\u0005<\u0000\u0000\u0155"+
		"\u0152\u0001\u0000\u0000\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155"+
		"\u0156\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0005:\u0000\u0000\u0158\u0159\u0003(\u0014\u0000\u0159\'\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0005\u001b\u0000\u0000\u015b\u0160\u0003"+
		"*\u0015\u0000\u015c\u015d\u0005\u001b\u0000\u0000\u015d\u015e\u0005r\u0000"+
		"\u0000\u015e\u0160\u0005=\u0000\u0000\u015f\u015a\u0001\u0000\u0000\u0000"+
		"\u015f\u015c\u0001\u0000\u0000\u0000\u0160)\u0001\u0000\u0000\u0000\u0161"+
		"\u0162\u0005%\u0000\u0000\u0162\u0163\u0005r\u0000\u0000\u0163\u0164\u0005"+
		";\u0000\u0000\u0164\u0165\u0003,\u0016\u0000\u0165\u0166\u0005<\u0000"+
		"\u0000\u0166+\u0001\u0000\u0000\u0000\u0167\u016e\u0003L&\u0000\u0168"+
		"\u016e\u0003T*\u0000\u0169\u016e\u0003N\'\u0000\u016a\u016e\u0003P(\u0000"+
		"\u016b\u016e\u0003R)\u0000\u016c\u016e\u0003\u0002\u0001\u0000\u016d\u0167"+
		"\u0001\u0000\u0000\u0000\u016d\u0168\u0001\u0000\u0000\u0000\u016d\u0169"+
		"\u0001\u0000\u0000\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e\u0171"+
		"\u0001\u0000\u0000\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170"+
		"\u0001\u0000\u0000\u0000\u0170-\u0001\u0000\u0000\u0000\u0171\u016f\u0001"+
		"\u0000\u0000\u0000\u0172\u0174\u00030\u0018\u0000\u0173\u0172\u0001\u0000"+
		"\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0178\u0001\u0000"+
		"\u0000\u0000\u0175\u0176\u0005;\u0000\u0000\u0176\u0178\u0005<\u0000\u0000"+
		"\u0177\u0173\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000"+
		"\u0178/\u0001\u0000\u0000\u0000\u0179\u017e\u00032\u0019\u0000\u017a\u017b"+
		"\u0005>\u0000\u0000\u017b\u017d\u00032\u0019\u0000\u017c\u017a\u0001\u0000"+
		"\u0000\u0000\u017d\u0180\u0001\u0000\u0000\u0000\u017e\u017c\u0001\u0000"+
		"\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u0182\u0001\u0000"+
		"\u0000\u0000\u0180\u017e\u0001\u0000\u0000\u0000\u0181\u0183\u0005>\u0000"+
		"\u0000\u0182\u0181\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000"+
		"\u0000\u01831\u0001\u0000\u0000\u0000\u0184\u0185\u0005r\u0000\u0000\u0185"+
		"\u0186\u0005@\u0000\u0000\u0186\u0187\u0003X,\u0000\u01873\u0001\u0000"+
		"\u0000\u0000\u0188\u0189\u0005\u001a\u0000\u0000\u0189\u018a\u0005;\u0000"+
		"\u0000\u018a\u018b\u0005r\u0000\u0000\u018b\u018c\u0005<\u0000\u0000\u018c"+
		"\u018d\u0005^\u0000\u0000\u018d\u018e\u0005o\u0000\u0000\u018e\u0195\u0005"+
		"=\u0000\u0000\u018f\u0190\u0005\u001a\u0000\u0000\u0190\u0191\u0005r\u0000"+
		"\u0000\u0191\u0192\u0005^\u0000\u0000\u0192\u0193\u0005o\u0000\u0000\u0193"+
		"\u0195\u0005=\u0000\u0000\u0194\u0188\u0001\u0000\u0000\u0000\u0194\u018f"+
		"\u0001\u0000\u0000\u0000\u01955\u0001\u0000\u0000\u0000\u0196\u0197\u0005"+
		"w\u0000\u0000\u0197\u0198\u0005B\u0000\u0000\u0198\u0199\u0005r\u0000"+
		"\u0000\u0199\u019d\u0005?\u0000\u0000\u019a\u019e\u00038\u001c\u0000\u019b"+
		"\u019e\u0003:\u001d\u0000\u019c\u019e\u0003<\u001e\u0000\u019d\u019a\u0001"+
		"\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019c\u0001"+
		"\u0000\u0000\u0000\u019e\u019f\u0001\u0000\u0000\u0000\u019f\u01a0\u0005"+
		"=\u0000\u0000\u01a07\u0001\u0000\u0000\u0000\u01a1\u01a2\u0005x\u0000"+
		"\u0000\u01a2\u01a3\u0005r\u0000\u0000\u01a3\u01ac\u00059\u0000\u0000\u01a4"+
		"\u01a9\u0003l6\u0000\u01a5\u01a6\u0005>\u0000\u0000\u01a6\u01a8\u0003"+
		"l6\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000"+
		"\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000"+
		"\u0000\u01ac\u01a4\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005:\u0000\u0000"+
		"\u01af9\u0001\u0000\u0000\u0000\u01b0\u01b6\u0005w\u0000\u0000\u01b1\u01b4"+
		"\u0005B\u0000\u0000\u01b2\u01b5\u0005r\u0000\u0000\u01b3\u01b5\u0003p"+
		"8\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b4\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b7\u0001\u0000\u0000\u0000\u01b6\u01b1\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000\u0000"+
		"\u0000\u01b8\u01b9\u0001\u0000\u0000\u0000\u01b9;\u0001\u0000\u0000\u0000"+
		"\u01ba\u01bd\u0005r\u0000\u0000\u01bb\u01bc\u0005B\u0000\u0000\u01bc\u01be"+
		"\u0005r\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be=\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005y\u0000"+
		"\u0000\u01c0\u01c1\u0005r\u0000\u0000\u01c1\u01c5\u0005;\u0000\u0000\u01c2"+
		"\u01c4\u0003@ \u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c7\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c5\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c6\u01c8\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c9\u0005<\u0000\u0000\u01c9\u01ca\u0005=\u0000"+
		"\u0000\u01ca?\u0001\u0000\u0000\u0000\u01cb\u01d0\u0003B!\u0000\u01cc"+
		"\u01cd\u0005>\u0000\u0000\u01cd\u01cf\u0003B!\u0000\u01ce\u01cc\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d2\u0001\u0000\u0000\u0000\u01d0\u01ce\u0001"+
		"\u0000\u0000\u0000\u01d0\u01d1\u0001\u0000\u0000\u0000\u01d1A\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d3\u01d4\u0005r\u0000"+
		"\u0000\u01d4\u01d5\u0005?\u0000\u0000\u01d5\u01d6\u0003X,\u0000\u01d6"+
		"C\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005z\u0000\u0000\u01d8\u01d9\u0005"+
		"B\u0000\u0000\u01d9\u01da\u0005{\u0000\u0000\u01da\u01de\u00059\u0000"+
		"\u0000\u01db\u01df\u0005r\u0000\u0000\u01dc\u01df\u0005o\u0000\u0000\u01dd"+
		"\u01df\u0003X,\u0000\u01de\u01db\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e0\u01e2\u0005:\u0000\u0000\u01e1\u01e3\u0005=\u0000"+
		"\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000\u0000"+
		"\u0000\u01e3E\u0001\u0000\u0000\u0000\u01e4\u01e5\u0005|\u0000\u0000\u01e5"+
		"\u01e6\u0003*\u0015\u0000\u01e6G\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005"+
		"}\u0000\u0000\u01e8\u01e9\u0005;\u0000\u0000\u01e9\u01ea\u0003,\u0016"+
		"\u0000\u01ea\u01eb\u0005<\u0000\u0000\u01ebI\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0007\u0001\u0000\u0000\u01edK\u0001\u0000\u0000\u0000\u01ee\u01f0"+
		"\u0003J%\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f0\u01f2\u0001\u0000\u0000\u0000\u01f1\u01f3\u0005\u0082"+
		"\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005r\u0000"+
		"\u0000\u01f5\u01f6\u0005@\u0000\u0000\u01f6\u01f7\u0003V+\u0000\u01f7"+
		"\u01fb\u0005?\u0000\u0000\u01f8\u01fc\u0003l6\u0000\u01f9\u01fc\u0003"+
		"X,\u0000\u01fa\u01fc\u0003\u009cN\u0000\u01fb\u01f8\u0001\u0000\u0000"+
		"\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd\u01fe\u0005=\u0000\u0000"+
		"\u01fe\u022b\u0001\u0000\u0000\u0000\u01ff\u0201\u0003J%\u0000\u0200\u01ff"+
		"\u0001\u0000\u0000\u0000\u0200\u0201\u0001\u0000\u0000\u0000\u0201\u0203"+
		"\u0001\u0000\u0000\u0000\u0202\u0204\u0005\u0082\u0000\u0000\u0203\u0202"+
		"\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204\u0205"+
		"\u0001\u0000\u0000\u0000\u0205\u0206\u0005r\u0000\u0000\u0206\u020a\u0005"+
		"?\u0000\u0000\u0207\u020b\u0003l6\u0000\u0208\u020b\u0003X,\u0000\u0209"+
		"\u020b\u0003\u009cN\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020a\u0208"+
		"\u0001\u0000\u0000\u0000\u020a\u0209\u0001\u0000\u0000\u0000\u020b\u020c"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0005=\u0000\u0000\u020d\u022b\u0001"+
		"\u0000\u0000\u0000\u020e\u0210\u0003J%\u0000\u020f\u020e\u0001\u0000\u0000"+
		"\u0000\u020f\u0210\u0001\u0000\u0000\u0000\u0210\u0212\u0001\u0000\u0000"+
		"\u0000\u0211\u0213\u0005\u0082\u0000\u0000\u0212\u0211\u0001\u0000\u0000"+
		"\u0000\u0212\u0213\u0001\u0000\u0000\u0000\u0213\u0214\u0001\u0000\u0000"+
		"\u0000\u0214\u0215\u0005r\u0000\u0000\u0215\u0216\u0005@\u0000\u0000\u0216"+
		"\u0217\u0003V+\u0000\u0217\u0218\u0005=\u0000\u0000\u0218\u022b\u0001"+
		"\u0000\u0000\u0000\u0219\u021b\u0003J%\u0000\u021a\u0219\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005r\u0000\u0000\u021d\u0221\u0005?\u0000\u0000\u021e"+
		"\u0222\u0003l6\u0000\u021f\u0222\u0003X,\u0000\u0220\u0222\u0003\u009c"+
		"N\u0000\u0221\u021e\u0001\u0000\u0000\u0000\u0221\u021f\u0001\u0000\u0000"+
		"\u0000\u0221\u0220\u0001\u0000\u0000\u0000\u0222\u0223\u0001\u0000\u0000"+
		"\u0000\u0223\u0224\u0005=\u0000\u0000\u0224\u022b\u0001\u0000\u0000\u0000"+
		"\u0225\u0227\u0003J%\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0226\u0227"+
		"\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000\u0000\u0000\u0228\u0229"+
		"\u0005r\u0000\u0000\u0229\u022b\u0005=\u0000\u0000\u022a\u01ef\u0001\u0000"+
		"\u0000\u0000\u022a\u0200\u0001\u0000\u0000\u0000\u022a\u020f\u0001\u0000"+
		"\u0000\u0000\u022a\u021a\u0001\u0000\u0000\u0000\u022a\u0226\u0001\u0000"+
		"\u0000\u0000\u022bM\u0001\u0000\u0000\u0000\u022c\u022e\u0005\u0082\u0000"+
		"\u0000\u022d\u022c\u0001\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0005r\u0000\u0000"+
		"\u0230\u0231\u0005@\u0000\u0000\u0231\u0232\u0003V+\u0000\u0232\u0233"+
		"\u00057\u0000\u0000\u0233\u0234\u00058\u0000\u0000\u0234\u0235\u0005?"+
		"\u0000\u0000\u0235\u023e\u00057\u0000\u0000\u0236\u023b\u0003X,\u0000"+
		"\u0237\u0238\u0005>\u0000\u0000\u0238\u023a\u0003X,\u0000\u0239\u0237"+
		"\u0001\u0000\u0000\u0000\u023a\u023d\u0001\u0000\u0000\u0000\u023b\u0239"+
		"\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023f"+
		"\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023e\u0236"+
		"\u0001\u0000\u0000\u0000\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u00058\u0000\u0000\u0241\u0242\u0005"+
		"=\u0000\u0000\u0242\u0255\u0001\u0000\u0000\u0000\u0243\u0244\u0005r\u0000"+
		"\u0000\u0244\u0245\u0005?\u0000\u0000\u0245\u0247\u00057\u0000\u0000\u0246"+
		"\u0248\u0003X,\u0000\u0247\u0246\u0001\u0000\u0000\u0000\u0247\u0248\u0001"+
		"\u0000\u0000\u0000\u0248\u024f\u0001\u0000\u0000\u0000\u0249\u024b\u0003"+
		"X,\u0000\u024a\u024c\u0005>\u0000\u0000\u024b\u024a\u0001\u0000\u0000"+
		"\u0000\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024e\u0001\u0000\u0000"+
		"\u0000\u024d\u0249\u0001\u0000\u0000\u0000\u024e\u0251\u0001\u0000\u0000"+
		"\u0000\u024f\u024d\u0001\u0000\u0000\u0000\u024f\u0250\u0001\u0000\u0000"+
		"\u0000\u0250\u0252\u0001\u0000\u0000\u0000\u0251\u024f\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u00058\u0000\u0000\u0253\u0255\u0005=\u0000\u0000\u0254"+
		"\u022d\u0001\u0000\u0000\u0000\u0254\u0243\u0001\u0000\u0000\u0000\u0255"+
		"O\u0001\u0000\u0000\u0000\u0256\u0257\u0005|\u0000\u0000\u0257\u0258\u0005"+
		"r\u0000\u0000\u0258\u0261\u00059\u0000\u0000\u0259\u025e\u0003n7\u0000"+
		"\u025a\u025b\u0005>\u0000\u0000\u025b\u025d\u0003n7\u0000\u025c\u025a"+
		"\u0001\u0000\u0000\u0000\u025d\u0260\u0001\u0000\u0000\u0000\u025e\u025c"+
		"\u0001\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0262"+
		"\u0001\u0000\u0000\u0000\u0260\u025e\u0001\u0000\u0000\u0000\u0261\u0259"+
		"\u0001\u0000\u0000\u0000\u0261\u0262\u0001\u0000\u0000\u0000\u0262\u0263"+
		"\u0001\u0000\u0000\u0000\u0263\u0264\u0005:\u0000\u0000\u0264\u0267\u0005"+
		"@\u0000\u0000\u0265\u0268\u0003V+\u0000\u0266\u0268\u0005\u0083\u0000"+
		"\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0266\u0001\u0000\u0000"+
		"\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269\u026a\u0005=\u0000\u0000"+
		"\u026aQ\u0001\u0000\u0000\u0000\u026b\u026c\u0007\u0002\u0000\u0000\u026c"+
		"\u0275\u00059\u0000\u0000\u026d\u0272\u0003n7\u0000\u026e\u026f\u0005"+
		">\u0000\u0000\u026f\u0271\u0003n7\u0000\u0270\u026e\u0001\u0000\u0000"+
		"\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000\u0000"+
		"\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u026d\u0001\u0000\u0000"+
		"\u0000\u0275\u0276\u0001\u0000\u0000\u0000\u0276\u0277\u0001\u0000\u0000"+
		"\u0000\u0277\u027a\u0005:\u0000\u0000\u0278\u0279\u0005@\u0000\u0000\u0279"+
		"\u027b\u0003V+\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001"+
		"\u0000\u0000\u0000\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u0280\u0005"+
		";\u0000\u0000\u027d\u027f\u0003\u0002\u0001\u0000\u027e\u027d\u0001\u0000"+
		"\u0000\u0000\u027f\u0282\u0001\u0000\u0000\u0000\u0280\u027e\u0001\u0000"+
		"\u0000\u0000\u0280\u0281\u0001\u0000\u0000\u0000\u0281\u0283\u0001\u0000"+
		"\u0000\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0284\u0005<\u0000"+
		"\u0000\u0284S\u0001\u0000\u0000\u0000\u0285\u0287\u0003J%\u0000\u0286"+
		"\u0285\u0001\u0000\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287"+
		"\u0288\u0001\u0000\u0000\u0000\u0288\u0289\u0005r\u0000\u0000\u0289\u028a"+
		"\u0005@\u0000\u0000\u028a\u028b\u0005r\u0000\u0000\u028b\u02a6\u0005="+
		"\u0000\u0000\u028c\u028e\u0003J%\u0000\u028d\u028c\u0001\u0000\u0000\u0000"+
		"\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000"+
		"\u028f\u0290\u0005r\u0000\u0000\u0290\u0291\u0005@\u0000\u0000\u0291\u0292"+
		"\u0005r\u0000\u0000\u0292\u0293\u0005?\u0000\u0000\u0293\u0294\u0005x"+
		"\u0000\u0000\u0294\u0295\u0005r\u0000\u0000\u0295\u02a0\u00059\u0000\u0000"+
		"\u0296\u029b\u0003X,\u0000\u0297\u0298\u0005>\u0000\u0000\u0298\u029a"+
		"\u0003X,\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000"+
		"\u0000\u0000\u029b\u0299\u0001\u0000\u0000\u0000\u029b\u029c\u0001\u0000"+
		"\u0000\u0000\u029c\u029f\u0001\u0000\u0000\u0000\u029d\u029b\u0001\u0000"+
		"\u0000\u0000\u029e\u0296\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000"+
		"\u0000\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000"+
		"\u0000\u0000\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0005:\u0000\u0000\u02a4\u02a6\u0005=\u0000\u0000"+
		"\u02a5\u0286\u0001\u0000\u0000\u0000\u02a5\u028d\u0001\u0000\u0000\u0000"+
		"\u02a6U\u0001\u0000\u0000\u0000\u02a7\u02a8\u0007\u0003\u0000\u0000\u02a8"+
		"W\u0001\u0000\u0000\u0000\u02a9\u02b3\u0005n\u0000\u0000\u02aa\u02b3\u0005"+
		"o\u0000\u0000\u02ab\u02b3\u0005p\u0000\u0000\u02ac\u02b3\u0003\\.\u0000"+
		"\u02ad\u02b3\u0003Z-\u0000\u02ae\u02b3\u0005\u0085\u0000\u0000\u02af\u02b3"+
		"\u0003r9\u0000\u02b0\u02b3\u0003\u0082A\u0000\u02b1\u02b3\u0003\u009c"+
		"N\u0000\u02b2\u02a9\u0001\u0000\u0000\u0000\u02b2\u02aa\u0001\u0000\u0000"+
		"\u0000\u02b2\u02ab\u0001\u0000\u0000\u0000\u02b2\u02ac\u0001\u0000\u0000"+
		"\u0000\u02b2\u02ad\u0001\u0000\u0000\u0000\u02b2\u02ae\u0001\u0000\u0000"+
		"\u0000\u02b2\u02af\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3Y\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0005;\u0000\u0000\u02b5\u02b6\u0005r\u0000\u0000\u02b6\u02b7"+
		"\u0005@\u0000\u0000\u02b7\u02c2\u0003X,\u0000\u02b8\u02b9\u0005>\u0000"+
		"\u0000\u02b9\u02ba\u0005r\u0000\u0000\u02ba\u02bb\u0005@\u0000\u0000\u02bb"+
		"\u02bc\u0003X,\u0000\u02bc\u02be\u0001\u0000\u0000\u0000\u02bd\u02bf\u0005"+
		">\u0000\u0000\u02be\u02bd\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000"+
		"\u0000\u0000\u02bf\u02c1\u0001\u0000\u0000\u0000\u02c0\u02b8\u0001\u0000"+
		"\u0000\u0000\u02c1\u02c4\u0001\u0000\u0000\u0000\u02c2\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c5\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c2\u0001\u0000\u0000\u0000\u02c5\u02c6\u0005<\u0000"+
		"\u0000\u02c6[\u0001\u0000\u0000\u0000\u02c7\u02cc\u00057\u0000\u0000\u02c8"+
		"\u02cb\u0005r\u0000\u0000\u02c9\u02cb\u0003X,\u0000\u02ca\u02c8\u0001"+
		"\u0000\u0000\u0000\u02ca\u02c9\u0001\u0000\u0000\u0000\u02cb\u02ce\u0001"+
		"\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000\u02cc\u02cd\u0001"+
		"\u0000\u0000\u0000\u02cd\u02d6\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001"+
		"\u0000\u0000\u0000\u02cf\u02d2\u0005>\u0000\u0000\u02d0\u02d3\u0005r\u0000"+
		"\u0000\u02d1\u02d3\u0003X,\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2"+
		"\u02d1\u0001\u0000\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4"+
		"\u02cf\u0001\u0000\u0000\u0000\u02d5\u02d8\u0001\u0000\u0000\u0000\u02d6"+
		"\u02d4\u0001\u0000\u0000\u0000\u02d6\u02d7\u0001\u0000\u0000\u0000\u02d7"+
		"\u02da\u0001\u0000\u0000\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d9"+
		"\u02db\u0005>\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02da\u02db"+
		"\u0001\u0000\u0000\u0000\u02db\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd"+
		"\u00058\u0000\u0000\u02dd]\u0001\u0000\u0000\u0000\u02de\u02df\u0005r"+
		"\u0000\u0000\u02df\u02e2\u0005?\u0000\u0000\u02e0\u02e3\u0003l6\u0000"+
		"\u02e1\u02e3\u0003\u009cN\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2"+
		"\u02e1\u0001\u0000\u0000\u0000\u02e3\u02e8\u0001\u0000\u0000\u0000\u02e4"+
		"\u02e5\u0005>\u0000\u0000\u02e5\u02e7\u0003l6\u0000\u02e6\u02e4\u0001"+
		"\u0000\u0000\u0000\u02e7\u02ea\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001"+
		"\u0000\u0000\u0000\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02eb\u0001"+
		"\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ec\u0005"+
		"=\u0000\u0000\u02ec\u0304\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005w\u0000"+
		"\u0000\u02ee\u02ef\u0005B\u0000\u0000\u02ef\u02f0\u0005r\u0000\u0000\u02f0"+
		"\u02f1\u0005?\u0000\u0000\u02f1\u02f2\u0003l6\u0000\u02f2\u02f3\u0005"+
		"=\u0000\u0000\u02f3\u0304\u0001\u0000\u0000\u0000\u02f4\u02f5\u0005r\u0000"+
		"\u0000\u02f5\u02f6\u0005?\u0000\u0000\u02f6\u02ff\u00057\u0000\u0000\u02f7"+
		"\u02fc\u0003X,\u0000\u02f8\u02f9\u0005>\u0000\u0000\u02f9\u02fb\u0003"+
		"X,\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fb\u02fe\u0001\u0000\u0000"+
		"\u0000\u02fc\u02fa\u0001\u0000\u0000\u0000\u02fc\u02fd\u0001\u0000\u0000"+
		"\u0000\u02fd\u0300\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000\u0000"+
		"\u0000\u02ff\u02f7\u0001\u0000\u0000\u0000\u02ff\u0300\u0001\u0000\u0000"+
		"\u0000\u0300\u0301\u0001\u0000\u0000\u0000\u0301\u0302\u00058\u0000\u0000"+
		"\u0302\u0304\u0005=\u0000\u0000\u0303\u02de\u0001\u0000\u0000\u0000\u0303"+
		"\u02ed\u0001\u0000\u0000\u0000\u0303\u02f4\u0001\u0000\u0000\u0000\u0304"+
		"_\u0001\u0000\u0000\u0000\u0305\u0306\u0005\u0086\u0000\u0000\u0306\u0307"+
		"\u00059\u0000\u0000\u0307\u0308\u0003l6\u0000\u0308\u0309\u0005:\u0000"+
		"\u0000\u0309\u030d\u0003j5\u0000\u030a\u030c\u0003d2\u0000\u030b\u030a"+
		"\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b"+
		"\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u0312"+
		"\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0311"+
		"\u0005\u0087\u0000\u0000\u0311\u0313\u0003j5\u0000\u0312\u0310\u0001\u0000"+
		"\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000\u0313a\u0001\u0000\u0000"+
		"\u0000\u0314\u0315\u0005\u0088\u0000\u0000\u0315\u0316\u00059\u0000\u0000"+
		"\u0316\u0317\u0003l6\u0000\u0317\u0318\u0005:\u0000\u0000\u0318\u0319"+
		"\u0003j5\u0000\u0319c\u0001\u0000\u0000\u0000\u031a\u031b\u0005\u0087"+
		"\u0000\u0000\u031b\u031c\u0005\u0086\u0000\u0000\u031c\u031d\u00059\u0000"+
		"\u0000\u031d\u031e\u0003l6\u0000\u031e\u031f\u0005:\u0000\u0000\u031f"+
		"\u0320\u0003j5\u0000\u0320e\u0001\u0000\u0000\u0000\u0321\u0322\u0005"+
		"\u0089\u0000\u0000\u0322\u0323\u0005=\u0000\u0000\u0323g\u0001\u0000\u0000"+
		"\u0000\u0324\u0325\u0005\u008a\u0000\u0000\u0325\u0326\u0005=\u0000\u0000"+
		"\u0326i\u0001\u0000\u0000\u0000\u0327\u032b\u0005;\u0000\u0000\u0328\u032a"+
		"\u0003\u0002\u0001\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032a\u032d"+
		"\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000\u0000\u0000\u032b\u032c"+
		"\u0001\u0000\u0000\u0000\u032c\u032e\u0001\u0000\u0000\u0000\u032d\u032b"+
		"\u0001\u0000\u0000\u0000\u032e\u032f\u0005<\u0000\u0000\u032fk\u0001\u0000"+
		"\u0000\u0000\u0330\u0331\u00066\uffff\uffff\u0000\u0331\u0332\u00059\u0000"+
		"\u0000\u0332\u0333\u0003l6\u0000\u0333\u0334\u0005:\u0000\u0000\u0334"+
		"\u0364\u0001\u0000\u0000\u0000\u0335\u0336\u0005r\u0000\u0000\u0336\u0337"+
		"\u00057\u0000\u0000\u0337\u0338\u0003l6\u0000\u0338\u0339\u00058\u0000"+
		"\u0000\u0339\u0364\u0001\u0000\u0000\u0000\u033a\u033b\u0005S\u0000\u0000"+
		"\u033b\u033c\u0003l6\u0000\u033c\u033d\u0005T\u0000\u0000\u033d\u0364"+
		"\u0001\u0000\u0000\u0000\u033e\u033f\u0005w\u0000\u0000\u033f\u0340\u0005"+
		"B\u0000\u0000\u0340\u0341\u0005r\u0000\u0000\u0341\u0342\u0005B\u0000"+
		"\u0000\u0342\u0343\u0005r\u0000\u0000\u0343\u034c\u00059\u0000\u0000\u0344"+
		"\u0349\u0003l6\u0000\u0345\u0346\u0005>\u0000\u0000\u0346\u0348\u0003"+
		"l6\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000"+
		"\u0000\u0349\u0347\u0001\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000"+
		"\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000"+
		"\u0000\u034c\u0344\u0001\u0000\u0000\u0000\u034c\u034d\u0001\u0000\u0000"+
		"\u0000\u034d\u034e\u0001\u0000\u0000\u0000\u034e\u0364\u0005:\u0000\u0000"+
		"\u034f\u0350\u0005r\u0000\u0000\u0350\u0351\u0005c\u0000\u0000\u0351\u0364"+
		"\u0003l6\b\u0352\u0353\u0005r\u0000\u0000\u0353\u0354\u0005c\u0000\u0000"+
		"\u0354\u0364\u0005r\u0000\u0000\u0355\u0356\u0005w\u0000\u0000\u0356\u0357"+
		"\u0005B\u0000\u0000\u0357\u0358\u0005r\u0000\u0000\u0358\u0359\u0005?"+
		"\u0000\u0000\u0359\u0364\u0003l6\u0006\u035a\u035b\u0005w\u0000\u0000"+
		"\u035b\u035c\u0005B\u0000\u0000\u035c\u0364\u0005r\u0000\u0000\u035d\u035e"+
		"\u0005r\u0000\u0000\u035e\u035f\u0005B\u0000\u0000\u035f\u0364\u0005r"+
		"\u0000\u0000\u0360\u0364\u0003X,\u0000\u0361\u0364\u0005r\u0000\u0000"+
		"\u0362\u0364\u0003r9\u0000\u0363\u0330\u0001\u0000\u0000\u0000\u0363\u0335"+
		"\u0001\u0000\u0000\u0000\u0363\u033a\u0001\u0000\u0000\u0000\u0363\u033e"+
		"\u0001\u0000\u0000\u0000\u0363\u034f\u0001\u0000\u0000\u0000\u0363\u0352"+
		"\u0001\u0000\u0000\u0000\u0363\u0355\u0001\u0000\u0000\u0000\u0363\u035a"+
		"\u0001\u0000\u0000\u0000\u0363\u035d\u0001\u0000\u0000\u0000\u0363\u0360"+
		"\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363\u0362"+
		"\u0001\u0000\u0000\u0000\u0364\u03aa\u0001\u0000\u0000\u0000\u0365\u0366"+
		"\n\u001c\u0000\u0000\u0366\u0367\u0005E\u0000\u0000\u0367\u03a9\u0003"+
		"l6\u001d\u0368\u0369\n\u001b\u0000\u0000\u0369\u036a\u0005G\u0000\u0000"+
		"\u036a\u03a9\u0003l6\u001c\u036b\u036c\n\u001a\u0000\u0000\u036c\u036d"+
		"\u0005H\u0000\u0000\u036d\u03a9\u0003l6\u001b\u036e\u036f\n\u0019\u0000"+
		"\u0000\u036f\u0370\u0005C\u0000\u0000\u0370\u03a9\u0003l6\u001a\u0371"+
		"\u0372\n\u0018\u0000\u0000\u0372\u0373\u0005D\u0000\u0000\u0373\u03a9"+
		"\u0003l6\u0019\u0374\u0375\n\u0017\u0000\u0000\u0375\u0376\u0005J\u0000"+
		"\u0000\u0376\u03a9\u0003l6\u0018\u0377\u0378\n\u0016\u0000\u0000\u0378"+
		"\u0379\u0005K\u0000\u0000\u0379\u03a9\u0003l6\u0017\u037a\u037b\n\u0015"+
		"\u0000\u0000\u037b\u037c\u0005L\u0000\u0000\u037c\u03a9\u0003l6\u0016"+
		"\u037d\u037e\n\u0014\u0000\u0000\u037e\u037f\u0005M\u0000\u0000\u037f"+
		"\u03a9\u0003l6\u0015\u0380\u0381\n\u0013\u0000\u0000\u0381\u0382\u0005"+
		"O\u0000\u0000\u0382\u03a9\u0003l6\u0014\u0383\u0384\n\u0012\u0000\u0000"+
		"\u0384\u0385\u0005P\u0000\u0000\u0385\u03a9\u0003l6\u0013\u0386\u0387"+
		"\n\u0011\u0000\u0000\u0387\u0388\u0005N\u0000\u0000\u0388\u03a9\u0003"+
		"l6\u0012\u0389\u038a\n\u0010\u0000\u0000\u038a\u038b\u0005Q\u0000\u0000"+
		"\u038b\u03a9\u0003l6\u0011\u038c\u038d\n\u000f\u0000\u0000\u038d\u038e"+
		"\u0005R\u0000\u0000\u038e\u03a9\u0003l6\u0010\u038f\u0390\n\u000b\u0000"+
		"\u0000\u0390\u0391\u0005B\u0000\u0000\u0391\u0392\u0005r\u0000\u0000\u0392"+
		"\u039b\u00059\u0000\u0000\u0393\u0398\u0003l6\u0000\u0394\u0395\u0005"+
		">\u0000\u0000\u0395\u0397\u0003l6\u0000\u0396\u0394\u0001\u0000\u0000"+
		"\u0000\u0397\u039a\u0001\u0000\u0000\u0000\u0398\u0396\u0001\u0000\u0000"+
		"\u0000\u0398\u0399\u0001\u0000\u0000\u0000\u0399\u039c\u0001\u0000\u0000"+
		"\u0000\u039a\u0398\u0001\u0000\u0000\u0000\u039b\u0393\u0001\u0000\u0000"+
		"\u0000\u039b\u039c\u0001\u0000\u0000\u0000\u039c\u039d\u0001\u0000\u0000"+
		"\u0000\u039d\u03a9\u0005:\u0000\u0000\u039e\u039f\n\t\u0000\u0000\u039f"+
		"\u03a0\u0005B\u0000\u0000\u03a0\u03a1\u0005r\u0000\u0000\u03a1\u03a2\u0005"+
		"9\u0000\u0000\u03a2\u03a3\u0005r\u0000\u0000\u03a3\u03a4\u0005c\u0000"+
		"\u0000\u03a4\u03a5\u0003l6\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6"+
		"\u03a7\u0005:\u0000\u0000\u03a7\u03a9\u0001\u0000\u0000\u0000\u03a8\u0365"+
		"\u0001\u0000\u0000\u0000\u03a8\u0368\u0001\u0000\u0000\u0000\u03a8\u036b"+
		"\u0001\u0000\u0000\u0000\u03a8\u036e\u0001\u0000\u0000\u0000\u03a8\u0371"+
		"\u0001\u0000\u0000\u0000\u03a8\u0374\u0001\u0000\u0000\u0000\u03a8\u0377"+
		"\u0001\u0000\u0000\u0000\u03a8\u037a\u0001\u0000\u0000\u0000\u03a8\u037d"+
		"\u0001\u0000\u0000\u0000\u03a8\u0380\u0001\u0000\u0000\u0000\u03a8\u0383"+
		"\u0001\u0000\u0000\u0000\u03a8\u0386\u0001\u0000\u0000\u0000\u03a8\u0389"+
		"\u0001\u0000\u0000\u0000\u03a8\u038c\u0001\u0000\u0000\u0000\u03a8\u038f"+
		"\u0001\u0000\u0000\u0000\u03a8\u039e\u0001\u0000\u0000\u0000\u03a9\u03ac"+
		"\u0001\u0000\u0000\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03ab"+
		"\u0001\u0000\u0000\u0000\u03abm\u0001\u0000\u0000\u0000\u03ac\u03aa\u0001"+
		"\u0000\u0000\u0000\u03ad\u03ae\u0005r\u0000\u0000\u03ae\u03af\u0005@\u0000"+
		"\u0000\u03af\u03b8\u0003V+\u0000\u03b0\u03b1\u0005r\u0000\u0000\u03b1"+
		"\u03b2\u0005@\u0000\u0000\u03b2\u03b3\u0003V+\u0000\u03b3\u03b4\u0005"+
		"?\u0000\u0000\u03b4\u03b5\u0003X,\u0000\u03b5\u03b8\u0001\u0000\u0000"+
		"\u0000\u03b6\u03b8\u0005r\u0000\u0000\u03b7\u03ad\u0001\u0000\u0000\u0000"+
		"\u03b7\u03b0\u0001\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000"+
		"\u03b8o\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005r\u0000\u0000\u03ba\u03c3"+
		"\u00059\u0000\u0000\u03bb\u03c0\u0003l6\u0000\u03bc\u03bd\u0005>\u0000"+
		"\u0000\u03bd\u03bf\u0003l6\u0000\u03be\u03bc\u0001\u0000\u0000\u0000\u03bf"+
		"\u03c2\u0001\u0000\u0000\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0"+
		"\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c4\u0001\u0000\u0000\u0000\u03c2"+
		"\u03c0\u0001\u0000\u0000\u0000\u03c3\u03bb\u0001\u0000\u0000\u0000\u03c3"+
		"\u03c4\u0001\u0000\u0000\u0000\u03c4\u03c5\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c6\u0005:\u0000\u0000\u03c6q\u0001\u0000\u0000\u0000\u03c7\u03c8\u0005"+
		"q\u0000\u0000\u03c8\u03c9\u0003t:\u0000\u03c9\u03ca\u0005q\u0000\u0000"+
		"\u03cas\u0001\u0000\u0000\u0000\u03cb\u03d4\u0003v;\u0000\u03cc\u03cd"+
		"\u0005S\u0000\u0000\u03cd\u03ce\u0003l6\u0000\u03ce\u03cf\u0005T\u0000"+
		"\u0000\u03cf\u03d4\u0001\u0000\u0000\u0000\u03d0\u03d4\u0005r\u0000\u0000"+
		"\u03d1\u03d4\u0005o\u0000\u0000\u03d2\u03d4\u0005n\u0000\u0000\u03d3\u03cb"+
		"\u0001\u0000\u0000\u0000\u03d3\u03cc\u0001\u0000\u0000\u0000\u03d3\u03d0"+
		"\u0001\u0000\u0000\u0000\u03d3\u03d1\u0001\u0000\u0000\u0000\u03d3\u03d2"+
		"\u0001\u0000\u0000\u0000\u03d4\u03d5\u0001\u0000\u0000\u0000\u03d5\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d5\u03d6\u0001\u0000\u0000\u0000\u03d6u\u0001"+
		"\u0000\u0000\u0000\u03d7\u03d8\u0005J\u0000\u0000\u03d8\u03da\u0003x<"+
		"\u0000\u03d9\u03db\u0003z=\u0000\u03da\u03d9\u0001\u0000\u0000\u0000\u03da"+
		"\u03db\u0001\u0000\u0000\u0000\u03db\u03dc\u0001\u0000\u0000\u0000\u03dc"+
		"\u03dd\u0005K\u0000\u0000\u03dd\u03de\u0003t:\u0000\u03de\u03df\u0005"+
		"J\u0000\u0000\u03df\u03e0\u0005G\u0000\u0000\u03e0\u03e1\u0003x<\u0000"+
		"\u03e1\u03e2\u0005K\u0000\u0000\u03e2\u03f7\u0001\u0000\u0000\u0000\u03e3"+
		"\u03e4\u0005J\u0000\u0000\u03e4\u03e6\u0003x<\u0000\u03e5\u03e7\u0003"+
		"z=\u0000\u03e6\u03e5\u0001\u0000\u0000\u0000\u03e6\u03e7\u0001\u0000\u0000"+
		"\u0000\u03e7\u03e8\u0001\u0000\u0000\u0000\u03e8\u03ea\u0005K\u0000\u0000"+
		"\u03e9\u03eb\u0003t:\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03ea\u03eb"+
		"\u0001\u0000\u0000\u0000\u03eb\u03f7\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0005J\u0000\u0000\u03ed\u03ee\u0003x<\u0000\u03ee\u03ef\u0003z=\u0000"+
		"\u03ef\u03f0\u0005G\u0000\u0000\u03f0\u03f1\u0005K\u0000\u0000\u03f1\u03f7"+
		"\u0001\u0000\u0000\u0000\u03f2\u03f3\u0005J\u0000\u0000\u03f3\u03f4\u0003"+
		"x<\u0000\u03f4\u03f5\u0005K\u0000\u0000\u03f5\u03f7\u0001\u0000\u0000"+
		"\u0000\u03f6\u03d7\u0001\u0000\u0000\u0000\u03f6\u03e3\u0001\u0000\u0000"+
		"\u0000\u03f6\u03ec\u0001\u0000\u0000\u0000\u03f6\u03f2\u0001\u0000\u0000"+
		"\u0000\u03f7w\u0001\u0000\u0000\u0000\u03f8\u03f9\u0005r\u0000\u0000\u03f9"+
		"y\u0001\u0000\u0000\u0000\u03fa\u03fc\u0003|>\u0000\u03fb\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fc\u03ff\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fd\u03fe\u0001\u0000\u0000\u0000\u03fe{\u0001\u0000"+
		"\u0000\u0000\u03ff\u03fd\u0001\u0000\u0000\u0000\u0400\u042b\u0005r\u0000"+
		"\u0000\u0401\u042b\u0005%\u0000\u0000\u0402\u042b\u0005\u0016\u0000\u0000"+
		"\u0403\u042b\u0005\u0017\u0000\u0000\u0404\u042b\u0005\u0018\u0000\u0000"+
		"\u0405\u042b\u0005\u0019\u0000\u0000\u0406\u042b\u0005)\u0000\u0000\u0407"+
		"\u042b\u0005*\u0000\u0000\u0408\u042b\u0005+\u0000\u0000\u0409\u042b\u0005"+
		",\u0000\u0000\u040a\u042b\u0005-\u0000\u0000\u040b\u042b\u0005.\u0000"+
		"\u0000\u040c\u042b\u00052\u0000\u0000\u040d\u042b\u00053\u0000\u0000\u040e"+
		"\u042b\u00054\u0000\u0000\u040f\u042b\u00055\u0000\u0000\u0410\u042b\u0005"+
		"6\u0000\u0000\u0411\u042b\u0003\u009aM\u0000\u0412\u042b\u0003\u0098L"+
		"\u0000\u0413\u042b\u0003\u008aE\u0000\u0414\u042b\u0003\u008cF\u0000\u0415"+
		"\u041e\u00057\u0000\u0000\u0416\u041f\u0005r\u0000\u0000\u0417\u041b\u0005"+
		"r\u0000\u0000\u0418\u041a\u0003~?\u0000\u0419\u0418\u0001\u0000\u0000"+
		"\u0000\u041a\u041d\u0001\u0000\u0000\u0000\u041b\u0419\u0001\u0000\u0000"+
		"\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c\u041f\u0001\u0000\u0000"+
		"\u0000\u041d\u041b\u0001\u0000\u0000\u0000\u041e\u0416\u0001\u0000\u0000"+
		"\u0000\u041e\u0417\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000\u0000"+
		"\u0000\u0420\u042b\u00058\u0000\u0000\u0421\u0422\u00059\u0000\u0000\u0422"+
		"\u0423\u0005r\u0000\u0000\u0423\u042b\u0005:\u0000\u0000\u0424\u0425\u0005"+
		"E\u0000\u0000\u0425\u042b\u0005r\u0000\u0000\u0426\u042b\u0005\u0001\u0000"+
		"\u0000\u0427\u042b\u0005\u0002\u0000\u0000\u0428\u042b\u0005o\u0000\u0000"+
		"\u0429\u042b\u0005n\u0000\u0000\u042a\u0400\u0001\u0000\u0000\u0000\u042a"+
		"\u0401\u0001\u0000\u0000\u0000\u042a\u0402\u0001\u0000\u0000\u0000\u042a"+
		"\u0403\u0001\u0000\u0000\u0000\u042a\u0404\u0001\u0000\u0000\u0000\u042a"+
		"\u0405\u0001\u0000\u0000\u0000\u042a\u0406\u0001\u0000\u0000\u0000\u042a"+
		"\u0407\u0001\u0000\u0000\u0000\u042a\u0408\u0001\u0000\u0000\u0000\u042a"+
		"\u0409\u0001\u0000\u0000\u0000\u042a\u040a\u0001\u0000\u0000\u0000\u042a"+
		"\u040b\u0001\u0000\u0000\u0000\u042a\u040c\u0001\u0000\u0000\u0000\u042a"+
		"\u040d\u0001\u0000\u0000\u0000\u042a\u040e\u0001\u0000\u0000\u0000\u042a"+
		"\u040f\u0001\u0000\u0000\u0000\u042a\u0410\u0001\u0000\u0000\u0000\u042a"+
		"\u0411\u0001\u0000\u0000\u0000\u042a\u0412\u0001\u0000\u0000\u0000\u042a"+
		"\u0413\u0001\u0000\u0000\u0000\u042a\u0414\u0001\u0000\u0000\u0000\u042a"+
		"\u0415\u0001\u0000\u0000\u0000\u042a\u0421\u0001\u0000\u0000\u0000\u042a"+
		"\u0424\u0001\u0000\u0000\u0000\u042a\u0426\u0001\u0000\u0000\u0000\u042a"+
		"\u0427\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042a"+
		"\u0429\u0001\u0000\u0000\u0000\u042b\u042e\u0001\u0000\u0000\u0000\u042c"+
		"\u042d\u0005?\u0000\u0000\u042d\u042f\u0003\u0080@\u0000\u042e\u042c\u0001"+
		"\u0000\u0000\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f}\u0001\u0000"+
		"\u0000\u0000\u0430\u0431\u0005B\u0000\u0000\u0431\u0439\u0005r\u0000\u0000"+
		"\u0432\u0433\u00057\u0000\u0000\u0433\u0434\u0003l6\u0000\u0434\u0435"+
		"\u00058\u0000\u0000\u0435\u0439\u0001\u0000\u0000\u0000\u0436\u0437\u0005"+
		"B\u0000\u0000\u0437\u0439\u0003p8\u0000\u0438\u0430\u0001\u0000\u0000"+
		"\u0000\u0438\u0432\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000"+
		"\u0000\u0439\u007f\u0001\u0000\u0000\u0000\u043a\u043f\u0003X,\u0000\u043b"+
		"\u043f\u0003l6\u0000\u043c\u043f\u0005o\u0000\u0000\u043d\u043f\u0005"+
		"r\u0000\u0000\u043e\u043a\u0001\u0000\u0000\u0000\u043e\u043b\u0001\u0000"+
		"\u0000\u0000\u043e\u043c\u0001\u0000\u0000\u0000\u043e\u043d\u0001\u0000"+
		"\u0000\u0000\u043f\u0081\u0001\u0000\u0000\u0000\u0440\u0441\u00057\u0000"+
		"\u0000\u0441\u0445\u0005q\u0000\u0000\u0442\u0444\u0003\u0084B\u0000\u0443"+
		"\u0442\u0001\u0000\u0000\u0000\u0444\u0447\u0001\u0000\u0000\u0000\u0445"+
		"\u0443\u0001\u0000\u0000\u0000\u0445\u0446\u0001\u0000\u0000\u0000\u0446"+
		"\u0448\u0001\u0000\u0000\u0000\u0447\u0445\u0001\u0000\u0000\u0000\u0448"+
		"\u0449\u0005q\u0000\u0000\u0449\u044a\u00058\u0000\u0000\u044a\u0083\u0001"+
		"\u0000\u0000\u0000\u044b\u044d\u0005B\u0000\u0000\u044c\u044b\u0001\u0000"+
		"\u0000\u0000\u044c\u044d\u0001\u0000\u0000\u0000\u044d\u044e\u0001\u0000"+
		"\u0000\u0000\u044e\u0453\u0005r\u0000\u0000\u044f\u0450\u0005@\u0000\u0000"+
		"\u0450\u0452\u0005r\u0000\u0000\u0451\u044f\u0001\u0000\u0000\u0000\u0452"+
		"\u0455\u0001\u0000\u0000\u0000\u0453\u0451\u0001\u0000\u0000\u0000\u0453"+
		"\u0454\u0001\u0000\u0000\u0000\u0454\u0456\u0001\u0000\u0000\u0000\u0455"+
		"\u0453\u0001\u0000\u0000\u0000\u0456\u045a\u0005;\u0000\u0000\u0457\u0459"+
		"\u0003\u0086C\u0000\u0458\u0457\u0001\u0000\u0000\u0000\u0459\u045c\u0001"+
		"\u0000\u0000\u0000\u045a\u0458\u0001\u0000\u0000\u0000\u045a\u045b\u0001"+
		"\u0000\u0000\u0000\u045b\u045d\u0001\u0000\u0000\u0000\u045c\u045a\u0001"+
		"\u0000\u0000\u0000\u045d\u045e\u0005<\u0000\u0000\u045e\u0085\u0001\u0000"+
		"\u0000\u0000\u045f\u0460\u0005r\u0000\u0000\u0460\u0467\u0005@\u0000\u0000"+
		"\u0461\u0468\u0005r\u0000\u0000\u0462\u0464\u0005n\u0000\u0000\u0463\u0465"+
		"\u0007\u0004\u0000\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0464\u0465"+
		"\u0001\u0000\u0000\u0000\u0465\u0468\u0001\u0000\u0000\u0000\u0466\u0468"+
		"\u0003p8\u0000\u0467\u0461\u0001\u0000\u0000\u0000\u0467\u0462\u0001\u0000"+
		"\u0000\u0000\u0467\u0466\u0001\u0000\u0000\u0000\u0468\u0469\u0001\u0000"+
		"\u0000\u0000\u0469\u0467\u0001\u0000\u0000\u0000\u0469\u046a\u0001\u0000"+
		"\u0000\u0000\u046a\u0478\u0001\u0000\u0000\u0000\u046b\u0472\u0005>\u0000"+
		"\u0000\u046c\u0473\u0005r\u0000\u0000\u046d\u046f\u0005n\u0000\u0000\u046e"+
		"\u0470\u0007\u0004\u0000\u0000\u046f\u046e\u0001\u0000\u0000\u0000\u046f"+
		"\u0470\u0001\u0000\u0000\u0000\u0470\u0473\u0001\u0000\u0000\u0000\u0471"+
		"\u0473\u0003p8\u0000\u0472\u046c\u0001\u0000\u0000\u0000\u0472\u046d\u0001"+
		"\u0000\u0000\u0000\u0472\u0471\u0001\u0000\u0000\u0000\u0473\u0474\u0001"+
		"\u0000\u0000\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0474\u0475\u0001"+
		"\u0000\u0000\u0000\u0475\u0477\u0001\u0000\u0000\u0000\u0476\u046b\u0001"+
		"\u0000\u0000\u0000\u0477\u047a\u0001\u0000\u0000\u0000\u0478\u0476\u0001"+
		"\u0000\u0000\u0000\u0478\u0479\u0001\u0000\u0000\u0000\u0479\u047b\u0001"+
		"\u0000\u0000\u0000\u047a\u0478\u0001\u0000\u0000\u0000\u047b\u047c\u0005"+
		"=\u0000\u0000\u047c\u0087\u0001\u0000\u0000\u0000\u047d\u047e\u0005-\u0000"+
		"\u0000\u047e\u047f\u0005?\u0000\u0000\u047f\u0480\u0005;\u0000\u0000\u0480"+
		"\u0481\u0003l6\u0000\u0481\u0482\u0005<\u0000\u0000\u0482\u0089\u0001"+
		"\u0000\u0000\u0000\u0483\u0484\u00059\u0000\u0000\u0484\u0485\u00050\u0000"+
		"\u0000\u0485\u0486\u0005:\u0000\u0000\u0486\u0487\u0005?\u0000\u0000\u0487"+
		"\u0488\u0005o\u0000\u0000\u0488\u008b\u0001\u0000\u0000\u0000\u0489\u048a"+
		"\u00059\u0000\u0000\u048a\u048b\u00051\u0000\u0000\u048b\u048c\u0005:"+
		"\u0000\u0000\u048c\u048d\u0005?\u0000\u0000\u048d\u048e\u0005o\u0000\u0000"+
		"\u048e\u008d\u0001\u0000\u0000\u0000\u048f\u0490\u00059\u0000\u0000\u0490"+
		"\u0491\u0005/\u0000\u0000\u0491\u0492\u0005:\u0000\u0000\u0492\u0493\u0005"+
		"?\u0000\u0000\u0493\u0494\u0005o\u0000\u0000\u0494\u008f\u0001\u0000\u0000"+
		"\u0000\u0495\u0496\u00056\u0000\u0000\u0496\u0497\u0005?\u0000\u0000\u0497"+
		"\u0498\u0005;\u0000\u0000\u0498\u0499\u0003l6\u0000\u0499\u049a\u0005"+
		"<\u0000\u0000\u049a\u0091\u0001\u0000\u0000\u0000\u049b\u049c\u00053\u0000"+
		"\u0000\u049c\u049d\u0005?\u0000\u0000\u049d\u049e\u0005o\u0000\u0000\u049e"+
		"\u0093\u0001\u0000\u0000\u0000\u049f\u04a0\u00054\u0000\u0000\u04a0\u04a1"+
		"\u0005?\u0000\u0000\u04a1\u04a2\u0005o\u0000\u0000\u04a2\u0095\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a4\u00055\u0000\u0000\u04a4\u04a5\u0005?\u0000\u0000"+
		"\u04a5\u04a6\u0007\u0005\u0000\u0000\u04a6\u0097\u0001\u0000\u0000\u0000"+
		"\u04a7\u04a8\u0005\u0002\u0000\u0000\u04a8\u04a9\u0005?\u0000\u0000\u04a9"+
		"\u04aa\u0003l6\u0000\u04aa\u0099\u0001\u0000\u0000\u0000\u04ab\u04ac\u0005"+
		"\u0001\u0000\u0000\u04ac\u04ad\u0005?\u0000\u0000\u04ad\u04ae\u0003l6"+
		"\u0000\u04ae\u009b\u0001\u0000\u0000\u0000\u04af\u04b0\u0005q\u0000\u0000"+
		"\u04b0\u04b1\u0003\u009eO\u0000\u04b1\u04b2\u0005q\u0000\u0000\u04b2\u009d"+
		"\u0001\u0000\u0000\u0000\u04b3\u04bd\u0003v;\u0000\u04b4\u04b5\u0005S"+
		"\u0000\u0000\u04b5\u04b6\u0003l6\u0000\u04b6\u04b7\u0005T\u0000\u0000"+
		"\u04b7\u04bd\u0001\u0000\u0000\u0000\u04b8\u04bd\u0005r\u0000\u0000\u04b9"+
		"\u04bd\u0005o\u0000\u0000\u04ba\u04bd\u0005n\u0000\u0000\u04bb\u04bd\u0005"+
		"p\u0000\u0000\u04bc\u04b3\u0001\u0000\u0000\u0000\u04bc\u04b4\u0001\u0000"+
		"\u0000\u0000\u04bc\u04b8\u0001\u0000\u0000\u0000\u04bc\u04b9\u0001\u0000"+
		"\u0000\u0000\u04bc\u04ba\u0001\u0000\u0000\u0000\u04bc\u04bb\u0001\u0000"+
		"\u0000\u0000\u04bd\u04be\u0001\u0000\u0000\u0000\u04be\u04bc\u0001\u0000"+
		"\u0000\u0000\u04be\u04bf\u0001\u0000\u0000\u0000\u04bf\u009f\u0001\u0000"+
		"\u0000\u0000\u04c0\u04c1\u0005\u000f\u0000\u0000\u04c1\u04c2\u00059\u0000"+
		"\u0000\u04c2\u04c3\u0003\u00a2Q\u0000\u04c3\u04c4\u0005:\u0000\u0000\u04c4"+
		"\u04c5\u0005=\u0000\u0000\u04c5\u04cf\u0001\u0000\u0000\u0000\u04c6\u04c7"+
		"\u0005\u000f\u0000\u0000\u04c7\u04c8\u00059\u0000\u0000\u04c8\u04c9\u0003"+
		"\u00a2Q\u0000\u04c9\u04ca\u0005:\u0000\u0000\u04ca\u04cb\u0005;\u0000"+
		"\u0000\u04cb\u04cc\u0003\u00a8T\u0000\u04cc\u04cd\u0005<\u0000\u0000\u04cd"+
		"\u04cf\u0001\u0000\u0000\u0000\u04ce\u04c0\u0001\u0000\u0000\u0000\u04ce"+
		"\u04c6\u0001\u0000\u0000\u0000\u04cf\u00a1\u0001\u0000\u0000\u0000\u04d0"+
		"\u04d5\u0003\u00a4R\u0000\u04d1\u04d2\u0005>\u0000\u0000\u04d2\u04d4\u0003"+
		"\u00a6S\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000\u04d4\u04d7\u0001\u0000"+
		"\u0000\u0000\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d5\u04d6\u0001\u0000"+
		"\u0000\u0000\u04d6\u00a3\u0001\u0000\u0000\u0000\u04d7\u04d5\u0001\u0000"+
		"\u0000\u0000\u04d8\u04d9\u0005\u0017\u0000\u0000\u04d9\u04da\u0005@\u0000"+
		"\u0000\u04da\u04db\u0005o\u0000\u0000\u04db\u00a5\u0001\u0000\u0000\u0000"+
		"\u04dc\u04dd\u0007\u0006\u0000\u0000\u04dd\u04de\u0005@\u0000\u0000\u04de"+
		"\u04df\u0003X,\u0000\u04df\u00a7\u0001\u0000\u0000\u0000\u04e0\u04e4\u0003"+
		"L&\u0000\u04e1\u04e4\u0003R)\u0000\u04e2\u04e4\u0003\u00a0P\u0000\u04e3"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e3\u04e1\u0001\u0000\u0000\u0000\u04e3"+
		"\u04e2\u0001\u0000\u0000\u0000\u04e4\u04e7\u0001\u0000\u0000\u0000\u04e5"+
		"\u04e3\u0001\u0000\u0000\u0000\u04e5\u04e6\u0001\u0000\u0000\u0000\u04e6"+
		"\u00a9\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001\u0000\u0000\u0000\u04e8"+
		"\u04e9\u0005\u0010\u0000\u0000\u04e9\u04eb\u00059\u0000\u0000\u04ea\u04ec"+
		"\u0005o\u0000\u0000\u04eb\u04ea\u0001\u0000\u0000\u0000\u04eb\u04ec\u0001"+
		"\u0000\u0000\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000\u04ed\u04ee\u0005"+
		":\u0000\u0000\u04ee\u04ef\u0005;\u0000\u0000\u04ef\u04f0\u0003\u00acV"+
		"\u0000\u04f0\u04f1\u0005<\u0000\u0000\u04f1\u00ab\u0001\u0000\u0000\u0000"+
		"\u04f2\u04f6\u0003\u00a0P\u0000\u04f3\u04f6\u0003R)\u0000\u04f4\u04f6"+
		"\u0003L&\u0000\u04f5\u04f2\u0001\u0000\u0000\u0000\u04f5\u04f3\u0001\u0000"+
		"\u0000\u0000\u04f5\u04f4\u0001\u0000\u0000\u0000\u04f6\u04f9\u0001\u0000"+
		"\u0000\u0000\u04f7\u04f5\u0001\u0000\u0000\u0000\u04f7\u04f8\u0001\u0000"+
		"\u0000\u0000\u04f8\u00ad\u0001\u0000\u0000\u0000\u04f9\u04f7\u0001\u0000"+
		"\u0000\u0000z\u00b1\u00cf\u00d4\u00df\u00ea\u00ee\u0107\u010a\u0111\u0127"+
		"\u012f\u0148\u014b\u0155\u015f\u016d\u016f\u0173\u0177\u017e\u0182\u0194"+
		"\u019d\u01a9\u01ac\u01b4\u01b8\u01bd\u01c5\u01d0\u01de\u01e2\u01ef\u01f2"+
		"\u01fb\u0200\u0203\u020a\u020f\u0212\u021a\u0221\u0226\u022a\u022d\u023b"+
		"\u023e\u0247\u024b\u024f\u0254\u025e\u0261\u0267\u0272\u0275\u027a\u0280"+
		"\u0286\u028d\u029b\u02a0\u02a5\u02b2\u02be\u02c2\u02ca\u02cc\u02d2\u02d6"+
		"\u02da\u02e2\u02e8\u02fc\u02ff\u0303\u030d\u0312\u032b\u0349\u034c\u0363"+
		"\u0398\u039b\u03a8\u03aa\u03b7\u03c0\u03c3\u03d3\u03d5\u03da\u03e6\u03ea"+
		"\u03f6\u03fd\u041b\u041e\u042a\u042e\u0438\u043e\u0445\u044c\u0453\u045a"+
		"\u0464\u0467\u0469\u046f\u0472\u0474\u0478\u04bc\u04be\u04ce\u04d5\u04e3"+
		"\u04e5\u04eb\u04f5\u04f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}