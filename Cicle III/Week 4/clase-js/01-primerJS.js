// ";" isn't mandatory
var nombre = prompt('Cual es tu nombre?')
console.log(nombre)
const div = document.getElementById("mensaje")
console.log(div)
//Interpreta el texto, independiente de que
//tenga etiquetas html
// div.innerText = nombre;
// div.textContent = nombre;
//permite extraccion de codigo, NO USAR
div.innerHTML = "<strong> Hola "+nombre+" bienvenido a nuestra pagina</strong>"

// HOISTING

// Ejemplo 1

//console.log(saludo)
//var saludo = 'Hola'

// Ejemplo 2

// var saludo;
// console.log(saludo)
// saludo = 'Hola'