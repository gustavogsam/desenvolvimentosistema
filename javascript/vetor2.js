const usuarios = [
    { nome: "Alice", idade: 25 },
    { nome: "Bob", idade: 30 },
    { nome: "Charlie", idade: 35 }
];

console.log('percorrer a lista de usuários:');
usuarios.forEach((u) => 
    console.log(`Nome: ${u.nome} tem Idade: ${u.idade}`)
);

console.log('\n filtrando usuários com idade maior que 18:');
const filtrados = usuarios.filter(u => u.idade > 18);
filtrados.forEach(u =>
    console.log(`Nome: ${u.nome} tem Idade: ${u.idade}`)
);

console.log('\n retornando apenas os nomes dos usuários:');
const nomes = usuarios.map(u => u.nome);
nomes.forEach((nome,index) =>
console.log(`${++index}º nome: ${nome}`)
);

console.log('\n encontrando um usuário pelo nome:');
const encontrado = usuarios.find(u => u.nome === "Bob");
console.log(encontrado)
console.log`Nome: ${encontrado.nome} tem Idade: ${encontrado.idade}`

console.log('\n somando todas as idades dos usuários:');
const totalIdade = usuarios.reduce((soma, u) => soma + u.idade, 0);
console.log(`Soma total das idades: ${totalIdade}`);
