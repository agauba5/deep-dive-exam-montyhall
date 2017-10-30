package edu.cnm.deepdive.exam.montyhall;

import static edu.cnm.deepdive.exam.montyhall.Prize.BIG_PRIZE;

import java.util.Random;

public class ContestantsResults {

  private static final int DEFAULT_TRIAL_COUNT = 1000;
  public static final String RESULT_STATEMENT = "In %d trials, switching doors won %d(%.2f%%) of the time %n while sticking with the original selection won %d(%.2f%%) of the time";


  /**
   * Conducts a Monte Carlo simualtion and reports the results.
   * Allows the user to specify a number of trails to run with a default of 1,000, using generation of
   * random events/numbers corresponding to the big prize, contestant's choice and the revealed alternative.
   * Determines whether the "stick with the original selection" or "switch selection" would
   * have won in this instance, and record that result accordingly.
   *
   * @param args The number of times the method will run trials.
   */
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

    /**
     * Will print out the results of stayWin/trails and switchWin/trails.
     *
     */
    System.out.printf(RESULT_STATEMENT, trials, switchWin , (100.0*switchWin)/trials , stayWin,(100.0*stayWin)/trials);
  }
}
