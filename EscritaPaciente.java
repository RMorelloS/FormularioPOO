import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class EscritaPaciente extends JPanel{
    static CheckboxGroup cbSabeEscribirPaciente;
    static JLabel sabeEscribir;
    
    EscritaPaciente(){
      setLayout(new GridLayout(1,3));
      this.setBackground(Color.white);
      sabeEscribir = new JLabel("Sabe escribir?");
      add(sabeEscribir);
      cbSabeEscribirPaciente = new CheckboxGroup();
      add(new Checkbox("0. Si", cbSabeEscribirPaciente, true));
      add(new Checkbox("1. No", cbSabeEscribirPaciente, true));
      
      
    }

}
