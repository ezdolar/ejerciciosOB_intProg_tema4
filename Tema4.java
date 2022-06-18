public class Sesion4 {

	public static void main(String[] args) {
   
      //Paso 1: Usando un if, crear una condición que compare si la variable numeroIf 
      //es positivo, negativo, o 0.
		int numeroIf = -4;
		if (numeroIf < 0) {
			System.out.println("Negativo");
		}else if (numeroIf > 0) {
			System.out.println("Positivo");
		}else{
         System.out.println("Cero");
      }
      
      //Paso 2: Crea un bucle While, este bucle tendrá que tener como condición que 
      //la variable numeroWhile sea inferior a 3
		int numeroWhile = 0;
      while (numeroWhile < 3) {
         //Paso 2.1: Incrementar el valor de la variable en uno cada vez que se ejecute
         numeroWhile++;
         //Paso 2.2: Mostrarlo por pantalla cada vez que se ejecute
			System.out.println(numeroWhile);
		}
      
      //Paso 3: Para el bucle Do While, deberás crear la misma estructura que en el While, 
      //pero solo se debe ejecutar una vez
      do {
         numeroWhile++;
			System.out.println(numeroWhile);
		} while (numeroWhile < 3);
      
      //Paso 4: Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 
      //y su condición será que la variable sea igual o menor que 3,
      //se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse
		for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
			System.out.println(numeroFor);
		}
      
      //Paso 5: Por último, para el Switch, deberás crear la variable estacion, y distintos case 
      //para las cuatro estaciones del año. Dependiendo del valor de la variable estacion 
      //se deberá mandar un mensaje por consola informando de la estación en la que está. 
      //También habrá que poner un default para cuando el valor de la variable no sea una estación.
		String estacion = "Invierno";
		switch (estacion) {
		case "Primavera":
			System.out.println("Es primavera");
			break;
		case "Verano":
			System.out.println("Es verano");
			break;
		case "Otoño":
			System.out.println("Es otoño");
			break;
		case "Invierno":
			System.out.println("Es invierno");
			break;
		default:
			System.out.println("Que estacion es esa?");
		}

	}

}
