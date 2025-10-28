import java.util.Arrays;

public class FibonacciSearch {

    public static int fibonacciSearch(int[] arr, int x) {
        int n = arr.length;
        
        // Находим наименьшее число Фибоначчи, большее или равное n
        int fibM2 = 0; // (m-2)-е число Фибоначчи
        int fibM1 = 1; // (m-1)-е число Фибоначчи
        int fibM = fibM2 + fibM1;
        
        // Находим m такое, что F[m] >= n
        while (fibM < n) {
            fibM2 = fibM1;
            fibM1 = fibM;
            fibM = fibM2 + fibM1;
        }
        
        // Маркер для элементов, которые не входят в массив
        int offset = -1;
        
        // Поиск
        while (fibM > 1) {
            // Проверяем возможный индекс
            int i = Math.min(offset + fibM2, n - 1);
            
            // Если x больше элемента, переходим к правому подмассиву
            if (arr[i] < x) {
                fibM = fibM1;
                fibM1 = fibM2;
                fibM2 = fibM - fibM1;
                offset = i;
            }
            // Если x меньше элемента, переходим к левому подмассиву
            else if (arr[i] > x) {
                fibM = fibM2;
                fibM1 = fibM1 - fibM2;
                fibM2 = fibM - fibM1;
            }
            // Элемент найден
            else {
                return i;
            }
        }
        
        // Проверяем последний элемент
        if (fibM1 == 1 && offset + 1 < n && arr[offset + 1] == x) {
            return offset + 1;
        }
        
        return -1; // Элемент не найден
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
        int[] arr = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100};
        int x = 85;
        
        System.out.println("Отсортированный массив:");
        printArray(arr);
        System.out.println("Искомый элемент: " + x);
        
        int result = fibonacciSearch(arr, x);
        
        if (result != -1) {
            System.out.println("Элемент найден на позиции: " + result);
        } else {
            System.out.println("Элемент не найден");
        }
        
        // Дополнительные примеры
        System.out.println("\nДополнительные примеры:");
        
        // Поиск существующего элемента
        int x2 = 50;
        int result2 = fibonacciSearch(arr, x2);
        System.out.println("Поиск " + x2 + ": " + 
            (result2 != -1 ? "найден на позиции " + result2 : "не найден"));
        
        // Поиск несуществующего элемента
        int x3 = 75;
        int result3 = fibonacciSearch(arr, x3);
        System.out.println("Поиск " + x3 + ": " + 
            (result3 != -1 ? "найден на позиции " + result3 : "не найден"));
        
        // Поиск первого элемента
        int x4 = 10;
        int result4 = fibonacciSearch(arr, x4);
        System.out.println("Поиск " + x4 + ": " + 
            (result4 != -1 ? "найден на позиции " + result4 : "не найден"));
        
        // Поиск последнего элемента
        int x5 = 100;
        int result5 = fibonacciSearch(arr, x5);
        System.out.println("Поиск " + x5 + ": " + 
            (result5 != -1 ? "найден на позиции " + result5 : "не найден"));
    }
}
