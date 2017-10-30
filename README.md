README.md


# Monty Hall Problem

-Ana Kissler

-Felicia Urioste

-Paula Schultz

-Haseeb Gauba 


### Summary of The Problem


A contestant is given the choice of curtains 1, 2 or 3 and chooses curtain number 2.  Curtain 
number 1 is opened revealing a goat, which is not the big prize.  Without 
knowing what is behind curtain number 2 or curtain number 3, the contestant must 
now decide whether they want to stick with curtain number 2 or switch their selection 
to curtain number 3. We are trying to show what is the better strategy, stick with 
the original selection, or switch?  We will write a program that conducts a numerical 
simulation and reports the results.  


In each trial we will simulate a play of the game, we will be using a generation
of random events/numbers corresponding to the big price, the contestant's choice, 
and/or the revealed alternative.  Based on the random events generated the program
will determine whether the "stick to the original selection" strategy or "switch 
selection" strategy would have won and record the result.  


### Summary of The Solution


We created an enum array containing the three prizes.  We chose to use the math.Random
to select a random number from the 3 possibilities.  After completing all the trials the 
results message is displayed, showing the number of times that sticking with the original 
selection would have won, and the number of times the switching the selection would have won. 



### Answers to Question in Problem Description


Which strategy(stay or switch) is the best?  
The given probabilities depend on specific assumptions about how the host and contestant 
choose their doors. A key insight is that, under these standard conditions, there is more 
information about doors 1 and 3 that was not available at the beginning of the game, when 
the door 2 was chosen by the player: the host's deliberate action adds value to the door 
he did not choose to eliminate, but not to the one chosen by the contestant originally. 
Another insight is that switching doors is a different action than choosing between the two 
remaining doors at random, as the first action uses the previous information and the latter 
does not. Other possible behaviors than the one described can reveal different additional 
information, or none at all, and yield different probabilities.