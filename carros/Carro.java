package carros;

import componentes.ComputadorDeBordo;
import componentes.Motor;
import componentes.NavegadorGPS;
import componentes.Transmissao;

public class Carro {
  private final TipoDeCarro tipo;
  private final int assentos;
  private final Motor motor;
  private final Transmissao transmissao;
  private final ComputadorDeBordo computadorDeBordo;
  private final NavegadorGPS navegadorGPS;
  private double combustivel = 0;

  public Carro(TipoDeCarro tipo, int assentos, Motor motor, Transmissao transmissao, ComputadorDeBordo computadorDeBordo, NavegadorGPS navegadorGPS) {
    this.tipo = tipo;
    this.assentos = assentos;
    this.motor = motor;
    this.transmissao = transmissao;
    this.computadorDeBordo = computadorDeBordo;
    if (this.computadorDeBordo != null) {
      this.computadorDeBordo.setCarro(this);
    }
    this.navegadorGPS = navegadorGPS;
  }

  public TipoDeCarro getTipoDeCarro() {
    return tipo;
  }

  public double getCombustivel() {
    return combustivel;
  }

  public void setCombustivel(double combustivel) {
    this.combustivel = combustivel;
  }

  public int getAssentos() {
    return assentos;
  }

  public Motor getMotor() {
    return motor;
  }

  public Transmissao getTransmissao() {
    return transmissao;
  }

  public ComputadorDeBordo getComputadorDeBordo() {
    return computadorDeBordo;
  }

  public NavegadorGPS getNavegadorGPS() {
    return navegadorGPS;
  }
}
