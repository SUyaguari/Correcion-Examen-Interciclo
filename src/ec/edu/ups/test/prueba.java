package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.vista.VistaElecrtodomestico;

/**
 *
 * @author Estudiantes
 */
public class prueba {

    public static void main(String[] args) {
        
        VistaElecrtodomestico vistaElecrtodomestico = new VistaElecrtodomestico();
        ElectrodomesticoDAO electrodomesticoDAO = new ElectrodomesticoDAO();
        ControladorElectrodomestico controladorElectrodomestico = new ControladorElectrodomestico(vistaElecrtodomestico, electrodomesticoDAO);
        
        int cont = 0;
        while(cont<3){
            controladorElectrodomestico.ingresarTelevision();
            cont++;
        }
        cont = 0;
        while(cont<3){
            controladorElectrodomestico.ingresarLavador();
            cont++;
        }
        
        controladorElectrodomestico.listarTelevisor();
        controladorElectrodomestico.listarLavadora();
        
    }
}
