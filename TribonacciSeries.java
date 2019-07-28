package contests;

public class TribonacciSeries {
    public static int tribonacci(int n) {
        int result[] = new int[n];
        if(n==0) {
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n==2){
            return 1;
        }
        else{
            result[0]=1;
            result[1]=1;
            result[2]=2;
            int sum = 0;
                for (int i = 3; i < n; i++) {
                    sum = result[i - 1] + result[i - 2] + result[i - 3];
                    result[i] = sum;
                }
            for (int i = 0; i < n; i++)
                System.out.println(result[i]);
            return result[n - 1];
        }
    }
    public static void main(String as[]){
        int n = 4;
        System.out.println(tribonacci(n));
    }
}
