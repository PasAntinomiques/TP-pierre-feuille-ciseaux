package image.color;

public class GrayColor {
	
	public static final GrayColor WHITE = new GrayColor(255);
	public static final GrayColor BLACK = new GrayColor(0);
	private int level;
	
	/**
	 * @param level Construct a GrayColor with level
	 */
	public GrayColor(int level){
		this.level = level;
	}
	
	/**
	 * @return level of the GrayColor
	 */
	public int getLevel() {
		return this.level;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GrayColor other = (GrayColor) obj;
		if (level != other.level)
			return false;
		return true;
	}
}
