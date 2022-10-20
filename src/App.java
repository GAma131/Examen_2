import Ejercicios.Uno;
import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) throws Exception {
    boolean sentinel = true;
    int opcion = Integer.parseInt(
      JOptionPane.showInputDialog(
        null,
        "Elige una opción:" +
        "\n\n1) Ejercicio 1" +
        "\n2) Ejercicio 2" +
        "\n3) Salir" +
        "\n\nIngresa la opción"
      )
    );
    int max = 4;
    Uno obj1 = new Uno(max);

    do {
      switch (opcion) {
        case 1:
          obj1.llenarArreglo(solicitarValores(max));
          break;
        case 2:
          System.out.println("2");
          break;
        case 3:
          sentinel = false;
          break;
        default:
          JOptionPane.showMessageDialog(
            null,
            "Valor incorrecto, intentelo otra vez"
          );
          break;
      }
    } while (sentinel);
  }

  public static int[] solicitarValores(int max) {
    int[] arg = new int[max];
    int min = 1;
    int llenar = 0;

    for (int i = 0; i < arg.length; i++) {
      double numero = Math.random() * ((max - min) + 1) + min;
      llenar = (int) numero;
      arg[i] = llenar;
    }
    return arg;
  }
}