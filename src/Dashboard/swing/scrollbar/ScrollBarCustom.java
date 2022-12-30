package Dashboard.swing.scrollbar;



import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(60, 60, 60));
        setBackground(new Color(30, 30, 30));
    }
}
