// Manipulacion String



// console.log(texto)

// Concatenacion
// const nombre = 'Pedro'
// const apellido = 'Picapiedra'
// const nombreCompleto = nombre + ' ' + apellido
// console.log(nombreCompleto)

// Template String
const nombre = 'Pedro'
const apellido = 'Picapiedra'
// comillas francesas o backtips ``
const nombreCompleto = `${nombre} ${apellido}`
// console.log(nombreCompleto)
// allosw mats operations
// console.log(`${ 1+1 }`)

function saludar(nombre){
    return `Hola: ${nombre} `
}

// console.log(`${saludar(nombreCompleto)}, bienvenido...`)

const numeroUno = 2
const numeroDos = 3
// console.log(`${numeroUno + numeroDos}`)

const texto = "Hola Mundo Hola, como estas Mundo"

// Tamaño string
// console.log(texto.length)

// console.log(texto.replace('Hola', 'Adios'))

// Reemplazar todas las coincidencias
console.log(texto.replaceAll('Hola', 'Adios'))

// Separar areglo
// Returns each type
// console.log(texto.split(''))
// Returns each word
// console.log(texto.split(''))

// Chaining
// let resultadoReemplazo = texto.replaceAll('Hola', 'Adios')
// resultadoReemplazo = texto.replaceAll('Mundo', 'Planeta')
let resultadoReemplazo = texto.replaceAll('Hola', 'Adios')
                              .replaceAll('Mundo', 'Planeta')
                              .split(' ')
console.log(resultadoReemplazo)

// Extraer
// primer parametro, desde la psocion
// que se desea traer
// segundo parametro, la cantidad de posiciones
// que se desea traer
// console.log(texto.substring(5, 10))
// valores negativos de atras hacia
// adelante
// console.log(texto.substring(5, -3))

// buscar indice de adelante hacia atras
// console.log(texto.indexOf('estas'))
// buscar indice de atras hacia adelante
// console.log(texto.lastIndexOf('Hola'))
// ver si se incluye, retorna True
// console.log(texto.includes('Hola'))
// console.table(texto.split(''))  
// determinar si alguna palabra
//  incluye en el string iniciando (case sensitive)
console.log(texto.startsWith('ho'))
// determinar si alguna palabra
//  incluye en el string terminando (case sensitive)
console.log(texto.endsWith('ho'))

// Minusculas
console.log(texto.toLocaleLowerCase())

// Mayusculas
console.log(texto.toLocaleUpperCase())

texto.toLowerCase()