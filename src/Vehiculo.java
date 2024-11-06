import java.time.Period;
import java.util.HashMap;

import components.Styles;

public abstract class Vehiculo {
    String marca;
    String color;
    Period antiguedad;
    HashMap<String, Integer> precios;
    
    public String getPrices() {
        StringBuilder html = new StringBuilder();

        html.append(String.format("<tr %s>", Styles.TR.css));
        html.append(String.format("<td %s>%s</td>", Styles.TD.css, this.marca));
        html.append(String.format("<td %s>%d</td>", Styles.TD.css, this.precios.get("Semana")));
        html.append(String.format("<td %s>%d</td>", Styles.TD.css, this.precios.get("Dia")));
        html.append("</tr>");

        return html.toString();
    }
}