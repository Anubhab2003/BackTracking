public class Permutation2{
    public static void find(String str, String ans) {
        // Base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            find(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        find(str, "");
    }
}
