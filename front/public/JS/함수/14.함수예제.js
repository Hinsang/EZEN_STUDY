function isLeapYear(year) {
	return (year%4==0) && (year%100!=0) || (year % 400 == 0)
}

console.log(`2020년은 윤년일까? === ${isLeapYear(2020)}`)
console.log(`2010년은 윤년일까? === ${isLeapYear(2010)}`)
console.log(`2000년은 윤년일까? === ${isLeapYear(2000)}`)
console.log(`1900년은 윤년일까? === ${isLeapYear(1900)}`)

function 윤년버튼함수() {
	alert('버튼이 눌렸다.')
	let 연도 = Number(prompt('연도를 입력 : '))
	let 결과 = isLeapYear(연도)
	console.log('입력한 ' + 연도 + ' 는 윤년일까 ? ' + 결과)
	document.getElementById('resultbox').innerHTML = '결과:'+결과
}
