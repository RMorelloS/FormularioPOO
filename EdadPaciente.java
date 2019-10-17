import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class EdadPaciente extends JPanel{
    static JLabel anos;
    static JTextField txtEdad;
    static JLabel edad;
    EdadPaciente(){
      setLayout(new GridLayout(1,3));
      this.setBackground(Color.white);
      edad = new JLabel("B.4 Edad:", SwingConstants.CENTER);
      edad.setBounds(200,22,150,10);
      add(edad);
      txtEdad = new JTextField("",3);
      add(txtEdad);
      anos = new JLabel("anos", SwingConstants.CENTER);
      edad.setBounds(500,22,150,10);
      add(anos);

    }

}
