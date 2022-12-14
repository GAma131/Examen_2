import Ejercicios.Dos;
import Ejercicios.Uno;
import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) throws Exception {
    boolean sentinel = true;
    int opcion = 0;
    int max = 30;
    int puntaje = 20;
    Uno obj1 = new Uno(max);
    Dos obj2 = new Dos(puntaje);

    do {
      opcion =
        Integer.parseInt(
          JOptionPane.showInputDialog(
            null,
            "Elige una opción:" +
            "\n\n1) Ejercicio 1" +
            "\n2) Ejercicio 2" +
            "\n0) Salir" +
            "\n\nIngresa la opción"
          )
        );
      switch (opcion) {
        case 1:
          JOptionPane.showMessageDialog(
            null,
            "Vector Original:\n" +
            obj1.llenarArreglo(solicitarValores(max)) +
            "\nVector Ordenado:\n" +
            obj1.ordenarBurbujaAsc() +
            "\nNúmero más alto: " +
            obj1.obtenerMaximo() +
            "\nNúimero más bajo: " +
            obj1.obtenerMinimo() +
            "\nMedia artimetica: " +
            obj1.obtenerMedia() +
            "\nModa: " +
            obj1.obtenerModa() +
            "\nMediana: " +
            obj1.calcularMediana() +
            "\nPorcentaje:\n" +
            obj1.calcularPorcentaje()
          );
          break;
        case 2:
          JOptionPane.showMessageDialog(
            null,
            "Vector original:\n" +
            obj2.llenarArreglo(solicitarValores(puntaje)) +
            obj2.clasificarAlumnos()
          );
          break;
        case 0:
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
