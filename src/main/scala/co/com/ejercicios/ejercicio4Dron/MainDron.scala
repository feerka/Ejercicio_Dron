package co.com.ejercicios.ejercicio4Dron

object MainDron {

  def main(args: Array[String]): Unit = {

    val posicionInicial = Dron(Arriba(),Abajo(),Izquierda(),Derecha(), Atras(),Adelante())
    val comando:List[Coordenadas] = List(Adelante(),Arriba(),Derecha(),Adelante(),Arriba(),Arriba(),Arriba(),Arriba(),Arriba(),Arriba(), Abajo(),Abajo(),Atras(), Abajo(),Derecha(),Izquierda(), Izquierda())

    val posicionDron = AdministradorDron.registrarComandos(posicionInicial, comando)

    Imprimir.mostrarDron(posicionDron)

  }

}
