/*
 * Ferris D.
 * 12/10/2018
 */

package combolockdriver;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class ComboLock {
    boolean unlocked = false;
    public ComboLock(int combination){
        if(combination<1000&&combination>99){
            System.out.println("Combination set");
        }else{
            System.out.println("Please use only 3 digit numbers");
            System.exit(0);
        }
        System.out.println("Please enter the combination 1 digit at a time");
        String combo = ""+combination;
        do{
        if(combo.charAt(0)==JOptionPane.showInputDialog("Enter the first digit of the combo").charAt(0)){
            System.out.println("Successfully entered the first digit\nplease enter the second digit");
        }else{
            System.out.println("That is not the first digit of the combination");
            continue;
        }
        if(combo.charAt(1)==JOptionPane.showInputDialog("Enter the second digit of the combo").charAt(0)){
            System.out.println("Successfully entered the second digit\nplease enter the third digit");
        }else{
            System.out.println("That is not the second digit of the combination");
            continue;
        }
        if(combo.charAt(2)==JOptionPane.showInputDialog("Enter the third digit of the combo").charAt(0)){
            System.out.println("Successfully entered the third digit");
            unlocked=true;
            System.out.println("------------\nUnlocked");
        }else{
            System.out.println("That is not the third digit of the combination");
            continue;
        }
        }while(!unlocked);
    }
    public ComboLock(){
        unlocked=false;
        int guesses = 0;
        int comboNum1 = randomNum(1,9);
        int comboNum2 = randomNum(1,9);
        int comboNum3 = randomNum(1,9);
        System.out.println("A random 3 digit combo has been generated");
        //
        System.out.println(""+comboNum1+comboNum2+comboNum3);
        //
        while(!unlocked){
            if(guesses==3){
                System.out.println("You have run out of guesses\nThe combination was "+comboNum1+comboNum2+comboNum3);
                System.exit(0);
            }
            System.out.println("You have "+(3-guesses)+" guesses to unlock the combination");
            if(comboNum1==Integer.parseInt(JOptionPane.showInputDialog("Enter the first digit"))){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
                guesses++;
                continue;
            }
            if(comboNum2==Integer.parseInt(JOptionPane.showInputDialog("Enter the second digit"))){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
                guesses++;
                continue;
            }
            if(comboNum3==Integer.parseInt(JOptionPane.showInputDialog("Enter the third digit"))){
                System.out.println("Correct");
                System.out.println("You have solved the "+comboNum1+comboNum2+comboNum3+" combination");
                unlocked=true;
            }else{
                System.out.println("Incorrect");
                guesses++;
                continue;
            }
        }
    }
    public static int randomNum(int min, int max){
        return (int)(Math.random()*max+min);
    }
}
