"""
file = open('datos.txt', 'r')
data = file.readline()
print(data)

file = open('datos.txt', 'r')
data = file.readlines()
print(data)

file = open('datos.txt', 'w')
file.write('MinTIC 2022')

file = open('datos.txt', 'a')
file.write('\nMinTIC 2022')
file.close()
"""

with open('datos.txt', 'r') as f:
    lectura = f.read()

print(lectura)