import java.util.*;

public class Smucanje {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int stTekmovalcev = sc.nextInt();

    int najboljsiTekmovalec = -1;
    int najboljsiCas = -1;

    // prva vožnja čas 70, druga vožnja čas 80

    for(int trenutniTekmovalec = 1; trenutniTekmovalec < (stTekmovalcev +1); trenutniTekmovalec++) {
      int prvaVoznja = sc.nextInt();
      if(prvaVoznja == 0) {
        //tekmovalec diskvalificiran
        continue;
      }
      int drugaVoznja = sc.nextInt();
      if(drugaVoznja == 0) {
        //tekmovalec diskvalificiran
        continue;
      }

      int skupenCas = prvaVoznja + drugaVoznja;
      if(skupenCas < najboljsiCas || najboljsiCas == -1) {
        // dobimo nov najboljši čas
        najboljsiCas = skupenCas;
        najboljsiTekmovalec = trenutniTekmovalec;
      }
    }

    if(najboljsiTekmovalec == -1) {
      System.out.println("NIHCE");
    } else {
      System.out.println(najboljsiTekmovalec);
      System.out.println(najboljsiCas);
    }
  }
}
