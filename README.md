# Screensaver w/JavaFX Documentation Project

## 1. Introduction 
  This project is an application of the JavaFX class to make a Classical DvD screensaver:
  
  ![DvD Screensaver](https://github.com/KauanIzidoro/Screensaver_k/blob/main/dvd.gif)
  
## 2. Basic structure
  This structure is responsible for organizing the visual elements on the screen, note that a tree topology is used

  ```mermaid
graph TD;
    A[Stage - Native Screen];
    A --> B[Scene];
    B --> C[root Node];
    C --> D[Leaf Node ...];
    C --> E[Leaf Node I];
    C --> F[Branch Node];
    F --> G[Leaf branch.Node I];
    F --> H[Leaf branch.Node ...];
   

  
  
  
  


