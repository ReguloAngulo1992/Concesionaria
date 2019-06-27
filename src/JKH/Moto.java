package JKH;

public class Moto extends Vehiculo implements Caracteristica{

    private String cilindraje;

    public Moto(String marca, String modelo, String cilindraje, double precio){

        super(marca,modelo,precio);

        this.cilindraje = cilindraje;
    }

    // gets y sets de motos

    public String getCilindraje(){
        return cilindraje;
    }

    public void setCilindraje(String cilindraje){
        this.cilindraje = cilindraje;
    }

    // calcular comision metodo

    @Override
    public double calcularComision() {
        return precio * 0.10;
    }

    // metodoto to string para la sub clase moto

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " // Modelo: " + super.getModelo() +
                " // Cilindraje:  " + cilindraje + " // Precio: " + super.getPrecio();
    }
    // metodo para calcular caballos de fuerza
    @Override
    public double calcularCaballosFuerza(double kilovatio) {
            return kilovatio * 1.36;
    }
    // metodo para calcular kilovatios
    @Override
    public double calcularKilovatios(String modelo, String marca) {

        int kilovatio = 0;

        switch(marca){
            case "Honda":
                if (modelo.equals("Titan")){
                    kilovatio = 200;
                }
                else if (modelo.equals("YRB")){
                    kilovatio = 220;
                }
        }

        return kilovatio;
    }
}
