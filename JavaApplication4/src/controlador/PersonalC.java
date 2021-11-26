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

    public static void limpiarComp() {
        PersonalReg.jtxtNombre.setText("");
        PersonalReg.jtxtApellido.setText("");
        PersonalReg.jtxtDni.setText("");
        PersonalReg.grupoSexo.clearSelection();
    }

    public void registrar() throws Exception {
        try {
            actualizarModelo();
            dao.registrar(personal);
        } catch (Exception e) {
            System.out.println("Error en registrarC " + e.getMessage());
        }
    }

    public void modificar() throws Exception {
        try {
            personal.setId(PersonalReg.codigo);
            actualizarModelo();
            dao.modificar(personal);
        } catch (Exception e) {
            System.out.println("Error en modificarC " + e.getMessage());
        }
    }

    public void eliminar() throws Exception {
        try {
            dao.eliminar(PersonalReg.codigo);
        } catch (Exception e) {
            System.out.println("Error en eliminarC " + e.getMessage());
        }
    }

    public void actualizarModelo() throws Exception {
        personal.setNombre(PersonalReg.jtxtNombre.getText());
        personal.setApellidos(PersonalReg.jtxtApellido.getText());
        personal.setDni(PersonalReg.jtxtDni.getText());
        personal.setSexo(PersonalReg.sexo);
    }
}
