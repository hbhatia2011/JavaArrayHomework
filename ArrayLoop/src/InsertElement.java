import java.util.Arrays;
import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[]a= {25,35,45,65,75};

        System.out.print("Enter the Number");

        int b = scanner.nextInt();

        System.out.println("Enter your desired position between 1 and  " +a.length);

        int p = scanner.nextInt();

        for (int i = a.length - 1; i>p-1;i--)
        {
            a[i]=a[i-1];


        }
        a[p-1] = b;

        System.out.println(Arrays.toString(a));

    }
}
