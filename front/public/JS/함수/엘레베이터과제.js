let 엘베 = 1
let 현재층 = 1
let 누른층 = 5

엘베위치찍기()
function 엘베위치찍기(){ // 현재 엘베위치 표시
	console.log(엘베)
	document.getElementById('floor'+엘베).innerHTML ='엘베위치'
	if(엘베 > 누른층) {
		for( let i = 현재층 ; i >= 누른층 ; i-- ) { // 현재층에만 표시되게 바꿈
			if(i == 엘베) { continue }
			document.getElementById('floor'+i).innerHTML =' '
		}
	}
	for( let i = 현재층 ; i<=누른층 ; i++ ){
		if( i == 엘베 ){ continue }
		document.getElementById('floor'+i).innerHTML =' '
	}
}

//function 버튼(){
//	if( 엘베 > 누른층 ){
//		하강()
//	} else if ( 엘베 < 누른층 ){
//		상승()
//	}
//}

function 상승(){
	if(엘베 < 누른층) {
		// 상승할때까지 반복
		while( true ){
			if( 현재층 == 누른층 ){ 
				alert('도착') 
				break
			}
			엘베++;
			엘베위치찍기()
			alert( "현재 엘베 위치 : " + 엘베 )
		}
	}
	
}

function 하강(){
	if(엘베 > 누른층) {		
		while( true ){
			if( 현재층 == 누른층 ){ 
				alert('도착') 
				break
			}
			
			엘베--;
			엘베위치찍기()
			alert( "현재 엘베 위치 : " + 엘베 )
		}
	}
	
}




































