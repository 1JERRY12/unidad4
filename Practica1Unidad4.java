/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1.unidad.pkg4;

/**
 *
 * @author Usuario
 */
public class Practica1Unidad4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    arreglo = [20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3]

  opcion = ""
  while opcion != "salir":
    print("----------")
    print("Menu")
    print("1. Sumar elementos del arreglo")
    print("2. Multiplicar elementos del arreglo")
    print("Escribe 'salir' para salir")

    opcion = input("Selecciona una opción: ")

    if opcion == "1":
        resultado = sum(arreglo)
        print("La suma de los elementos del arreglo es:", resultado)
    elif opcion == "2":
        resultado = 1
        for elemento in arreglo:
            resultado *= elemento
        print("El producto de los elementos del arreglo es:", resultado)
    elif opcion == "salir":
        print("Saliendo del programa...")
    else:
      print("Opción inválida. Por favor, selecciona una opción válida.")
  
        {
        }
    }
    
}
