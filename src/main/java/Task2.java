import java.util.Arrays;

//2. Отсортируйте массив [5,6,3,2,5,1,4,9]

public class Task2 {

    public static void main(String[] args) {
        int[] array = {5,6,3,2,5,1,4,9};
        Task1.sortArray(array);
        System.out.println(Arrays.toString(array));
    }
}
