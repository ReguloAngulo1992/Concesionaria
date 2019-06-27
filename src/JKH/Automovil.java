package JKH;

public class Automovil extends Vehiculo implements Caracteristica{

    private int puertas;

    public Automovil(String marca, String modelo, int puertas, double precio){
        super(marca,modelo,precio);
        this.puertas = puertas;

    }

    // get y set para puerta

    public int getPuertas(){
        return puertas;
    }

    public void setPuertas(int puertas){
        this.puertas = puertas;
    }

    @Override
    public double calcularComision() {
        return precio * 0.10;
    }

    // fin de los set y gets

    // tostring para la impresion

    @Override
    public String toString() {
        return "Marca: " + super.getMarca() + " / / Modelo:" + super.getModelo() +
                " / / puertas: " + puertas + " / / Precios: " + super.getPrecio();
    }

    // metodo para calcular caballazos de fuerza
    @Override
    public double calcularCaballosFuerza(double kilovatio) {
        return kilovatio * 1.36;
    }

    // metodo para calcular kilovatios

    @Override
    public double calcularKilovatios(String modelo, String marca) {

        double kilovatio = 0;

        switch (marca){
            case "Peugeot":
                if (modelo.equals("206")){
                    kilovatio = 100;
                }
                else if (modelo.equals("208")){
                    kilovatio = 200;
                }
            break;
            case "Toyota":
                if (modelo.equals("Corolla")){
                    kilovatio = 150;
                }
            break;
        }
        return kilovatio;
    }

}
