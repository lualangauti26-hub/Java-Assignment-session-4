package session4.assignmentFilesSession4;

import java.util.Scanner;

public class problem1Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;

        System.out.print("\nEnter N: ");
        N = input.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            
        }
        System.out.println("\n");
        input.close();
    }
}
