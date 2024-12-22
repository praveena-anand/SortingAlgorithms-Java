import java.util.Scanner;

public class Main1
{
    static void insertionSort(int arr[])
    {
        int n = arr.length;

        for (int i = 1; i < n; i++)
        {
            int temp = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
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
            System.out.print("Element : " + i + " : ");
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        System.out.println("The Sorted Array,");
        for (int e : arr)
            System.out.print(e + "  ");

        sc.close();
    }
}
