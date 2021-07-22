package Enums;

public enum Region {
  ZARATE  (0.3),
  TANDIL  (0.35),
  BAHIA_BLANCA  (0.39),
  USHUAIA (1.2),
  URUGUAY (1.5),
  MAXICO  (2.3),
  ITALIA  (3.0),
  RUSIA   (3.7),
  JAPON   (5.0);

  double costoPorMinuto;

  public double costoPorMinuto() {return this.costoPorMinuto;}

  Region(double costoPorMinuto){
    this.costoPorMinuto = costoPorMinuto;
  }
}
