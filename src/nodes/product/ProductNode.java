package nodes.product;

import nodes.ASTNode;
import java.util.ArrayList;
import java.util.List;

/**
 * ProductNode represents a product entity in the application
 * Contains product properties like id, name, price, image, etc.
 */
public class ProductNode implements ASTNode {
    private String productId;
    private String name;
    private String description;
    private Double price;
    private String imageUrl;
    private String category;
    private List<String> tags;
    private Boolean inStock;
    private String scope;

    public ProductNode() {
        this.tags = new ArrayList<>();
        this.scope = "Global";
        this.inStock = true;
    }

    public ProductNode(String productId, String name, Double price) {
        this();
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void addTag(String tag) {
        this.tags.add(tag);
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
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
        sb.append(", name='").append(name).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", price=").append(price);
        sb.append(", imageUrl='").append(imageUrl).append('\'');
        sb.append(", category='").append(category).append('\'');
        sb.append(", tags=").append(tags);
        sb.append(", inStock=").append(inStock);
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
