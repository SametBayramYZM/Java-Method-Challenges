public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp (true, 1);
        shouldWakeUp (false, 2);
        shouldWakeUp (true, 8);
        shouldWakeUp (true, -1);
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(!barking) {
            System.out.println("False");
            return false;
        }
        if (hourOfDay>=0 && hourOfDay<=23){
            if(barking && hourOfDay<8 || hourOfDay>22){
                System.out.println("True");
                return true;
            }else{
                System.out.println("False");
                return false;
            }
        }else{
            System.out.println("False");
            return false;
        }
    }
}
