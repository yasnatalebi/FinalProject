package MainPanel;

import Heros.Knights.Knight1;
import Heros.Knights.Knight2;
import Heros.Knights.Knight3;
import javafx.event.EventHandler;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

abstract public class CreateKnights
{
    private static ImageView viewKnight1;
    private static ImageView viewKnight2;
    private static ImageView viewKnight3;

    public static void CreateKnight1()
    {
        Knight1 knight1 = new Knight1();
        viewKnight1 = new ImageView(knight1);
        viewKnight1.setLayoutX(5);
        viewKnight1.setLayoutY(5);
        viewKnight1.setFitWidth(250);
        viewKnight1.setFitHeight(200);
        Game.gamePane.getChildren().add(viewKnight1);

        viewKnight1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                viewKnight1.setEffect(new DropShadow());
                ImageView viewKnight11 = new ImageView(knight1);
                viewKnight11.setLayoutX(5);
                viewKnight11.setLayoutY(5);
                viewKnight11.setFitWidth(250);
                viewKnight11.setFitHeight(200);
                Game.gamePane.getChildren().add(viewKnight11);
                DraggableMaker.MakeDraggable(viewKnight11);
            }
        });

    }
    public static void CreateKnight2()
    {
        Knight2 knight2 = new Knight2();
        viewKnight2 = new ImageView(knight2);
        viewKnight2.setLayoutX(100);
        viewKnight2.setLayoutY(5);
        viewKnight2.setFitWidth(250);
        viewKnight2.setFitHeight(200);
        Game.gamePane.getChildren().add(viewKnight2);

        viewKnight2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                viewKnight2.setEffect(new DropShadow());
                ImageView viewKnight22 = new ImageView(knight2);
                viewKnight22.setLayoutX(100);
                viewKnight22.setLayoutY(5);
                viewKnight22.setFitWidth(250);
                viewKnight22.setFitHeight(200);
                Game.gamePane.getChildren().add(viewKnight22);
                DraggableMaker.MakeDraggable(viewKnight22);
            }
        });
    }
    public static void CreateKnight3()
    {
        Knight3 knight3 = new Knight3();
        viewKnight3 = new ImageView(knight3);
        viewKnight3.setLayoutX(200);
        viewKnight3.setLayoutY(5);
        viewKnight3.setFitWidth(250);
        viewKnight3.setFitHeight(200);
        Game.gamePane.getChildren().add(viewKnight3);

        viewKnight3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                viewKnight3.setEffect(new DropShadow());
                ImageView viewKnight33 = new ImageView(knight3);
                viewKnight33.setLayoutX(200);
                viewKnight33.setLayoutY(5);
                viewKnight33.setFitWidth(250);
                viewKnight33.setFitHeight(200);
                Game.gamePane.getChildren().add(viewKnight33);
                DraggableMaker.MakeDraggable(viewKnight33);

            }
        });    }
}
