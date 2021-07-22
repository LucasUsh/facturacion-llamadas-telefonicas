package Enums;
import java.time.LocalTime;

public enum LimiteHoraPico {
  INFERIOR (LocalTime.of(8,0)), SUPERIOR (LocalTime.of(20,0));

  LocalTime horario;

  public LocalTime horario() {return this.horario;}

  LimiteHoraPico(LocalTime horario){
    this.horario = horario;
  }
}
