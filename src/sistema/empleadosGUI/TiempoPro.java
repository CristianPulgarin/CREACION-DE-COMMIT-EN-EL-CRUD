package sistema.empleadosGUI;

import java.util.Calendar;
import java.util.GregorianCalendar;


 
    public class TiempoPro {
    
    Calendar fecha=new GregorianCalendar();
    
    
    String año=Integer.toString(fecha.get(Calendar.YEAR));
    String dia=Integer.toString(fecha.get(Calendar.DATE));
    String mes=Integer.toString(fecha.get(Calendar.MONTH));
    
    
    String fechaCompleta=dia+"-"+mes+"-"+año;
    
     String hora=Integer.toString(fecha.get(Calendar.HOUR_OF_DAY));
      String minuto=Integer.toString(fecha.get(Calendar.MINUTE));
      
      String horacompleta=hora+":"+minuto;
    
}
