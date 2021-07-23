import Enums.Region;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class FacturaTest {
  LocalDateTime diaNoHabilHorarioEconomico = LocalDateTime.of(2021, Month.JUNE, 20, 7, 55);
  LocalDateTime diaNoHabilHorarioCaro = LocalDateTime.of(2021, Month.JUNE, 20, 15, 42);
  LocalDateTime diaHabilHorarioCaro = LocalDateTime.of(2021, Month.JUNE, 24, 15, 42);
  LocalDateTime diaHabilHorarioEconomico = LocalDateTime.of(2021, Month.JUNE, 24, 7, 55);

  Duration duracion = Duration.ofMinutes(100);

  Factura facturaJunio;

  @BeforeEach
  public void incializar() {
    this.facturaJunio = new Factura(150, Month.JUNE);

    this.facturaJunio.agregarLlamadaLocal(new Local(this.duracion, diaNoHabilHorarioCaro));
    this.facturaJunio.agregarLlamadaLocal(new Local(this.duracion, diaNoHabilHorarioEconomico));
    this.facturaJunio.agregarLlamadaLocal(new Local(this.duracion, diaHabilHorarioEconomico));
    this.facturaJunio.agregarLlamadaLocal(new Local(this.duracion, diaHabilHorarioCaro));

    this.facturaJunio.agregarLlamadaExterna(new Externa(this.duracion, Region.ZARATE));
    this.facturaJunio.agregarLlamadaExterna(new Externa(this.duracion, Region.RUSIA));
  }

  @Test
  public void testCostoLlamadasLocales() {
    Assertions.assertEquals(50.0, this.facturaJunio.costoLlamadasLocales());
  }

  @Test
  public void testCostoLlamadasExternas() {
    Assertions.assertEquals(400.0, this.facturaJunio.costoLlamadasExternas());
  }

  @Test
  public void testCostoTotal() {
    Assertions.assertEquals(600.0, this.facturaJunio.costoTotal());
  }
}
