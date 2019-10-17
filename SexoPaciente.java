import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class SexoPaciente extends JPanel{
    static CheckboxGroup cbSexoPaciente;
    static JLabel sexoPaciente;


    SexoPaciente(){
      setLayout(new GridLayout(1,3));
      this.setBackground(Color.white);
      sexoPaciente = new JLabel("B.2 Sexo:", SwingConstants.CENTER);
      sexoPaciente.setBounds(200,22,150,10);
      add(sexoPaciente);
      cbSexoPaciente = new CheckboxGroup();
      add(new Checkbox("1 Hombre", cbSexoPaciente, true));
      add(new Checkbox("2 Mujer", cbSexoPaciente, true));
    }

}
