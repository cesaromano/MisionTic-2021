// Seleccion de elementos HTML

// Seleccion por ID
const titulo = document.getElementById('title')
// console.log(titulo)

// Seleccion por clase
const items = document.getElementsByClassName('list-group-item')
// console.log(items) //HTMLCollection
// console.log([...items]) //Arreglo

// Seleccion por clase
// . para clases
// #para id's
// const item = document.querySelector('div.row p')
// const item = document.querySelector('li')

// console.log(item)

// Varios elementos
// const itemsLi = document.querySelectorAll('li')
// console.log(itemsLi)
// console.log([...itemsLi])

const itemsLi = [...document.querySelectorAll('li')]

for(let index = 0; index <= itemsLi.length; ++index){
    const itemLi = itemsLi[index]
    if(index % 2 === 1){
        // itemLi.style.background = '#3f3f3f'
        // itemLi.style.color = 'white'
        itemLi.style.display = 'none'
        
    }
}
