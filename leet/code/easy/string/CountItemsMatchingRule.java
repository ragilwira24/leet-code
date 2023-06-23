package leet.code.easy.string;

import java.util.List;

public class CountItemsMatchingRule {

  public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
    int ruleKeyIndex = 0;
    switch (ruleKey) {
      case "color":
        ruleKeyIndex = 1;
        break;
      case "name":
        ruleKeyIndex = 2;
        break;
      default:
        break;
    }

    int total = 0;
    for (List<String> bb: items) {
      String valueBb = bb.get(ruleKeyIndex);
      if (ruleValue.equalsIgnoreCase(valueBb)) {
        total++;
      }
    }

    return total;
  }

  public static void main(String[] args) {
    // Test case 1
    System.out.println(countMatches(List.of(
        List.of("phone","blue","pixel"),
        List.of("computer","silver","lenovo"),
        List.of("phone","gold","iphone")), "color", "silver"));
    // Test case 2
    System.out.println(countMatches(List.of(
        List.of("phone","blue","pixel"),
        List.of("computer","silver","phone"),
        List.of("phone","gold","iphone")), "type", "phone"));
  }

}
