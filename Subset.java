public class Subset {
    public static void findsubset(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("NULL");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Recursion
        // Choice Yes
        findsubset(str, ans + str.charAt(i), i + 1);
        // Choice No
        findsubset(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findsubset(str, " ", 0);
    }
}
