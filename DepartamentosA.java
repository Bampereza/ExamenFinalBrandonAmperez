//Brandon Isaias AmpÃ©rez Aldana 0909-21-4628
package ejercicioregistrosba;

import java.util.Scanner;

/**
 *
 * @author BRANDON
 */
public class DepartamentosA {
      String nombreA = "";
     float codigoAA;
     float numeroBA;
     String nombreB = "";
     float codigoCA;
     String nombreCA = "";
     float codigoG;
     String descripcionAA ="";
    String[] vectorDatos;
     private int indiceVector;
     String[] vector;
     private String[] registrarDatos;
     String i="";
     int datosAlumnosB;
     String datosAlumnosBA;
     int datoCursoB;
     String datoCursoBA;
     int codigoA;
     int numeroB;
     int codigoC;
     int CodigoG;
     String correoA;
     int registroA;
     String registroB;
     
     
      Scanner sc= new Scanner(System.in);
     
     
     //constructor
 
     public DepartamentosA(){
       this.nombreA="";
        this.nombreB="";
        this.codigoA=0;
        this.numeroB=0;
        this.codigoC=0;
        this.CodigoG=0;
        this.correoA="";
        this.registroA=0;
        vectorDatos = new String [100];//inicializo el vector
         this.indiceVector= 0;  
         this.registrarDatos(i, i, i, i, nombreA);
         this.registrarDatos2(i, i, i, i, nombreA);
         this.registrarDatos3(i, i, i, i, registroA);
         this.registrarDatos4(i, i, i, i, registroA);
         this.registrarDatos5(i, i, i, i, nombreA);
       
     }

     public void datosDepa2 (){
         
         
                        System.out.println("--------------------------------------------");  
                        System.out.println("-----Ingrese La posicion del registro: -----");
                        System.out.println("--------------------------------------------");
                          registroA=sc.nextInt();
                        
         
                        System.out.println("--------------------------------------------");  
                        System.out.println("---Ingrese el nombre del Departamento: -----");
                        System.out.println("--------------------------------------------");
                          nombreA=sc.next();
                        
                         
                        System.out.println("------------------------------------------------------");  
                        System.out.println("-----Ingrese la cantidad de municipios que tiene: ----");
                        System.out.println("------------------------------------------------------"); 
                         numeroB= sc.nextInt();
                         
                         
                        System.out.println("------------------------------------------------");  
                        System.out.println("-----Ingrese la cabecera del departamento: -----");
                        System.out.println("------------------------------------------------"); 
                         nombreB=sc.next();
                         
                     
            this.registrarDatos4("Datos: ","","CabeceraDeDepartamento: ","",registroA);
            this.registrarDatos2("Datos: ","","NombreDeDepartamento: ","",nombreA);
            this.registrarDatos3("Datos: ","","CabeceraDeDepartamento: ","",numeroB);
            this.registrarDatos("Datos: ","","CabeceraDeDepartamento: ","",nombreB);
            
             
     }
     

     
     public void mostrarDatosDepartamento(){
       System.out.println("Ingresar el departamento a buscar");
        nombreA=sc.next();
        
        System.out.println("El departamento "+ nombreA +" esta ubicado en:"+registroA);
  
   }
     
      public void mostrarDatosCabecera(){
       System.out.println("Ingresar el departamento a buscar");
        nombreA=sc.next();
        
        System.out.println("El departamento "+ nombreA +" Posee como cabecera:"+nombreB);
  
   }
 
 public void PosicionImpar2(){
    
    
}
public void PosicionImpar(){
    
   int num;

                    int np = 0;
                    int nip=0;

    for(int i=1; i<=10; i++)
    {
        if(i%1==0)
        {
            nip= registroA;
        }
    }
    System.out.println("Los numeros impares son: ");
    System.out.println(nip);
    
    
}
    

    
   public void registrarDatos(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
   
   public void registrarDatos2(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
   
    public void registrarDatos3(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
    
     public void registrarDatos4(String tipo, String espacio1,String tipo1, String espacio2, int primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
     
     public void registrarDatos5(String tipo, String espacio1,String tipo1, String espacio2, String primerParametro){
       indiceVector=indiceVector+1;;
       
      vectorDatos[indiceVector]= tipo+espacio1+""+tipo1+espacio2+""+primerParametro;
   
    }
    
     
      public void mostrarDatos(){
          try{   
              System.out.println(vectorDatos.length);
            for (int i=1; i<vectorDatos.length;i++){
                if(vectorDatos[i]!=null){
                    System.out.println(vectorDatos[i]);
                }
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
     }

       public void almacenarDatos(String numero){
        this.vector[indiceVector]=numero;
        this.indiceVector=this.indiceVector+1;
    }
   
}
     


