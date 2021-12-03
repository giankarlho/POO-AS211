package servicios;

import dao.Conexion;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;

import net.sf.jasperreports.engine.JasperPrint;

public class ReportGenerator {

    public static final String REPORTE_SIMPLE_PERSONAL = "ListPersonal.jasper";
    public static final String REPORTE_LAB_RESUMIDO_FECHAS = "RepLabResumido1.jasper";

    public static JasperPrint generarReporteSimplePersonal() throws JRException, ClassNotFoundException {
        try {
            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_SIMPLE_PERSONAL, new HashMap(), Conexion.conectar());
            return reporteLleno;
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    public static JasperPrint generarLabResumidoFechas(String fecha1, String fecha2, String estado, String fechaActual, String horaActual) throws JRException, ClassNotFoundException {
        try {
            HashMap parametros = new HashMap();
            parametros.put("Fecha1", fecha1);
            parametros.put("Fecha2", fecha2);
            parametros.put("estado", estado);
            parametros.put("pFecha", fechaActual);
            parametros.put("pHora", horaActual);
            JasperPrint reporteLleno = JasperFillManager.fillReport(REPORTE_LAB_RESUMIDO_FECHAS, parametros, Conexion.conectar());
            return reporteLleno;
        } catch (Exception e) {
            e.getMessage();
            System.out.println("JasperPrint generarTicket " + e.getMessage());
        }
        return null;
    }
}
