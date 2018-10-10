package image;

public class ImageMain {

	public static void main(String[] args) {
		String name = args[0];
		System.out.println(name);
		Image I = Image.initImagePGM(name);
		ImageDisplayer polo = new ImageDisplayer();
		polo.display(I, name);
		polo.display(I.edges(Integer.parseInt(args[1])), "Borders");
		int NbGrayLevels = Integer.parseInt(args[2]);
		polo.display(I.decreaseNbGrayLevels(NbGrayLevels), Integer.toString(NbGrayLevels) + " Gray levels");
	}

}
