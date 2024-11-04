import java.util.Scanner;

public class InputOutputCar {
    static Scanner sc = new Scanner(System.in);
    
    static void inputCar(car xe) {
        System.out.print("Enter code Car: ");
        xe.setCodeCar(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter name car");
        xe.setChuXe(sc.nextLine());
        System.out.print("Nhập dung tích xe: ");
        xe.setVehicle(sc.nextInt());
        System.out.print("Nhập trị giá xe: ");
        xe.setTriGia(sc.nextDouble());
        sc.nextLine();
        System.out.print("Mô tả: ");
        xe.setMoTa(sc.nextLine());
    }
    
    public static void main(String[] args) {
        car[] c = null;
        int a, n = 0;
        boolean flag = true;
        do {
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin \n" +
                    "2.Xuất bảng kê khai tiền thuế của các xe.\n" +
                    "Nhập số khác để thoát");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    n = sc.nextInt();
                    c = new car[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i + 1));
                        c[i] = new car();
                        inputCar(c[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n", "Mã xe", "Chủ xe", "Dung tích", "Trị giá", "mô tả", "Thuế");
                    for (int i = 0; i < n; i++) {
                        c[i].inThue();
                    }
                    break;
                default:
                    System.out.println("bye");
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
