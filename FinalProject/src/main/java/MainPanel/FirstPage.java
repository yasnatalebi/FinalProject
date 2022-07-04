package MainPanel;

import Button.button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FirstPage extends VBox
{
    private static final int height = 800;
    private static final int width = 650;

    private AnchorPane mainPane;
    private Scene mainScene;
    private Stage mainStage;

    public FirstPage()
    {
        mainPane = new AnchorPane();
        mainScene = new Scene(mainPane,height,width);
        mainStage = new Stage();
        mainStage.setScene(mainScene);

        // title & icon
        mainStage.getIcons().add(new Image("C:\\Users\\Yasna\\IdeaProjects\\FinalProject\\src\\logo.png"));
        mainStage.setTitle("Knights vs Trolls");
    }
    public Stage getMainStage()
    {
        return mainStage;
    }
    public void createButton()
    {
        button startButton = new button("Start");
        startButton.setLayoutX(75);
        startButton.setLayoutY(150);
        mainPane.getChildren().add(startButton);

        startButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Game game = new Game();
                try {
                    game.CreateNewGame(mainStage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        button ExitButton = new button("Exit");
        ExitButton.setLayoutX(75);
        ExitButton.setLayoutY(250);
        mainPane.getChildren().add(ExitButton);

        ExitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                mainStage.close();
            }
        });
    }
    public void createBackground()
    {
        Image backgroundImage = new Image("C:\\Users\\Yasna\\IdeaProjects\\FinalProject\\src\\main.png", 800, 600, false, false);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER,null);
        mainPane.setBackground(new Background(background));
    }
    public void createLogo() {
        ImageView logo = new ImageView("C:\\Users\\Yasna\\IdeaProjects\\FinalProject\\src\\logo.png");
        logo.setFitHeight(400);
        logo.setFitWidth(400);
        logo.setLayoutX(350);
        logo.setLayoutY(100);

        logo.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                logo.setEffect(new DropShadow());

            }
        });
        logo.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                logo.setEffect(null);

            }
        });
        mainPane.getChildren().add(logo);

    }

}
