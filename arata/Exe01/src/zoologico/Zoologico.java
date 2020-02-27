package zoologico;
import animal.Animal;

/**
 * Zoologico
 */
public class Zoologico {
    private Animal[] jaulas;
    private int quantidadeDeAnimais = 0;

    public void colocarAnimalNaJaula(Animal animal) {
        if(quantidadeDeAnimais < 10){
            this.jaulas[this.quantidadeDeAnimais] = animal;
            this.quantidadeDeAnimais++;
        }
    }

    public void mostraJaulas() {
        for(int i = 0; i < this.quantidadeDeAnimais; i++){
            System.out.printf("%dº Animal: %s, Son: %s, Ação: %s %n", i, 
            this.jaulas[i].nome, this.jaulas[i].son, this.jaulas[i].comportamento());
        }
        
    }
}