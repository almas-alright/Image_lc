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

    public WriteImage(File file) {
        BufferedImage image = null;
        try {

            URL url = new URL("http://www.mkyong.com/image/mypic.jpg");
            image = ImageIO.read(url);
            File outputfile = new File("E:\\dpkg.png");            
            ImageIO.write(image, "jpg", new File("E:\\out.jpg"));
            ImageIO.write(image, "gif", new File("E:\\out.gif"));
            ImageIO.write(image, "png", outputfile);            
            outputfile.setReadOnly();
            outputfile.setWritable(false);
            outputfile.setWritable(false, true);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
    }

    
}
