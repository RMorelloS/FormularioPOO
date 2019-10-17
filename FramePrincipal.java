import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
public class FramePrincipal extends JFrame {

	/**
	 *
	 */
	FramePrincipal(){

			setSize(1000,1000);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(true);

			setLayout(new GridLayout(11,1));
	    PresentacionEncuestador panelPresentacion = new PresentacionEncuestador();
			this.add(panelPresentacion);
	    PanelDatosMedico panelMedico = new PanelDatosMedico();
	    this.add(panelMedico);
			CedulaIdentificacion cedula = new CedulaIdentificacion();
			this.add(cedula);
			NombrePaciente nombre = new NombrePaciente();
			this.add(nombre);
			SexoPaciente sexo = new SexoPaciente();
			this.add(sexo);
			FechaNacimientoPaciente fecha = new FechaNacimientoPaciente();
			this.add(fecha);
			EdadPaciente edad = new EdadPaciente();
			this.add(edad);
			DireccionPaciente direccionPaciente = new DireccionPaciente();
			add(direccionPaciente);
			TiempoDomicilioPaciente tiempoDomicilioPaciente = new TiempoDomicilioPaciente();
			add(tiempoDomicilioPaciente);
			EstadoPaciente estadoPaciente = new EstadoPaciente();
			add(estadoPaciente);
			EstadoCivilPaciente estadoCivilPaciente = new EstadoCivilPaciente();
			add(estadoCivilPaciente);
	}
}
