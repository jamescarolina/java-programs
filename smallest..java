
public class smallest {



    public static int printArray(int[] array, int length)
    {
        for(int i=0;i<length;i++)
        System.out.print(array[i]+" ");

        return 0;
    }

    public static void main(String[] args)
    {   

        int array[] = {52,45,3,234,65,33};
        int min_element = array[0];
        printArray(array, array.length);
        for(int i=1; i<array.length;i++)
        {
            if(array[i]<min_element)
                min_element = array[i];
        }
        System.out.print("\nSmallest element: " + min_element);
    }
}
