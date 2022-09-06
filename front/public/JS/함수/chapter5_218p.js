function multiplyAll(a,b) {
	let result = 1
	for( let i=a ; i<=b; i++) {
		// result += i // 누적합계
		result *= i // 누적 곱
	}
	return result
}

console.log('모두 곱한 결과 : ' + multiplyAll(1,2))
console.log('모두 곱한 결과 : ' + multiplyAll(1,3))

// 최대값 구하기
const max2 = function(array) {
	let maxvalue = array[0]
	for(let i of array) {
		if(maxvalue < i) {maxvalue = i}
	}
	for(let i in array){array[i]}
	for(let i ; i<array.length ; i++){array[i]}
	return maxvalue
}
console.log('최대값 구하기 결과 : ' + max2([1,2,3,4]))

const max3 = function(array, ...array2) {
	
	alert('타입확인 : ' + typeof( array ))
	alert('타입확인 : ' + typeof( array2 ))

	let maxvalue = 0
	let items
	
	// 배열일때
	if(Array.isArray(array)) {
		maxvalue = array[0]
		items = array
	} else if (typeof(array) === 'number'){
		maxvalue = array
		items = array2
	}

//	if( typeof(array) == 'object' ) {
//		items = array
//	} else if (typeof(array2) != 'number') {
//		items= array2
//	}
	
	// 최대값 구하기 함수
	for(let i of items) {
		if(maxvalue < i) {maxvalue = i}
	}
//	for(let i in array){array[i]}
//	for(let i ; i<array.length ; i++){array[i]}
	return maxvalue
}
console.log('최대값 구하기 결과 : ' + max3([1,2,3,4]))
console.log('최대값 구하기 결과 : ' + max3(1,2,3,4))
