import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MEventosMedidasTC implements ActionListener {
	 ArrayList<InformacionPaciente> arrayConsulta;
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == Container.gravar) {
			InformacionPaciente info = new InformacionPaciente();
			/*
			 * String[] nomesMedico = PanelDatosMedico.txtNombreMedico.getText().split(" ");
			 
			info.apellidoPaternoMedico = nomesMedico[0];
			info.apellidoMaternoMedico = nomesMedico[1];
			info.nombreMedico = nomesMedico[2];
			info.fechaEvaluacionMedico = PanelDatosMedico.fechaEvaluacion.getText();
			
			String[] nombresPaciente = NombrePaciente.txtNombrePaciente.getText().split(" ");
			info.apellidoPaternoPaciente = nombresPaciente[0];
			info.apellidoMaternoPaciente = nombresPaciente[1];
			info.nombrePaciente = nombresPaciente[2];
			
			info.sexoPaciente = SexoPaciente.cbSexoPaciente.getSelectedCheckbox().getLabel();
			info.fechaNacimientoPaciente = FechaNacimientoPaciente.txtfechaNacimientoPaciente.getText();
			info.edadPaciente = Integer.parseInt(EdadPaciente.txtEdad.getText());
			info.callePaciente = DireccionPaciente.txtCalle.getText();
			info.zonaPaciente = DireccionPaciente.txtZona.getText();
			info.telefonoFijoPaciente = DireccionPaciente.txtZona.getText();
			info.numeroExteriorPaciente = DireccionPaciente.txtNumeroExterior.getText();
			info.numeroInteriorCasaPaciente = Integer.parseInt(DireccionPaciente.txtNumeroInterior.getText());
			info.delegacionMunicipioPaciente = DireccionPaciente.txtDelegacionMunicipio.getText();
			info.telefonoMovilPaciente = DireccionPaciente.txtTelefoneMovil.getText();
			info.codigoPostalPaciente = DireccionPaciente.txtCodigoPostal.getText();
			info.anosVivendoCasaPaciente = Integer.parseInt(TiempoDomicilioPaciente.txtAnos.getText());
			info.mesesVivendoCasaPaciente = Integer.parseInt(TiempoDomicilioPaciente.txtMeses.getText());
			info.estadoOrigenPaciente = EstadoPaciente.txtEstado.getText();
			info.nivelEstudiosPaciente = Integer.parseInt(CBEstudioPaciente.cbEstadoCivilPaciente.getSelectedCheckbox().getLabel());
			info.escritaPaciente =  EscritaPaciente.cbSabeEscribirPaciente.getSelectedCheckbox().getLabel();
			info.leePaciente =   LecturaPaciente.cbSabeLeerPaciente.getSelectedCheckbox().getLabel();
			info.dedicacionPaciente = DedicacionPaciente.cbDedicacionPaciente.getSelectedCheckbox().getLabel();
			info.religionPaciente = ReligionPaciente.cbReligionPaciente.getSelectedCheckbox().getLabel();
			*/
			arrayConsulta.add(info);
			String presenta = "";
			presenta += "Apellido paterno medico: " + info.apellidoPaternoMedico + "\n";
			presenta += "Apellido materno medico: " + info.apellidoMaternoMedico + "\n";
			presenta += "Nombre medico: " + info.nombreMedico + "\n";
			presenta += "Fecha evaluacion medico: " + info.fechaEvaluacionMedico + "\n";
			presenta += "Apellido paterno paciente: " + info.apellidoPaternoPaciente + "\n";
			presenta += "Apellido materno paciente: " + info.apellidoMaternoPaciente + "\n";
			presenta += "Nombre paciente: " + info.nombrePaciente + "\n";
			presenta += "Sexo paciente: " + info.sexoPaciente + "\n";
			presenta += "Fecha nacimiento paciente: " + info.fechaNacimientoPaciente + "\n";
			presenta += "Edad paciente: " + info.edadPaciente + "\n";
			presenta += "Calle paciente: " + info.callePaciente + "\n";
			presenta += "Zona paciente: " + info.zonaPaciente + "\n";
			presenta += "Telefono fijo paciente: " + info.telefonoFijoPaciente + "\n";
			presenta += "Telefono movil paciente: " + info.telefonoMovilPaciente + "\n";
			presenta += "Numero exterior casa paciente: " + info.numeroExteriorPaciente + "\n";
			presenta += "Numero interior casa paciente: " + info.numeroInteriorCasaPaciente + "\n";
			presenta += "Delegacion/municipio paciente: " + info.delegacionMunicipioPaciente+ "\n";
			presenta += "Codigo postal paciente: " + info.codigoPostalPaciente + "\n";
			presenta += "Anos vivendo na casa del paciente: " + info.anosVivendoCasaPaciente + "\n";
			presenta += "Meses vivendo na casa del paciente: " + info.mesesVivendoCasaPaciente + "\n";
			presenta += "Esado origen paciente: " + info.estadoOrigenPaciente + "\n";
			presenta += "Nivel estudios paciente: " + info.nivelEstudiosPaciente + "\n";
			presenta += "Paciente sabe escribir: " + info.escritaPaciente + "\n";
			presenta += "Paciente sabe leer: " + info.leePaciente + "\n";
			presenta += "Ocupacion paciente: " + info.dedicacionPaciente + "\n";
			presenta += "Religion paciente: " + info.religionPaciente + "\n";
			
			
			JOptionPane.showMessageDialog(null, presenta, "info paciente", JOptionPane.INFORMATION_MESSAGE);
		}
		
	}

	
}
