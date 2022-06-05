
package ejercicioregistrosba;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author BRANDON
 */
public class DepartamentosB {
      /* ArrayList<AlumnosB> listAlumnos = new ArrayList();*/
     List<DepartamentosB> listDepa = new ArrayList<DepartamentosB>();
    
    
     Scanner sc= new Scanner(System.in);
    
     
    int[] vector;
    private double[] matriz;
    private int indiceVector;
    String listaA;
    String verLista;
    int verLista2;
        
     
     String verNombreA;
     String verNombreB;
     String addAlumnosB;
     
      //constructor


    String nombreD;
    int numeroM;
    int registroA;
    String nombreC;
    
    
    
    public DepartamentosB() {
        
    }
    
    
    public DepartamentosB(String nombreD, int numeroM, String nombreC, int registroA) {
       
        this.nombreD = nombreD ;
        this.numeroM =numeroM;
        this.nombreC=nombreC;
        this.registroA=registroA;
        
    }

    public String getNombreD() {
        return nombreD;
    }

    public void setNombreD(String nombreD) {
        this.nombreD = nombreD;
    }

   

    public int getNumeroM() {
        return numeroM;
    }

    public void setNumeroM(int numeroM) {
        this.numeroM = numeroM;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getRegistroA() {
        return registroA;
    }

    public void setRegistroA(int registroA) {
        this.registroA = registroA;
    }
        
}

