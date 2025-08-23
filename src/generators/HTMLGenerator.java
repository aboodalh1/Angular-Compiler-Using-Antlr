package generators;

import nodes.ASTNode;
import nodes.product.ProductNode;
import nodes.product.ProductManagerNode;
import nodes.state.StateNode;
import nodes.state.ActionNode;
import nodes.crud.CRUDNode;
import nodes.navigation.NavigationNode;
import java.util.List;
import java.util.ArrayList;

/**
 * HTMLGenerator generates HTML code from AST nodes
 * Supports product management interfaces with modern UI
 */
public class HTMLGenerator {
    private StringBuilder htmlBuilder;
    private String indentation;
    private int indentLevel;

    public HTMLGenerator() {
        this.htmlBuilder = new StringBuilder();
        this.indentation = "  ";
        this.indentLevel = 0;
    }

    /**
     * Generate complete HTML document
     */
    public String generateHTML(ProductManagerNode productManager) {
        htmlBuilder.setLength(0);
        indentLevel = 0;

        // HTML Document Structure
        addLine("<!DOCTYPE html>");
        addLine("<html lang=\"ar\" dir=\"rtl\">");
        indentLevel++;

        // Head Section
        generateHead();

        // Body Section
        generateBody(productManager);

        indentLevel--;
        addLine("</html>");

        return htmlBuilder.toString();
    }

    /**
     * Generate HTML Head section
     */
    private void generateHead() {
        addLine("<head>");
        indentLevel++;
        addLine("<meta charset=\"UTF-8\">");
        addLine("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        addLine("<title>إدارة المنتجات - Angular Compiler</title>");
        addLine("<link rel=\"stylesheet\" href=\"styles.css\">");
        addLine("<link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\" rel=\"stylesheet\">");
        indentLevel--;
        addLine("</head>");
    }

    /**
     * Generate HTML Body section
     */
    private void generateBody(ProductManagerNode productManager) {
        addLine("<body>");
        indentLevel++;

        // Navigation Header
        generateNavigationHeader();

        // Main Content
        generateMainContent(productManager);

        // Footer
        generateFooter();

        indentLevel--;
        addLine("</body>");

        // JavaScript
        addLine("<script src=\"script.js\"></script>");
    }

    /**
     * Generate Navigation Header
     */
    private void generateNavigationHeader() {
        addLine("<header class=\"header\">");
        indentLevel++;
        addLine("<nav class=\"navbar\">");
        indentLevel++;
        addLine("<div class=\"nav-brand\">");
        indentLevel++;
        addLine("<i class=\"fas fa-shopping-cart\"></i>");
        addLine("<span>إدارة المنتجات</span>");
        indentLevel--;
        addLine("</div>");
        addLine("<ul class=\"nav-menu\">");
        indentLevel++;
        addLine("<li><a href=\"#add-product\" class=\"nav-link\"><i class=\"fas fa-plus\"></i> إضافة منتج</a></li>");
        addLine("<li><a href=\"#products\" class=\"nav-link\"><i class=\"fas fa-list\"></i> عرض المنتجات</a></li>");
        addLine("<li><a href=\"#product-details\" class=\"nav-link\"><i class=\"fas fa-info-circle\"></i> تفاصيل المنتج</a></li>");
        indentLevel--;
        addLine("</ul>");
        indentLevel--;
        addLine("</nav>");
        indentLevel--;
        addLine("</header>");
    }

    /**
     * Generate Main Content
     */
    private void generateMainContent(ProductManagerNode productManager) {
        addLine("<main class=\"main-content\">");
        indentLevel++;

        // Add Product Section
        generateAddProductSection();

        // Products List Section
        generateProductsListSection(productManager);

        // Product Details Section
        generateProductDetailsSection();

        indentLevel--;
        addLine("</main>");
    }

    /**
     * Generate Add Product Section
     */
    private void generateAddProductSection() {
        addLine("<section id=\"add-product\" class=\"section\">");
        indentLevel++;
        addLine("<div class=\"container\">");
        indentLevel++;
        addLine("<h2 class=\"section-title\"><i class=\"fas fa-plus-circle\"></i> إضافة منتج جديد</h2>");
        addLine("<div class=\"form-container\">");
        indentLevel++;
        addLine("<form id=\"addProductForm\" class=\"product-form\">");
        indentLevel++;

        // Basic Information Section
        addLine("<div class=\"form-section\">");
        indentLevel++;
        addLine("<h3 class=\"form-section-title\"><i class=\"fas fa-info-circle\"></i> المعلومات الأساسية</h3>");
        addLine("<div class=\"form-row\">");
        indentLevel++;
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productName", "اسم المنتج *", "text", "أدخل اسم المنتج", true);
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productCategory", "الفئة *", "select", "اختر فئة المنتج", true);
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"form-row\">");
        indentLevel++;
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productPrice", "السعر *", "number", "0.00", true);
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productStock", "الكمية المتوفرة", "number", "0", false);
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Description Section
        addLine("<div class=\"form-section\">");
        indentLevel++;
        addLine("<h3 class=\"form-section-title\"><i class=\"fas fa-align-left\"></i> الوصف والتفاصيل</h3>");
        generateFormField("productDescription", "وصف المنتج *", "textarea", "أدخل وصف مفصل للمنتج", true);
        generateFormField("productFeatures", "المميزات", "textarea", "أدخل مميزات المنتج (اختياري)", false);
        indentLevel--;
        addLine("</div>");

        // Images Section
        addLine("<div class=\"form-section\">");
        indentLevel++;
        addLine("<h3 class=\"form-section-title\"><i class=\"fas fa-images\"></i> صور المنتج</h3>");
        addLine("<div class=\"image-upload-container\">");
        indentLevel++;
        addLine("<div class=\"image-upload-area\" id=\"imageUploadArea\">");
        indentLevel++;
        addLine("<i class=\"fas fa-cloud-upload-alt\"></i>");
        addLine("<p>اسحب الصور هنا أو اضغط للاختيار</p>");
        addLine("<input type=\"file\" id=\"productImages\" name=\"productImages\" multiple accept=\"image/*\" class=\"image-input\">");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"image-preview\" id=\"imagePreview\"></div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Additional Information
        addLine("<div class=\"form-section\">");
        indentLevel++;
        addLine("<h3 class=\"form-section-title\"><i class=\"fas fa-cogs\"></i> معلومات إضافية</h3>");
        addLine("<div class=\"form-row\">");
        indentLevel++;
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productBrand", "العلامة التجارية", "text", "أدخل العلامة التجارية", false);
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productModel", "الموديل", "text", "أدخل موديل المنتج", false);
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"form-row\">");
        indentLevel++;
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productWeight", "الوزن (كجم)", "number", "0.0", false);
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"form-col\">");
        indentLevel++;
        generateFormField("productDimensions", "الأبعاد", "text", "الطول × العرض × الارتفاع", false);
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Submit Buttons
        addLine("<div class=\"form-actions\">");
        indentLevel++;
        addLine("<button type=\"button\" class=\"btn btn-secondary\" onclick=\"resetForm()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-undo\"></i> إعادة تعيين");
        indentLevel--;
        addLine("</button>");
        addLine("<button type=\"submit\" class=\"btn btn-primary\">");
        indentLevel++;
        addLine("<i class=\"fas fa-save\"></i> حفظ المنتج");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");

        indentLevel--;
        addLine("</form>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</section>");
    }

    /**
     * Generate Products List Section
     */
    private void generateProductsListSection(ProductManagerNode productManager) {
        addLine("<section id=\"products\" class=\"section\">");
        indentLevel++;
        addLine("<div class=\"container\">");
        indentLevel++;
        addLine("<h2 class=\"section-title\"><i class=\"fas fa-list\"></i> قائمة المنتجات</h2>");

        // Search and Filter Section
        addLine("<div class=\"products-controls\">");
        indentLevel++;
        addLine("<div class=\"search-filter-container\">");
        indentLevel++;
        addLine("<div class=\"search-box\">");
        indentLevel++;
        addLine("<input type=\"text\" id=\"searchProducts\" class=\"search-input\" placeholder=\"البحث في المنتجات...\">");
        addLine("<i class=\"fas fa-search search-icon\"></i>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"filter-controls\">");
        indentLevel++;
        addLine("<select id=\"categoryFilter\" class=\"filter-select\">");
        indentLevel++;
        addLine("<option value=\"\">جميع الفئات</option>");
        addLine("<option value=\"electronics\">الإلكترونيات</option>");
        addLine("<option value=\"clothing\">الملابس</option>");
        addLine("<option value=\"books\">الكتب</option>");
        addLine("<option value=\"home\">المنزل والحديقة</option>");
        addLine("<option value=\"sports\">الرياضة</option>");
        addLine("<option value=\"automotive\">السيارات</option>");
        addLine("<option value=\"health\">الصحة والجمال</option>");
        indentLevel--;
        addLine("</select>");
        addLine("<select id=\"sortProducts\" class=\"filter-select\">");
        indentLevel++;
        addLine("<option value=\"newest\">الأحدث</option>");
        addLine("<option value=\"oldest\">الأقدم</option>");
        addLine("<option value=\"price-low\">السعر: من الأقل للأعلى</option>");
        addLine("<option value=\"price-high\">السعر: من الأعلى للأقل</option>");
        addLine("<option value=\"name-az\">الاسم: أ-ي</option>");
        addLine("<option value=\"name-za\">الاسم: ي-أ</option>");
        indentLevel--;
        addLine("</select>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"view-controls\">");
        indentLevel++;
        addLine("<button class=\"view-btn active\" data-view=\"grid\" onclick=\"changeView('grid')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-th\"></i>");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"view-btn\" data-view=\"list\" onclick=\"changeView('list')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-list\"></i>");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Products Grid
        addLine("<div class=\"products-grid\" id=\"productsGrid\">");
        indentLevel++;

        // Sample Product Cards (will be populated by JavaScript)
        generateSampleProductCard();

        indentLevel--;
        addLine("</div>");

        // Products List View (hidden by default)
        addLine("<div class=\"products-list\" id=\"productsList\" style=\"display: none;\">");
        indentLevel++;
        addLine("<!-- Products will be populated by JavaScript -->");
        indentLevel--;
        addLine("</div>");

        // No Products Message
        addLine("<div id=\"noProductsMessage\" class=\"no-products-message\" style=\"display: none;\">");
        indentLevel++;
        addLine("<i class=\"fas fa-box-open\"></i>");
        addLine("<p>لا توجد منتجات متاحة</p>");
        addLine("<button class=\"btn btn-primary\" onclick=\"showAddProductForm()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-plus\"></i> إضافة منتج أول");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");

        // Pagination
        addLine("<div class=\"pagination\" id=\"pagination\">");
        indentLevel++;
        addLine("<button class=\"pagination-btn\" onclick=\"previousPage()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-chevron-right\"></i> السابق");
        indentLevel--;
        addLine("</button>");
        addLine("<div class=\"page-numbers\" id=\"pageNumbers\">");
        indentLevel++;
        addLine("<span class=\"page-number active\">1</span>");
        indentLevel--;
        addLine("</div>");
        addLine("<button class=\"pagination-btn\" onclick=\"nextPage()\">");
        indentLevel++;
        addLine("التالي <i class=\"fas fa-chevron-left\"></i>");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");

        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</section>");
    }

    /**
     * Generate Product Details Section
     */
    private void generateProductDetailsSection() {
        addLine("<section id=\"product-details\" class=\"section\">");
        indentLevel++;
        addLine("<div class=\"container\">");
        indentLevel++;
        addLine("<h2 class=\"section-title\"><i class=\"fas fa-info-circle\"></i> تفاصيل المنتج</h2>");
        addLine("<div id=\"productDetailsContent\" class=\"product-details-content\">");
        indentLevel++;
        addLine("<div class=\"product-details-placeholder\">");
        indentLevel++;
        addLine("<i class=\"fas fa-search\"></i>");
        addLine("<p>اختر منتجاً لعرض تفاصيله</p>");
        indentLevel--;
        addLine("</div>");

        // Product Details Template (will be populated by JavaScript)
        addLine("<div class=\"product-details-template\" id=\"productDetailsTemplate\" style=\"display: none;\">");
        indentLevel++;
        addLine("<div class=\"product-details-header\">");
        indentLevel++;
        addLine("<div class=\"product-breadcrumb\">");
        indentLevel++;
        addLine("<a href=\"#products\">المنتجات</a>");
        addLine("<i class=\"fas fa-chevron-left\"></i>");
        addLine("<span id=\"productBreadcrumbName\">اسم المنتج</span>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"product-title-section\">");
        indentLevel++;
        addLine("<h1 id=\"productDetailTitle\">اسم المنتج</h1>");
        addLine("<div class=\"product-meta-info\">");
        indentLevel++;
        addLine("<span class=\"product-category-badge\" id=\"productDetailCategory\">الفئة</span>");
        addLine("<span class=\"product-brand\" id=\"productDetailBrand\">العلامة التجارية</span>");
        addLine("<span class=\"product-model\" id=\"productDetailModel\">الموديل</span>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        addLine("<div class=\"product-details-body\">");
        indentLevel++;
        addLine("<div class=\"product-images-section\">");
        indentLevel++;
        addLine("<div class=\"main-image-container\">");
        indentLevel++;
        addLine("<img id=\"productMainImage\" src=\"placeholder.jpg\" alt=\"صورة المنتج الرئيسية\" class=\"main-product-image\">");
        addLine("<div class=\"image-overlay\">");
        indentLevel++;
        addLine("<button class=\"zoom-btn\" onclick=\"zoomImage()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-search-plus\"></i>");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"thumbnail-images\" id=\"thumbnailImages\">");
        indentLevel++;
        addLine("<!-- Thumbnail images will be populated by JavaScript -->");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        addLine("<div class=\"product-info-section\">");
        indentLevel++;
        addLine("<div class=\"product-price-section\">");
        indentLevel++;
        addLine("<div class=\"current-price\">");
        indentLevel++;
        addLine("<span class=\"price-label\">السعر:</span>");
        addLine("<span class=\"price-value\" id=\"productDetailPrice\">0.00 ريال</span>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"product-availability\">");
        indentLevel++;
        addLine("<span class=\"availability-label\">التوفر:</span>");
        addLine("<span class=\"availability-status\" id=\"productDetailStock\">متوفر</span>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        addLine("<div class=\"product-actions\">");
        indentLevel++;
        addLine("<button class=\"btn btn-primary btn-lg\" onclick=\"addToCart()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-shopping-cart\"></i> إضافة للسلة");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"btn btn-outline btn-lg\" onclick=\"addToWishlist()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-heart\"></i> المفضلة");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"btn btn-outline btn-lg\" onclick=\"shareProduct()\">");
        indentLevel++;
        addLine("<i class=\"fas fa-share\"></i> مشاركة");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Product Tabs
        addLine("<div class=\"product-tabs\">");
        indentLevel++;
        addLine("<div class=\"tabs-header\">");
        indentLevel++;
        addLine("<button class=\"tab-btn active\" data-tab=\"description\" onclick=\"switchTab('description')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-align-left\"></i> الوصف");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"tab-btn\" data-tab=\"specifications\" onclick=\"switchTab('specifications')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-cogs\"></i> المواصفات");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"tab-btn\" data-tab=\"reviews\" onclick=\"switchTab('reviews')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-star\"></i> التقييمات");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"tab-btn\" data-tab=\"related\" onclick=\"switchTab('related')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-link\"></i> منتجات ذات صلة");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");

        addLine("<div class=\"tabs-content\">");
        indentLevel++;
        // Description Tab
        addLine("<div class=\"tab-content active\" id=\"description-tab\">");
        indentLevel++;
        addLine("<div class=\"description-content\">");
        indentLevel++;
        addLine("<h3>وصف المنتج</h3>");
        addLine("<p id=\"productDetailDescription\">وصف المنتج سيظهر هنا...</p>");
        addLine("<div class=\"product-features\" id=\"productDetailFeatures\">");
        indentLevel++;
        addLine("<h4>المميزات الرئيسية</h4>");
        addLine("<ul id=\"featuresList\">");
        indentLevel++;
        addLine("<!-- Features will be populated by JavaScript -->");
        indentLevel--;
        addLine("</ul>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Specifications Tab
        addLine("<div class=\"tab-content\" id=\"specifications-tab\">");
        indentLevel++;
        addLine("<div class=\"specifications-content\">");
        indentLevel++;
        addLine("<h3>المواصفات التقنية</h3>");
        addLine("<div class=\"specs-grid\" id=\"specsGrid\">");
        indentLevel++;
        addLine("<!-- Specifications will be populated by JavaScript -->");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Reviews Tab
        addLine("<div class=\"tab-content\" id=\"reviews-tab\">");
        indentLevel++;
        addLine("<div class=\"reviews-content\">");
        indentLevel++;
        addLine("<h3>تقييمات العملاء</h3>");
        addLine("<div class=\"reviews-summary\">");
        indentLevel++;
        addLine("<div class=\"rating-overview\">");
        indentLevel++;
        addLine("<div class=\"average-rating\">");
        indentLevel++;
        addLine("<span class=\"rating-number\" id=\"averageRating\">0.0</span>");
        addLine("<div class=\"rating-stars\" id=\"ratingStars\">");
        indentLevel++;
        addLine("<!-- Stars will be populated by JavaScript -->");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        addLine("<span class=\"total-reviews\" id=\"totalReviews\">0 تقييم</span>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"reviews-list\" id=\"reviewsList\">");
        indentLevel++;
        addLine("<!-- Reviews will be populated by JavaScript -->");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        // Related Products Tab
        addLine("<div class=\"tab-content\" id=\"related-tab\">");
        indentLevel++;
        addLine("<div class=\"related-content\">");
        indentLevel++;
        addLine("<h3>منتجات ذات صلة</h3>");
        addLine("<div class=\"related-products-grid\" id=\"relatedProductsGrid\">");
        indentLevel++;
        addLine("<!-- Related products will be populated by JavaScript -->");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");

        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</section>");
    }

    /**
     * Generate Sample Product Card
     */
    private void generateSampleProductCard() {
        addLine("<div class=\"product-card sample-card\" style=\"display: none;\">");
        indentLevel++;
        addLine("<div class=\"product-image\">");
        indentLevel++;
        addLine("<img src=\"placeholder.jpg\" alt=\"صورة المنتج\" class=\"product-img\">");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"product-info\">");
        indentLevel++;
        addLine("<h3 class=\"product-name\">اسم المنتج</h3>");
        addLine("<p class=\"product-description\">وصف المنتج</p>");
        addLine("<div class=\"product-meta\">");
        indentLevel++;
        addLine("<span class=\"product-price\">0.00 ريال</span>");
        addLine("<span class=\"product-category\">الفئة</span>");
        indentLevel--;
        addLine("</div>");
        addLine("<div class=\"product-actions\">");
        indentLevel++;
        addLine("<button class=\"btn btn-info btn-sm\" onclick=\"viewProductDetails('1')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-eye\"></i> show");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"btn btn-warning btn-sm\" onclick=\"editProduct('1')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-edit\"></i>edit");
        indentLevel--;
        addLine("</button>");
        addLine("<button class=\"btn btn-danger btn-sm\" onclick=\"deleteProduct('1')\">");
        indentLevel++;
        addLine("<i class=\"fas fa-trash\"></i> delete");
        indentLevel--;
        addLine("</button>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</div>");
    }

    /**
     * Generate Form Field
     */
    private void generateFormField(String id, String label, String type, String placeholder, boolean required) {
        addLine("<div class=\"form-group\">");
        indentLevel++;
        addLine("<label for=\"" + id + "\" class=\"form-label\">" + label + "</label>");

        if ("textarea".equals(type)) {
            addLine("<textarea id=\"" + id + "\" name=\"" + id + "\" class=\"form-control\" placeholder=\""
                    + placeholder + "\"" + (required ? " required" : "") + " rows=\"4\"></textarea>");
        } else if ("select".equals(type)) {
            addLine("<select id=\"" + id + "\" name=\"" + id + "\" class=\"form-control\""
                    + (required ? " required" : "") + ">");
            indentLevel++;
            addLine("<option value=\"\">" + placeholder + "</option>");
            addLine("<option value=\"electronics\">الإلكترونيات</option>");
            addLine("<option value=\"clothing\">الملابس</option>");
            addLine("<option value=\"books\">الكتب</option>");
            addLine("<option value=\"home\">المنزل والحديقة</option>");
            addLine("<option value=\"sports\">الرياضة</option>");
            addLine("<option value=\"automotive\">السيارات</option>");
            addLine("<option value=\"health\">الصحة والجمال</option>");
            addLine("<option value=\"other\">أخرى</option>");
            indentLevel--;
            addLine("</select>");
        } else {
            addLine("<input type=\"" + type + "\" id=\"" + id + "\" name=\"" + id
                    + "\" class=\"form-control\" placeholder=\"" + placeholder + "\"" + (required ? " required" : "")
                    + ">");
        }

        indentLevel--;
        addLine("</div>");
    }

    /**
     * Generate Footer
     */
    private void generateFooter() {
        addLine("<footer class=\"footer\">");
        indentLevel++;
        addLine("<div class=\"container\">");
        indentLevel++;
        addLine("<p>&copy; 2024 إدارة المنتجات - تم التطوير بواسطة Angular Compiler</p>");
        indentLevel--;
        addLine("</div>");
        indentLevel--;
        addLine("</footer>");
    }

    /**
     * Add line with proper indentation
     */
    private void addLine(String line) {
        for (int i = 0; i < indentLevel; i++) {
            htmlBuilder.append(indentation);
        }
        htmlBuilder.append(line).append("\n");
    }

    /**
     * Reset generator for new generation
     */
    public void reset() {
        htmlBuilder.setLength(0);
        indentLevel = 0;
    }

    /**
     * Get current HTML content
     */
    public String getCurrentHTML() {
        return htmlBuilder.toString();
    }
}
