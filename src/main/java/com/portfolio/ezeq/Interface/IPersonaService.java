
package com.portfolio.ezeq.Interface;

import com.portfolio.ezeq.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer una lista de persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto (usuario) buscado por ID
    public void deletePersona(Long id);
    
    //Buscar una persona desde su ID
    public Persona findPersona(Long id);
}
