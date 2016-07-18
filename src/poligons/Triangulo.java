package poligons;

public class Triangulo implements Figura{

	int Lado;
	char Tipo;
	char Caracter;
	
	public Triangulo(int parLado, char parTipo, char parChar){
		this.Lado = parLado;
		this.Caracter = parChar;
		this.Tipo = parTipo;
		
		
	}
	public String Nombre() {
		// TODO Auto-generated method stub
		return "Triángulo " + Tipo + "de " + Lado + " x " + Lado;
	}

	public void Dibujar() {
		// TODO Auto-generated method stub
		String auxBase = "";
		String auxBlank = "";
		int i = 0;
		
		//Calcula base
		for(i=0;i< Lado;i++){
			auxBase += this.Caracter;
			auxBlank += " ";
		}
		
		switch(Tipo){
		
		case 'a':
			System.out.println(auxBase);
			for (i=0; i<Lado; i++){
				System.out.println(auxBase.substring(0, Lado-i-1));
			}
			break;
		case 'b':
			System.out.println(auxBase);
			for (i=0; i<Lado; i++){
				System.out.print(auxBlank.substring(0,i+1));
				System.out.println(auxBase.substring(i+1, Lado));
			}
			break;
		
		case 'c':
			for (i=0; i<Lado; i++){
				System.out.print(auxBase.substring(0,i+1));
				System.out.println(auxBlank.substring(i+1, Lado));
			}
			break;
			
		case 'd':
			for (i=Lado; i>0; i--){
				System.out.print(auxBlank.substring(0,i-1));
				System.out.println(auxBase.substring(i-1, Lado));
			}
			break;
		
		}
	}

	public int Area() {
		// TODO Auto-generated method stub
		return (Lado * Lado)/2;
	}

	public char getCaracter(){
		return Caracter;
	}
	
	public void setCaracter(char parCaracter){
		this.Caracter = parCaracter;
	}

	
}
