package test;
import java.util.Scanner;
public class BaiTapBuoi2 {
    public static void main(String[] args)
    {
        int n;
        Scanner scanner =new Scanner(System.in);
        System.out.printf("Nhap n: ");
        n=scanner.nextInt();
        System.out.println("So vua nhap la: "+n);
        int kt=1;
        for (int i=2;i*i<=n;i++)
        {
            if (n%i==0)
            {
                kt=0;
                break;
            }
        }
        if (n==2) kt=1;
        if (n<=1) kt=0;
        if (kt==1) System.out.println(n+" la so nguyen to");
        else System.out.println(n+" ko la so nguyen to");
    }
}
