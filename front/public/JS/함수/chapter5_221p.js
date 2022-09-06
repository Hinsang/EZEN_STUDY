// 매개변수에 print 함수 전달
function callThreeTimes(callback) {
	for(let i = 0 ; i<3 ; i++) {
		callback(i)
	}
}

function print (i) {
	console.log(`${i}번째 함수 호출`)
}

callThreeTimes(print)
console.log(typeof(print))


function callThreeTimes2(callback) {
	for(let i = 0 ; i<3 ; i++) {
		callback(i)
	}
}

callThreeTimes2(
	function(i) {
		console.log(`${i}번째 함수 호출`)
	}
)

// forEach() 내장 함수
let numbers = [273, 52, 103, 32, 57]

numbers.forEach(
	function(value, index, array) {
		console.log(`${index}번째 요소 : ${value}`)
	}
)

// forEach() 안 쓸때
function for_print(numbers){
	for(let i = 0 ; i<numbers.length ; i++){
		console.log(`${i}번째 요소: ${numbers[i]}`)
	}
}
for_print(numbers)

// map() 함수
numbers = numbers.map(function(value, index, array) {
	return value*value
})

console.log('map 실행 결과 : ' + numbers)
numbers.forEach(console.log)

// filter() 함수
const evenNumbers = numbers.filter(function (value) {
	return value % 2 == 0
})

console.log(`원래 배열: ${numbers}`)
console.log(`짝수만 추출: ${evenNumbers}`)


// 유지보수의 편의성
// 함수 사용할때
//function plus(a,b) {
//	result = (a+b) * 2
//	return console.log(result)
//}

//plus(1,2)
//plus(2,3)
//
//// 함수 사용 안할때
//let result3 = (1+2) * 2
//console.log(result3)
//
//let result4 = (2+3) * 2
//console.log(result4)
//

// 함수 쓸때
//function min(items){
//	let minvalue = items[0]
//	for(let i of items) {
//		if(minvalue>i) {
//			minvalue = i
//		}
//	}
//	console.log(minvalue)
//}
//min([10,2,3,4])
//

// 함수 안쓸때
let min = [10,8,3,4]
let minvalue = min[0]

for(let i of min) {
	if(minvalue>i) {
		minvalue = i
	}
}
console.log(minvalue)

//if(min[0] < min[1]) {
//	minvalue = min[0]
//}
//if(min[1] < min[2]) {
//	minvalue = min[1]
//}
//if(min[2] < min[3]) {
//	minvalue = min[2]
//}
//if(min[3] < min[4]) {
//	minvalue = min[3]
//}
//console.log(minvalue)





























