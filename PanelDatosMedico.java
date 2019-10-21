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

		setLayout(new GridLayout(2,2));

		nombreMedico = new JLabel("Nombre del medico y/o nutriologo:", SwingConstants.CENTER);
		nombreMedico.setBounds(200,22,150,10);
		add(nombreMedico);
		PanelNombresMedico pNM = new PanelNombresMedico();
		add(pNM);
    //txtNombreMedico = new JTextField("",3);
		//txtNombreMedico.setBounds(350,22,120,25);
		//add(txtNombreMedico);
    //vacio = new JLabel("");
    //add(vacio);
    //PanelNombres panelNombres = new PanelNombres();
    //add(panelNombres);
    lblfechaEvaluacion = new JLabel("Fecha de evaluacion (dd/mm/aaaa):", SwingConstants.CENTER);
    lblfechaEvaluacion.setBounds(200,22,150,10);
    add(lblfechaEvaluacion);

		MaskFormatter dateMask;
		try {
		    dateMask = new MaskFormatter("##/##/####");
		    dateMask.setPlaceholderCharacter('/');
		    dateMask.setValidCharacters("0123456789");
		} catch (ParseException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		fechaEvaluacion = new JFormattedTextField(dateMask );
		fechaEvaluacion.setHorizontalAlignment(JTextField.RIGHT);



    fechaEvaluacion.setBounds(350,22,120,25);
    add(fechaEvaluacion);
	}
}
