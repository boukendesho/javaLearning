public class StringDemo {
    public static void main(String[] args) {
        String string = "Java Language";

//        Cannot access string's character through index
//        System.out.println(string[0]);
//        two ways to iterate a string
        char[] chars = string.toCharArray();
        for (char chr : chars) {
            System.out.println(chr);
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.println(string.charAt(i));
        }

    }
}
