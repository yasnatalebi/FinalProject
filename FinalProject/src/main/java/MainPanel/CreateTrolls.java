package MainPanel;

import Heros.Trolls.Troll1;
import Heros.Trolls.Troll2;
import Heros.Trolls.Troll3;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

abstract public class CreateTrolls
{
    private static ImageView viewTroll1;
    private static ImageView viewTroll2;
    private static ImageView viewTroll3;


    public static Troll1 CreateTroll1()
    {
        Troll1 troll1 = new Troll1();
        viewTroll1 = (new ImageView(troll1));

        int randPosition = MoveTrolls.TrollsRandNumber();

        if (randPosition == 1)
        {
            viewTroll1.setLayoutX(600);
            viewTroll1.setLayoutY(175);
        }
        else if (randPosition == 2)
        {
            viewTroll1.setLayoutX(600);
            viewTroll1.setLayoutY(300);
        }
        else if (randPosition == 3)
        {
            viewTroll1.setLayoutX(600);
            viewTroll1.setLayoutY(450);
        }
        viewTroll1.setFitWidth(250);
        viewTroll1.setFitHeight(200);
        Game.gamePane.getChildren().add(viewTroll1);
        return troll1;
    }
    public static Troll2 CreateTroll2()
    {
        Troll2 troll2 = new Troll2();
        viewTroll2 = new ImageView(troll2);

        int randPosition = MoveTrolls.TrollsRandNumber();

        if (randPosition == 1)
        {
            viewTroll2.setLayoutX(600);
            viewTroll2.setLayoutY(175);
        }
        else if (randPosition == 2)
        {
            viewTroll2.setLayoutX(600);
            viewTroll2.setLayoutY(300);
        }
        else if (randPosition == 3)
        {
            viewTroll2.setLayoutX(600);
            viewTroll2.setLayoutY(450);
        }
        viewTroll2.setFitWidth(250);
        viewTroll2.setFitHeight(200);
        Game.gamePane.getChildren().add(viewTroll2);
        return troll2;
    }
    public static Troll3 CreateTroll3()
    {
        Troll3 troll3 = new Troll3();
        viewTroll3 = new ImageView(troll3);

        int randPosition = MoveTrolls.TrollsRandNumber();

        if (randPosition == 1)
        {
            viewTroll3.setLayoutX(600);
            viewTroll3.setLayoutY(175);
        }
        else if (randPosition == 2)
        {
            viewTroll3.setLayoutX(600);
            viewTroll3.setLayoutY(300);
        }
        else if (randPosition == 3)
        {
            viewTroll3.setLayoutX(600);
            viewTroll3.setLayoutY(450);
        }
        viewTroll3.setFitWidth(250);
        viewTroll3.setFitHeight(200);
        Game.gamePane.getChildren().add(viewTroll3);
        return troll3;
    }
}
