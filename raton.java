public class Raton {
    // Marca del rat�n
    private String marca;
    // N�mero de DPI del rat�n
    private int dpi;
    // Es inal�mbrico?
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
        System.out.println("Marca del rat�n: " + marca + "|N�mero de DPI: " + dpi + "|Inal�mbrico: " + sinCable);
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
        caracteristicas = "Marca del rat�n: " + marca + "|N�mero de DPI: " + dpi + "|Inal�mbrico: " + sinCable;
        return caracteristicas;
    }
}