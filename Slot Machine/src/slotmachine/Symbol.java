package slotmachine;

import java.awt.Image;

import javax.swing.ImageIcon;

//Class that will handle each symbol in a Reel
public class Symbol implements ISymbol {

	private ImageIcon symbol;
	private int value;

	Symbol(){
		
	}
	
	Symbol(ImageIcon symbol, int value) {
		this.symbol = symbol;
		this.value = value;
	}

	public void setImage(ImageIcon image) {
		symbol = image;
	}

	public ImageIcon getImage() {
		ImageIcon imgIcon = symbol;
		Image image = imgIcon.getImage();
		Image newimg = image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		imgIcon = new ImageIcon(newimg);
		return imgIcon;
	}

	public void setValue(int v) {
		value = v;
	}

	public int getValue() {
		return value;
	}

}
