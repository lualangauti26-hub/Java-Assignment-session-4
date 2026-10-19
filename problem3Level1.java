package session4.assignmentFilesSession4;

import java.util.Scanner;

public class problem3Level1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N;
        int sum = 0;

        System.out.print("\nEnter N: ");
        N = input.nextInt();

        System.out.print("\n");

        for (int i = 1; i <= N; i++) {
            sum += i;
            
        }
        System.out.println(sum + "\n");
        input.close();
    }
}
