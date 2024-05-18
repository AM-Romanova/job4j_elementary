package ru.job4j.array;

public class SwitchArray {
    public static int[] swapBorder(int[] array, int source, int dest) {
        int temp = array[source];
        array[source] = array[dest - 1];
        array[dest - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] result = swapBorder(array, 0, 5);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }
    }
}
