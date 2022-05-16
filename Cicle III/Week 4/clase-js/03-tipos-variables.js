// Numericos

let numero1 = 50
let numero2 = 20
let numero3 = -5

let resultado;

// suma
resultado = numero1 + numero2
// resta
resultado = numero1 - numero2
// mult
resultado = numero1 * numero2
// division
resultado = numero1 / numero2
// smodulo
resultado = numero1 % numero2
//API MATH
resultado = Math.PI
// redondear
resultado = Math.round(2.4)
//Truncar
resultado = Math.trunc(2.6)
//valor absoluto
resultado = Math.abs(numero3)

//incrementos
resultado++
++resultado
//decrementos
resultado--
--resultado
console.log(resultado);
//Asignacion
resultado += 5
resultado -= 5
resultado *= 5
resultado /= 5

// Convertir a numero

numeroUno = 'a'
    const numeroDos = 5

    console.log(numeroUno)
    // console.log(typeof numeroUno)
    // console.log(typeof (numeroUno * 1))
    console.log(typeof +numeroUno)
    // console.log(numeroUno * 1)
    // console.log(typeof Number.parseInt(numeroUno))
    console.log(typeof numeroDos)

    console.log(numeroUno * numeroDos)

//Truthy y Falsy
//falsy, null, false, 0, undefined, NaN, '', ""
//Siempre van a dar un resultado falso

let carro;

if(carro){
    console.log('Valor Truthy')
}else{
    console.log('Valor Falsy')
}

let nombreAnimal = 'Gato';

// operador corto circuito o OR
let operador;

// operador = true || true
// operador = false || 25
// operador = '' || 25
operador = undefined || 'Perro'
console.log(operador)

// (cariable = izquierda || derecha)
// variable = (algun valor truthy no evalua la arte derecha y asigna el valor de la izquierda)
// variable = (algun valor Falsy asignar l valor de la derecha)

console.log(operador);

function sumar(numeroA, numeroB){
    console.log(numeroA + numeroB)
}

// sumar(2, 3)