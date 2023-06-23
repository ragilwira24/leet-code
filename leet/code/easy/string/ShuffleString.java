package leet.code.easy.string;

import java.util.*;
import java.util.stream.Collectors;

public class ShuffleString {

  public static String restoreString(String s, int[] indices) {
    String[] sSplit = s.split("");
    if (indices.length != sSplit.length) {
      return "";
    }

    StringBuilder o = new StringBuilder();
    Map<Integer, String> maps = new HashMap<>();
    for (int i = 0; i < indices.length; i++) {
      maps.put(indices[i], sSplit[i]);
    }

    Arrays.sort(indices);
    for (int i = 0; i < indices.length; i++) {
      o.append(maps.get(indices[i]));
    }

    return o.toString();
  }

  public static void main(String[] args) {
    // Test case 1
    System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
    // Test case 2
    System.out.println(restoreString("abc", new int[]{0, 1, 2}));
  }
}
