package LedesmaGarciaRodrigo_EnvioPaquetes.controles;

// Rodrigo Ledesma Garcia. https://rodrigoledesmagarcia.com.mx/

import LedesmaGarciaRodrigo_EnvioPaquetes.Paquetes;
import LedesmaGarciaRodrigo_EnvioPaquetes.Sucursal;

import java.util.Scanner;

public class Controles {

//==================================== BUSCAR PAQUETE ===============================================================
public static int buscaPaquete(Paquetes s[],int numeropaquete, int contadorPaquete ){
    int indice = 0;
    boolean encontrado = false;
    for (int i =0; i < contadorPaquete; i++){
        if(s[i].getNumeropaquete() == numeropaquete){
            encontrado = true;
            indice = i;
        }
    }
    if (encontrado == false){
        indice = -1;
    }

    return indice;
}




//=====================================================================================================================

//================================= BUSCAR SUCURSAL ===================================================================
    public static int buscar(Sucursal s[],int numerosucursal, int contadorSucursal ){
        int indice = 0;
        boolean encontrado = false;
        for (int i =0; i < contadorSucursal; i++){
            if(s[i].getNumerosucursal() == numerosucursal){
                encontrado = true;
                indice = i;
            }
        }
        if (encontrado == false){
            indice = -1;
        }

        return indice;
    }

//======================================================================================================================

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//========================================= VARIABLES GLOBALES ======================================================

        int numerosucursal, numeropaquete, prioridad;
        String direccion, ciudad, id;
        double peso;
        int opcion;
        int contadorSucursal = 0;
        int contadorPaquete = 0;
        int indiceSucursal;
        double precioPaquete;
        int indicePaquete;

        Sucursal sucursales[] = new Sucursal[50];
        Paquetes paquetes[] = new Paquetes[100];

//===================================================================================================================
           do {
               System.out.println("         ***************** Menu *****************");
               System.out.println("         1. CREAR UNA NUEVA SUCURSAL");
               System.out.println("         2. ENVIAR PAQUETE");
               System.out.println("         3. CONSULTAR UNA SUCURSAL");
               System.out.println("         4. CONSULTAR ALGUN PAQUETE PAQUETE");
               System.out.println("         5. MOSTAR TODAS LAS SUCURSALES");
               System.out.println("         6. MOSTRAR TODOS LOS PAQUETES");
               System.out.println("         7. SALIR");
               opcion = teclado.nextInt();

               switch (opcion){
                   case 1:
                       System.out.println("\nDigite el  numero de sucursal ");
                       numerosucursal = teclado.nextInt();
                       System.out.println("Digite la direccion");
                       direccion = teclado.nextLine();
                       teclado.nextLine();
                       System.out.println("Digite la ciudad de la sucursal");
                       ciudad = teclado.nextLine();

                       sucursales[contadorSucursal] = new Sucursal(numerosucursal, direccion, ciudad);
                       contadorSucursal++;
                       break;

                   case 2:
                       System.out.println("Ingrese el numero de sucursal");
                       numerosucursal = teclado.nextInt();

                       indiceSucursal = buscar(sucursales, numerosucursal, contadorSucursal);

                       if (indiceSucursal == -1){
                           System.out.println("Esa sucursal no existe");
                       }else {
                           System.out.println("Digite el numero de paquete");
                           numeropaquete = teclado.nextInt();
                           teclado.nextLine();
                           System.out.println("Digitye el id de la persona que envia el paquete");
                           id = teclado.nextLine();
                           System.out.println("Digite el peso del paquete");
                           peso = teclado.nextDouble();
                           System.out.println("digite la prioridad del paquete");
                           prioridad = teclado.nextInt();

                           paquetes[contadorPaquete] = new Paquetes(numeropaquete,id, peso, prioridad);

                           precioPaquete = sucursales[indiceSucursal].calcularPrecio(paquetes[contadorPaquete]);
                           System.out.println("El precio es: "+precioPaquete+" MXN.");

                           contadorPaquete++;
                       }
                       break;


                   case 3:
                       System.out.println("Digite la sucursal a consultar");
                       numerosucursal = teclado.nextInt();

                       indiceSucursal = buscar(sucursales, numerosucursal, contadorSucursal);

                       if (indiceSucursal == -1){
                           System.out.println("esa sucursal no existe");
                       }else{
                           System.out.println("Los datos de la sucursal son "+sucursales[indiceSucursal].verDatosSucursal());
                       }
                       break;


                   case 4:
                       System.out.println("Digite el numero de paquete ");
                       numeropaquete = teclado.nextInt();

                       indicePaquete = buscaPaquete(paquetes, numeropaquete,contadorPaquete);

                       if(indicePaquete == -1){
                           System.out.println("El paquete no existe");
                       } else {
                           System.out.println("Los datos de paquete son ");
                           System.out.println(paquetes[indicePaquete].mostarDatosPaquete());
                       }
                       break;

                   case 5:
                       for (int i = 0; i < contadorSucursal; i++){
                           System.out.println("Los datos de la sucursal N° "+(i+1));
                           System.out.println(sucursales[i].verDatosSucursal());
                       }
                       break;
                   case 6:
                       for (int i = 0; i < contadorPaquete; i++){
                           System.out.println("Los datos de la sucursal N° "+(i+1));
                           System.out.println(paquetes[i].mostarDatosPaquete());
                       }
                       break;
                   case 7: break;
                   default:
                       System.out.println("Esa opcion no esta en el menu");
                       break;
               }



            }while(opcion != 7);

    }
}
