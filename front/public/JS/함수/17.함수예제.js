function 함수1() {
	alert('함수1 실행')
}

function 함수2(value) {
	alert('함수2 실행 매개변수: ' + value)
}

function 함수3(value1, value2) {
	alert('함수3 실행 매개변수: ' + value1 + value2)
	return value1 + value2
}

function 함수4() {
	alert('함수4 실행')
	return 10
}

함수1()
함수2( 50 )
let result = 함수( 3, 5 )
let result2 = 함수4()


function min(array) {
	let output = array[0]
	for( const item of array ) {
		if( output > item) { // 해당값이 output보다 작으면
			output = item	// output 해당 값으로 교체
		}
	}
	return output
}

const testArray = [52,273,32,103,275,24,57]
console.log(`${testArray}중에서`)
console.log(`최솟값 = ${ min(testArray) }`)




























