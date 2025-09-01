import { Component } from '@angular/core';

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
  products: any[];
  cartItems: any[];
  
  constructor() {
    this.products = [];
    this.cartItems = [];
  }
  
  addToCart(product: any): void {
    this.cartItems.push(product);
  }
  
  getCartTotal(): number {
    return this.cartItems.length;
  }
}

