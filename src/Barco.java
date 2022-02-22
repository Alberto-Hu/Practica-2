public class Barco {
    private String tipob;
    private String conduccion;
    private String tamano;
    private int velocidad;
    private int capacidad;

    public Barco(){
    }

    public Barco(String tipob, String conduccion, String tamano, int velocidad, int capacidad) {
        this.tipob = tipob;
        this.conduccion = conduccion;
        this.tamano = tamano;
        this.velocidad = velocidad;
        this.capacidad = capacidad;
    }

    public String getTipob(){
        return tipob;
    }
    public void setTipob(String tipob){
        this.tipob = tipob;
    }

    public String getConduccion(){
        return conduccion;
    }
    public void setConduccion(String conduccion){
        this.conduccion = conduccion;
    }

    public String getTamano(){
        return tamano;
    }
    public void setTamano(String tamano){
        this.tamano = tamano;
    }

    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int velocidad){
        this.velocidad = velocidad;
    }

    public int getCapacidad(){
        return capacidad;
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

}

