package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Estudiantes
 */
public class ElectrodomesticoDAO implements IElectrodomesticoDAO{

    private SortedSet<Electrodomestico> lista;

    public ElectrodomesticoDAO() {
        lista = new TreeSet<>();
    }
    
    @Override
    public void createTelevisor(Television television) {
        lista.add(television);
    }

    @Override
    public void createLavadora(Lavadora lavadora) {
        lista.add(lavadora);
    }

    @Override
    public List<Television> listarTelevisor() {
        List<Television> listaTelevision = new ArrayList<>();
        
        Iterator<Electrodomestico> iterador = lista.iterator();
        while(iterador.hasNext()){
            Electrodomestico electrodomestico = iterador.next();
            if(electrodomestico instanceof Television){
                Television television = (Television) electrodomestico;
                listaTelevision.add(television);
            }
        }
        return listaTelevision;
    }

    @Override
    public List<Lavadora> listarLavadora() {
        List<Lavadora> listaLavadora = new ArrayList<>();
        
        Iterator<Electrodomestico> iterador = lista.iterator();
        while(iterador.hasNext()){
            Electrodomestico electrodomestico = iterador.next();
            if(electrodomestico instanceof Lavadora){
                Lavadora lavadora = (Lavadora) electrodomestico;
                listaLavadora.add(lavadora);
            }
        }
        return listaLavadora;
    }
    
}
