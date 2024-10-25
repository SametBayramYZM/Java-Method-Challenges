public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
    }
    public static boolean isLeapYear(int year){
        if(year < 1 || year > 9999) {
            System.out.println("False");
            return false;
        }
        if (year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    System.out.println("True");
                    return true;
                }
                System.out.println("False");
                return false;
            }else {
                System.out.println("True");
                return true;
            }
        }
        return false;
    }
}
