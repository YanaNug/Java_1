import java.util.ArrayList;
import java.util.Scanner;

public class Homework4 {
        public static void main(String[] args) {
        System.out.println("Введите строку и номер (разделитель ~): ");
        System.out.println("Для выхода введите exit");
        System.out.println("Для вывода в консоль строки введите print~(номер)");
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listData = new ArrayList<>();
        while (true) {
            String text = sc.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("~")[1]);
            } catch (Exception e) {
                System.out.println("Проверьте введенную строку");
            }
            String[] consData = text.split("~");
            int num = Integer.parseInt(consData[1]);
            int localSize = num - listData.size();
            for (int i = 0; i <= localSize; i++) {
                listData.add(null);
            }
            if (consData[0].equals("print")) {
                System.out.println(listData.get(num));
            } else {
                listData.set(num, consData[0]);
            } 
        }
    }

}
