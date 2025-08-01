public class StarPatterns {
    public static void main(String[] args) {

        // Task 5: Left-aligned growing triangle
        System.out.println("Task 5:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Spacer
        System.out.println();

        // Task 6: Left-aligned shrinking triangle
        System.out.println("Task 6:");
        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Spacer
        System.out.println();

        // Task 7: Square of stars (5x5)
        System.out.println("Task 7:");
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

}