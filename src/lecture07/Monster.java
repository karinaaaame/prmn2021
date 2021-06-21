package lecture07;

import java.util.ArrayList;

public class Monster {
    private String name;
    private int hitPoint;
    private int attack;
    private int block;
    private int speed;
    private ArrayList<Move> moveList = new ArrayList<>();

    public Monster(String name, int hitPoint, int attack, int block, int speed) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.block = block;
        this.speed = speed;
    }

    public void addMove(Move move){

    }
}
