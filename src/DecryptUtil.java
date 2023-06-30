
public class DecryptUtil {
    // Метод для расшифровки текста
    public static final String ALPHABET = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя.,:\"-!? ";
    static String decrypt(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            int index = ALPHABET.indexOf(c);
            if (index != -1) {
                int newIndex = (index - key + ALPHABET.length()) % ALPHABET.length();
                result.append(ALPHABET.charAt(newIndex));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
