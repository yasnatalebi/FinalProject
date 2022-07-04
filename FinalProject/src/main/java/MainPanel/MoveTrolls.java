package MainPanel;

import Heros.Hero;

public class MoveTrolls
{
    public static int TrollsRandNumber()
    {
        int min = 1;
        int max = 3;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        return random_int;
    }

    public static void Move(Hero troll)
    {

    }

}
