// 엘베 그리기
let btnlist = ''
let 현재엘베 = 1
let i = ''

function btn_create(){
	btnlist= ''
	for(let i = 5 ; i>=1 ; i--) {
		btnlist += `<div class="floor"><div>${i}층</div> <button id=btnbox${i} onclick=btn_click(${i})></button><br>`
	}
	btnlist += '<br>'
	document.getElementById('btnbox').innerHTML = btnlist
}

function btn_click(i) {
//	let index = floor.indexOf(i)
	btn_create() // 다시 빈버튼 생성해서 엘베버튼 없애기 
//	현재엘베 = 1
	let 엘베 = ''
	// 현재 위치에서 상승 할때
	if (엘베<i) {
		for(let 엘베 = 현재엘베 ; 엘베<=i ; 엘베++) {
			if(엘베 != i) {
				alert(`현재 ${엘베}층`)
				document.getElementById('btnbox'+(i)).innerHTML = '엘베위치'
			}
			else{ // 위에 엘베<=i 하면 1층 더 많이 떠서 -1 해주었음
				alert(`${i}층 도착!!`)
				document.getElementById('btnbox'+(i)).innerHTML = '엘베위치'
				현재엘베=엘베
				console.log(엘베+'상승도착')
			}
		}
	console.log(i+'상승i')
	console.log(현재엘베+'상승현재엘베')
	console.log(엘베+'상승엘베')
	}
	
	if (엘베>i) {
		console.log(현재엘베+'하강현재엘베')
		console.log(i+'하강i')
		for(let 엘베 = 현재엘베 ; 엘베>=i ; 엘베--) {
			alert(`현재${엘베}층`)
			document.getElementById('btnbox'+(i)).innerHTML = '엘베위치'
			if( 엘베 != i ){
				alert(`${i}층에 도착했습니다.`)
			}
			else {
				alert(`${i}층 도착!!`)
				document.getElementById('btnbox'+(i)).innerHTML = '엘베위치'
				현재엘베=엘베
				console.log(엘베+'하강엘베')
			}
		}
	}
	
	// 현재 위치에서 하강 할때
	
}
