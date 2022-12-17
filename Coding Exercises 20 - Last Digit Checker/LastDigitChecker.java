public class LastDigitChecker {

    public static boolean hasSameLastDigit(int numOne, int numTwo, int numThree){
        if(numOne < 10 || numOne > 1000 ||numTwo < 10 || numTwo > 1000 || numThree < 10 || numThree > 1000) return false;

        return (numOne%10 == numTwo%10 || numOne%10 == numThree%10 || numTwo%10 == numThree%10);
    }
    public static boolean isValid(int numFour){
        if(numFour<10 || numFour>1000){
            return false;
        }else{
            return true;
        }
    }
}
