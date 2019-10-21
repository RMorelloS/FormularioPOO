import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.font.*;
public class NivelEstudiosPaciente extends JPanel{
    static JLabel nivelEstudios;
    static JLabel passeB14;
    NivelEstudiosPaciente(){
      setLayout(new GridLayout(1,4));
      nivelEstudios = new JLabel("B.10 Que nivel de estudios tienes?", SwingConstants.CENTER);
      add(nivelEstudios);
      passeB14 = new JLabel("(Pase al item B.14)", SwingConstants.CENTER);
      Font f = passeB14.getFont();
      passeB14.setFont(f.deriveFont(f.getStyle() | Font.BOLD));
      add(passeB14);
      ListaEstudiosPaciente lista = new ListaEstudiosPaciente();
      add(lista);
      CBEstudioPaciente cb1 = new CBEstudioPaciente();
      add(cb1);
      
    }

}
