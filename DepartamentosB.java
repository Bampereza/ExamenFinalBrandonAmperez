
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
     public void listaDepa(){
                        
                        System.out.println("----------------------------------------------");  
                        System.out.println("-----Ingrese el numero del departamento: -----");
                        System.out.println("----------------------------------------------");
                          registroA=sc.nextInt();
        
                        System.out.println("--------------------------------------------");  
                        System.out.println("---Ingrese el nombre del Departamento: -----");
                        System.out.println("--------------------------------------------");
                          nombreD=sc.next();
                        
                         
                        System.out.println("------------------------------------------------------");  
                        System.out.println("-----Ingrese la cantidad de municipios que tiene: ----");
                        System.out.println("------------------------------------------------------"); 
                         numeroM= sc.nextInt();
                         
                         
                        System.out.println("------------------------------------------------");  
                        System.out.println("-----Ingrese la cabecera del departamento: -----");
                        System.out.println("------------------------------------------------"); 
                         nombreC=sc.next();
                         
                         
        
        listDepa.add(new DepartamentosB(nombreD,numeroM,nombreC, registroA));
       
        //return verLista;
    }    
     
      public void lista(){

        System.out.println("----------------------------------");
        System.out.println("-------Lista Departamentos--------");
        System.out.println("----------------------------------");
        System.out.println("");
        //recorido for por índice
        for (int i=0; i<listDepa.size(); i++) {
            System.out.println("El departamento se registro con el numero: " + listDepa.get(i).getRegistroA());
            System.out.println("Nombre el departamento registrado es: " + listDepa.get(i).getNombreD());
            System.out.println("La cantidad de municipios que tiene es: " + listDepa.get(i).getNumeroM());
            System.out.println("La cabecera del departamento es: " + listDepa.get(i).getNombreC());
        }
        
        
    }
      
        public void mostrarDepa(){
		
          Scanner teclado = new Scanner (System.in);
          int indice;
          int registroB =0;
          System.out.println("Verificar registro del departamento.");
           registroB= teclado.nextInt();
          indice = listDepa.indexOf(registroB);
          if (indice != registroA){
                      System.out.println("El departamento registrado con este numero es: "+nombreD);
          }else {
              System.out.println("Este registro del departamento no se encuentra");

          }
    }
    
     public void clearListDepa(){
      listDepa.clear();
   }
}

