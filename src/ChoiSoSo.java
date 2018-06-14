import java.util.Random;
import java.util.Scanner;

public class ChoiSoSo {
    public static void main(String[] args) {
        while (true) {
        Random rd = new Random();
        int so_dau = rd.nextInt(10);
        int so_thu_hai = rd.nextInt(10);
        int a, b;
        Scanner sc = new Scanner(System.in);
            System.out.print("Mời bạn nhập số thứ nhất: ");
            a = Integer.parseInt(sc.nextLine());
            System.out.print("Mời bạn nhập số thứ hai: ");
            b = Integer.parseInt(sc.nextLine());

            if (a == so_dau && b == so_thu_hai) {
                System.out.println("Bạn đã trúng độc đắc. Số tiền bạn nhận được là: " + "10000$");
            } else if (a == so_dau || b == so_dau || a == so_thu_hai || b == so_thu_hai) {
                System.out.println("Bạn đạ đoán trúng 1 số. Phần thưởng của bạn là: " + "1000$");
            }else {
                System.out.println("Bạn tạch rồi!");
            }

            System.out.printf("%s%d%d", "Số bạn cần phải đoán là: ", so_dau, so_thu_hai);
            System.out.println();
            System.out.println("-----------------------------------------------------");
        }
    }
}
