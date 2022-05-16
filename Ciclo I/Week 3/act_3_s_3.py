def sort(list):
	sorted_elements = []
	while True:
		if len(list) == 0:
			break

		smaller, position = find_smaller(list)
		sorted_elements.append(smaller)
		list.pop(position)
	return sorted_elements



def find_smaller(list):
	smaller = list[0]
	position = 0
	counter = 0
	for element in list:
		if element < smaller:
			smaller = element
			position = counter
		counter += 1

	return smaller, position

print(sort(list = [5, 1, 4, 2, 3]))