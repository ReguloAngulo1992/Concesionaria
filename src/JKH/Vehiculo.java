package JKH;

public abstract class Vehiculo {


    //  Atributos de la clase

    private String marca;
    private String modelo;
    protected double precio;
    protected double kilovatio;

    // fin de los atributos

    public Vehiculo(){}

    public Vehiculo(String marca, String modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    // SET Y GETS del codigo

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

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public double getKilovatio(){
        return kilovatio;
    }

    public void setKilovatio(double kilovatio){
        this.kilovatio = kilovatio;
    }



    // Fin de los sets y gets


    // to String
    @Override
    public String toString() {
        return
                "marca='" + marca + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", precio=" + precio;
    }


    // Funcion precio mayor


    // metodo abstracto calculo de comision por vender el auto

    public abstract double calcularComision();

    // Metodo para la comparacionde precios y ordenar de mayor a menor

    public int compareTo(Vehiculo o) {
        Double a=Double.valueOf(this.getPrecio());
        Double b=Double.valueOf(o.getPrecio());
        return b.compareTo(a);
    }

}
