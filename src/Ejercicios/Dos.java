package Ejercicios;

import java.util.Arrays;
import javax.lang.model.element.Element;
import javax.swing.JOptionPane;

public class Dos {

  // ! ECHO DESPUÉS DE CLASE
  private int tamano;
  private int[] vector;

  public Dos(int max) {
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

  public String clasificarAlumnos() {
    int[] alumnos = { 0, 0, 0, 0 };

    for (int i = 0; i < alumnos.length; i++) {
      for (int valor : vector) {
        if (valor >= 0 && valor <= 5) {
          alumnos[i] += 1;
        }
        if (valor >= 6 && valor <= 10) {
          alumnos[i] += 1;
        }
        if (valor >= 11 && valor <= 15) {
          alumnos[i] += 1;
        }
        if (valor >= 16 && valor <= 20) {
          alumnos[i] += 1;
        }
      }
    }
    return (
      "\n\nAlumnos:\nDeficientes:" +
      alumnos[0] +
      "\nRegulares:" +
      alumnos[1] +
      "\nBuenos:" +
      alumnos[2] +
      "\nExcelentes:" +
      alumnos[3]
    );
  }
}
