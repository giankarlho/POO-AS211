package dao;

public interface ICRUD<Generic> {
    
    void registrar(Generic object) throws Exception;
    
    void modificar(Generic object) throws Exception;
    
    void eliminar(int codigo) throws Exception;
    
}
