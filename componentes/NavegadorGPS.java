package componentes;

public class NavegadorGPS {
  private String rota;

  public NavegadorGPS() {
    this.rota = "Daqui até ali onde ele mora";
  }

  public NavegadorGPS(String rotaManual) {
    this.rota = rotaManual;
  }

  public String getRota() {
    return rota;
  }
}
