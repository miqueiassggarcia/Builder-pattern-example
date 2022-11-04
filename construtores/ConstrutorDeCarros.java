package construtores;

import carros.Carro;
import carros.TipoDeCarro;
import componentes.ComputadorDeBordo;
import componentes.Motor;
import componentes.NavegadorGPS;
import componentes.Transmissao;

public class ConstrutorDeCarros implements Construtor {
  private TipoDeCarro tipo;
  private int assentos;
  private Motor motor;
  private Transmissao transmissao;
  private NavegadorGPS navegadorGPS;
  private ComputadorDeBordo computadorDeBordo;
  
  @Override
  public void setTipoDeCarro(TipoDeCarro tipo) {
    this.tipo = tipo;
  }
  
  @Override
  public void setAssentos(int assentos) {
    this.assentos = assentos;
  }
  
  @Override
  public void setMotor(Motor motor) {
    this.motor = motor;
  }
  
  @Override
  public void setTransmissao(Transmissao transmissao) {
    this.transmissao = transmissao;
  }
  
  @Override
  public void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo) {
    this.computadorDeBordo = computadorDeBordo;
  }
  
  @Override
  public void setNavegadorGPS(NavegadorGPS navegadorGPS) {
    this.navegadorGPS = navegadorGPS;
  }

  public Carro getResultado() {
    return new Carro(tipo, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
  }
}