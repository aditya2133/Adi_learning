package com.qa.operatorconditionaliterationtesting;

public class IterationsTest {

public static void main(String[] args) {
	
//	// WHILE LOOP
//	int catCount = 0; 
//	boolean notEnoughCats = true;
//	
//	while(notEnoughCats) {
//		System.out.println("Another cat" + " - " + catCount);
//		catCount++;
////		System.out.println(catCount);
//		
//		
//		if (catCount > 100) {
//			notEnoughCats = false;
//		}
//	}
//
//	System.out.println("Too many cats now");
//	
//	
	
	
	
	//do-while loop
//	int playCount = 0;
//    boolean playing = true;
//
//    
//        do {
//            System.out.println("Playing");
//            playCount++;
//
//            if(playCount > 10) {
//                playing = false;
//            }
//        } while(playing);
//
//        System.out.println("Game Over!");
//    
	
        
    // for loop
//        
//        for(int i = 0; i < 10; i++) {
//            System.out.println(i + " " + "Hello There!");
//        }  
//        
        
        
    // Transfer control statement
        
        for(int i = 0; i < 10; i++) {
            if(i == 2) {
                continue;
            }
            if(i == 7) {
                break;
            }
            System.out.println(i);
        }
}

		
	
	
}
