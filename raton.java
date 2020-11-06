public class Raton {
    // Marca del ratón
    private String marca;
    // Número de DPI del ratón
    private int dpi;
    // Es inalámbrico?
    private boolean inalambrico;
    
    public Raton (String marcaRaton, int numeroDpi) {
        marca = marcaRaton;
        dpi = numeroDpi;
        inalambrico = true;
    }
    
    public String getMarca () {
        return marca;
    }
    
    public int getDpi () {
        return dpi;
    }
    
    public boolean getInalambrico () {
        return inalambrico;
    }
    
    public void setMarca (String nuevaMarca) {
        marca = nuevaMarca;
    }
    
    public void subirDpi (int incrementoDpi) {
        dpi = dpi + incrementoDpi;
    }
    
    public void quitarOPonerCable () {
        if (inalambrico == true) {
            inalambrico = false;
        }
        else {
            inalambrico = true;
        }
    }
    
    public void imprimirCaracteristicas () {
        String sinCable;
        if (inalambrico == true) {
            sinCable = "si";
        }
        else {
            sinCable = "no";
        }
        System.out.println("Marca del ratón: " + marca + "|Número de DPI: " + dpi + "|Inalámbrico: " + sinCable);
    }
    
    public String getCaracteristicas () {
        String caracteristicas;
        String sinCable;
        if (inalambrico == true) {
            sinCable = "si";
        }
        else {
            sinCable = "no";
        }
        caracteristicas = "Marca del ratón: " + marca + "|Número de DPI: " + dpi + "|Inalámbrico: " + sinCable;
        return caracteristicas;
    }
}