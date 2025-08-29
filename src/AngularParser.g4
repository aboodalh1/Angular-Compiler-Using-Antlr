// AngularTypeScriptParser.g4 For parsing TypeScript/JavaScript subset of Angular components logic.

parser grammar AngularParser;

options {
	tokenVocab = AngularLexer;
}

program: statement* EOF;

statement:
	arrayDeclaration
	| enumDeclaration
	| variableDeclaration
	| functionDeclaration
	| ifStatement
	| whileStatement
	| assignmentStatement
	| breakStatement
	| continueStatement
	| html_element
	| importStatement
	| component
	| exportClass
	| thisVarible
	| classDeclaration
	| abstractClass
	| html
	| consoleLog
	| stateManagement
	| navigation
	| angularTemplate
	| methodCallStatement
	| function_call; // Add support for function calls as statements

// New State Management Rules
stateManagement:
	stateDeclaration
	| actionDeclaration
	| storeOperation;

stateDeclaration:
	State OpenParen CloseParen variableDeclaration
	| State OpenParen StringLiteral CloseParen variableDeclaration;

actionDeclaration:
	Action OpenParen CloseParen functionDeclaration
	| Action OpenParen StringLiteral CloseParen functionDeclaration;

storeOperation: storeDispatch | storeSelect;

storeDispatch:
	Store Dot Dispatch OpenParen actionCall CloseParen SemiColon;

storeSelect:
	Store Dot Select OpenParen StringLiteral CloseParen SemiColon;

actionCall:
	Identifier OpenParen (expression (Comma expression)*)? CloseParen;

// New Navigation Rules
navigation: routerLink | routerOutlet | routerNavigate;

routerLink: RouterLink Assign StringLiteral;

routerOutlet: RouterOutlet;

routerNavigate:
	Router Dot Navigate OpenParen navigationArray CloseParen SemiColon;

navigationArray:
	OpenBracket StringLiteral (Comma StringLiteral)* CloseBracket;

// New Angular Template Rules
angularTemplate: ngModel | ngSubmit | ngClick;

ngModel: OpenBracket NgModel CloseBracket Assign Identifier;

ngSubmit: NgSubmit Assign StringLiteral;

ngClick: NgClick Assign StringLiteral;

// Method Call Statement
methodCallStatement:
	expression Dot Identifier OpenParen (
		expression (Comma expression)*
	)? CloseParen SemiColon;

component: (Service | Component) OpenParen (
		argumentList
		| OpenBrace CloseBrace
	)? CloseParen exportClass;
// Fix component decorator format  // Remove extra braces
exportClass:
	Export classDeclaration
	| Export Identifier SemiColon;
classDeclaration:
	Class Identifier OpenBrace classBody CloseBrace;
classBody: (
		variableDeclaration
		| objectDeclataion
		| arrayDeclaration
		| abstractFunctionDeclaration
		| functionDeclaration
		| statement
	)*;
decorator:
	argumentList?
	| OpenBrace CloseBrace; // Allow empty decorators
argumentList: argument (Comma argument)* Comma?;
argument: Identifier ':' literalValue;
importStatement:
	Import OpenBrace Identifier CloseBrace From StringLiteral SemiColon
	| Import Identifier From StringLiteral SemiColon;
thisVarible:
	This Dot Identifier Assign (
		newInstanceAssignment
		| nestedThisAssignment
		| identifierOrPropertyAssignment
	) SemiColon;
newInstanceAssignment:
	New Identifier OpenParen (expression (Comma expression)*)? CloseParen;
nestedThisAssignment: This (Dot (Identifier | function_call))+;
identifierOrPropertyAssignment: Identifier (Dot Identifier)?;
enumDeclaration:
	Enum Identifier OpenBrace enumValues* CloseBrace SemiColon;
enumValues: (enumValue (Comma enumValue)*);
enumValue: Identifier Assign literalValue;
consoleLog:
	Console Dot Log OpenParen (
		Identifier
		| StringLiteral
		| literalValue
	) CloseParen SemiColon?;
abstractClass: Abstract classDeclaration;
interfaceDeclaration: Interface OpenBrace classBody CloseBrace;
accessModifier: Private | Public | Protected | Static;
variableDeclaration:
	accessModifier? Let_Identify? Identifier Colon (type) Assign (
		expression
		| literalValue
	) SemiColon
	| accessModifier? Let_Identify? Identifier Assign (
		expression
		| literalValue
	) SemiColon
	| accessModifier? Let_Identify? Identifier Colon type SemiColon
	| accessModifier? Identifier Assign (
		expression
		| literalValue
	) SemiColon
	| accessModifier? Identifier SemiColon;
arrayDeclaration:
	Let_Identify? Identifier Colon type OpenBracket CloseBracket Assign OpenBracket (
		literalValue (Comma literalValue)*
	)? CloseBracket SemiColon
	| Identifier Assign OpenBracket literalValue? (
		literalValue Comma?
	)* CloseBracket SemiColon;
abstractFunctionDeclaration:
	Abstract Identifier OpenParen (parameter (Comma parameter)*)? CloseParen Colon (
		type
		| Void
	) SemiColon;
functionDeclaration: (Identifier | Constructor) OpenParen (
		parameter (Comma parameter)*
	)? CloseParen (Colon type)? OpenBrace statement* CloseBrace; // Simplified function declaration
objectDeclataion:
	accessModifier? Identifier Colon Identifier SemiColon
	| accessModifier? Identifier Colon Identifier Assign New Identifier OpenParen (
		literalValue (Comma literalValue)*
	)* CloseParen SemiColon;
type: TypeNumber | TypeString | TypeBoolean | Array | Any;
literalValue:
	NumberLiteral
	| StringLiteral
	| BooleanLiteral
	| listLiteral
	| mapLiteral
	| Null
	| html
	| css;
mapLiteral:
	OpenBrace Identifier Colon literalValue (
		Comma (Identifier Colon literalValue) Comma?
	)* CloseBrace;
listLiteral:
	OpenBracket (Identifier | literalValue)* (
		Comma (Identifier | literalValue)
	)* Comma? CloseBracket;
assignmentStatement:
	Identifier Assign expression (Comma expression)* SemiColon
	| This Dot Identifier Assign expression SemiColon
	| Identifier Assign OpenBracket (
		literalValue (Comma literalValue)*
	)? CloseBracket SemiColon;

ifStatement:
	If OpenParen expression CloseParen block (elseIfStatement)* (
		Else block
	)?;

whileStatement: While OpenParen expression CloseParen block;

elseIfStatement: Else If OpenParen expression CloseParen block;

breakStatement: Break SemiColon;

continueStatement: Continue SemiColon;

block: OpenBrace statement* CloseBrace;

expression:
	expression Multiply expression								# Multiplication
	| expression Divide expression								# Division
	| expression Modulus expression								# Modulus
	| expression Plus expression								# Addition
	| expression Minus expression								# Subtraction
	| expression LessThan expression							# LessThanComparison
	| expression GreaterThan expression							# GreaterThanComparison
	| expression LessThanEquals expression						# LessThanEqualsComparison
	| expression GreaterThanEquals expression					# GreaterThanEqualsComparison
	| expression WeakEqual expression							# WeakEqualsComparison
	| expression StrongEqual expression							# StrongEqualsComparison
	| expression NOT_EQUAL expression							# NotEqualsComparison
	| expression And expression									# LogicalAndExpressionStatement
	| expression Or expression									# LogicalOrExpressionStatement
	| OpenParen expression CloseParen							# ParenthesizedExpression
	| Identifier OpenBracket expression CloseBracket			# BracketExpression
	| AngularExpressionStart expression AngularExpressionEnd	# AngularExpreission
	| expression Dot Identifier OpenParen (
		expression (Comma expression)*
	)? CloseParen # MethodCall
	| This Dot Identifier Dot Identifier OpenParen (
		expression (Comma expression)*
	)? CloseParen # ThisMethodCall
	| expression Dot Identifier OpenParen (
		Identifier Arrow expression
	) CloseParen							# ArrayMethodWithArrowFunction
	| Identifier Arrow expression			# ArrowFunction
	| Identifier Arrow Identifier			# SimpleArrowFunction
	| This Dot Identifier Assign expression	# ThisPropertyAssignment
	| This Dot Identifier					# ThisPropertyAccess
	| Identifier Dot Identifier				# PropertyAccess
	| literalValue							# LiteralExpression
	| Identifier							# IdentifierExpression
	| html									# HtmlExpression;

parameter:
	Identifier Colon type
	| Identifier Colon type Assign literalValue
	| Identifier; // Allow parameters without type annotation

function_call:
	Identifier OpenParen (expression (Comma expression)*)? CloseParen;

html: Backtick html_content Backtick;

html_content: (
		html_element+
		| '{{' expression '}}'
		| NumberLiteral* Identifier NumberLiteral*
	)+;

html_element:
	'<' html_tag_name html_attributes? '>' html_content? '<' '/' html_tag_name '>'
	| '<' html_tag_name html_attributes? '>'
	| '<' html_tag_name html_attributes '/' '>';

html_tag_name: Identifier;

html_attributes: html_attribute*;

html_attribute:
	(
		Identifier
		| ngIfAttribute
		| ngForAttribute
		| onChangeAttribute
		| onClickAttribute
		| '[' (Identifier | (Identifier (access_suffix)*)) ']'
		| '(' (Identifier) ')'
		| '*'
	) ('=' html_attribute_value)?;

access_suffix:
	'.' Identifier
	| '[' expression ']'
	| '.' function_call;

html_attribute_value: literalValue | expression;

css: OpenBracket Backtick css_content* Backtick CloseBracket;

css_content:
	Dot? Identifier (Colon Identifier)* OpenBrace css_class_content* CloseBrace;

css_class_content:
	Identifier Colon (
		Identifier
		| NumberLiteral (CssPixel | '%')?
		| function_call
	)+ (
		Comma (
			Identifier
			| NumberLiteral (CssPixel | '%')?
			| function_call
		)+
	)* SemiColon;

checkedAttribute:
	CheckedAttributeName Assign OpenBrace expression CloseBrace;

onChangeAttribute:
	OpenParen OnChangeAttributeName CloseParen Assign StringLiteral;

onClickAttribute:
	OpenParen OnClickAttributeName CloseParen Assign StringLiteral;

onSubmitAttribute:
	OpenParen OnSubmitAttributeName CloseParen Assign StringLiteral;

gapAttribute:
	GapAttributeName Assign OpenBrace expression CloseBrace;

directionAttribute: DirectionAttributeName Assign StringLiteral;

durationAttribute: DurationAttributeName Assign StringLiteral;

repeatAttribute:
	RepeatAttributeName Assign (NumberLiteral | StringLiteral);

ngForAttribute: NgForDirective Assign expression;

ngIfAttribute: NgIfDirective Assign expression;
