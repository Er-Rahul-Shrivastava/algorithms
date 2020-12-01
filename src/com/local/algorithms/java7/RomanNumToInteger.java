package com.local.algorithms.java7;

import java.util.HashMap;
import java.util.Map;

public class RomanNumToInteger {
  static Map<Character, Integer> romanMapping;
  static {
    romanMapping = new HashMap<>();
    romanMapping.put('I', 1);
    romanMapping.put('V', 5);
    romanMapping.put('X', 10);
    romanMapping.put('C', 100);
    romanMapping.put('D', 500);
    romanMapping.put('M', 1000);
  }

  public static void main(String[] args) {
    String rahul = "XV";
    int result = 0;
    for (Character string : rahul.toCharArray()) {
      result = result + romanMapping.get(string);
    }
    System.out.println(result);
  }

}