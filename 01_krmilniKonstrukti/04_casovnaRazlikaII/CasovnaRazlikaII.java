import java.util.Scanner;

class CasovnaRazlikaII {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // vhodni podatki
    int h1 = sc.nextInt();
    int m1 = sc.nextInt();
    int h2 = sc.nextInt();
    int m2 = sc.nextInt();

    int razlikaUre = h2 - h1;
    int razlikaMinute = m2 - m1;

    // v kolikor pride do prenosa, ga moramo "pohendlati"
    // od razlike v urah odštejemo eno uro in na novo izračunamo razliko med minutami
    if(razlikaMinute < 0) {
      razlikaUre = razlikaUre -1;
      razlikaMinute = 60 + razlikaMinute;
    }

    System.out.printf("%d:%02d", razlikaUre, razlikaMinute);
  }
}
