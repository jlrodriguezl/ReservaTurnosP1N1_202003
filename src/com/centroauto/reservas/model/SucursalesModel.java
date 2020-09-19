package com.centroauto.reservas.model;

import com.centroauto.reservas.dto.SucursalesDTO;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * Modelo para la tabla de datos de sucursales
 * @author jlrodriguez
 */
public class SucursalesModel extends AbstractTableModel{
    public static final int OBJECT_COL = -1;
    public static final int COL_ID_SUCURSAL = 0;
    public static final int COL_NOM_SUCURSAL = 1;
    public static final int COL_DIR_SUCURSAL = 2;
    public static final int COL_TEL_SUCURSAL = 3;
    public static final int COL_NOM_CIUDAD = 4;
    public static final int COL_NOM_DEPTO = 5;
    
    private String[] columnNames = {"IDENTIFICADOR", "NOMBRE", "DIRECCION",
                        "TELEFONO", "CIUDAD", "DEPARTAMENTO"};
    private List<SucursalesDTO> lstSucursales;
    
    //Constructor de la clase
    public SucursalesModel(List<SucursalesDTO> lstSucursales){
        this.lstSucursales = lstSucursales;
    }
    
    /**
     * Método que obtiene el número de columnas de la tabla de sucursales
     * @return num columnas
     */
    public int getColumnCount(){
        return columnNames.length;
    }
    
    /**
     * Método que obtiene el número de filas de la lista de sucursales
     * @return num filas
     */
    public int getRowCount(){
       if(lstSucursales != null && lstSucursales.size() > 0){
           return lstSucursales.size();
       }else{
           return 0;
       }
    }
    
    /**
     * Método que obtiene el encabezado de una columna a partir del índice
     * @param indice de la columna
     * @return nombre de la columna
     */
    public String getColumnName(int col){
        return columnNames[col];
    }
    
    public Object getValueAt(int row, int col){
        SucursalesDTO s = lstSucursales.get(row);
        switch(col){
            case COL_ID_SUCURSAL:
                return s.getIdSucursal();
            case COL_NOM_SUCURSAL:
                return s.getNomSucursal();
            case COL_DIR_SUCURSAL:
                return s.getDirSucursal();
            case COL_TEL_SUCURSAL:
                return s.getTelSucursal();
            case COL_NOM_CIUDAD:
                return s.getNomCiudad();
            case COL_NOM_DEPTO:
                return s.getNomDepto();
            case OBJECT_COL:
                return s;
            default:
                return s;
        }        
    }
}
