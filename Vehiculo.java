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

    
    String p;
    do{
        System.out.println("ingrese la placa del vehiculo: ");
        p = boton.nextLine();
        if(p.isEmpty())
        {
           System.out.println("no puede estar vacia la placa"); 
        }

    }while(p.isEmpty());
    
    
    String m;
    do{
        System.out.println("ingresa la marca del vehiculo");
        m = boton.nextLine();
        if(m.isEmpty())
        {
            System.out.println("no puede estar vacia la marca");
        }

    }while(m.isEmpty());
    
    String M;
    do{
        System.out.println("ingresa el modelo del vehiculo: ");
        M = boton.nextLine();
        if(M.isEmpty())
        {
            System.out.println("no puede estar vacio el modelo");
        }

    }while(M.isEmpty());
    

    
    int a;
    do{
        System.out.println("ingresa el ano del vehiculo: ");
        a = boton.nextInt();
        if(a < 0)
        {
            System.out.println("no puede estar vacio el ano");
        }

    }while(a < 0);
    

    
    String c;
    do{
        System.out.println("ingresa el color del vehiculo: ");
        c = boton.nextLine();
        if(c.isEmpty())
        {
            System.out.println("no puede estar vacio");
        }
        

    }while(c.isEmpty());
    
    int P;
    do{
        System.out.println("ingresa el precio del vehiculo: ");
        P = boton.nextInt();
        if(P < 0)
        {
            System.out.println("no puede estar vacio el precio");
        }

    }while(P < 0);
    
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