package componentes;

import carros.Carro;

public class ComputadorDeBordo {
  private Carro carro;

  public void setCarro(Carro carro) {
    this.carro = carro;
  }

  public void mostrarQuantidadeDeCombustivel() {
    System.out.println("Nível de combustível: " + carro.getCombustivel());
  }

  public void mostrarStatus() {
    if (this.carro.getMotor().estaLigado()) {
      System.out.println("Carro está ligado");
    } else {
      System.out.println("Carro não está ligado");
    }
  }
}
