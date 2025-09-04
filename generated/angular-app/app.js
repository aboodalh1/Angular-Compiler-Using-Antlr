// Generated JavaScript from Angular-like AST
'use strict';

class AppComponent {
  constructor() {
    // Component properties are initialized here
  }
  
  render() {
    const container = document.querySelector('app-root');
    if (container) {
      container.innerHTML = `<div id="id-3350408e" name="class" class=""page""><h1 id="id-e91368df">{{Product}}{{List}}</h1><div id="id-db95ff70" name="class" class=""product-list""><!-- *ngFor loop placeholder --></div></div>`;
      this.bindEvents();
    }
  }
  
  bindEvents() {
  }
}

document.addEventListener('DOMContentLoaded', () => {
  const app = new AppComponent();
  app.render();
});


