
package guia2_ej04;

import com.sun.security.auth.PrincipalComparator;
import guia2_ej04.Rubro;

/*
 * @author Lucas E. Sayago
 */
public class Producto implements Comparable<Producto>{
    
    
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private Rubro categoria;

    public Producto(int codigo, String descripcion, double precio, int stock, Rubro categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Rubro getCategoria() {
        return categoria;
    }

    public void setCategoria(Rubro categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Producto t) {
      
       if(codigo == t.codigo){
           return 0;
           
       }else if(codigo > t.codigo){
           return 1;
       }else {
           return -1;
       }
    }
    
    

}
