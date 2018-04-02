/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.upeu.sysacademico.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.edu.upeu.appalumno.util.Conexion;
import pe.edu.upeu.sysacademico.dto.Alumno;
import pe.edu.upeu.sysacademico.interfaces.AlumnoDAO;

/**
 *
 * @author alum.fial1
 */
public class AlumnoDaoImp implements AlumnoDAO{
    private PreparedStatement ps;
    private ResultSet rs;
    private static final String SQL_READALL = "SELECT *FROM alumno";
    private Connection cx;
            
    @Override
    public int create(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(Alumno a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Alumno read(int key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Map<String, Object>> lista() {
        List<Map<String, Object>> list = new ArrayList<>();
        try {
             cx = Conexion.getConexion();
             ps = cx.prepareStatement(SQL_READALL);
             rs = ps.executeQuery();
             while(rs.next()){
               Map<String,Object> map = new HashMap<>();
               map.put("id", rs.getInt("idalumno"));
               map.put("nombres", rs.getInt("nombres"));
               map.put("apellidos", rs.getInt("apellidos"));
               list.add(map);
             }
        } catch (SQLException e) {
            System.out.println("Error:"+e);
        }
        return list;
    }
    
}
