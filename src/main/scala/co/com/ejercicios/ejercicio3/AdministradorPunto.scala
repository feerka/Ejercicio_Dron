package co.com.ejercicios.ejercicio3

trait AdministradorPunto {
  def mover(desplazamientoInicial: Punto, desplazamientoFinal: Punto) =
    Punto(desplazamientoInicial.xc + desplazamientoFinal.xc,
      desplazamientoInicial.yc + desplazamientoFinal.yc)
}

object AdministradorPunto extends AdministradorPunto