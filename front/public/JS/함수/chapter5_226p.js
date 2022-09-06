setTimeout(()=>{
	console.log('1초 후에 실행됩니다.')
}, 1000)

let count = 0
let 타이머 = setInterval(()=>{
	console.log(`1초 후에 실행됩니다.${count}`)
	count++
	if( count == 5 ) {
		// 5초 후 타이머 종료
		clearInterval(타이머)
	}
}, 1000)




































