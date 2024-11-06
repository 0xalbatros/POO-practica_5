package components;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Header extends JPanel {
   
    public Header(String title){
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel content = new JLabel(String.format("<html><div %s><h2 %s>%s</h2></div></html>", Styles.HEADER.css, Styles.TITLE.css, title));
        content.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(content);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }
}
