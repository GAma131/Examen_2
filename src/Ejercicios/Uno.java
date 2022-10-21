package Ejercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Uno {

  private int tamano;
  private int[] vector;

  public Uno(int max) {
    vector = new int[max];
    this.tamano = max;
  }

  public String llenarArreglo(int[] args) {
    int i = 0;
    while (i < args.length) {
      vector[i] = args[i];
      i++;
    }
    String cadena = "";
    for (int valor : vector) {
      cadena += valor + " | ";
    }
    return cadena;
  }

  public String ordenarBurbujaAsc() {
    int aux = 0;
    int i = 0;
    int j = 0;
    int n = vector.length;
    do {
      j = 0;
      while (j < n - 1) {
        if (vector[j] > vector[j + 1]) {
          aux = vector[j];
          vector[j] = vector[j + 1];
          vector[j + 1] = aux;
        }
        j++;
      }
      i++;
    } while (i < n);

    String cadena = "";
    for (int valor : vector) {
      cadena += valor + " | ";
    }
    return cadena;
  }

  public int obtenerMaximo() {
    int max = vector[0];
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] > max) {
        max = vector[i];
      }
    }
    return max;
  }

  public int obtenerMinimo() {
    int min = vector[0];
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] < min) {
        min = vector[i];
      }
    }
    return min;
  }

  public double obtenerMedia() {
    double media = 0;
    for (int valor : vector) {
      media += valor;
    }
    media /= vector.length;

    return media;
  }

  public int obtenerModa() {
    int maximoNumRepeticiones = 0;
    int moda = 0;

    for (int i = 0; i < vector.length; i++) {
      int numRepeticiones = 0;
      for (int j = 0; j < vector.length; j++) {
        if (vector[i] == vector[j]) {
          numRepeticiones++;
        } //fin if
        if (numRepeticiones > maximoNumRepeticiones) {
          moda = vector[i];
          maximoNumRepeticiones = numRepeticiones;
        } //fin if
      }
    } //fin for
    return moda;
  }

  public double calcularMediana() {
    double suma = 0;
    for (int valor : vector) {
      suma = ((valor / 2 + valor / 2 + 1) / 2);
    }
    double t = suma;
    return t;
  }

  // public String calcularPorcenje() {
  //   int[] contar = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  //   String cadena = "";
  //   int uno = 1;
  //   for (int valor : vector) {
  //     if (valor == 1) {
  //       contar[0] += 1;
  //     }
  //     if (valor == 2) {
  //       contar[1] += 1;
  //     }
  //     if (valor == 3) {
  //       contar[2] += 1;
  //     }
  //     if (valor == 4) {
  //       contar[3] += 1;
  //     }
  //     if (valor == 5) {
  //       contar[4] += 1;
  //     }
  //     if (valor == 6) {
  //       contar[5] += 1;
  //     }
  //     if (valor == 7) {
  //       contar[6] += 1;
  //     }
  //     if (valor == 8) {
  //       contar[7] += 1;
  //     }
  //     if (valor == 9) {
  //       contar[8] += 1;
  //     }
  //     if (valor == 10) {
  //       contar[9] += 1;
  //     }
  //     double p1 = contar[0] /= tamano;
  //     double p2 = contar[1] /= tamano;
  //     double p3 = contar[2] /= tamano;
  //     double p4 = contar[3] /= tamano;
  //     double p5 = contar[4] /= tamano;
  //     double p6 = contar[5] /= tamano;
  //     double p7 = contar[6] /= tamano;
  //     double p8 = contar[7] /= tamano;
  //     double p9 = contar[8] /= tamano;
  //     double p10 = contar[9] /= tamano;
  //   }
  //   return "\nCantidades de 1 = " + contar[0] + " | Porcentaje de 1 = " + p1;
  // }

  // ! ECHO DESPUÉS DE CLASE

  public String calcularPorcentaje() {
    int[] contar = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    double[] porcent = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    double total = 0;
    int j = 1;
    String imp = "";

    for (int i = 0; i < contar.length; i++) {
      for (int valor : vector) {
        if (valor == j) {
          contar[i] += 1;
        }
      }
      j++;
      total = ((double) contar[i] / (double) tamano) * 100;

      porcent[i] = Math.round(total * 100.0) / 100.0;
    }

    for (int i = 0; i < contar.length; i++) {
      imp +=
        "Cantidades de " +
        (i + 1) +
        "= " +
        contar[i] +
        " | Porcentaje de " +
        (i + 1) +
        "= " +
        porcent[i] +
        "%\n";
    }

    return imp;
  }
}
