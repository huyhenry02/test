public class convertCharToString {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Kí tự ở vị trí " + i + " là: " + ch);
        }
    }
}
