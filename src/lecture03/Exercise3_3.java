package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = new String[2];
        int S;
        int[] A = new int[2];

        for(int i=0;i<2;i++) {
            System.out.println(i+1 + "番目の数字は");
            a[i] = scanner.nextLine();
            A[i] = Integer.parseInt(a[i]);
        }
        S=A[0]+A[1];

        System.out.println(A[0]+"+"+A[1]+"="+S);
    }
}
