import java.util.Scanner;

public class myS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println(str1);
        }
        scan.close();
    }
}
