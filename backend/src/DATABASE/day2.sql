
/* 1. 데이터베이스 생성 */
create database shop_db3;
/* 
	한줄 실행 : ctrl+엔터
	명령어 ; 끝마침 
*/
/* 2. 테이블 생성*/
use shop_db3; /* DB 선택 */
create table member( 
	member_id char(8) primary key not null , 
    member_name char(5) not null  ,
    member_addr char(20) 
);
/*3. 테이블 확인 */
select * from member;

/*4. 테이블에 데이터 추가 */
insert into member values('hero','임영웅','서울 은평구 증산동');

/* 5. 제품 테이블 생성 */
use shop_db3; /* DB 선택 */
create table product(
	product_name char(4) primary key not null ,
    -- 필드명  char : 문자(4글자)  primary key : 기본키(식별키)  not null : 공백 불가 
    cost int not null ,
    make_date date ,
    company char(5) , 
    amount int not null 
);
/* 6. 확인 */
select * from product;

/* 7. select */
select * from member; -- member 테이블의 모든 필드 검색
select member_id from member; -- member 테이블의 id 필드만 검색
select member_id , member_name from member;
select member_id , member_name , member_addr from member;
select member_id as 아이디 from member; -- as : 별칭 [ 원분수정X , 결과에 표시할 필드명 ]
select member_id as 아이디 , member_name as 이름 , member_addr as 주소 from member; -- 별칭 [ 원분수정X , 결과에 표시할 필드명 ]
select * from member where member_id = 'jyp';
