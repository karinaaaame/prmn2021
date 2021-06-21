package lecture05;

public class Exercise5_5 {
    public static void main(String[] args) {
        Locust batta = new Locust();
        Insect mushi = new Insect();
        mushi = batta;
        mushi.move();
    }
}
