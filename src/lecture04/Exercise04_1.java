package lecture04;

public class Exercise04_1 {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(60,10,"ryu");
        Fighter fighter2 = new Fighter(25,30,"ken");

        while(true){
            fighter1.attack(fighter2);
            System.out.println(fighter2.getName()+" の残りhitPoint "+fighter2.getHitPoint());

            if(fighter2.isAlive()){
                System.out.println(fighter2.getName()+" は倒れた");
                break;
            }

            fighter2.attack(fighter1);
            System.out.println(fighter1.getName()+" の残りhitPoint "+fighter1.getHitPoint());

            if(fighter1.isAlive()) {
                System.out.println(fighter1.getName() + " は倒れた");
                break;
            }

        }
    }
}
