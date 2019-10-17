import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
public class PresentacionEncuestador extends JPanel{
	static JLabel descripcionDatosEncuestador;
	static JLabel vacio;

	PresentacionEncuestador(){

		setLayout(new GridLayout(2,1));
		this.setBackground(Color.white);
		descripcionDatosEncuestador = new JLabel("A datos de identificacion del encuestador", SwingConstants.CENTER);
		descripcionDatosEncuestador.setBounds(200,22,300,10);
		add(descripcionDatosEncuestador);
		vacio = new JLabel("");
		descripcionDatosEncuestador.setBounds(200,22,300,10);
		vacio.setOpaque(true);
		vacio.setBackground(Color.lightGray);
		add(vacio);

	}
}
