/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image.lock;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class ImageLock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DisplayGraphics m = new DisplayGraphics();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        //f.setLayout(null);  
        f.setVisible(true);

    }

}
