import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class FechaNacimientoPaciente extends JPanel{
    static JFormattedTextField txtfechaNacimientoPaciente;
    static JLabel fechaNacimientoPaciente;
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
    FechaNacimientoPaciente(){
      setLayout(new GridLayout(1,2));
      this.setBackground(Color.white);
      fechaNacimientoPaciente = new JLabel("B.3 Fecha de nacimiento (dd/mm/aaaa):", SwingConstants.CENTER);
      fechaNacimientoPaciente.setBounds(200,22,150,10);
      add(fechaNacimientoPaciente);
      txtfechaNacimientoPaciente = new JFormattedTextField( createFormatter("##/##/####"));
	  add(txtfechaNacimientoPaciente);


    }

}
