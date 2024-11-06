/* 
    Instituto Tecnologico Nacional
    Autor: Alan Edgar Bojorquez
    Control: 24760204
    Materia: Programacion Orientada a Objetos
*/ 

import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import components.Footer;
import components.Header;
import components.Root;
import components.Styles;

public class App {
    private JFrame index;
    private CardLayout card;
    public Header header;
    public JPanel navBar;
    public Footer footer;
    private Root root;

    public App(int sizeX, int sizeY, String iconPath, String headerTitle, String footerText) {
        this.index = new JFrame("Renta de vehículos");
        this.index.setSize(sizeX, sizeY);
        this.index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.index.setIconImage(new ImageIcon(iconPath).getImage());

        this.header = new Header(headerTitle);
        this.navBar = new JPanel();
        this.card = new CardLayout();
        this.root = new Root(this.card);
        this.footer = new Footer(footerText);

        this.index.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        gbc.weighty = 0.1; 
        this.index.add(this.header, gbc);
 
        gbc.gridy = 1;
        gbc.weighty = 0.1; 
        this.index.add(this.navBar, gbc);

        gbc.gridy = 2;
        gbc.weighty = 0.7;
        gbc.fill = GridBagConstraints.BOTH;
        this.index.add(this.root, gbc);

        gbc.gridy = 3;
        gbc.weighty = 0.1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        this.index.add(this.footer, gbc);

        this.index.setVisible(true);
    }

    public void setHeader(String title) {
        JLabel content = new JLabel(String.format("<html><div style='%s'><h2 style='%s'>%s</h2></div></html>",
                Styles.HEADER.css, Styles.TITLE.css, title));
        content.setHorizontalAlignment(SwingConstants.CENTER);
        this.header.add(content);
    }

    public void setFooter(String text) {
        JLabel content = new JLabel(String.format("<html><div %s><p>%s</p></div></html>", Styles.FOOTER.css, text));
        content.setHorizontalAlignment(SwingConstants.CENTER);
        this.footer.add(content);
    }

    public void setNavBtn(String btnName, String dest) {
        JButton newNavBtn = new JButton(btnName);
        newNavBtn.addActionListener(e -> this.card.show(root, dest));
        this.navBar.add(newNavBtn);
    }

    public void addComponent(String name, String content, String navName) {
        JPanel component = new JPanel();
        StringBuilder html = new StringBuilder();

        html.append(String.format("<html><h4>%s</h4><table %s'>", name, Styles.TABLE));
        html.append(String.format("<tr %s><th %s>Marca</th><th %s>Precio x semana</th><th %s>Precio x día</th></tr>", Styles.TR.css, Styles.TH.css, Styles.TH.css, Styles.TH.css));
        html.append(content);
        html.append("</table></html>");

        component.add(new JLabel(html.toString()));
        this.root.add(component, name);
    }

    public static void main(String[] args) {

        ArrayList<Bote> botes = new ArrayList<>();
        botes.add(new Bote("Yamaha", "Blanco", Period.ofYears(3), 1500, 200));
        botes.add(new Bote("Mercury", "Azul", Period.ofYears(2), 1300, 180));
        botes.add(new Bote("Bayliner", "Negro", Period.ofYears(5), 1600, 220));
        botes.add(new Bote("Sea Ray", "Rojo", Period.ofYears(1), 2000, 250));
        botes.add(new Bote("Quicksilver", "Verde", Period.ofYears(4), 1700, 210));

        StringBuilder preciosBoteshtml = new StringBuilder();
        botes.forEach(bote -> {
            preciosBoteshtml.append(bote.getPrices());
        });

        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Toyota", "Negro", Period.ofYears(2), 700, 100));
        autos.add(new Auto("Honda", "Blanco", Period.ofYears(3), 750, 120));
        autos.add(new Auto("Ford", "Azul", Period.ofYears(1), 800, 130));
        autos.add(new Auto("Chevrolet", "Rojo", Period.ofYears(4), 850, 140));
        autos.add(new Auto("Nissan", "Gris", Period.ofYears(5), 900, 150));

        StringBuilder preciosAutoshtml = new StringBuilder();
        autos.forEach(auto -> {
            preciosAutoshtml.append(auto.getPrices());
        });

        ArrayList<Bicicleta> bicicletas = new ArrayList<>();
        bicicletas.add(new Bicicleta("Trek", "Rojo", Period.ofYears(1), 200, 30));
        bicicletas.add(new Bicicleta("Specialized", "Azul", Period.ofYears(2), 220, 35));
        bicicletas.add(new Bicicleta("Cannondale", "Verde", Period.ofYears(3), 250, 40));
        bicicletas.add(new Bicicleta("Giant", "Negro", Period.ofYears(4), 300, 45));
        bicicletas.add(new Bicicleta("Scott", "Blanco", Period.ofYears(5), 350, 50));

        StringBuilder preciosBicishtml = new StringBuilder();
        bicicletas.forEach(bici -> {
            preciosBicishtml.append(bici.getPrices());
        });

        ArrayList<Moto> motos = new ArrayList<>();
        motos.add(new Moto("Harley-Davidson", "Negro", Period.ofYears(3), 1000, 150));
        motos.add(new Moto("Ducati", "Rojo", Period.ofYears(2), 1100, 160));
        motos.add(new Moto("Yamaha", "Azul", Period.ofYears(1), 1200, 170));
        motos.add(new Moto("Kawasaki", "Verde", Period.ofYears(4), 1300, 180));
        motos.add(new Moto("Suzuki", "Blanco", Period.ofYears(5), 1400, 190));

        StringBuilder preciosMotoshtml = new StringBuilder();
        motos.forEach(moto -> {
            preciosMotoshtml.append(moto.getPrices());
        });

        App app = new App(600, 560, "src\\assets\\icon.png", "Renta de vehículos", "Made with &#10084; by 0xCamax");
        app.setNavBtn("Autos", "Precios Autos");
        app.setNavBtn("Bicicleta", "Precios Bicicletas");
        app.setNavBtn("Moto", "Precios Motos");
        app.setNavBtn("Bote", "Precios Botes");

        app.addComponent("Precios Autos", preciosAutoshtml.toString(), "Autos");
        app.addComponent("Precios Botes", preciosBoteshtml.toString(), "Botes");
        app.addComponent("Precios Motos", preciosMotoshtml.toString(), "Motos");
        app.addComponent("Precios Bicicletas", preciosBicishtml.toString(), "Bicicletas");
    }

}
