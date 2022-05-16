'use strict'
// Don't use var
var nombre = 'Pedro'

if(true){
    var color = "Negro"
}

// console.log(color)

nombre = 'Pedro'

// La unica forma de limitar el alcance
// o scope de una variable de var es
// dentro de una funcion 
function miFuncion(){
    var nombre = 'Pedro'
}

// console.log(nombre)

// let permite reasignar valor de la variable
// const solo para lectura

// Scope

var a = 'a'
let b = 'b'
const c = 'c'

// {
//     var a = 'AAA'
//     let b = 'BBB'
//     const c = 'CCC'
//     console.log('Escope en bloque: ', a, b, c)
// }

function functionScope(){
    {
    var a = 'AAA'
    let b = 'BBB'
    const c = 'CCC'
    // console.log('Escope function: ', a, b, c)
    }
}

functionScope()

// console.log('Escope Global: ', a, b, c)

// Var allows overide always, el ambito
// de var es muy amplio

// Es posible imprimir una variable let sin
// inicializarla

let variableLet = 'Verde';

// No posible imprimir una variable const sin
// inicializarla, debo asignarle un valor
const variableConst = 'Negro';


// console.log(variableLet)
// console.log(variableConst)

variableLet = 'Azul'
// const variableConst = 'Amarillo';

// console.log(variableLet)
// console.log(variableConst)

// HOISTING
// Toma todas las declaraciones de las
// varibles y las asigna
// en la parte superior del codigo

// Ejemplo 1

// console.log(saludo)
// var saludo = 'Hola'

// Ejemplo 2

var saludo
console.log(saludo)
saludo = 'Hola'

//Tipos de variables

//Booleans,
//null : valor nulo
//undefined : tipo de dato que no se le ha asignado ningun valor
//number
//String
//objetos coleccion de propiedades y propiedades
//tiene valores, y pueden tener funciones
//Bigint : numero largo

const nombre = 'Pedro'
const edad = 10
const esHumano = true
const diaCumpleaños = '10'

// console.log(typeof nombre)
// console.log(typeof edad)
// console.log(typeof esHumano)

// console.warn(nombre)
// console.error(nombre)
// console.log("Su nombre es " + nombre + " Y su edad es: " + edad * 5)
// console.log(nombre, edad, esHumano)

// console.log(diaCumpleaños);
// console.log(edad);

// Objeto literal
//const objeto = {
//   propiedad : valor //primitivos, objetos, funciones, arreglos
//    "1propiedad" : valor2
//}

//const persona = {}
const persona =
{   nombre: 'Pedro',
    apellido: 'Picapiedra',
    edad: 25,
    direccion : {
        pais: 'Colombia',
        ciudad: 'Medellin',
        edificio:{
            nombre: 'Uniantioquia',
            telefono: '222-3333'
        }
    }
}

//Acceso a elmentos con Notacion Punto
//Set
// persona.nickname = 'Spiderman'
//Get
// console.log(persona)

//Notacion de corchetes
//Set
// persona['nickname'] = 'Spiderman'
//Get
//console.log(persona['nickname'])

// const propiedad = 'nombre'
// console.log(persona[propiedad])

// function obtenerInformacion(props){
//     console.log(persona[props])
// }
// obtenerInformacion(propiedad)

// Desestructuracion
const nombrePersona = persona.nombre;
// const edificio = persona.direccion.edificio.nombre
// console.log(edificio);

const { nombre, edad, nickname='Spiderman' } = persona
console.log(nombre, edad, nickname);

const{
    direccion:{
        pais, ciudad, edificio
    }
} = persona
console.log(pais, ciudad, edificio)

// Paso de valores por valor

let a = 10;
let b = a;

console.log('El valor de a: ', a)
console.log('El valor de b: ', b)

a = 25;

console.log('El valor de a: ', a)
console.log('El valor de b: ', b)

// Paso de valores por referencia
const pedro = {
    nombre : 'Pedro',
    edad: 25
}

let luis

luis.nomre = pedro.nombre;
luis

console.log('Pedro: ', pedro);
console.log('Luis: ', luis);

console.log(typeof pedro)
console.log(typeof luis)

pedro.edad = 35
luis.nombre = 'luis'

console.log('Pedro: ', pedro);
console.log('Luis: ', luis);

// Operador Spread

// let luis = { ... pedro}

// console.log('Pedro: ', pedro);
// console.log('Luis: ', luis);

// console.log(typeof pedro)
// console.log(typeof luis)

// pedro.edad = 35
// luis.nombre = 'luis'

// console.log('Pedro: ', pedro);
// console.log('Luis: ', luis);