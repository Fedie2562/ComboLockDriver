/*
 * Ferris D.
 * 12/10/2018
 */

package combolockdriver;

/**
 *
 * @author fedie2562
 */
public class ComboLock {
    public ComboLock(int combination){
        if(combination<1000&&combination>99){
            System.out.println("Combination set");
        }else{
            System.out.println("Please use only 3 digit numbers");
            System.exit(0);
        }
    }
}
