package veterinario;

import animal.Animal;

/**
 * Veterinario
 */
public class Veterinario {

    public void examinar(Animal animal) {
        System.out.println(animal.emitirSon());
    }
}