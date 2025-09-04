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

      <div class="product-list">
        <div class="product-card" *ngFor="let p of products">
          <h3>{{ p.name }}</h3>
          <p class="description">{{ p.description }}</p>
          
        </div>
      </div>
    </div>
  `,
    styles: [
        `
    .page { padding: 20px; max-width: 800px; margin: 0 auto; font-family: Arial, sans-serif; }
    .product-list { display: grid; gap: 16px; }
    .product-card { border: 1px #ddd; border-radius: 8px; padding: 12px; background: #fff; }
    h3 { margin: 0 0 0 6px; }
    .description { margin: 0 0 0 6px; color: #555; }
    .price { font-weight: bold; color: #0d6efd; }
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
}
