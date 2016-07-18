package poligons;

import java.awt.event.*;

public class Controlador implements ActionListener{


	/**
	 * @param args
	 */
	Vista objVista = null;
	
	public Controlador(Vista objVista){
		
		this.objVista = objVista;
		
		actionListener(this); // Escuchador para el botón
	}
	
	
	public void actionListener(ActionListener escuchador){
		objVista.btnDibuja.addActionListener(escuchador);
	}

	public void actionPerformed(ActionEvent arg0) {
		String tamano = this.objVista.comboBox.getSelectedItem().toString();
		String caracter = this.objVista.comboBox_1.getSelectedItem().toString();
		
		int parint = Integer.parseInt(tamano);
		char parchar = caracter.charAt(0);
				
		if(this.objVista.rdbtnNewRadioButton.isSelected() == false){
			Rectangulo rectangle = new Rectangulo(parint, parint, parchar);
			rectangle.Dibujar();
		}
		else{
			Triangulo triangle = new Triangulo(parint, 'a', parchar);
			triangle.Dibujar();
		}
		//System.out.println(numero1);
		
	}
		
	

	

}

