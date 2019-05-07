package src.algo.hackathlon;

import java.io.*;
import java.util.*;
public class MaxSumTwoNonAdjacentNumInArray {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scanner = new Scanner(System.in);
        int testCasesInput =0;
        while (testCasesInput <1 || testCasesInput > 10) {
            testCasesInput = scanner.nextInt();
        }
        for (int test=0;test<testCasesInput;test++){
            int numHousesInt=0;
            
            int sum1 = 0;
            int sum2 = 0;
            while (numHousesInt <1 || numHousesInt > 10000) {
                if(scanner.hasNextInt()) {
                numHousesInt = scanner.nextInt();
                }
            }
            int ticketArr[] = new int[numHousesInt];
            for (int j=0;j<numHousesInt;j++){
                ticketArr[j] = -1001;
                while ((ticketArr[j] <-1000 || ticketArr[j] > 1000)) {
                  if(scanner.hasNextInt()) {
                  ticketArr[j] = scanner.nextInt();
                  }
                }   
            }  
            // includes max sum of current element or existing sum
            sum1 = ticketArr[0];
            //includes max sum previous largest element exluding current elements 
            sum2 = 0;
            // helps in retating the value of sum2 
            int current_max=0 ;
            String sum2_element,output="",curr_output=""; 
            for (int i=1;i<ticketArr.length;i++){
            	
                sum2_element = Integer.toString(sum2);
                // for same elements in a row 
                if (current_max==sum2+ticketArr[i])
            		break;
            	else
            		current_max = sum2+ticketArr[i];
                
                sum2 = ticketArr[i-1]>sum2 ? ticketArr[i-1]:sum2;    
                //for removing 0 from output where output is a string
                if(sum2_element.equals("0")){
                    output =  sum1 >= current_max ?Integer.toString(sum1):(Integer.toString(ticketArr[i]));
                }
                else{
                    output =  sum1 >= current_max ?Integer.toString(sum1):(Integer.toString(ticketArr[i])+sum2_element);
                }

                //for checking if existing sum is already greater - and keep the previous existing output 
                if(sum1>= current_max){
                	if(sum1 <=0)
                		output = Integer.toString(sum1);
                	else 
                		output= curr_output;
                }

                // computing max sum bw two non adjacent 
                sum1 = sum1 >= current_max ? sum1:current_max;
                // assigning final output to current output - helps in next iteration 
                curr_output= output;
                
            }
            System.out.println(output);


    }
        scanner.close();
   }
}
