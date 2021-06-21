package lecture05;

public class Exercise5_6 {
    public static void main(String[] args) {
        Insect mushi = new Insect();
        SwallowtailButterfly ageha = new SwallowtailButterfly();
        mushi = ageha;
        mushi.move();
    }
}
