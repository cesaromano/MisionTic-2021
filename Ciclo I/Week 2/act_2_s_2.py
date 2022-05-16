"""

Diseñar un programa que encuentre el numero mayor y menor en una lista,
ademas de la posicion en la que fueron encontrados.

lista = [-3, 0, -100, 50, 89, 9, 1, 4, 45]

Mayor 89 posicion 4
Menor -100 posicion 2

"""

numbers = [-3, 0, -100, 50, 89, 9, 1, 4, 45]

reference_num = 0

numbers_ordered = []

for number in numbers:
	if number < reference_num:
		numbers_ordered.append(number)

print(f"El numero mayor {} se encuentra en la posicion {}")