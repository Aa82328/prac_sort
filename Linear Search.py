
def linear_search(arr, target):
    """
    Функция для линейного поиска элемента в массиве
    """
    # Проходим по всем элементам массива
    for i in range(len(arr)):
        # Если нашли искомый элемент
        if arr[i] == target:
            return i  # Возвращаем индекс найденного элемента
    
    return -1  # Возвращаем -1, если элемент не найден

# Пример использования
if __name__ == "__main__":
    array = [3, 5, 2, 7, 9, 1, 4]
    target = 7
    
    print("Массив:", array)
    print("Искомый элемент:", target)
    
    result = linear_search(array, target)
    
    if result != -1:
        print(f"Элемент найден на позиции: {result}")
    else:
        print("Элемент не найден")
    
    # Дополнительные примеры
    print("\nДополнительные примеры:")
    
    # Поиск существующего элемента
    target2 = 5
    result2 = linear_search(array, target2)
    print(f"Поиск {target2}: {'найден на позиции ' + str(result2) if result2 != -1 else 'не найден'}")
    
    # Поиск несуществующего элемента
    target3 = 10
    result3 = linear_search(array, target3)
    print(f"Поиск {target3}: {'найден на позиции ' + str(result3) if result3 != -1 else 'не найден'}")
