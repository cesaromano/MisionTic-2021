#NO ELIMINAR LAS SIGUIENTES IMPORTACIONES, sirven para probar tu código en consola, y el funcionamiento de la clase cliente
from pruebas import pruebas_codigo_estudiante
from cliente import cliente
"""NOTAS: 
    -PARA ESTE RETO PUEDES PROBAR TU PROGRAMA, DANDO CLICK EN LA NAVE ESPACIAL
    -LA CONSOLA TE DARÁ INSTRUCCIONES SI PUEDES EVALUAR O NO TU CÓDIGO
"""


"""Inicio espacio para programar funciones propias"""
#En este espacio podrás programar las funciones que deseas usar en la función solución (ES OPCIONAL



    
"""Fin espacio para programar funciones propias"""

def sede_bancaria(cola_general):
    #ESTA ES LA FUNCIÓN A LA QUE LE DEBES GARANTIZAR LOS RETORNOS REQUERIDOS EN EL ENUNCIADO.
    
    cola_caja = []
    cola_info = []
    suma_retiros = 0
    suma_consignaciones = 0
    edad_minima_retiro = 200
    edad_minima_info = 200
    edad_minima_consignacion = 200

    for each in cola_general:

        if each.fila_interes == "caja":
            cola_caja.append(each.nombre)
            if each.transaccion == "retirar":
                if each.dinero_cuenta_bancaria < each.cantidad_retirar:
                    suma_retiros += each.dinero_cuenta_bancaria
                else:
                    suma_retiros += each.cantidad_retirar
                if each.edad <= edad_minima_retiro:
                    edad_minima_retiro = each.edad
                else:
                    pass
            else:
                suma_consignaciones += each.cantidad_consignar
                if each.edad <= edad_minima_consignacion:
                    edad_minima_consignacion = each.edad
                else:
                    pass

        else:
            cola_info.append(each.nombre)
            if each.edad <= edad_minima_info:
                edad_minima_info = each.edad
            else:
                pass
                
    if edad_minima_retiro == 200:
        edad_minima_retiro = -1
    else:
        pass

    if edad_minima_info == 200:
        edad_minima_info = -1
    else:
        pass

    if edad_minima_consignacion == 200:
        edad_minima_consignacion = -1
    else:
        pass    
    
    return cola_caja, cola_info, suma_retiros, suma_consignaciones, edad_minima_retiro, edad_minima_info, edad_minima_consignacion

"""
NO PEDIR DATOS CON LA FUNCIÓN input(), NO COLOCAR CÓDIGO FUERA DE LAS FUNCIONES QUE USTED CREE
Esta línea de código que sigue, permite probar si su ejercicio es correcto
Por favor NO ELIMINARLA, NO MODIFICARLA
"""
pruebas_codigo_estudiante(sede_bancaria)