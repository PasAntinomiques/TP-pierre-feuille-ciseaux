package image;

import image.color.GrayColor;

public class ImageExample {
	public static void main(String[] args) {
		Image I = new Image(100, 200);
		
		for (int i = 10; i < 30; i++) {
			for(int j = 30; j < 60; j++) {
				I.changeColorPixel(i, j, GrayColor.BLACK);
			}
		}
		for (int i = 50; i < 70; i++) {
			for(int j = 50; j < 100; j++) {
				I.changeColorPixel(i, j, new GrayColor(64));
			}
		}
		for (int i = 20; i < 40; i++) {
			for(int j = 110; j < 160; j++) {
				I.changeColorPixel(i, j, new GrayColor(230));
			}
		}
		
		ImageDisplayer polo = new ImageDisplayer();
		polo.display(I, "Initial image");
		polo.display(I.edges(20), "Borders");
		int NbGrayLevels = 2;
		polo.display(I.decreaseNbGrayLevels(NbGrayLevels), Integer.toString(NbGrayLevels) + " Gray levels");
	}
}
