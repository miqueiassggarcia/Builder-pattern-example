package carros;

import componentes.ComputadorDeBordo;
import componentes.Motor;
import componentes.NavegadorGPS;
import componentes.Transmissao;

public class Manual {
  private final TipoDeCarro tipoDeCarro;
  private final int assentos;
  private final Motor motor;
  private final Transmissao transmissao;
  private final ComputadorDeBordo computadorDeBordo;
  private final NavegadorGPS navegadorGPS;

  public Manual(TipoDeCarro tipoDeCarro, int assentos, Motor motor, Transmissao transmissao, ComputadorDeBordo computadorDeBordo, NavegadorGPS navegadorGPS) {
    this.tipoDeCarro = tipoDeCarro;
    this.assentos = assentos;
    this.motor = motor;
    this.transmissao = transmissao;
    this.computadorDeBordo = computadorDeBordo;
    this.navegadorGPS = navegadorGPS;
  }

  public String imprimirInformacao() {
    String informacao = "";
    informacao += "Tipo de carro: " + tipoDeCarro + "\n";
    informacao += "Quantidade de assentos: " + assentos + "\n";
    informacao += "Motor: volume - " + motor.getVolume() + "; quilometragem - " + motor.getQuilometragem() + "\n";
    informacao += "Transmissão: " + transmissao + "\n";
    if (this.computadorDeBordo != null) {
      informacao += "Computador de bordo: Funcional" + "\n";
    } else {
      informacao += "Computador de bordo: N/A" + "\n";
    }
    if (this.navegadorGPS != null) {
      informacao += "Navegador GPS: Funcional" + "\n";
    } else {
      informacao += "Navegador GPS: N/A" + "\n";
    }

    return informacao;
  }
}
