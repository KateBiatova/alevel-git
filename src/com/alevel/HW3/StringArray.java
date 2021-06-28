package com.alevel.HW3;

public class StringArray {
    int[] originalArray;

    //Создать класс StringArray с конструктором который будет принимать переменное
    // количество аргументов и помещать эти аргументы во внутреннее поле класса (массив).
    public int[] createArray (int... myArray){
        int[] array = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++)  {
            array[i] = myArray[i];
        }
        this.originalArray = array;
        return array;
    }

    //Создать метод который будет возвращать пронумерованный массив
    // одной строкой, пример: “1: первый элемент; 2: второй элемент”
    public String toOneSting (){
        String stringFromArray = "";
        for (int i=0; i < originalArray.length; i++) {
            stringFromArray = stringFromArray + (i+1) + ':' + originalArray[i] + ", ";
        }
        String oneString = stringFromArray.substring(0, stringFromArray.length()-2);
        return oneString;
    }

    //Создать метод для сортировки в прямом порядке методом вставки
    public int[] insertSorting (int[] myArray) {
        int temp; int before;
        for (int i = 0; i < myArray.length; i++) {
            temp = myArray[i];
            for (before = i - 1; before >= 0 && myArray[before] > temp; before--) {
                myArray[before + 1] = myArray[before];
            }
            myArray[before + 1] = temp;
        }
        return myArray;
    }

    //Создать метод для сортировки в обратном порядке методом вставки
    public int[] insertSortingDecrease (int[] myArray) {
        int temp; int before;
        for (int i = 0; i < myArray.length; i++) {
            temp = myArray[i];
            for (before = i - 1; before >= 0 && myArray[before] < temp; before--) {
                myArray[before + 1] = myArray[before];
            }
            myArray[before + 1] = temp;
        }
        return myArray;
    }
}
