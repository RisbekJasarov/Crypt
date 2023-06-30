
public class bruteForceDecryptUtil {

    public static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя.,:\"-!? ";

    // Метод для взлома шифра методом brute force
    static void bruteForceDecrypt(String encryptedText) {

        for (int key = 0; key < ALPHABET.length(); key++) {
            String decryptedText = DecryptUtil.decrypt(encryptedText, key);
            System.out.println("Key: " + key);
            System.out.println("Decrypted Text: " + decryptedText);
            System.out.println("----------------------------------");
        }
    }
}
