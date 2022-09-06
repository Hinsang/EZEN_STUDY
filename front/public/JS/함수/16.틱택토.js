/*
	1. 게임판[ 9칸 ] 구현
	2. 버튼 눌림 기능
	3. 사용자(선택) vs 컴퓨터(랜덤)
	4. 승리자 판단
*/

let 게임상황 = [] // 알을 둔 상황을 저장하는 배열
let 승리 = '' // 이긴 알을 저장하는 변수
let 승리완료 = false
let 패배 = false

// 1. 게임판 출력하는 함수
function 게임판그리기(){
	승리 = '' // 승리 변수를 공백으로 초기화
	승리완료 = false
	패배 = false
	게임상황 = [null,null,null,null,null,null,null,null,null] // 현재 알을 둔 상황 저장 배열
	document.getElementById('result').innerHTML = ''
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
	if(중복검사(i)) {
		alert('이미 둔 자리입니다.')
		return
	}
	
	// alert( i + '버튼눌림')
	document.getElementById(i).innerHTML = 'O' // 각 버튼 아이디값에 O표시 추가
	게임상황[i] = 'O'
	
	if( 게임결과() && 패배 == false ) { // 게임결과 함수에서 true가 리턴되면
		if (승리 == '무승부') {
			alert('무승부입니다!!')
			document.getElementById('result').innerHTML = '무승부'
			return
		}
		if (승리 == 'O') {
			if (승리완료 == false && 패배 == false) {			
			승리완료 = true
			alert('게임종료 승리 : ' + 승리)
			document.getElementById('result').innerHTML = '승리'
			console.log(승리)
			return
			}
			return
		}
		return // 함수 강제 종료
	}
	
	// [컴퓨터] 난수 발생
	// (Math.random() * 9 ) + 1 // 1~10 사이의 난수 발생
	// floor 내림 round 반올림 ceil 올림
	// alert( '난수 : ' + rand )
		while(true) {
			let rand = Math.floor(Math.random() * 9) // 0~8
			if(!중복검사(rand)) { // 컴퓨터가 알이없으면 X를 표시하고 나간다.
				document.getElementById(rand).innerHTML = 'X'
				게임상황[rand] = 'X'
				break
			}
			if(패배 == true) {
				break
			}
		}
	
	if( 게임결과() && 패배 == false ) { // 게임결과 함수에서 true가 리턴되면
		if (승리 == 'X') {
			패배 = true
			document.getElementById('result').innerHTML = '패배'
			console.log(승리)
			alert('게임종료 승리 : ' + 승리)
		}
		return // 함수 강제 종료
	}
	
}

// 3. 중복 검사 함수
function 중복검사(i) {
	if( 게임상황[i] != null ) { // 배열은 모두 null로 초기화했기때문에 null 아니면 0되는 X가 존재하는의미 [알이 있다.]
		return true // 알이 있다.	
	} else {
		return false // 알이 없다. null 이면
	}
}

// 4. 게임 결과 함수
function 게임결과(){
	// 1.가로 승리, 2.세로 승리, 3.대각선 승리, 4.무승부
	for( let i = 0 ; i<=6 ; i+=3) {
		// i는 0부터 6까지 3씩 증가 반복 [0, 3, 6] 가로 승리
		if( 게임상황[i] != null && 게임상황[i] == 게임상황[i+1] && 게임상황[i+1] == 게임상황[i+2]) { // i번째 배열의 값이 같으면(O or X)
			승리 = 게임상황[i]
			return true // 가로 승리 나오면 함수 종료
		}
	}
	
	for(let i = 0 ; i<=2 ; i++) {
		if(게임상황[i] != null && 게임상황[i] == 게임상황[i+3] && 게임상황[i+3] == 게임상황[i+6]) {
			승리 = 게임상황[i]
			return true // 세로 승리 나오면 함수 종료
		}
	}
	
	for(let i = 0 ; i<=0 ; i++) {
		if(게임상황[i] != null && 게임상황[i] == 게임상황[i+4] && 게임상황[i+4] == 게임상황[i+8]) {
			승리 = 게임상황[i]
			return true // 세로 승리 나오면 함수 종료
		}
	}
	
	for(let i = 2 ; i<=2 ; i++) {
		if(게임상황[i] != null && 게임상황[i] == 게임상황[i+2] && 게임상황[i+2] == 게임상황[i+4]) {
			승리 = 게임상황[i]
			return true // 세로 승리 나오면 함수 종료
		}
	}
	for(let i = 0 ; i<=8 ; i++) {
		if(게임상황[i] != null && 게임상황[i] && 게임상황[i+1] && 게임상황[i+2] && 게임상황[i+3] && 게임상황[i+4] && 게임상황[i+5] && 게임상황[i+6] && 게임상황[i+7] && 게임상황[i+8]) {
//			alert('무승부입니다!!')		
			승리 = '무승부'
			return true // 세로 승리 나오면 함수 종료
		}
	}
}

// 각각 대각선, 무승부 이기는 경우의 수 만들기
// [활용] 가위바위보 게임 만들기, 로또 구매




