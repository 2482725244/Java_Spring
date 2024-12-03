import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Descripetion:
 * User: WUHONGYUN
 * Date: 2023-02-05
 * Time: 12:21
 */
public class Test01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();

        }

        for(int i = 0; i < n; i++){
            arr[i] = arr[i]

        }


        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);

        }


    }


    public static void main1(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[200];
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n - 1; i++){

            for(int j = 0; j < n - 1 - i; j++){

                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }

            }

        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");

        }



    }
}
