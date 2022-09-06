let studentlist = []
학생출력()
let temp = []
let 등수 = ''
let sum = []
let avg = []
let sums = []

function 점수등록() {
	
	// input에 입력된 문자열 가져오기
	// input 문자열을 Number로 변환
	const student = {
	name : document.getElementById('name').value,
	kor : Number(document.getElementById('kor').value),
	eng : Number(document.getElementById('eng').value),
	mat : Number(document.getElementById('mat').value),
	sums : Number(document.getElementById('kor').value) + Number(document.getElementById('eng').value) + Number(document.getElementById('mat').value)
}

	// 배열에 저장하기 전에 중복체크
	if( 이름중복체크(student.name) ) { // 이름중복체크 함수에서 결과[return]가 true 이면
		return // return 함수 종료하는 의미로 return 될 경우에는 아래코드는 실행되지 않는다.
	}
	
	studentlist.push(student)
	
	alert('학생 점수 등록이 되었습니다.')
	console.log(studentlist)
	
	document.getElementById('name').value = ""
	document.getElementById('kor').value = ""
	document.getElementById('eng').value = ""
	document.getElementById('mat').value = ""
	
	학생출력()
}

function 이름중복체크(name) { // 학생 이름 중복체크 함수
	for(let i = 0 ; i<studentlist.length ; i++) {
		// i는 0부터 i는 비열길이[배열내 객체수]미만까지 1씩증가 반복
		if(studentlist[i].name === name) {
			// 배열내 i번째 인덱스의 객체내 이름이 새로 입력받은 이름과 같으면
			alert('이미 존재한 학생명입니다.')
			return true // 배열내 name과 동일한 이름이 있다.
		} // if end
	} // for end
	return false // 배열내 name과 동일한 이름이 없다.
}

//	function 합계() {
//		for(let i = 0 ; i < studentlist.length ; i++) {
//			for(let j = 1 ; j <= studentlist.length ; j++) {
//				sum = studentlist[i].kor + studentlist[i].eng + studentlist[i].mat
//				if(studentlist[i+1]) {
//					sum2 = studentlist[i+1].kor + studentlist[i+1].eng + studentlist[i+1].mat
//					if (sum < sum2) {
//						temp = sum
//						sum = sum2
//						sum2 = temp
//					}
//				}
//			}
//		}
//	}

function 학생출력() {
	let html = '<tr>' +
					'<th>등수</th>'+
					'<th>학생명</th>'+
					'<th>국어</th>'+
					'<th>영어</th>'+
					'<th>수학</th>'+
					'<th>총점</th>'+
					'<th>평균</th>'+
					'<th>비고</th>'+
				'</tr>'
				
	// 배열내 데이터를 하나씩 꺼내기 -> 객체 정보를 html화
	for(let i = 0 ; i < studentlist.length ; i++) {
		for(let j = i+1 ; j < studentlist.length ; j++) {			
			
//				sum[i] = studentlist[i].kor + studentlist[i].eng + studentlist[i].mat
//				sum2 = studentlist[i+1].kor + studentlist[i+1].eng + studentlist[i+1].mat
				if (studentlist[i].sums < studentlist[j].sums) {
					temp = studentlist[i]
					studentlist[i] = studentlist[j]
					studentlist[j] = temp
			}
		}
	}
	
	for(let i = 0 ; i < studentlist.length ; i++) {		
			let avg = studentlist[i].sums / 3
			
//			for(let j = 1 ; j <= studentlist.length ; j++) {
//				sum2 = studentlist[i+1].kor + studentlist[i+1].eng + studentlist[i+1].mat
//				
//				if (sum < sum2) {
//					temp = sum
//					sum = sum2
//					sum2 = temp
//				}
//			}
//			합계()
			
			html += '<tr>' +
						// 내림차순으로 정렬
						`<th>${i+1}</th>`+
						'<th>'+studentlist[i].name+'</th>'+
						'<th>'+studentlist[i].kor+'</th>'+
						'<th>'+studentlist[i].eng+'</th>'+
						'<th>'+studentlist[i].mat+'</th>'+
						`<th>${studentlist[i].sums}</th>`+
						`<th>${avg}</th>`+
						'<th><button onclick="학생삭제('+i+')">삭제</button></th>'+
					'</tr>'
	}
	document.getElementById('listtable').innerHTML = html
}

function 학생삭제(i) {
	alert(studentlist[i].name + '의 정수를 삭제 합니다.')
	studentlist.splice(i, 1) // i번째 인덱스 삭제 (스크립트상에서 제거)
	학생출력() // HTML까지 최신화
}

//	function 총점비교(index) {
//		for(let index = 0 ; index < studentlist.length-1 ; index++) {
//			for(let j = index+1 ; j<=studentlist.length ; j++ ) {
//				temp = studentlist[index].sum
//				studentlist[index].sum = studentlist[j].sum
//				studentlist[j].sum = temp
//			}
//		}


//function 등수비교(id) {
//	for(let i = 0 ; i < id-1 ; i++) {
//			if (sum(i) < sum(i+1).sum) {
//				temp = sum(i)
//				sum(i) = sum(i+1)
//				sum(i+1) = temp
//				console.log(sum(i))
//			}
//		}
//}

//function 등수비교(i, studentlist) {
//	let sum = studentlist[i].kor + studentlist[i].eng + studentlist[i].mat
//		
//	for(let i = 0 ; i < studentlist.length-1 ; i++) {
//			if (sum < sum2) {
//				temp = sum
//				sum = sum2
//				sum2 = temp
//			}
//			console.log(sum2)
//		}
//}

//if(studentlist.length <= 2) {
//	
//for(let i = 0 ; i < studentlist.length-1 ; i++) {
//	for(let j = i+1 ; j<=studentlist.length ; j++ ) {
//		temp = studentlist[i].sum
//		studentlist[i] = studentlist[j]
//		studentlist[j] = temp
//	}
//}






















