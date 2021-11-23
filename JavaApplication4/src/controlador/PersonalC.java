package controlador;

import dao.PersonalD;
import modelo.Personal;
import vistas.PersonalReg;

public class PersonalC {
    
    Personal personal;
    PersonalD dao;

    public PersonalC() {
        dao = new PersonalD();
        personal = new Personal();
    }    
    
    public static void limpiarComp(){
        PersonalReg.jtxtNombre.setText("");
        PersonalReg.jtxtApellido.setText("");
        PersonalReg.jtxtDni.setText("");
        PersonalReg.grupoSexo.clearSelection();
    }
    
    public void actualizarModelo() throws Exception{
        personal.setNombre(PersonalReg.jtxtNombre.getText());
        personal.setApellidos(PersonalReg.jtxtApellido.getText());
        personal.setDni(PersonalReg.jtxtDni.getText());
        personal.setSexo(PersonalReg.sexo);
    }
    
    public void registrar() throws Exception{
        try {
            actualizarModelo();
            dao.registrar(personal);
        } catch (Exception e) {
            System.out.println("Error en registrarC " + e.getMessage());
        }
    }
    
}
