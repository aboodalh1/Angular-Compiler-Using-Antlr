// Generated JavaScript from Angular Components
'use strict';

// Application namespace
const App = {};

// Initialize application
document.addEventListener('DOMContentLoaded', function() {
  App.init();
});

// Utility functions
App.utils = {
  getElementById: function(id) {
    return document.getElementById(id);
  },
  
  querySelector: function(selector) {
    return document.querySelector(selector);
  },
  
  querySelectorAll: function(selector) {
    return document.querySelectorAll(selector);
  },
  
  addClass: function(element, className) {
    if (element && element.classList) {
      element.classList.add(className);
    }
  },
  
  removeClass: function(element, className) {
    if (element && element.classList) {
      element.classList.remove(className);
    }
  }
};

App.init = function() {
  console.log('Initializing Angular App...');
  // Initialize all components
  for (let componentName in App) {
    if (App[componentName] && typeof App[componentName].init === 'function') {
      App[componentName].init();
    }
  }
};
