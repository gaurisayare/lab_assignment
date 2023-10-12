import myarray.ArrayInput;
import java.util.Scanner;

public class BinarySearch2 
{
    public static void main(String[] args) 
	{
        int[] arr = ArrayInput.getInputArray(); // Call a method from ArrayInput to get the input array

        // Sort the array in ascending order using Bubble Sort
        bubbleSort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to search for: ");
        int target = sc.nextInt(); // The element to search for

        int result = binarySearch(arr, target);

        if (result != -1) 
		{
            System.out.println("Element found at index " + result);
        } 
		else 
		{
            System.out.println("Element not found in the array.");
        }
    }

    public static void bubbleSort(int[] arr) 
	{
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
		{
            for (int j = 0; j < n - i - 1; j++) 
			{
                if (arr[j] > arr[j + 1]) 
				{
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int[] arr, int target) 
	{
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) 
		{
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) 
			{
                return mid; // Element found at index mid
            } 
			else if (arr[mid] < target) 
			{
                left = mid + 1; // Search in the right half
            } 
			else 
			{
                right = mid - 1; // Search in the left half
            }
        }

        return -1; // Element not found
    }
}
