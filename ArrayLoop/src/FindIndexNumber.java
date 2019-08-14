import java.util.Scanner;

public class FindIndexNumber {
    //to find the index number

    public static void main(String[]args){
        int[] a = {11,22,33,44,55,66,77,88,99};
        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int i;
        for ( i = 0; i< a.length; i++){
            if (b == a[i]){
                System.out.println("Index Value is " + i);
                }
        }

    }
}
