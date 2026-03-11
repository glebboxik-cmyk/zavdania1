package zavdania1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаем инструмент для чтения

        System.out.print("Vvedit rechenia: ");
        String input = sc.nextLine();

        int length = input.length();
        System.out.println("Symvoliv: " + length);

        sc.close();
    }
}
