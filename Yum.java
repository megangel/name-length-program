/*
*Megan Baldwin
*1.15.19
*Skittles array
*/

import java.util.*;

public class Yum{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int yellowCount = 1; 
        int purpleCount = 1; 
        int greenCount = 1; 
        int pinkCount = 1;
        
        System.out.print("How many Skittles did you eat: ");
        int skittles = input.nextInt(); // tells how many spots the array needs to be filled by user input.
        
        if(skittles == 0){
        System.out.println("Okay, enjoy your skittle free life then. ");
        }

        String[] skittlesColor = new String[skittles]; // the actual array
        
            
             for(int i = 0; i < skittles; i++){
            System.out.print("Enter the color of the Skittle(s) you ate (yellow, purple, green, or pink): ");
            skittlesColor[i] = input.next(); 
            if(skittlesColor[i].equals("yellow")){
                yellowCount++;
            }// closes yellowCount if
            if(skittlesColor[i].equals("purple")){
                purpleCount++;
            } //closes purpleCount if
            if(skittlesColor[i].equals("green")){
                greenCount++;
            }// closes greenCount if
            if(skittlesColor[i].equals("pink")){
                pinkCount++;
            }// closes pinkCount if
             
        }//closes for loop
        
        System.out.print("Are you finished eating? '0' is yes, '1' is no: ");
         int response = input.nextInt();
        
        switch(response){
         case 0: 
             System.out.println("Hope you enjoyed those Skittles!");
             break;
        default:
            System.out.println("You should really put the Skittles down......... sorry............. anyway..... well this is awkward...... bye.......");
            break;
        }//closes response
        System.out.print("You ate " +skittles+ " skittle(s).");
        System.out.print("You ate " +yellowCount+ " yellow Skittle(s).");
        System.out.print("You ate " +purpleCount+ " purple Skittle(s).");
        System.out.print("You ate " +greenCount+ " green Skittle(s).");
        System.out.print("You ate " +pinkCount+ " pink Skittle(s). TASTE THE RAINBOW!!!");
        
        int count = 0;
        while(count < 20){
            System.out.print("*");
            count++;
        }
    }// closes main method
}// closes public class

/*
*Works with 1 skittle, and tested with 20 skittles. no errors if you misspell a color it does not count it.  
*no while loop :(, actually thanks for helping me add one :)
*last tested: 1/15/19
*/
//WHY IS THERE SO MUCH CODE?!
