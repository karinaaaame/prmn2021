package lecture06;

import javax.management.openmbean.InvalidOpenTypeException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        System.out.println("小数値を入力");
        Scanner scanner = new Scanner(System.in);
        try {
            double number = scanner.nextDouble();
            System.out.println("入力値"+number);
        } catch(InputMismatchException e){
            System.out.println("エラー！");
        }
    }
}