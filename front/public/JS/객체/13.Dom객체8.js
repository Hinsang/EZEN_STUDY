const input = document.querySelector('#inchbox')
const button = document.querySelector('#inchbtn')
const p = document.querySelector('#inchp')

button.addEventListener('click', () => {
	const inch = Number(input.value)
	if( isNaN(inch) ) { // 숫자가 아니면
		p.textContent = '숫자를 입력해주세요'
		return
	}
	const cm = inch * 2.54
	p.textContent = `${cm} cm`
})

const emailbox = document.querySelector('#emailbox')
const emailp = document.querySelector('#emailp')
const isemail = (value) => {
	return (value.indexOf('@') > 1) && (value.split('@')[1].indexOf(".") > 1)
			// 입력데이터에 @가 있는지    이면서   입력데이터의 @ 뒤문자	.이 있는지
}

function 함수(value) {
	return (value.indexOf('@') > 1) && (value.split('@')[1].indexOf(".") > 1)
}

emailbox.addEventListener('keyup', (event) => {
	const value = event.currentTarget.value
	if(isemail(value)){
		p.style.color = 'green'
		p.textContent = `이메일 형식입니다 : ${value}`
	} else {
		p.style.color = 'red'
		p.textContent = `이메일 형식이 아닙니다 : ${value}`
	}
})

//const selectbox = document.querySelector('#selectbox')
//const selectp = document.querySelector('#selectp')
//
//selectbox.addEventListener('change', (event) => {
//	
//	// select의 모든 option 호출 [select객체.options] = 배열
//	const options = event.currentTarget.options
//	// 선택한목록번호 = options 중에서 [사용자]선택된 번호 호출
//	const index = event.currentTarget.options.selectedIndex
//
//	selectp.textContent = `선택 : ${options[index].textContent}`
//})

const selectbox2 = document.querySelector('#selectbox2')
const selectp2 = document.querySelector('#selectp2')

selectbox2.addEventListener('change' , (event) => {
	const options = event.currentTarget.options
	const list = []
	
	for(const option of options) {
		// 배열[옵션목록]중 하나씩 option 대입 반복
		if(option.selected) {
			list.push(option.textContent)
		}
	}
	
	// join 배열 연결문자
	selectp2.textContent = `선택 : ${list.join(',')}`
	
})

let 현재값
let 변환상수 = 10

const cminput = document.querySelector('#cminput')
const cmspan = document.querySelector('#cmspan')
const cmselect = document.querySelector('#cmselect')

cmselect.addEventListener('change', (event) => {
	const options = event.currentTarget.options
	const index = event.currentTarget.options.selectedIndex
	변환상수 = Number(options[index].value)
	calculate()
})

const calculate = () => {
	cmspan.textContent = (현재값*변환상수).toFixed(2) // 소수점 2자리까지 자르기
}

cminput.addEventListener('keyup', (event) => {
	현재값 = Number(event.currentTarget.value)
	calculate()	
})

let timer = 0
let timerId = 0
const timerinput = document.querySelector('#timerinput')
const timerh1 = document.querySelector('#timerh1')

timerinput.addEventListener('change', (event) => {
	if(event.currentTarget.checked) {
		timerId = setInterval(() => {
			timer += 1
			timerh1.textContent = `${timer}초`
		}, 1000)
	} else {
		clearInterval(timerId)
	}
})

const radios = document.querySelectorAll('[name=pet]')
const output = document.querySelector('#output')

radios.forEach((radio) => {
	radio.addEventListener('change', (event) => {
		const current = event.currentTarget
		if (current.checked) {
			output.textContent = `좋아하는 애완동물은 ${current.value}이시군요!`
		}
	})
})



















