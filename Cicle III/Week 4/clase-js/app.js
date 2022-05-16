// Eventos

const btn = document.getElementById('btn')
console.log(btn)
console.dir(btn)

// Todas las propiedades que empiecen con on son
// eventos
// onclick
// argumento e de event

function evento(e){
    console.log('Entro')
    console.log(e)
    console.log(e.target)
}

// Adicionar eventos

// objeto.addEventListener('evento', function)
// evento - nombre del evento sin el on

btn.addEventListener('click', evento)
btn.addEventListener('click', (e)=>{
    console.log('Entro')
    console.log(e)
    console.log(e.target)
})

// Tipos de eventos

/*

Mouse 'click'
Teclado 'keyup'
formulario 
    'submit' - cuando envio el formulario
    'change' - cuando un valor de un input
    
window
    'resize' - redimensionar la ventana
    'scroll' - cuando hacemos scroll
    'DOMContentLoad' - cuando se ha renderizado
    'load' - cuando se carga la pagina completa

*/

// window.addEventListener('resize', (e)=>{
//     console.log(e)
// })

// Target es el elemento que disparo el evento
// e.preventDefault() - no se ejecute el comportamiento
// por defecto

const anchorTime = document.getElementById('tiempo')
anchorTime.addEventListener('click', (e)=>{
    console.log(e)
    e.preventDefault()
})

function validar(){
    const nombre = document.getElementById('txtNombre').value
    const apellido = document.getElementById('txtApellido').value

    if(nombre.lenght === 0){
        console.error('es necesario enviar nombre')
        return false
    }

    if(apellido.lenght === 0){
        console.error('es necesario enviar apellido')
        return false
    }

    return true

}

const formulario = document.getElementById('form')

formulario.addEventListener('submit', (e)=> {
    
    e.preventDefault()

    const nombre = document.getElementById('txtNombre').value
    const apellido = document.getElementById('txtApellido').value

    if(nombre.lenght === 0){
        console.error('es necesario enviar nombre')
        
    }

    if(apellido.lenght === 0){
        console.error('es necesario enviar apellido')
        
    }
})