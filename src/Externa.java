import Enums.Region;

import java.time.Duration;

public class Externa extends Llamada {
  Region region;

  @Override
  double costoPorMinuto() {
    return region.costoPorMinuto();
  }

  Externa(Duration duracion, Region localidad) {
    super(duracion);
    this.region = localidad;
  }
}
