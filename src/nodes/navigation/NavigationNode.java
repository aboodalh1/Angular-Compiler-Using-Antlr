package nodes.navigation;

import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

/**
 * NavigationNode represents navigation operations in Angular
 * Examples: routerLink, router-outlet, router.navigate()
 */
public class NavigationNode implements ASTNode {
    private String navigationType; // "routerLink", "router-outlet", "navigate"
    private String targetRoute;
    private List<String> parameters;
    private String scope;
    private String componentName;

    public NavigationNode() {
        this.parameters = new ArrayList<>();
        this.scope = "Global";
    }

    public NavigationNode(String navigationType, String targetRoute) {
        this();
        this.navigationType = navigationType;
        this.targetRoute = targetRoute;
    }

    // Getters and Setters
    public String getNavigationType() {
        return navigationType;
    }

    public void setNavigationType(String navigationType) {
        this.navigationType = navigationType;
    }

    public String getTargetRoute() {
        return targetRoute;
    }

    public void setTargetRoute(String targetRoute) {
        this.targetRoute = targetRoute;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public void addParameter(String parameter) {
        this.parameters.add(parameter);
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavigationNode{");
        sb.append("navigationType='").append(navigationType).append('\'');
        sb.append(", targetRoute='").append(targetRoute).append('\'');
        sb.append(", parameters=").append(parameters);
        sb.append(", scope='").append(scope).append('\'');
        sb.append(", componentName='").append(componentName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
