import java.util.Scanner;

public class AssignmentOneF17xx1{
		
	public static void main(String[] args){
		//Decalare Variables		
		Scanner sc = new Scanner(System.in);
		String in ;
		
		//Continuously read input from console		
		while(true){				
			//Variables
			in = sc.nextLine();
			int inLength = in.length() ;
			
			
			//Quit program
			if(in.equals("quit")){
				System.exit(1);
			}
			
			//Analyze input
			else{				
				//Check for vaild input.
				if(inLength <= 10){					
					//Variables
					int match = 0;
					int threes = 0;
					int twos = 0;
					char curCard ;

					//Parse card suits					
					String handSuits = in.substring(1,2) + in.substring(3,4) + in.substring(5,6) + in.substring(7,8) + in.substring(9,10);
					
					//Parse card values
					String handVals = in.substring(0,1) + in.substring(2,3) + in.substring(4,5) +in.substring(6,7) + in.substring(8,9);
					
					//Check for flush
					if(handSuits.equals("ddddd") || handSuits.equals("hhhhh") || handSuits.equals("ccccc") || handSuits.equals("sssss")){						
					System.out.println("flush");											
					}					
					
					//Check for highest kind.
					for(int i = 0; i < handVals.length(); i++){
						//The value of the current card being examined
						curCard = handVals.charAt(i);
						//Remove curCard from handVals to give a new current values that are being examined.		
						String curVals = handVals.substring(0, i) + handVals.substring(i + 1, handVals.length());
	
						for( int n = 0; n < curVals.length(); n++){
							if(curCard == curVals.charAt(n)){
								match += 1;						
							}												
						}								
						//find pairs						
						if(match == 1){
							twos += 1;
						}
						//finds triplets						
						if(match == 2){
							threes += 1;
						}
						
						if(match == 3){
							System.out.println("four of a kind");
							break;
						}
						
						if(twos == 2 && threes == 3){
							System.out.println("full house");										
						}							
						
						//reset match
						//System.out.println("match: " + match) ;
						match = 0;
					
					}//End of first for loop
					
					//check for pairs and three of a kind
					if(twos >= 1 && threes < 3){
							System.out.println("pair");
						}
								
					if(threes >= 2 && twos < 2){
							System.out.println("three of a kind");
						}
							
					 						
				}//End of nested if statement
				
				
			}//End of else

		
		}//End of while of console input
		
		
	}//End of main method
	
}