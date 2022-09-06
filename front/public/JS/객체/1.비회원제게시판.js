/**
 * 
 */
let boardlist = []

게시물출력() // js 시작될때

function 글등록() {	
	let bwriter = document.getElementById('bwriter').value
	let bassword = document.getElementById('bpassword').value
	let btitle = document.getElementById('btitle').value
	let bcontent = document.getElementById('bcontent').value
	
	let board = {
		작성자 : bwriter,
		비밀번호 : bassword,
		제목 : btitle,
		내용 : bcontent
	}
	boardlist.push(board)
	
	document.getElementById('bwriter').value = ''
	document.getElementById('bpassword').value = ''
	document.getElementById('btitle').value = ''
	document.getElementById('bcontent').value = ''

	게시물출력()		
}

function 게시물출력() {
	let html = '<tr><th>번호</th><th>제목</th><th>작성자</th></tr>'
	
	for(let i = 0 ; i<boardlist.length ; i++)
	html += `<tr><th>${i}</th><th><a href="#" onclick="게시물보기(${i})">${boardlist[i].제목}</a></th><th>${boardlist[i].작성자}</th></tr>`
	
	document.getElementById('boardlist').innerHTML = html
}

function 게시물보기(i) {
	document.getElementById('viewtitle').innerHTML = boardlist[i].제목
	document.getElementById('viewriter').innerHTML = boardlist[i].작성자
	document.getElementById('viewcontent').innerHTML = boardlist[i].내용
}
































