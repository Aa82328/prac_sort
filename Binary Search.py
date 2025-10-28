def binary_search(arr, target):
    """
    Функция для бинарного поиска элемента в отсортированном массиве
    """
    left = 0
    right = len(arr) - 1
    
    while left <= right:
        # Находим середину массива
        mid = left + (right - left) // 2
        
        # Проверяем средний элемент
        if arr[mid] == target:
            return mid  # Элемент найден
        
        # Если искомый элемент меньше среднего
        elif arr[mid] > target:
            right = mid - 1  # Перемещаемся влево
        
        # Если искомый элемент больше среднего
        else:
            left = mid + 1  # Перемещаемся вправо
    
    return -1  # Элемент не найден

# Пример использования
if __name__ == "__main__":
    sorted_array = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
    target = 7
    
    print("Отсортированный массив:", sorted_array)
    print("Искомый элемент:", target)
    
    result = binary_search(sorted_array, target)
    
    if result != -1:
        print(f"Элемент найден на позиции: {result}")
    else:
        print("Элемент не найден")
    
    # Дополнительные примеры
    print("\nДополнительные примеры:")
    
    # Поиск существующего элемента
    target2 = 13
    result2 = binary_search(sorted_array, target2)
    print(f"Поиск {target2}: {'найден на позиции ' + str(result2) if result2 != -1 else 'не найден'}")
    
    # Поиск несуществующего элемента
    target3 = 8
    result3 = binary_search(sorted_array, target3)
    print(f"Поиск {target3}: {'найден на позиции ' + str(result3) if result3 != -1 else 'не найден'}")
    
    # Поиск первого элемента
    target4 = 1
    result4 = binary_search(sorted_array, target4)
    print(f"Поиск {target4}: {'найден на позиции ' + str(result4) if result4 != -1 else 'не найден'}")
    
    # Поиск последнего элемента
    target5 = 19
    result5 = binary_search(sorted_array, target5)
    print(f"Поиск {target5}: {'найден на позиции ' + str(result5) if result5 != -1 else 'не найден'}")
