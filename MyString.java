public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if('A' <= cur && cur <= 'Z') {
                res += (char) (cur - 'A' + 'a');
            }
            else {
                res += cur;
            }
        }
        return res;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str2.length() > str1.length()) {
            return false;
        }
        int i = 0, j = 0;
        while(i < str1.length() && j < str2.length()) {
            if(str1.charAt(i) == str2.charAt(j)) {
                j++;
            }
            else{
                j = 0;
            }
            i++;
        }
        return j >= str2.length() - 1;
    }
}
