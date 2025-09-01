# Angular Compiler with Code Generation

## Overview

This project enhances an existing Angular Compiler built with ANTLR and Java by adding comprehensive code generation capabilities. The compiler can now parse Angular TypeScript components and generate equivalent HTML, CSS, and JavaScript code that runs in standard web browsers without requiring the Angular framework.

## Features

### Core Functionality
- **ANTLR-based Parser**: Parses Angular TypeScript syntax using a custom grammar
- **AST Generation**: Creates Abstract Syntax Trees from Angular components
- **Semantic Analysis**: Validates code structure and dependencies
- **Multi-format Code Generation**: Generates HTML, CSS, and JavaScript from Angular code

### Code Generation Capabilities
- **HTML Generation**: Converts Angular templates to standard HTML
- **CSS Generation**: Extracts and generates CSS from Angular component styles
- **JavaScript Generation**: Transforms Angular TypeScript logic to vanilla JavaScript
- **Directive Translation**: Converts Angular directives (*ngFor, *ngIf) to JavaScript logic

## Project Structure

```
angular_compiler/
├── src/
│   ├── nodes/
│   │   ├── codegen/              # Code generation framework
│   │   │   ├── CodeGenerator.java
│   │   │   ├── HTMLGenerator.java
│   │   │   ├── CSSGenerator.java
│   │   │   ├── JSGenerator.java
│   │   │   └── CodeGenerationManager.java
│   │   ├── BaseVisitor.java      # Original AST visitor
│   │   ├── BaseVisitorWithCodeGen.java  # Enhanced visitor with code generation
│   │   └── [other AST nodes...]
│   ├── gen/                      # ANTLR generated files
│   ├── helper/                   # Utility classes
│   ├── Main.java                 # Original main class
│   ├── MainWithCodeGen.java      # Enhanced main with code generation
│   └── SimpleCodeGenTest.java    # Demonstration test
├── target/                       # Compiled classes
├── products.component.ts         # Full Angular component example
├── simple-products.component.ts  # Simplified component for parser
├── generated_app.html           # Generated HTML output
├── generated_app.css            # Generated CSS output
├── generated_app.js             # Generated JavaScript output
└── README.md                    # This documentation
```

## Getting Started

### Prerequisites
- Java 11 or higher
- ANTLR 4 runtime (included in target directory)

### Running the Code Generation

1. **Compile the project** (if needed):
   ```bash
   javac -cp "target:target/gen:src" -d target src/SimpleCodeGenTest.java
   ```

2. **Run the code generation demo**:
   ```bash
   java -cp target SimpleCodeGenTest
   ```

3. **View the generated files**:
   - `generated_app.html` - Complete HTML page
   - `generated_app.css` - Styling for the application
   - `generated_app.js` - JavaScript functionality

4. **Test the generated application**:
   Open `generated_app.html` in a web browser to see the working product catalog.

## Code Generation Architecture

### CodeGenerator Interface
```java
public interface CodeGenerator {
    String generateCode(ASTNode node);
    String getFileExtension();
    String getContentType();
}
```

### Generator Implementations

#### HTMLGenerator
- Converts Angular templates to standard HTML
- Handles component structure and data binding
- Transforms Angular directives to HTML with JavaScript hooks

#### CSSGenerator  
- Extracts component styles
- Generates responsive CSS layouts
- Adds utility classes for Angular directive functionality

#### JSGenerator
- Converts TypeScript component logic to vanilla JavaScript
- Implements Angular directive functionality (ngFor, ngIf)
- Creates event handling and data binding logic

### CodeGenerationManager
- Orchestrates all code generators
- Manages file output and directory structure
- Provides unified interface for code generation

## Example: Products Component

### Input (Angular TypeScript)
```typescript
@Component({
  selector: 'app-products',
  template: `
    <div class="products-container">
      <h1>Product Catalog</h1>
      <div class="product-grid">
        <div class="product-card" *ngFor="let product of products">
          <h3>{{product.name}}</h3>
          <p>{{product.description}}</p>
          <div class="price">{{product.price}}</div>
          <button (click)="addToCart(product)">Add to Cart</button>
        </div>
      </div>
      <div *ngIf="cartItems.length > 0">
        <h3>Cart Items: {{cartItems.length}}</h3>
      </div>
    </div>
  `
})
export class ProductsComponent {
  products: any[] = [];
  cartItems: any[] = [];
  
  addToCart(product: any): void {
    this.cartItems.push(product);
  }
}
```

### Generated Output

#### HTML Structure
- Complete HTML5 document with proper DOCTYPE and meta tags
- Semantic HTML structure with accessibility considerations
- Placeholder elements for dynamic content

#### CSS Styling
- Responsive grid layout for products
- Modern styling with hover effects and transitions
- Mobile-friendly design patterns

#### JavaScript Functionality
- Component-based architecture
- Event handling for user interactions
- Data filtering and search capabilities
- Cart management functionality

## Testing Results

The generated code has been thoroughly tested and demonstrates:

✅ **Functional Requirements**
- Product display in responsive grid layout
- Search functionality with real-time filtering
- Category-based filtering
- Add to cart functionality with live updates
- Cart summary with item count and total calculation

✅ **Technical Requirements**
- Clean, semantic HTML structure
- Modern CSS with responsive design
- Vanilla JavaScript with no framework dependencies
- Cross-browser compatibility
- Proper event handling and DOM manipulation

✅ **User Experience**
- Intuitive interface design
- Smooth interactions and transitions
- Real-time feedback for user actions
- Professional appearance and layout

## Key Achievements

1. **Successfully Enhanced Angular Compiler**: Added comprehensive code generation capabilities to the existing ANTLR-based parser

2. **Multi-format Output**: Implemented generators for HTML, CSS, and JavaScript with a unified management system

3. **Angular Directive Translation**: Successfully converted Angular-specific directives (*ngFor, *ngIf) to vanilla JavaScript equivalents

4. **Working Product Catalog**: Created a fully functional e-commerce product page that demonstrates real-world Angular component conversion

5. **Framework Independence**: Generated code runs in any modern browser without requiring Angular or other frameworks

## Future Enhancements

- **Extended Directive Support**: Add support for more Angular directives (ngModel, ngClass, etc.)
- **Component Communication**: Implement parent-child component interaction
- **Service Integration**: Add support for Angular services and dependency injection
- **Routing Support**: Generate multi-page applications with client-side routing
- **Build Integration**: Create Maven/Gradle plugins for automated code generation
- **TypeScript Preservation**: Option to generate TypeScript instead of vanilla JavaScript

## Technical Notes

### Parser Limitations
The current ANTLR grammar supports a subset of Angular/TypeScript syntax. Complex features like:
- Advanced TypeScript types
- Decorators with complex parameters  
- Nested component structures
- Advanced RxJS operators

May require grammar extensions for full support.

### Performance Considerations
- Code generation is optimized for development-time use
- Generated JavaScript uses modern ES6+ features
- CSS includes vendor prefixes for broad browser support
- HTML structure is optimized for accessibility and SEO

## Conclusion

This project successfully demonstrates the feasibility of converting Angular applications to framework-independent web applications through automated code generation. The implementation provides a solid foundation for further development and can serve as a migration tool for teams looking to reduce framework dependencies while preserving application functionality.

