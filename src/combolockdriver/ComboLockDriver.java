/*
 * Ferris D.
 * 12/10/2018
 * 
 */

package combolockdriver;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        ComboLock randomCombo = new ComboLock(Integer.parseInt(JOptionPane.showInputDialog("Please enter the combination to set\n3 digit numbers only")));
    }
    
}
