// Operadores

// Aritmeticos +, -, /, *, % (son binarios
// por que necesitan dos elementos para poderse
// operar)

// Incremento y decremento
// pre ++numero, --numero
// post numero++, numero--

// De comparacion
// <> >= <= != !

// Para los primitivos
// == y ===

// === Igualdad estricta (valida tipo y valor)

// console.log(5 === 5) //true
// console.log('Hola Mundo' === 'Hola Mundo') // true

// console.log(7 === '7') // false
// console.log('perro' === 'gato') //false
// console.log(false === 0) //false

// == igualdad flexible ó igualdad debil

// console.log(5 == 5) //true
// console.log('Hola Mundo' == 'Hola Mundo') // true

// console.log(7 == '7') // true
// console.log('perro' == 'gato') //false
// console.log(false == 0) //true

console.log(7 !== '7') //true
console.log(7 != '7') //false
console.log(7 == '7') //true

// REeglas

// 1. falsy values
// console.log(false == 0) //true
// console.log("" == 0) //true
// console.log("   " == 0) //true
// console.log(false == "")//true

// 2. null, undefined
// console.log(null == undefined) //true
// console.log(undefined == undefined) //true
// console.log(undefined == undefined) //true

// NaN - false (not a number)

console.log(NaN == null)
console.log(NaN == undefined)

// function nombreMayusculas(nombre){
//     console.log(nombre)
//     if(!nombre){
//         console.log('Debe enviar el nombre')
//         return
//     }
//     return nombre.toUpperCase()
// }