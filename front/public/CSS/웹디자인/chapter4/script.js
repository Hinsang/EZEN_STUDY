let 지원자리스트 = [] /* 지원자 객체들을 담을 배열 선언 */
/* 차트 도는시간이 너무 오래걸려서 배열생성이 느리므로 맨 위로 올려줌 */

/* chartlist.js 이용한 자료 구현 */

let pieData = {
	labels : ['웹디자이너', '웹개발자', '서버 엔지니어', '영업직'],
	series: [14, 9, 8, 6]
}
let pieOptions = {
	width: '100%',
	height: '440px'
}
new Chartist.Pie('.pie_chart', pieData, pieOptions)

/* 막대차트 */
let barData = {
	labels : ['2018년', '2019년', '2020년'],
	series : [ [10,16,29] ]
}
let barOptions = {
	axisY : {
		offset : 60,
		scaleMinSpace : 50,
		labelInterpolationFnc :function(value) {
			return value + '명'
		}
	},
	width: '100%',
	height: '400px'
}

new Chartist.Bar('.bar_chart', barData, barOptions)

		/* 막대차트 */
let barData2 = {
	labels : [],
	series : [ [] ]
}

let barOptions2 = {
	axisY : {
		offset : 60,
		scaleMinSpace : 50,
		labelInterpolationFnc :function(value) {
			return value + '명'
		}
	},
	width: '100%',
	height: '400px'
}
	
function 차트그리기() {
	const name = document.getElementById('name').value;
	const money = document.getElementById('money').value;
	
	barData2.labels.push(name)
	barData2.series[0].push(money)	

	new Chartist.Bar('.bar_chart2', barData2, barOptions2)
}

/* ----------------------------------------- */


function 지원자등록() {
	let 입력리스트 = document.querySelectorAll('input')
	let 목록상자 = document.querySelector('select')
	let 긴글상자 = document.querySelector('textarea')
	console.log(입력리스트)
	console.log(목록상자)
	console.log(긴글상자)
	
	let 지원자 = {
		성명 : 입력리스트[0].value,
		영문명 : 입력리스트[1].value,
		메일주소 : 입력리스트[2].value,
		포트폴리오 : 입력리스트[3].value,
		희망근무지 : 입력리스트[4].value, /* 4~6 체크박스 */
		현재상태 : 목록상자.value,
		자기소개 : 긴글상자.value,
	}
	
	console.log(지원자)
	지원자리스트.push(지원자)
	console.log(지원자리스트)
}


































