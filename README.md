# Screensaver w/JavaFX Documentation Project

## 1. Introduction 
  This project is an application of the JavaFX class to make a Classical DvD screensaver:
  
  ![DvD Screensaver](https://github.com/KauanIzidoro/Screensaver_k/blob/main/dvd.gif)
  
## 2. Basic structure
  This structure is responsible for organizing the visual elements on the screen, note that a tree topology is used

  ```mermaid
classDiagram
    direction LR
    class Application {
        +start(Stage primaryStage)
    }

    class Boss {
        -double life
        -Image[] boss_atk_ragemode
        -Image[] boss_idle_ragemode
        -Timeline atkrage
        -Timeline idlerage
        -int indexAtk
        -int indexIdle
        +Boss(double x, double y)
        -loadimages()
        -setupAnimations()
        +boolean boss_ready_to_atk(Player player)
        +void bossatk()
        +void movement(Player player)
        +double getLife()
        +Timeline getAtkrage()
        +Timeline getIdlerage()
    }

    Boss --> Enemy : extends

    class ControlScreen {
        +start(Stage primaryStage)
        -setupKeyHandlers(Scene scene, Stage primaryStage)
    }

    ControlScreen --> Application : extends

    class Enemy {
        -Image skIdle
        -Image[] skrunRight
        -Image[] skrunLeft
        -Image[] skatk
        -int indexRun
        -int indexAtk
        -Timeline runR
        -Timeline runL
        -Timeline skatkT
        -MapObstacles obstacles
        +Enemy(double x, double y)
        -loadImages()
        -enemy_timelines()
        +void followPlayer(Player player)
        +boolean enemy_collision_hit(Player player)
        +Timeline getskatkT()
        +void setskatkT(Timeline skatkT)
    }

    Enemy --> ImageView : extends

    class GameEnvironment {
        +start(Stage primaryStage)
        +int getSceneWidth()
        +int getSceneHeight()
    }

    GameEnvironment --> Application : extends

    class GameInit {
        +start(Stage primaryStage)
        -showCharacterSelection()
        -VBox createCharacterBox(String imagePath, String characterName)
        -void selectCharacter(String characterName)
        -void openSettings()
    }

    GameInit --> Application : extends

    class GameLoop {
        -Player player
        -Pane pane
        -Enemy[] enemies
        -Boss boss
        -GameEnvironment gameEnvironment
        -SoundsFX sound
        -AnimationTimer animationTimer
        -MapObstacles[] obstacles
        -Random Xr
        -Random Yr 
        -Random rr
        -boolean flag_enemy
        -int enemylife
        -int playerlife
        -int flag_cycle
        -int kill
        +GameLoop(Scene scene, Player player, Pane pane, Stage primaryStage)
        -void setupAnimationTimer(Stage primaryStage)
        -void spawnEnemy()
        -void spawnBoss()
        -void setObstacles()
        -void setupKeyHandlers(Scene scene, Stage primaryStage)
        -void handleMovement(KeyCode code, Stage primaryStage)
        -void kill_enemy(int index)
        +void start()
    }

    class GameMap {
        -ImageView backgroundImageView
        +GameMap(double width, double height)
        +ImageView getBackgroundImageView()
    }

    class GameOverScreen {
        +start(Stage primaryStage)
        -void gameLoop(Stage primaryStage)
        -void backToMenu(Stage primaryStage)
    }

    GameOverScreen --> Application : extends

    class LoadingScreen {
        -Image portalImage
        +LoadingScreen()
        +start(Stage primaryStage)
        -void setupKeyHandlers(Scene scene, Stage primaryStage)
    }

    LoadingScreen --> Application : extends

    class MapObstacles {
        -ImageView[] map_obj
        +MapObstacles(double x, double y, int n)
        +MapObstacles()
        -void load_map_images()
        +double gettX(int n)
        +double gettY(int n)
        +double gettFitWidth(int n)
        +double gettFitHeight(int n)
        +void setX(int x, int n)
        +Node getMap_obj(int n)
        +void setMap_obj(ImageView[] map_obj)
    }

    MapObstacles --> ImageView : extends

    class Menu {
        +start(Stage primaryStage)
        -void openSettings()
        -void startGame(Stage primaryStage)
    }

    Menu --> Application : extends

    class PauseScreen {
        +start(Stage primaryStage)
        -void game_Loop(Stage primaryStage)
        -void backMenu(Stage primaryStage)
    }

    PauseScreen --> Application : extends

    class Player {
        -final double PLAYER_HEIGHT
        -final double PLAYER_WIDTH
        -static final double WIDTH
        -static final double HEIGHT
        -double speed
        -MapObstacles[] obstacles
        -ImageView imageView
        -Image[] runRight
        -Image[] runLeft
        -Image[] knatk
        -Image[] kndead
        -Image idle
        -int indexRun
        -int indexAtk
        -int indexDead
        -Timeline runR
        -Timeline runL
        -Timeline atk
        -Timeline kndead
        +Player(double startX, double startY)
        -void loadImages()
        -void setupAnimations()
        +ImageView getImageView()
        +void setupObstacles()
        +boolean player_rock_collision_q0()
        +boolean player_rock_collision_q1()
        +boolean player_rock_collision_q2()
        +boolean player_alt_collision_q0()
        +boolean player_alt_collision_q1()
        +boolean player_alt_collision_q2()
        +boolean player_rock_collision_p0()
        +boolean player_rock_collision_p1()
        +boolean player_rock_collision_p2()
        +boolean player_alt_collision_p0()
        +boolean player_collisionXleft()
        +boolean player_collisionXright()
        +boolean player_collisionYup()
        +boolean player_collisionYdown()
        +boolean player_enemy_collision(Enemy enemy)
        +void moveLeft()
        +void moveRight()
        +void moveUp()
        +void moveDown()
        +void stopAnimation()
        +void setSpeed(double speed)
        +double getWidth()
        +double getHeight()
        +Timeline getAtk()
        +Timeline getDead()
        +void setX(int x)
        +void setY(int y)
    }

    Player --> ImageView : extends

    class SoundsFX {
        +void play()
    }

  
  
  
  


