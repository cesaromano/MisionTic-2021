import csv

class dataClients(object):
    def __init__(self, file_name):
        self.name_file = file_name
        self.tabla = []
        self.fieldnames = ["id", "nombre", "cantidad", "precio"]

    def read(self):
        with open(self.name_file) as csv_file:
            datos = csv.DictReader(csv_file, fieldnames = self.fieldnames)
            for row in datos:
                self.tabla.append(row)

            #return self.tabla

    def write_row(self, datos):
        with open(self.name_file, 'a') as csv_file:
            writer = csv.DictWriter(csv_file, fieldnames = self.fieldnames)
            if isinstance (datos, dict):
                try:
                    writer.writeheader()
                    writer.writerow(datos)
                except:
                    print("No tiene las keys correctas")
                    return False
                else:
                    return True
            else:
                print("No es un dict")
                return False


mi_tabla = dataClients(file_name = "Tabla.csv")
dato = {"id" : '0001', 'nombre' : 'platano', 'cantidad' : 34, 'precio' : 2000}

validar = mi_tabla.write_row(dato)

print(validar)