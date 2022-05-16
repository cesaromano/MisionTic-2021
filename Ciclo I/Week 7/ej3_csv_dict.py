import csv

#pasa los datos a diccionarios

columns_name = ["Pais", "Capital"]

def read():
    with open("Tabla.csv") as csv_file:
        tabla = csv.DictReader(csv_file, fieldnames= columns_name)
        for row in tabla:
            print(row)

def write():
    with open("Tabla.csv") as csv_file:
        tabla = csv.DictWriter(csv_file, fieldnames = columns_name) #fieldnames, nombre de la columna
        tabla.writerow({"Pais" : "Austria", "Capital" : "Viena"})
read()
write()