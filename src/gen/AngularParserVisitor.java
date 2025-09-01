// Generated from C:/Users/Abd-LP/Desktop/home/ubuntu/angular_compiler/src/AngularParser.g4 by ANTLR 4.13.2
package gen;
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
	 * Visit a parse tree produced by {@link AngularParser#component}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponent(AngularParser.ComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#decoratorArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecoratorArgs(AngularParser.DecoratorArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(AngularParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#exportClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportClass(AngularParser.ExportClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass(AngularParser.ClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(AngularParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#abstractClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractClass(AngularParser.AbstractClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interface}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface(AngularParser.InterfaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(AngularParser.InterfaceBodyContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#enum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum(AngularParser.EnumContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(AngularParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#thisAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisAssignment(AngularParser.ThisAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#newInstanceAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewInstanceAssignment(AngularParser.NewInstanceAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#nestedThisAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedThisAccess(AngularParser.NestedThisAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#identifierOrPropertyAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierOrPropertyAccess(AngularParser.IdentifierOrPropertyAccessContext ctx);
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
	 * Visit a parse tree produced by {@link AngularParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AngularParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#consoleLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLog(AngularParser.ConsoleLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link AngularParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AngularParser.ExpressionContext ctx);
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
}