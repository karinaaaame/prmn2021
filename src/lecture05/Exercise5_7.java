package lecture05;

import java.util.ArrayList;

public class Exercise5_7
{
    public static void main(String[] args) {
        ArrayList<Insect> List = new ArrayList<>();
        Insect mushi = new Insect();
        Betterfly tefutefu = new Betterfly();
        Locust batta = new Locust();
        SwallowtailButterfly ageha = new SwallowtailButterfly();
        List.add(mushi);
        List.add(tefutefu);
        List.add(batta);
        List.add(ageha);
        for (Insect konchu : List){
            konchu.move();
        }
    }
}
