package edu.cnm.deepdive.exam.montyhall;

import static edu.cnm.deepdive.exam.montyhall.Prize.BIG_PRIZE;

import java.util.Random;

public class ContestantsResults {

  private static final int DEFAULT_TRIAL_COUNT = 1000;


  public static void main(String [] args){

    int stayWin = 0;
    int switchWin = 0;
    Random rng = new Random();
    Prize contestantsChoice;

    int trials = args.length > 0 ? Integer.parseInt(args[0]): DEFAULT_TRIAL_COUNT;
    for (int i = 0; i< trials; i++){
      contestantsChoice = Prize.values()[rng.nextInt(Prize.values().length)];
      if(contestantsChoice.equals(BIG_PRIZE)){
        stayWin++;
      }else {
        switchWin++;
      }
    }
    System.out.printf("%d%n%d", stayWin, switchWin);
  }
}
