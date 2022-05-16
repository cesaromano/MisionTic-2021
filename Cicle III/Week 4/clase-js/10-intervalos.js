// Intervalos

// setTimeOut

// setTimeout(function, tiempo)
// setTimeout(function(){
//     console.log('Hola Mundo')
// }, 6000)


// Interval
// setInterval(function, tiempo)

let indice = 0

const intervalo = setInterval(function(){
    console.log('Entro...!')
    console.log('Otra Vez')
    console.log(`Indice: ${indice}`)
    if(indice === 5){
        clearInterval(intervalo)
    }
    indice++
}, 3000)