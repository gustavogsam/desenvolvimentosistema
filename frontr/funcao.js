

function somar(a,b){
    return a + b
}

let valor =somar(2,3)

console.log(`soma: ${valor}`)
////////////////////////////////////////
function subtrair(a,b){
    return a - b
}

valor =subtrair(2,3)

console.log(`subracao: ${valor}`)
////////////////////////////////////////////
function multiplicar(a,b){
    return a * b
}

valor=multiplicar(2,3)

console.log(`multicacao: ${valor}`)

/////////////////////////////////////////////////////
function dividir(a,b){
    if (b === 0) {
    throw new Error("O divisor não pode ser zero."); // Lança um erro
  }
    
    return a / b
}

   
valor=dividir(2,0)

console.log(`divisao: ${valor}`)

    
