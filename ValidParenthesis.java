import java.util.*;

public class ValidParenthesis {
    public static boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0)
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                stack.push(s.charAt(i));
            else if (!(map.values().contains(s.charAt(i)) &&
                    (!stack.isEmpty() && s.charAt(i) == map.get(stack.pop()))))
                return false;
        }

        return (stack.size() != 0 || stack.isEmpty()) ? false : true;
    }
}
