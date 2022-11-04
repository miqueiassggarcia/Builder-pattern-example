package construtores;

import carros.TipoDeCarro;
import componentes.ComputadorDeBordo;
import componentes.Motor;
import componentes.NavegadorGPS;
import componentes.Transmissao;

public interface Construtor {
  void setTipoDeCarro(TipoDeCarro tipo);
  void setAssentos(int assentos);
  void setMotor(Motor motor);
  void setTransmissao(Transmissao transmissao);
  void setComputadorDeBordo(ComputadorDeBordo computadorDeBordo);
  void setNavegadorGPS(NavegadorGPS navegadorGPS);
}
