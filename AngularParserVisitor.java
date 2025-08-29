// Generated from src/AngularParser.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AngularParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AngularParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AngularParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AngularParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AngularParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stateManagement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateManagement(AngularParser.StateManagementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#stateDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateDeclaration(AngularParser.StateDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#actionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionDeclaration(AngularParser.ActionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#storeOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreOperation(AngularParser.StoreOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#storeDispatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreDispatch(AngularParser.StoreDispatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#storeSelect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStoreSelect(AngularParser.StoreSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#actionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionCall(AngularParser.ActionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#navigation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigation(AngularParser.NavigationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerLink}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterLink(AngularParser.RouterLinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerOutlet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterOutlet(AngularParser.RouterOutletContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#routerNavigate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRouterNavigate(AngularParser.RouterNavigateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#navigationArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationArray(AngularParser.NavigationArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#angularTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularTemplate(AngularParser.AngularTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngModel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgModel(AngularParser.NgModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngSubmit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgSubmit(AngularParser.NgSubmitContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgClick(AngularParser.NgClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#methodCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallStatement(AngularParser.MethodCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(AngularParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(AngularParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentList(AngularParser.ArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#thisVarible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisVarible(AngularParser.ThisVaribleContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#newInstanceAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#nestedThisAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedThisAssignment(AngularParser.NestedThisAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifierOrPropertyAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrPropertyAssignment(AngularParser.IdentifierOrPropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(AngularParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValues(AngularParser.EnumValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(AngularParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#abstractClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractClass(AngularParser.AbstractClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(AngularParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#accessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessModifier(AngularParser.AccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(AngularParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#arrayDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclaration(AngularParser.ArrayDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#abstractFunctionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractFunctionDeclaration(AngularParser.AbstractFunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(AngularParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#objectDeclataion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectDeclataion(AngularParser.ObjectDeclataionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(AngularParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#literalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralValue(AngularParser.LiteralValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#mapLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapLiteral(AngularParser.MapLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#listLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListLiteral(AngularParser.ListLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AngularParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AngularParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#elseIfStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIfStatement(AngularParser.ElseIfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#breakStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(AngularParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#continueStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(AngularParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AngularParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dd}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDd(AngularParser.DdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualsComparison(AngularParser.NotEqualsComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalOrExpressionStatement}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpressionStatement(AngularParser.LogicalOrExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(AngularParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrongEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrongEqualsComparison(AngularParser.StrongEqualsComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqualsComparison(AngularParser.GreaterThanEqualsComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThanComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanComparison(AngularParser.GreaterThanComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MethodCall}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(AngularParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(AngularParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleArrowFunction}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleArrowFunction(AngularParser.SimpleArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanComparison(AngularParser.LessThanComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(AngularParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(AngularParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpression(AngularParser.LiteralExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrowFunction}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowFunction(AngularParser.ArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AngularExpreission}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngularExpreission(AngularParser.AngularExpreissionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisPropertyAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPropertyAccess(AngularParser.ThisPropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PropertyAccess}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyAccess(AngularParser.PropertyAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(AngularParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExpression}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpression(AngularParser.BracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisMethodCall}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisMethodCall(AngularParser.ThisMethodCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayMethodWithArrowFunction}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayMethodWithArrowFunction(AngularParser.ArrayMethodWithArrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(AngularParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Modulus}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulus(AngularParser.ModulusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ThisPropertyAssignment}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisPropertyAssignment(AngularParser.ThisPropertyAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WeakEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeakEqualsComparison(AngularParser.WeakEqualsComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LogicalAndExpressionStatement}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpressionStatement(AngularParser.LogicalAndExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThanEqualsComparison}
	 * labeled alternative in {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqualsComparison(AngularParser.LessThanEqualsComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AngularParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AngularParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(AngularParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_content(AngularParser.Html_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_element(AngularParser.Html_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html_tag_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_tag_name(AngularParser.Html_tag_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_attributes(AngularParser.Html_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_attribute(AngularParser.Html_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#access_suffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_suffix(AngularParser.Access_suffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#html_attribute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml_attribute_value(AngularParser.Html_attribute_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(AngularParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#css_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_content(AngularParser.Css_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#css_class_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss_class_content(AngularParser.Css_class_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#checkedAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckedAttribute(AngularParser.CheckedAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#onChangeAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnChangeAttribute(AngularParser.OnChangeAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#onClickAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClickAttribute(AngularParser.OnClickAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#onSubmitAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnSubmitAttribute(AngularParser.OnSubmitAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#gapAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGapAttribute(AngularParser.GapAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#directionAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectionAttribute(AngularParser.DirectionAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#durationAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDurationAttribute(AngularParser.DurationAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#repeatAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatAttribute(AngularParser.RepeatAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngForAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgForAttribute(AngularParser.NgForAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#ngIfAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNgIfAttribute(AngularParser.NgIfAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateString(AngularParser.TemplateStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContent(AngularParser.TemplateContentContext ctx);
}