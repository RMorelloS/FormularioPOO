import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
public class CBEstadoCivilPaciente extends JPanel{
    static CheckboxGroup cbEstadoCivilPaciente;
    static JLabel vacio;
    CBEstadoCivilPaciente(){
      setLayout(new GridLayout(4,2));
      this.setBackground(Color.white);
      cbEstadoCivilPaciente = new CheckboxGroup();
      add(new Checkbox("0. Casado", cbEstadoCivilPaciente, true));
      add(new Checkbox("4. Divorciado", cbEstadoCivilPaciente, true));
      add(new Checkbox("1. Union Libre", cbEstadoCivilPaciente, true));
      add(new Checkbox("2. Soltero", cbEstadoCivilPaciente, true));
      add(new Checkbox("999. No sabe", cbEstadoCivilPaciente, true));
      add(new Checkbox("3. Separado", cbEstadoCivilPaciente, true));
      vacio = new JLabel("");
      add(vacio);
    }

}
