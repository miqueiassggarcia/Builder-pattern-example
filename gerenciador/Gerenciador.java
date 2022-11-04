package gerenciador;

import componentes.ComputadorDeBordo;
import componentes.Motor;
import componentes.NavegadorGPS;
import componentes.Transmissao;
import carros.TipoDeCarro;
import construtores.Construtor;

public class Gerenciador {
  public void construirCarroSport(Construtor construtor) {
    construtor.setTipoDeCarro(TipoDeCarro.CARRO_SPORT);
    construtor.setAssentos(2);
    construtor.setMotor(new Motor(3.0, 0));
    construtor.setTransmissao(Transmissao.SEMI_AUTOMATICA);
    construtor.setComputadorDeBordo(new ComputadorDeBordo());
    construtor.setNavegadorGPS(new NavegadorGPS());
  }

  public void construirCarroUrbano(Construtor construtor) {
    construtor.setTipoDeCarro(TipoDeCarro.CARRO_URBANO);
    construtor.setAssentos(2);
    construtor.setMotor(new Motor(1.2, 0));
    construtor.setTransmissao(Transmissao.AUTOMATICA);
    construtor.setComputadorDeBordo(new ComputadorDeBordo());
    construtor.setNavegadorGPS(new NavegadorGPS());
  }

  public void construirSUV(Construtor construtor) {
    construtor.setTipoDeCarro(TipoDeCarro.SUV);
    construtor.setAssentos(4);
    construtor.setMotor(new Motor(2.5, 0));
    construtor.setTransmissao(Transmissao.MANUAL);
    construtor.setNavegadorGPS(new NavegadorGPS());
  }
}
