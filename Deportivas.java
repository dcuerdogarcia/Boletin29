
/**
 *
 * @author Borja
 */
public class Deportivas extends Barco {
private float caballos;

    public Deportivas(String nombre,float caballos, float precio, float tamaño, float dias, float eslora, float modulo) {
        super(nombre,precio, tamaño, dias, eslora, modulo);
        this.caballos = caballos;
    }

    @Override
    public void calcularModulo() {
      modulo=10*eslora+caballos;
    }

}
