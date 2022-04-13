
package sistema;

import sistema.empleadosBL.empleadosBL;
import sistema.empleadosGUI.frmEmpleados;


public class Sistema {

   
    public static void main(String[] args) {
        empleadosBL EM=new empleadosBL();
        frmEmpleados E=new frmEmpleados();
        E.setVisible(true);
    }
    
}
