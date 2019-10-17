import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
public class PanelDatosMedico extends JPanel{
	static JLabel nombreMedico;
  static JTextField txtNombreMedico;
  static JLabel vacio;
  static JLabel lblfechaEvaluacion;
  static DateFormat formataFecha;
  static JFormattedTextField fechaEvaluacion;
	PanelDatosMedico(){

		setLayout(new GridLayout(3,2));
		this.setBackground(Color.white);
		nombreMedico = new JLabel("Nombre del medico y/o nutriologo:", SwingConstants.CENTER);
		nombreMedico.setBounds(200,22,150,10);
		add(nombreMedico);
    txtNombreMedico = new JTextField("",3);
		txtNombreMedico.setBounds(350,22,120,25);
		add(txtNombreMedico);
    vacio = new JLabel("");
    add(vacio);
    PanelNombres panelNombres = new PanelNombres();
    add(panelNombres);
    lblfechaEvaluacion = new JLabel("Fecha de evaluacion (dd/mm/aaaa):", SwingConstants.CENTER);
    lblfechaEvaluacion.setBounds(200,22,150,10);
    add(lblfechaEvaluacion);
    formataFecha = new SimpleDateFormat("dd-mm-aaaa");
    fechaEvaluacion = new JFormattedTextField(formataFecha);

    fechaEvaluacion.setBounds(350,22,120,25);
    add(fechaEvaluacion);
	}
}
