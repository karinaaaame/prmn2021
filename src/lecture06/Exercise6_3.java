package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> dices = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            dices.add(random.nextInt(6));
        }
        System.out.println("さいころを5個ふりりました");
        System.out.println("何個目の値が知りたいですか？");

        try {
            int index = scanner.nextInt();
            System.out.println(dices.get(index-1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("５以上の入力");
        }catch (InputMismatchException e){
            System.out.println("整数値以外の入力");
        }

    }
}