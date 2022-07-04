package MainPanel;

import javafx.scene.Node;

abstract public class DraggableMaker
{
    public static double mouseAnchorX;
    public static double mouseAnchorY;

    public static void MakeDraggable(Node node)
    {
        node.setOnMousePressed(MouseEvent -> {
            mouseAnchorX = MouseEvent.getX();
            mouseAnchorY = MouseEvent.getY();
        });

        node.setOnMouseReleased(MouseEvent -> {
            if (125 < (MouseEvent.getSceneY() - mouseAnchorY) && (MouseEvent.getSceneY() - mouseAnchorY) < 225)
            {
                node.setLayoutX(0);
                node.setLayoutY(175);
            }
            else if (250 < (MouseEvent.getSceneY() - mouseAnchorY) && (MouseEvent.getSceneY() - mouseAnchorY) < 350)
            {
                node.setLayoutX(0);
                node.setLayoutY(300);
            }
            else if (375 < (MouseEvent.getSceneY() - mouseAnchorY) && (MouseEvent.getSceneY() - mouseAnchorY) < 500)
            {
                node.setLayoutX(0);
                node.setLayoutY(450);
            }
        });
    }
}
