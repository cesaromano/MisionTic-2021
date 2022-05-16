// Arreglos
// Muy utilizado

// const sumar = (a, b) => a+b

let arreglo = [12, 2, 4, 6, 7]
// let arreglo = [12, 2, 4, 6, 7, {nombre: 'pedro'}, sumar]

// const arregloDos = new Array()
// const arregloTres = new Array(10)
// const arregloCuatro = []

// console.log(arregloDos)
// console.log(arregloTres)
// console.log(arreglo)

// Adicionar elementos en la ultima posicion
// console.log('Arreglo Inicial: ', arreglo)
// arreglo.push(100)
// console.log('Arreglo Final: ', arreglo)

// Adicionar elementos al inicio del arreglo
// console.log('Arreglo Inicial: ', arreglo)
// arreglo.unshift(100)
// console.log('Arreglo Final: ', arreglo)

// Remover ultimo elemento
// console.log('Arreglo Inicial: ', arreglo)
// const eliminado = arreglo.pop()
// console.log('Arreglo Final: ', arreglo)
// console.log(eliminado)

// Remover primer elemento del arreglo
// console.log('Arreglo Inicial: ', arreglo)
// const elemento = arreglo.shift()
// console.log(elemento)
// console.log('Arreglo Final: ', arreglo)

// Asignacion por referencia

// const arregloUno = [1, 2, 3, 4]
// const arregloDos = arregloUno

// console.log('Arreglo Uno', arregloUno)
// console.log('Arreglo Dos', arregloDos)
// arregloUno.push(50)
// console.log('Arreglo Uno', arregloUno)
// console.log('Arreglo Dos', arregloDos)

// Operador Spread
// Diferencias objetos refenciados con
// ...

// const arregloUno = [1, 2, 3, 4]
// const arregloDos = [...arregloUno]

// console.log('Arreglo Uno', arregloUno)
// console.log('Arreglo Dos', arregloDos)
// arregloUno.push(50)
// console.log('Arreglo Uno', arregloUno)
// console.log('Arreglo Dos', arregloDos)

// Propiedades
//  Tamaño
// console.log(arreglo.length)

// Contenido arreglo
// console.log(arreglo[1])

// Invertir arreglo
// console.log(arreglo)
// console.log(arreglo.reverse())

// Ordenamiento

const arregloColores = ['Verde', 'Azul', 'Cafe', 'Rojo']
console.log(arregloColores.sort())
// En este caso arregla de acuerdo a la posicion del numero
const arregloNumeros = [3, 8, 2, 4, 1, 0, 10, 5]
// console.log(arregloNumeros.sort())

// Ordenamiento numeros
// (a, b)
// a => es menor que b return -1
// a => es mayor que b return 1
// a => es igual que b return 0

// Forma uno
// const nuevoArreglo = arregloNumeros.sort(function (a, b){
//     return a-b
// })

// const nuevoArreglo = arregloNumeros.sort(function (a, b){
//     return b-a
// })

// Forma dos
// const nuevoArreglo = arregloNumeros.sort(ordenamiento)
// function ordenamiento (a, b){
//     return a - b
// }

// Forma tres
const nuevoArreglo = arregloNumeros.sort((a, b) => a - b)

// console.log(arregloNumeros)
// console.log(nuevoArreglo)

// FOrma uno
// for(let indice = 0; indice <= arregloNumeros.length; indice++){
//     console.log(arregloNumeros[indice])
// }

// Forma dos
// for(let numero of arregloNumeros){
//     console.log(numero)
// }

// Forma tres
const arregloFn = arregloNumeros.forEach(function(numero, index, array){
    // console.log(numero)
    // console.log(index)
    // console.log(array)
    return numero
})

console.log(arregloFn)

// Transformacion de datos

// const arregloFinal = arregloNumeros.map(function (numero){
//     // console.log(numero)
//     // return numero
//     // return numero * 2
//     return `Numero: ${numero * 2}`
// })


// Forma dos
// const arregloFinal = arregloNumeros.map( (numero) => `Numero: ${numero * 2}`)


// Callback, hace cambios al arreglo pero
// lo devuelve igual
const transformacion = (numero) => `Numero: ${numero * 2}`


// Forma tres
const arregloFinal = arregloNumeros.map(transformacion)


// console.log(arregloNumeros)
// console.log(arregloFinal)

// Filtrar elementos de un arreglo

// const elemento = arregloNumeros.filter(function(elemento){
//     return elemento > 4
// })

// console.log(arregloNumeros)
// console.log(arregloFinal)

// Retorna un elemento
// const elemento = arregloNumeros.find(function(elemento){
//     return elemento === 11
// })

// console.log(arregloNumeros)
// console.log(elemento)

// FindIndex retorna la posicion de un elemento
// En el arreglo
// const elemento = arregloNumeros.findIndex(function(elemento){
//     return elemento === 10
// })

// console.log(arregloNumeros)
// console.log(elemento)

// Convertir arreglo en String

// const texto = arregloNumeros.join('|')
// console.log(arregloNumeros)
// console.log(texto)

// Ejercicio
// Tengo un texto escribalo al revez

// const texto = 'Hola'
// const arregloTexto = texto.split('')
// console.log(arregloTexto)
// Ordenar un arreglo al revez
// console.log(arregloTexto.reverse())
// const textoFinal = arregloTexto.join('')
// console.log(textoFinal)

// Resumido

// const resultado = texto.split('').reverse().join('')
// console.log(resultado)

// console.log(arregloNumeros)
// Splice
// Primera posicion indice, segunda posicion
// cantidad de elementos que deseo extraer
// console.log(arregloNumeros.splice(2, 2))
// console.log(arregloNumeros)

// suprimir

// reemplazar
// introduce los elementos apartir del 3er parametro
// console.log(arregloNumeros.splice(1, 1, '10', 'Hola'))
// console.log(arregloNumeros)

// Insertar
// console.log(arregloNumeros.splice(1, 0, '10', 'Hola'))
// console.log(arregloNumeros)

// console.log(arregloNumeros)
// Slice --> retorna un arreglo nuevo y no modifica el arreglo incial
// const arregloResultante = arregloNumeros.slice() //Copia sin referencia del archivo
// const arregloResultante = arregloNumeros.slice(2) // si le pasamos un parametro elimina hasta el indice indicado
// const arregloResultante = arregloNumeros.slice(arregloNumeros.lenght) //Arreglo vacio
const arregloResultante = arregloNumeros.slice(1, 3) //Desde la posicion 1 hasta la posicion 3

console.log(arregloResultante)
console.log(arregloNumeros)