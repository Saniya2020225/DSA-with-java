public class bit1 {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int BitMask = 1<<pos;
        
        if(BitMask == 0 & n==0){
            System.out.println("bit was zero");
        }else{
            System.out.println("bit was one");
        }
    }
}
