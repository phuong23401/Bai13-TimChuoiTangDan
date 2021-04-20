import java.util.LinkedList;
import java.util.Scanner;

public class AscendingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi bất kì: ");
        String string = scanner.nextLine();

        LinkedList<Character> str = new LinkedList<>();

        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > str.size()) {
                str.clear();
                str.addAll(list);
            }
            list.clear();
        }

        for (Character ch: str) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
