import java.util.*;

public class Smucanje2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int steviloSmucarjev = sc.nextInt();

    int najboljsiCas = Integer.MAX_VALUE;
    int najboljsiSmucar = -1;
    for(int i = 0; i < steviloSmucarjev; i++) {
      int prviCas = sc.nextInt();
      if(prviCas != 0) {
        int drugiCas = sc.nextInt();
        if(drugiCas != 0) {
          int skupniCas = prviCas + drugiCas;
          if(najboljsiCas > skupniCas) {
            najboljsiCas = skupniCas;
            najboljsiSmucar = i+1;
          }
        }
      }

    }

    if(najboljsiSmucar == -1) {
      System.out.println("NIHCE");
    } else {
      System.out.printf("%d%n%d%n", najboljsiSmucar, najboljsiCas);
    }
  }
}
