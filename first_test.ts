import { Component } from '@angular/core';

interface Product {
    id: number;
    name: string;
    price: number;
    description: string;
}

@Component({
    selector: 'app-root',
    template: `
    <div class="page">
      <h1>Product List</h1>

      <!-- Add Product Form -->
      <div class="add-product-form">
        <h2>Add New Product</h2>
        <form (ngSubmit)="addProduct()" #productForm="ngForm">
          <div class="form-group">
            <label for="productName">Product Name:</label>
            <input 
              type="text" 
              id="productName" 
              name="productName" 
              [(ngModel)]="newProduct.name" 
              required 
              class="form-input"
              placeholder="Enter product name">
          </div>
          
          <div class="form-group">
            <label for="productPrice">Price:</label>
            <input 
              type="number" 
              id="productPrice" 
              name="productPrice" 
              [(ngModel)]="newProduct.price" 
              required 
              step="0.01"
              class="form-input"
              placeholder="Enter price">
          </div>
          
          <div class="form-group">
            <label for="productDescription">Description:</label>
            <textarea 
              id="productDescription" 
              name="productDescription" 
              [(ngModel)]="newProduct.description" 
              required 
              class="form-textarea"
              placeholder="Enter product description"></textarea>
          </div>
          
          <button type="submit" class="add-button" [disabled]="!productForm.valid">
            Add Product
          </button>
        </form>
      </div>

      <!-- Product List -->
      <div class="product-list">
        <div class="product-card" *ngFor="let p of products">
          <h3>{{ p.name }}</h3>
          <p class="description">{{ p.description }}</p>
          <p class="price">${{ p.price | number: '1.2-2' }}</p>
          <button class="remove-button" (click)="removeProduct(p.id)">Remove</button>
        </div>
      </div>
    </div>
  `,
    styles: [
        `
    .page { padding: 20px; max-width: 800px; margin: 0 auto; font-family: Arial, sans-serif; }
    
    .add-product-form {
      background: #f8f9fa;
      padding: 20px;
      border-radius: 8px;
      margin-bottom: 30px;
      border: 1px solid #ddd;
    }
    
    .add-product-form h2 {
      margin: 0 0 20px 0;
      color: #333;
    }
    
    .form-group {
      margin-bottom: 15px;
    }
    
    .form-group label {
      display: block;
      margin-bottom: 5px;
      font-weight: bold;
      color: #555;
    }
    
    .form-input, .form-textarea {
      width: 100%;
      padding: 10px;
      border: 1px solid #ddd;
      border-radius: 4px;
      font-size: 14px;
      box-sizing: border-box;
    }
    
    .form-textarea {
      height: 80px;
      resize: vertical;
    }
    
    .add-button {
      background: #007bff;
      color: white;
      border: none;
      padding: 12px 24px;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
      font-weight: bold;
    }
    
    .add-button:hover:not(:disabled) {
      background: #0056b3;
    }
    
    .add-button:disabled {
      background: #ccc;
      cursor: not-allowed;
    }
    
    .product-list { display: grid; gap: 16px; margin-top: 20px; }
    .product-card { 
      border: 1px solid #ddd; 
      border-radius: 8px; 
      padding: 15px; 
      background: #fff;
      position: relative;
    }
    
    .product-card h3 { margin: 0 0 10px 0; color: #333; }
    .description { margin: 0 0 10px 0; color: #555; }
    .price { 
      font-weight: bold; 
      color: #0d6efd; 
      font-size: 18px;
      margin: 0 0 15px 0;
    }
    
    .remove-button {
      background: #dc3545;
      color: white;
      border: none;
      padding: 8px 16px;
      border-radius: 4px;
      cursor: pointer;
      font-size: 14px;
    }
    
    .remove-button:hover {
      background: #c82333;
    }
  `
    ],
})
export class AppComponent {
    products: Product[] = [
        {
            id: 1,
            name: 'Wireless Headphones',
            price: 99.99,
            description: 'High-quality wireless headphones with noise cancellation',
        },
        {
            id: 2,
            name: 'Cotton T-Shirt',
            price: 24.99,
            description: 'Comfortable 100% cotton t-shirt in various colors',
        },
        {
            id: 3,
            name: 'JavaScript Guide',
            price: 39.99,
            description: 'Complete guide to modern JavaScript development',
        }
    ];

    newProduct: Product = {
        id: 0,
        name: '',
        price: 0,
        description: ''
    };

    private nextId = 4; // Next available ID

    addProduct() {
        if (this.newProduct.name.trim() && this.newProduct.description.trim() && this.newProduct.price > 0) {
            // Create a new product with a unique ID
            const product: Product = {
                id: this.nextId++,
                name: this.newProduct.name.trim(),
                price: this.newProduct.price,
                description: this.newProduct.description.trim()
            };

            // Add the product to the list
            this.products.push(product);

            // Reset the form
            this.newProduct = {
                id: 0,
                name: '',
                price: 0,
                description: ''
            };
        }
    }

    removeProduct(id: number) {
        // Remove the product with the specified ID
        this.products = this.products.filter(p => p.id !== id);
    }
}
