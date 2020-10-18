import java.util.Scanner;

public class CasovnaRazlikaI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ure1 = sc.nextInt();
        int minute1 = sc.nextInt();
        int ure2 = sc.nextInt();
        int minute2 = sc.nextInt();

        // uporabimo za hranjenje vmesne vsote
        int vsotaMinut = 0;

        // izracunamo razliko med ure2 in ure1 v urah, pomnozmi s 60, da dobimo minute
        vsotaMinut = (ure2 - ure1) * 60;

        // vsoti dodamo minute2
        vsotaMinut = vsotaMinut + minute2;

        // in odstejemo minute1
        vsotaMinut = vsotaMinut - minute1;

        System.out.println(vsotaMinut);
    }
}
