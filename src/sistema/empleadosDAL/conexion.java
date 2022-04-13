/*
Utilizamos el paquete empleados DAL desde la clase sistema
 */
package sistema.empleadosDAL;
/*De igual forma importamos todo lo que necesitamos, librerias, dependencias, etc.*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



/**
 *Creamos la clase conexión para la BD con Sqlite asignandole la ubicación. 
 * @author Daniel
 */
public class conexion {
    String strConexionBD = "jdbc:sqlite:C:\\Users\\USUARIO\\Documents\\SEMESTRE 3- TECNICO PROFESIONAL EN SISTEMAS\\CONSTRUCCION DE SOFTWARE 2\\Base de datos\\sqliteadmin/sistemat.s3db";
    Connection conn = null;
    
/**
 *luego lanzamos exepciones que nos verifiquen si es exitosa o no la contexión,
 * esto se hace con el try catch y haciendo uso de las dependencias importadas
 * @author Daniel
 */    
    public conexion(){
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection(strConexionBD);
            
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            
            System.out.println("No es posible realizar la conexión"+ e);
        }
    }
    
 /*Creamos la clase ejecutar sentencia sql hacia el objeto conn y sus debidas exepciones*/
    
    public int ejecutarSentenciaSQL(String strSentenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }
/*Creamos la clase consultar registros hacia el objeto conn y sus debidas exepciones*/
    public ResultSet consultarRegistros(String strSentenciaSQL){
        try {
            PreparedStatement pstm= conn.prepareStatement(strSentenciaSQL);
            ResultSet respuesta= pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
