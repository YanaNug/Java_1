
import java.nio.file.Path;
import java.nio.file.Files;
public class Homework2 {


public static void main(String[] args) {

    System.out.println(characterRepetition(6, 'a', 'b'));

    System.out.println(wordRepetition("Text ", 100));

    saveFile(wordRepetition("Text ", 100));
}

// // Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1. (6, 'a', 'b') -> "ababab"
static String characterRepetition(int n, char c1, char c2) {
    if (n % 2 == 0) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append(c1);
            else sb.append(c2);
        }
        return sb.toString();
    } else return "n not even. Exit program.";
}

//Создать файл с названием file.txt.Если файл уже есть,создавать не надо.Записать в него Слово "TEXT" 100раз
static String wordRepetition(String s , int n) {
    return s.repeat(n);
}

static void saveFile(String createdString) {
    try {
        Path of = Path.of("file.txt");

        if (!Files.exists(of)) {
            System.out.println("file.created");
            Files.createFile(of);
            Files.writeString(of,createdString);
        } else {
            System.out.println("file.existed");
        }
    } catch (Exception e){
        e.getMessage();
    }
}
}