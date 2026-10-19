package session4.assignmentFilesSession4;

import java.util.Scanner;

public class problem6Level2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        long factorial = 1;

        System.out.print("\nEnter N: ");
        N = input.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= N; i++) {
            
                factorial *= i;

        }
        System.out.println(factorial + "\n");
        input.close();
    }
}
