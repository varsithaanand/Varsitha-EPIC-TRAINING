package tasks1;

public class TriplepairRev {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length - 1; i += 3) {
            int temp = arr[i];
            arr[i] = arr[i + 2];
            arr[i + 2] = temp;
        }

        for (int i=0;i<arr.length;i++ ) {
            System.out.print(arr[i] + " ");
        }

	}

}
