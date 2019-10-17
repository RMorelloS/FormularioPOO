import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class CedulaIdentificacion extends JPanel{

    static JLabel cedulaIdentificacion;
    CedulaIdentificacion(){

        cedulaIdentificacion = new JLabel("B Cedula de identificacion del paciente");
        cedulaIdentificacion.setBounds(200,22,300,10);
        add(cedulaIdentificacion);

    }

}
