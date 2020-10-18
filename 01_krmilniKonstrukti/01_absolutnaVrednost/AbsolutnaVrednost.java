import java.util.Scanner;

public class AbsolutnaVrednost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prebranoStevilo = sc.nextInt();
        int absolutnaVrednost = 0;

        /*
            ce je prebrano stevilo vecje ali enako 0, je absolutna vrednost enaka prebranemu stevilu,
            ce je prebrano stevilo manjse od 0, je absolutna vrednost enaka prebranemu stevilu pomnozenemu z -1
        */
        if(prebranoStevilo >= 0) {
            absolutnaVrednost = prebranoStevilo;
        } else {
            absolutnaVrednost = prebranoStevilo*(-1);
        }

        System.out.println(absolutnaVrednost);
    }

}