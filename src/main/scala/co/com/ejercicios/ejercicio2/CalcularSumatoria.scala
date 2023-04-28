package co.com.ejercicios.ejercicio2

trait CalcularSumatoria {

  def procesarCalculo(i: Int) = ( 3 * i ) + 5

  def procesarSumatoria(f: Int => Int, parametro: Int): Int = {
    if(parametro > 1){
      procesarSumatoria(f, parametro - 1) + f(parametro)
    }else {
      f(parametro)
    }
  }
}
object CalcularSumatoria extends CalcularSumatoria
