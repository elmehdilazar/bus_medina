
package Dashboard.component;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Area;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import org.jdesktop.animation.timing.interpolation.PropertySetter;

public class jBtn extends JButton{

     public ButtonStyle getStyle() {
        return style;
    }

    public void setStyle(ButtonStyle style) {
        if (this.style != style) {
            this.style = style;
            animationHover.stop();
            animationPress.stop();
           // currentStyle.changeStyle(style);
            setForeground(style.foreground);
        }
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
        repaint();
    }

    private AnimationStyle animationHover;
    private AnimationStyle animationPress;
    private ButtonStyle style = ButtonStyle.PRIMARY;
    private ButtonColor currentStyle = new ButtonColor(ButtonStyle.PRIMARY);
    private int round = 15;
    public jBtn(){
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(8,8,8,8));
        setForeground(new Color(21,21,21));
       
    
    initAnimation();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                animationHover.start(currentStyle.backgroundHover, getStyle().BackgroundHover);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                animationHover.start(currentStyle.backgroundHover, getStyle().Background);
            }

            @Override
            public void mousePressed(MouseEvent me) {
                animationPress.start(currentStyle.background, getStyle().BackgroundPress);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                animationPress.start(currentStyle.background, getStyle().Background);
            }
        });
    }

   private void initAnimation() {
        animationHover = new AnimationStyle(300, currentStyle, "backgroundHover");
        animationHover.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                repaint();
            }
        });
        animationPress = new AnimationStyle(200, currentStyle, "background");
        animationPress.addTarget(new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                repaint();
            }
        });
    }

    
    
   @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x =0;
        int y =0;
        int width =getWidth();
        int height =getHeight();
        Area area = new Area(new RoundRectangle2D.Double(x, y, width, height, round, round));
        g2.setColor(new Color(255,209,0));
        g2.fill(area);
        area.subtract(new Area(new RoundRectangle2D.Double(x, y, width, height-2, round, round)));
        
        g2.dispose();
        
        
        
        
        super.paintComponent(grphcs);
        
    }
     public enum ButtonStyle{
        
        PRIMARY(new Color(255,209,0),new Color(21,21,21),new Color(21,21,21),new Color(255,209,0)),
        SECONDARY(new Color(255,255,255),new Color(21,21,21),new Color(21,21,21),new Color(255,209,0)),
        DESTRUCTIVE(new Color(255,209,0),new Color(21,21,21),new Color(21,21,21),new Color(255,209,0));
        
        private ButtonStyle(Color Background,Color foreground,Color BackgroundHover,Color BackgroundPress){
            this.Background = Background;
            this.foreground = foreground;
            this.BackgroundHover = BackgroundHover;
            this.BackgroundPress = BackgroundPress;
            
        }
        private Color Background;
        private Color foreground;
        private Color BackgroundHover;
        private Color BackgroundPress;
        
    }
    protected class ButtonColor {

        public Color getBackground() {
            return background;
        }

        public void setBackground(Color background) {
            this.background = background;
        }

        public Color getForeground() {
            return foreground;
        }

        public void setForeground(Color foreground) {
            this.foreground = foreground;
        }

        public Color getBackgroundHover() {
            return backgroundHover;
        }

        public void setBackgroundHover(Color backgroundHover) {
            this.backgroundHover = backgroundHover;
        }

        public Color getBackgroundPress() {
            return backgroundPress;
        }

        public void setBackgroundPress(Color backgroundPress) {
            this.backgroundPress = backgroundPress;
        }

        public ButtonColor(ButtonStyle style) {
            changeStyle(style);
        }

        public ButtonColor() {
        }

        private Color background;
        private Color foreground;
        private Color backgroundHover;
        private Color backgroundPress;

        private void changeStyle(ButtonStyle style) {
            this.background = style.Background;
            this.foreground = style.foreground;
            this.backgroundHover = style.Background;
            this.backgroundPress = style.BackgroundPress;
        }
    }
    private class AnimationStyle {

        private final Animator animator;
        private final ButtonColor style;
        private final String property;
        private TimingTarget target;

        public AnimationStyle(int duration, ButtonColor style, String property) {
            this.style = style;
            this.property = property;
            this.animator = new Animator(duration);
            this.animator.setResolution(1);
        }

        public void start(Color... colors) {
            stop();
            animator.removeTarget(target);
            target = new PropertySetter(style, property, colors);
            animator.addTarget(target);
            animator.start();
        }

        public void addTarget(TimingTarget target) {
            animator.addTarget(target);
        }

        public void stop() {
            if (animator.isRunning()) {
                animator.stop();
            }
        }
    }
}



























