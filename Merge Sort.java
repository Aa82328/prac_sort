public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }
        
        int mid = arr.length / 2;
        
        // Делим массив на две части
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);
        
        // Рекурсивно сортируем каждую часть
        mergeSort(left);
        mergeSort(right);
        
        // Сливаем отсортированные части
        merge(arr, left, right);
    }
    
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        
        // Пока есть элементы в обоих массивах
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        
        // Добавляем оставшиеся элементы из левого массива
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        
        // Добавляем оставшиеся элементы из правого массива
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
    
    // Вспомогательный метод для вывода массива
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    // Основной метод для тестирования
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        
        System.out.println("Исходный массив:");
        printArray(array);
        
        mergeSort(array);
        
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}
