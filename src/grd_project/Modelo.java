package grd_project;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.toedter.calendar.JDateChooser;


public class Modelo {
    private ArrayList<String[]> datosDoctores;
    private ArrayList<String[]> datosIngresos;
    
    public Modelo() {
        datosDefaultDoctores();
        datosDefaultIngresos();
    }
    
    private void datosDefaultDoctores() {
        this.datosDoctores = new ArrayList<>();
        
        String[] fila1 = {"1", "César Bernal", "Programador", "Cardiología", "CODEX", "999999999999", "INSERTAR URL"};
        this.datosDoctores.add(fila1);
        
        String[] fila2 = {"2", "Nadia Gomez", "Biomédica", "Urgencias", "NADIAXD", "1234567891", "INSERTAR URL"};
        this.datosDoctores.add(fila2);

        String[] fila3 = {"3", "Oswaldo Sanchez", "Ingeniero", "Dermatología", "MRELLIOT", "9876543212", "INSERTAR URL"};
        this.datosDoctores.add(fila3);
    }
    
    private void datosDefaultIngresos() {
        this.datosIngresos = new ArrayList<>();
        
        String[] fila1 = {"1", "Melchor Serrano", "Nadia Gomez", "Gastritis", "Diagnóstico", "3", "Masculino", "18/01/1999", "15/04/2023", "INSERTAR URL"};
        this.datosIngresos.add(fila1);
        
        String[] fila2 = {"2", "Jacinta Patiño", "César Bernal", "Migraña", "Diagnóstico", "1", "Femenino", "28/09/1983", "10/03/2023", "INSERTAR URL"};
        this.datosIngresos.add(fila2);
        
        String[] fila3 = {"3", "Casimiro da Silva", "Nadia Gomez", "Insuficiencia renal", "Transfusión", "7", "Masculino", "07/10/2003", "15/04/2023", "INSERTAR URL"};
        this.datosIngresos.add(fila3);
    }
    
    public ArrayList<String[]> getDatosDoctores() {
        return datosDoctores;
    }
    
    public ArrayList<String[]> getDatosIngresos() {
        return datosIngresos;
    }
    
    public void eliminarDatos(int indice, ArrayList<String[]> datos) {
        if (indice >= 0 && indice < datos.size())
            datos.remove(indice);
        else
            System.out.println("Error: El índice proporcionado está fuera del rango de datos.");
    }
    
    public void modificarDatos(int indice, String[] nuevosDatos, ArrayList<String[]> datos) {
        if (indice >= 0 && indice < datos.size())
            datos.set(indice, nuevosDatos);
        else
            System.out.println("Índice inválido. No se pudo modificar el elemento.");
    }
    
    public int buscarPorNSS(String nssPaciente) {
        int indice = 0;
        for (String[] fila : datosIngresos) {
            if (fila[0].equalsIgnoreCase(nssPaciente)) {
                return indice;
            }
            indice++;
        }
        return -1;
    }
    
    //Fechas 
    SimpleDateFormat Formato = new SimpleDateFormat("dd-MM-yyyy");
    
    public String getFecha(JDateChooser jd){
        if (jd.getDate()!=null)
        {
        return Formato.format(jd.getDate());
        }
        else
        {
        return null;
        }
    }
   
    
    public java.util.Date StringADate(String fecha){
       SimpleDateFormat formato_del_Texto = new SimpleDateFormat("dd-MM-yyyy");
       Date fechaE=null;
       try {
       fechaE = formato_del_Texto.parse(fecha);
       return fechaE;
       } catch (ParseException ex) {
       return null;
       }
    }

    void setDate(JDateChooser jDateChooser2) {
      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      } 
}

