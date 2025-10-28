#include <iostream>
using namespace std;

// Функция для сортировки массива методом пузырька
void bubbleSort(int arr[], int n) {
    // Проходим по всем элементам массива
    for (int i = 0; i < n - 1; i++) {
        // Последний i элементов уже на своем месте
        for (int j = 0; j < n - i - 1; j++) {
            // Сравниваем соседние элементы
            if (arr[j] > arr[j + 1]) {
                // Меняем местами, если они стоят в неправильном порядке
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
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
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Исходный массив:" << endl;
    printArray(arr, n);
    
    bubbleSort(arr, n);
    
    cout << "Отсортированный массив:" << endl;
    printArray(arr, n);
    
    return 0;
}
