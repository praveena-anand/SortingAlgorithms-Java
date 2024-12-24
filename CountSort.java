import java.util.*;

public class Main1
{
    public static void countSort(int arr[])
    {
        int n = arr.length;

        int max = arr[0];
        for (int i : arr)
        {
            if (i > max)
                max = i;
        }

        int count[] = new int[max + 1];
        for (int i : arr)
            count[i]++;

        int cummulativeCount[] = new int[max + 1];
        cummulativeCount[0] = count[0];
        for (int i = 1; i <= max; i++)
            cummulativeCount[i] = cummulativeCount[i-1] + count[i];

        int output[] = new int[n];

        for (int i = n-1; i >= 0; i--)
        {
            int element = arr[i];
            int position = cummulativeCount[element] - 1;
            output[position] = element;
            cummulativeCount[element]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
        // for (int i = 0; i < n; i++)
        //     arr[i] = output[i];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements : ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++)
        {
            System.out.print("Element " + i + " : ");
            arr[i] = sc.nextInt();
        }

        countSort(arr);

        System.out.println("The sorted array,");
        for (int i : arr)
            System.out.print(i + "  ");

        sc.close();
    }
}
