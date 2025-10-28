
#include <iostream>
using namespace std;

// Функция для разбиения массива
int partition(int arr[], int low, int high) {
    // Выбираем последний элемент в качестве опорного
    int pivot = arr[high];
    int i = (low - 1); // Индекс меньшего элемента

    for (int j = low; j <= high - 1; j++) {
        // Если текущий элемент меньше или равен опорному
        if (arr[j] <= pivot) {
            i++;
            // Меняем местами arr[i] и arr[j]
            swap(arr[i], arr[j]);
        }
    }
    
    // Меняем местами arr[i+1] и arr[high] (опорный элемент)
    swap(arr[i + 1], arr[high]);
    return (i + 1);
}

// Основная функция быстрой сортировки
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // pi - это индекс разбиения, arr[pi] находится на своем месте
        int pi = partition(arr, low, high);

        // Отсортировать элементы до и после разбиения
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

// Функция для вывода массива
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int arr[] = {10, 7, 8, 9, 1, 5};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Исходный массив:" << endl;
    printArray(arr, n);
    
    quickSort(arr, 0, n - 1);
    
    cout << "Отсортированный массив:" << endl;
    printArray(arr, n);
    
    return 0;
}
