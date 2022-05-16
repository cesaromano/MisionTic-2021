const divPiano = document.querySelector('div.piano')
// console.log(divPiano)

divPiano.addEventListener('click', (event) => {
    console.log(event)
    // forma 1
    // console.dir(event.target.dataset.tecla)
    // forma 2
    // console.dir(event.target.getAttribute('data-tecla'))

    const {tecla} = event.target.dataset

    if(tecla){
        console.log(tecla)

        const audio = document.createElement('audio')
        audio.type = `audio/wav`
        audio.src = `sonidos/${tecla}.wav`

        divPiano.appendChild(audio)
        audio.play()

        audio.addEventListener('ended', ()=>{
            audio.remove()
        })

        

    }

})