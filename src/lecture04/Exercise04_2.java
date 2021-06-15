package lecture04;

public class Exercise04_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.deposit("123",100);
        atm.registerAccount("青田","123");
        atm.deposit("123",1000);
        atm.withdraw("123",2000);
        atm.deposit("123",500);
    }
}
