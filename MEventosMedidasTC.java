import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.MaskFormatter;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import java.io.Serializable;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
public class MEventosMedidasTC implements ActionListener, Serializable {

	private static final String filepath="C:\\Users\\Ricardo\\Desktop\\bitacoras.txt";
 
	 ArrayList<InformacionPaciente> arrayConsulta;
	 MEventosMedidasTC(){
		 	arrayConsulta = new ArrayList<InformacionPaciente>();
	 }
	 public void WriteObjectToFile(InformacionPaciente info) {
	        try {
	        	File file = new File(filepath);
	            if (!file.exists()){
	            	file.createNewFile();
	            }
	            
	            FileWriter writer = new FileWriter(filepath, true);
	            writer.write(info.apellidoPaternoMedico);
	            writer.write("\n");
	        	writer.write(info.apellidoMaternoMedico);
	        	writer.write("\n");
	        	writer.write(info.nombreMedico);
	        	writer.write("\n");
	        	writer.write(info.fechaEvaluacionMedico);
	        	writer.write("\n");
	        	writer.write(info.apellidoPaternoPaciente);
	        	writer.write("\n");
				writer.write(info.apellidoMaternoPaciente);
				writer.write("\n");
				writer.write(info.nombrePaciente);
				writer.write("\n");
				writer.write(info.sexoPaciente);
				writer.write("\n");
				writer.write(info.fechaNacimientoPaciente);
				writer.write("\n");
				writer.write(String.valueOf(info.edadPaciente));
				writer.write("\n");
				writer.write(info.callePaciente);
				writer.write("\n");
				writer.write(info.zonaPaciente);
				writer.write("\n");
				writer.write(String.valueOf(info.telefonoFijoPaciente));
				writer.write("\n");
				writer.write(String.valueOf(info.telefonoMovilPaciente));
				writer.write("\n");
				writer.write(String.valueOf(info.numeroExteriorPaciente));
				writer.write("\n");
				writer.write(String.valueOf(info.numeroInteriorCasaPaciente));
				writer.write("\n");
				writer.write(info.delegacionMunicipioPaciente);
				writer.write("\n");
				writer.write(String.valueOf(info.codigoPostalPaciente));
				writer.write("\n");
				writer.write(String.valueOf(info.anosVivendoCasaPaciente));
				writer.write("\n");
				writer.write(String.valueOf(info.mesesVivendoCasaPaciente));
				writer.write("\n");
				writer.write(info.estadoOrigenPaciente);
				writer.write("\n");
				writer.write(info.nivelEstudiosPaciente);
				writer.write("\n");
				writer.write(info.escritaPaciente);
				writer.write("\n");
				writer.write(info.leePaciente);
				writer.write("\n");
				writer.write(info.dedicacionPaciente);
				writer.write("\n");
				writer.write(info.religionPaciente);
				writer.write("\n");
	            writer.close();
	            System.out.println("Objeto almacenado con suceso.");
	            
	         
	 
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	    }
	public boolean validaFecha(String fecha) {
		String[] separacionFecha = fecha.split("/");
		int dia = Integer.parseInt(separacionFecha[0]);
		int mes = Integer.parseInt(separacionFecha[1]);
		int ano = Integer.parseInt(separacionFecha[2]);
		if (mes > 12) {
			JOptionPane.showMessageDialog(null, "El valor del mes no puede ser superior a 12", "Fecha incorecta", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		if ((mes == 4 || mes == 6|| mes == 9|| mes == 11) && dia > 30) {
			JOptionPane.showMessageDialog(null, "El mes " + mes + " no puede tener más de 30 dias.", "Fecha incorecta", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
			JOptionPane.showMessageDialog(null, "El mes " + mes + " no puede tener más de 31 dias.", "Fecha incorecta", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}else if (mes == 2 && dia > 28) {
			JOptionPane.showMessageDialog(null, "El mes " + mes + " no puede tener más de 28 dias.", "Fecha incorecta", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		Date date = new Date();
		Date date1 = null;
		try {
			date1=new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}  
		if (date1.after(date)) {
			JOptionPane.showMessageDialog(null, "La fecha " + fecha + " no puede ser superior al da de hoy.", "Fecha incorecta", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		
		return true;
	}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == Container.gravar) {
			InformacionPaciente info = new InformacionPaciente();

			info.apellidoPaternoMedico = PanelNombresMedico.apellidoPaternoMedico.getText();
			if (info.apellidoPaternoMedico.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'apellido paterno del medico' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			info.apellidoMaternoMedico = PanelNombresMedico.apellidoMaternoMedico.getText();
			if (info.apellidoMaternoMedico.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'apellido materno del medico' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			info.nombreMedico = PanelNombresMedico.nombreMedico.getText();
			if (info.nombreMedico.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'nombre del medico' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}

			info.apellidoPaternoPaciente = PanelNombresPaciente.apellidoPaternoPaciente.getText();
			if (info.apellidoPaternoPaciente.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'apellido paterno del paciente' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			info.apellidoMaternoPaciente = PanelNombresPaciente.apellidoMaternoPaciente.getText();
			if (info.apellidoMaternoPaciente.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'apellido materno del paciente' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			info.nombrePaciente = PanelNombresPaciente.nombrePaciente.getText();
			if (info.nombrePaciente.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'nombre del paciente' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}

			info.sexoPaciente = SexoPaciente.cbSexoPaciente.getSelectedCheckbox().getLabel();

			info.fechaNacimientoPaciente = FechaNacimientoPaciente.txtfechaNacimientoPaciente.getText();
			if (info.fechaNacimientoPaciente.equals("  /  /    ")) {
				JOptionPane.showMessageDialog(null, "El campo 'fecha de nacimiento del paciente' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			if (!validaFecha(info.fechaNacimientoPaciente)){
				return;
			}
			info.fechaEvaluacionMedico = PanelDatosMedico.fechaEvaluacion.getText();
			if (!validaFecha(info.fechaEvaluacionMedico)){
				return;
			}
			if (info.fechaEvaluacionMedico.equals("  /  /    ")) {
				JOptionPane.showMessageDialog(null, "El campo 'fecha de la cita con el medico' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String edadTemp = EdadPaciente.txtEdad.getText();
			if (edadTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo ' edad del paciente' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String numExtTemp = DireccionPaciente.txtNumeroExterior.getText();
			if (numExtTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'numero exterior de la casa' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String numIntTemp = DireccionPaciente.txtNumeroInterior.getText();
			if (numIntTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'numero interior de la casa' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String telMovTemp = DireccionPaciente.txtTelefoneMovil.getText();
			if (telMovTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'telefono movil' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String codPostTemp = DireccionPaciente.txtCodigoPostal.getText();
			if (codPostTemp.isEmpty()){
				JOptionPane.showMessageDialog(null, "El campo 'codigo postal' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String telFijTemp = DireccionPaciente.txtTelefoneCasa.getText();
			if (telFijTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'telefono fijo' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String anosCasaTemp = TiempoDomicilioPaciente.txtAnos.getText();
			if (anosCasaTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'anos morando en la casa' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			String mesesCasaTemp = TiempoDomicilioPaciente.txtMeses.getText();
			if (mesesCasaTemp.isEmpty()) {
				JOptionPane.showMessageDialog(null, "El campo 'meses morando en la casa' no puede estar vacio.", "Campo vacio", JOptionPane.INFORMATION_MESSAGE);
				return;
			}
			try {
			     Integer.parseInt(edadTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo edad contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(numExtTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo numero exterior contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(numIntTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo numero interior contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(telMovTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo telefono movil contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(codPostTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo codigo postal contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(telFijTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo telefono fijo contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(anosCasaTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo anos morando en la casa contiene caracteres, solo puede tener numeros.");
				 return;
			}
			try {
			     Integer.parseInt(mesesCasaTemp);
			}catch (NumberFormatException e) {
			     JOptionPane.showMessageDialog(null, "El campo meses morando en la casa contiene caracteres, solo puede tener numeros.");
				 return;
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
							if (!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || ((int) c >= 128 && (int) c <= 183) || ((int) c >= 224 && (int) c <= 237) || ((int) c == 198) || ((int) c == 199) || c == ' ')) {
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


			//JOptionPane.showMessageDialog(null, presenta, "info paciente", JOptionPane.INFORMATION_MESSAGE);
			this.WriteObjectToFile(info);
		}else if(evento.getSource() == Container.presentar) {
			System.out.println("aa");
			 File file = 
				  new File("C:\\Users\\Ricardo\\Desktop\\bitacoras.txt"); 
		    Scanner sc = null;
			try {
				sc = new Scanner(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
				  
		     while (sc.hasNextLine()) {
		    	 String presenta = "";
					presenta += "Apellido paterno medico: " + sc.nextLine() + "\n";
					presenta += "Apellido materno medico: " + sc.nextLine() + "\n";
					presenta += "Nombre medico: " + sc.nextLine() + "\n";
					presenta += "Fecha evaluacion medico: " +  sc.nextLine()+ "\n";
					presenta += "Apellido paterno paciente: " +  sc.nextLine()+ "\n";
					presenta += "Apellido materno paciente: " + sc.nextLine()+ "\n";
					presenta += "Nombre paciente: " +  sc.nextLine()+ "\n";
					presenta += "Sexo paciente: " + sc.nextLine()+ "\n";
					presenta += "Fecha nacimiento paciente: " + sc.nextLine()+ "\n";
					presenta += "Edad paciente: " +  sc.nextLine()+ "\n";
					presenta += "Calle paciente: " + sc.nextLine()+ "\n";
					presenta += "Zona paciente: " + sc.nextLine()+ "\n";
					presenta += "Telefono fijo paciente: " + sc.nextLine()+ "\n";
					presenta += "Telefono movil paciente: " + sc.nextLine()+ "\n";
					presenta += "Numero exterior casa paciente: " + sc.nextLine()+ "\n";
					presenta += "Numero interior casa paciente: " + sc.nextLine()+ "\n";
					presenta += "Delegacion/municipio paciente: " + sc.nextLine()+ "\n";
					presenta += "Codigo postal paciente: " + sc.nextLine()+ "\n";
					presenta += "Anos vivendo na casa del paciente: " + sc.nextLine()+ "\n";
					presenta += "Meses vivendo na casa del paciente: " + sc.nextLine()+ "\n";
					presenta += "Esado origen paciente: " + sc.nextLine()+ "\n";
					presenta += "Nivel estudios paciente: " + sc.nextLine()+ "\n";
					presenta += "Paciente sabe escribir: " + sc.nextLine()+ "\n";
					presenta += "Paciente sabe leer: " + sc.nextLine()+ "\n";
					presenta += "Ocupacion paciente: " + sc.nextLine()+ "\n";
					presenta += "Religion paciente: " + sc.nextLine()+ "\n";


					JOptionPane.showMessageDialog(null, presenta, "info paciente", JOptionPane.INFORMATION_MESSAGE);

			 }
			 sc.close();
		}
	}

}
