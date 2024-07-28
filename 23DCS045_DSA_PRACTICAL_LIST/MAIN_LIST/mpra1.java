
//PRA 1
//AIM : SEARCHING ELEMENT OF ARRAY USING LINEAR AND BINARY SEARCH ALGORITHM
import java.util.*;

public class mpra1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        // linear search
        // TESTING EXAMPLE
        // int arr[] = { 15, 5, 20, 35, 2, 42, 67, 17 };
        // int key = 42;
        int key, s;
        System.out.println("ENTER ARRAY SIZE : ");
        s = in.nextInt();
        int arr[] = new int[s];// MAKE ARRAY DYNAMICALLY
        System.out.println("ENTER ARRAY ELEMENTS : ");
        for (int i = 0; i < s; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("ENTER KEY ELEMENT : ");
        key = in.nextInt();

        System.out.println("\nBY LINEAR SEARCH ALGORITHM :");
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                System.out.println("ELEMENT IS FOUND AT " + i + "TH ELEMENT.");
                break;
            }

            if (i == arr.length - 1) {
                System.out.println("\nELEMENT IS NOT FOUND...");
            }
        }

        // binary search
        // convert unsorted array to sorted array
        System.out.println("\nBY BINARY SEARCH ALGORITHM : ");
        // sort the array using selection sort algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        System.err.println("AFTER SORTING, ARRAY IS : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

        // APPLY BINARY SEARCH WITH DIVIDE TWO PART OF SORTED ARRAY
        int st = 0, en = arr.length - 1,mid;
        while (st <= en) {
            mid = (st + en) / 2;

            if (arr[mid] == key) {
                System.out.println("\nELEMENT IS FOUND AT " + mid + "TH ELEMENT.");
                break;
            }

            if (key > arr[mid]) {
                st = mid + 1;
            }

            if (key < arr[mid]) {
                en = mid - 1;
            }
            if (st == en) {
                System.out.println("NOT FOUND");
                break;
            }
        }

        System.out.println("\nBY 23DCS045-HEET_KASODARIYA");
    }
}
