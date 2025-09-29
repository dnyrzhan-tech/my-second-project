import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("insert dohod: ");
        int doh = in.nextInt();

        System.out.print("insert rashod: ");
        int ras = in.nextInt();

        int ost = doh - ras;
        System.out.println("ostatok: " + ost);

        if (ost <= 0) {
            System.out.println("vam otkazano v credite po prichine: dohod menshe rashoda");
        }

        if (ost > 0) {
            System.out.println("vam razresheno v credite");
        }

        in.close();
    }
}
