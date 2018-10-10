package image;

import image.color.GrayColor;

/**
 * @author Quentin POSSAMAI
 *
 */
public class Pixel {
	private GrayColor color;
	
	public Pixel(GrayColor color) {
		this.color = color;
	}

	/**
	 * @return the color attribute
	 */
	public GrayColor getColor() {
		return color;
	}

	/**
	 * @param color set color of the pixel
	 */
	public void setColor(GrayColor color) {
		this.color = color;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pixel other = (Pixel) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}
	
	/**
	 * @param pixel another pixel to comparate
	 * @return the abs of the difference of level of color between two pixels
	 */
	public int colorDifference(Pixel pixel) {
		int res = this.color.getLevel() - pixel.color.getLevel();
		return (res > 0) ? res : -res; 
	}

	
	
}
