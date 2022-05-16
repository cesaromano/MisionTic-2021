import csv

with open("Tabla.csv", newline = "") as csv_file:
    tabla = csv.reader(csv_file)

    for row in tabla:
        print(row)

with open("Tabla.csv") as csv_file:
    tabla = csv.reader(csv_file)

    for row in tabla:
        print(row)