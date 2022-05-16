from tkinter import ttk
from tkinter import *
from app_filtros import filtro

def filtrar():
    try:
        opcion = opciones_filtro.selection_get()
        valor = E_valor.get()
    except:
        return False
    else:
        mi_filtro = filtro(file_name = 'Productos.csv')
        tabla_filtrada = filtro.filtrar_por(registro = opcion, valor = valor)
        
        mostrar_tabla(filas = len(tabla_filtrada), tabla = tabla_filtrada)

def mostrar_tabla(filas, tabla_datos):
    for f in range(filas):
        for c in range(4):
            registro = Entry(tabla_datos)
            registro.grid(row = f, column = c, padx = 5)
            registro.insert(0, tabla_datos[f][keys[c]])

root = Tk()
root.title("FilterAPP")
root.geometry('300x200')

keys = ['id', 'nombre', 'cantidad', 'precio']

opciones_filtro = ttk.Combobox(root, state = 'readonly')
opciones_filtro.grid(row = 0, column = 0, padx = 5)
opciones_filtro['values'] = keys

B_filtrar = Button(root, text = 'Filtrar', command = filtrar)
B_filtrar.grid(row = 0, column = 1, padx = 5)

L_valor = Label(root, text = "Valor a filtrar")
L_valor.grid(row = 0, column = 2)


E_valor = Entry(root)
E_valor.grid(row = 0, column = 3, padx = 5)

tabla = Frame(root)
tabla.grid(row = 1, column = 0)

root.mainloop()