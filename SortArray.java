import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int lowSum = 0;
        int Highsum = 0;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit of the array");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements in the array::");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            sum += array[i];
            if (array[i] == 6) {
                for (int k = i + 1; k < n; ++k) {
                    if (array[k] == 7) {
                        i = k;
                        continue;

                    }
                }

            }

        }
        System.out.println("sum" + sum);
    }

}
