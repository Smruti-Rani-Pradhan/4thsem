import java.util.HashMap;
public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);

            if (!charCountMap.containsKey(c)) {
                return false;
            }

            charCountMap.put(c, charCountMap.get(c) - 1);

            if (charCountMap.get(c) < 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
