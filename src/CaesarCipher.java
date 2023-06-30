import java.io.*;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к текстовому файлу: ");

        String filePath = scanner.nextLine();
        try {
            File inputFile = new File(filePath);
            Scanner fileScanner = new Scanner(inputFile);

            StringBuilder text = new StringBuilder();
            while (fileScanner.hasNextLine()) {
                text.append(fileScanner.nextLine()).append("\n");
            }
            System.out.println("Выберите режим:");
            System.out.println("1. Шифрование");
            System.out.println("2. Расшифровка");
            System.out.println("3. Криптоанализ методом brute force");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введите ключ для шифрования: ");
                    int encryptKey = scanner.nextInt();
                    String encryptedText = EncryptionUtil.encrypt(text.toString(), encryptKey);
                    System.out.println("Зашифрованный текст: " + encryptedText);
                    break;
                case 2:
                    System.out.println("Введите ключ для расшифровки: ");
                    int decryptKey = scanner.nextInt();
                    String decryptedText = DecryptUtil.decrypt(text.toString(), decryptKey);
                    System.out.println("Расшифрованный текст: " + decryptedText);
                    break;
                case 3:
                    bruteForceDecryptUtil.bruteForceDecrypt(text.toString());
                    break;
                default:
                    System.out.println("Неверный выбор.");
                    break;
            }

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } finally {
            scanner.close();
        }
    }
}