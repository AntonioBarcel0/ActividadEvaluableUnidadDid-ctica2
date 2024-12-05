package ejercicio3;

public class Main {
	public static void main (String []args) { Animal[] animales = {
            new Perros(),
            new Lobos(),
            new Leones(),
            new Gatos()
        };

        for (Animal animal : animales) {
            System.out.println("Nombre Científico: " + animal.getNombreCientifico());
            System.out.println("Sonido: " + animal.getSonidos());
            System.out.println("Entorno: " + animal.getHabitat());
            System.out.println("Comida: " + animal.getComida());
            System.out.println("--------------------------------");
        }
    }

}
