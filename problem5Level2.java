package session4.assignmentFilesSession4;

import java.util.Scanner;

public class problem5Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int sumEven = 0;

        System.out.print("\nEnter N: ");
        N = input.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            }

        }
        System.out.println(sumEven + "\n");
        input.close();
    }
}
