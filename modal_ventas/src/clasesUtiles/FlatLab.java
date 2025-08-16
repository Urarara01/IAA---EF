package clasesUtiles;

import java.awt.Font;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class FlatLab {
    
    /**
     * Configura FlatLaf con tema oscuro
     */
    public static void setupDarkTheme() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("cibertec.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacDarkLaf.setup();
    }
    
    /**
     * Configura FlatLaf con tema claro
     */
    public static void setupLightTheme() {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("cibertec.themes");
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        FlatMacLightLaf.setup();
    }
    
    /**
     * Configura FlatLaf con el tema por defecto (oscuro)
     */
    public static void setup() {
        setupLightTheme();
    }
}
