package logica;

import java.util.ArrayList;

public class Ficha {
	private String name;
	private ArrayList<ArrayList<Integer>> reglas;
	private Casilla casillaActual;
	public Ficha(String name, ArrayList<ArrayList<Integer>> reglas, Casilla casillaActual) {
		this.name = name;
		this.reglas = reglas;
		this.casillaActual = casillaActual;
	}
	
	public Casilla getCasilla() {
		return casillaActual;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<ArrayList<Integer>> getReglas(){
		return reglas;
	}
}
