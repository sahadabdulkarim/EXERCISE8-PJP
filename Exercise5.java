public class Exercise5 {
    public static void main(String args[]) {
        int a[] = new int[] { 30, 2, 20, 34, 12, 67 };
        int smallest = a[0];
        int largest = a[0];
        int secondLarge = 0, secondSmall = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                secondSmall = smallest;
                smallest = a[i];
            } else if (secondSmall == 0 || secondSmall > a[i]) {
                secondSmall = a[i];
            } else if (a[i] > largest) {
                secondLarge = largest;
                largest = a[i];
            } else if (secondLarge == 0 || secondLarge < a[i]) {
                secondLarge = a[i];
            }

        }
        System.out.println(smallest + " " + largest);
        System.out.println(secondSmall + " " + secondLarge);
    }
}
/*
 * for (int i = 0; i < a.length; i++) {
 * if (a[i] < smallest) {
 * smallest = a[i];
 * }
 * if (a[i] > largest) {
 * largest = a[i];
 * }
 * }
 */
