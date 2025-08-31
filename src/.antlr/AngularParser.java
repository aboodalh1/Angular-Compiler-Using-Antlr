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
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
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
				arrayDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				enumDecl();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				variableDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				functionDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(173);
				whileStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(174);
				assignmentStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(175);
				breakStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				continueStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(177);
				html_element();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(178);
				importStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(179);
				component();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(180);
				exportClass();
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
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
		public TerminalNode SemiColon() { return getToken(AngularParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(AngularParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(AngularParser.Comma, i);
		}
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
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
				setState(389);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(390);
				match(Import);
				setState(391);
				match(Identifier);
				setState(392);
				match(From);
				setState(393);
				match(StringLiteral);
				setState(394);
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
			setState(397);
			match(This);
			setState(398);
			match(Dot);
			setState(399);
			match(Identifier);
			setState(400);
			match(Assign);
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case New:
				{
				setState(401);
				newInstanceAssignment();
				}
				break;
			case This:
				{
				setState(402);
				nestedThisAssignment();
				}
				break;
			case Identifier:
				{
				setState(403);
				identifierOrPropertyAssignment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(406);
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
			setState(408);
			match(New);
			setState(409);
			match(Identifier);
			setState(410);
			match(OpenParen);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
				{
				setState(411);
				expression(0);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(412);
					match(Comma);
					setState(413);
					expression(0);
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(421);
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
			setState(423);
			match(This);
			setState(429); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(424);
				match(Dot);
				setState(427);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(425);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(426);
					function_call();
					}
					break;
				}
				}
				}
				setState(431); 
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
			setState(433);
			match(Identifier);
			setState(436);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(434);
				match(Dot);
				setState(435);
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
			setState(438);
			match(Enum);
			setState(439);
			match(Identifier);
			setState(440);
			match(OpenBrace);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(441);
				enumValues();
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
			match(CloseBrace);
			setState(448);
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
			setState(450);
			enumValue();
			setState(455);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(451);
				match(Comma);
				setState(452);
				enumValue();
				}
				}
				setState(457);
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
			setState(458);
			match(Identifier);
			setState(459);
			match(Assign);
			setState(460);
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
			setState(462);
			match(Console);
			setState(463);
			match(Dot);
			setState(464);
			match(Log);
			setState(465);
			match(OpenParen);
			setState(469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(466);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(467);
				match(StringLiteral);
				}
				break;
			case 3:
				{
				setState(468);
				literalValue();
				}
				break;
			}
			setState(471);
			match(CloseParen);
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(472);
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
			setState(475);
			match(Abstract);
			setState(476);
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
			setState(478);
			match(Interface);
			setState(479);
			match(OpenBrace);
			setState(480);
			classBody();
			setState(481);
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
			setState(483);
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
			setState(545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(485);
					accessModifier();
					}
				}

				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(488);
					match(Let_Identify);
					}
				}

				setState(491);
				match(Identifier);
				setState(492);
				match(Colon);
				{
				setState(493);
				type();
				}
				setState(494);
				match(Assign);
				setState(498);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(495);
					expression(0);
					}
					break;
				case 2:
					{
					setState(496);
					literalValue();
					}
					break;
				case 3:
					{
					setState(497);
					templateString();
					}
					break;
				}
				setState(500);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(502);
					accessModifier();
					}
				}

				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(505);
					match(Let_Identify);
					}
				}

				setState(508);
				match(Identifier);
				setState(509);
				match(Assign);
				setState(513);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(510);
					expression(0);
					}
					break;
				case 2:
					{
					setState(511);
					literalValue();
					}
					break;
				case 3:
					{
					setState(512);
					templateString();
					}
					break;
				}
				setState(515);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(517);
					accessModifier();
					}
				}

				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(520);
					match(Let_Identify);
					}
				}

				setState(523);
				match(Identifier);
				setState(524);
				match(Colon);
				setState(525);
				type();
				setState(526);
				match(SemiColon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(528);
					accessModifier();
					}
				}

				setState(531);
				match(Identifier);
				setState(532);
				match(Assign);
				setState(536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(533);
					expression(0);
					}
					break;
				case 2:
					{
					setState(534);
					literalValue();
					}
					break;
				case 3:
					{
					setState(535);
					templateString();
					}
					break;
				}
				setState(538);
				match(SemiColon);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(540);
					accessModifier();
					}
				}

				setState(543);
				match(Identifier);
				setState(544);
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
			setState(587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Let_Identify) {
					{
					setState(547);
					match(Let_Identify);
					}
				}

				setState(550);
				match(Identifier);
				setState(551);
				match(Colon);
				setState(552);
				type();
				setState(553);
				match(OpenBracket);
				setState(554);
				match(CloseBracket);
				setState(555);
				match(Assign);
				setState(556);
				match(OpenBracket);
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					setState(557);
					literalValue();
					setState(562);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(558);
						match(Comma);
						setState(559);
						literalValue();
						}
						}
						setState(564);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(567);
				match(CloseBracket);
				setState(568);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(570);
				match(Identifier);
				setState(571);
				match(Assign);
				setState(572);
				match(OpenBracket);
				setState(574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(573);
					literalValue();
					}
					break;
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					{
					setState(576);
					literalValue();
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(577);
						match(Comma);
						}
					}

					}
					}
					setState(584);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(585);
				match(CloseBracket);
				setState(586);
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
			setState(589);
			match(Abstract);
			setState(590);
			match(Identifier);
			setState(591);
			match(OpenParen);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(592);
				parameter();
				setState(597);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(593);
					match(Comma);
					setState(594);
					parameter();
					}
					}
					setState(599);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(602);
			match(CloseParen);
			setState(603);
			match(Colon);
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Array:
			case Any:
			case TypeNumber:
			case TypeString:
			case TypeBoolean:
			case Identifier:
				{
				setState(604);
				type();
				}
				break;
			case Void:
				{
				setState(605);
				match(Void);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(608);
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
			setState(610);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==Constructor) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(611);
			match(OpenParen);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(612);
				parameter();
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(613);
					match(Comma);
					setState(614);
					parameter();
					}
					}
					setState(619);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(622);
			match(CloseParen);
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(623);
				match(Colon);
				setState(624);
				type();
				}
			}

			setState(627);
			match(OpenBrace);
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
				{
				{
				setState(628);
				statement();
				}
				}
				setState(633);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(634);
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
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(636);
					accessModifier();
					}
				}

				setState(639);
				match(Identifier);
				setState(640);
				match(Colon);
				setState(641);
				match(Identifier);
				setState(642);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (Private - 126)) | (1L << (Public - 126)) | (1L << (Protected - 126)) | (1L << (Static - 126)))) != 0)) {
					{
					setState(643);
					accessModifier();
					}
				}

				setState(646);
				match(Identifier);
				setState(647);
				match(Colon);
				setState(648);
				match(Identifier);
				setState(649);
				match(Assign);
				setState(650);
				match(New);
				setState(651);
				match(Identifier);
				setState(652);
				match(OpenParen);
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
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
					setState(665);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(666);
				match(CloseParen);
				setState(667);
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
			setState(670);
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
			setState(681);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				match(NumberLiteral);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(673);
				match(StringLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(BooleanLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(675);
				listLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(676);
				mapLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(677);
				match(Null);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(678);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(679);
				css();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(680);
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
			setState(683);
			match(OpenBrace);
			setState(684);
			match(Identifier);
			setState(685);
			match(Colon);
			setState(686);
			literalValue();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(687);
				match(Comma);
				{
				setState(688);
				match(Identifier);
				setState(689);
				match(Colon);
				setState(690);
				literalValue();
				}
				setState(693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
				case 1:
					{
					setState(692);
					match(Comma);
					}
					break;
				}
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
			setState(702);
			match(OpenBracket);
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Identifier - 110)) | (1L << (Null - 110)))) != 0)) {
				{
				setState(705);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(703);
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
					setState(704);
					literalValue();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(709);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(717);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(710);
					match(Comma);
					setState(713);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Identifier:
						{
						setState(711);
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
						setState(712);
						literalValue();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(720);
				match(Comma);
				}
			}

			setState(723);
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
			setState(762);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
				match(Identifier);
				setState(726);
				match(Assign);
				setState(729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(727);
					expression(0);
					}
					break;
				case 2:
					{
					setState(728);
					templateString();
					}
					break;
				}
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(731);
					match(Comma);
					setState(732);
					expression(0);
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(738);
				match(SemiColon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				match(This);
				setState(741);
				match(Dot);
				setState(742);
				match(Identifier);
				setState(743);
				match(Assign);
				setState(744);
				expression(0);
				setState(745);
				match(SemiColon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(747);
				match(Identifier);
				setState(748);
				match(Assign);
				setState(749);
				match(OpenBracket);
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBracket || _la==OpenBrace || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & ((1L << (NumberLiteral - 110)) | (1L << (StringLiteral - 110)) | (1L << (BooleanLiteral - 110)) | (1L << (Backtick - 110)) | (1L << (Null - 110)))) != 0)) {
					{
					setState(750);
					literalValue();
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(751);
						match(Comma);
						setState(752);
						literalValue();
						}
						}
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(760);
				match(CloseBracket);
				setState(761);
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
			setState(764);
			match(If);
			setState(765);
			match(OpenParen);
			setState(766);
			expression(0);
			setState(767);
			match(CloseParen);
			setState(768);
			block();
			setState(772);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(769);
					elseIfStatement();
					}
					} 
				}
				setState(774);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
			}
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(775);
				match(Else);
				setState(776);
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
			setState(779);
			match(While);
			setState(780);
			match(OpenParen);
			setState(781);
			expression(0);
			setState(782);
			match(CloseParen);
			setState(783);
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
			setState(785);
			match(Else);
			setState(786);
			match(If);
			setState(787);
			match(OpenParen);
			setState(788);
			expression(0);
			setState(789);
			match(CloseParen);
			setState(790);
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
			setState(792);
			match(Break);
			setState(793);
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
			setState(795);
			match(Continue);
			setState(796);
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
			setState(798);
			match(OpenBrace);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << State) | (1L << Action) | (1L << Store) | (1L << RouterLink) | (1L << RouterOutlet) | (1L << Router) | (1L << NgSubmit) | (1L << NgClick) | (1L << Injectable) | (1L << Import) | (1L << Export) | (1L << Component) | (1L << Class) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & ((1L << (LessThan - 74)) | (1L << (AngularExpressionStart - 74)) | (1L << (NumberLiteral - 74)) | (1L << (StringLiteral - 74)) | (1L << (BooleanLiteral - 74)) | (1L << (Backtick - 74)) | (1L << (Identifier - 74)) | (1L << (This - 74)) | (1L << (Enum - 74)) | (1L << (Console - 74)) | (1L << (Abstract - 74)) | (1L << (Private - 74)) | (1L << (Public - 74)) | (1L << (Protected - 74)) | (1L << (Static - 74)) | (1L << (Let_Identify - 74)) | (1L << (Constructor - 74)) | (1L << (Null - 74)) | (1L << (If - 74)) | (1L << (While - 74)) | (1L << (Break - 74)))) != 0) || _la==Continue) {
				{
				{
				setState(799);
				statement();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
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
			setState(858);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(808);
				match(OpenParen);
				setState(809);
				expression(0);
				setState(810);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new BracketExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(812);
				match(Identifier);
				setState(813);
				match(OpenBracket);
				setState(814);
				expression(0);
				setState(815);
				match(CloseBracket);
				}
				break;
			case 3:
				{
				_localctx = new AngularExpreissionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(817);
				match(AngularExpressionStart);
				setState(818);
				expression(0);
				setState(819);
				match(AngularExpressionEnd);
				}
				break;
			case 4:
				{
				_localctx = new ThisMethodCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(821);
				match(This);
				setState(822);
				match(Dot);
				setState(823);
				match(Identifier);
				setState(824);
				match(Dot);
				setState(825);
				match(Identifier);
				setState(826);
				match(OpenParen);
				setState(835);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
					{
					setState(827);
					expression(0);
					setState(832);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(828);
						match(Comma);
						setState(829);
						expression(0);
						}
						}
						setState(834);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(837);
				match(CloseParen);
				}
				break;
			case 5:
				{
				_localctx = new ArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(838);
				match(Identifier);
				setState(839);
				match(Arrow);
				setState(840);
				expression(8);
				}
				break;
			case 6:
				{
				_localctx = new SimpleArrowFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(841);
				match(Identifier);
				setState(842);
				match(Arrow);
				setState(843);
				match(Identifier);
				}
				break;
			case 7:
				{
				_localctx = new ThisPropertyAssignmentContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(844);
				match(This);
				setState(845);
				match(Dot);
				setState(846);
				match(Identifier);
				setState(847);
				match(Assign);
				setState(848);
				expression(6);
				}
				break;
			case 8:
				{
				_localctx = new ThisPropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(849);
				match(This);
				setState(850);
				match(Dot);
				setState(851);
				match(Identifier);
				}
				break;
			case 9:
				{
				_localctx = new PropertyAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(852);
				match(Identifier);
				setState(853);
				match(Dot);
				setState(854);
				match(Identifier);
				}
				break;
			case 10:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(855);
				literalValue();
				}
				break;
			case 11:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(856);
				match(Identifier);
				}
				break;
			case 12:
				{
				_localctx = new DdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(857);
				html();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(929);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(927);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(860);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(861);
						match(Multiply);
						setState(862);
						expression(29);
						}
						break;
					case 2:
						{
						_localctx = new DivisionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(863);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(864);
						match(Divide);
						setState(865);
						expression(28);
						}
						break;
					case 3:
						{
						_localctx = new ModulusContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(866);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(867);
						match(Modulus);
						setState(868);
						expression(27);
						}
						break;
					case 4:
						{
						_localctx = new AdditionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(869);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(870);
						match(Plus);
						setState(871);
						expression(26);
						}
						break;
					case 5:
						{
						_localctx = new SubtractionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(872);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(873);
						match(Minus);
						setState(874);
						expression(25);
						}
						break;
					case 6:
						{
						_localctx = new LessThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(875);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(876);
						match(LessThan);
						setState(877);
						expression(24);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(878);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(879);
						match(GreaterThan);
						setState(880);
						expression(23);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(881);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(882);
						match(LessThanEquals);
						setState(883);
						expression(22);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(884);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(885);
						match(GreaterThanEquals);
						setState(886);
						expression(21);
						}
						break;
					case 10:
						{
						_localctx = new WeakEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(887);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(888);
						match(WeakEqual);
						setState(889);
						expression(20);
						}
						break;
					case 11:
						{
						_localctx = new StrongEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(890);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(891);
						match(StrongEqual);
						setState(892);
						expression(19);
						}
						break;
					case 12:
						{
						_localctx = new NotEqualsComparisonContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(893);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(894);
						match(NOT_EQUAL);
						setState(895);
						expression(18);
						}
						break;
					case 13:
						{
						_localctx = new LogicalAndExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(896);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(897);
						match(And);
						setState(898);
						expression(17);
						}
						break;
					case 14:
						{
						_localctx = new LogicalOrExpressionStatementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(899);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(900);
						match(Or);
						setState(901);
						expression(16);
						}
						break;
					case 15:
						{
						_localctx = new MethodCallContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(902);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(903);
						match(Dot);
						setState(904);
						match(Identifier);
						setState(905);
						match(OpenParen);
						setState(914);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
							{
							setState(906);
							expression(0);
							setState(911);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==Comma) {
								{
								{
								setState(907);
								match(Comma);
								setState(908);
								expression(0);
								}
								}
								setState(913);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(916);
						match(CloseParen);
						}
						break;
					case 16:
						{
						_localctx = new ArrayMethodWithArrowFunctionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(917);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(918);
						match(Dot);
						setState(919);
						match(Identifier);
						setState(920);
						match(OpenParen);
						{
						setState(921);
						match(Identifier);
						setState(922);
						match(Arrow);
						setState(923);
						expression(0);
						}
						setState(925);
						match(CloseParen);
						}
						break;
					}
					} 
				}
				setState(931);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(932);
				match(Identifier);
				setState(933);
				match(Colon);
				setState(934);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(935);
				match(Identifier);
				setState(936);
				match(Colon);
				setState(937);
				type();
				setState(938);
				match(Assign);
				setState(939);
				literalValue();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(941);
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
			setState(944);
			match(Identifier);
			setState(945);
			match(OpenParen);
			setState(954);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (AngularExpressionStart - 83)) | (1L << (NumberLiteral - 83)) | (1L << (StringLiteral - 83)) | (1L << (BooleanLiteral - 83)) | (1L << (Backtick - 83)) | (1L << (Identifier - 83)) | (1L << (This - 83)) | (1L << (Null - 83)))) != 0)) {
				{
				setState(946);
				expression(0);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(947);
					match(Comma);
					setState(948);
					expression(0);
					}
					}
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(956);
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
			setState(958);
			match(Backtick);
			setState(959);
			html_content();
			setState(960);
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
			setState(970); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(970);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LessThan:
						{
						setState(962);
						html_element();
						}
						break;
					case AngularExpressionStart:
						{
						setState(963);
						match(AngularExpressionStart);
						setState(964);
						expression(0);
						setState(965);
						match(AngularExpressionEnd);
						}
						break;
					case Identifier:
						{
						setState(967);
						match(Identifier);
						}
						break;
					case StringLiteral:
						{
						setState(968);
						match(StringLiteral);
						}
						break;
					case NumberLiteral:
						{
						setState(969);
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
				setState(972); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
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
			setState(1005);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(974);
				match(LessThan);
				setState(975);
				html_tag_name();
				setState(977);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(976);
					html_attributes();
					}
					break;
				}
				setState(979);
				match(GreaterThan);
				setState(980);
				html_content();
				setState(981);
				match(LessThan);
				setState(982);
				match(Divide);
				setState(983);
				html_tag_name();
				setState(984);
				match(GreaterThan);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(986);
				match(LessThan);
				setState(987);
				html_tag_name();
				setState(989);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
				case 1:
					{
					setState(988);
					html_attributes();
					}
					break;
				}
				setState(991);
				match(GreaterThan);
				setState(993);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(992);
					html_content();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(995);
				match(LessThan);
				setState(996);
				html_tag_name();
				setState(997);
				html_attributes();
				setState(998);
				match(Divide);
				setState(999);
				match(GreaterThan);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1001);
				match(LessThan);
				setState(1002);
				html_tag_name();
				setState(1003);
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
			setState(1007);
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
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NgIfDirective) | (1L << NgForDirective) | (1L << Name) | (1L << Id) | (1L << Src) | (1L << Alt) | (1L << Class) | (1L << TypeAttributeName) | (1L << LabelAttributeName) | (1L << ValueAttributeName) | (1L << PlaceHolderAttributeName) | (1L << CheckedAttributeName) | (1L << TargetAttributeName) | (1L << HeadingLevelAttributeName) | (1L << DirectionAttributeName) | (1L << DurationAttributeName) | (1L << RepeatAttributeName) | (1L << GapAttributeName) | (1L << OpenBracket) | (1L << OpenParen))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Multiply - 69)) | (1L << (NumberLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				{
				setState(1009);
				html_attribute();
				}
				}
				setState(1014);
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
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1015);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(1016);
				match(Class);
				}
				break;
			case 3:
				{
				setState(1017);
				match(Name);
				}
				break;
			case 4:
				{
				setState(1018);
				match(Id);
				}
				break;
			case 5:
				{
				setState(1019);
				match(Src);
				}
				break;
			case 6:
				{
				setState(1020);
				match(Alt);
				}
				break;
			case 7:
				{
				setState(1021);
				match(TypeAttributeName);
				}
				break;
			case 8:
				{
				setState(1022);
				match(LabelAttributeName);
				}
				break;
			case 9:
				{
				setState(1023);
				match(ValueAttributeName);
				}
				break;
			case 10:
				{
				setState(1024);
				match(PlaceHolderAttributeName);
				}
				break;
			case 11:
				{
				setState(1025);
				match(CheckedAttributeName);
				}
				break;
			case 12:
				{
				setState(1026);
				match(TargetAttributeName);
				}
				break;
			case 13:
				{
				setState(1027);
				match(HeadingLevelAttributeName);
				}
				break;
			case 14:
				{
				setState(1028);
				match(DirectionAttributeName);
				}
				break;
			case 15:
				{
				setState(1029);
				match(DurationAttributeName);
				}
				break;
			case 16:
				{
				setState(1030);
				match(RepeatAttributeName);
				}
				break;
			case 17:
				{
				setState(1031);
				match(GapAttributeName);
				}
				break;
			case 18:
				{
				setState(1032);
				ngIfAttribute();
				}
				break;
			case 19:
				{
				setState(1033);
				ngForAttribute();
				}
				break;
			case 20:
				{
				setState(1034);
				onChangeAttribute();
				}
				break;
			case 21:
				{
				setState(1035);
				onClickAttribute();
				}
				break;
			case 22:
				{
				setState(1036);
				match(OpenBracket);
				setState(1045);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(1037);
					match(Identifier);
					}
					break;
				case 2:
					{
					{
					setState(1038);
					match(Identifier);
					setState(1042);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==OpenBracket || _la==Dot) {
						{
						{
						setState(1039);
						access_suffix();
						}
						}
						setState(1044);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					}
					break;
				}
				setState(1047);
				match(CloseBracket);
				}
				break;
			case 23:
				{
				setState(1048);
				match(OpenParen);
				{
				setState(1049);
				match(Identifier);
				}
				setState(1050);
				match(CloseParen);
				}
				break;
			case 24:
				{
				setState(1051);
				match(Multiply);
				setState(1052);
				match(Identifier);
				}
				break;
			case 25:
				{
				setState(1053);
				match(NgIfDirective);
				}
				break;
			case 26:
				{
				setState(1054);
				match(NgForDirective);
				}
				break;
			case 27:
				{
				setState(1055);
				match(StringLiteral);
				}
				break;
			case 28:
				{
				setState(1056);
				match(NumberLiteral);
				}
				break;
			}
			setState(1061);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1059);
				match(Assign);
				setState(1060);
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
			setState(1071);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1063);
				match(Dot);
				setState(1064);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				match(OpenBracket);
				setState(1066);
				expression(0);
				setState(1067);
				match(CloseBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				match(Dot);
				setState(1070);
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
			setState(1077);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1073);
				literalValue();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1074);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1075);
				match(StringLiteral);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1076);
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
			setState(1079);
			match(OpenBracket);
			setState(1080);
			match(Backtick);
			setState(1084);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==Identifier) {
				{
				{
				setState(1081);
				css_content();
				}
				}
				setState(1086);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1087);
			match(Backtick);
			setState(1088);
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
			setState(1091);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Dot) {
				{
				setState(1090);
				match(Dot);
				}
			}

			setState(1093);
			match(Identifier);
			setState(1098);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Colon) {
				{
				{
				setState(1094);
				match(Colon);
				setState(1095);
				match(Identifier);
				}
				}
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1101);
			match(OpenBrace);
			setState(1105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(1102);
				css_class_content();
				}
				}
				setState(1107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1108);
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
			setState(1110);
			match(Identifier);
			setState(1111);
			match(Colon);
			setState(1118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1118);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
				case 1:
					{
					setState(1112);
					match(Identifier);
					}
					break;
				case 2:
					{
					setState(1113);
					match(NumberLiteral);
					setState(1115);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Modulus || _la==CssPixel) {
						{
						setState(1114);
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
					setState(1117);
					function_call();
					}
					break;
				}
				}
				setState(1120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NumberLiteral || _la==Identifier );
			setState(1135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1122);
				match(Comma);
				setState(1129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(1129);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						setState(1123);
						match(Identifier);
						}
						break;
					case 2:
						{
						setState(1124);
						match(NumberLiteral);
						setState(1126);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Modulus || _la==CssPixel) {
							{
							setState(1125);
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
						setState(1128);
						function_call();
						}
						break;
					}
					}
					setState(1131); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NumberLiteral || _la==Identifier );
				}
				}
				setState(1137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1138);
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
			setState(1140);
			match(CheckedAttributeName);
			setState(1141);
			match(Assign);
			setState(1142);
			match(OpenBrace);
			setState(1143);
			expression(0);
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
			setState(1146);
			match(OpenParen);
			setState(1147);
			match(OnChangeAttributeName);
			setState(1148);
			match(CloseParen);
			setState(1149);
			match(Assign);
			setState(1150);
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
			setState(1152);
			match(OpenParen);
			setState(1153);
			match(OnClickAttributeName);
			setState(1154);
			match(CloseParen);
			setState(1155);
			match(Assign);
			setState(1156);
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
			setState(1158);
			match(OpenParen);
			setState(1159);
			match(OnSubmitAttributeName);
			setState(1160);
			match(CloseParen);
			setState(1161);
			match(Assign);
			setState(1162);
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
			setState(1164);
			match(GapAttributeName);
			setState(1165);
			match(Assign);
			setState(1166);
			match(OpenBrace);
			setState(1167);
			expression(0);
			setState(1168);
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
			setState(1170);
			match(DirectionAttributeName);
			setState(1171);
			match(Assign);
			setState(1172);
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
			setState(1174);
			match(DurationAttributeName);
			setState(1175);
			match(Assign);
			setState(1176);
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
			setState(1178);
			match(RepeatAttributeName);
			setState(1179);
			match(Assign);
			setState(1180);
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
			setState(1182);
			match(NgForDirective);
			setState(1183);
			match(Assign);
			setState(1184);
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
			setState(1186);
			match(NgIfDirective);
			setState(1187);
			match(Assign);
			setState(1188);
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
			setState(1190);
			match(Backtick);
			setState(1191);
			templateContent();
			setState(1192);
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
			setState(1203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(1203);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LessThan:
					{
					setState(1194);
					html_element();
					}
					break;
				case AngularExpressionStart:
					{
					setState(1195);
					match(AngularExpressionStart);
					setState(1196);
					expression(0);
					setState(1197);
					match(AngularExpressionEnd);
					}
					break;
				case Identifier:
					{
					setState(1199);
					match(Identifier);
					}
					break;
				case StringLiteral:
					{
					setState(1200);
					match(StringLiteral);
					}
					break;
				case NumberLiteral:
					{
					setState(1201);
					match(NumberLiteral);
					}
					break;
				case BooleanLiteral:
					{
					setState(1202);
					match(BooleanLiteral);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(1205); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u008c\u04ba\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
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
		"\u0183\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018e\n"+
		"\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0197\n\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\7\36\u01a1\n\36\f\36\16\36\u01a4\13\36\5\36"+
		"\u01a6\n\36\3\36\3\36\3\37\3\37\3\37\3\37\5\37\u01ae\n\37\6\37\u01b0\n"+
		"\37\r\37\16\37\u01b1\3 \3 \3 \5 \u01b7\n \3!\3!\3!\3!\7!\u01bd\n!\f!\16"+
		"!\u01c0\13!\3!\3!\3!\3\"\3\"\3\"\7\"\u01c8\n\"\f\"\16\"\u01cb\13\"\3#"+
		"\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\5$\u01d8\n$\3$\3$\5$\u01dc\n$\3%\3%\3%"+
		"\3&\3&\3&\3&\3&\3\'\3\'\3(\5(\u01e9\n(\3(\5(\u01ec\n(\3(\3(\3(\3(\3(\3"+
		"(\3(\5(\u01f5\n(\3(\3(\3(\5(\u01fa\n(\3(\5(\u01fd\n(\3(\3(\3(\3(\3(\5"+
		"(\u0204\n(\3(\3(\3(\5(\u0209\n(\3(\5(\u020c\n(\3(\3(\3(\3(\3(\3(\5(\u0214"+
		"\n(\3(\3(\3(\3(\3(\5(\u021b\n(\3(\3(\3(\5(\u0220\n(\3(\3(\5(\u0224\n("+
		"\3)\5)\u0227\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\7)\u0233\n)\f)\16)\u0236"+
		"\13)\5)\u0238\n)\3)\3)\3)\3)\3)\3)\3)\5)\u0241\n)\3)\3)\5)\u0245\n)\7"+
		")\u0247\n)\f)\16)\u024a\13)\3)\3)\5)\u024e\n)\3*\3*\3*\3*\3*\3*\7*\u0256"+
		"\n*\f*\16*\u0259\13*\5*\u025b\n*\3*\3*\3*\3*\5*\u0261\n*\3*\3*\3+\3+\3"+
		"+\3+\3+\7+\u026a\n+\f+\16+\u026d\13+\5+\u026f\n+\3+\3+\3+\5+\u0274\n+"+
		"\3+\3+\7+\u0278\n+\f+\16+\u027b\13+\3+\3+\3,\5,\u0280\n,\3,\3,\3,\3,\3"+
		",\5,\u0287\n,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u0293\n,\f,\16,\u0296\13"+
		",\7,\u0298\n,\f,\16,\u029b\13,\3,\3,\5,\u029f\n,\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\5.\u02ac\n.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3/\5/\u02b8\n/\7/"+
		"\u02ba\n/\f/\16/\u02bd\13/\3/\3/\3\60\3\60\3\60\7\60\u02c4\n\60\f\60\16"+
		"\60\u02c7\13\60\3\60\3\60\3\60\5\60\u02cc\n\60\7\60\u02ce\n\60\f\60\16"+
		"\60\u02d1\13\60\3\60\5\60\u02d4\n\60\3\60\3\60\3\61\3\61\3\61\3\61\5\61"+
		"\u02dc\n\61\3\61\3\61\7\61\u02e0\n\61\f\61\16\61\u02e3\13\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\7\61"+
		"\u02f4\n\61\f\61\16\61\u02f7\13\61\5\61\u02f9\n\61\3\61\3\61\5\61\u02fd"+
		"\n\61\3\62\3\62\3\62\3\62\3\62\3\62\7\62\u0305\n\62\f\62\16\62\u0308\13"+
		"\62\3\62\3\62\5\62\u030c\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\7\67"+
		"\u0323\n\67\f\67\16\67\u0326\13\67\3\67\3\67\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u0341\n8\f8\168\u0344\13"+
		"8\58\u0346\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\58\u035d\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\3"+
		"8\38\38\38\38\38\38\38\38\38\78\u0390\n8\f8\168\u0393\138\58\u0395\n8"+
		"\38\38\38\38\38\38\38\38\38\38\38\78\u03a2\n8\f8\168\u03a5\138\39\39\3"+
		"9\39\39\39\39\39\39\39\59\u03b1\n9\3:\3:\3:\3:\3:\7:\u03b8\n:\f:\16:\u03bb"+
		"\13:\5:\u03bd\n:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\6<\u03cd\n"+
		"<\r<\16<\u03ce\3=\3=\3=\5=\u03d4\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03e0"+
		"\n=\3=\3=\5=\u03e4\n=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u03f0\n=\3>\3>"+
		"\3?\7?\u03f5\n?\f?\16?\u03f8\13?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\7@\u0413\n@\f@\16@\u0416\13@\5@"+
		"\u0418\n@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u0424\n@\3@\3@\5@\u0428\n@"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0432\nA\3B\3B\3B\3B\5B\u0438\nB\3C\3C\3C"+
		"\7C\u043d\nC\fC\16C\u0440\13C\3C\3C\3C\3D\5D\u0446\nD\3D\3D\3D\7D\u044b"+
		"\nD\fD\16D\u044e\13D\3D\3D\7D\u0452\nD\fD\16D\u0455\13D\3D\3D\3E\3E\3"+
		"E\3E\3E\5E\u045e\nE\3E\6E\u0461\nE\rE\16E\u0462\3E\3E\3E\3E\5E\u0469\n"+
		"E\3E\6E\u046c\nE\rE\16E\u046d\7E\u0470\nE\fE\16E\u0473\13E\3E\3E\3F\3"+
		"F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3"+
		"J\3J\3J\3J\3J\3J\3K\3K\3K\3K\3L\3L\3L\3L\3M\3M\3M\3M\3N\3N\3N\3N\3O\3"+
		"O\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\6Q\u04b6\nQ\rQ\16Q\u04b7"+
		"\3Q\2\3nR\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\2\b"+
		"\4\2\27\27$$\3\2\u0080\u0083\4\2tt\u0086\u0086\5\2cdfhtt\4\2JJuu\3\2p"+
		"q\2\u054b\2\u00a5\3\2\2\2\4\u00c1\3\2\2\2\6\u00c6\3\2\2\2\b\u00d1\3\2"+
		"\2\2\n\u00dc\3\2\2\2\f\u00e0\3\2\2\2\16\u00e2\3\2\2\2\20\u00ea\3\2\2\2"+
		"\22\u00f2\3\2\2\2\24\u0103\3\2\2\2\26\u0105\3\2\2\2\30\u0109\3\2\2\2\32"+
		"\u010b\3\2\2\2\34\u0113\3\2\2\2\36\u0121\3\2\2\2 \u0123\3\2\2\2\"\u0129"+
		"\3\2\2\2$\u012d\3\2\2\2&\u0131\3\2\2\2(\u0142\3\2\2\2*\u0151\3\2\2\2,"+
		"\u0153\3\2\2\2.\u0161\3\2\2\2\60\u0169\3\2\2\2\62\u016b\3\2\2\2\64\u0176"+
		"\3\2\2\2\66\u018d\3\2\2\28\u018f\3\2\2\2:\u019a\3\2\2\2<\u01a9\3\2\2\2"+
		">\u01b3\3\2\2\2@\u01b8\3\2\2\2B\u01c4\3\2\2\2D\u01cc\3\2\2\2F\u01d0\3"+
		"\2\2\2H\u01dd\3\2\2\2J\u01e0\3\2\2\2L\u01e5\3\2\2\2N\u0223\3\2\2\2P\u024d"+
		"\3\2\2\2R\u024f\3\2\2\2T\u0264\3\2\2\2V\u029e\3\2\2\2X\u02a0\3\2\2\2Z"+
		"\u02ab\3\2\2\2\\\u02ad\3\2\2\2^\u02c0\3\2\2\2`\u02fc\3\2\2\2b\u02fe\3"+
		"\2\2\2d\u030d\3\2\2\2f\u0313\3\2\2\2h\u031a\3\2\2\2j\u031d\3\2\2\2l\u0320"+
		"\3\2\2\2n\u035c\3\2\2\2p\u03b0\3\2\2\2r\u03b2\3\2\2\2t\u03c0\3\2\2\2v"+
		"\u03cc\3\2\2\2x\u03ef\3\2\2\2z\u03f1\3\2\2\2|\u03f6\3\2\2\2~\u0423\3\2"+
		"\2\2\u0080\u0431\3\2\2\2\u0082\u0437\3\2\2\2\u0084\u0439\3\2\2\2\u0086"+
		"\u0445\3\2\2\2\u0088\u0458\3\2\2\2\u008a\u0476\3\2\2\2\u008c\u047c\3\2"+
		"\2\2\u008e\u0482\3\2\2\2\u0090\u0488\3\2\2\2\u0092\u048e\3\2\2\2\u0094"+
		"\u0494\3\2\2\2\u0096\u0498\3\2\2\2\u0098\u049c\3\2\2\2\u009a\u04a0\3\2"+
		"\2\2\u009c\u04a4\3\2\2\2\u009e\u04a8\3\2\2\2\u00a0\u04b5\3\2\2\2\u00a2"+
		"\u00a4\5\4\3\2\u00a3\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8"+
		"\u00a9\7\2\2\3\u00a9\3\3\2\2\2\u00aa\u00c2\5P)\2\u00ab\u00c2\5@!\2\u00ac"+
		"\u00c2\5N(\2\u00ad\u00c2\5T+\2\u00ae\u00c2\5b\62\2\u00af\u00c2\5d\63\2"+
		"\u00b0\u00c2\5`\61\2\u00b1\u00c2\5h\65\2\u00b2\u00c2\5j\66\2\u00b3\u00c2"+
		"\5x=\2\u00b4\u00c2\5\66\34\2\u00b5\u00c2\5(\25\2\u00b6\u00c2\5*\26\2\u00b7"+
		"\u00c2\58\35\2\u00b8\u00c2\5,\27\2\u00b9\u00c2\5H%\2\u00ba\u00c2\5t;\2"+
		"\u00bb\u00c2\5F$\2\u00bc\u00c2\5\6\4\2\u00bd\u00c2\5\24\13\2\u00be\u00c2"+
		"\5\36\20\2\u00bf\u00c2\5&\24\2\u00c0\u00c2\5r:\2\u00c1\u00aa\3\2\2\2\u00c1"+
		"\u00ab\3\2\2\2\u00c1\u00ac\3\2\2\2\u00c1\u00ad\3\2\2\2\u00c1\u00ae\3\2"+
		"\2\2\u00c1\u00af\3\2\2\2\u00c1\u00b0\3\2\2\2\u00c1\u00b1\3\2\2\2\u00c1"+
		"\u00b2\3\2\2\2\u00c1\u00b3\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b5\3\2"+
		"\2\2\u00c1\u00b6\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1\u00b8\3\2\2\2\u00c1"+
		"\u00b9\3\2\2\2\u00c1\u00ba\3\2\2\2\u00c1\u00bb\3\2\2\2\u00c1\u00bc\3\2"+
		"\2\2\u00c1\u00bd\3\2\2\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2\5\3\2\2\2\u00c3\u00c7\5\b\5\2\u00c4\u00c7\5\n\6\2"+
		"\u00c5\u00c7\5\f\7\2\u00c6\u00c3\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5"+
		"\3\2\2\2\u00c7\7\3\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\7;\2\2\u00ca"+
		"\u00cb\7<\2\2\u00cb\u00d2\5N(\2\u00cc\u00cd\7\5\2\2\u00cd\u00ce\7;\2\2"+
		"\u00ce\u00cf\7q\2\2\u00cf\u00d0\7<\2\2\u00d0\u00d2\5N(\2\u00d1\u00c8\3"+
		"\2\2\2\u00d1\u00cc\3\2\2\2\u00d2\t\3\2\2\2\u00d3\u00d4\7\6\2\2\u00d4\u00d5"+
		"\7;\2\2\u00d5\u00d6\7<\2\2\u00d6\u00dd\5T+\2\u00d7\u00d8\7\6\2\2\u00d8"+
		"\u00d9\7;\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7<\2\2\u00db\u00dd\5T+\2"+
		"\u00dc\u00d3\3\2\2\2\u00dc\u00d7\3\2\2\2\u00dd\13\3\2\2\2\u00de\u00e1"+
		"\5\16\b\2\u00df\u00e1\5\20\t\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2"+
		"\u00e1\r\3\2\2\2\u00e2\u00e3\7\7\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e5\7"+
		"\b\2\2\u00e5\u00e6\7;\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8\7<\2\2\u00e8"+
		"\u00e9\7?\2\2\u00e9\17\3\2\2\2\u00ea\u00eb\7\7\2\2\u00eb\u00ec\7D\2\2"+
		"\u00ec\u00ed\7\t\2\2\u00ed\u00ee\7;\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0"+
		"\7<\2\2\u00f0\u00f1\7?\2\2\u00f1\21\3\2\2\2\u00f2\u00f3\7t\2\2\u00f3\u00fc"+
		"\7;\2\2\u00f4\u00f9\5n8\2\u00f5\u00f6\7@\2\2\u00f6\u00f8\5n8\2\u00f7\u00f5"+
		"\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00fd\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7<\2\2\u00ff\23\3\2\2\2\u0100\u0104"+
		"\5\26\f\2\u0101\u0104\5\30\r\2\u0102\u0104\5\32\16\2\u0103\u0100\3\2\2"+
		"\2\u0103\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104\25\3\2\2\2\u0105\u0106"+
		"\7\n\2\2\u0106\u0107\7A\2\2\u0107\u0108\7q\2\2\u0108\27\3\2\2\2\u0109"+
		"\u010a\7\13\2\2\u010a\31\3\2\2\2\u010b\u010c\7\f\2\2\u010c\u010d\7D\2"+
		"\2\u010d\u010e\7\r\2\2\u010e\u010f\7;\2\2\u010f\u0110\5\34\17\2\u0110"+
		"\u0111\7<\2\2\u0111\u0112\7?\2\2\u0112\33\3\2\2\2\u0113\u0114\79\2\2\u0114"+
		"\u0119\7q\2\2\u0115\u0116\7@\2\2\u0116\u0118\7q\2\2\u0117\u0115\3\2\2"+
		"\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7:\2\2\u011d\35\3\2\2\2\u011e"+
		"\u0122\5 \21\2\u011f\u0122\5\"\22\2\u0120\u0122\5$\23\2\u0121\u011e\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0120\3\2\2\2\u0122\37\3\2\2\2\u0123"+
		"\u0124\79\2\2\u0124\u0125\7\16\2\2\u0125\u0126\7:\2\2\u0126\u0127\7A\2"+
		"\2\u0127\u0128\7t\2\2\u0128!\3\2\2\2\u0129\u012a\7\17\2\2\u012a\u012b"+
		"\7A\2\2\u012b\u012c\7q\2\2\u012c#\3\2\2\2\u012d\u012e\7\20\2\2\u012e\u012f"+
		"\7A\2\2\u012f\u0130\7q\2\2\u0130%\3\2\2\2\u0131\u0132\5n8\2\u0132\u0133"+
		"\7D\2\2\u0133\u0134\7t\2\2\u0134\u013d\7;\2\2\u0135\u013a\5n8\2\u0136"+
		"\u0137\7@\2\2\u0137\u0139\5n8\2\u0138\u0136\3\2\2\2\u0139\u013c\3\2\2"+
		"\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a"+
		"\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\7<\2\2\u0140\u0141\7?\2\2\u0141\'\3\2\2\2\u0142\u0143\t\2\2\2\u0143"+
		"\u0147\7;\2\2\u0144\u0148\5\62\32\2\u0145\u0146\7=\2\2\u0146\u0148\7>"+
		"\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u014a\7<\2\2\u014a\u014b\5*\26\2\u014b)\3\2\2\2\u014c"+
		"\u014d\7\35\2\2\u014d\u0152\5,\27\2\u014e\u014f\7\35\2\2\u014f\u0150\7"+
		"t\2\2\u0150\u0152\7?\2\2\u0151\u014c\3\2\2\2\u0151\u014e\3\2\2\2\u0152"+
		"+\3\2\2\2\u0153\u0154\7\'\2\2\u0154\u0155\7t\2\2\u0155\u0156\7=\2\2\u0156"+
		"\u0157\5.\30\2\u0157\u0158\7>\2\2\u0158-\3\2\2\2\u0159\u0160\5N(\2\u015a"+
		"\u0160\5V,\2\u015b\u0160\5P)\2\u015c\u0160\5R*\2\u015d\u0160\5T+\2\u015e"+
		"\u0160\5\4\3\2\u015f\u0159\3\2\2\2\u015f\u015a\3\2\2\2\u015f\u015b\3\2"+
		"\2\2\u015f\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162/\3\2\2\2"+
		"\u0163\u0161\3\2\2\2\u0164\u0166\5\62\32\2\u0165\u0164\3\2\2\2\u0165\u0166"+
		"\3\2\2\2\u0166\u016a\3\2\2\2\u0167\u0168\7=\2\2\u0168\u016a\7>\2\2\u0169"+
		"\u0165\3\2\2\2\u0169\u0167\3\2\2\2\u016a\61\3\2\2\2\u016b\u0170\5\64\33"+
		"\2\u016c\u016d\7@\2\2\u016d\u016f\5\64\33\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0173\u0175\7@\2\2\u0174\u0173\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\63\3\2\2\2\u0176\u0177\7t\2\2\u0177\u0178\7B\2\2"+
		"\u0178\u0179\5Z.\2\u0179\65\3\2\2\2\u017a\u017b\7\34\2\2\u017b\u017c\7"+
		"=\2\2\u017c\u0181\7t\2\2\u017d\u017e\7@\2\2\u017e\u0180\7t\2\2\u017f\u017d"+
		"\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\7>\2\2\u0185\u0186\7`\2"+
		"\2\u0186\u0187\7q\2\2\u0187\u018e\7?\2\2\u0188\u0189\7\34\2\2\u0189\u018a"+
		"\7t\2\2\u018a\u018b\7`\2\2\u018b\u018c\7q\2\2\u018c\u018e\7?\2\2\u018d"+
		"\u017a\3\2\2\2\u018d\u0188\3\2\2\2\u018e\67\3\2\2\2\u018f\u0190\7y\2\2"+
		"\u0190\u0191\7D\2\2\u0191\u0192\7t\2\2\u0192\u0196\7A\2\2\u0193\u0197"+
		"\5:\36\2\u0194\u0197\5<\37\2\u0195\u0197\5> \2\u0196\u0193\3\2\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7?"+
		"\2\2\u01999\3\2\2\2\u019a\u019b\7z\2\2\u019b\u019c\7t\2\2\u019c\u01a5"+
		"\7;\2\2\u019d\u01a2\5n8\2\u019e\u019f\7@\2\2\u019f\u01a1\5n8\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u019d\3\2\2\2\u01a5\u01a6\3\2"+
		"\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01a8\7<\2\2\u01a8;\3\2\2\2\u01a9\u01af"+
		"\7y\2\2\u01aa\u01ad\7D\2\2\u01ab\u01ae\7t\2\2\u01ac\u01ae\5r:\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01aa\3\2"+
		"\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2"+
		"=\3\2\2\2\u01b3\u01b6\7t\2\2\u01b4\u01b5\7D\2\2\u01b5\u01b7\7t\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7?\3\2\2\2\u01b8\u01b9\7{\2\2\u01b9"+
		"\u01ba\7t\2\2\u01ba\u01be\7=\2\2\u01bb\u01bd\5B\"\2\u01bc\u01bb\3\2\2"+
		"\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1"+
		"\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\7>\2\2\u01c2\u01c3\7?\2\2\u01c3"+
		"A\3\2\2\2\u01c4\u01c9\5D#\2\u01c5\u01c6\7@\2\2\u01c6\u01c8\5D#\2\u01c7"+
		"\u01c5\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01ca\3\2"+
		"\2\2\u01caC\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cc\u01cd\7t\2\2\u01cd\u01ce"+
		"\7A\2\2\u01ce\u01cf\5Z.\2\u01cfE\3\2\2\2\u01d0\u01d1\7|\2\2\u01d1\u01d2"+
		"\7D\2\2\u01d2\u01d3\7}\2\2\u01d3\u01d7\7;\2\2\u01d4\u01d8\7t\2\2\u01d5"+
		"\u01d8\7q\2\2\u01d6\u01d8\5Z.\2\u01d7\u01d4\3\2\2\2\u01d7\u01d5\3\2\2"+
		"\2\u01d7\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\7<\2\2\u01da\u01dc"+
		"\7?\2\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dcG\3\2\2\2\u01dd\u01de"+
		"\7~\2\2\u01de\u01df\5,\27\2\u01dfI\3\2\2\2\u01e0\u01e1\7\177\2\2\u01e1"+
		"\u01e2\7=\2\2\u01e2\u01e3\5.\30\2\u01e3\u01e4\7>\2\2\u01e4K\3\2\2\2\u01e5"+
		"\u01e6\t\3\2\2\u01e6M\3\2\2\2\u01e7\u01e9\5L\'\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01ec\7\u0084\2\2\u01eb\u01ea"+
		"\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7t\2\2\u01ee"+
		"\u01ef\7B\2\2\u01ef\u01f0\5X-\2\u01f0\u01f4\7A\2\2\u01f1\u01f5\5n8\2\u01f2"+
		"\u01f5\5Z.\2\u01f3\u01f5\5\u009eP\2\u01f4\u01f1\3\2\2\2\u01f4\u01f2\3"+
		"\2\2\2\u01f4\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\7?\2\2\u01f7"+
		"\u0224\3\2\2\2\u01f8\u01fa\5L\'\2\u01f9\u01f8\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\7\u0084\2\2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\7t\2\2\u01ff\u0203\7A\2"+
		"\2\u0200\u0204\5n8\2\u0201\u0204\5Z.\2\u0202\u0204\5\u009eP\2\u0203\u0200"+
		"\3\2\2\2\u0203\u0201\3\2\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205"+
		"\u0206\7?\2\2\u0206\u0224\3\2\2\2\u0207\u0209\5L\'\2\u0208\u0207\3\2\2"+
		"\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u020c\7\u0084\2\2\u020b"+
		"\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\7t"+
		"\2\2\u020e\u020f\7B\2\2\u020f\u0210\5X-\2\u0210\u0211\7?\2\2\u0211\u0224"+
		"\3\2\2\2\u0212\u0214\5L\'\2\u0213\u0212\3\2\2\2\u0213\u0214\3\2\2\2\u0214"+
		"\u0215\3\2\2\2\u0215\u0216\7t\2\2\u0216\u021a\7A\2\2\u0217\u021b\5n8\2"+
		"\u0218\u021b\5Z.\2\u0219\u021b\5\u009eP\2\u021a\u0217\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021a\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\7?\2\2\u021d"+
		"\u0224\3\2\2\2\u021e\u0220\5L\'\2\u021f\u021e\3\2\2\2\u021f\u0220\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0222\7t\2\2\u0222\u0224\7?\2\2\u0223\u01e8"+
		"\3\2\2\2\u0223\u01f9\3\2\2\2\u0223\u0208\3\2\2\2\u0223\u0213\3\2\2\2\u0223"+
		"\u021f\3\2\2\2\u0224O\3\2\2\2\u0225\u0227\7\u0084\2\2\u0226\u0225\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\7t\2\2\u0229"+
		"\u022a\7B\2\2\u022a\u022b\5X-\2\u022b\u022c\79\2\2\u022c\u022d\7:\2\2"+
		"\u022d\u022e\7A\2\2\u022e\u0237\79\2\2\u022f\u0234\5Z.\2\u0230\u0231\7"+
		"@\2\2\u0231\u0233\5Z.\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234"+
		"\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0237\u022f\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239"+
		"\u023a\7:\2\2\u023a\u023b\7?\2\2\u023b\u024e\3\2\2\2\u023c\u023d\7t\2"+
		"\2\u023d\u023e\7A\2\2\u023e\u0240\79\2\2\u023f\u0241\5Z.\2\u0240\u023f"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0248\3\2\2\2\u0242\u0244\5Z.\2\u0243"+
		"\u0245\7@\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2"+
		"\2\2\u0246\u0242\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248"+
		"\u0249\3\2\2\2\u0249\u024b\3\2\2\2\u024a\u0248\3\2\2\2\u024b\u024c\7:"+
		"\2\2\u024c\u024e\7?\2\2\u024d\u0226\3\2\2\2\u024d\u023c\3\2\2\2\u024e"+
		"Q\3\2\2\2\u024f\u0250\7~\2\2\u0250\u0251\7t\2\2\u0251\u025a\7;\2\2\u0252"+
		"\u0257\5p9\2\u0253\u0254\7@\2\2\u0254\u0256\5p9\2\u0255\u0253\3\2\2\2"+
		"\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258\u025b"+
		"\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u0252\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025c\3\2\2\2\u025c\u025d\7<\2\2\u025d\u0260\7B\2\2\u025e\u0261\5X-\2"+
		"\u025f\u0261\7\u0085\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0263\7?\2\2\u0263S\3\2\2\2\u0264\u0265\t\4\2\2\u0265"+
		"\u026e\7;\2\2\u0266\u026b\5p9\2\u0267\u0268\7@\2\2\u0268\u026a\5p9\2\u0269"+
		"\u0267\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2"+
		"\2\2\u026c\u026f\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0266\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0273\7<\2\2\u0271\u0272\7B\2"+
		"\2\u0272\u0274\5X-\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275"+
		"\3\2\2\2\u0275\u0279\7=\2\2\u0276\u0278\5\4\3\2\u0277\u0276\3\2\2\2\u0278"+
		"\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2"+
		"\2\2\u027b\u0279\3\2\2\2\u027c\u027d\7>\2\2\u027dU\3\2\2\2\u027e\u0280"+
		"\5L\'\2\u027f\u027e\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\7t\2\2\u0282\u0283\7B\2\2\u0283\u0284\7t\2\2\u0284\u029f\7?\2\2"+
		"\u0285\u0287\5L\'\2\u0286\u0285\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288"+
		"\3\2\2\2\u0288\u0289\7t\2\2\u0289\u028a\7B\2\2\u028a\u028b\7t\2\2\u028b"+
		"\u028c\7A\2\2\u028c\u028d\7z\2\2\u028d\u028e\7t\2\2\u028e\u0299\7;\2\2"+
		"\u028f\u0294\5Z.\2\u0290\u0291\7@\2\2\u0291\u0293\5Z.\2\u0292\u0290\3"+
		"\2\2\2\u0293\u0296\3\2\2\2\u0294\u0292\3\2\2\2\u0294\u0295\3\2\2\2\u0295"+
		"\u0298\3\2\2\2\u0296\u0294\3\2\2\2\u0297\u028f\3\2\2\2\u0298\u029b\3\2"+
		"\2\2\u0299\u0297\3\2\2\2\u0299\u029a\3\2\2\2\u029a\u029c\3\2\2\2\u029b"+
		"\u0299\3\2\2\2\u029c\u029d\7<\2\2\u029d\u029f\7?\2\2\u029e\u027f\3\2\2"+
		"\2\u029e\u0286\3\2\2\2\u029fW\3\2\2\2\u02a0\u02a1\t\5\2\2\u02a1Y\3\2\2"+
		"\2\u02a2\u02ac\7p\2\2\u02a3\u02ac\7q\2\2\u02a4\u02ac\7r\2\2\u02a5\u02ac"+
		"\5^\60\2\u02a6\u02ac\5\\/\2\u02a7\u02ac\7\u0087\2\2\u02a8\u02ac\5t;\2"+
		"\u02a9\u02ac\5\u0084C\2\u02aa\u02ac\5\u009eP\2\u02ab\u02a2\3\2\2\2\u02ab"+
		"\u02a3\3\2\2\2\u02ab\u02a4\3\2\2\2\u02ab\u02a5\3\2\2\2\u02ab\u02a6\3\2"+
		"\2\2\u02ab\u02a7\3\2\2\2\u02ab\u02a8\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02aa\3\2\2\2\u02ac[\3\2\2\2\u02ad\u02ae\7=\2\2\u02ae\u02af\7t\2\2\u02af"+
		"\u02b0\7B\2\2\u02b0\u02bb\5Z.\2\u02b1\u02b2\7@\2\2\u02b2\u02b3\7t\2\2"+
		"\u02b3\u02b4\7B\2\2\u02b4\u02b5\5Z.\2\u02b5\u02b7\3\2\2\2\u02b6\u02b8"+
		"\7@\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02ba\3\2\2\2\u02b9"+
		"\u02b1\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2\2\2\u02be\u02bf\7>\2\2\u02bf"+
		"]\3\2\2\2\u02c0\u02c5\79\2\2\u02c1\u02c4\7t\2\2\u02c2\u02c4\5Z.\2\u02c3"+
		"\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2"+
		"\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02cf\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8"+
		"\u02cb\7@\2\2\u02c9\u02cc\7t\2\2\u02ca\u02cc\5Z.\2\u02cb\u02c9\3\2\2\2"+
		"\u02cb\u02ca\3\2\2\2\u02cc\u02ce\3\2\2\2\u02cd\u02c8\3\2\2\2\u02ce\u02d1"+
		"\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d3\3\2\2\2\u02d1"+
		"\u02cf\3\2\2\2\u02d2\u02d4\7@\2\2\u02d3\u02d2\3\2\2\2\u02d3\u02d4\3\2"+
		"\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\7:\2\2\u02d6_\3\2\2\2\u02d7\u02d8"+
		"\7t\2\2\u02d8\u02db\7A\2\2\u02d9\u02dc\5n8\2\u02da\u02dc\5\u009eP\2\u02db"+
		"\u02d9\3\2\2\2\u02db\u02da\3\2\2\2\u02dc\u02e1\3\2\2\2\u02dd\u02de\7@"+
		"\2\2\u02de\u02e0\5n8\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df"+
		"\3\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4"+
		"\u02e5\7?\2\2\u02e5\u02fd\3\2\2\2\u02e6\u02e7\7y\2\2\u02e7\u02e8\7D\2"+
		"\2\u02e8\u02e9\7t\2\2\u02e9\u02ea\7A\2\2\u02ea\u02eb\5n8\2\u02eb\u02ec"+
		"\7?\2\2\u02ec\u02fd\3\2\2\2\u02ed\u02ee\7t\2\2\u02ee\u02ef\7A\2\2\u02ef"+
		"\u02f8\79\2\2\u02f0\u02f5\5Z.\2\u02f1\u02f2\7@\2\2\u02f2\u02f4\5Z.\2\u02f3"+
		"\u02f1\3\2\2\2\u02f4\u02f7\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2"+
		"\2\2\u02f6\u02f9\3\2\2\2\u02f7\u02f5\3\2\2\2\u02f8\u02f0\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\7:\2\2\u02fb\u02fd\7?\2"+
		"\2\u02fc\u02d7\3\2\2\2\u02fc\u02e6\3\2\2\2\u02fc\u02ed\3\2\2\2\u02fda"+
		"\3\2\2\2\u02fe\u02ff\7\u0088\2\2\u02ff\u0300\7;\2\2\u0300\u0301\5n8\2"+
		"\u0301\u0302\7<\2\2\u0302\u0306\5l\67\2\u0303\u0305\5f\64\2\u0304\u0303"+
		"\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2\2\2\u0307"+
		"\u030b\3\2\2\2\u0308\u0306\3\2\2\2\u0309\u030a\7\u0089\2\2\u030a\u030c"+
		"\5l\67\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2\2\2\u030cc\3\2\2\2\u030d"+
		"\u030e\7\u008a\2\2\u030e\u030f\7;\2\2\u030f\u0310\5n8\2\u0310\u0311\7"+
		"<\2\2\u0311\u0312\5l\67\2\u0312e\3\2\2\2\u0313\u0314\7\u0089\2\2\u0314"+
		"\u0315\7\u0088\2\2\u0315\u0316\7;\2\2\u0316\u0317\5n8\2\u0317\u0318\7"+
		"<\2\2\u0318\u0319\5l\67\2\u0319g\3\2\2\2\u031a\u031b\7\u008b\2\2\u031b"+
		"\u031c\7?\2\2\u031ci\3\2\2\2\u031d\u031e\7\u008c\2\2\u031e\u031f\7?\2"+
		"\2\u031fk\3\2\2\2\u0320\u0324\7=\2\2\u0321\u0323\5\4\3\2\u0322\u0321\3"+
		"\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0327\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0328\7>\2\2\u0328m\3\2\2\2\u0329"+
		"\u032a\b8\1\2\u032a\u032b\7;\2\2\u032b\u032c\5n8\2\u032c\u032d\7<\2\2"+
		"\u032d\u035d\3\2\2\2\u032e\u032f\7t\2\2\u032f\u0330\79\2\2\u0330\u0331"+
		"\5n8\2\u0331\u0332\7:\2\2\u0332\u035d\3\2\2\2\u0333\u0334\7U\2\2\u0334"+
		"\u0335\5n8\2\u0335\u0336\7V\2\2\u0336\u035d\3\2\2\2\u0337\u0338\7y\2\2"+
		"\u0338\u0339\7D\2\2\u0339\u033a\7t\2\2\u033a\u033b\7D\2\2\u033b\u033c"+
		"\7t\2\2\u033c\u0345\7;\2\2\u033d\u0342\5n8\2\u033e\u033f\7@\2\2\u033f"+
		"\u0341\5n8\2\u0340\u033e\3\2\2\2\u0341\u0344\3\2\2\2\u0342\u0340\3\2\2"+
		"\2\u0342\u0343\3\2\2\2\u0343\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0345\u033d"+
		"\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u035d\7<\2\2\u0348"+
		"\u0349\7t\2\2\u0349\u034a\7e\2\2\u034a\u035d\5n8\n\u034b\u034c\7t\2\2"+
		"\u034c\u034d\7e\2\2\u034d\u035d\7t\2\2\u034e\u034f\7y\2\2\u034f\u0350"+
		"\7D\2\2\u0350\u0351\7t\2\2\u0351\u0352\7A\2\2\u0352\u035d\5n8\b\u0353"+
		"\u0354\7y\2\2\u0354\u0355\7D\2\2\u0355\u035d\7t\2\2\u0356\u0357\7t\2\2"+
		"\u0357\u0358\7D\2\2\u0358\u035d\7t\2\2\u0359\u035d\5Z.\2\u035a\u035d\7"+
		"t\2\2\u035b\u035d\5t;\2\u035c\u0329\3\2\2\2\u035c\u032e\3\2\2\2\u035c"+
		"\u0333\3\2\2\2\u035c\u0337\3\2\2\2\u035c\u0348\3\2\2\2\u035c\u034b\3\2"+
		"\2\2\u035c\u034e\3\2\2\2\u035c\u0353\3\2\2\2\u035c\u0356\3\2\2\2\u035c"+
		"\u0359\3\2\2\2\u035c\u035a\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u03a3\3\2"+
		"\2\2\u035e\u035f\f\36\2\2\u035f\u0360\7G\2\2\u0360\u03a2\5n8\37\u0361"+
		"\u0362\f\35\2\2\u0362\u0363\7I\2\2\u0363\u03a2\5n8\36\u0364\u0365\f\34"+
		"\2\2\u0365\u0366\7J\2\2\u0366\u03a2\5n8\35\u0367\u0368\f\33\2\2\u0368"+
		"\u0369\7E\2\2\u0369\u03a2\5n8\34\u036a\u036b\f\32\2\2\u036b\u036c\7F\2"+
		"\2\u036c\u03a2\5n8\33\u036d\u036e\f\31\2\2\u036e\u036f\7L\2\2\u036f\u03a2"+
		"\5n8\32\u0370\u0371\f\30\2\2\u0371\u0372\7M\2\2\u0372\u03a2\5n8\31\u0373"+
		"\u0374\f\27\2\2\u0374\u0375\7N\2\2\u0375\u03a2\5n8\30\u0376\u0377\f\26"+
		"\2\2\u0377\u0378\7O\2\2\u0378\u03a2\5n8\27\u0379\u037a\f\25\2\2\u037a"+
		"\u037b\7Q\2\2\u037b\u03a2\5n8\26\u037c\u037d\f\24\2\2\u037d\u037e\7R\2"+
		"\2\u037e\u03a2\5n8\25\u037f\u0380\f\23\2\2\u0380\u0381\7P\2\2\u0381\u03a2"+
		"\5n8\24\u0382\u0383\f\22\2\2\u0383\u0384\7S\2\2\u0384\u03a2\5n8\23\u0385"+
		"\u0386\f\21\2\2\u0386\u0387\7T\2\2\u0387\u03a2\5n8\22\u0388\u0389\f\r"+
		"\2\2\u0389\u038a\7D\2\2\u038a\u038b\7t\2\2\u038b\u0394\7;\2\2\u038c\u0391"+
		"\5n8\2\u038d\u038e\7@\2\2\u038e\u0390\5n8\2\u038f\u038d\3\2\2\2\u0390"+
		"\u0393\3\2\2\2\u0391\u038f\3\2\2\2\u0391\u0392\3\2\2\2\u0392\u0395\3\2"+
		"\2\2\u0393\u0391\3\2\2\2\u0394\u038c\3\2\2\2\u0394\u0395\3\2\2\2\u0395"+
		"\u0396\3\2\2\2\u0396\u03a2\7<\2\2\u0397\u0398\f\13\2\2\u0398\u0399\7D"+
		"\2\2\u0399\u039a\7t\2\2\u039a\u039b\7;\2\2\u039b\u039c\7t\2\2\u039c\u039d"+
		"\7e\2\2\u039d\u039e\5n8\2\u039e\u039f\3\2\2\2\u039f\u03a0\7<\2\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u035e\3\2\2\2\u03a1\u0361\3\2\2\2\u03a1\u0364\3\2"+
		"\2\2\u03a1\u0367\3\2\2\2\u03a1\u036a\3\2\2\2\u03a1\u036d\3\2\2\2\u03a1"+
		"\u0370\3\2\2\2\u03a1\u0373\3\2\2\2\u03a1\u0376\3\2\2\2\u03a1\u0379\3\2"+
		"\2\2\u03a1\u037c\3\2\2\2\u03a1\u037f\3\2\2\2\u03a1\u0382\3\2\2\2\u03a1"+
		"\u0385\3\2\2\2\u03a1\u0388\3\2\2\2\u03a1\u0397\3\2\2\2\u03a2\u03a5\3\2"+
		"\2\2\u03a3\u03a1\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4o\3\2\2\2\u03a5\u03a3"+
		"\3\2\2\2\u03a6\u03a7\7t\2\2\u03a7\u03a8\7B\2\2\u03a8\u03b1\5X-\2\u03a9"+
		"\u03aa\7t\2\2\u03aa\u03ab\7B\2\2\u03ab\u03ac\5X-\2\u03ac\u03ad\7A\2\2"+
		"\u03ad\u03ae\5Z.\2\u03ae\u03b1\3\2\2\2\u03af\u03b1\7t\2\2\u03b0\u03a6"+
		"\3\2\2\2\u03b0\u03a9\3\2\2\2\u03b0\u03af\3\2\2\2\u03b1q\3\2\2\2\u03b2"+
		"\u03b3\7t\2\2\u03b3\u03bc\7;\2\2\u03b4\u03b9\5n8\2\u03b5\u03b6\7@\2\2"+
		"\u03b6\u03b8\5n8\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb\3\2\2\2\u03b9\u03b7"+
		"\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bd\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bc"+
		"\u03b4\3\2\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\3\2\2\2\u03be\u03bf\7<"+
		"\2\2\u03bfs\3\2\2\2\u03c0\u03c1\7s\2\2\u03c1\u03c2\5v<\2\u03c2\u03c3\7"+
		"s\2\2\u03c3u\3\2\2\2\u03c4\u03cd\5x=\2\u03c5\u03c6\7U\2\2\u03c6\u03c7"+
		"\5n8\2\u03c7\u03c8\7V\2\2\u03c8\u03cd\3\2\2\2\u03c9\u03cd\7t\2\2\u03ca"+
		"\u03cd\7q\2\2\u03cb\u03cd\7p\2\2\u03cc\u03c4\3\2\2\2\u03cc\u03c5\3\2\2"+
		"\2\u03cc\u03c9\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc\u03cb\3\2\2\2\u03cd\u03ce"+
		"\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cfw\3\2\2\2\u03d0"+
		"\u03d1\7L\2\2\u03d1\u03d3\5z>\2\u03d2\u03d4\5|?\2\u03d3\u03d2\3\2\2\2"+
		"\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d6\7M\2\2\u03d6\u03d7"+
		"\5v<\2\u03d7\u03d8\7L\2\2\u03d8\u03d9\7I\2\2\u03d9\u03da\5z>\2\u03da\u03db"+
		"\7M\2\2\u03db\u03f0\3\2\2\2\u03dc\u03dd\7L\2\2\u03dd\u03df\5z>\2\u03de"+
		"\u03e0\5|?\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1\3\2\2"+
		"\2\u03e1\u03e3\7M\2\2\u03e2\u03e4\5v<\2\u03e3\u03e2\3\2\2\2\u03e3\u03e4"+
		"\3\2\2\2\u03e4\u03f0\3\2\2\2\u03e5\u03e6\7L\2\2\u03e6\u03e7\5z>\2\u03e7"+
		"\u03e8\5|?\2\u03e8\u03e9\7I\2\2\u03e9\u03ea\7M\2\2\u03ea\u03f0\3\2\2\2"+
		"\u03eb\u03ec\7L\2\2\u03ec\u03ed\5z>\2\u03ed\u03ee\7M\2\2\u03ee\u03f0\3"+
		"\2\2\2\u03ef\u03d0\3\2\2\2\u03ef\u03dc\3\2\2\2\u03ef\u03e5\3\2\2\2\u03ef"+
		"\u03eb\3\2\2\2\u03f0y\3\2\2\2\u03f1\u03f2\7t\2\2\u03f2{\3\2\2\2\u03f3"+
		"\u03f5\5~@\2\u03f4\u03f3\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6\u03f4\3\2\2"+
		"\2\u03f6\u03f7\3\2\2\2\u03f7}\3\2\2\2\u03f8\u03f6\3\2\2\2\u03f9\u0424"+
		"\7t\2\2\u03fa\u0424\7\'\2\2\u03fb\u0424\7\30\2\2\u03fc\u0424\7\31\2\2"+
		"\u03fd\u0424\7\32\2\2\u03fe\u0424\7\33\2\2\u03ff\u0424\7+\2\2\u0400\u0424"+
		"\7,\2\2\u0401\u0424\7-\2\2\u0402\u0424\7.\2\2\u0403\u0424\7/\2\2\u0404"+
		"\u0424\7\60\2\2\u0405\u0424\7\64\2\2\u0406\u0424\7\65\2\2\u0407\u0424"+
		"\7\66\2\2\u0408\u0424\7\67\2\2\u0409\u0424\78\2\2\u040a\u0424\5\u009c"+
		"O\2\u040b\u0424\5\u009aN\2\u040c\u0424\5\u008cG\2\u040d\u0424\5\u008e"+
		"H\2\u040e\u0417\79\2\2\u040f\u0418\7t\2\2\u0410\u0414\7t\2\2\u0411\u0413"+
		"\5\u0080A\2\u0412\u0411\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412\3\2\2"+
		"\2\u0414\u0415\3\2\2\2\u0415\u0418\3\2\2\2\u0416\u0414\3\2\2\2\u0417\u040f"+
		"\3\2\2\2\u0417\u0410\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u0424\7:\2\2\u041a"+
		"\u041b\7;\2\2\u041b\u041c\7t\2\2\u041c\u0424\7<\2\2\u041d\u041e\7G\2\2"+
		"\u041e\u0424\7t\2\2\u041f\u0424\7\3\2\2\u0420\u0424\7\4\2\2\u0421\u0424"+
		"\7q\2\2\u0422\u0424\7p\2\2\u0423\u03f9\3\2\2\2\u0423\u03fa\3\2\2\2\u0423"+
		"\u03fb\3\2\2\2\u0423\u03fc\3\2\2\2\u0423\u03fd\3\2\2\2\u0423\u03fe\3\2"+
		"\2\2\u0423\u03ff\3\2\2\2\u0423\u0400\3\2\2\2\u0423\u0401\3\2\2\2\u0423"+
		"\u0402\3\2\2\2\u0423\u0403\3\2\2\2\u0423\u0404\3\2\2\2\u0423\u0405\3\2"+
		"\2\2\u0423\u0406\3\2\2\2\u0423\u0407\3\2\2\2\u0423\u0408\3\2\2\2\u0423"+
		"\u0409\3\2\2\2\u0423\u040a\3\2\2\2\u0423\u040b\3\2\2\2\u0423\u040c\3\2"+
		"\2\2\u0423\u040d\3\2\2\2\u0423\u040e\3\2\2\2\u0423\u041a\3\2\2\2\u0423"+
		"\u041d\3\2\2\2\u0423\u041f\3\2\2\2\u0423\u0420\3\2\2\2\u0423\u0421\3\2"+
		"\2\2\u0423\u0422\3\2\2\2\u0424\u0427\3\2\2\2\u0425\u0426\7A\2\2\u0426"+
		"\u0428\5\u0082B\2\u0427\u0425\3\2\2\2\u0427\u0428\3\2\2\2\u0428\177\3"+
		"\2\2\2\u0429\u042a\7D\2\2\u042a\u0432\7t\2\2\u042b\u042c\79\2\2\u042c"+
		"\u042d\5n8\2\u042d\u042e\7:\2\2\u042e\u0432\3\2\2\2\u042f\u0430\7D\2\2"+
		"\u0430\u0432\5r:\2\u0431\u0429\3\2\2\2\u0431\u042b\3\2\2\2\u0431\u042f"+
		"\3\2\2\2\u0432\u0081\3\2\2\2\u0433\u0438\5Z.\2\u0434\u0438\5n8\2\u0435"+
		"\u0438\7q\2\2\u0436\u0438\7t\2\2\u0437\u0433\3\2\2\2\u0437\u0434\3\2\2"+
		"\2\u0437\u0435\3\2\2\2\u0437\u0436\3\2\2\2\u0438\u0083\3\2\2\2\u0439\u043a"+
		"\79\2\2\u043a\u043e\7s\2\2\u043b\u043d\5\u0086D\2\u043c\u043b\3\2\2\2"+
		"\u043d\u0440\3\2\2\2\u043e\u043c\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0441"+
		"\3\2\2\2\u0440\u043e\3\2\2\2\u0441\u0442\7s\2\2\u0442\u0443\7:\2\2\u0443"+
		"\u0085\3\2\2\2\u0444\u0446\7D\2\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2"+
		"\2\2\u0446\u0447\3\2\2\2\u0447\u044c\7t\2\2\u0448\u0449\7B\2\2\u0449\u044b"+
		"\7t\2\2\u044a\u0448\3\2\2\2\u044b\u044e\3\2\2\2\u044c\u044a\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044f\3\2\2\2\u044e\u044c\3\2\2\2\u044f\u0453\7="+
		"\2\2\u0450\u0452\5\u0088E\2\u0451\u0450\3\2\2\2\u0452\u0455\3\2\2\2\u0453"+
		"\u0451\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0456\3\2\2\2\u0455\u0453\3\2"+
		"\2\2\u0456\u0457\7>\2\2\u0457\u0087\3\2\2\2\u0458\u0459\7t\2\2\u0459\u0460"+
		"\7B\2\2\u045a\u0461\7t\2\2\u045b\u045d\7p\2\2\u045c\u045e\t\6\2\2\u045d"+
		"\u045c\3\2\2\2\u045d\u045e\3\2\2\2\u045e\u0461\3\2\2\2\u045f\u0461\5r"+
		":\2\u0460\u045a\3\2\2\2\u0460\u045b\3\2\2\2\u0460\u045f\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463\u0471\3\2"+
		"\2\2\u0464\u046b\7@\2\2\u0465\u046c\7t\2\2\u0466\u0468\7p\2\2\u0467\u0469"+
		"\t\6\2\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046c\3\2\2\2\u046a"+
		"\u046c\5r:\2\u046b\u0465\3\2\2\2\u046b\u0466\3\2\2\2\u046b\u046a\3\2\2"+
		"\2\u046c\u046d\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470"+
		"\3\2\2\2\u046f\u0464\3\2\2\2\u0470\u0473\3\2\2\2\u0471\u046f\3\2\2\2\u0471"+
		"\u0472\3\2\2\2\u0472\u0474\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u0475\7?"+
		"\2\2\u0475\u0089\3\2\2\2\u0476\u0477\7/\2\2\u0477\u0478\7A\2\2\u0478\u0479"+
		"\7=\2\2\u0479\u047a\5n8\2\u047a\u047b\7>\2\2\u047b\u008b\3\2\2\2\u047c"+
		"\u047d\7;\2\2\u047d\u047e\7\62\2\2\u047e\u047f\7<\2\2\u047f\u0480\7A\2"+
		"\2\u0480\u0481\7q\2\2\u0481\u008d\3\2\2\2\u0482\u0483\7;\2\2\u0483\u0484"+
		"\7\63\2\2\u0484\u0485\7<\2\2\u0485\u0486\7A\2\2\u0486\u0487\7q\2\2\u0487"+
		"\u008f\3\2\2\2\u0488\u0489\7;\2\2\u0489\u048a\7\61\2\2\u048a\u048b\7<"+
		"\2\2\u048b\u048c\7A\2\2\u048c\u048d\7q\2\2\u048d\u0091\3\2\2\2\u048e\u048f"+
		"\78\2\2\u048f\u0490\7A\2\2\u0490\u0491\7=\2\2\u0491\u0492\5n8\2\u0492"+
		"\u0493\7>\2\2\u0493\u0093\3\2\2\2\u0494\u0495\7\65\2\2\u0495\u0496\7A"+
		"\2\2\u0496\u0497\7q\2\2\u0497\u0095\3\2\2\2\u0498\u0499\7\66\2\2\u0499"+
		"\u049a\7A\2\2\u049a\u049b\7q\2\2\u049b\u0097\3\2\2\2\u049c\u049d\7\67"+
		"\2\2\u049d\u049e\7A\2\2\u049e\u049f\t\7\2\2\u049f\u0099\3\2\2\2\u04a0"+
		"\u04a1\7\4\2\2\u04a1\u04a2\7A\2\2\u04a2\u04a3\5n8\2\u04a3\u009b\3\2\2"+
		"\2\u04a4\u04a5\7\3\2\2\u04a5\u04a6\7A\2\2\u04a6\u04a7\5n8\2\u04a7\u009d"+
		"\3\2\2\2\u04a8\u04a9\7s\2\2\u04a9\u04aa\5\u00a0Q\2\u04aa\u04ab\7s\2\2"+
		"\u04ab\u009f\3\2\2\2\u04ac\u04b6\5x=\2\u04ad\u04ae\7U\2\2\u04ae\u04af"+
		"\5n8\2\u04af\u04b0\7V\2\2\u04b0\u04b6\3\2\2\2\u04b1\u04b6\7t\2\2\u04b2"+
		"\u04b6\7q\2\2\u04b3\u04b6\7p\2\2\u04b4\u04b6\7r\2\2\u04b5\u04ac\3\2\2"+
		"\2\u04b5\u04ad\3\2\2\2\u04b5\u04b1\3\2\2\2\u04b5\u04b2\3\2\2\2\u04b5\u04b3"+
		"\3\2\2\2\u04b5\u04b4\3\2\2\2\u04b6\u04b7\3\2\2\2\u04b7\u04b5\3\2\2\2\u04b7"+
		"\u04b8\3\2\2\2\u04b8\u00a1\3\2\2\2v\u00a5\u00c1\u00c6\u00d1\u00dc\u00e0"+
		"\u00f9\u00fc\u0103\u0119\u0121\u013a\u013d\u0147\u0151\u015f\u0161\u0165"+
		"\u0169\u0170\u0174\u0181\u018d\u0196\u01a2\u01a5\u01ad\u01b1\u01b6\u01be"+
		"\u01c9\u01d7\u01db\u01e8\u01eb\u01f4\u01f9\u01fc\u0203\u0208\u020b\u0213"+
		"\u021a\u021f\u0223\u0226\u0234\u0237\u0240\u0244\u0248\u024d\u0257\u025a"+
		"\u0260\u026b\u026e\u0273\u0279\u027f\u0286\u0294\u0299\u029e\u02ab\u02b7"+
		"\u02bb\u02c3\u02c5\u02cb\u02cf\u02d3\u02db\u02e1\u02f5\u02f8\u02fc\u0306"+
		"\u030b\u0324\u0342\u0345\u035c\u0391\u0394\u03a1\u03a3\u03b0\u03b9\u03bc"+
		"\u03cc\u03ce\u03d3\u03df\u03e3\u03ef\u03f6\u0414\u0417\u0423\u0427\u0431"+
		"\u0437\u043e\u0445\u044c\u0453\u045d\u0460\u0462\u0468\u046b\u046d\u0471"+
		"\u04b5\u04b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}