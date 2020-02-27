package animal;

/**
 * Animal
 */
public class Animal {

    public String nome;
    public int idade;
    public String son;


    public String emitirSon() {
        return son;
    }

    public void pegarSon(String son) {
        this.son = son;
    }

    public String comportamento() {
        return "generico";
    }
    
}