package session4.assignmentFilesSession4;
import java.util.Scanner;

public class problem9Level3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int rows;
        int columns;
        
        System.out.print("\nEnter rows: ");
        rows = input.nextInt();

        System.out.print("\nEnter columns: ");
        columns = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
