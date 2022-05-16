#word
from tkinter import filedialog as fd, scrolledtext
from tkinter import scrolledtext as sctx
from tkinter import INSERT
from tkinter import *

def buscar():
    file_name = fd.askopenfilename()
    with open(file_name) as f:
        datos = f.read()
    mostrar_hoja(datos)

def mostrar_hoja(datos):
    #hoja.delete(0, END), validar borrado del text
    hoja.insert(INSERT, datos)
    
def guardar():
    pass

root = Tk()
root.geometry('300x150')

b_load = Button(root, text = "load file", command = buscar)
b_load.pack(expand = True)

hoja = sctx.ScrolledText()
hoja.pack()

b_guardar = Button(root, text = "save", command = guardar)
b_guardar.pack()

root.mainloop()