package session4.assignmentFilesSession4;

public class problem13Level4 {
    public static void main(String[] args) {
        int N = 20;

        for (int number = 2; number <= N; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
