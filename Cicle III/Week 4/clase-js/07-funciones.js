// Funciones

/*

Un bloque de codigo reutilizable

function nombreFuncion(parametro1, parametro 2){
    // codigo
}

Tipo funciones
// Funcion por delcaracion

function funcionPorDefinicion(parametros){

}

// Funcion por expresion
const funcionPorExpresion = funcion (parametros){
    // Cuerpo
}

*/

function primeraFuncion(a){
    console.log(a)
}

// primeraFuncion(2);

function suma(a, b){
    console.log(a+b)
}

// suma(2, 3)

function nombreCompleto(nombre, apellido="No tiene"){
    console.log(`${nombre} ${apellido}`)
}

// Funciona sin importar si hay o no parametros

nombreCompleto('Pedro')

// Los valores por defecto son utiles para
// evitar fallos por parametros
// no dados
function multiplicacion(numeroA, numeroB=0){
    console.log(numeroA * numeroB)
}

// multiplicacion(4)
multiplicacion(4, 4)

// Devolver valores
function numeroAleatorio(){
    return Math.round(Math.random()*30)
    // si encuentra un return la funcion se acaba
    const nombre = 'Pedro'
}

// console.log(numeroAleatorio())

const numero = numeroAleatorio()
// console.log(numero)

function sumar(){
    console.log('Hola mundo')
    console.log(arguments)

    const a = arguments[0]
    const b = arguments[1]

    console.log(a + b)
}

// sumar(3, 4)

// Funcion por definicion
// function saludar(nombre){
//     return `Hola ${nombre}`
// }

// Sobreescribir
// Se presta para errores

// saludar = true

// console.log(saludar)

// console.log(saludar('Pedro'))

// Funciones por epresion (es mejor utilizarlas asi
// para evitar sobreescritura)

// const saludar = function saludar(nombre){
//     return `Hola ${nombre}`
// }

// console.log(saludar('Pedro'))

// saludar = true

// console.log(saludar)

// Arrow Function
// Entiende que el return esta implicito
// por lo que no lo necesita
// si incluye corchetes, necesita return

const saludar = (nombre, apellido) => `Hola ${nombre} ${apellido}`
console.log(saludar('Pedro', 'Picapiedra'))

// Return implicito
// const getUser = () => {

//     return{
//         nombre: 'Pedro',
//         apellido: 'Picapiedra'
//     }

// }

const getUser = () => (

    {
        nombre: 'Pedro',
        apellido: 'Picapiedra'
    }

)

console.log(getUser())

