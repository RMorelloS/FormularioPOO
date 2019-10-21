import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class ReligionPaciente extends JPanel{
    static CheckboxGroup cbReligionPaciente;
    static JLabel religion;
    
    ReligionPaciente(){
      setLayout(new GridLayout(5,1));
      religion = new JLabel("B.15 De que religion eres usted?");
      add(religion);
      cbReligionPaciente = new CheckboxGroup();
      add(new Checkbox("0. Ninguna", cbReligionPaciente, true));
      add(new Checkbox("1. Catolica", cbReligionPaciente, true));
      add(new Checkbox("2. Budista", cbReligionPaciente, true));
      add(new Checkbox("3. Protestante", cbReligionPaciente, true));
   }

}
