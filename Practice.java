package StringProg;

public class Practice {

    public static int canMakeEmpty(String s) {
        // Count the occurrences of 'm' in the string
        int mCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'm') {
                mCount++;
            }
        }

        // If there's at least one 'm', it's possible to make the string empty
        return (mCount >= 1) ? 1 : 0;
    }

    public static void main(String[] args) {
        String stringA = "pamapam";
        int result = canMakeEmpty(stringA);
        System.out.println(result); // Output: 1
    }
}
