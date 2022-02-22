public class Computadora {
    private String marca;
    private String modelo;
    private String color;
    private int ram;
    private int almacenamiento;

    public Computadora(){
    }

    public Computadora(String marca, String modelo, String color, int ram, int almacenamiento) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }

    public int getAlmacenamiento(){
        return almacenamiento;
    }
    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

}

