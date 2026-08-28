package tasks1;

public class FirstNonRepeating {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2};
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("First Non-Repeating Element: " + arr[i]);
                break;
            }
            else {
            	 System.out.println("No non repeating elements");
            	 break;
            }
        }
    }
}