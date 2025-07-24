public class Main {
    public static void main(String[] args) {
        int[] numbers1 = {4,8,6,1,2,9,4};
        int[] numbers2 = {1,2,3,5,8,20};

        int index1 = findSmallestDistance(numbers1);
        int index2 = findSmallestDistance(numbers2);

        System.out.println(index1);
        System.out.println(index2);
    }

    public static int findSmallestDistance(int[] arr) {
        if (arr.length < 2) {
            return -1;
        }

        int max = arr[0];
        int min = arr[0];

        for (int num : arr) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        int minDistance = Math.abs(max - min);
        int minIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int distance = Math.abs(arr[i] - arr[i + 1]);
            if (distance < minDistance) {
                minDistance = distance;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
