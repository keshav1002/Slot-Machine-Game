package slotmachine;

import javax.swing.ImageIcon;

//interface that will be implemented by the Symbol Class
public interface ISymbol {

	void setImage(ImageIcon image);
	
	ImageIcon getImage();
	
	void setValue(int v);
	
	int getValue();
	
}
