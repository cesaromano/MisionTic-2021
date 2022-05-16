"""Diseñar un juego donde se genere un numero aleatorio del 1 al 20,
y el usuario tenga 3 oportunidades para adivinarlo. En cada intento
se debe indicar si el numero ingresado es mayor o menor al numero
aleatorio.

#Ciclo while

import random

rand_num = random.randint(1, 20)
print(rand_num)
cont = 0
while cont < 3:
	num = int(input(f"Adivina el numero, tienes {3-cont} intentos: "))

	if num == rand_num:
		print("Felicidades adivinaste el numero!")
		break
#		cont = 3

	else:
		cont = cont + 1
		if num > rand_num:
			print("Casi! el numero que buscamos es menor que este")

		else:
			print("Casi! el numero que buscamos es mayor que este")

if num != rand_num:
	print("No te desanimes, sigue intentando!")
"""
#Ciclo for

import random

num_ran = random.randint(1,20)

print(num_ran)

for i in range(1,4):

    num1=int(input("Oportunidad %s. Ingrese número %s: "%(i,i)))

    if (num1==num_ran):
        print("Has adivinado el número")
        break
    elif(num1>num_ran):
        print("El número ingresado es mayor")
    else: 
        print("El número ingresado es menor")