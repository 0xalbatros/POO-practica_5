package components;

import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Footer extends JPanel {
   
    public Footer(String text){
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel content = new JLabel(String.format("<html><div %s><p>%s</p></div></html>", Styles.FOOTER.css, text));
        content.setHorizontalAlignment(SwingConstants.CENTER);
        content.setVerticalAlignment(SwingConstants.BOTTOM);
        this.add(content);
        this.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

}
