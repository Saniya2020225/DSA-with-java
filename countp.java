public class countp {
    public static void main(String[] args) {
        int[] arr = {12,13,1,5,8,7,19,8,3,4,2,0};
        boolean[] prime = new boolean[arr.length];
        int count = 0;

        for(int i=0;i<arr.length;i++){
            prime[i] = true;
            if(arr[i] <= 1){
                prime[i] = false;
            }else{
                for(int j=2;j<=Math.sqrt(arr[i]);j++){
                    if(arr[i] % j == 0){
                        prime[i] = false;
                        break;
                    }
                }
            }
        }
        for(boolean num:prime){
            if(num==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
