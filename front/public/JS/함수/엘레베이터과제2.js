// 엘베 그리기
let btnlist = ''
let 엘베 = ''
let 현재엘베 = ''
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
	btn_create()
	현재엘베 = ''
	// 현재 위치에서 상승 할때
	if (엘베<=i) {
		for(let 엘베 = 현재엘베 ; 엘베<i ; 엘베++) {
			alert(`${i}층입니다.`)
		if( 엘베 == i-1 ){ // 위에 엘베<=i 하면 1층 더 많이 떠서 -1 해주었음
			alert(`${i}층에 도착했습니다.`)
			현재엘베=엘베
		}
		document.getElementById('btnbox'+(i)).innerHTML = '엘베위치'
		}
	}
	else {
		for(let 엘베 = 현재엘베 ; 엘베>i ; 엘베--) {
			alert(`${i}층입니다.`)
			if( 엘베 == i ){
				alert(`${i}층에 도착했습니다.`)
				현재엘베=엘베
			}
		document.getElementById('btnbox'+(i)).innerHTML = '엘베위치'
		}
	}
	
	// 현재 위치에서 하강 할때
	
}
