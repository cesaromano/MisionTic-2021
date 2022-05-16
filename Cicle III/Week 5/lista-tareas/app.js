const firebaseConfig = {
    apiKey: "AIzaSyBQMAMiI2fqtgDxRLRbuZwsGFDWX5iCkyc",
    authDomain: "lista-tareas-f0809.firebaseapp.com",
    databaseURL: "https://lista-tareas-f0809-default-rtdb.firebaseio.com",
    projectId: "lista-tareas-f0809",
    storageBucket: "lista-tareas-f0809.appspot.com",
    messagingSenderId: "557937909411",
    appId: "1:557937909411:web:7a5bcf3f9d1b2a509b2916",
    measurementId: "G-NZJ49F6HHG"
  };
  
  // Initialize Firebase
firebase.initializeApp(firebaseConfig);

//   Declarar variables globales de la app
const auth = firebase.auth()
const proveedor = new firebase.auth.GoogleAuthProvider()
const database = firebase.firestore()
let usuarioActual
let listaTareas = []

// Variables DOM
const btnLogin = document.getElementById('button-login')
const btnLogOut = document.getElementById('button-logout')
const formulario = document.getElementById('todo-form')
const input = document.getElementById('user-info')
const contenedorTareas = document.getElementById('todos-container')


async function login(){
    try{
        const respuesta = await auth.signInWithPopup(proveedor)
        console.log(respuesta.user.displayName)
        usuarioActual = respuesta.user
        
        listaTareas = await leerTareas()

            pintarBrowser(listaTareas)

}catch (error){
        console.error(error)
        throw new Error(error)
    }
}

function logOut(){
    auth.signOut()
}

async function adicionarTarea(texto){
    const tarea = {
        id: uuid.v4,
        tarea: texto,
        completada: false,
        user: usuarioActual.displayName
    }
    const respuesta = await guardarTarea(tarea)
    console.log(respuesta)
    input.value = ''
    listaTareas = await leerTareas()
    pintarBrowser(listaTareas)
}

function pintarBrowser(t){
    // Contenedor tareas
    let contenidoHtml = ""
    tareas.forEach((t) =>{
        contenidoHtml += `
        <li>${t.tarea}</li>
        <br />
        `
    })
    contenedorTareas.innerHTML = contenidoHtml
}


// Base de datos
async function guardarTarea(task){
    try{
        const respuesta = await database.collection('lista-tareas').add(task)
        return respuesta
    }catch(error){
        console.error(error)
        throw new Error(error)
    }
}

async function leerTareas(){
    const tareas = []
    const respuesta = await database.collection('lista-tareas').get()
    respuesta.forEach(function(item){
        console.log(item.data())
        tareas.push(item.data())
    })
    return tareas
}

// Eventos
// Login
btnLogin.addEventListener('click', (e)=>{
    login()
    // console.dir(btnLogin)
    btnLogin.classList.add('hidden') 
    btnLogOut.classList.remove('hidden')
    formulario.classList.remove('hidden') 


})

// Logout
btnLogOut.addEventListener('click', (e)=>{
    logOut()
    btnLogin.classList.remove('hidden') 
    btnLogOut.classList.add('hidden')
    formulario.classList.add('hidden') 
})

formulario.addEventListener('submit', ()=>{
    e.preventDefault()
    console.log(input.value)
    const texto = input.value
    if(texto !== ''){
        adicionarTarea(texto)
    }
})