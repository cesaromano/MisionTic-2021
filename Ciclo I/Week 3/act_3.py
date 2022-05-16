"""
coordinate_a = (1, 4)
coordinate_b = (1, 1)
coordinate_c = (4, 3)

my_coordinate = []
coordinate_x = my_coordinate.append(
	int(input("Ingresa la coordenada x de tu domicilio: ")))
coordinate_y = my_coordinate.append(
	int(input("Ingresa la coordenada x de tu domicilio: ")))
"""

#Definiendo las coordenadas de las sedes

x_axis_a = 1
y_axis_a = 4

x_axis_b = 1
y_axis_b = 1

x_axis_c = 4
y_axis_c = 3

#Agregando las coordenadas ubicacion

my_coordinate_x = int(input("Ingresa la coordenada x de tu domicilio: "))
my_coordinate_y = int(input("Ingresa la coordenada y de tu domicilio: "))

#Resta de coordenadas de ubicacion con coordenadas de sedes

subs_x_a =  x_axis_a - my_coordinate_x
subs_y_a =  y_axis_a - my_coordinate_y

subs_x_b =  x_axis_b - my_coordinate_x
subs_y_b =  y_axis_b - my_coordinate_y

subs_x_c =  x_axis_c - my_coordinate_x
subs_y_c =  y_axis_c - my_coordinate_y

#Magnitud de la resta

mag_a = abs(subs_x_a) + abs(subs_y_a)
mag_b = abs(subs_x_b) + abs(subs_y_b)
mag_c = abs(subs_x_c) + abs(subs_y_c)

print(mag_a, mag_b, mag_c)

#Determinando menor distancia

if (mag_a < mag_b):
	if (mag_a < mag_c):
		print("La sede mas cercana es la A")
else:
	if (mag_b < mag_c):
		print("La sede mas cercana es la B")
	else:
		print("La sede mas cercana es la C")

#Distancias iguales

if (mag_a == mag_b):
	print("Las sedes mas cercanas son la A y B")
if (mag_a == mag_c):
	print("Las sedes mas cercanas son la A y C")
if (mag_b == mag_c):
	print("Las sedes mas cercanas son la B y C")
if (mag_a == mag_b == mag_c):
	print("Las sedes mas cercanas son la A, B y C")