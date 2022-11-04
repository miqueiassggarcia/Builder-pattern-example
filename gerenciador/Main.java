package gerenciador;

import carros.Carro;
import carros.Manual;
import construtores.ConstrutorDeCarros;
import construtores.ConstrutorDeCarrosManual;

public class Main {
  public static void main(String[] args) {
    Gerenciador gerenciador = new Gerenciador();

    ConstrutorDeCarros construtor = new   ConstrutorDeCarros();
    gerenciador.construirCarroSport(construtor);

    Carro carro = construtor.getResultado();
    System.out.println("Carro construido:\n" + carro.getTipoDeCarro());

    ConstrutorDeCarrosManual construtorManual = new ConstrutorDeCarrosManual();

    gerenciador.construirCarroSport(construtorManual);
    Manual carroManual = construtorManual.getResultado();
    System.out.println("\nCarro construido manualmente:\n" + carroManual.imprimirInformacao());
  }
}
