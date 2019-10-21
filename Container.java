import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.ArrayList;
public class Container extends JPanel {
	static JButton gravar;
	
	Container(){
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
	    PresentacionEncuestador panelPresentacion = new PresentacionEncuestador();
			this.add(panelPresentacion);
	    PanelDatosMedico panelMedico = new PanelDatosMedico();
	    this.add(panelMedico);
			CedulaIdentificacion cedula = new CedulaIdentificacion();
			this.add(cedula);		NombrePaciente nombre = new NombrePaciente();
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
			NivelEstudiosPaciente n1 = new NivelEstudiosPaciente();
			add(n1);
			LecturaPaciente l1 = new LecturaPaciente();
			add(l1);
			EscritaPaciente e1 = new EscritaPaciente();
			add(e1);
			DedicacionReligionPaciente dr1 = new DedicacionReligionPaciente();
			add(dr1);
			gravar = new JButton("Gravar datos");
			add(gravar);
			MEventosMedidasTC manejador = new MEventosMedidasTC();
			gravar.addActionListener(manejador);
	}

}
