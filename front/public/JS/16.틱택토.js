/*
	1. 게임판[ 9칸 ] 구현
	2. 버튼 눌림 기능
	3. 사용자(선택) vs 컴퓨터(랜덤)
	4. 승리자 판단
*/
게임판그리기()
// 1. 게임판 출력하는 함수
function 게임판그리기(){
	let 게임판 = ''
	for( let i = 0 ; i<9 ; i++ ){
		게임판 += `<button id=${i} onclick=버튼선택(${i})>${i}</button>`
		if(i % 3 == 2) {
			게임판 += '<br>'
		}
	}
	document.getElementById('gameboard').innerHTML = 게임판
}
// 2. 위치 선택 함수
function 버튼선택(i){
	alert( i + '버튼눌림')
	document.getElementById(i).innerHTML = 'O' // 각 버튼 아이디값에 O표시 추가
	// [컴퓨터] 난수 발생
	// (Math.random() * 9 ) + 1 // 1~10 사이의 난수 발생
	// floor 내림 round 반올림 ceil 올림
	let rand = Math.floor(Math.random()) * 9 // 0~8
	alert( '난수 : ' + rand )
	document.getElementById(rand).innerHTML = 'X'
}
// 3. 게임 상태(상황) 함수
function 상황출력(){
	
}
// 4. 게임 결과 함수
function 게임결과(){
	
}





