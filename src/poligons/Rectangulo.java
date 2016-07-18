package poligons;

public class Rectangulo implements Figura{

		int Base;
		int Altura;
		char Caracter;
		
		// Constructor
		public Rectangulo(int parBase, int parAltura, char parChar){
			
			this.Base = parBase;
			this.Altura = parAltura;
			this.Caracter = parChar;
			
		}
		
		public String Nombre(){
			return "Rectangulo de " + Base + " x " + Altura;
		}
		
		public int Area(){
			return Base * Altura;
		}
		
		public char getCaracter(){
			return Caracter;
		}
		
		public void setCaracter(char parCaracter){
			this.Caracter = parCaracter;
		}
		
		public void Dibujar(){
			String auxBase = "";
			int i = 0;
			
			//Calcula base
			for(i=0;i<Base;i++){
				auxBase += this.Caracter;
			}
			for(i=0;i<Altura;i++){
				System.out.println(auxBase);
			}
			
			
		}
}
