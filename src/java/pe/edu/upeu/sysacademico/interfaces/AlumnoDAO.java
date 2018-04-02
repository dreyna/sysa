/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysacademico.interfaces;

import java.util.List;
import java.util.Map;
import pe.edu.upeu.sysacademico.dto.Alumno;

/**
 *
 * @author alum.fial1
 */
public interface AlumnoDAO {
    int create(Alumno a);
    int update(Alumno a);
    int delete(int key);
    Alumno read(int key);
    List<Map<String, Object>> lista();
}
