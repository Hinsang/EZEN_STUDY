// 태그 생성
const header = document.createElement('h1')

header.textContent = 'js에서 만든 태그'
header.style.color = 'white'
header.style.background = 'black'



document.body.appendChild(header) // 자식 추가

const divA = document.querySelector('#first')
const divB = document.querySelector('#second')

const h1 = document.createElement('h1')
h1.textContent = '이동하는 h1 태그'

const toFirst = () => {
	divA.appendChild(h1)
	setTimeout(toSecond, 1000)
}

const toSecond = () => {
	divB.appendChild(h1)
	setTimeout(toFirst, 1000)
}

toFirst()

//const toSecond = () => {
//	divB.appendChild(divA)
//}
//
//setTimeout(toSecond, 3000)
//

const h2 = document.querySelector('h2')

// 1.
setTimeout(() => {
	h2.parentNode.removeChild(h2) // parentNode - 부모 요소 접근
}, 3000)

// 2.
const 익명함수 = () => {
	h2.parentNode.removeChild(h2)
}
setTimeout(익명함수, 3000)

// 3.
function 함수() {
//	h2.parentNode.removeChild(h2)
	document.body.removeChild(h2)
}
setTimeout(함수, 3000)


















