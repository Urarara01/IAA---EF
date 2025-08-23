package clasesUtiles;

import java.awt.Component;
import javax.swing.JPanel;

public class centrarTabbedForm {

    /**
     * Centra todos los componentes de un panel que usa layout absoluto (null layout)
     * @param panel El panel que contiene los componentes a centrar
     */
    public static void centerContent(JPanel panel) {
        if (panel.getParent() != null) {
            int panelWidth = panel.getWidth();
            int panelHeight = panel.getHeight();
            
            // Si el panel aún no tiene dimensiones, usar las del padre
            if (panelWidth == 0 || panelHeight == 0) {
                panelWidth = panel.getParent().getWidth();
                panelHeight = panel.getParent().getHeight();
            }
            
            // Calcular el desplazamiento para centrar el contenido
            // Tomamos como referencia el área ocupada por los componentes
            int minX = Integer.MAX_VALUE;
            int maxX = Integer.MIN_VALUE;
            int minY = Integer.MAX_VALUE;
            int maxY = Integer.MIN_VALUE;
            
            // Encontrar los límites del contenido
            for (Component comp : panel.getComponents()) {
                int x = comp.getX();
                int y = comp.getY();
                int width = comp.getWidth();
                int height = comp.getHeight();
                
                minX = Math.min(minX, x);
                maxX = Math.max(maxX, x + width);
                minY = Math.min(minY, y);
                maxY = Math.max(maxY, y + height);
            }
            
            if (minX != Integer.MAX_VALUE) {
                // Calcular el tamaño del contenido
                int contentWidth = maxX - minX;
                int contentHeight = maxY - minY;
                
                // Calcular el offset para centrar
                int offsetX = (panelWidth - contentWidth) / 2 - minX;
                int offsetY = (panelHeight - contentHeight) / 2 - minY;
                
                // Aplicar el offset a todos los componentes
                for (Component comp : panel.getComponents()) {
                    comp.setLocation(comp.getX() + offsetX, comp.getY() + offsetY);
                }
            }
        }
    }
}
