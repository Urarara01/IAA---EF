# Guía de uso de FlatLab

La clase `FlatLab` simplifica la configuración de FlatLaf en toda la aplicación.

## Métodos disponibles:

### 1. Tema por defecto (oscuro)
```java
FlatLab.setup();
```

### 2. Tema oscuro específico
```java
FlatLab.setupDarkTheme();
```

### 3. Tema claro específico
```java
FlatLab.setupLightTheme();
```

## Ejemplo de uso en el método main:

```java
public static void main(String[] args) {
    // Configura el tema antes de crear cualquier ventana
    FlatLab.setup(); // Tema oscuro por defecto
    // O usa: FlatLab.setupLightTheme(); para tema claro
    
    EventQueue.invokeLater(new Runnable() {
        public void run() {
            try {
                MiVentana frame = new MiVentana();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    });
}
```

## Beneficios:

1. **Simplificación**: Una sola línea en lugar de 6 líneas de configuración
2. **Consistencia**: Misma configuración en toda la aplicación
3. **Flexibilidad**: Fácil cambio entre tema oscuro y claro
4. **Mantenibilidad**: Cambios centralizados en una sola clase

## Migración desde código anterior:

**Antes:**
```java
FlatRobotoFont.install();
FlatLaf.registerCustomDefaultsSource("cibertec.themes");
UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
FlatMacDarkLaf.setup();
```

**Después:**
```java
FlatLab.setup();
```
