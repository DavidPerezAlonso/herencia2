package poligons;


import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Vista extends JFrame{

	//private JFrame frmPolgonos;
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container bloqueContenedor = null;
	JLabel etiqueta1 = null;
	JLabel etiqueta2 = null;
	JLabel etiqueta3 = null;
	
	ButtonGroup buttonGroup = new ButtonGroup();
	JRadioButton rdbtnNewRadioButton = null;
	JRadioButton rdbtnNewRadioButton_1 = null;
	JComboBox comboBox = null;
	JComboBox comboBox_1 = null;
			
	JButton btnDibuja = null;
	
	/**
	 * Create the application.
	 */
	public Vista() {
	
		bloqueContenedor = getContentPane();
		
		// Establece los parámetros principales del frame
		setTitle("Pol\u00EDgonos");
		setBounds(100, 100, 438, 196);
		//setLayout(new GroupLayout(bloqueContenedor));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		etiqueta1 = new JLabel("Escoge pol\u00EDgono, luego el tama\u00F1o del lado y el caracter para construirlo y \u00A1Dibuja!");
				
		// Escoge entre tirángulo y rectángulo con un buton radio
		rdbtnNewRadioButton = new JRadioButton("Triangulo");
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Rect\u00E1ngulo");
		buttonGroup.add(rdbtnNewRadioButton_1);
		
		// Para escoger tamaño del lado, etiqueta + comboBox del 1 al 10
		etiqueta2 = new JLabel("Tama\u00F1o");
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		
		// PAra escoger el caracter con el que dibujar el polígono
		etiqueta3 = new JLabel("Caracter");
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"*", "+", "X"}));
		
		//Botón para dibujar
		btnDibuja = new JButton("Dibuja");
		
		// Construye todo el layout		
		GroupLayout groupLayout = new GroupLayout(bloqueContenedor);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(etiqueta1)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(rdbtnNewRadioButton_1))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(etiqueta2)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
							.addGap(30)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBox_1, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(etiqueta3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
							.addComponent(btnDibuja)
							.addGap(45)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(etiqueta1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton)
								.addComponent(etiqueta2)
								.addComponent(etiqueta3))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(35)
							.addComponent(btnDibuja)))
					.addContainerGap(48, Short.MAX_VALUE))
		);
		getContentPane().setLayout(groupLayout);
		
		setVisible(true);
	}
}
