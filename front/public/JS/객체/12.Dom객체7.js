const star = document.querySelector('h1')
star.style.position = 'absolute'

// 별의 이동을 출력하는 기능
let [ x, y ] = [0, 0]
const block = 20
const print = () => {
	star.style.left = `${x*block}px`
	star.style.top = `${y*block}px`
}
print()

const [left, up, right, down] = [37, 38, 39, 40]

document.body.addEventListener('keydown', (event) => {
	switch(event.keyCode) {
		case left :
			x -= 1
			break
		case up :
			y -= 1
			break
		case right :
			x += 1
			break
		case down :
			y += 1
			break
	}
	print()
})
