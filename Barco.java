
/**
 *
 * @author Borja
 */
public abstract class Barco {

protected String nombre;
protected float precio;
protected float tamaño;
protected float dias;
protected float eslora;
protected float modulo;

    public Barco(String nombre, float precio, float tamaño, float dias, float eslora, float modulo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
        this.dias = dias;
        this.eslora = eslora;
        this.modulo = modulo;
    }

   

  

    public Barco() {
    }

   
  
public abstract void calcularModulo();

public void calcularPrecio(){
    precio=modulo*dias;
}
        


}
