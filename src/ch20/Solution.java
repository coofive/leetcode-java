package ch20;

import java.util.*;

/**
 * @author : coofive
 * @version : 1.0.0
 * @date : 2020-08-12 05:58
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '{') {
                stack.push('}');
                continue;
            }
            if (ch == '(') {
                stack.push(')');
                continue;
            }
            if (ch == '[') {
                stack.push(']');
                continue;
            }
            // 不符合上面的条件，栈仍然为空，说明无法找到左括号，直接返回false
            if (stack.isEmpty()) {
                return false;
            }
            if (stack.pop() != ch) {
                return false;
            }
        }
        return stack.empty();
    }
}
