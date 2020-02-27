package app;
/**
 * 1 - Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e 
 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as 
 * características de forma que tudo o que for comum a todos os animais fique na 
 * classe Animal: (2,5 pontos)
 * 
 * 2- Implemente um programa que crie os 3 tipos de animais definidos no exercício 
 * anterior e invoque o método que emite o som de cada um de forma polimórfica, isto 
 * é, independente do tipo de animal. (2,5 pontos)
 * 
 * 3- Implemente uma classe Veterinário que contenha um método examinar() cujo 
 * parâmetro de entrada é um Animal, quando o animal for examinado ele deve emitir 
 * um som, passe os 3 animais com parâmetro. (2,5 pontos)
 * 
 * 4- Crie uma classe Zoologico, com 10 jaulas (utilize um array) coloque em cada 
 * jaula um animal diferente, percorra cada jaula e emita o som e, se o tipo de 
 * animal possuir o comportamento, faça-o correr. (2,5 pontos)
 */
import java.util.Scanner;

import animal.Animal;
import cachorro.Cachorro;
import cavalo.Cavalo;
import preguica.Preguica;
import veterinario.Veterinario;
import zoologico.Zoologico;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Animal cachorro = new Cachorro();
        Animal cavalo = new Cavalo();
        Animal preguica = new Preguica();
        Veterinario veterinario = new Veterinario();
        Zoologico jaulas = new Zoologico();

        System.out.print("Son do Cachorro: ");
        cachorro.pegarSon(sc.nextLine());

        System.out.print("Son do Cavalo: ");
        cavalo.pegarSon(sc.nextLine());

        System.out.print("Son da Pregiça: ");
        preguica.pegarSon(sc.nextLine());


        System.out.println(" ");
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        System.out.println(cachorro);

        int opcao = 10;
        System.out.println("Para locar o animal na Jaula digite o número refernte!");
        while(opcao != 0){

            System.out.println("------------+");
            System.out.println("0 Sair:     |");
            System.out.println("1 Cachorro: |");
            System.out.println("2 Cavalo:   |");
            System.out.println("3 Preguiça: |");
            System.out.print("------------+ ");
            opcao = sc.nextInt();
            
            if(opcao == 1){
                jaulas.colocarAnimalNaJaula(cachorro);
            }
            else if (opcao == 2) {
                jaulas.colocarAnimalNaJaula(cavalo);
            } 
            else if (opcao == 3) {
                jaulas.colocarAnimalNaJaula(preguica);
            } 
            else if (opcao == 0) {
                break;
            }
            else {
                System.out.println("Opção invalida! ");
            }
        }

        jaulas.mostraJaulas();

        sc.close();
    }
}