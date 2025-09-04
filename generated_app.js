// Generated JavaScript from Angular Components
'use strict';

// Application namespace
const App = {};

// Products Component
App.ProductsComponent = {
    searchTerm: '',
    selectedCategory: '',
    cartItems: [],
    
    products: [
        {
            id: 1,
            name: 'Wireless Headphones',
            price: 99.99,
            description: 'High-quality wireless headphones with noise cancellation',
            category: 'electronics',
            inStock: true
        },
        {
            id: 2,
            name: 'Cotton T-Shirt',
            price: 24.99,
            description: 'Comfortable 100% cotton t-shirt in various colors',
            category: 'clothing',
            inStock: true
        },
        {
            id: 3,
            name: 'JavaScript Guide',
            price: 39.99,
            description: 'Complete guide to modern JavaScript development',
            category: 'books',
            inStock: false
        }
    ],
    
    init: function() {
        this.render();
        this.bindEvents();
    },
    
    render: function() {
        const productGrid = document.getElementById('productGrid');
        const filteredProducts = this.getFilteredProducts();
        
        productGrid.innerHTML = '';
        
        filteredProducts.forEach(product => {
            const productCard = this.createProductCard(product);
            productGrid.appendChild(productCard);
        });
        
        document.getElementById('noProducts').style.display = 
            filteredProducts.length === 0 ? 'block' : 'none';
        
        this.updateCartSummary();
    },
    
    createProductCard: function(product) {
        const card = document.createElement('div');
        card.className = 'product-card';
        
        card.innerHTML = `
            <h3>${product.name}</h3>
            <p class="description">${product.description}</p>
            <div class="price">$${product.price}</div>
            <button onclick="App.ProductsComponent.addToCart(${product.id})" 
                    ${!product.inStock ? 'disabled' : ''}>
                ${product.inStock ? 'Add to Cart' : 'Out of Stock'}
            </button>
        `;
        
        return card;
    },
    
    getFilteredProducts: function() {
        return this.products.filter(product => {
            const matchesSearch = product.name.toLowerCase().includes(this.searchTerm.toLowerCase()) ||
                                 product.description.toLowerCase().includes(this.searchTerm.toLowerCase());
            const matchesCategory = !this.selectedCategory || product.category === this.selectedCategory;
            return matchesSearch && matchesCategory;
        });
    },
    
    addToCart: function(productId) {
        const product = this.products.find(p => p.id === productId);
        if (product && product.inStock) {
            this.cartItems.push(product);
            this.updateCartSummary();
            console.log(`Added ${product.name} to cart`);
        }
    },
    
    updateCartSummary: function() {
        document.getElementById('cartCount').textContent = this.cartItems.length;
        const total = this.cartItems.reduce((sum, item) => sum + item.price, 0);
        document.getElementById('cartTotal').textContent = total.toFixed(2);
    },
    
    bindEvents: function() {
        const searchInput = document.getElementById('searchTerm');
        const categorySelect = document.getElementById('selectedCategory');
        
        searchInput.addEventListener('input', (e) => {
            this.searchTerm = e.target.value;
            this.render();
        });
        
        categorySelect.addEventListener('change', (e) => {
            this.selectedCategory = e.target.value;
            this.render();
        });
    }
};

// Initialize application
document.addEventListener('DOMContentLoaded', function() {
    App.ProductsComponent.init();
});
