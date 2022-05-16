// Operador Nullish coalesh

const valorNull = null
const textoVacio = ''
const algunNumero = 42

const valorUno = valorNull ?? 'valor por defecto Uno'
const valorDos = textoVacio ?? 'valor por defecto Dos'
const valorTres = algunNumero ?? 0

console.log(valorNull)
console.log(textoVacio)
console.log(algunNumero)

// console.log(valorUno)
// console.log(valorDos)
// console.log(valorTres)

// Optional chaining ó elvis operator
// for multiple dimentions
// if there is no element in some dimention

const persona =
{   nombre: 'Pedro',
    apellido: 'Picapiedra'
}

// acceder a una propiedad
const nombre = persona.nombre
console.log(nombre)

// ? is used in case the element doesn't
// exist yet
const pais = persona?.['direccion']?.['pais']
// console.log(pais)

const personas = [
    persona
]

// console.log(personas[1]?.nombre)

// Asignacion Logica
// Asignacion && solo con valores Truthy

// let codigo = 20
// let nuevoCodigo = 50

// each time it evaluates, if truty, asign
// value, else not, don't evaluate 

// codigo &&= nuevoCodigo
// console.log(codigo)

// Asignacion || solo con valores Falsy

let codigo = undefined
let nuevoCodigo = 50

codigo ||= nuevoCodigo
console.log(codigo)

// Separadores numericos

const numeroGrande = 1_000_000_000
console.log(numeroGrande)