import java.util.Arrays;

public class SumArray {
    public static void main(String[]args){
        int []a = {46,5,66,44,890,12};
        System.out.println("The list of value are " + Arrays.toString(a));
        int sum = 0;

        for (int b = 0; b<6; b++)
        {
            sum = sum +a[b];
            //sum takes the value 46 and keeps on adding and changing sum value
        }
        System.out.println("Sum value of value is " + (sum));


    }
}
