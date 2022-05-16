nums = int(input("Ingrese un numero entero: "))

for num in range(1, nums+1):
	fila = ""
	for add in range(num):
		fila += "@"

	print(fila)