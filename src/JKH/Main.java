package JKH;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

// metemos los objetos en una lista para mostrarlos en pantalla

        ArrayList<Vehiculo> vehiculos = crearVehiculos();

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

        System.out.println("============================" + "\n" + obtenerPrecioMayor(vehiculos) + "\n" + obtenerPrecioMenor(vehiculos) + "\n" + obtenerVehiculoPorLetra("y", vehiculos) + "\n"+ "============================" + "\n" + obtenerListaOrdenada(vehiculos));

        }

        // metodo para obtener el vehiculo con mayor precio

    private static String obtenerPrecioMayor(ArrayList<Vehiculo> vehiculos){

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            double precioMayor = 0;
        Vehiculo vehiculo = null;

        for (Vehiculo ve : vehiculos){
            if (ve.getPrecio() > precioMayor){
                precioMayor = ve.getPrecio();
                vehiculo = ve;
            }
        }

        if (vehiculo == null) return "";

        return "Vehiculo mas caro: " + vehiculo.getMarca() + " " + vehiculo.getModelo();
    }

    // metodo para obtener el vehiculo con menor precio

    private static String obtenerPrecioMenor(ArrayList<Vehiculo> vehiculos){

        double precioMenor = 0;
        Vehiculo vehiculo = null;

        for(Vehiculo ve : vehiculos){
            if (vehiculo == null){
                vehiculo = ve;
                precioMenor = ve.getPrecio();
                }
            if(ve.getPrecio() <= precioMenor){

                precioMenor = ve.getPrecio();
                vehiculo = ve;
            }
        }

        if (vehiculo == null) return "";

        return "Vehiculo mas barato: " + vehiculo.getMarca() + " " + vehiculo.getModelo();

    }

    // metodo para obtener el vehiculo cuyo modelo empieza por la letra Y

    private static String obtenerVehiculoPorLetra(String letraIngresada, ArrayList<Vehiculo> vehiculos){

        Vehiculo vehiculo = null;

        for(Vehiculo ve : vehiculos){

            char[] modelo = ve.getModelo().toCharArray();

            for (char letra : modelo){
                if (String.valueOf(letra).equalsIgnoreCase(letraIngresada)){
                    vehiculo = ve;
                }
            }

        }

        if (vehiculo == null) return "";

            return "Vehiculo que contiene en el modelo la letra Y: " + vehiculo.getModelo() + " " + vehiculo.getMarca() + " " + vehiculo.getPrecio();

    }

    // metodo para crear vehiculos de mas de los determinados de ser necesario

    private static ArrayList<Vehiculo> crearVehiculos(){

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
 
        vehiculos.add(new Automovil("Peugeot", "206", 4, 200000.00));
        vehiculos.add(new Moto("Honda", "Titan", "125c", 60000.00));
        vehiculos.add(new Automovil("Peugeot", "208", 5, 250000.00));
        vehiculos.add(new Moto("Yamaha", "YBR", "160c", 80500.50));

        return vehiculos;
    }

    // metodo para listar los vehiculos en orden del mayor precio hasta el menor

    private static String obtenerListaOrdenada(ArrayList<Vehiculo> vehiculos){
        vehiculos.sort(Vehiculo::compareTo);
        String listaOrdenada = "";
        for (Vehiculo vehiculo : vehiculos) {
            listaOrdenada += vehiculo.getMarca() + " " +vehiculo.getModelo() + "\n";
        }
        return listaOrdenada;
    }

}
