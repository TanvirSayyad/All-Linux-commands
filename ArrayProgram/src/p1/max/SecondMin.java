package p1.max;

public class SecondMin {

	public static void main(String[] args) {
		int temp; // Temporary variable for swapping
		int[] a = { 1, 2, 4, 5, 6, 7, 8, 9 }; // Array of integers

		// Bubble Sort to sort the array in ascending order
		for (int i = 0; i < a.length - 1; i++) { // Outer loop: iterate through each element
			for (int j = i + 1; j < a.length; j++) { // Inner loop: compare with the next elements
				if (a[i] > a[j]) { // If the current element is greater than the next, swap
					temp = a[j]; // Store the next element in temp
					a[j] = a[i]; // Move current element to the next position
					a[i] = temp; // Assign the temp (next element) to current position
				}
			}
		}

		// Print the second minimum element (which will be at index 1 after sorting)
		System.out.println("Second minimum number: " + a[3]);
	}
}
