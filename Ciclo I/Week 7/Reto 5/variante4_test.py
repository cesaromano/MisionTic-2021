"""
Interpretacion del problema

funcion 1: #lee los datos

    - debe leer cada fila del .csv
    - con cada liea debe agregar a un nuevo archivo:
        - fecha
        - tabulador
        - promedio entre dos valores
        - tabulador
        - cadena de texto con validacion (incluye condicional)

funcion 2: #Escribe los datos

    - debe escribir linea a linea el retorno de funcion 1 en archivo .csv

funcion solucion:

    - debe 

"""

import csv 

data_csv = []
data_extract = []

filename = "FB.csv"
with open(filename) as f:
    reader = csv.reader(f)
    #header_row = next(reader)

    for row in reader:
        data_csv.append(row)

    for each in data_csv:
        temp_data = []
        temp_data.append(each[0])
        temp_data.append('  ')
        

        #for each_2 in each:
         #   


print(data_extract)
print(len(data_extract))