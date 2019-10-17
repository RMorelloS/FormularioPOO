import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class TiempoDomicilioPaciente extends JPanel{
    static JLabel tiempoDomicilio;
    static JTextField txtAnos;
    static JTextField txtMeses;
    static JLabel indicacion;
    TiempoDomicilioPaciente(){
      setLayout(new GridLayout(2,2));
      this.setBackground(Color.white);
      tiempoDomicilio = new JLabel("B.8 Cuanto tiempo lleva viviendo en este domicilio", SwingConstants.CENTER);
      tiempoDomicilio.setBounds(200,22,250,10);
      add(tiempoDomicilio);
      indicacion = new JLabel("(Indique meses o anos)");
      add(indicacion);
      txtAnos = new JTextField("B.8.1 Anos",3);
      add(txtAnos);
      txtMeses = new JTextField("B.8.2 Meses",3);
      add(txtMeses);

    }

}
