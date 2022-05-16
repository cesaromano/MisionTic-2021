def average(list):
	counter = 0

	addition = 0

	for element in list:
		addition += element
		counter += 1

	average = addition / counter

	return average

result = average(list = [100, 200, 300, 400, 500, 600])
print(result)