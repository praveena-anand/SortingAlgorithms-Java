import java.util.Scanner;

public class Main1
{
    static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void heapify(int arr[], int n, int i)
    {
        int largest = i;
        int l = 2*i+1;
        int r = 2*i+2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i)
        {
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }

    static void heapSort(int arr[])
    {
        int n = arr.length;

        for (int i = n/2-1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n-1; i >= 0; i--)
        {
            swap(arr, 0, i);
            heapify(arr, i, 0);
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

        heapSort(arr);

        System.out.println("The Sorted Array,");
        for (int e : arr)
            System.out.print(e + " ");

        sc.close();
    }
}
