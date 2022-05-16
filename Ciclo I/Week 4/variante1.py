import numpy as np
#NOTA: PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
#LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO

#En este espacio podrás programar las funciones que deseas usar en la función solución (NO ES OBLIGATORIO CREAR OTRAS FUNCIONES)
"""Inicio espacio para programar funciones propias"""



#PUEDES PROGRAMAR CUANTAS FUNCIONES DESEES 



"""Fin espacio para programar funciones propias"""

def solucion(A):
    """
    En esta función deberás programar tu solución.
    Explicación del parámetro que recibe:
    - A: Es una matriz cuadrada de números enteros aleatoria (NO TE DEBES PREOCUPAR POR LLENARLA, YA LO ESTÁ), 
        para indexar un elemento en la fila i, columna j se hace así:
        A[i,j] o A[i][j], como te sientas más cómod@.
        El orden de la matriz lo puedes calcular así: n = A.shape[0]
        
    Explicación de lo que debe retornar:
    -valor_minimo: Es el valor mínimo (Número más pequeño) ubicado en las casillas
        descritas en el enunciado, es de tipo float o entero (Elige el tipo que quieras)
    -posiciones_valor_minimo: Es una lista de Python que contiene la posición o las 
        posiciones donde se encuentra el valor mínimo determinado, 
        ¡Cada posición debe ser una tupla!
    """

    matriz_entrada_list = A.tolist()

    especial_boxes = []
    especial_positions = []
    counter = -1

    for each in range(0, len(matriz_entrada_list)):

        row = matriz_entrada_list[each]
        counter += 1
    #	print(len(row))

        if each % 2 == 0:
            for each_odd in range(0, len(row) - counter):
                if each_odd % 2 == 0:
                    pass
                else:
                    especial_boxes.append(matriz_entrada_list[each][each_odd])
                    e_p = (each, each_odd)
                    especial_positions.append(e_p)
        else:
            for each_even in range(0, len(row) - counter):
                if each_even % 2 == 0:
                    especial_boxes.append(matriz_entrada_list[each][each_even])
                    e_p = (each, each_even)
                    especial_positions.append(e_p)
                else:
                    pass

    #Algoritmo para seleccionar numero menor entre numeros especificados

    reference_number = 100
    valor_minimo = 0
    posiciones_valor_minimo_tuple = ()

    for each in range(len(especial_boxes)):
    #	print(each)
        if especial_boxes[each] < reference_number:
            valor_minimo = especial_boxes[each]
            posiciones_valor_minimo_tuple = especial_positions[each]

    posiciones_valor_minimo=[posiciones_valor_minimo_tuple]
    
    return valor_minimo, posiciones_valor_minimo
    
"""
Estas líneas de código que siguen, permiten probar si su ejercicio es correcto
"""
#NO MODIFICAR
matriz_entrada = np.array([[89, 13, 23, 72],
       [29, 11, 81, 62],
       [27, 26, 88, 33],
       [ 5, 78, 11, 11]])
menor_estudiante = solucion(matriz_entrada)[0]
posiciones_menor_estudiante = solucion(matriz_entrada)[1]
print("MATRIZ ENTREGADA:\n", matriz_entrada,"\n")
print("===SALIDA ESPERADA===\nMenor = ", 5,"\nPosiciones donde está el menor = ", [(3, 0)],"\n")
print("===TU SALIDA===:\nMenor = ", menor_estudiante,"\nPosiciones donde está el menor = ", posiciones_menor_estudiante,"\n")
if menor_estudiante == 5 and  set(posiciones_menor_estudiante) == set([(3, 0)]):
    print("Todo se ve correcto, ¡Procede a calificar tu código!")
else:
    print("Las salidas no coinciden, ¡Estás olvidando algo en tu código!")