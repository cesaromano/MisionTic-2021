import json

datos = {1 : 'Hola JSON'}

print(json.dumps(datos))

with open('datos.json', 'w') as fp:
    json.dump(datos, fp)

with open('datos.json', 'r') as fp:
    datos_2 = json.load(fp)

print(type(datos_2), datos_2)