
/**
 *
 * @author Borja
 */
public class Yates extends Barco{
private float caballos;
private int nCamarotes;
private float precioX;
    public Yates(String nombre,float caballos, int nCamarotes, float precio, float tamaño, float dias, float eslora, float modulo, float precioX) {
        super(nombre, precio, tamaño, dias, eslora, modulo);
        this.caballos = caballos;
        this.nCamarotes = nCamarotes;
        this.precioX=precioX;
    }

    @Override
    public void calcularModulo() {
modulo=10*eslora+precioX*(caballos+nCamarotes);
    }

}
