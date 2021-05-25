package lecture01;

public class Main {
    public static void main(String[] args) {
        int studentNumber = 2200050, age = 19;
        int[] array = new int[100];
        int sum = 0;

        System.out.println("B" + studentNumber + " Aota Satoshi");

        if (age < 20) {
            System.out.println("I am " + age + " years old so I cannot drink liquor.");
        } else {
            System.out.println("I am " + age + " years old so I can drink liquor.");
        }

        //forを使った理由：回数を指定しやすいから、ぶっちゃけ使い慣れてるから
        for (int i = 0; i < 100; i++) {
            array[i] += i;
            if (i % 2 == 0) {
                sum = sum + array[i];
            }
        }

        System.out.println("和は　"+sum+ "になる");
    }

}


