package co.com.ejercicios

import co.com.ejercicios.ejercicio1.CalculadorDeNotas
import co.com.ejercicios.ejercicio2.CalcularSumatoria
import co.com.ejercicios.ejercicio3.{AdministradorPunto, Punto}
import co.com.ejercicios.ejercicio4Dron.{Abajo, Adelante, AdministradorDron, Arriba, Atras, Coordenadas, Derecha, Dron, Izquierda}

object main {
  def main(args: Array[String]): Unit = {


  }

/*def Ejercicio4(): Unit ={
  val pt1 = Dron(Arriba(),Abajo(),Izquierda(),Derecha(), Atras(),Adelante())

  val comando = List(Arriba(),Arriba(),Arriba(),Arriba(),Arriba(),Derecha(),Adelante(),Arriba(),Arriba(),Arriba(),Arriba(),Arriba(),Arriba(), Abajo(),Abajo(),Atras(), Abajo(),Izquierda(), Izquierda())

  val tamComando: Int =  AdministradorDron.tamComando(comando:List[Coordenadas])
  println(comando)
  println(tamComando)
  AdministradorDron.mover(pt1, comando, comando(tamComando), tamComando )
}*/

  def ejercicio2 () = {
    val result = CalcularSumatoria.procesarSumatoria(CalcularSumatoria.procesarCalculo(_), 4)
    println(result)
  }

  def ejercicio1() = {
    val notaFinalDeseada: Double = 3
    val  numeroDeNotas: Double = 3

    CalculadorDeNotas.calcularNotaFinal(notaFinalDeseada, numeroDeNotas)
  }

  def ejercicio3 () = {
    val pt1 = Punto(10, 10)
    val pt2 = Punto(10, 10)
    // Move to a new location
    val mover = AdministradorPunto.mover(pt1, pt2);
    println(s"Point x location : ${mover.xc}");
    println(s"Point y location : ${mover.yc}");

    val pt3 = Punto(200, 110)
    // Move to a new location
    val mover1 = AdministradorPunto.mover(mover, pt3);
    println(s"Point x location : ${mover1.xc}");
    println(s"Point y location : ${mover1.yc}");

    val pt4 = Punto(300, 200)
    // Move to a new location
    val mover2 = AdministradorPunto.mover(mover1, pt4);
    println(s"Point x location : ${mover2.xc}");
    println(s"Point y location : ${mover2.yc}");
  }
  //val result = CalcularSumatoria.procesarSumatoria(CalcularSumatoria.procesarCalculo(_), 4)
  //AdministradorDron.prueba("abjo")

}