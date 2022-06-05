//Brandon Isaias AmpÃ©rez Aldana 0909-21-4628
package ejercicioregistrosba;

import java.util.Scanner;

/**
 *
 * @author BRANDON
 */
public class EjercicioRegistrosBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      Scanner sc= new Scanner(System.in);
         DepartamentosA ejerciciosListasB= new DepartamentosA();
         EjercicioRegistrosBA departamentosA=new EjercicioRegistrosBA();
         DepartamentosB departamentosB =new DepartamentosB();
         
         
          int opcion =0;
          
         do{
              System.out.println("-------------------------------------------------------------------");
              System.out.println("-------Bienvenido al programa de registro de DepartamentosBA-------");
              System.out.println("-------------------------------------------------------------------");
              System.out.println("Seleccione la opcion de registro que desee utilizar: ");
              System.out.println("{1) Registro de datos con arrays"); 
              System.out.println("{2) Registro de datos con listas"); 
              System.out.println("{3) MostrarHistorial Arrays");
              System.out.println("{4) MostrarHistorial Listas ");
              System.out.println("{5) Limpiar Lista ");
              System.out.println("{0) Salir");
              
              
              System.out.println("Ingrese la opcion que desea usar: ");
                  opcion =sc.nextInt();
                  
              switch(opcion){
                 
                 case 1:
                     
                     int opcionA = 0;
                     
                     do{
                         
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("----Bienvenido usuario seleccione la opcion a registrar: ----");
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("(1) Registrar departamentos");
                       System.out.println("(2) Buscar departamento por numero"); 
                       System.out.println("(3) Buscar cabecera departamental"); 
                       System.out.println("(4) Mostrar los departamentos por posiciones impares");
                       System.out.println("(0) Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionA =sc.nextInt();
                     
 
              switch(opcionA){

                case 1:
                     
                   int registroA=0;
                     String nombreA="";
                     int numeroB=0;
                     String nombreB="";
                     
                    
                     
                     ejerciciosListasB.datosDepa2();
                     
      

	          break;
                  
                  case 2:
                   
                   ejerciciosListasB.mostrarDatosDepartamento();
                         
      
	          break;
                  
                 case 3:
                      
                      ejerciciosListasB.mostrarDatosCabecera();
                                        
	          break;
                  
                  case 4:
                      
                     ejerciciosListasB.PosicionImpar();
                     
	          break;
                  
  
                case 0:
                     
	          break;
                }
              
             }while(opcionA!=0);
   
             break;
             
                case 2:
                    
                     
                     int opcionAB = 0;
                     
                     do{
                         
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("----Bienvenido usuario seleccione la opcion a registrar: ----");
                       System.out.println("-------------------------------------------------------------");
                       System.out.println("(1) Registrar departamentos");
                       System.out.println("(2) Buscar departamento por numero"); 
                       System.out.println("(0) Volver al inicio");
                       
                     System.out.println("Ingrese la opcion que desea usar: ");
                     opcionAB =sc.nextInt();
                     
 
              switch(opcionAB){

                case 1:
                    
                      String nombreD="";
                      int numeroM=0;
                      String nombreC="";
                      int registroA=0;
 
                        departamentosB.listaDepa();
                          

	          break;
                  
                  case 2:
                      
                      departamentosB.mostrarDepa();
                     
	          break;
                  

                case 0:
                     
	          break;
                }
              
             }while(opcionAB!=0);
   
             break;
                     
                 
                case 3:
                  
                           ejerciciosListasB.mostrarDatos();

                 break;
                 
                case 4:
                        
                           departamentosB.lista();
                     
                 break;
                 
                  case 5:
                        
                           departamentosB.clearListDepa();
                     
                 break;
                
                 
                case 0:
                              
                 break;
                 
              }
         
         }while(opcion!=0);        
    
         System.out.println("El programa a finalizado");
    }
}