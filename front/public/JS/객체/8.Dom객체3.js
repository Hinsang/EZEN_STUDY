document.addEventListener('DOMContentLoaded', () => {

	const a = document.querySelector('#a')
	const b = document.querySelector('#b')
	
	a.textContent = '<h1>텍스트 그래도 넣기 </h1>'
	b.innerHTML = '<h1> html 형식으로 넣기 </h1>'

	// 속성 조작
	const rects = document.querySelectorAll('.rect')
	
	for(let i = 0 ; i<rects.length; i++) {
		const width = (i+1) * 100
		const src = `http://placekitten.com/${width}/250`
		rects[i].setAttribute('src', src) // src 속성에 값을 지정합니다.
	}
	
	const divs = document.querySelectorAll('#divbox > div')
	
	divs.forEach((div,index) => {
		console.log(div, index)
		const val = index*10
		div.style.height = "10px"
		div.style.backgroundColor = `rgba(${val},${val},${val})`
	})
	
})

// 객체명.textContet = '문자 그대로'
// 객체명.innerHTML = 'html형식대로'













