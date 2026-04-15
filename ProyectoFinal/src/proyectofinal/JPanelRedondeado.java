/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinal;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPanel;

/**
 *
 * @author victo
 */
public class JPanelRedondeado extends JPanel {

    private int arcWidth = 20;
    private int arcHeight = 20;

    public JPanelRedondeado() {
        setOpaque(false); // Permite transparencia si es necesario
    }

    public void setArcWidth(int arcWidth) {
        this.arcWidth = arcWidth;
    }

    public void setArcHeight(int arcHeight) {
        this.arcHeight = arcHeight;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
        g2.dispose();
        
    }
}