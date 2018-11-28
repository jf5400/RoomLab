package Rooms;

import Game.Runner;
import People.Person;

public class JazmineRoom extends Room {

    public JazmineRoom(int x, int y) {
        super(x, y);
    }

    /**
     * Triggers the game ending conditions.
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found Jazmine's room! Don't tell anybody about it though, it's only for cool kids");
        System.out.println();
        Runner.gameOff();
    }
}