import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character c : s.toCharArray()) {
            charMap.compute(c, (k, v) -> (v == null) ? 1 : (v + 1));
        }

        for (Character c : t.toCharArray()) {
            try {
                charMap.computeIfPresent(c, (k,v) -> v-1);
                if(charMap.get(c) < 0){
                    return false;
                }
            } catch (Exception e){
                return false;
            }
        }
        if(charMap.values().stream().anyMatch(v -> v != 0))
            return false;
        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        System.out.println(va.isAnagram("anagram", "nagaram"));
    }
}
