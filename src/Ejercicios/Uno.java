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
}
