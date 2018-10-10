
package image;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;

import javax.swing.JFrame;

/** Class for displaying images in a window using <code>display</code> methods. 
 *  Image must be of type <code>ImageInterface</code>
 * @see ImageInterface
 * @author jc
 */
public class ImageDisplayer {
    
    /** calls display(img, title, 100, 100)
     * @param img the displaid image
     * @param title the window's title
     * @see #display(ImageInterface, String, int, int)
     */
    public void display(ImageInterface img, String title) {
        this.display(img, title, 100,100);
    }
    /** display image img in a GUI window
     * @param img the displaid image
     * @param title the window's title
     * @param x the x position of the top left corner of window
     * @param y the y position of the top left corner of window
     */
    public void display(ImageInterface img, String title, int x, int y) {
        BufferedImage bfImg = new BufferedImage(img.getWidth(), img.getHeight(), BufferedImage.TYPE_INT_RGB);
        WritableRaster raster = bfImg.getRaster();
        Pixel pixel;
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {
                pixel = img.getPixel(i, j);
                int[] tabInt =  {pixel.getColor().getLevel(), pixel.getColor().getLevel(), pixel.getColor().getLevel()};
                raster.setPixel(i, j, tabInt);
            }
        }
        JFrame frame = new JFrame(title);
        frame.setLocation(x, y);
        frame.addWindowListener(new CloseWindowEvent());
        frame.setSize(img.getWidth(), img.getHeight());
        frame.add(new MyCanvas(bfImg));
        frame.setVisible(true);
    }
    
    // ============================================================
    // internal class displaying canvas
    private class MyCanvas extends Canvas {
        private BufferedImage img;

        public MyCanvas(BufferedImage img) {
            this.img = img;
        }

        public void paint(Graphics g) {
            g.drawImage(this.img, 0, 0, null);
        }
    }
    
    // ----------------------------------------------------------------------
    // internal class, manages window closing
    // ----------------------------------------------------------------------
    private class CloseWindowEvent extends WindowAdapter {
        public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
        }
    }  
}
