package edu.cnm.deepdive.shuffle;

import java.security.SecureRandom;
import java.util.Random;

public class Shuffler {

  private final Random rng;

  public Shuffler() {
    rng = new SecureRandom();
  }

  public void shuffle(int[] data) {
    for (int destPos = data.length - 1; destPos >= 1; destPos--) {
      // TODO Complete the steps to select and swap a random element with element destPos.
      int srcPos = rng.nextInt(destPos + 1);
      if (srcPos != destPos) {
        int temp = data[destPos];
        data[destPos] = data[srcPos];
        data[srcPos] = temp;
      }
    }
  }

}
