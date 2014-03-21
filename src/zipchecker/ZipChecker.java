/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package zipchecker;

import javax.swing.JFrame;

/**
 *
 * @author shirai
 */
public class ZipChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args[1].compareTo("-c") == 0){
            consoleMode(args[1]);
        }
        // TODO code application logic here
        mainFrame main = new mainFrame();
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.setSize(320, 160);
        main.setLocationRelativeTo(null);
        main.setVisible(true);                
    }

    private static void consoleMode(String fileName) {
        System.out.append("console mode: " + fileName);
        
    }
    
}
