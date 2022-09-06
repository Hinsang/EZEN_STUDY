//로또 구매
//	1. 사용자 6개 버튼 선택한다.
//		조건: 중복배제
//	2. 컴퓨터 추첨번호[1~45난수] 생성
//	3. 사용자 추첨번호 비교 결과

let select_numbers = []
let lotto_numbers = []
// 1. 버튼 만들기 함수
function btn_print(){
	let btnlist = '' // 1~45의 버튼을 저장하는 변수
	for(let i = 1 ; i<=45 ; i++) {
		btnlist += `<button id=${i} onclick=btn_click(${i})>${i}</button>`
		if( i % 5 == 0 ) {
			btnlist += '<br>'
		}
	}
	document.getElementById('btnbox').innerHTML = btnlist;
}

// 2. 버튼 눌렀을때 함수
function btn_click(i){
	// 중복배제
	
	let index = select_numbers.indexOf(i)
	// 배열내 존재하는 숫자 확인
	if(index >= 0){
		alert('이미 선택한 번호입니다. [취소합니다.]')
		select_numbers.splice(index, 1)
	} else {
		if(select_numbers.length == 6){
		alert('더 이상 선택할 수 없습니다.')
		return // 함수 종료
		}
		select_numbers.push(i)
	}
	// 배열에 해당 인덱스가 없으면 -1이므로 인덱스 존재유무 확인
	// 선택한 번호 배열 저장
	document.getElementById('selectbox').innerHTML = select_numbers
}

// 3. 추첨번호 생성 함수
function lotto_number(){
	if(select_numbers.length !=6) {
		alert('6개 수를 모두 입력 후 추첨 해주세요.')
		return
	}
	while(true) {
		let rand = Math.floor((Math.random()*45)+1) // 0 방지
		let index = lotto_numbers.indexOf(rand) // 랜덤값의 인덱스
		if(index == -1) { // 인덱스 자체가 존재하지 않으면
			if(lotto_numbers.length == 6) {
			break // 랜덤숫자 6개면 멈춤
			} else {
				lotto_numbers.push(rand) // 푸시로 패열에 넣는다.
			}
		}
	}
	document.getElementById('lottobox').innerHTML = lotto_numbers
	// 결과 함수 출력
	lotto_result()
}

//while(true) {
//			let rand = Math.floor(Math.random() * 9) // 0~8
//			if(!중복검사(rand)) { // 컴퓨터가 알이없으면 X를 표시하고 나간다.
//				document.getElementById(rand).innerHTML = 'X'
//				게임상황[rand] = 'X'
//				break
//			}
//			if(패배 == true) {
//				break
//			}
//		}

// 4. 추첨번호 비교 결과 함수
function lotto_result(){
	let count = 0 // 배열내 총 동일한 숫자의 개수
//	for(let i of select_numbers) { // 1번째방법. 배열내 요소를 하나씩 변수에 대입반복
//		for(let j of lotto_numbers){
//			if(i==j) {
//				count++ // 같을때 카운트 증가
//			}
//		} // for end
//		if(lotto_numbers.indexOf(i) >= 0){ // 2번째방법. j 인덱스에 i를 넣어서 값을 비교한다.
//			count++;
//		}
//	}
	let result_numbers = select_numbers.filter((value) => lotto_numbers.includes(value))
	count = result_numbers.length
	// 3번째방법. filter함수를 이용해 i를 j 배열과 includes로 비교하고 맞는 길이를 출력한다.
	// 위에 있는 방법들에 덮어쓰기 때문에 3번째 것이 먹힌다.
	
	let msg = '' // 출력할 메시지를 저장하는 변수
	if( count == 0 ) { msg += '꽝' }
	else if( count == 1 ) { msg += '1개 맞았습니다.' + result_numbers }
	else if( count == 2 ) { msg += '2개 맞았습니다.[5등]' + result_numbers }
	else if( count == 3 ) { msg += '3개 맞았습니다.[4등]' + result_numbers }
	else if( count == 4 ) { msg += '4개 맞았습니다.[3등]' + result_numbers }
	else if( count == 5 ) { msg += '5개 맞았습니다.[2등]' + result_numbers }
	else if( count == 6 ) { msg += '6개 맞았습니다.[1등]' + result_numbers }
	document.getElementById('resultbox').innerHTML = msg
}














