import java.util.Arrays;

public class SortArray {
    //to sort arrays string and value
    public static void main(String[] args) {
        String[] c = {"Australia", "Zambia", "England", "Finland", "Singapore"};
        System.out.println("The original sequence is" + Arrays.toString(c));
        //to sort the countries ascending order
        Arrays.sort(c);
        System.out.println("The new sorted list is" + Arrays.toString(c));

        int[ ]a={35,78,2,8,89};
        System.out.println("The Original Array is" + Arrays.toString(a));
        //to sort the numbers in ascending order
        Arrays.sort(a);
        System.out.println("The new sorted list is" + Arrays.toString(a));


    }
}
