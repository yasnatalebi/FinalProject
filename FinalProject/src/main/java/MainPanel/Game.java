package MainPanel;


import Heros.Hero;
import javafx.animation.AnimationTimer;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class Game
{
    public static AnchorPane gamePane;
    public Scene gameScene;
    public Stage gameStage;

    private static final int GAME_WIDTH = 800;
    private static final int GAME_HEIGHT = 650;

    private Stage menuStage;
    private AnimationTimer gameTimer;

    Game()
    {
        gamePane = new AnchorPane();
        gameScene = new Scene(gamePane, GAME_WIDTH, GAME_HEIGHT, Color.BLACK);
        gameStage = new Stage();
        gameStage.setScene(gameScene);
        // title & icon
        gameStage.getIcons().add(new Image("C:\\Users\\Yasna\\IdeaProjects\\FinalProject\\src\\logo.png"));
        gameStage.setTitle("Knights vs Trolls");
    }

    public void CreateNewGame(Stage menuStage) throws InterruptedException {
        this.menuStage = menuStage;
        this.menuStage.hide();
        createBackground();
        CreateKnights.CreateKnight1();
        CreateKnights.CreateKnight2();
        CreateKnights.CreateKnight3();

        int randTroll = MoveTrolls.TrollsRandNumber();
        Hero Troll;
        if (randTroll == 1)
            Troll = new Hero(CreateTrolls.CreateTroll1().getUrl());
        else if (randTroll == 2)
            Troll = new Hero(CreateTrolls.CreateTroll2().getUrl());
        else if (randTroll == 3)
            Troll = new Hero(CreateTrolls.CreateTroll3().getUrl());

        gameStage.show();
    }
    public void createBackground()
    {
        Image backgroundImage = new Image("C:\\Users\\Yasna\\IdeaProjects\\FinalProject\\src\\back.png", 800, 500, false, false);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.SPACE, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,null);
        gamePane.setBackground(new Background(background));
    }
    private void CreateGameLoop()
    {
        gameTimer = new AnimationTimer() {
            @Override
            public void handle(long l) {

            }
        };
        gameTimer.start();
    }
}
