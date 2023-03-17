import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework3 {

        public static void main(String[] args) {
                     
            ArrayList<Integer> intNum = new ArrayList<>(Arrays.asList(77, 5, 132, 3, 16, 6, 4, 10, 78, 9, 1));
            removeOddNumbers(intNum);
            System.out.println(intNum);

            ArrayList<String> list1 = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
            removeNumbers(list1);
            System.out.println(list1);
        }

        // Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.
        private static void removeOddNumbers(List<Integer> arg) {
            for (int i = 0; i < arg.size(); i++) {
                if (arg.get(i) % 2 != 0) {
                    arg.remove(i--);
                }
            }
        }
    
    // Дан список ArrayList<String>. Удалить из него все строки, которые являются числами Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]
    
        private static void removeNumbers(ArrayList<String> arr) {
            for (int i = 0; i < arr.size(); i++) {
                try {
                    Integer.parseInt(arr.get(i));
                    arr.remove(i--);
                }
                catch (Exception e){}
            }
        }
    }