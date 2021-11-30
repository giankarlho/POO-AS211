package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
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
            ps.setInt(5, personal.getId());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Personal actualizado", "Actualización", JOptionPane.WARNING_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "Personal eliminado", "Eliminación", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error en eliminarD " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error en eliminar al Personal");
        }
    }

    public void verDatos(DefaultTableModel modeloTabla, String dato, int tipo) {
        //default: todos, 1: nombre, 2: apellido, 3: dni
        String sql ="";
        switch (tipo) {            
            case 1:
                sql = "Select * from personal where nom_pers like '%" + dato + "%'";
                break;
            case 2:
                sql = "Select * from personal where ape_pers like '%" + dato + "%'";
                break;
            case 3:
                sql = "Select * from personal where dni_pers like '%" + dato + "%'";
                break;
            default:
                sql = "Select * from personal";
                break;
        }
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            String datos[] = new String[5]; // cantidad de columnas
            while (rs.next()) {
                for (int i = 0; i < 5; i++) {
                    datos[i] = rs.getString(i + 1);
                }
                modeloTabla.addRow(datos);
//                jtblPersonal.setModel(modeloTabla);
            }
            rs.close();
            ps.close();
        } catch (Exception e) {
            System.out.println("Error en setFilas " + e.getMessage());
        }
    }
    

}
