# Screensaver w/JavaFX Documentation Project

## 1. Introduction 
  This project is an application of the JavaFX class to make a Classical DvD screensaver:
  
  ![DvD Screensaver](https://github.com/KauanIzidoro/Screensaver_k/blob/main/dvd.gif)
  
## 2. Basic structure
  This structure is responsible for organizing the visual elements on the screen, note that a tree topology is used

  ```mermaid
flowchart TD
    subgraph "JavaFX Application"
        PrimaryStage["PrimaryStage"]
        note1["O PrimaryStage é a janela principal do aplicativo"]
        Scene["Scene"]
        note2["A Scene contém todos os elementos gráficos"]
        Pane["Pane"]
        note3["O Pane é um nó no gráfico de cenas que pode conter outros nós"]
        
        PrimaryStage --> Scene
        Scene --> Pane    
    end
    note1 --- PrimaryStage
    note2 --- Scene
    note3 --- Pane
