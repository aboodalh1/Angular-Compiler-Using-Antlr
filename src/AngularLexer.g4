lexer grammar AngularLexer;

// Existing Angular Directives
NgIfDirective: '*ngIf';
NgForDirective: '*ngFor';

// New State Management Keywords
State: '@State';
Action: '@Action';
Store: 'store';
Dispatch: 'dispatch';
Select: 'select';

// New Navigation Keywords
RouterLink: 'routerLink';
RouterOutlet: 'router-outlet';
Router: 'router';
Navigate: 'navigate';

// New Angular Template Keywords
NgModel: '[(ngModel)]';
NgSubmit: '(ngSubmit)';
NgClick: '(click)';

// Service decorator
Injectable: '@Injectable';

// New HTML Attributes
Name: 'name';
Id: 'id';
Src: 'src';
Alt: 'alt';

// Existing Keywords
Import: 'import';
Export: 'export';
Abstract: 'abstract';
Interface: 'interface';
Extends: 'extends';
Implements: 'implements';
Console: 'console';
Log: 'log';
Component: '@Component';
Service: '@Injectable';
Class: 'class';
InlineAttributeName: 'inline';
BackgroundColorAttributeName: 'backgroundColor';
TextColorAttributeName: 'textColor';
TypeAttributeName: 'type';
LabelAttributeName: 'label';
ValueAttributeName: 'value';
PlaceHolderAttributeName: 'placeholder';
CheckedAttributeName: 'chacked';
TargetAttributeName: 'target';
OnSubmitAttributeName: 'submit';
OnChangeAttributeName: 'change';
OnClickAttributeName: 'click';
HeadingLevelAttributeName: 'level';
DirectionAttributeName: 'direction';
DurationAttributeName: 'duration';
RepeatAttributeName: 'repeat';
GapAttributeName: 'gap';

// Punctuation
OpenBracket: '[';
CloseBracket: ']';
OpenParen: '(';
CloseParen: ')';
OpenBrace: '{';
CloseBrace: '}';
SemiColon: ';';
Comma: ',';
Assign: '=';
Colon: ':';
QuestionMark: '?';
Dot: '.';
Plus: '+';
Minus: '-';
Multiply: '*';
At: '@';
Divide: '/';
Modulus: '%';
Not: '!';
LessThan: '<';
GreaterThan: '>';
LessThanEquals: '<=';
GreaterThanEquals: '>=';
NOT_EQUAL: '!=';
WeakEqual: '==';
StrongEqual: '===';
And: '&&';
Or: '||';

// Angular Expressions
AngularExpressionStart: '{{';
AngularExpressionEnd: '}}';

// Control Flow
Let_Identify: 'let';
If: 'if';
Else: 'else';
While: 'while';
Break: 'break';
Void: 'void';
Continue: 'continue';
Function: 'function';
Return: 'return';
From: 'from';
Null: 'null';
Enum: 'enum';
Array: 'Array';
Any: 'any';

// Arrow Function Support
Arrow: '=>';

// Types
TypeNumber: 'number';
TypeString: 'string';
TypeBoolean: 'boolean';

// Keywords
This: 'this';
Constructor: 'constructor';
Private: 'private';
Public: 'public';
Static: 'static';
Protected: 'protected';
New: 'new';

// Literals
NumberLiteral: [0-9]+ ('.' [0-9]+)?;
StringLiteral: '"' .*? '"' | ('\'' .*? '\'');
BooleanLiteral: 'true' | 'false';
Backtick: '`';

// Identifiers
Identifier: [a-zA-Z_][a-zA-Z0-9_-]*;
CssPixel: 'px';

// Comments
SingleLineComment: '//' ~[\r\n]* -> channel(HIDDEN);
MultiLineComment: '/*' .*? '*/' -> channel(HIDDEN);

// Whitespace
WS: [ \t\r\n]+ -> skip;
