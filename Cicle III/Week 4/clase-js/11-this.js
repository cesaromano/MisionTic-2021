// MDN JavaScript documentation
// This, contexto en el que estoy
// this y window es lo mismo
// en wondow esta todo el appi del 
// navegador

console.log(`Global: `, this)
// console.log(window)
// console.log(window === this)

// this dentro de un objeto hace referencia
// al mismo objeto
const personaje = {
    nombre: 'Pedro',
    apellido: 'Picapiedra',
    saludar(){
        console.log(`Global: `, this)
    }
}

personaje.saludar()

// console.log(personaje)

function probarThis(){
    console.log(`Funcion: `, this)
}

probarThis()

// Lexical this

// const Persona = function(){
//     this.nombre = ''
//     this.apellido = ''
//     this.edad = 0
//     console.log('Estado this', this)
//     const self = this
//     setInterval(function(){
//         console.log('Estado Interval this: ', this)
//         console.log('Estado Interval this: ', self)
//         // this.edad++
//         self.edad++
//     }, 1000)
// }

// Solucion

const Persona = function(){
    this.nombre = ''
    this.apellido = ''
    this.edad = 0
    console.log('Estado this', this)
    setInterval(()=>{
        console.log('Estado Interval this: ', this)
        console.log('Estado Interval this: ', self)
        this.edad++
    }, 1000)
}

// const pedro = new Persona()
// console.log(pedro)