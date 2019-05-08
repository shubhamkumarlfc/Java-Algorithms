package src.algo.hackathlon;

import java.util.Scanner;

public class WhoWinsTheFight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        int testCasesInput =0;
        while (testCasesInput <1 || testCasesInput > 10) {
            testCasesInput = scanner.nextInt();
        }
        
        

        for (int test=0;test<testCasesInput;test++){
            int numPlayersInt=0;
          
            while (numPlayersInt <1 || numPlayersInt > 1000) {
                numPlayersInt = scanner.nextInt();
            }
            int strengthArr[] = new int[numPlayersInt];
            int energyArr[] = new int[numPlayersInt];
            for (int j=0;j<numPlayersInt;j++){
                strengthArr[j] = 0;
                while ((strengthArr[j] <1 || strengthArr[j] > 100000)) {
                  if(scanner.hasNext())
                  strengthArr[j] = scanner.nextInt();
                }   
            }
            for (int j=0;j<numPlayersInt;j++){
                energyArr[j] = 0;
                while (energyArr[j] <1 || energyArr[j] > 100000) {
                    if(scanner.hasNext())
                    energyArr[j] = scanner.nextInt();
                }   
            

            }     

        int maxStrength = strengthArr[0];
        int maxenergy = energyArr[0];
        int counter = 0;
        for(int i =0;i<strengthArr.length;i++){
            if (maxStrength < strengthArr[i])
            maxStrength=strengthArr[i];
            if(maxenergy < energyArr[i])
            maxenergy = energyArr[i];
        }
        
        //buble sort
        int temp;
        int temp2;
        for (int i = 0; i < strengthArr.length-1; i++)
        {
        if(strengthArr[i] < strengthArr[i+1])
        {
            temp=strengthArr[i];
            strengthArr[i]=strengthArr[i+1];
            strengthArr[i+1]=temp;
            i=-1;
        }
        }
         for (int i = 0; i < energyArr.length-1; i++)
        {
        if(energyArr[i] < energyArr[i+1])
        {
            temp2=energyArr[i];
            energyArr[i]=energyArr[i+1];
            energyArr[i+1]=temp2;
            i=-1;
        }
        }

        int winner =0;
        for (int i=0;i<strengthArr.length;i++){
            if(strengthArr[i] < energyArr[i])
            winner++;
        }
        
        if(winner==numPlayersInt)
        System.out.println("WIN");
        else
        System.out.println("LOSE");
    }
        
        scanner.close();
   }
}
