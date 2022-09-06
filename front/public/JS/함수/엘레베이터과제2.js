// 엘베 그리기
let btnlist = ''
let 현재엘베 = 1
let i = ''
let 엘베 = null

function btn_create(){
	btnlist= ''
	for(let i = 5 ; i>=1 ; i--) {
		btnlist += `<div class="floor"><div>${i}층</div> <button id=btnbox${i} onclick=btn_click(${i})></button><br>`
	}
	document.getElementById('btnbox').innerHTML = btnlist
	btnlist += '<br>'
	document.getElementById('btnbox'+(현재엘베)).innerHTML = '엘베위치'
}

function btn_clear(){
	document.getElementById('btnbox').innerHTML = btnlist
}

function btn_click(i) {
//	let index = floor.indexOf(i)
// 다시 빈버튼 생성해서 엘베버튼 없애기 
//	현재엘베 = 1
	// 현재 위치에서 상승 할때
	if (현재엘베<i) {
		for(let 엘베 = 현재엘베 ; 엘베<=i ; 엘베++) {
			if(엘베 != i) {
				alert(`현재 ${현재엘베}층`)
				document.getElementById('btnbox'+(현재엘베)).innerHTML = '엘베위치'
				++현재엘베
				btn_clear()
			}
			else{ // 위에 엘베<=i 하면 1층 더 많이 떠서 -1 해주었음
//				현재엘베++
				alert(`${i}층 도착!!`)
				document.getElementById('btnbox'+(현재엘베)).innerHTML = '엘베위치'
				console.log('상승도착 '+엘베)
				console.log('상승 i '+i)
				console.log('상승 엘베 '+엘베)
				console.log('상승 현재엘베 '+현재엘베)
			}
		}
		
	}
	
	if (현재엘베>i) {
		console.log('하강 i '+i)
		console.log('하강 엘베 '+엘베)
		console.log('하강 현재엘베 '+현재엘베)
		for(let 엘베 = 현재엘베 ; 엘베>=i ; 엘베--) {
			if( 엘베 != i ){
				alert(`현재 ${현재엘베}층`)
				document.getElementById('btnbox'+(현재엘베)).innerHTML = '엘베위치'
				현재엘베--
				btn_clear()
			}
			else {
				alert(`${i}층 도착!!`)
				document.getElementById('btnbox'+(현재엘베)).innerHTML = '엘베위치'
			}
		}
		console.log('하강 i '+i)
		console.log('하강 엘베 '+엘베)
		console.log('하강 현재엘베 '+현재엘베)
	}
	
	// 현재 위치에서 하강 할때
	
}
