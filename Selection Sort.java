public class SelectionSort {

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        // Проходим по всем элементам массива
        for (int i = 0; i < n - 1; i++) {
            // Находим минимальный элемент в неотсортированной части
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Меняем найденный минимальный элемент с первым элементом
            // в неотсортированной части
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Исходный массив:");
        printArray(array);
        
        selectionSort(array);
        
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}
