numA = int(input("Numero A: "))
numB = int(input("Numero B: "))
numC = int(input("Numero C: "))

if (numA > numB):
	if (numA > numC):
		print("El numero mayor es %s"%(numA))
else:
	if (numB > numC):
		print("El numero mayor es %s"%(numB))
	else:
		print("El numero mayor es %s"%(numC))