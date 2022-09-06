const 긴글상자 = document.querySelector('textarea')
const 헤더텍스트 = document.querySelector('h1')

긴글상자.addEventListener('keyup', () => {
	const 길이 = 긴글상자.value.length
	헤더텍스트.textContent = `글자 수  : ${길이}`
})

function 글자수() {
	const 길이 = 긴글상자.value.length
	헤더텍스트.textContent = `글자 수 : ${길이}`
}

const h2 = document.querySelector('h2')
const print = (event) => {
	let output = ''
	output += `alt : ${ event.altkey }<br>`
	output += `ctrl : ${ event.ctrkey }<br>`
	output += `shift : ${ event.shiftkey }<br>`
	output += `code : ${typeof(event.code) != 'undefined' ? event.code : event.keyCode}<br>`
	
	h2.innerHTML = output
}

document.addEventListener('keyup', print)



































