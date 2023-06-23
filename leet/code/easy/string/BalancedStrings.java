package leet.code.easy.string;

public class BalancedStrings {

  public static int balancedStringSplit(String s) {
    String[] charas = s.split("");

    int r = 0;
    int l = 0;

    int total = 0;
    for (int i = 0; i < charas.length; i++) {
      String c = charas[i];
      if (c.equals("R")) {
        r = r + 1;
      } else if (c.equals("L")) {
        l = l + 1;
      }

      if (r == l) {
        r = 0;
        l = 0;

        total++;
      }
    }
    return total;
  }

  public static void main(String[] args) {
    // Test case 1
    System.out.println(balancedStringSplit("RLRRLLRLRL"));
    // Test case 2
    System.out.println(balancedStringSplit("RLRRRLLRLL"));
    // Test case 3
    System.out.println(balancedStringSplit("LLLLRRRR"));
  }
}
