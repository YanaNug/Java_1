import java.util.Arrays;
public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
    
        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false
    
        printString("abcd", 5); // abcdabcdabcdabcdabcd
    
        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3]; 
    
        System.out.println("\n" + isLeapYear(2023));
        
        System.out.println(Arrays.toString(createArray(2, 3)));
        int[] arrRev = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(elementsValues(arrRev)));

        int[] arr = new int[] { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(elementsLessSix(arr)));

        printMassMass(fillArrayByDiagonals(array));

    }
    
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int c = a + b;
        if (10 <= c && c <= 20) return true;
        return false;
    }
    
    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) return true;
        return false;
    }
    
    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            string.append(source);
        }
        System.out.print(string);


    }
    
    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }
    
    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        
        int[] array_1 = new int[len];

        for (int i = 0; i < len; i++) {
            array_1[i] = initalValue;
        }
        return array_1;
    }
    

 // Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static int[] elementsValues(int[] arr) {
       
        int[] reverseArray = arr;
        for (int i = 0; i < arr.length; i++) {
            if (reverseArray[i] == 1) reverseArray[i] = 0;
            else reverseArray[i] = 1;
        }
        return reverseArray;
    }

// Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static int[] elementsLessSix(int[] arr) {
        // Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] increaseByTwo = arr;
        for (int i = 0; i < increaseByTwo.length; i++) {
            if (increaseByTwo[i] < 6) increaseByTwo[i] = increaseByTwo[i] * 2;
        }
        return increaseByTwo;
    }


// Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
// * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]; Также заполнить элементы побочной диагонали

private static int[][] fillArrayByDiagonals(int[][] arr) {
    // заполнить диагональные элементы единицами
    int[][] fillArr = arr;
    for( int i = 0; i < fillArr.length; i++){
        for (int j = 0; j < fillArr[i].length; j++) {
            if (i == j || j == fillArr.length - 1 - i) fillArr[i][j] = 1;
            else fillArr[i][j] = 0;
        }
    }
    return fillArr;
}
private  static void printMassMass(int[][] arr) {
    for (int[] row : arr) System.out.println(Arrays.toString(row));
}
}