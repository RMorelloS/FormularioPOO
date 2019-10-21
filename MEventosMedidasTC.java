import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.lang.*;
import javax.swing.*;
import java.text.ParseException;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.text.MaskFormatter;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.text.*;
import javax.swing.JFormattedTextField.AbstractFormatter;
          import  javax.swing.text.DefaultFormatter;
              import  javax.swing.text.MaskFormatter ;
public class MEventosMedidasTC implements ActionListener {
	 ArrayList<InformacionPaciente> arrayConsulta;
	 MEventosMedidasTC(){
		 	arrayConsulta = new ArrayList<InformacionPaciente>();
	 }
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == Container.gravar) {
			InformacionPaciente info = new InformacionPaciente();

			info.apellidoPaternoMedico = PanelNombresMedico.apellidoPaternoMedico.getText();
			info.apellidoMaternoMedico = PanelNombresMedico.apellidoMaternoMedico.getText();
			info.nombreMedico = PanelNombresMedico.nombreMedico.getText();


			info.apellidoPaternoPaciente = PanelNombresPaciente.apellidoPaternoPaciente.getText();
			info.apellidoMaternoPaciente = PanelNombresPaciente.apellidoMaternoPaciente.getText();
			info.nombrePaciente = PanelNombresPaciente.nombrePaciente.getText();




			info.sexoPaciente = SexoPaciente.cbSexoPaciente.getSelectedCheckbox().getLabel();

			info.fechaNacimientoPaciente = FechaNacimientoPaciente.txtfechaNacimientoPaciente.getText();
			info.fechaEvaluacionMedico = PanelDatosMedico.fechaEvaluacion.getText();

			String edadTemp = EdadPaciente.txtEdad.getText();
			String numExtTemp = DireccionPaciente.txtNumeroExterior.getText();
			String numIntTemp = DireccionPaciente.txtNumeroInterior.getText();
			String telMovTemp = DireccionPaciente.txtTelefoneMovil.getText();
			String codPostTemp = DireccionPaciente.txtCodigoPostal.getText();
			String telFijTemp = DireccionPaciente.txtTelefoneCasa.getText();
			String anosCasaTemp = TiempoDomicilioPaciente.txtAnos.getText();
			String mesesCasaTemp = TiempoDomicilioPaciente.txtMeses.getText();
			ArrayList<String> arrayTestInt = new ArrayList<String>();
			arrayTestInt.add(edadTemp);
			arrayTestInt.add(numExtTemp);
			arrayTestInt.add(numIntTemp);
			arrayTestInt.add(telMovTemp);
			arrayTestInt.add(codPostTemp);
			arrayTestInt.add(telFijTemp);
			arrayTestInt.add(anosCasaTemp);
			arrayTestInt.add(mesesCasaTemp);

			for (int i = 0; i < arrayTestInt.size(); i++){
				  String numFuturo = arrayTestInt.get(i);
					if (numFuturo.isEmpty()){
						   JOptionPane.showMessageDialog(null, "Verifique los campos para que uno no estea vacio", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
					 	  return;
					}
					try {
			     Integer.parseInt(numFuturo);
				  }
					catch (NumberFormatException e) {
					     JOptionPane.showMessageDialog(null, "Uno de los campos numericos contiene caracteres!");
							 return;
					}
		 }
		 	info.edadPaciente = Integer.parseInt(edadTemp);
			info.numeroExteriorPaciente = Integer.parseInt(numExtTemp);
			info.numeroInteriorCasaPaciente = Integer.parseInt(numIntTemp);
			info.telefonoMovilPaciente = Integer.parseInt(telMovTemp);
			info.codigoPostalPaciente = Integer.parseInt(codPostTemp);
			info.telefonoFijoPaciente = Integer.parseInt(telFijTemp);
			info.anosVivendoCasaPaciente = Integer.parseInt(anosCasaTemp);
			info.mesesVivendoCasaPaciente = Integer.parseInt(mesesCasaTemp);

			info.callePaciente = DireccionPaciente.txtCalle.getText();
			info.zonaPaciente = DireccionPaciente.txtZona.getText();



			info.delegacionMunicipioPaciente = DireccionPaciente.txtDelegacionMunicipio.getText();


			info.estadoOrigenPaciente = EstadoPaciente.txtEstado.getText();
			info.nivelEstudiosPaciente = CBEstudioPaciente.cbNivelEstudioPaciente.getSelectedCheckbox().getLabel();
			info.escritaPaciente =  EscritaPaciente.cbSabeEscribirPaciente.getSelectedCheckbox().getLabel();
			info.leePaciente =   LecturaPaciente.cbSabeLeerPaciente.getSelectedCheckbox().getLabel();
			info.dedicacionPaciente = DedicacionPaciente.cbDedicacionPaciente.getSelectedCheckbox().getLabel();
			info.religionPaciente = ReligionPaciente.cbReligionPaciente.getSelectedCheckbox().getLabel();
			info.estadoCivil = CBEstadoCivilPaciente.cbEstadoCivilPaciente.getSelectedCheckbox().getLabel();


			ArrayList<String> todasString= new ArrayList<String>();
			todasString.add(info.apellidoPaternoMedico);
			todasString.add(info.apellidoMaternoMedico);
			todasString.add(info.nombreMedico);
			todasString.add(info.apellidoPaternoPaciente);
			todasString.add(info.apellidoMaternoPaciente);
			todasString.add(info.nombrePaciente);
			todasString.add(info.callePaciente);
			todasString.add(info.zonaPaciente);
			todasString.add(info.delegacionMunicipioPaciente);
			todasString.add(info.estadoOrigenPaciente);
			for (int i = 0; i < todasString.size(); i++){
					String nombre = todasString.get(i);
					if (nombre.isEmpty()){
						 JOptionPane.showMessageDialog(null, "Verifique los campos de nombre para que uno no estea vacio", "Nombre vacio", JOptionPane.INFORMATION_MESSAGE);
						 return;
					}
					for (int j = 0; j < nombre.length(); j++){
							char c = nombre.charAt(j);
							if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || ((int) c >= 128 && (int) c <= 183) || ((int) c >= 224 && (int) c <= 237) || ((int) c == 198) || ((int) c == 199) )) {
									JOptionPane.showMessageDialog(null, "Character " + String.valueOf(c) + " invalido!", "Error en nombre", JOptionPane.INFORMATION_MESSAGE);
									return;
							}
					}
			}


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
