public class App {
    public static void main(String[] args) throws Exception {
        
        int [] array1 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(binarySearch(array1, 3));
        
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
