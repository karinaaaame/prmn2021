package lecuture03;

import java.util.Scanner;
import java.util.ArrayList;

public class Exercise3_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
         ArrayList<String>moji = new ArrayList<>();

        System.out.println("何行？");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println(i+1+"行目の文字列を入力");
            moji.add(scanner.nextLine());
        }

        for(String a : moji){
            System.out.println(a);
        }
    }
}
