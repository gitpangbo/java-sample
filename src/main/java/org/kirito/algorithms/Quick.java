package org.kirito.algorithms;

class Quick {

	public static void main(String[] args) {
		int[] array = { 2, 4, 9, 3, 6, 7, 1, 5 };
		new Quick().sort(array, 0, array.length - 1);
	}

	public void sort(int arr[], int low, int high) {
		int left = low;
		int right = high;
		int povit = arr[low];

		while (left < right) {
			while (left < right && arr[right] >= povit)
				right--;
			if (left < right) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				left++;
			}

			while (left < right && arr[left] <= povit)
				left++;

			if (left < right) {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
				right--;
			}
		}
		System.out.println(arr);
		System.out.print("l=" + (left + 1) + "h=" + (right + 1) + "povit="
				+ povit + "\n");
		if (left > low)
			sort(arr, low, left - 1);
		if (right < high)
			sort(arr, left + 1, high);
	}
}