package jdbcDemo;

public class Myclass {
    public static void calculate(int arr [],int k){
        int sum = 0;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0; j < arr.length;j++){
                while(sum <= k && i != j){
                    sum = sum + arr[i] + arr[j];
                }
                if(sum > k){
                    sum = 0;
                }
                if(sum == k){
                    System.out.println(arr[i]+"\t"+arr[j]);
                }
            }
        }
    }
    public static void main(String []args){
        int arr [] = {5,3,8,2,1,10};
        int k = 11;
        calculate(arr,k);
    }
}
