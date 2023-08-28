package com.aeroui.swing.laf.panels;

import javax.swing.JFrame;
import java.awt.GraphicsConfiguration;

public class ASJFrame extends JFrame {

    public ASJFrame() {
        super();
    }

    public ASJFrame(String title) {
        super(title);
    }

    public ASJFrame(GraphicsConfiguration g) {
        super(g);
    }

    public ASJFrame(String title, GraphicsConfiguration g) {
        super(title, g);
    }

}
