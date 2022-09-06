let numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

//numbers.filter(function(value){
//	return value % 2 == 0
//})

let array1 = numbers.filter((value) => value % 2 ==0)
console.log('짝수 배열 : ' + array1)
let array2 = array1.map((value) => value * value)
console.log('짝수들의 제곱 : ' + array2)
array2.forEach((value) => console.log(value))

//numbers.filter((value) => value % 2 == 0)
//	.map((value) => value*value)
//	.forEach((value) => console.log(value))
//
//numbers.filter(function(value){
//	return value % 2 == 0
//}).map(function(value){
//	return value*value
//}).forEach(function(value){
//	console.log(value)
//})









































