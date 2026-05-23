import java.util.ArrayList;
import java.util.Scanner;

public class Vehiculo
{
private String placa;
private String marca;
private String modelo;
private int ano;
private String color;
private int precio;

private ArrayList<Vehiculo> v = new ArrayList<>();
private Scanner boton = new Scanner(System.in);

public Vehiculo()
{
   setPlaca("");
   setMarca("");
   setModelo("");
   setAno(0);
   setColor("");
   setPrecio(0); 
}

public Vehiculo(String Placa, String Marca, String Modelo, int Ano, String Color, int Precio)
{
setPlaca(Placa);
   setMarca(Marca);
   setModelo(Modelo);
   setAno(Ano);
   setColor(Color);
   setPrecio(Precio);
}

public String getPlaca(){return placa;}
public String getMarca(){return marca;}
public String getModelo(){return modelo;}
public int getAno(){return ano;}
public String getColor(){return color;}
public int getPrecio(){return precio;}

public void setPlaca(String Placa)
{
    this.placa = Placa;
}
public void setMarca(String Marca)
{
    this.marca = Marca;
}
public void setModelo(String Modelo)
{
    this.modelo = Modelo;
}
public void setAno(int Ano)
{
    this.ano = Ano;
}
public void setColor(String Color)
{
    this.color = Color;
}
public void setPrecio(int Precio)
{
    this.precio = Precio;
}
public void Registrar()
{
     
    
    Scanner boton = new Scanner(System.in);

    Vehiculo veh = new Vehiculo();

    System.out.println("=== Registrar Auto ===");
    System.out.println("ingrese la placa del vehiculo: ");
    String p = boton.nextLine();
    
    
    System.out.println("ingresa la marca del vehiculo: ");
    String m = boton.nextLine();
    

    System.out.println("ingresa el modelo del vehiculo: ");
    String M = boton.nextLine();
    

    System.out.println("ingresa el ano del vehiculo: ");
    int a = boton.nextInt();
    
    boton.nextLine();

    System.out.println("ingresa el color del vehiculo: ");
    String c = boton.nextLine();
    

    System.out.println("ingresa el precio del vehiculo: ");
    int P = boton.nextInt();
    
    boton.nextLine();

    veh.setPlaca(p);
    veh.setMarca(m);
    veh.setModelo(M);
    veh.setAno(a);
    veh.setColor(c);
    veh.setPrecio(P);

    v.add(veh);

    System.out.println("Vehículo registrado con éxito.");
  
}
public void Mostrar()
{

    for(Vehiculo veh: v){
   System.out.println("=== Mostrar Auto ===");
   System.out.println("la placa del auto es: "+ veh.getPlaca());
   System.out.println("la marca del vehiculo es: "+ veh.getMarca());
   System.out.println("el modelo del vehiculo es:"+ veh.getModelo());
   System.out.println("el ano del vehiculo es: "+ veh.getAno());
   System.out.println("el color del vehiculo es: "+ veh.getColor());
   System.out.println("el precio del vehiculo es: "+ veh.getPrecio());
    }

}
public void BuscarPlaca()
{
    

    System.out.println("=== Buscar Por Placa ===");
    Scanner boton = new Scanner(System.in);
    System.out.println("ingresa el numero de placa: ");
    String pla = boton.nextLine();

    boolean encontrado = false;
    for(Vehiculo veh : v){
        
    if(veh.getPlaca().equalsIgnoreCase(pla))
    {
        System.out.println("la marca del vehiculo es: "+ veh.getMarca());
        System.out.println("el modelo del vehiculo es:"+ veh.getModelo());
        System.out.println("el ano del vehiculo es: "+ veh.getAno());
        System.out.println("el color del vehiculo es: "+ veh.getColor());
        System.out.println("el precio del vehiculo es: "+ veh.getPrecio());
        
        encontrado = true;
     break;
    }
     
    }
}


}