package nodes.product;

import nodes.ASTNode;
import nodes.statement.VariableDeclarationNode;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductNode represents a product entity in the system
 * Example: Product with id, name, price, image, description
 */
public class ProductNode implements ASTNode {
    private String productId;
    private String productName;
    private String price;
    private String imageUrl;
    private String description;
    private List<VariableDeclarationNode> additionalProperties;
    private String scope;

    public ProductNode() {
        this.productId = "";
        this.productName = "";
        this.price = "";
        this.imageUrl = "";
        this.description = "";
        this.additionalProperties = new ArrayList<>();
        this.scope = "Global";
    }

    public ProductNode(String productId, String productName, String price, String imageUrl, String description) {
        this();
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<VariableDeclarationNode> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(List<VariableDeclarationNode> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public void addProperty(VariableDeclarationNode property) {
        this.additionalProperties.add(property);
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductNode{");
        sb.append("productId='").append(productId).append('\'');
        sb.append(", productName='").append(productName).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", additionalProperties=").append(additionalProperties);
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
