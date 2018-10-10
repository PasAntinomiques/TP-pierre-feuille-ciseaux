package image;

/**
 * Basic interface for images based on a rectangular area of pixels
 */
public interface ImageInterface {

    /** returns width of the image
     * @return width of the image
     */
    public int getWidth();

    /** returns height of the image
     * @return height of the image
     */
    public int getHeight();

    /** gets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @return pixel at coord x,y of this image. (0,0) is top left corner pixel.
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */
    public Pixel getPixel(int x, int y) throws UnknownPixelException;

    /** sets pixel at coord (x,y) of this image. (0,0) is top left corner pixel.
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     * @param pixel the new pixel
     * @exception UnknownPixelException if pixel of coord (x,y) does not exist
     */
    public void setPixel(int x, int y, Pixel pixel) throws UnknownPixelException;
}
