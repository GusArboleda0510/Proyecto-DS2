/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import co.edu.modelo.Novedades;
import co.edu.modelo.RegistroEntradaSalida;
import co.edu.univalle.persistencia.DAOFactory;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author kevin
 */
public class ControlReporte {

    String fechaInicial, fechaFinal;

    public ControlReporte() {
    }

    public ControlReporte(String fechaInicial, String fechaFinal) {
        try {
            this.fechaInicial = fechaInicial;
            this.fechaFinal = fechaFinal;

        } catch (Exception ex) {
            Logger.getLogger(ControlReporte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int contarRegistrosEntradas() throws Exception {
        List<RegistroEntradaSalida> registroEntradaSalidas = DAOFactory.getRegistroEntradaSalidaDAO().consultarFechas(fechaInicial, fechaFinal);
        return registroEntradaSalidas.size();
    }

    public int contarRegistrosNovedades() throws Exception {
        List<Novedades> novedades = DAOFactory.getNovedadesDAO().consultarFechas(fechaInicial, fechaFinal);
        return novedades.size();
    }

    public void crearExcelEntradas() throws FileNotFoundException, IOException, Exception {

        Workbook libro = new XSSFWorkbook();
        Sheet sheet = libro.createSheet("Entradas");

        sheet.setColumnWidth(0, 4000);
        sheet.setColumnWidth(1, 4000);
        sheet.setColumnWidth(2, 4000);
        sheet.setColumnWidth(3, 4000);
        sheet.setColumnWidth(4, 6000);
        sheet.setColumnWidth(5, 4000);

        Row row = sheet.createRow(0);
        row.setHeightInPoints(25);
        row.createCell(0).setCellValue("No. Reporte");
        row.createCell(1).setCellValue("Hora Entrada");
        row.createCell(2).setCellValue("Fecha Entrada");
        row.createCell(3).setCellValue("No. documento");
        row.createCell(4).setCellValue("Nombre");
        row.createCell(5).setCellValue("Hora Salida");

        List<RegistroEntradaSalida> registroEntradaSalidas = DAOFactory.getRegistroEntradaSalidaDAO().consultarFechas(fechaInicial, fechaFinal);
        SimpleDateFormat formato = new SimpleDateFormat("hh: mm: ss");
        SimpleDateFormat formtoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Row fila = null;
        for (int i = 1; i < registroEntradaSalidas.size() + 1; i++) {
            int ind = 0;
            fila = sheet.createRow(i);

            for (RegistroEntradaSalida a : registroEntradaSalidas) {
                ind++;
                if (fila.getRowNum() == ind) {
                    fila.createCell(0).setCellValue(a.getControl());
                    fila.createCell(1).setCellValue(formato.format(a.getHoraEntrada()));
                    fila.createCell(2).setCellValue(formtoFecha.format(a.getFecha()));
                    fila.createCell(3).setCellValue(a.getCedula().hashCode());
                    fila.createCell(4).setCellValue(a.getCedula().getNombre().concat(" ").concat(a.getCedula().getApellido()));
                    if (a.getHoraSalida() != null) {
                        fila.createCell(5).setCellValue(formato.format(a.getHoraSalida()));
                    }
                }
            }
        }

        JFileChooser fc = new JFileChooser();
        int opcion = fc.showSaveDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            if (fc.getSelectedFile() != null) {
                FileOutputStream fileout = new FileOutputStream(fc.getSelectedFile() + ".xlsx");
                libro.write(fileout);
                fileout.close();
            }
        }

    }

    public void crearExcelNovedades() throws FileNotFoundException, IOException, Exception {

        Workbook libro = new XSSFWorkbook();
        Sheet sheet = libro.createSheet("Novedades");

        sheet.setColumnWidth(0, 4000);
        sheet.setColumnWidth(1, 4000);
        sheet.setColumnWidth(2, 4000);
        sheet.setColumnWidth(3, 4000);
        sheet.setColumnWidth(4, 6000);
        sheet.setColumnWidth(5, 4000);
        sheet.setColumnWidth(6, 4000);
        sheet.setColumnWidth(7, 4000);
        sheet.setColumnWidth(8, 7000);

        Row row = sheet.createRow(0);
        row.setHeightInPoints(25);
        row.createCell(0).setCellValue("No. Reporte ");
        row.createCell(1).setCellValue("Documento");
        row.createCell(2).setCellValue("Nombre");
        row.createCell(3).setCellValue("Temperatura");
        row.createCell(4).setCellValue("Convive con Menores");
        row.createCell(5).setCellValue("Convive con Mayores");
        row.createCell(6).setCellValue("Fecha De Registro");
        row.createCell(7).setCellValue("Hora De Registro");
        row.createCell(8).setCellValue("Observaciones");

        List<Novedades> novedades = DAOFactory.getNovedadesDAO().consultarFechas(fechaInicial, fechaFinal);
        SimpleDateFormat formato = new SimpleDateFormat("hh: mm: ss");
        SimpleDateFormat formtoFecha = new SimpleDateFormat("yyyy-MM-dd");
        Row fila = null;
        for (int i = 1; i < novedades.size() + 1; i++) {
            int ind = 0;
            fila = sheet.createRow(i);

            for (Novedades a : novedades) {
                ind++;
                if (fila.getRowNum() == ind) {
                    fila.createCell(0).setCellValue(a.getCodigo());
                    fila.createCell(1).setCellValue(a.getDocumento().hashCode());
                    fila.createCell(2).setCellValue(a.getDocumento().getNombre().concat(" ").concat(a.getDocumento().getApellido()));
                    fila.createCell(3).setCellValue(a.getTemperatura());
                    fila.createCell(4).setCellValue(a.getConviveMenores());
                    fila.createCell(5).setCellValue(a.getConviveMayores());
                    fila.createCell(6).setCellValue(formtoFecha.format(a.getFecha()));
                    fila.createCell(7).setCellValue(formato.format(a.getHora()));
                    fila.createCell(8).setCellValue(a.getObservaciones());

                }
            }

        }

        JFileChooser fc = new JFileChooser();
        int opcion = fc.showSaveDialog(null);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            if (fc.getSelectedFile() != null) {
                FileOutputStream fileout = new FileOutputStream(fc.getSelectedFile() + ".xlsx");
                libro.write(fileout);
                fileout.close();
            }
        }

    }

}
