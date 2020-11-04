package Problem1;

public class BinarySearch {
    // This is to be done recursively
    // Do not change signature (return type, function name, parameter types)
    // Add a helper function for recursion calls
    public static int binarySearch(int[] data, int target) {
        return binarySearch(data, 0, data.length - 1, target);
    }

    private static int binarySearch(int[] data, int l, int r, int target) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (data[mid] == target)
                return mid;

            if (data[mid] > target)
                return binarySearch(data, l, mid - 1, target);

            return binarySearch(data, mid + 1, r, target);
        }

        return -1;
    }

}