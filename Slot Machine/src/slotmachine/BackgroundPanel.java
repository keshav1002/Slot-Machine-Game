package slotmachine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.JPanel;

//This class is used to create a custom panel that can support adding a background image to the GUI
public class BackgroundPanel extends JPanel {
	private Image image;

	public BackgroundPanel(Image image) {
		this.image = image;
		setLayout(new GridBagLayout());
	}

	public Dimension getPreferredSize() {
		Dimension sizeSuper = super.getPreferredSize();
		if (isPreferredSizeSet() || image == null) {
			return sizeSuper;
		}
		int minWidth = Math.max(image.getWidth(null), sizeSuper.width);
		int minHeight = Math.max(image.getWidth(null), sizeSuper.width);
		return new Dimension(minWidth,minHeight);
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		if(image!=null){
			g.drawImage(image, 0, 0, getWidth(),getHeight(),null);
		}
	}
}