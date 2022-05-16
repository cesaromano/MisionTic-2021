#crea vectores donde la poscion 0 guarda la longitud
"""
class vector(object):
	def __init__(self, n):
		self.n = n #n = tamaño del vector
		self.v = [0]*(n+1)


b = input("entre un número ")
c = input("entre otro número ")
a = int(input("entre un tercer número "))
d = int(input("entre un cuarto número "))

print(b+c, end="")
print(a+d)



a = b = c = d = 0

print(f"{a}, {b}, {c}, {d},")



nombre = 'Romano'

while nombre:
	print(nombre)
	break


num = int(input("Ingrese el numero del que desea saber la tabla: "))

counter = 0

while counter < num:
	multiplication = num * counter
	print(f"{num} x {counter} = {multiplication}")
	counter += 1

#Imprime hasta las tablas de multiplicar que se le indique

num = 5

counter_1 = 1

while counter_1 < num+1:

	counter_2 = 1

	print(f"\nTabla del {counter_1}\n")

	while counter_2 < 11:
		multiplication = counter_1 * counter_2
		print(f"{counter_1} x {counter_2} = {multiplication}")
		counter_2 += 1

	counter_1 += 1

"""