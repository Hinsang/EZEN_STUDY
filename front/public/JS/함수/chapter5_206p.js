// ...으로 매개변수가 배열로 들어온다. (가변 매개변수)
function sample(...items) {
	console.log(items)
}

sample(1,2,3)
sample(1,2,3,4)
sample(1,2,3,4,'java', true, '안녕하세요')

function sample2(a, b, ...c) {
	console.log(a, b, c)
}
sample2(1,2)
sample2(1,2,3)
sample2(1,2,3,4)
sample2()

// 전개 연산자를 가변 매개변수에 집어넣는 경우
function sample3(...items){
	console.log(items)
}

const array = [1,2,3,4]
console.log("# 전개 연사자를 사용하지 않는 경우")
sample3(array)
console.log("# 전개 연사자를 사용한 경우")
sample3(...array)
