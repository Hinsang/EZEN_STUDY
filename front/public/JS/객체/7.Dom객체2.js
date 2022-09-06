//function 함수() {
//	document.getElementById('h1')
//}

document.addEventListener('DOMContentLoaded', () => { // 문서 모두 실행 후 이벤트
	const header = document.querySelector('h1')

	console.log(header)
	console.log(typeof(header))

	header.textContent = '안녕~~'
	header.style.color = 'white' // DOM객체명.style.속성명 = 값
	header.style.backgroundColor = 'black'
	header.style.padding = '10px'
})

document.addEventListener('DOMContentLoaded', () => {
	const headers = document.querySelectorAll('h1')
	console.log(headers)
	console.log(typeof(headers))
	// 1.
	for (let i = 0; i < headers.length; i++) {
		headers[i].textContent = "안녕"+i
	}
	// 2.
	for(let index in headers) { // 0부터 마지막인데스까지 대입반복
		headers[index].textContent = '안녕'+index
	}
	// 3.
	for(let object of headers) { // 0번째 인덱싀 데이터값을 하나씩 대입반복
		object.textContent = '안녕'
	}
	// 4.
	headers.forEach((object) => {object.textContent='안녕~~'})
})























