import Enums.Region;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;

public class FacturacionMain {
  public static void main (String[] args) {
    Factura facturaJunio = new Factura(150, Month.JUNE);

    facturaJunio.agregarLlamadaLocal(new Local(Duration.ofMinutes(10), LocalDateTime.of(2021, Month.JUNE, 20, 15, 42)));
    facturaJunio.agregarLlamadaLocal(new Local(Duration.ofMinutes(56), LocalDateTime.of(2021, Month.JUNE, 20, 7, 55)));
    facturaJunio.agregarLlamadaLocal(new Local(Duration.ofMinutes(30), LocalDateTime.of(2021, Month.JUNE, 24, 7, 55)));
    facturaJunio.agregarLlamadaLocal(new Local(Duration.ofMinutes(4), LocalDateTime.of(2021, Month.JUNE, 24, 15, 42)));

    facturaJunio.agregarLlamadaExterna(new Externa(Duration.ofMinutes(23), Region.ZARATE));
    facturaJunio.agregarLlamadaExterna(new Externa(Duration.ofMinutes(16), Region.RUSIA));

    System.out.printf("Factura del servicio de llamadas telefónicas");
    System.out.printf("\nMes: " + facturaJunio.getMes());
    System.out.printf("\nCosto de abono básico: $%.2f", facturaJunio.getAbonoBase());
    System.out.printf("\nCosto de llamadas locales: $%.2f", facturaJunio.costoLlamadasLocales());
    System.out.printf("\nCosto de llamadas nacionales e internacionales: $%.2f", facturaJunio.costoLlamadasExternas());
    System.out.printf("\nCosto total: $ %.2f", facturaJunio.costoTotal());
  }
}
