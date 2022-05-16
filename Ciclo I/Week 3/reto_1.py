from vector import vector
import random

n = random.randint(5, 10)

vec_org18 = [0] * (n + 1)


for i in range(1, n + 1):#
        vec_org18[i] = random.randint(1, 9)

vec_org18[0] = n

vec_mod18 = [0] * (n + 1)

for i in range(0, n + 1):#
        vec_mod18[i] = vec_org18[i]

for i in range(1, n):

	s = 0
	for j in range(i, n + 1):

		s = s + vec_org18[j]

	vec_mod18[i] = s

print(vec_org18)
print(vec_mod18)