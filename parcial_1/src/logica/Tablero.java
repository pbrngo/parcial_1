package logica;

import java.util.ArrayList;

public class Tablero {
	private int size;
	private ArrayList<Casilla> casillas;
	public Tablero(int size){
		this.size = size;
		ArrayList<Casilla> casillas = new ArrayList<Casilla>();
		for(int i = 1; i<=size; i++) {
			for(int ii = 1; ii<=size; ii++) {
				casillas.add(new Casilla(i, ii));
			}
		}
		ArrayList<Ficha> fichas = new ArrayList<Ficha>();
	}
	public ArrayList<Casilla> CalcPosibles(Ficha ficha){
		ArrayList<Casilla> casillasPosibles = new ArrayList<Casilla>(); 
		for(int i = 0; i < casillas.size(); i++) {
			for(ArrayList<Integer> regla : ficha.getReglas()) {
				if((casillas.get(i).getX() == regla.get(0) + ficha.getCasilla().getX()) && (casillas.get(i).getY() == regla.get(1) + ficha.getCasilla().getY())) {
					casillasPosibles.add(casillas.get(i));
				}
			}
		}
		return casillasPosibles;
	}
}
