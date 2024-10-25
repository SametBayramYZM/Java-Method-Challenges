public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(6);
        checkNumber(-12);
        checkNumber(0);
        checkNumber(124);
    }
    public static void checkNumber(int number) {
        if (number<0){
            System.out.println("negative");
        }else if(number>0){
            System.out.println("positive");
        }else{
            System.out.println("zero");
        }
    }
}

