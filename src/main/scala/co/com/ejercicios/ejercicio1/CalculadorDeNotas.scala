package co.com.ejercicios.ejercicio1

trait CalculadorDeNotas {


  def calcularNotaFinal(notaFinalDeseada: Double, numeroDeNotas: Double) = (nota1: Double, nota2: Double) => {
    if(calcularNota(notaFinalDeseada, numeroDeNotas, nota1, nota2) > 0){
      calcularNota(notaFinalDeseada, numeroDeNotas, nota1, nota2)
    }else{
      0
    }
  }

 private def calcularNota(notaFinalDeseada: Double, numeroDeNotas: Double, nota1: Double, nota2: Double) =
   (notaFinalDeseada * numeroDeNotas) - nota1 - nota2
}

object CalculadorDeNotas extends CalculadorDeNotas