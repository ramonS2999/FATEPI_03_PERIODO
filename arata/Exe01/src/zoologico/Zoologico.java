package zoologico;
import animal.Animal;

/**
 * Zoologico
 */
public class Zoologico {
    private final int tamanhoMax = 10;
    private Animal jaulas[] = new Animal[tamanhoMax];
    private int quantidadeDeAnimais = 0;

    public void colocarAnimalNaJaula(Animal animal) {
        if(quantidadeDeAnimais < tamanhoMax){
            this.jaulas[this.quantidadeDeAnimais] = animal;
            this.quantidadeDeAnimais++;
        }
    }

    public void mostraJaulas() {
        for(int i = 0; i < this.quantidadeDeAnimais; i++){
            System.out.printf("%dº Animal: %s, Son: %s, Ação: %s %n", (i + 1), 
            this.jaulas[i].nome, this.jaulas[i].son, this.jaulas[i].comportamento());
        }
        
    }
}
