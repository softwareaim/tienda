
package interfaces;

import java.util.List;


public interface IDao<T> {
    
    public List<T> listar();
    public T encontrar(T t);
    public void insertar (T t);
    public void modificar (T t);
    public void eliminar (T t);
    
}
