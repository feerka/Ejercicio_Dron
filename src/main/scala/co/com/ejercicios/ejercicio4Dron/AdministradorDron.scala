package co.com.ejercicios.ejercicio4Dron
import co.com.ejercicios.ejercicio4Dron.Coordenadas
trait AdministradorDron {

def registrarComandos( desplazamiento:Dron, comandos: List[Coordenadas]):Dron = {

  comandos.headOption.map(comando => registrarComandos(mover( desplazamiento, comando), comandos.drop(1))).getOrElse(desplazamiento)
}

  def mover( desplazamiento: Dron, comando: Coordenadas): Dron = {
    comando match {
      case Arriba(_) =>  if (desplazamiento.arriba.posicionAcumulada < 100) desplazamiento.copy(arriba = Arriba(desplazamiento.arriba.posicionAcumulada + 5)) else desplazamiento
      case Abajo(_) =>    if (desplazamiento.abajo.posicionAcumulada > -50) desplazamiento.copy(abajo = Abajo(desplazamiento.arriba.posicionAcumulada - 5)) else desplazamiento
      case Izquierda(_) => desplazamiento.copy(izquierda = Izquierda(desplazamiento.izquierda.posicionAcumulada - 5))
      case Derecha(_) => desplazamiento.copy(derecha = Derecha(desplazamiento.derecha.posicionAcumulada + 5))
      case Atras(_) => desplazamiento.copy(atras = Atras(desplazamiento.atras.posicionAcumulada - 5))
      case Adelante(_) => desplazamiento.copy(adelante = Adelante(desplazamiento.adelante.posicionAcumulada + 5))
      case _ => desplazamiento
    }
  }

}

object AdministradorDron extends AdministradorDron

