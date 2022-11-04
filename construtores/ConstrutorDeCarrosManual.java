package construtores;

import carros.Manual;
import carros.TipoDeCarro;
import componentes.ComputadorDeBordo;
import componentes.Motor;
import componentes.NavegadorGPS;
import componentes.Transmissao;

public class ConstrutorDeCarrosManual implements Construtor {
  private TipoDeCarro tipo;
  private int assentos;
  private Motor motor;
  private Transmissao transmissao;
  private ComputadorDeBordo computadorDeBordo;
  private NavegadorGPS navegadorGPS;
  
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
  
  public Manual getResultado() {
    return new Manual(tipo, assentos, motor, transmissao, computadorDeBordo, navegadorGPS);
  }
}