let counter = 0
let isConnect = false

const h1 = document.querySelector('h1')
const p = document.querySelector('p')
const connectBtn = document.querySelector('#connect')
const disconnectBtn = document.querySelector('#disconnect')

const listener = () => { h1.textContent = `클릭횟수 : ${counter}` }

// 연결버튼클릭
connectBtn.addEventListener('click', () => {
	if(isConnect == false) {
		h1.addEventListener('click', listener)
		p.textContent = '이벤트 연결 상태 : 연결'
		isConnect = true
	}
})

// 연결해제버튼 클릭
disconnectBtn.addEventListener('click', () => {
	if(isConnect == true) {
		h1.removeEventListener('click', listener)
		p.textContent='이벤트 연결 상태 : 해제'
		isConnect = false
	}
})

const increaseBtn = document.querySelector('#increase')
const descentBtn = document.querySelector('#descent')
const h3 = document.querySelector('h3')

increaseBtn.addEventListener('click', () => {
	counter++
	h3.textContent= `${counter} 번째 클릭`
})

descentBtn.addEventListener('click', () => {
	counter--
	h3.textContent= `${counter} 번째 클릭`
})
