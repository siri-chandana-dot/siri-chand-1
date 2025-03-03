
import java.util.HashMap;
class DuplicateCharacters {
    public static void findDuplicates(char[] arr) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char c : arr) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        System.out.println("Duplicate characters:");
        for (char key : charCount.keySet()) {
            if (charCount.get(key) > 1)
			{
                System.out.println(key + " " + charCount.get(key) + " times");
            }
        }
    }
    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'a', 'd', 'b', 'e', 'f', 'g', 'c'};
        findDuplicates(charArray);
    }
}
