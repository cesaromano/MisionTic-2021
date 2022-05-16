users = {}

while True:

	option = int(input("\n 1. Ingresar usuario \n 2. Ver usuario \n 3. Ver todos los"
		"usuarios \n 4. Salir \n\n Selecciona alguna de las anteriores"
		" opciones: "))

	if option == 1:

		while True:

			user = input("\nInserta un nombre de usuario: ")

			if user in users:

				print("\nEste nombre ya esta incluido")

			else:

				age = input("\nInserte edad del usuario: ")
				users[user] = age

				print(f"\n{user} tiene {age} años")

				break

	elif option == 2:

		while True:

			see_user = input("\nIngresa el nombre del usuario que deseas"
			" consultar: ")

			if see_user in users:

				see_age = users[see_user]

				#information = see_user
				print(f"\n{see_user} tiene {see_age} años")
				break

			else:
				print("\nNo existe informacion del usuario")
			

	elif option == 3:

			if users:

				for user in users:

					get_age = users[user]
					print(f"\n{user} tiene {get_age}")

			else:

				print("\nAun no hay usuarios")

	elif option == 4:

		break