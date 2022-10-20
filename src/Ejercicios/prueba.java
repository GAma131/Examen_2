package Ejercicios;

import javax.swing.text.html.FormView;

public class prueba {

  public static void main(String[] args) {
    int min = 1;
    int max = 5;

    int arg[] = new int[max];

    for (int i = 0; i <= arg.length; i++) {
      double valor = Math.random() * ((max - min) + 1) + min;
      int Imprimir = (int) valor;
      arg[i] = Imprimir;
    }
    System.out.println(arg);
  }
}
