public class raton {
    // Marca del rat�n
    private String marca;
    // N�mero de DPI del rat�n
    private int dpi;
    // Es inal�mbrico?
    private boolean inalambrico;
    
    public raton (String marcaRaton, int numeroDpi) {
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
    
    public String setMarca (String nuevaMarca) {
        marca = nuevaMarca;
        return marca;
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
        System.out.println("Marca del raton: " + marca + "|Numero de DPI: " + dpi + "|Inal�mbrico: " + inalambrico);
    }
    
    public String getCaracteristicas () {
        String caracteristicas;
        caracteristicas = "Marca del raton: " + marca + "|Numero de DPI: " + dpi + "|Inal�mbrico: " + inalambrico;
        return caracteristicas;
    }
    
}