public class NumberToWords {

    public static void numberToWords(int number){
        if(number < 0) System.out.println("Invalid Value");
        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);
        while(reversedNumber!=0 || digitCount>0){
            switch(reversedNumber%10){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reversedNumber/=10;
            digitCount--;
        }
        System.out.println();
    }

    public static int reverse(int number){
        int newVal = 0;
        while(number!=0){
            newVal = (newVal*10)+number%10;
            number/=10;
        }
        return newVal;
    }

    public static int getDigitCount(int number){
        if(number<0) return -1;
        if(number == 0) return 1;

        int count = 0;
        while(number!=0){
            count++;
            number/=10;
        }
        return count;
    }
}
