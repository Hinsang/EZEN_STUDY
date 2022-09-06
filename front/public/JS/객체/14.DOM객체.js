const imgs = document.querySelectorAll('img')

for(let i = 0 ; i<imgs.length ; i++) {
	imgs[i].addEventListener('contextmenu', (event) => { // 오른쪽 클릭 이벤트
		event.preventDefault() // 효과x
	})
}

for(let i in imgs) { // 인덱스
	if(imgs.length-1 ==  i) { break }
	imgs[i].addEventListener('contextmenu', (event) => { // 오른쪽 클릭 이벤트
		event.preventDefault() // 효과x
	})
}

for(let i of imgs) { // 값이니까 인덱스 추가
	i.addEventListener('contextmenu', (event) => { // 오른쪽 클릭 이벤트
		event.preventDefault() // 효과x
	})
}

imgs.forEach((img) => { // 값이니까 인덱스 추가
	img.addEventListener('contextmenu', (event) => { // 오른쪽 클릭 이벤트
		event.preventDefault() // 효과x
	})
})

let 상태 = false

const 체크박스 = document.querySelector('input')

체크박스.addEventListener('change', (이벤트속성) => {
	상태 = 이벤트속성.currentTarget.checked
})

const 링크 = document.querySelector('a')
링크.addEventListener('click', (이벤트속성) => {
	if(!상태){ // 체크가 안되있으면
		이벤트속성.preventDefault()
	}
})



































