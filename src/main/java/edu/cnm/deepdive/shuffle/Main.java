package edu.cnm.deepdive.shuffle;

import java.io.IOException;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    int[] data = new int[args.length];
    int i = 0;
    try {
      for ( ; i < args.length; i++) {
        data[i] = Integer.parseInt(args[i]);
      }
    } catch (NumberFormatException e) {
      System.err.printf("Parsing failed! %s%n", e.getMessage());
    }
    data = Arrays.copyOf(data, i);
    System.out.println(Arrays.toString(data));
    Shuffler shuffler = new Shuffler();
    shuffler.shuffle(data);
    System.out.println(Arrays.toString(data));
  }

}
