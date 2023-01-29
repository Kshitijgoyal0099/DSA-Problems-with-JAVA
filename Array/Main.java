import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the no of elements in array : ");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.print("Please enter the elements in array : ");
        for(int i = 0 ; i < N ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("The elements in array : ");
        for(int i = 0 ; i < N ; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.println("First elements in array : " + arr[0]);
        System.out.println("Last elements in array : " + arr[N-1]);

    }
}