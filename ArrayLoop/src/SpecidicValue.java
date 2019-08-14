import java.sql.SQLOutput;
import java.util.Scanner;

public class SpecidicValue {

    public static void main(String[] args) {
        int[] a = {123, 34, 89, 55, 98, 89, 794};
        System.out.println("Enter the Number");
        Scanner scanner = new Scanner(System.in);

        int b = scanner.nextInt();

        for (int i = 0; i < a.length; i++) {

            if (b == a[i]) {

                System.out.println("Arrays contains this value and its index position is " + i);

                break;
            }
            if (a.length-i==0) {


            }


        }


    }
}
