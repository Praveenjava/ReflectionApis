package in.praveenit.inst;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 6, 7, 8, 9, 1, 0 };
		int temp = 0; // Swap the numbers

		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		for (int n : arr) {
			System.out.print(" " + n);
		}
	}

}
