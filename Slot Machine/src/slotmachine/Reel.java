package slotmachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;

//Class that holds 6 symbols as one reel
public class Reel {

	private ImageIcon redsevenImg = new ImageIcon(getClass().getResource("/redseven.png"));
	private ImageIcon bellImg = new ImageIcon(getClass().getResource("/bell.png"));
	private ImageIcon watermelonImg = new ImageIcon(getClass().getResource("/watermelon.png"));
	private ImageIcon plumImg = new ImageIcon(getClass().getResource("/plum.png"));
	private ImageIcon lemonImg = new ImageIcon(getClass().getResource("/lemon.png"));
	private ImageIcon cherryImg = new ImageIcon(getClass().getResource("/cherry.png"));

	private Symbol redsevenObj = new Symbol(redsevenImg, 7);
	private Symbol bellObj = new Symbol(bellImg, 6);
	private Symbol watermelonObj = new Symbol(watermelonImg, 5);
	private Symbol plumObj = new Symbol(plumImg, 4);
	private Symbol lemonObj = new Symbol(lemonImg, 3);
	private Symbol cherryObj = new Symbol(cherryImg, 2);

	public List<Symbol> spin() {

		List<Symbol> symbolList = new ArrayList<Symbol>();

		symbolList.add(redsevenObj);
		symbolList.add(bellObj);
		symbolList.add(watermelonObj);
		symbolList.add(plumObj);
		symbolList.add(lemonObj);
		symbolList.add(cherryObj);

		Collections.shuffle(symbolList);

		return symbolList;
	}
}

