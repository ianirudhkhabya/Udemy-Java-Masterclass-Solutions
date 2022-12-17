import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 1;
        while (true) {
            boolean hasNextInt = sc.hasNextInt();
            if (hasNextInt) {
                int number = sc.nextInt();
                sum += number;
                avg = (double) sum/count;
            } else {
                break;
            }
            count++;
        }
        sc.nextLine();
        sc.close();
        System.out.println("SUM = " + sum + " AVG = " + (long) Math.round(avg));
    }
}
