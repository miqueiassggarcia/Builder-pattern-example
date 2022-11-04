package componentes;

public class Motor {
  private final double volume;
  private double quilometragem;
  private boolean ligado;

  public Motor(double volume, double quilometragem) {
    this.volume = volume;
    this.quilometragem = quilometragem;
  }

  public void ligar() {
    ligado = true;
  }

  public void desligar() {
    ligado = false;
  }

  public boolean estaLigado() {
    return ligado;
  }

  public void ir(double quilometragem) {
    if(ligado) {
      this.quilometragem += quilometragem;
    } else {
      System.out.println("Não pode ir, para isso você precisa ligar o motor primeiro!");
    }
  }

  public double getVolume() {
    return volume;
  }

  public double getQuilometragem() {
    return quilometragem;
  }
}
