import java.time.Period;
import java.util.HashMap;

public class Auto extends Vehiculo {

    public Auto(String _marca, String _color, Period _antiguedad, int precioSemana, int precioDia) {
        this.marca = _marca;
        this.color = _color;
        this.antiguedad = _antiguedad;
        this.precios = new HashMap<>();
        this.precios.put("Semana", precioSemana);
        this.precios.put("Dia", precioDia);
    }
}