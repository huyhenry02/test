import java.util.Scanner;

public class checkLetter {
    public static void main(String[] args) {
        boolean isVowel;;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào kí tự cần kiểm tra : ");

        char ch = scanner.next().charAt(0);
        scanner.close();

        isVowel = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            default -> false;
        };
        if(isVowel) {
            System.out.println(ch+" Là nguyên âm");
        }
        else {
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
                System.out.println(ch+" Là phụ âm");
            else
                System.out.println("Không nằm trong bảng chữ cái!");
        }
    }
}
