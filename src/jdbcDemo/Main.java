package jdbcDemo;

public class Main{
    public static void processArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 7 == 0 && arr[i] < 51){
                arr[i] = - 6;
            }
            else if(arr[i] % 7 == 0){
                arr[i] = -5;
            }
            else if(arr[i] < 51) {
                arr[i] = -4;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int array [] ={84,62,12,35};
        processArray(array);
    }
}
