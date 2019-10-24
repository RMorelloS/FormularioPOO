import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComponent;
public class PanelDatosMedico extends JPanel{
  static JLabel nombreMedico;
  static JTextField txtNombreMedico;
  static JLabel vacio;
  static JLabel lblfechaEvaluacion;
  static JFormattedTextField fechaEvaluacion;
  protected MaskFormatter createFormatter(String s) {
	    MaskFormatter formatter = null;
	    try {
	        formatter = new MaskFormatter(s);
	    } catch (java.text.ParseException exc) {
	        System.err.println("formatter is bad: " + exc.getMessage());
	        System.exit(-1);
	    }
		  return formatter;
	}
	PanelDatosMedico(){
		setLayout(new GridLayout(2,2));
		nombreMedico = new JLabel("Nombre del medico y/o nutriologo:", SwingConstants.CENTER);
		nombreMedico.setBounds(200,22,150,10);
		add(nombreMedico);
		PanelNombresMedico pNM = new PanelNombresMedico();
		add(pNM);
	    lblfechaEvaluacion = new JLabel("Fecha de evaluacion (dd/mm/aaaa):", SwingConstants.CENTER);
	    lblfechaEvaluacion.setBounds(200,22,150,10);
	    add(lblfechaEvaluacion);
	    fechaEvaluacion = new JFormattedTextField( createFormatter("##/##/####"));
	    fechaEvaluacion.setBounds(350,22,120,25);
	    add(fechaEvaluacion);
	}
}
