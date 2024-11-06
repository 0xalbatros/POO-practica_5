import java.time.Period;
import java.util.HashMap;

public class Bote extends Vehiculo {

    public Bote(String _marca, String _color, Period _antiguedad, int precioSemana, int precioDia){
        this.marca = _marca;
        this.color = _color;
        this.antiguedad = _antiguedad;
        this.precios = new HashMap<String, Integer>();
        this.precios.put("Semana", precioSemana);
        this.precios.put("Dia", precioDia);
    }
}
