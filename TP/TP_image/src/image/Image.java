package image;

import image.Image;
import image.color.GrayColor;

import java.util.*;

public class Image implements ImageInterface {
	
	private int width;
	private int height;
	private Pixel[][] tab_image; 

    // A COMPLETER
	
	/**
	 * @param width The width of the image
	 * @param height The length of the image
	 */
	public Image(int width, int height) {
		this.width = width;
		this.height = height;
		this.tab_image = new Pixel[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				this.tab_image[i][j] = new Pixel(GrayColor.WHITE);
			}
		}
	}
	
    /* 
     * @return width of the image
     */
    public int getWidth() {
		return width;
	}



	/**
	 * @param width of the image
	 */
	public void setWidth(int width) {
		this.width = width;
	}



	/**
	 * @return length of the image
	 */
	public int getHeight() {
		return height;
	}



	/**
	 * @param height of the image
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	
	/* 
	 * @param x position of pixel (width)
	 * @param y position of pixel (length)
	 * @return the pixel in position (x, y)
	 */
	public Pixel getPixel(int x, int y) {
		return this.tab_image[x][y];
	}

	/**
	 * @param x position in the image (width)
	 * @param y position in the image (height)
	 * @param color of the pixel
	 */
	public void changeColorPixel(int x, int y, GrayColor color) {
		this.tab_image[x][y].setColor(color);
	}

	/**
	 * @param threshold if the difference between two pixel shoud be seen or not
	 * @return the image black and white when the treshold has been applied
	 */
	public Image edges(int threshold) {
		Image res_img = new Image(this.width, this.height);
		for (int i = 0; i < width-1; i++) {
			for (int j = 0; j < height-1; j++) {
				
				if((this.tab_image[i][j].colorDifference(this.tab_image[i+1][j]) > threshold) ||
						(this.tab_image[i][j].colorDifference(this.tab_image[i][j+1]) > threshold)) {
					res_img.tab_image[i][j].setColor(GrayColor.BLACK);
				}
			}
		}
		return res_img;
	}

    public Image decreaseNbGrayLevels(int nbGrayLevels) {
		Image res_img = new Image(this.width, this.height);
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				for(int k = 255; k >= 0; k = k - (int)(256/nbGrayLevels)) {
					if((this.tab_image[i][j].getColor().getLevel() <= k) &&
							(this.tab_image[i][j].getColor().getLevel() > k - (int)(256/nbGrayLevels))) {
						res_img.tab_image[i][j].setColor(new GrayColor(k));
					}
				}
			}
		}
		return res_img;
    }

    // ======================================================================
    /** Reads a PGM image from file.
     * It is assumed that file respects the following PGM file syntax:
     *  <ul><li> first line with string "P2"</li>
     *  <li>second line : a comment</li> 
     *  <li>one int for width <code>w</code>, one int for height<code>h</code></li>
     *  <li>one int for max gray level (not used here, we consider this level to be 255 in our images)</li>
     *  <li><code>w</code> x <code>h</code> integers between 0 and max (for us max=255) for each pixel</li></ul>
     *  
     * @param fileName the name of the image file in PGM format
     * @return the image built from the file
     */
    public static Image initImagePGM(String fileName) {
        Scanner scan = new Scanner(Image.class.getResourceAsStream(fileName));

        scan.nextLine(); // line P2
        scan.nextLine(); // line comment
        // read width
        int width = scan.nextInt();
        // read height        
        int height = scan.nextInt();
        // read max gray level (not used)
        scan.nextInt(); 
        // create an initially white image
        Image result = new Image(width, height); 
        // rad pixels
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < width; y++) {
                result.changeColorPixel(y, x, new GrayColor(scan.nextInt()));
            }
        }
        return result;
    }

	/**
	 * @param x position in the image (height)
	 * @param y position in the image (width)
	 * @param pixel Pixel who will replace the old one
	 */
	@Override
	public void setPixel(int x, int y, Pixel pixel) throws UnknownPixelException {
		changeColorPixel(x, y, pixel.getColor());
		
	}
}
