import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.awt.CheckboxGroup;
import java.awt.Checkbox;
import java.awt.Dimension;
public class DireccionPaciente extends JPanel{


    static JLabel direccion;
    static JLabel vacio1;
    static JLabel vacio2;
    static JLabel vacio3;
    static JLabel vacio4;
    static JLabel vacio5;
    static JLabel vacio6;
    static JLabel vacio7;
    static JLabel calle;
    static JTextField txtCalle;
    static JLabel numeroExterior;
    static JTextField txtNumeroExterior;
    static JLabel numeroInterior;
    static JTextField txtNumeroInterior;
    static JLabel zona;
    static JTextField txtZona;
    static JLabel delegacionMunicipio;
    static JTextField txtDelegacionMunicipio;
    static JLabel codigoPostal;
    static JTextField txtCodigoPostal;
    static JLabel telefoneCasa;
    static JTextField txtTelefoneCasa;
    static JLabel telefoneMovil;
    static JTextField txtTelefoneMovil;

    DireccionPaciente(){
        setLayout(new GridLayout(4,6));

        direccion = new JLabel("B.5 Direccion:");
        add(direccion);
        vacio1 = new JLabel("");
        add(vacio1);
        vacio2 = new JLabel("");
        add(vacio2);
        vacio3 = new JLabel("");
        add(vacio3);
        vacio4 = new JLabel("");
        add(vacio4);
        vacio5 = new JLabel("");
        add(vacio5);
        calle = new JLabel("Calle:");
        add(calle);
        txtCalle = new JTextField("",3);
        add(txtCalle);
        numeroExterior = new JLabel("Numero exterior:");
        add(numeroExterior);
        txtNumeroExterior = new JTextField("",3);
        add(txtNumeroExterior);
        numeroInterior = new JLabel("Numero interior:");
        add(numeroInterior);
        txtNumeroInterior = new JTextField("",3);
        add(txtNumeroInterior);
        zona = new JLabel("Zona:");
        add(zona);
        txtZona = new JTextField("",3);
        add(txtZona);
        delegacionMunicipio = new JLabel("Delegacion/Municipio:");
        add(delegacionMunicipio);
        txtDelegacionMunicipio = new JTextField("",3);
        add(txtDelegacionMunicipio);
        codigoPostal = new JLabel("Codigo postal:");
        add(codigoPostal);
        txtCodigoPostal = new JTextField("",3);
        add(txtCodigoPostal);
        telefoneCasa = new JLabel("B.6:Telefono fijo (casa):");
        add(telefoneCasa);
        txtTelefoneCasa = new JTextField("",3);
        add(txtTelefoneCasa);
        telefoneMovil = new JLabel("B.7:Telefono movil:");
        add(telefoneMovil);
        txtTelefoneMovil = new JTextField("",3);
        add(txtTelefoneMovil);
        vacio6 = new JLabel("");
        add(vacio6);
        vacio7 = new JLabel("");
        add(vacio7);
    }

}
