package Enums;

public enum CostoLocal {
  ECONOMICO (0.1), CARO (0.2);

  double costoPorMinuto;

  public double costoPorMinuto() {return this.costoPorMinuto;}

  CostoLocal(double costoPorMinuto){
    this.costoPorMinuto = costoPorMinuto;
  }
}
