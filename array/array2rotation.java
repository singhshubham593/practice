import java.util.Arrays;
//rotating array index value
/*
Given Array is
[1, 2, 3, 4, 5]
Rotated Array is
[5, 1, 2, 3, 4]
 */
public class array2rotation {
        static int arr[] = new int[]{1, 2, 3, 4, 5};

        // Method for rotation
        static void rotate()
        {
            int x = arr[arr.length-1], i;
            for (i = arr.length-1; i > 0; i--)
                arr[i] = arr[i-1];
            arr[0] = x;
        }

        /* Driver program */
        public static void main(String[] args)
        {
            System.out.println("Given Array is");
            System.out.println(Arrays.toString(arr));

            rotate();

            System.out.println("Rotated Array is");
            System.out.println(Arrays.toString(arr));
        }
}

// output =[5,1,2,3,4]
