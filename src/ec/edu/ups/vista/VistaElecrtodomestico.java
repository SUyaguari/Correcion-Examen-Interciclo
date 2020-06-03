package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class VistaElecrtodomestico {
    
    private Scanner leer;
    
    public Television ingresarTelevisor(){
        leer = new Scanner(System.in);
        Television t = new Television();
        System.out.println("\n****Ingresar Television*****");
        System.out.print("Ingrese el codigo del televisor: ");
        int codigo = leer.nextInt();
        t.setCodigo(codigo);
        System.out.print("Ingrese la descripcion del televisor: ");
        String descripcion = leer.next();
        t.setDescripcion(descripcion);
        System.out.print("Ingrese el precio del televisor: ");
        double precioBase = leer.nextDouble();
        t.setPrecioBase(precioBase);
        System.out.print("Ingrese el color del televisor: ");
        String color = leer.next();
        t.setColor(color);
        System.out.print("Ingrese el consumo del televisor: ");
        char consumoEnergio = leer.next().charAt(0);
        t.setConsumoEnergetico(consumoEnergio);
        System.out.print("Ingrese el peso del televisor: ");
        int peso = leer.nextInt();
        t.setPeso(peso);
        System.out.print("Ingrese la resolucion del televisor: ");
        int resolucion = leer.nextInt();
        t.setResolucion(resolucion);
        System.out.print("Ingrese si tiene puerto HDMI del televisor (Si/No): ");
        String puerto = leer.next();
        boolean cent;
        if(puerto.equalsIgnoreCase("si")){
            cent=true;
        }else{
            cent=false;
        }
        t.setPuertoHDMI(cent);
        return t;
    }
    
    public Lavadora ingresarLavadora(){
        leer = new Scanner(System.in);
        Lavadora l = new Lavadora();
        System.out.println("\n****Ingresar Lavadora*****");
        System.out.print("Ingrese el codigo del lavador: ");
        int codigo = leer.nextInt();
        l.setCodigo(codigo);
        System.out.print("Ingrese la descripcion del lavador: ");
        String descripcion = leer.next();
        l.setDescripcion(descripcion);
        System.out.print("Ingrese el precio del lavador: ");
        double precioBase = leer.nextDouble();
        l.setPrecioBase(precioBase);
        System.out.print("Ingrese el color del lavador: ");
        String color = leer.next();
        l.setColor(color);
        System.out.print("Ingrese el consumo del lavador: ");
        char consumoEnergio = leer.next().charAt(0);
        l.setConsumoEnergetico(consumoEnergio);
        System.out.print("Ingrese el peso del lavador: ");
        int peso = leer.nextInt();
        l.setPeso(peso);
        System.out.print("Ingrese la carga del lavador: ");
        int carga = leer.nextInt();
        l.setCarga(carga);
        return l;
    }
    
    public void listarTelevisor(List<Television> lista){
        System.out.println("\tLista Television: ");
        for (Television television : lista) {
            System.out.println(television+"\n");
        }
    }
    
    public void listarLavadora(List<Lavadora> lista){
        System.out.println("\tLista Television: ");
        for (Lavadora lavadora : lista) {
            System.out.println(lavadora+"\n");
        }
    }
    
}
