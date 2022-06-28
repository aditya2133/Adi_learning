package com.qa.operatorconditionaliterationtesting;

public class Results {

static int resultsP = 100;
static int resultsC = 15;
static int resultsB = 135;
static int resultsT;
static double resultsPercent;


public static void examMarks() {
	resultsT = resultsB + resultsC + resultsP;
		
	System.out.println("Marks for subjects out of 150");
	System.out.println("Physics " + resultsP);
	System.out.println("Chemistry " + resultsC);
	System.out.println("Biology " + resultsB);
	System.out.println("\nTotal out of 450 \n" + resultsT );
}
	
public static void examPercent() {
	double rt = resultsT;
	resultsPercent = (rt/450) * 100;
	System.out.printf("\n \nTotal Percentage = %.2f", resultsPercent);
	
}

	public static void main(String[] args)
	{
		examMarks();
		examPercent();
		failPass();	
		percents();
		
	}
	
	
	// ===================================================================================
	// Expanded section
	public static void failPass()
	{
		System.out.println("\n ======================================================= \n Expansion1");
		if(resultsPercent>60)
		{
			System.out.println("\n \n YAY YOU PASSED Overall");
		}
		else 
			System.out.println("\n \n  Aww...you have failed");
	
	}
	
	
static double rP = 	resultsP;
static double rC = resultsC;
static double rB = resultsB;
static double pP;
static double pC;
static double pB;

public static void percents() {
	System.out.println("\n ======================================================= \n Expansion2");
	
	pB = (rB/150) * 100;
	pC = (rC/150) * 100;
	pP = (rP/150) * 100;
	System.out.println("\n");
	System.out.printf("Biology Percent= %.2f",pB);
	System.out.println("\n");
	System.out.printf("Chemistry Percent= %.2f", pC);
	System.out.println("\n");
	System.out.printf("Physics Percent= %.2f", pP);
	System.out.println("\n");
	
	if(pB>60 && pC>60 && pP>60) 
	{
		System.out.println("\n YAAYY You Pass");
	}	
		else if (pB>60 && pC>60 && pP<60 || pB>60 && pC<60 && pP>60 || pB<60 && pC>60 && pP>60)
		{
			if (pB<60)
			{
				System.out.println("\n Failed Biology - Overall Fail");
			}
			else if (pC<60)
			{	
				System.out.println("\n Failed Chemistry - Overall Fail");
			}
			else 
			{
				System.out.println("\n Failed Physics - Overall Fail ");
			}
			
		}
		else if (pB>60 && pC<60 && pP<60 || pB<60 && pC<60 && pP>60 || pB<60 && pC>60 && pP<60)
		{
			if (pB>60)
			{
				System.out.println("\n Failed Chemistry and Physics - Overall Fail");
			}
			else if(pC>60)
			{
				System.out.println("\n Failed Physics and Biology - Overall Fail");
			}
			else {
				System.out.println("\n Failed Chemistry and Biology - Overall Fail");
			}
				
		}		
	
	else {
		System.out.println("\n Fail All");
	}
}



}
