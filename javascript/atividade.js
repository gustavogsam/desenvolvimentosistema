const numero =[1, 2, 3, 4, 5];

const dobro = numero.map((lista) => lista * 2);
const par = numero.filter((lista) => lista % 2 === 0);
const total = numero.reduce((soma, atual) => soma + atual, 0);

console.log('Números dobrados:');
console.log(dobro);
console.log('Números pares:');
console.log(par);
console.log('Total de soma dos números:');
console.log(total);
