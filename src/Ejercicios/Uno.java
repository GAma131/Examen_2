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

  public void llenarArreglo(int[] args) {
    int i = 0;
    while (i < args.length) {
      vector[i] = args[i];
      i++;
    }
    Imprimir();
  }

  public void Imprimir() {
    String cadena = "";
    for (int valor : vector) {
      cadena += valor + "\n";
    }

    JOptionPane.showMessageDialog(null, cadena);
  }

  @Override
  public String toString() {
    return ("Vector original:" + Imprimir());
  }
}
