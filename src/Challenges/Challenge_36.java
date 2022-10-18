package Challenges;
import java.util.HashMap;

/*
 * Reto #36
 * LOS ANILLOS DE PODER
 * Dificultad: MEDIA
 *
 * Enunciado: ¡La Tierra Media está en guerra! En ella lucharán razas leales a Sauron
 * contra otras bondadosas que no quieren que el mal reine sobre sus tierras.
 * Cada raza tiene asociado un "valor" entre 1 y 5:
 * - Razas bondadosas: Pelosos (1), Sureños buenos (2), Enanos (3), Númenóreanos (4), Elfos (5)
 * - Razas malvadas: Sureños malos (2), Orcos (2), Goblins (2), Huargos (3), Trolls (5)
 * Crea un programa que calcule el resultado de la batalla entre los 2 tipos de ejércitos:
 * - El resultado puede ser que gane el bien, el mal, o exista un empate. Dependiendo de la
 *   suma del valor del ejército y el número de integrantes.
 * - Cada ejército puede estar compuesto por un número de integrantes variable de cada raza.
 * - Tienes total libertad para modelar los datos del ejercicio.
 * Ej: 1 Peloso pierde contra 1 Orco, 2 Pelosos empatan contra 1 Orco, 3 Pelosos ganan a 1 Orco.
 *
 */

public class Challenge_36 {
    
    public static void main(String[] args) {

        String[] buenos = {"SurenosBuenos","15"};
        String[] malos = {"Trolls","6"};
        challenge36(buenos, malos);
    }

    public static void challenge36(String[] buenos, String[] malos) {

        String nombreBueno = buenos[0];
        int cantidadBuenos = Integer.parseInt(buenos[1]);
        String nombreMalo = malos[0];
        int cantidadMalos = Integer.parseInt(malos[1]);

        int cantBuenos = (getCantEjercito(nombreBueno, "bueno")) * cantidadBuenos;
        int cantMalos = (getCantEjercito(nombreMalo, "malo")) * cantidadMalos;

        if (cantBuenos > cantMalos) {

            System.out.println("El bien gana la guerra con " + cantBuenos + " guerreros..!!");
            
        }else if(cantBuenos == cantMalos) {

            System.out.println("Hubo un empate en esta guerra! AUUU!!");
            
        }else{
            System.out.println("El mal gana la guerra con " + cantMalos + " guerreros..!! BUUUUHHHH!!!");
        }
    }

    public static int getCantEjercito(String nombre, String tipo) {

        int cantidad=0;

        HashMap<String, Integer> bondadosas = new HashMap<>();

        bondadosas.put("Pelosos", 1);
        bondadosas.put("SurenosBuenos", 2);
        bondadosas.put("Enanos", 3);
        bondadosas.put("Numeroneanos",4);
        bondadosas.put("Elfos",5);

        HashMap<String, Integer> malvadas = new HashMap<>();
        
        malvadas.put("SurenosMalos", 2);
        malvadas.put("Orcos", 2);
        malvadas.put("Goblins", 2);
        malvadas.put("Huargos", 3);
        malvadas.put("Trolls", 5);

        if(tipo == "bueno"){
            cantidad = bondadosas.get(nombre);
        }else{
            cantidad = malvadas.get(nombre);
        }

        return cantidad;
    }
}
