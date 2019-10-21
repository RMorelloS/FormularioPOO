import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class NombrePaciente extends JPanel{
    static JLabel nombrePaciente;
    static JTextField txtNombrePaciente;
    static JLabel vacio;

    NombrePaciente(){
      setLayout(new GridLayout(1,2));
      this.setBackground(Color.white);
      nombrePaciente = new JLabel("B.1Nombre:", SwingConstants.CENTER);
      nombrePaciente.setBounds(200,22,150,10);
      add(nombrePaciente);
      PanelNombresPaciente pNP = new PanelNombresPaciente();
      add(pNP);


    }

}
