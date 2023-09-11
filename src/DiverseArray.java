public class DiverseArray {

    public static int arraySum(int[] arr) {
        int s = 0;
        for(int n : arr) {
            s += n;
        }
        return s;
    }

    public static int[] rowSums(int[][] array2d) {
        int rows = array2d.length;
        int[] rowSums = new int[rows];

        for(int i=0; i<rows; i++) {
            int sum = 0;
            for(int j=0; j<array2d[i].length; j++) {
                sum += array2d[i][j];
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }

    public static boolean isDiverse(int[][] array2d) {

        for(int i=0; i<array2d.length; i++) {
            for(int j=0; j<array2d.length; j++) {
                if(i != j) {
                    if(arrayEquals(array2d[i], array2d[j])) {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    private static boolean arrayEquals(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length) {
            return false;
        }

        for(int i=0; i<arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}