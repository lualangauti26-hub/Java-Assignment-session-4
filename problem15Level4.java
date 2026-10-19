package session4.assignmentFilesSession4;

public class problem15Level4 {
    public static void main(String[] args) {
        int [] numbers = {2, 4, 3, 5, 7, 8, 9};
        int target = 10;

        for(int i = 0; i < numbers.length; i++){
            for (int j = i + 1; j < numbers.length; j++){
                if (numbers[i] + numbers[j] == target){
                    System.out.println("\n(" + numbers[i] + ", " + numbers[j] + ")\n");
                }
            }
        }
    }
}
