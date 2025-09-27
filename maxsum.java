public class maxsum {
    public static void main(String[] args) {
        int arr[] = {-2 , 1 , 3 , -4 , -5 , -6 , 8 , 1};
        int sum = 0;
        int maxsum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum > maxsum){
                maxsum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println(maxsum);
    }
}
