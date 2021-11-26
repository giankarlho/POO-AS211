package dao;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import modelo.Personal;

public class PersonalD extends Conexion implements ICRUD<Personal> {

    @Override
    public void registrar(Personal personal) throws Exception {
        String sql = "insert into personal (nom_pers,ape_pers,sex_pers,dni_pers) values(?,?,?,?)";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, personal.getNombre());
            ps.setString(2, personal.getApellidos());
            ps.setString(3, personal.getSexo());
            ps.setString(4, personal.getDni());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Personal registrado");
        } catch (Exception e) {
            System.out.println("Error en registrarD " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en registrar al Personal");
        }
    }

    @Override
    public void modificar(Personal personal) throws Exception {
        String sql = "update personal set nom_pers=?,ape_pers=?,sex_pers=?,dni_pers=? where id_pers=?";
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ps.setString(1, personal.getNombre());
            ps.setString(2, personal.getApellidos());
            ps.setString(3, personal.getSexo());
            ps.setString(4, personal.getDni());
            ps.setInt(5,personal.getId());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null,"Personal actualizado","Actualización",JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error en modificarD " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en modificar al Personal");
        }
    }

    @Override
    public void eliminar(int codigo) throws Exception {
        String sql = "delete from personal where id_pers=" + codigo;
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);                        
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null,"Personal eliminado","Eliminación",JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error en eliminarD " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en eliminar al Personal");
        }
    }

}
