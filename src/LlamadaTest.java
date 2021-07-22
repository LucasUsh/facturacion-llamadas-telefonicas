import Enums.Region;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class LlamadaTest {
  LocalDateTime diaNoHabilHorarioEconomico = LocalDateTime.of(2021, Month.JUNE, 20, 7, 55);
  LocalDateTime diaNoHabilHorarioCaro = LocalDateTime.of(2021, Month.JUNE, 20, 15, 42);
  LocalDateTime diaHabilHorarioCaro = LocalDateTime.of(2021, Month.JUNE, 24, 15, 42);
  LocalDateTime diaHabilHorarioEconomico = LocalDateTime.of(2021, Month.JUNE, 24, 7, 55);

  Duration duracion = Duration.ofMinutes(100);

  @Test
  public void testCostoLlamadaLocalEnDiaNoHabilYHorarioCaro() {
    Local llamada = new Local(this.duracion, diaNoHabilHorarioCaro);
    Assertions.assertEquals(10.0, llamada.costo());
  }

  @Test
  public void testCostoLlamadaLocalEnDiaNoHabilYHorarioEconomico() {
    Local llamada = new Local(this.duracion, diaNoHabilHorarioEconomico);
    Assertions.assertEquals(10.0, llamada.costo());
  }

  @Test
  public void testCostoLlamadaLocalEnDiaHabilYHorarioEconomico() {
    Local llamada = new Local(this.duracion, diaHabilHorarioEconomico);
    Assertions.assertEquals(10.0, llamada.costo());
  }

  @Test
  public void testCostoLlamadaLocalEnDiaHabilYHorarioCaro() {
    Local llamada = new Local(this.duracion, diaHabilHorarioCaro);
    Assertions.assertEquals(20.0, llamada.costo());
  }

}
