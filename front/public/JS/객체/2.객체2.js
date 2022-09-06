const pet = {
	name : '구름',
	eat : function(food) {
		alert(this.name + '은/는' + food + '을/를 먹습니다.')
	}
}

pet.eat('고기')

const student = {}
student.이름 = '윤인성'
student.취미 = '악기'
student.장래희망 = '생명공학자'

console.log(student)

// 객체내 속성 제거
delete student.장래희망
console.log(student)

const pet2 = {
	name : '구름',
	eat(food) {
		alert(this.name+'은/는'+food+'을/를 먹습니다.')
	}
}
pet2.eat('밥')

const 객체 = {
	name : '혼자 공부하는 파이썬',
	price : 18000,
	publisher : '한빛미디어'
}

const a = [ ]
console.log(a)
a.sample = 10
console.log(a.sample)

function b() {}
b.sample = 10
console.log(b.sample)

const c = 273
c.sample = 10
console.log(c.sample)

const d = "안녕하세요"
d.sample = 10
console.log(d.sample)
















