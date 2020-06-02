package ec.edu.ups.idao;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;

/**
 *
 * @author Estudiantes
 */
public interface IElectrodomesticoDAO {
    
    public void createTelevisor(Television television);
    public void createLavadora(Lavadora lavadora);
    public List<Television> listarTelevisor();
    public List<Lavadora> listarLavadora();
    
}
