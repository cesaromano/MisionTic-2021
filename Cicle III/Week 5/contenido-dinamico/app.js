const usuarios = [
  {
    id: 1,
    name: 'Leanne Graham',
    username: 'Bret',
    email: 'Sincere@april.biz',
    address: {
      street: 'Kulas Light',
      suite: 'Apt. 556',
      city: 'Gwenborough',
      zipcode: '92998-3874',
      geo: {
        lat: '-37.3159',
        lng: '81.1496'
      }
    },
    phone: '1-770-736-8031 x56442',
    website: 'hildegard.org',
    company: {
      name: 'Romaguera-Crona',
      catchPhrase: 'Multi-layered client-server neural-net',
      bs: 'harness real-time e-markets'
    }
  },
  {
    id: 2,
    name: 'Ervin Howell',
    username: 'Antonette',
    email: 'Shanna@melissa.tv',
    address: {
      street: 'Victor Plains',
      suite: 'Suite 879',
      city: 'Wisokyburgh',
      zipcode: '90566-7771',
      geo: {
        lat: '-43.9509',
        lng: '-34.4618'
      }
    },
    phone: '010-692-6593 x09125',
    website: 'anastasia.net',
    company: {
      name: 'Deckow-Crist',
      catchPhrase: 'Proactive didactic contingency',
      bs: 'synergize scalable supply-chains'
    }
  },
  {
    id: 3,
    name: 'Clementine Bauch',
    username: 'Samantha',
    email: 'Nathan@yesenia.net',
    address: {
      street: 'Douglas Extension',
      suite: 'Suite 847',
      city: 'McKenziehaven',
      zipcode: '59590-4157',
      geo: {
        lat: '-68.6102',
        lng: '-47.0653'
      }
    },
    phone: '1-463-123-4447',
    website: 'ramiro.info',
    company: {
      name: 'Romaguera-Jacobson',
      catchPhrase: 'Face to face bifurcated interface',
      bs: 'e-enable strategic applications'
    }
  }
];

const mutantes = {
  "Kub7fxlcNOSk3EIimak": {
    nombre: 'Doctor Strange',
    poder: 'magia'
  },
  "Kub7heZeVvFqpk7oWjF": {
    nombre: 'Wolverine',
    poder: 'capacidad de recuperarse de lesiones corporales'
  },
  "Kub7jBZKZsjDL0gE7Yu": {
    nombre: 'Hulk',
    poder: 'Fuerza Sobrehumana'
  },
  "Kub7kHlFpebGjeGd9v6": {
    nombre: 'Profesor X',
    poder: 'Telepatía'
  },
  "Kub7lXsmPPb870NOW6n": {
    nombre: 'Jean Grey',
    poder: 'Telekinesis'
  },
}

const BbuscarHeroe(id, callback)=>{
  const heroe = mutantes[id]
  callback(heroe)
}

const idHero = 'Kub7fxlcNOSk3EIimak'

BbuscarHeroe(idHero, (h)=>{
  console.log(h)
})