import java.util.Scanner;

public class Main1
{
    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void selectionSort(int arr[])
    {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++)
        {
            int min = i;

            for (int j = i; j < n; j++)
            {
                if (arr[j] < arr[min])
                    min = j;
            }

            if (min != i)
                swap(arr, min, i);
        }
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

        selectionSort(arr);

        System.out.println("The Sorted Array,");
        for (int e : arr)
            System.out.print(e + "  ");

        sc.close();
    }
}
