package logica;

public class Casilla {
	private int posX;
	private int posY;
	
	public Casilla(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
	
	public int getX() {
		return posX;
	}
	
	public int getY() {
		return posY;
	}
}
