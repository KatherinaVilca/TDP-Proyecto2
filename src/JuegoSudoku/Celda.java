package JuegoSudoku;

public class Celda {
	private int fila;
	private int columna;
	private int elemento;
	private int cuadrante;
	private boolean esta_en_conflicto;
	private EntidadGrafica entidad_grafica;
	private boolean celda_en_cuestion; // 
	private boolean celda_jugada;
	private boolean celda_inicial;

		
	public Celda(int e) { //para las opciones
		elemento=e;
		entidad_grafica= new EntidadGrafica();
		entidad_grafica.actualizar_Imagen(elemento);	
	}
	public Celda(int a,int b) {
		fila=a;
		columna=b;
		elemento=0;
		cuadrante=0;
		esta_en_conflicto=false;
		celda_en_cuestion=false;
		celda_jugada=true;
		celda_inicial=false;
		entidad_grafica= new EntidadGrafica();
		entidad_grafica.actualizar_Imagen(0); //representa la imagen inicial
	}
	
	public void actualizar_Imagen(int i) {entidad_grafica.actualizar_Imagen(i);}
	
	public EntidadGrafica getEntidadGrafica() { return entidad_grafica;}
	public int getCuadrante() {return cuadrante;}
	public int getElement() { return elemento;}
	public int getFila() {return fila;}
	public int getColumna() {return columna;}
	public boolean getConflicto() {return esta_en_conflicto;}
	public boolean getCeldaEnCuestion() {return celda_en_cuestion;}
    public boolean getCeldaJugada() {return celda_jugada;}
 
    public void setCeldaJugada(boolean t) {celda_jugada=t;}
	public void setCeldaEnCuestion(boolean c) {celda_en_cuestion=c;}
	public void setElement(int e) {elemento=e;}
	public void setCuadrante(int c) { cuadrante=c;}
	public void setConflicto(boolean c) {esta_en_conflicto=c;}
	public void setCeldaInicial(boolean c) { celda_inicial=c;}
	
	public int getCantElementos() {
		return entidad_grafica.getImagenes().length;
	}
	
	public boolean getCeldaInicial() {return celda_inicial;}
	
	}


