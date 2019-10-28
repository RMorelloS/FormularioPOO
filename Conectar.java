import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar{

    private static Connection conn;

    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost/alumnosPOO";

    public Conectar(){
        conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null){
                System.out.println("Se conecto");
            }
        }catch(ClassNotFoundException e){
            System.out.println("Error al cargar el controlador");
            e.printStackTrace();
        }catch(SQLException e){
            System.out.println("No se conecto");
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void DesConnecton(){
        conn = null;
        System.out.println("Termino conexion");
    }
    public void insertarRegistros(InformacionPaciente info){
         statementInsert = conn.createStatement();
         String sqlPaciente = "INSERT INTO Paciente " +
                      "VALUES (" +
                      "'" + info.apellidoPaternoPaciente + "'," +
                      "'" + info.apellidoMaternoPaciente + "'," +
                      "'" + info.nombrePaciente + "'," +
                      "'" + info.sexoPaciente + "'," +
                      "'" + info.fechaNacimientoPaciente + "'," +
                          + info.edadPaciente + "," +
                      "'" + info.callePaciente + "'," +
                      "'" + info.zonaPaciente + "'," +
                          + info.telefonoFijoPaciente + "," +
                          + info.numeroExteriorPaciente + "," +
                      "'" + info.delegacionMunicipioPaciente + "'," +
                          + info.telefonoMovilPaciente + "," +
                          + info.numeroInteriorCasaPaciente + "," +
                          + info.codigoPostalPaciente + "," +
                          + info.anosVivendoCasaPaciente + "," +
                          + info.mesesVivendoCasaPaciente + "," +
                      "'" + info.estadoOrigenPaciente + "'," +
                      "'" + info.nivelEstudiosPaciente + "'," +
                      "'" + info.leePaciente + "'," +
                      "'" + info.escritaPaciente + "'," +
                      "'" + info.dedicacionPaciente + "'," +
                      "'" + info.religionPaciente + "'," +
                      "'" + info.estadoCivil + "'" + ")"
           statementInsert.executeUpdate(sqlPaciente);
           String apellidoPaternoMedico;
           String apellidoMaternoMedico;
           String nombreMedico;
           String sqlMedico = "INSERT INTO Medico " +
                              "VALUES (" +
                              "'" + info.apellidoPaternoMedico + "'," +
                              "'" + info.apellidoMaternoMedico + "'," +
                              "'" + info.nombreMedico + "'" + ")"
          statementInsert.executeUpdate(sqlMedico);
          String sqlFechaEvaluacion = "INSERT INTO FechaEvaluacion" +
                                      "VALUES ("+
                                      "'" + info.fechaEvaluacionMedico + "'" + ")"

    }
    public void leerRegistros() throws SQLException{
        Statement statementPaciente = (Statement) conn.createStatement();
        ResultSet rsPaciente = statementPaciente.ExecuteQuery("Select * from Paciente");
        Statement statementMedico = (Statement) conn.createStatement();
        ResultSet rsMedico = statementMedico.ExecuteQuery("Select * from Medico");
        Statement statementFecha = (Statement) conn.createStatement();
        ResultSet rsFecha = statementMedico.ExecuteQuery("Select * from FechaEvaluacion");
        while(rsPaciente.next() && rsMedico.next() && rsFecha.next()){
          String presenta = "";
          presenta += "ID Paciente: " + rsPaciente.getString("idPaciente") + "\n";
          presenta += "Apellido paterno paciente: " + rsPaciente.getString("apellidoPaternoPaciente") + "\n";
          presenta += "Apellido materno paciente: " + rsPaciente.getString("apellidoMaternoPaciente") + "\n";
          presenta += "Nombre paciente: " + rsPaciente.getString("nombrePaciente") + "\n";
          presenta += "Sexo paciente: " + rsPaciente.getString("sexoPaciente") + "\n";
          presenta += "Fecha nacimiento paciente: " + rsPaciente.getString("fechaNacimientoPaciente") + "\n";
          presenta += "Edad paciente: " + rsPaciente.getInt("edadPaciente") + "\n";
          presenta += "Calle paciente: " + rsPaciente.getString("callePaciente") + "\n";
          presenta += "Zona paciente: " + rsPaciente.getString("zonaPaciente") + "\n";
          presenta += "Telefono fijo paciente: " + rsPaciente.getInt("telefonoFijoPaciente") + "\n";
          presenta += "Telefono movil paciente: " + rsPaciente.getInt("telefonoMovilPaciente") + "\n";
          presenta += "Numero exterior casa paciente: " + rsPaciente.getInt("numeroExteriorPaciente") + "\n";
          presenta += "Numero interior casa paciente: " + rsPaciente.getInt("numeroInteriorCasaPaciente") + "\n";
          presenta += "Delegacion/municipio paciente: " + rsPaciente.getString("delegacionMunicipioPaciente") + "\n";
          presenta += "Codigo postal paciente: " + rsPaciente.getInt("codigoPostalPaciente") + "\n";
          presenta += "Anos vivendo na casa del paciente: " + rsPaciente.getInt("anosVivendoCasaPaciente") + "\n";
          presenta += "Meses vivendo na casa del paciente: " + rsPaciente.getInt("mesesVivendoCasaPaciente") + "\n";
          presenta += "Esado origen paciente: " + rsPaciente.getString("estadoOrigenPaciente") + "\n";
          presenta += "Nivel estudios paciente: " + rsPaciente.getString("nivelEstudiosPaciente") + "\n";
          presenta += "Paciente sabe escribir: " + rsPaciente.getString("escritaPaciente") + "\n";
          presenta += "Paciente sabe leer: " + rsPaciente.getString("leePaciente") + "\n";
          presenta += "Ocupacion paciente: " + rsPaciente.getString("dedicacionPaciente") + "\n";
          presenta += "Religion paciente: " + rsPaciente.getString("religionPaciente") + "\n";
          presenta += "idMedico: " + rsMedico.getInt("idMedico") + "\n";
          presenta += "Apellido paterno medico: " + rsMedico.getString("apellidoPaternoMedico") + "\n";
          presenta += "Apellido materno medico: " + rsMedico.getString("apellidoMaternoMedico") + "\n";
          presenta += "Nombre medico: " + rsMedico.getString("nombreMedico") + "\n";
          presenta = "Fecha Evaluacion: " + rsFecha.getString("fechaEvaluacionMedico");
          JOptionPane.showMessageDialog(null, presenta, "info", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
