package co.com.ejercicios.ejercicio4Dron

trait Imprimir {
  def mostrarDron(dron: Dron): Unit = println(s"El dron se encuentra:   \n Arriba = ${dron.arriba.posicionAcumulada}  \n Abajo = ${dron.abajo.posicionAcumulada} \n Izquierda = ${dron.izquierda.posicionAcumulada} \n Derecha = ${dron.derecha.posicionAcumulada} \n Atras = ${dron.atras.posicionAcumulada} \n Adelante = ${dron.adelante.posicionAcumulada}")
}
object Imprimir extends Imprimir
