/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Producto;
import interfaces.IDao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements IDao<Producto> {

    private static final String SQL_SELECT = "SELECT codigo, nombre, precio, codigo_fabricante from producto";
    
    private static final String SQL_SELECT_BY_ID = "SELECT codigo, nombre, precio, codigo_fabricante FROM producto WHERE codigo = ?";
    
    private static final String SQL_INSERT = "INSERT INTO producto(codigo, nombre, precio, codigo_fabricante) "
            + "VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE producto SET nombre = ?, precio = ?) "
            + "WHERE codigo = ?";
    private static final String SQL_DELETE = "DELETE FROM producto WHERE codigo = ?";

    @Override
    public List<Producto> listar() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        ArrayList<Producto> listaProducto = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            pstmt = conn.prepareStatement(SQL_SELECT);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
            Producto p = new Producto();
            p.setId(rs.getInt(1));
            p.setNombre(rs.getString(2));
            p.setPrecio(rs.getDouble(3));
            p.setId_fabricante(rs.getInt(4));
            listaProducto.add(p);
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            Conexion.close(conn);
            Conexion.close(pstmt);
            Conexion.close(rs);
        }
        return listaProducto;
    }

    @Override
    public Producto encontrar(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertar(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void modificar(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
