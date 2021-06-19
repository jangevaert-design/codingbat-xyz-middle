package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatXyzMiddleTest {

  String stringParams[] = {
      "AAxyzBB",
      "AxyzBB",
      "AxyzBBB",
      "AxyzBBBB",
      "AAAxyzB",
      "AAAxyzBB",
      "AAAAxyzBB",
      "AAAAAxyzBBB",
      "1x345xyz12x4",
      "xyzAxyzBBB",
      "xyzAxyzBxyz",
      "xyzxyzAxyzBxyzxyz",
      "xyzxyzxyzBxyzxyz",
      "xyzxyzAxyzxyzxyz",
      "xyzxyzAxyzxyzxy",
      "AxyzxyzBB",
      "",
      "x",
      "xy",
      "xyz",
      "xyzz"
  };


  boolean booleanExpected[] = {true, true, false, false, false, true, false, false, true, true,
      true, true, true, true, false, false, false, false, false, true, true};


  @Test
  void middleTest() {
    for (int i = 0; i < stringParams.length; i++) {
      boolean actual = CodingBatXyzMiddle.xyzMiddle(stringParams[i]);
      Assertions.assertEquals(actual, booleanExpected[i]);

    }
  }

}