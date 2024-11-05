import java.util.Scanner;

public class InputOutputBank {
    static Scanner scanner = new Scanner(System.in);
    
    static void inputBank(Account account) {
        System.out.println("Enter your account number: ");
        account.setAccountNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Enter your account name: ");
        account.setAccountName(scanner.nextLine());
        account.setBalance(100000);
    }
    
    public static void main(String[] args) {
        Account[] a = null;
        boolean flag = true;
        int b, n = 0;
        double amount, interestRate;
        long s, d, c, f;
        do {
            System.out.println("what do you need?");
            System.out.println("""
                    1.Nhập thông tin của các khách hàng
                    2.Xuất danh sách thông tin của các khách hàng
                    3.Nạp tiền
                    4.Rút tiền
                    5.Đáo hạn
                    6.Chuyển khoản
                    Số khác để thoát""");
            b = scanner.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Enter number of accounts: ");
                    n = scanner.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        a[i] = new Account();
                        inputBank(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].printAccount();
                    }
                    break;
                case 3:
                    System.out.println("Enter your account number: ");
                    s = scanner.nextLong();
                    System.out.println("Enter money need recharge: ");
                    amount = scanner.nextDouble();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getAccountNumber();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].rechargeMoney(amount);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
                    s = scanner.nextLong();
                    System.out.println("Nhập số tiền cần rút: ");
                    amount = scanner.nextDouble();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getAccountNumber();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].withdrawMoney(amount);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
                    s = scanner.nextLong();
                    System.out.println("Nhập lãi suất: ");
                    interestRate = scanner.nextDouble();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getAccountNumber();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].maturity(interestRate);
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
                    s = scanner.nextLong();
                    System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
                    c = scanner.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getAccountNumber();
                        if (s == d) {
                            chuyen = a[i].getBalance();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getAccountNumber();
                                if (c == f) {
                                    nhan = a[j].getBalance();
                                    System.out.println("Nhập số tiền cần chuyển");
                                    tienChuyen = scanner.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setBalance(chuyen);
                                        a[j].setBalance(nhan);
                                        System.out.println("Tài khoản số " + d + " vừa chuyển: $" + tienChuyen);
                                        System.out.println("Tài khoản số " + f + " vừa nhận: $" + tienChuyen);
                                    } else {
                                        System.out.println("Số tiền nhập không hợp lệ!");
                                    }
                                } else {
                                    System.out.println("Exception");
                                }
                            }
                        } else {
                            System.out.println("Exception");
                        }
                    }
                    break;
                    default:
                        System.out.println("Bye!!");
                        flag = false;
                        break;
            }
        } while (flag);
    }
}
