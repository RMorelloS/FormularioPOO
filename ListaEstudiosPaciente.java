import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.font.*;
public class ListaEstudiosPaciente extends JPanel{
    static JLabel noEstudio;
    static JLabel primaria;
    static JLabel secundaria;
    static JLabel preparatoria;
    static JLabel licenciatura;
    static JLabel postgrado;
    
    ListaEstudiosPaciente(){
      setLayout(new GridLayout(6,1));

      noEstudio = new JLabel("No estudió", SwingConstants.CENTER);
      add(noEstudio);
      primaria = new JLabel("Primaria en años", SwingConstants.CENTER);
      add(primaria);
      secundaria = new JLabel("Secundaria en años", SwingConstants.CENTER);
      add(secundaria);
      preparatoria = new JLabel("Preparatoria (técnico) en años", SwingConstants.CENTER);
      add(preparatoria);
      licenciatura = new JLabel("Licenciatura en años", SwingConstants.CENTER);
      add(licenciatura);
      postgrado = new JLabel("Postgrado en años", SwingConstants.CENTER);
      add(postgrado);
    }

}
