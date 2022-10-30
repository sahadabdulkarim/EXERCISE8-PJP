import java.util.Scanner;

public class Exercise8 {
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
            if (array[i] == 6) {
                for (int k = 0; k < i; ++k) {
                    lowSum += array[k];
                }
                System.out.println("lowsum" + lowSum);

            }
            if (array[i] == 7) {
                for (int l = i + 1; l < n; ++l) {
                    Highsum += array[l];
                }
                System.out.println("highsum:" + Highsum);
            }
        }
        sum = Highsum + lowSum;
        System.out.println("sum" + sum);
    }

}
