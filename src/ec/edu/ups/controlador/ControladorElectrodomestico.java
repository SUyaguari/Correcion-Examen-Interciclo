package ec.edu.ups.controlador;

import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElecrtodomestico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public class ControladorElectrodomestico {

    private VistaElecrtodomestico vistaElecrtodomestico;
    private IElectrodomesticoDAO electrodomesticoDAO;

    private Television television;
    private Lavadora lavadora;
    
    public ControladorElectrodomestico(VistaElecrtodomestico vistaElecrtodomestico, ElectrodomesticoDAO electrodomesticoDAO) {
        this.vistaElecrtodomestico = vistaElecrtodomestico;
        this.electrodomesticoDAO = electrodomesticoDAO;
    }

    public void ingresarTelevision(){
        television = vistaElecrtodomestico.ingresarTelevisor();
        electrodomesticoDAO.createTelevisor(television);
    }
    
    public void ingresarLavador(){
        lavadora = vistaElecrtodomestico.ingresarLavadora();
        electrodomesticoDAO.createLavadora(lavadora);
    }
    
    public void listarTelevisor(){
        List<Television> television = new ArrayList<>();
        television = electrodomesticoDAO.listarTelevisor();
        vistaElecrtodomestico.listarTelevisor(television);
    }
    
    public void listarLavadora(){
        List<Lavadora> lavadora = new ArrayList<>();
        lavadora = electrodomesticoDAO.listarLavadora();
        vistaElecrtodomestico.listarLavadora(lavadora);
    }
    
    
    
    
}
