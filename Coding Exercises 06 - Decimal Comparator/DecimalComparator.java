public class DecimalComparator{
    
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 *= 1000;
        num2 *= 1000;
    
        int a = (int) num1;
        int b = (int) num2;
        
        if(a == b){
            return true;
        }
        return false;
    }
}
