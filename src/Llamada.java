import java.time.Duration;

public abstract class Llamada {
  Duration duracion;

  abstract double costoPorMinuto();

  double costo() {
    return costoPorMinuto() * this.duracion.toMinutes();
  }

  Llamada(Duration duracion) {
    this.duracion = duracion;
  }
}