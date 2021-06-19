package edu.cnm.deepdive;

/*

Given a string, does "xyz" appear in the middle of the string? To define middle,
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
 */

public class CodingBatXyzMiddle {

  public static void main(String[] args) {
    System.out.printf("with the String %s, the outcome is " + xyzMiddle("AAxyzBB") + ".\n", "AAxyzBB");
    System.out.printf("with the String %s, the outcome is " + xyzMiddle("AxyzBB") + ".\n", "AxyzBB");
    System.out.printf("with the String %s, the outcome is " + xyzMiddle("AxyzBB") + ".\n", "AxyzBB");
  }

  public static boolean xyzMiddle(String str) {
    int middle = str.length()/2;

    if (str.length() < 3) {
      return false;
    }

    if (str.length() % 2 != 0) {
      if (str.substring(middle - 1, middle + 2).equals("xyz")) {
        return true;
      } else {
        return false;
      }

    } else if (str.substring(middle -1, middle + 2).equals("xyz")
        || str.substring(middle - 2, middle + 1).equals("xyz")) {
      return true;
    } else {
      return false;
    }
  }

}
