public class DuplicateValue {
    //code to find the duplicate value of an array

    public static void main(String[] args){

        int[]a = {9,9,6,3,9,3,9,3};

        for (int i=0;i<a.length-1; i++)
        {
            //for loop condition
            for (int b=i+1; b<a.length; b++)
            {
                if ((a[i] == a[b])&&(i !=b))
                {

                    System.out.println("Duplicate value of an array is :  "+ a[b]);
                }

            }

        }

    }


}
