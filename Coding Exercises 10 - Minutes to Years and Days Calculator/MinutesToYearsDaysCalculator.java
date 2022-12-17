public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes){
        if (minutes <0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long minutesRemaining = (minutes - (years * 525600));
            long daysRemaining = minutesRemaining / 1440;

            System.out.println(minutes + " min = " + years + " y and " + daysRemaining + " d");
        }
    }
}