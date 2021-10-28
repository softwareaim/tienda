
package tienda;

import entidades.Producto;
import java.util.ArrayList;
import persistencia.ProductoDAO;


public class Tienda {

  
    public static void main(String[] args) {
       
        ProductoDAO pDao = new ProductoDAO();
        ArrayList<Producto> lProdutos = (ArrayList<Producto>) pDao.listar();
        
        for (Producto p : lProdutos) {
            System.out.println(p);
            
        }
        
        
    }
    
}
