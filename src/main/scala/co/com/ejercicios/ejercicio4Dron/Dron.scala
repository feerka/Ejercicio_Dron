package co.com.ejercicios.ejercicio4Dron

trait Coordenadas
object Coordenadas extends Coordenadas

case class Dron(arriba: Arriba, abajo: Abajo, izquierda: Izquierda, derecha: Derecha, atras: Atras, adelante: Adelante)


case class Arriba(posicionAcumulada: Int = 0 ) extends Coordenadas
case class Abajo(posicionAcumulada: Int = 0 )extends Coordenadas
case class Izquierda(posicionAcumulada: Int = 0 )extends Coordenadas
case class Derecha(posicionAcumulada: Int = 0 )extends Coordenadas
case class Atras(posicionAcumulada: Int = 0 )extends Coordenadas
case class Adelante(posicionAcumulada: Int = 0 )extends Coordenadas


