import java.util.*;

public class StevilskaZaporedja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        /*
          (k != 0) && ((k > 0) &&  (a < b)) && (k < 0 && a > b)
          (k != 0) - k ni enako nič
          ((k > 0) &&  (a < b)) -  k je večji nič in hkrati a je manjši od b
          (k < 0 && a > b) - k je manjši od nič in hkrati a je večji od b

          k ni enak nič in hkrati k je večji od nič in hkrati a je manjši od b in hkrati k je manjši od nič in hkrati a je večji od b

           k ni enak nič ali k je večji od nič in hkrati a je manjši od b ali k je manjši od nič in hkrati a je večji od b
        */

        if( ((k != 0) && ((k > 0) && (a < b)) ) || ((k != 0) && (k < 0 && a > b)) ) {
          if(a < b) {
            int tekoce = a;
            while(tekoce < b) {
              System.out.println(tekoce);
              tekoce = tekoce + k;
            }
          } else {
            int tekoce = a;
            while(tekoce >= b) {
              System.out.println(tekoce);
              tekoce = tekoce + k;
            }
          }
        }  else if (a == b) {
          System.out.println(a);
        } else {
          System.out.println("NAPAKA");
        }

        /*
        if(k == 0) {
        izpiši napaka
      } else if () {
      napaka
    } else if () {
    napaka
  } else {
  dejansko neki naredimo
}
        */
    }
}
