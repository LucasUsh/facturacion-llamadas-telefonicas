import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Factura {
  double abonoBase;
  Month mes;
  List<Llamada> llamadasLocales = new ArrayList<>();
  List<Llamada> llamadasExternas = new ArrayList<>();

  public void agregarLlamadaLocal(Local unaLlamada) {
    this.llamadasLocales.add(unaLlamada);
  }

  public void agregarLlamadaExterna(Externa unaLlamada) {
    this.llamadasExternas.add(unaLlamada);
  }

  public double costoTotal() {
    return this.abonoBase + this.costoLlamadasLocales() + this.costoLlamadasExternas();
  }

  public double costoLlamadasLocales() {
    return this.costoDe(this.llamadasLocales);
  }

  public double costoLlamadasExternas() {
    return this.costoDe(this.llamadasExternas);
  }

  private double costoDe(List<Llamada> llamadas) {
    double costo = 0;
    for (Llamada llamada: llamadas) costo = costo + llamada.costo();
    return costo;
  }

  Factura(double abonoBase, Month mes) {
    this.abonoBase = abonoBase;
    this.mes = mes;
  }
}