/*
 * BackPainAnalyzer.java
 *
 * Richard Kaune T00641439
 * COMP 2231_SW2 Assignment 4 Question 1
 * This completes the implementation of a DecisionTree, introduced in Chapter 19. 
*/

package jsjf;

import java.io.*;

/**
 * BackPainAnaylyzer demonstrates the use of a binary decision tree to 
 * diagnose back pain.
 */
public class BackPainAnalyzer
{
	/**
	 *  Asks questions of the user to diagnose a medical problem.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		//System.out.println("So, you're having back pain."); // default BackPainAnalyzer prompt
                System.out.println("So, you can't decide which fries to have... "); // demonstration of another just as complex decision tree

		//DecisionTree expert = new DecisionTree("/Users/richardkaune/NetBeansProjects/BackPainAnalyzer/src/input.txt"); // BackPainAnalyzer uses input.txt
                DecisionTree expert = new DecisionTree("/Users/richardkaune/NetBeansProjects/BackPainAnalyzer/src/inputNew.txt"); // FrenchFryChooser uses inputNew.txt
                
		expert.evaluate();
	}
}
