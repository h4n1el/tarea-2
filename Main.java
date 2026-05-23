import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Vehiculo car = new Vehiculo();
        Scanner boton = new Scanner(System.in);
        

        char opcion;

        do{
           System.out.println("1. Registrar vehiculo");
           System.out.println("2. Mostrar vehiculo");
           System.out.println("3. Buscar placa");
           System.out.println("4. salir");

           System.out.println("ingresa una opcion: ");
           opcion = boton.nextLine().charAt(0);

            switch(opcion)
            {
                case '1':
                    car.Registrar();
                    break;
                case '2':
                    car.Mostrar();
                    break;
                case '3':
                    car.BuscarPlaca();
                    break;
                case '4':
                    System.out.println("saliendo pa...");
                    break;
                    default:
                    System.out.println("no hay mas opcion");
                    return;            
            }

        }while(opcion != '4');
    } 
}