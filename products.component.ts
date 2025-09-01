import { Component } from '@angular/core';

interface Product {
  id: number;
  name: string;
  price: number;
  description: string;
  category: string;
  inStock: boolean;
  imageUrl: string;
}

@Component({
  selector: 'app-products',
  template: `
    <div class="products-container">
      <h1>Product Catalog</h1>
      
      <div class="filters">
        <input type="text" [(ngModel)]="searchTerm" placeholder="Search products...">
        <select [(ngModel)]="selectedCategory">
          <option value="">All Categories</option>
          <option value="electronics">Electronics</option>
          <option value="clothing">Clothing</option>
          <option value="books">Books</option>
        </select>
      </div>

      <div class="product-grid">
        <div class="product-card" *ngFor="let product of filteredProducts">
          <img [src]="product.imageUrl" [alt]="product.name">
          <div class="product-info">
            <h3>{{product.name}}</h3>
            <p class="description">{{product.description}}</p>
            <div class="price">${{product.price}}</div>
            <div class="category">{{product.category}}</div>
            <div class="stock-status" [class.in-stock]="product.inStock" [class.out-of-stock]="!product.inStock">
              {{product.inStock ? 'In Stock' : 'Out of Stock'}}
            </div>
            <button (click)="addToCart(product)" [disabled]="!product.inStock">
              Add to Cart
            </button>
          </div>
        </div>
      </div>

      <div *ngIf="filteredProducts.length === 0" class="no-products">
        No products found matching your criteria
      </div>

      <div class="cart-summary">
        <h3>Cart Summary</h3>
        <p>Items in cart{{cartItems.length}}</p>
        <p>Total ${{cartTotal}}</p>
      </div>
    </div>
  `,
  styles: [`
    .products-container {
      max-width: 1200px;
      margin: 0 auto;
      padding: 20px;
    }

    .filters {
      display: flex;
      gap: 15px;
      margin-bottom: 30px;
    }

    .filters input, .filters select {
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 5px;
      font-size: 16px;
    }

    .product-grid {
      display: grid;
      grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
      gap: 20px;
      margin-bottom: 30px;
    }

    .product-card {
      border: 1px solid #ddd;
      border-radius: 8px;
      padding: 15px;
      background: white;
      box-shadow: 0 2px 4px rgba(0,0,0,0.1);
      transition: transform 0.2s;
    }

    .product-card:hover {
      transform: translateY(-2px);
      box-shadow: 0 4px 8px rgba(0,0,0,0.15);
    }

    .product-card img {
      width: 100%;
      height: 200px;
      object-fit: cover;
      border-radius: 5px;
      margin-bottom: 10px;
    }

    .product-info h3 {
      margin: 0 0 10px 0;
      color: #333;
    }

    .description {
      color: #666;
      margin-bottom: 10px;
      line-height: 1.4;
    }

    .price {
      font-size: 18px;
      font-weight: bold;
      color: #007bff;
      margin-bottom: 5px;
    }

    .category {
      background: #f8f9fa;
      padding: 4px 8px;
      border-radius: 4px;
      font-size: 12px;
      color: #666;
      display: inline-block;
      margin-bottom: 10px;
    }

    .stock-status {
      padding: 4px 8px;
      border-radius: 4px;
      font-size: 12px;
      font-weight: bold;
      margin-bottom: 10px;
    }

    .in-stock {
      background: #d4edda;
      color: #155724;
    }

    .out-of-stock {
      background: #f8d7da;
      color: #721c24;
    }

    button {
      background: #007bff;
      color: white;
      border: none;
      padding: 10px 15px;
      border-radius: 5px;
      cursor: pointer;
      font-size: 14px;
      transition: background 0.2s;
    }

    button:hover:not(:disabled) {
      background: #0056b3;
    }

    button:disabled {
      background: #ccc;
      cursor: not-allowed;
    }

    .no-products {
      text-align: center;
      padding: 40px;
      color: #666;
      font-size: 18px;
    }

    .cart-summary {
      background: #f8f9fa;
      padding: 20px;
      border-radius: 8px;
      border: 1px solid #ddd;
    }

    .cart-summary h3 {
      margin-top: 0;
      color: #333;
    }
  `]
})
export class ProductsComponent {
  searchTerm: string = '';
  selectedCategory: string = '';
  cartItems: Product[] = [];

  products: Product[] = [
    {
      id: 1,
      name: 'Wireless Headphones',
      price: 99.99,
      description: 'High-quality wireless headphones with noise cancellation',
      category: 'electronics',
      inStock: true,
      imageUrl: 'https://example.com/headphones.jpg'
    },
    {
      id: 2,
      name: 'Cotton T-Shirt',
      price: 24.99,
      description: 'Comfortable 100% cotton t-shirt in various colors',
      category: 'clothing',
      inStock: true,
      imageUrl: 'https://example.com/tshirt.jpg'
    },
    {
      id: 3,
      name: 'JavaScript Guide',
      price: 39.99,
      description: 'Complete guide to modern JavaScript development',
      category: 'books',
      inStock: false,
      imageUrl: 'https://example.com/jsbook.jpg'
    },
    {
      id: 4,
      name: 'Smartphone',
      price: 699.99,
      description: 'Latest smartphone with advanced camera features',
      category: 'electronics',
      inStock: true,
      imageUrl: 'https://example.com/phone.jpg'
    },
    {
      id: 5,
      name: 'Denim Jeans',
      price: 79.99,
      description: 'Classic fit denim jeans in dark wash',
      category: 'clothing',
      inStock: true,
      imageUrl: 'https://example.com/jeans.jpg'
    }
  ];

  get filteredProducts(): Product[] {
    return this.products.filter(product => {
      const matchesSearch = product.name.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
                           product.description.toLowerCase().includes(this.searchTerm.toLowerCase());
      const matchesCategory = !this.selectedCategory || product.category === this.selectedCategory;
      return matchesSearch && matchesCategory;
    });
  }

  get cartTotal(): number {
    return this.cartItems.reduce((total, item) => total + item.price, 0);
  }

  addToCart(product: Product): void {
    if (product.inStock) {
      this.cartItems.push(product);
      console.log(`Added ${product.name} to cart`);
    }
  }

  removeFromCart(productId: number): void {
    const index = this.cartItems.findIndex(item => item.id === productId);
    if (index > -1) {
      this.cartItems.splice(index, 1);
    }
  }

  clearCart(): void {
    this.cartItems = [];
  }
}

