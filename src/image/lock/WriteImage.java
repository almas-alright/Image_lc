/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package image.lock;

/**
 *
 * @author user
 */
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class WriteImage {

    public WriteImage(File file, Object path) {
        BufferedImage image = null;
        try {

            URL url = new URL("http://www.mkyong.com/image/mypic.jpg");
            image = ImageIO.read(file);
            File outputfile = new File(path+"/dpkg.png");            
            ImageIO.write(image, "jpg", new File(path+"/out.jpg"));
            ImageIO.write(image, "gif", new File(path+"/out.gif"));
            ImageIO.write(image, "png", outputfile);            
            outputfile.setReadOnly();            
            outputfile.setWritable(false, false);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }

    
}
