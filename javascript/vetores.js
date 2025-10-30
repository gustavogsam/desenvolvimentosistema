
const listaNomes = ['Ana', 'Bruno', 'Carlos', 'Diana'];

console.log("Todos os nomes na lista:");
console.log(listaNomes);

console.log("\n apenas o primeiro nome" )
console.log(listaNomes[0]);

console.log("\n adicionando mais um nome à lista:" );
listaNomes.push('Eduardo');
console.log(listaNomes);

console.log("\n removendo o primeiro nome da lista:" );
listaNomes.shift();
console.log(listaNomes);

console.log("\n removendo o último nome da lista:");
listaNomes.pop();
console.log(listaNomes);