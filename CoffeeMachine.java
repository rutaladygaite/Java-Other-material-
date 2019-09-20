package Testavimas;
import java.util.Scanner;

public class CoffeeMachine {
	
    public static void main(String[] args) {

        int W1 = 200;
        int M1 = 50;
        int C1 = 15;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has:");
        int W = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int M = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int C = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
        int Cups = scanner.nextInt();

        //kiek bus sunaudota
        int W2 = W1*Cups;
        int M2 = M1*Cups;
        int C2 = C1*Cups;
        
        //kiek liks ingredientu    
        int W3 = (W-W2);
        int M3 = (M-M2);
        int C3 = (C-C2);
        
        //Be liekanos, kiek puodeliu dar galima butu padaryt 
        int W4 = (W3/200)%200;
        int M4 = (M3/50)%50;
        int C4 = (C3/15)%15;
        
        int W5 = (W/200)%200;
        int M5 = (M/50)%50;
        int C5 = (C/15)%15;
        
        //jei daugiau, nei reikia
        if(W>W2&&M>M2&&C>C2){

        //Jei yra daugiau, nei reikia cups
        	if(W3>W1&&M3>M1&&C3>C1){
            
            System.out.println(W4 + " " + M4 + " " + C4);

            //Jei sutampa skaicius
            	if (W4>M4||W4>C4){
            		
            		if (M4>C4){
            			System.out.println("Yes, I can make that amount of coffee (and even " + C4 + " more than that).");   
            		}
            		else if (C4>M4){
            			System.out.println("Yes, I can make that amount of coffee (and even " + M4 + " more than that).");    
            		}
            		else {
            			System.out.println("Yes, I can make that amount of coffee (and even " + W4 + " more than that).");
            		}
            	}
        	}
        }
        
        else if(W<W2||M<M2||C<C2) {
        	
        	if(W<M||W<C) {
        	System.out.println("No, I can make only "+ W5 +" cup(s) of coffee.");
        	}
        	else if(M<W||M<C) {
        	System.out.println("No, I can make only "+ M5 +" cup(s) of coffee.");	
        	}
        	else {
        	System.out.println("No, I can make only "+ C5 +" cup(s) of coffee.");	
        	}
        }
    	else {
    		System.out.println("Yes, I can make that amount of coffee.");
    	}
    }	
}
