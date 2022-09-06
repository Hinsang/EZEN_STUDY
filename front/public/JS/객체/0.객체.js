/**
객체는 메모리(변수, 배열 등)와 함수 들의 모임
클래스는 추상적의미의 설계도이다. 
 */

const product = {
	제품명: '7D 건조 망고',
	유형: '당절임',
	성분: '망고, 설탕, 메타증아황산나트륨, 치자황색소',
	원산지: '필리핀'
}

console.log('객체 호출 : ' + product)
console.log('객체내 속성 호출 : ' + product['제품명'])
console.log('객체내 속성 호출 : ' + product['유형'])
console.log('객체내 속성 호출 : ' + product.제품명)
console.log('객체내 속성 호출 : ' + product.유형)

const object = {
	number: 273,
	string: '구름',
	bolean: true,
	array: [52, 273, 103, 32],
	method: function(){ console.log('함수실행')}
}

console.log('객체내 메소드 호출 ' + object.method())
