import { Component } from '@angular/core';

@Component({
  selector: 'app-products',
  template: `
    <div class="products-container">
      <h1>Product Catalog</h1>
    </div>
  `,
  styles:[`
  product-container {
    max-width: 1200px;
    padding: 20px;
    background: white;
    border-radius: 8px;
  }
  `]
})
export class ProductsComponent {

}

