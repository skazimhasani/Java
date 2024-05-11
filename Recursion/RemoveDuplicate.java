package Recursion;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "aaapppnnnacollege";
        removeDuplicate(str, new StringBuilder(), 0, new boolean[26]);
    }

    public static void removeDuplicate(String str, StringBuilder newStr, int idx, boolean map[]) {
        // Base Case
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicate(str, newStr, idx + 1, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, newStr.append(currChar), idx + 1, map);
        }
    }

}
