import Enums.CostoLocal;
import Enums.LimiteHoraPico;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;

public class Local extends Llamada {
  LocalDateTime marcaTemporalDeInicio;

  @Override
  double costoPorMinuto() {
    if (esLlamadaEnDiaHabil() && esLlamadaEnHoraPico()) {
      return CostoLocal.CARO.costoPorMinuto();
    }
    return CostoLocal.ECONOMICO.costoPorMinuto();
  }

  private boolean esLlamadaEnHoraPico() {
    return (LocalTime.from(this.marcaTemporalDeInicio).isAfter(LimiteHoraPico.INFERIOR.horario()) &&
            LocalTime.from(this.marcaTemporalDeInicio).isBefore(LimiteHoraPico.SUPERIOR.horario()));
  }

  private boolean esLlamadaEnDiaHabil() {
    return (this.marcaTemporalDeInicio.getDayOfWeek() != DayOfWeek.SATURDAY &&
            this.marcaTemporalDeInicio.getDayOfWeek() != DayOfWeek.SUNDAY);
  }

  Local(Duration duracion, LocalDateTime marcaTemporalDeInicio) {
    super(duracion);
    this.marcaTemporalDeInicio = marcaTemporalDeInicio;
  }
}
