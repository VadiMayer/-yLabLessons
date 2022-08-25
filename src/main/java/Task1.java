
public class Task1 {

    //1. Заполните массив случайными числами и выведите максимальное, минимальное и среднее значение.

    public static void main(String[] args) {

        int[] array = {20,54,6,2,5,1,74,43};

        sortArray(array);

        int min = array[0];
        double average = getAverage(array);
        int max = array[array.length - 1];

        System.out.println("Minimum value " + min
                + "\nAverage value " + average
                + "\nMaximum value " + max);

    }
    private static double getAverage(int[] array) {
        double average;
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        average = sum / ((double) array.length);
        return average;
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void sortArray(int[] array) {
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i-1);
                    needIteration = true;
                }
            }
        }
    }
}
