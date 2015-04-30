
/**
 *
 * @author Borja
 */
public class Velero extends Barco {
    private int nMastiles;
    private float precioX;

    public Velero(String nombre,int nMastiles, float precio, float tamaño, float dias, float eslora, float modulo, float precioX) {
        super(nombre,precio, tamaño, dias, eslora, modulo);
        this.nMastiles = nMastiles;
        this.precioX=precioX;
    }

    public Velero() {
    }

    @Override
    public void calcularModulo() {
     modulo=10*eslora+precioX*(nMastiles);
        
    }


    
} 
 





