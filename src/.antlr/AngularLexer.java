// Generated from c:\Users\KEMO\OneDrive\Desktop\compiler 2\Angular-Compiler-Using-Antlr\src\AngularLexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AngularLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NgIfDirective=1, NgForDirective=2, State=3, Action=4, Store=5, Dispatch=6, 
		Select=7, RouterLink=8, RouterOutlet=9, Router=10, Navigate=11, NgModel=12, 
		NgSubmit=13, NgClick=14, Name=15, Id=16, Src=17, Alt=18, Import=19, Export=20, 
		Abstract=21, Interface=22, Extends=23, Implements=24, Console=25, Log=26, 
		Component=27, Service=28, Class=29, InlineAttributeName=30, BackgroundColorAttributeName=31, 
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
		Void=82, Continue=83, Function=84, Return=85, From=86, Null=87, Enum=88, 
		Array=89, Any=90, Arrow=91, TypeNumber=92, TypeString=93, TypeBoolean=94, 
		This=95, Constructor=96, Private=97, Public=98, Static=99, Protected=100, 
		New=101, NumberLiteral=102, StringLiteral=103, BooleanLiteral=104, Backtick=105, 
		Identifier=106, CssPixel=107, SingleLineComment=108, MultiLineComment=109, 
		WS=110;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NgIfDirective", "NgForDirective", "State", "Action", "Store", "Dispatch", 
			"Select", "RouterLink", "RouterOutlet", "Router", "Navigate", "NgModel", 
			"NgSubmit", "NgClick", "Name", "Id", "Src", "Alt", "Import", "Export", 
			"Abstract", "Interface", "Extends", "Implements", "Console", "Log", "Component", 
			"Service", "Class", "InlineAttributeName", "BackgroundColorAttributeName", 
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
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*ngIf'", "'*ngFor'", "'@State'", "'@Action'", "'store'", "'dispatch'", 
			"'select'", "'routerLink'", "'router-outlet'", "'router'", "'navigate'", 
			"'[(ngModel)]'", "'(ngSubmit)'", "'(click)'", "'name'", "'id'", "'src'", 
			"'alt'", "'import'", "'export'", "'abstract'", "'interface'", "'extends'", 
			"'implements'", "'console'", "'log'", "'@Component'", "'@Injectable'", 
			"'class'", "'inline'", "'backgroundColor'", "'textColor'", "'type'", 
			"'label'", "'value'", "'placeholder'", "'chacked'", "'target'", "'submit'", 
			"'change'", "'click'", "'level'", "'direction'", "'duration'", "'repeat'", 
			"'gap'", "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", 
			"':'", "'?'", "'.'", "'+'", "'-'", "'*'", "'@'", "'/'", "'%'", "'!'", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'=='", "'==='", "'&&'", "'||'", 
			"'{{'", "'}}'", "'let'", "'if'", "'else'", "'while'", "'break'", "'void'", 
			"'continue'", "'function'", "'return'", "'from'", "'null'", "'enum'", 
			"'Array'", "'any'", "'=>'", "'number'", "'string'", "'boolean'", "'this'", 
			"'constructor'", "'private'", "'public'", "'static'", "'protected'", 
			"'new'", null, null, null, "'`'", null, "'px'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NgIfDirective", "NgForDirective", "State", "Action", "Store", 
			"Dispatch", "Select", "RouterLink", "RouterOutlet", "Router", "Navigate", 
			"NgModel", "NgSubmit", "NgClick", "Name", "Id", "Src", "Alt", "Import", 
			"Export", "Abstract", "Interface", "Extends", "Implements", "Console", 
			"Log", "Component", "Service", "Class", "InlineAttributeName", "BackgroundColorAttributeName", 
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


	public AngularLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AngularLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2p\u0384\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3"+
		"*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3"+
		":\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3"+
		"E\3F\3F\3F\3G\3G\3G\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3K\3K\3K\3L\3L\3L\3"+
		"M\3M\3M\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3Q\3R\3R\3"+
		"R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3"+
		"U\3U\3U\3U\3V\3V\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X\3X\3X\3Y\3Y\3"+
		"Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\3Z\3[\3[\3[\3[\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3"+
		"]\3^\3^\3^\3^\3^\3^\3^\3_\3_\3_\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3a\3a\3"+
		"a\3a\3a\3a\3a\3a\3a\3a\3a\3a\3b\3b\3b\3b\3b\3b\3b\3b\3c\3c\3c\3c\3c\3"+
		"c\3c\3d\3d\3d\3d\3d\3d\3d\3e\3e\3e\3e\3e\3e\3e\3e\3e\3e\3f\3f\3f\3f\3"+
		"g\6g\u0330\ng\rg\16g\u0331\3g\3g\6g\u0336\ng\rg\16g\u0337\5g\u033a\ng"+
		"\3h\3h\7h\u033e\nh\fh\16h\u0341\13h\3h\3h\3h\7h\u0346\nh\fh\16h\u0349"+
		"\13h\3h\5h\u034c\nh\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0357\ni\3j\3j\3k\3"+
		"k\7k\u035d\nk\fk\16k\u0360\13k\3l\3l\3l\3m\3m\3m\3m\7m\u0369\nm\fm\16"+
		"m\u036c\13m\3m\3m\3n\3n\3n\3n\7n\u0374\nn\fn\16n\u0377\13n\3n\3n\3n\3"+
		"n\3n\3o\6o\u037f\no\ro\16o\u0380\3o\3o\5\u033f\u0347\u0375\2p\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9"+
		"^\u00bb_\u00bd`\u00bfa\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cd"+
		"h\u00cfi\u00d1j\u00d3k\u00d5l\u00d7m\u00d9n\u00dbo\u00ddp\3\2\7\3\2\62"+
		";\5\2C\\aac|\7\2//\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u038e"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2"+
		"\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd"+
		"\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2"+
		"\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2\2\2\u00db\3\2\2\2\2\u00dd\3\2\2\2\3\u00df"+
		"\3\2\2\2\5\u00e5\3\2\2\2\7\u00ec\3\2\2\2\t\u00f3\3\2\2\2\13\u00fb\3\2"+
		"\2\2\r\u0101\3\2\2\2\17\u010a\3\2\2\2\21\u0111\3\2\2\2\23\u011c\3\2\2"+
		"\2\25\u012a\3\2\2\2\27\u0131\3\2\2\2\31\u013a\3\2\2\2\33\u0146\3\2\2\2"+
		"\35\u0151\3\2\2\2\37\u0159\3\2\2\2!\u015e\3\2\2\2#\u0161\3\2\2\2%\u0165"+
		"\3\2\2\2\'\u0169\3\2\2\2)\u0170\3\2\2\2+\u0177\3\2\2\2-\u0180\3\2\2\2"+
		"/\u018a\3\2\2\2\61\u0192\3\2\2\2\63\u019d\3\2\2\2\65\u01a5\3\2\2\2\67"+
		"\u01a9\3\2\2\29\u01b4\3\2\2\2;\u01c0\3\2\2\2=\u01c6\3\2\2\2?\u01cd\3\2"+
		"\2\2A\u01dd\3\2\2\2C\u01e7\3\2\2\2E\u01ec\3\2\2\2G\u01f2\3\2\2\2I\u01f8"+
		"\3\2\2\2K\u0204\3\2\2\2M\u020c\3\2\2\2O\u0213\3\2\2\2Q\u021a\3\2\2\2S"+
		"\u0221\3\2\2\2U\u0227\3\2\2\2W\u022d\3\2\2\2Y\u0237\3\2\2\2[\u0240\3\2"+
		"\2\2]\u0247\3\2\2\2_\u024b\3\2\2\2a\u024d\3\2\2\2c\u024f\3\2\2\2e\u0251"+
		"\3\2\2\2g\u0253\3\2\2\2i\u0255\3\2\2\2k\u0257\3\2\2\2m\u0259\3\2\2\2o"+
		"\u025b\3\2\2\2q\u025d\3\2\2\2s\u025f\3\2\2\2u\u0261\3\2\2\2w\u0263\3\2"+
		"\2\2y\u0265\3\2\2\2{\u0267\3\2\2\2}\u0269\3\2\2\2\177\u026b\3\2\2\2\u0081"+
		"\u026d\3\2\2\2\u0083\u026f\3\2\2\2\u0085\u0271\3\2\2\2\u0087\u0273\3\2"+
		"\2\2\u0089\u0275\3\2\2\2\u008b\u0278\3\2\2\2\u008d\u027b\3\2\2\2\u008f"+
		"\u027e\3\2\2\2\u0091\u0281\3\2\2\2\u0093\u0285\3\2\2\2\u0095\u0288\3\2"+
		"\2\2\u0097\u028b\3\2\2\2\u0099\u028e\3\2\2\2\u009b\u0291\3\2\2\2\u009d"+
		"\u0295\3\2\2\2\u009f\u0298\3\2\2\2\u00a1\u029d\3\2\2\2\u00a3\u02a3\3\2"+
		"\2\2\u00a5\u02a9\3\2\2\2\u00a7\u02ae\3\2\2\2\u00a9\u02b7\3\2\2\2\u00ab"+
		"\u02c0\3\2\2\2\u00ad\u02c7\3\2\2\2\u00af\u02cc\3\2\2\2\u00b1\u02d1\3\2"+
		"\2\2\u00b3\u02d6\3\2\2\2\u00b5\u02dc\3\2\2\2\u00b7\u02e0\3\2\2\2\u00b9"+
		"\u02e3\3\2\2\2\u00bb\u02ea\3\2\2\2\u00bd\u02f1\3\2\2\2\u00bf\u02f9\3\2"+
		"\2\2\u00c1\u02fe\3\2\2\2\u00c3\u030a\3\2\2\2\u00c5\u0312\3\2\2\2\u00c7"+
		"\u0319\3\2\2\2\u00c9\u0320\3\2\2\2\u00cb\u032a\3\2\2\2\u00cd\u032f\3\2"+
		"\2\2\u00cf\u034b\3\2\2\2\u00d1\u0356\3\2\2\2\u00d3\u0358\3\2\2\2\u00d5"+
		"\u035a\3\2\2\2\u00d7\u0361\3\2\2\2\u00d9\u0364\3\2\2\2\u00db\u036f\3\2"+
		"\2\2\u00dd\u037e\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7p\2\2\u00e1\u00e2"+
		"\7i\2\2\u00e2\u00e3\7K\2\2\u00e3\u00e4\7h\2\2\u00e4\4\3\2\2\2\u00e5\u00e6"+
		"\7,\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7i\2\2\u00e8\u00e9\7H\2\2\u00e9"+
		"\u00ea\7q\2\2\u00ea\u00eb\7t\2\2\u00eb\6\3\2\2\2\u00ec\u00ed\7B\2\2\u00ed"+
		"\u00ee\7U\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7v\2\2"+
		"\u00f1\u00f2\7g\2\2\u00f2\b\3\2\2\2\u00f3\u00f4\7B\2\2\u00f4\u00f5\7C"+
		"\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7k\2\2\u00f8\u00f9"+
		"\7q\2\2\u00f9\u00fa\7p\2\2\u00fa\n\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd"+
		"\7v\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7t\2\2\u00ff\u0100\7g\2\2\u0100"+
		"\f\3\2\2\2\u0101\u0102\7f\2\2\u0102\u0103\7k\2\2\u0103\u0104\7u\2\2\u0104"+
		"\u0105\7r\2\2\u0105\u0106\7c\2\2\u0106\u0107\7v\2\2\u0107\u0108\7e\2\2"+
		"\u0108\u0109\7j\2\2\u0109\16\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7"+
		"g\2\2\u010c\u010d\7n\2\2\u010d\u010e\7g\2\2\u010e\u010f\7e\2\2\u010f\u0110"+
		"\7v\2\2\u0110\20\3\2\2\2\u0111\u0112\7t\2\2\u0112\u0113\7q\2\2\u0113\u0114"+
		"\7w\2\2\u0114\u0115\7v\2\2\u0115\u0116\7g\2\2\u0116\u0117\7t\2\2\u0117"+
		"\u0118\7N\2\2\u0118\u0119\7k\2\2\u0119\u011a\7p\2\2\u011a\u011b\7m\2\2"+
		"\u011b\22\3\2\2\2\u011c\u011d\7t\2\2\u011d\u011e\7q\2\2\u011e\u011f\7"+
		"w\2\2\u011f\u0120\7v\2\2\u0120\u0121\7g\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7/\2\2\u0123\u0124\7q\2\2\u0124\u0125\7w\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\7n\2\2\u0127\u0128\7g\2\2\u0128\u0129\7v\2\2\u0129\24\3\2\2\2\u012a"+
		"\u012b\7t\2\2\u012b\u012c\7q\2\2\u012c\u012d\7w\2\2\u012d\u012e\7v\2\2"+
		"\u012e\u012f\7g\2\2\u012f\u0130\7t\2\2\u0130\26\3\2\2\2\u0131\u0132\7"+
		"p\2\2\u0132\u0133\7c\2\2\u0133\u0134\7x\2\2\u0134\u0135\7k\2\2\u0135\u0136"+
		"\7i\2\2\u0136\u0137\7c\2\2\u0137\u0138\7v\2\2\u0138\u0139\7g\2\2\u0139"+
		"\30\3\2\2\2\u013a\u013b\7]\2\2\u013b\u013c\7*\2\2\u013c\u013d\7p\2\2\u013d"+
		"\u013e\7i\2\2\u013e\u013f\7O\2\2\u013f\u0140\7q\2\2\u0140\u0141\7f\2\2"+
		"\u0141\u0142\7g\2\2\u0142\u0143\7n\2\2\u0143\u0144\7+\2\2\u0144\u0145"+
		"\7_\2\2\u0145\32\3\2\2\2\u0146\u0147\7*\2\2\u0147\u0148\7p\2\2\u0148\u0149"+
		"\7i\2\2\u0149\u014a\7U\2\2\u014a\u014b\7w\2\2\u014b\u014c\7d\2\2\u014c"+
		"\u014d\7o\2\2\u014d\u014e\7k\2\2\u014e\u014f\7v\2\2\u014f\u0150\7+\2\2"+
		"\u0150\34\3\2\2\2\u0151\u0152\7*\2\2\u0152\u0153\7e\2\2\u0153\u0154\7"+
		"n\2\2\u0154\u0155\7k\2\2\u0155\u0156\7e\2\2\u0156\u0157\7m\2\2\u0157\u0158"+
		"\7+\2\2\u0158\36\3\2\2\2\u0159\u015a\7p\2\2\u015a\u015b\7c\2\2\u015b\u015c"+
		"\7o\2\2\u015c\u015d\7g\2\2\u015d \3\2\2\2\u015e\u015f\7k\2\2\u015f\u0160"+
		"\7f\2\2\u0160\"\3\2\2\2\u0161\u0162\7u\2\2\u0162\u0163\7t\2\2\u0163\u0164"+
		"\7e\2\2\u0164$\3\2\2\2\u0165\u0166\7c\2\2\u0166\u0167\7n\2\2\u0167\u0168"+
		"\7v\2\2\u0168&\3\2\2\2\u0169\u016a\7k\2\2\u016a\u016b\7o\2\2\u016b\u016c"+
		"\7r\2\2\u016c\u016d\7q\2\2\u016d\u016e\7t\2\2\u016e\u016f\7v\2\2\u016f"+
		"(\3\2\2\2\u0170\u0171\7g\2\2\u0171\u0172\7z\2\2\u0172\u0173\7r\2\2\u0173"+
		"\u0174\7q\2\2\u0174\u0175\7t\2\2\u0175\u0176\7v\2\2\u0176*\3\2\2\2\u0177"+
		"\u0178\7c\2\2\u0178\u0179\7d\2\2\u0179\u017a\7u\2\2\u017a\u017b\7v\2\2"+
		"\u017b\u017c\7t\2\2\u017c\u017d\7c\2\2\u017d\u017e\7e\2\2\u017e\u017f"+
		"\7v\2\2\u017f,\3\2\2\2\u0180\u0181\7k\2\2\u0181\u0182\7p\2\2\u0182\u0183"+
		"\7v\2\2\u0183\u0184\7g\2\2\u0184\u0185\7t\2\2\u0185\u0186\7h\2\2\u0186"+
		"\u0187\7c\2\2\u0187\u0188\7e\2\2\u0188\u0189\7g\2\2\u0189.\3\2\2\2\u018a"+
		"\u018b\7g\2\2\u018b\u018c\7z\2\2\u018c\u018d\7v\2\2\u018d\u018e\7g\2\2"+
		"\u018e\u018f\7p\2\2\u018f\u0190\7f\2\2\u0190\u0191\7u\2\2\u0191\60\3\2"+
		"\2\2\u0192\u0193\7k\2\2\u0193\u0194\7o\2\2\u0194\u0195\7r\2\2\u0195\u0196"+
		"\7n\2\2\u0196\u0197\7g\2\2\u0197\u0198\7o\2\2\u0198\u0199\7g\2\2\u0199"+
		"\u019a\7p\2\2\u019a\u019b\7v\2\2\u019b\u019c\7u\2\2\u019c\62\3\2\2\2\u019d"+
		"\u019e\7e\2\2\u019e\u019f\7q\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7u\2\2"+
		"\u01a1\u01a2\7q\2\2\u01a2\u01a3\7n\2\2\u01a3\u01a4\7g\2\2\u01a4\64\3\2"+
		"\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7q\2\2\u01a7\u01a8\7i\2\2\u01a8\66"+
		"\3\2\2\2\u01a9\u01aa\7B\2\2\u01aa\u01ab\7E\2\2\u01ab\u01ac\7q\2\2\u01ac"+
		"\u01ad\7o\2\2\u01ad\u01ae\7r\2\2\u01ae\u01af\7q\2\2\u01af\u01b0\7p\2\2"+
		"\u01b0\u01b1\7g\2\2\u01b1\u01b2\7p\2\2\u01b2\u01b3\7v\2\2\u01b38\3\2\2"+
		"\2\u01b4\u01b5\7B\2\2\u01b5\u01b6\7K\2\2\u01b6\u01b7\7p\2\2\u01b7\u01b8"+
		"\7l\2\2\u01b8\u01b9\7g\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7v\2\2\u01bb"+
		"\u01bc\7c\2\2\u01bc\u01bd\7d\2\2\u01bd\u01be\7n\2\2\u01be\u01bf\7g\2\2"+
		"\u01bf:\3\2\2\2\u01c0\u01c1\7e\2\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7c\2"+
		"\2\u01c3\u01c4\7u\2\2\u01c4\u01c5\7u\2\2\u01c5<\3\2\2\2\u01c6\u01c7\7"+
		"k\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9\7n\2\2\u01c9\u01ca\7k\2\2\u01ca\u01cb"+
		"\7p\2\2\u01cb\u01cc\7g\2\2\u01cc>\3\2\2\2\u01cd\u01ce\7d\2\2\u01ce\u01cf"+
		"\7c\2\2\u01cf\u01d0\7e\2\2\u01d0\u01d1\7m\2\2\u01d1\u01d2\7i\2\2\u01d2"+
		"\u01d3\7t\2\2\u01d3\u01d4\7q\2\2\u01d4\u01d5\7w\2\2\u01d5\u01d6\7p\2\2"+
		"\u01d6\u01d7\7f\2\2\u01d7\u01d8\7E\2\2\u01d8\u01d9\7q\2\2\u01d9\u01da"+
		"\7n\2\2\u01da\u01db\7q\2\2\u01db\u01dc\7t\2\2\u01dc@\3\2\2\2\u01dd\u01de"+
		"\7v\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7z\2\2\u01e0\u01e1\7v\2\2\u01e1"+
		"\u01e2\7E\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7n\2\2\u01e4\u01e5\7q\2\2"+
		"\u01e5\u01e6\7t\2\2\u01e6B\3\2\2\2\u01e7\u01e8\7v\2\2\u01e8\u01e9\7{\2"+
		"\2\u01e9\u01ea\7r\2\2\u01ea\u01eb\7g\2\2\u01ebD\3\2\2\2\u01ec\u01ed\7"+
		"n\2\2\u01ed\u01ee\7c\2\2\u01ee\u01ef\7d\2\2\u01ef\u01f0\7g\2\2\u01f0\u01f1"+
		"\7n\2\2\u01f1F\3\2\2\2\u01f2\u01f3\7x\2\2\u01f3\u01f4\7c\2\2\u01f4\u01f5"+
		"\7n\2\2\u01f5\u01f6\7w\2\2\u01f6\u01f7\7g\2\2\u01f7H\3\2\2\2\u01f8\u01f9"+
		"\7r\2\2\u01f9\u01fa\7n\2\2\u01fa\u01fb\7c\2\2\u01fb\u01fc\7e\2\2\u01fc"+
		"\u01fd\7g\2\2\u01fd\u01fe\7j\2\2\u01fe\u01ff\7q\2\2\u01ff\u0200\7n\2\2"+
		"\u0200\u0201\7f\2\2\u0201\u0202\7g\2\2\u0202\u0203\7t\2\2\u0203J\3\2\2"+
		"\2\u0204\u0205\7e\2\2\u0205\u0206\7j\2\2\u0206\u0207\7c\2\2\u0207\u0208"+
		"\7e\2\2\u0208\u0209\7m\2\2\u0209\u020a\7g\2\2\u020a\u020b\7f\2\2\u020b"+
		"L\3\2\2\2\u020c\u020d\7v\2\2\u020d\u020e\7c\2\2\u020e\u020f\7t\2\2\u020f"+
		"\u0210\7i\2\2\u0210\u0211\7g\2\2\u0211\u0212\7v\2\2\u0212N\3\2\2\2\u0213"+
		"\u0214\7u\2\2\u0214\u0215\7w\2\2\u0215\u0216\7d\2\2\u0216\u0217\7o\2\2"+
		"\u0217\u0218\7k\2\2\u0218\u0219\7v\2\2\u0219P\3\2\2\2\u021a\u021b\7e\2"+
		"\2\u021b\u021c\7j\2\2\u021c\u021d\7c\2\2\u021d\u021e\7p\2\2\u021e\u021f"+
		"\7i\2\2\u021f\u0220\7g\2\2\u0220R\3\2\2\2\u0221\u0222\7e\2\2\u0222\u0223"+
		"\7n\2\2\u0223\u0224\7k\2\2\u0224\u0225\7e\2\2\u0225\u0226\7m\2\2\u0226"+
		"T\3\2\2\2\u0227\u0228\7n\2\2\u0228\u0229\7g\2\2\u0229\u022a\7x\2\2\u022a"+
		"\u022b\7g\2\2\u022b\u022c\7n\2\2\u022cV\3\2\2\2\u022d\u022e\7f\2\2\u022e"+
		"\u022f\7k\2\2\u022f\u0230\7t\2\2\u0230\u0231\7g\2\2\u0231\u0232\7e\2\2"+
		"\u0232\u0233\7v\2\2\u0233\u0234\7k\2\2\u0234\u0235\7q\2\2\u0235\u0236"+
		"\7p\2\2\u0236X\3\2\2\2\u0237\u0238\7f\2\2\u0238\u0239\7w\2\2\u0239\u023a"+
		"\7t\2\2\u023a\u023b\7c\2\2\u023b\u023c\7v\2\2\u023c\u023d\7k\2\2\u023d"+
		"\u023e\7q\2\2\u023e\u023f\7p\2\2\u023fZ\3\2\2\2\u0240\u0241\7t\2\2\u0241"+
		"\u0242\7g\2\2\u0242\u0243\7r\2\2\u0243\u0244\7g\2\2\u0244\u0245\7c\2\2"+
		"\u0245\u0246\7v\2\2\u0246\\\3\2\2\2\u0247\u0248\7i\2\2\u0248\u0249\7c"+
		"\2\2\u0249\u024a\7r\2\2\u024a^\3\2\2\2\u024b\u024c\7]\2\2\u024c`\3\2\2"+
		"\2\u024d\u024e\7_\2\2\u024eb\3\2\2\2\u024f\u0250\7*\2\2\u0250d\3\2\2\2"+
		"\u0251\u0252\7+\2\2\u0252f\3\2\2\2\u0253\u0254\7}\2\2\u0254h\3\2\2\2\u0255"+
		"\u0256\7\177\2\2\u0256j\3\2\2\2\u0257\u0258\7=\2\2\u0258l\3\2\2\2\u0259"+
		"\u025a\7.\2\2\u025an\3\2\2\2\u025b\u025c\7?\2\2\u025cp\3\2\2\2\u025d\u025e"+
		"\7<\2\2\u025er\3\2\2\2\u025f\u0260\7A\2\2\u0260t\3\2\2\2\u0261\u0262\7"+
		"\60\2\2\u0262v\3\2\2\2\u0263\u0264\7-\2\2\u0264x\3\2\2\2\u0265\u0266\7"+
		"/\2\2\u0266z\3\2\2\2\u0267\u0268\7,\2\2\u0268|\3\2\2\2\u0269\u026a\7B"+
		"\2\2\u026a~\3\2\2\2\u026b\u026c\7\61\2\2\u026c\u0080\3\2\2\2\u026d\u026e"+
		"\7\'\2\2\u026e\u0082\3\2\2\2\u026f\u0270\7#\2\2\u0270\u0084\3\2\2\2\u0271"+
		"\u0272\7>\2\2\u0272\u0086\3\2\2\2\u0273\u0274\7@\2\2\u0274\u0088\3\2\2"+
		"\2\u0275\u0276\7>\2\2\u0276\u0277\7?\2\2\u0277\u008a\3\2\2\2\u0278\u0279"+
		"\7@\2\2\u0279\u027a\7?\2\2\u027a\u008c\3\2\2\2\u027b\u027c\7#\2\2\u027c"+
		"\u027d\7?\2\2\u027d\u008e\3\2\2\2\u027e\u027f\7?\2\2\u027f\u0280\7?\2"+
		"\2\u0280\u0090\3\2\2\2\u0281\u0282\7?\2\2\u0282\u0283\7?\2\2\u0283\u0284"+
		"\7?\2\2\u0284\u0092\3\2\2\2\u0285\u0286\7(\2\2\u0286\u0287\7(\2\2\u0287"+
		"\u0094\3\2\2\2\u0288\u0289\7~\2\2\u0289\u028a\7~\2\2\u028a\u0096\3\2\2"+
		"\2\u028b\u028c\7}\2\2\u028c\u028d\7}\2\2\u028d\u0098\3\2\2\2\u028e\u028f"+
		"\7\177\2\2\u028f\u0290\7\177\2\2\u0290\u009a\3\2\2\2\u0291\u0292\7n\2"+
		"\2\u0292\u0293\7g\2\2\u0293\u0294\7v\2\2\u0294\u009c\3\2\2\2\u0295\u0296"+
		"\7k\2\2\u0296\u0297\7h\2\2\u0297\u009e\3\2\2\2\u0298\u0299\7g\2\2\u0299"+
		"\u029a\7n\2\2\u029a\u029b\7u\2\2\u029b\u029c\7g\2\2\u029c\u00a0\3\2\2"+
		"\2\u029d\u029e\7y\2\2\u029e\u029f\7j\2\2\u029f\u02a0\7k\2\2\u02a0\u02a1"+
		"\7n\2\2\u02a1\u02a2\7g\2\2\u02a2\u00a2\3\2\2\2\u02a3\u02a4\7d\2\2\u02a4"+
		"\u02a5\7t\2\2\u02a5\u02a6\7g\2\2\u02a6\u02a7\7c\2\2\u02a7\u02a8\7m\2\2"+
		"\u02a8\u00a4\3\2\2\2\u02a9\u02aa\7x\2\2\u02aa\u02ab\7q\2\2\u02ab\u02ac"+
		"\7k\2\2\u02ac\u02ad\7f\2\2\u02ad\u00a6\3\2\2\2\u02ae\u02af\7e\2\2\u02af"+
		"\u02b0\7q\2\2\u02b0\u02b1\7p\2\2\u02b1\u02b2\7v\2\2\u02b2\u02b3\7k\2\2"+
		"\u02b3\u02b4\7p\2\2\u02b4\u02b5\7w\2\2\u02b5\u02b6\7g\2\2\u02b6\u00a8"+
		"\3\2\2\2\u02b7\u02b8\7h\2\2\u02b8\u02b9\7w\2\2\u02b9\u02ba\7p\2\2\u02ba"+
		"\u02bb\7e\2\2\u02bb\u02bc\7v\2\2\u02bc\u02bd\7k\2\2\u02bd\u02be\7q\2\2"+
		"\u02be\u02bf\7p\2\2\u02bf\u00aa\3\2\2\2\u02c0\u02c1\7t\2\2\u02c1\u02c2"+
		"\7g\2\2\u02c2\u02c3\7v\2\2\u02c3\u02c4\7w\2\2\u02c4\u02c5\7t\2\2\u02c5"+
		"\u02c6\7p\2\2\u02c6\u00ac\3\2\2\2\u02c7\u02c8\7h\2\2\u02c8\u02c9\7t\2"+
		"\2\u02c9\u02ca\7q\2\2\u02ca\u02cb\7o\2\2\u02cb\u00ae\3\2\2\2\u02cc\u02cd"+
		"\7p\2\2\u02cd\u02ce\7w\2\2\u02ce\u02cf\7n\2\2\u02cf\u02d0\7n\2\2\u02d0"+
		"\u00b0\3\2\2\2\u02d1\u02d2\7g\2\2\u02d2\u02d3\7p\2\2\u02d3\u02d4\7w\2"+
		"\2\u02d4\u02d5\7o\2\2\u02d5\u00b2\3\2\2\2\u02d6\u02d7\7C\2\2\u02d7\u02d8"+
		"\7t\2\2\u02d8\u02d9\7t\2\2\u02d9\u02da\7c\2\2\u02da\u02db\7{\2\2\u02db"+
		"\u00b4\3\2\2\2\u02dc\u02dd\7c\2\2\u02dd\u02de\7p\2\2\u02de\u02df\7{\2"+
		"\2\u02df\u00b6\3\2\2\2\u02e0\u02e1\7?\2\2\u02e1\u02e2\7@\2\2\u02e2\u00b8"+
		"\3\2\2\2\u02e3\u02e4\7p\2\2\u02e4\u02e5\7w\2\2\u02e5\u02e6\7o\2\2\u02e6"+
		"\u02e7\7d\2\2\u02e7\u02e8\7g\2\2\u02e8\u02e9\7t\2\2\u02e9\u00ba\3\2\2"+
		"\2\u02ea\u02eb\7u\2\2\u02eb\u02ec\7v\2\2\u02ec\u02ed\7t\2\2\u02ed\u02ee"+
		"\7k\2\2\u02ee\u02ef\7p\2\2\u02ef\u02f0\7i\2\2\u02f0\u00bc\3\2\2\2\u02f1"+
		"\u02f2\7d\2\2\u02f2\u02f3\7q\2\2\u02f3\u02f4\7q\2\2\u02f4\u02f5\7n\2\2"+
		"\u02f5\u02f6\7g\2\2\u02f6\u02f7\7c\2\2\u02f7\u02f8\7p\2\2\u02f8\u00be"+
		"\3\2\2\2\u02f9\u02fa\7v\2\2\u02fa\u02fb\7j\2\2\u02fb\u02fc\7k\2\2\u02fc"+
		"\u02fd\7u\2\2\u02fd\u00c0\3\2\2\2\u02fe\u02ff\7e\2\2\u02ff\u0300\7q\2"+
		"\2\u0300\u0301\7p\2\2\u0301\u0302\7u\2\2\u0302\u0303\7v\2\2\u0303\u0304"+
		"\7t\2\2\u0304\u0305\7w\2\2\u0305\u0306\7e\2\2\u0306\u0307\7v\2\2\u0307"+
		"\u0308\7q\2\2\u0308\u0309\7t\2\2\u0309\u00c2\3\2\2\2\u030a\u030b\7r\2"+
		"\2\u030b\u030c\7t\2\2\u030c\u030d\7k\2\2\u030d\u030e\7x\2\2\u030e\u030f"+
		"\7c\2\2\u030f\u0310\7v\2\2\u0310\u0311\7g\2\2\u0311\u00c4\3\2\2\2\u0312"+
		"\u0313\7r\2\2\u0313\u0314\7w\2\2\u0314\u0315\7d\2\2\u0315\u0316\7n\2\2"+
		"\u0316\u0317\7k\2\2\u0317\u0318\7e\2\2\u0318\u00c6\3\2\2\2\u0319\u031a"+
		"\7u\2\2\u031a\u031b\7v\2\2\u031b\u031c\7c\2\2\u031c\u031d\7v\2\2\u031d"+
		"\u031e\7k\2\2\u031e\u031f\7e\2\2\u031f\u00c8\3\2\2\2\u0320\u0321\7r\2"+
		"\2\u0321\u0322\7t\2\2\u0322\u0323\7q\2\2\u0323\u0324\7v\2\2\u0324\u0325"+
		"\7g\2\2\u0325\u0326\7e\2\2\u0326\u0327\7v\2\2\u0327\u0328\7g\2\2\u0328"+
		"\u0329\7f\2\2\u0329\u00ca\3\2\2\2\u032a\u032b\7p\2\2\u032b\u032c\7g\2"+
		"\2\u032c\u032d\7y\2\2\u032d\u00cc\3\2\2\2\u032e\u0330\t\2\2\2\u032f\u032e"+
		"\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u032f\3\2\2\2\u0331\u0332\3\2\2\2\u0332"+
		"\u0339\3\2\2\2\u0333\u0335\7\60\2\2\u0334\u0336\t\2\2\2\u0335\u0334\3"+
		"\2\2\2\u0336\u0337\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033a\3\2\2\2\u0339\u0333\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u00ce\3\2"+
		"\2\2\u033b\u033f\7$\2\2\u033c\u033e\13\2\2\2\u033d\u033c\3\2\2\2\u033e"+
		"\u0341\3\2\2\2\u033f\u0340\3\2\2\2\u033f\u033d\3\2\2\2\u0340\u0342\3\2"+
		"\2\2\u0341\u033f\3\2\2\2\u0342\u034c\7$\2\2\u0343\u0347\7)\2\2\u0344\u0346"+
		"\13\2\2\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0348\3\2\2\2"+
		"\u0347\u0345\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034c"+
		"\7)\2\2\u034b\u033b\3\2\2\2\u034b\u0343\3\2\2\2\u034c\u00d0\3\2\2\2\u034d"+
		"\u034e\7v\2\2\u034e\u034f\7t\2\2\u034f\u0350\7w\2\2\u0350\u0357\7g\2\2"+
		"\u0351\u0352\7h\2\2\u0352\u0353\7c\2\2\u0353\u0354\7n\2\2\u0354\u0355"+
		"\7u\2\2\u0355\u0357\7g\2\2\u0356\u034d\3\2\2\2\u0356\u0351\3\2\2\2\u0357"+
		"\u00d2\3\2\2\2\u0358\u0359\7b\2\2\u0359\u00d4\3\2\2\2\u035a\u035e\t\3"+
		"\2\2\u035b\u035d\t\4\2\2\u035c\u035b\3\2\2\2\u035d\u0360\3\2\2\2\u035e"+
		"\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u00d6\3\2\2\2\u0360\u035e\3\2"+
		"\2\2\u0361\u0362\7r\2\2\u0362\u0363\7z\2\2\u0363\u00d8\3\2\2\2\u0364\u0365"+
		"\7\61\2\2\u0365\u0366\7\61\2\2\u0366\u036a\3\2\2\2\u0367\u0369\n\5\2\2"+
		"\u0368\u0367\3\2\2\2\u0369\u036c\3\2\2\2\u036a\u0368\3\2\2\2\u036a\u036b"+
		"\3\2\2\2\u036b\u036d\3\2\2\2\u036c\u036a\3\2\2\2\u036d\u036e\bm\2\2\u036e"+
		"\u00da\3\2\2\2\u036f\u0370\7\61\2\2\u0370\u0371\7,\2\2\u0371\u0375\3\2"+
		"\2\2\u0372\u0374\13\2\2\2\u0373\u0372\3\2\2\2\u0374\u0377\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0375\u0373\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0375\3\2"+
		"\2\2\u0378\u0379\7,\2\2\u0379\u037a\7\61\2\2\u037a\u037b\3\2\2\2\u037b"+
		"\u037c\bn\2\2\u037c\u00dc\3\2\2\2\u037d\u037f\t\6\2\2\u037e\u037d\3\2"+
		"\2\2\u037f\u0380\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u0383\bo\3\2\u0383\u00de\3\2\2\2\16\2\u0331\u0337"+
		"\u0339\u033f\u0347\u034b\u0356\u035e\u036a\u0375\u0380\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}