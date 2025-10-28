```python
def bubble_sort(arr):
    """
    Функция для сортировки массива методом пузырька
    """
    n = len(arr)
    
    # Проходим по всем элементам массива
    for i in range(n - 1):
        # Последние i элементов уже на своем месте
        for j in range(n - i - 1):
            # Сравниваем соседние элементы
            if arr[j] > arr[j + 1]:
                # Меняем местами, если они стоят в неправильном порядке
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

def print_array(arr):
    """
    Функция для вывода массива
    """
    for value in arr:
        print(value, end=" ")
    print()

# Пример использования
if __name__ == "__main__":
    arr = [64, 34, 25, 12, 22, 11, 90]
    
    print("Исходный массив:")
    print_array(arr)
    
    bubble_sort(arr)
    
    print("Отсортированный массив:")
    print_array(arr)
```
