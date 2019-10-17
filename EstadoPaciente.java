import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;

public class EstadoPaciente extends JPanel{
    static JLabel estado;
    static JTextField txtEstado;
    EstadoPaciente(){
      setLayout(new GridLayout(1,2));
      this.setBackground(Color.white);
      estado = new JLabel("B.9 Cual es tu estado o entidad federativa de origen", SwingConstants.CENTER);
      add(estado);
      txtEstado = new JTextField("",3);
      add(txtEstado);
    

    }

}
