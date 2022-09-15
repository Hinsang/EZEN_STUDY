package java1.생존하기;

import java.util.Random;
import java.util.Scanner;

public class 한달생존하기 {
	
	public static void main(String[] args) {
		
		String[][] foodlist = new String[100][5];
		
		foodlist[0][0] = "삼각김밥";
		foodlist[0][1] = "800원";
		foodlist[0][2] = "1";
		foodlist[0][3] = "800";
		foodlist[0][4] = "0";
		
		foodlist[1][0] = "도시락";
		foodlist[1][1] = "4500원";
		foodlist[1][2] = "10";
		foodlist[1][3] = "4500";
		foodlist[1][4] = "5";
		
		foodlist[2][0] = "라면";
		foodlist[2][1] = "1500원";
		foodlist[2][2] = "3";
		foodlist[2][3] = "1500";
		foodlist[2][4] = "2";
		
		foodlist[3][0] = "떡볶이";
		foodlist[3][1] = "15000원";
		foodlist[3][2] = "15";
		foodlist[3][3] = "4500";
		foodlist[3][4] = "20";
		
		foodlist[4][0] = "치킨";
		foodlist[4][1] = "20000원";
		foodlist[4][2] = "20";
		foodlist[4][3] = "4500";
		foodlist[4][4] = "25";
		
		
		String[][] selectlist = new String[100][5];
		int day = 1;
		int turn = 1;
		String state = "아침";
		int energy = 100;
		int money = 0;
		int happy = 100;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {	
			
			System.out.print("DAY " + day + "일");
			System.out.println("\t" + state + "입니다.");
			System.out.println("========================================");
			System.out.print("체력 " + energy + "\t\t");
			System.out.print("머니 " + money + "\t\t");
			System.out.println("행복지수 " + happy + "\t\t");
			System.out.println("");
			
			if(energy <= 0) {
				System.out.println("체력이 나빠져 사망하였습니다!!");
				System.out.println("GAME OVER!!!!!!!!!!!");
				break;
			}
			
			if(happy <= 0) {
				System.out.println("극심한 스트레스로 사망하였습니다!!");
				System.out.println("GAME OVER!!!!!!!!!!!");
				break;
			}
			
			if(day >= 31) {
				System.out.println("한달을 생존하여 승리하였습니다!!");
				System.out.println("WIN !!!!!!!!!!!");
				break;
			}
			
			System.out.println("1.구걸하기 2.밥먹기 3.일하기 4.복권사기");
			while(!scanner.hasNextInt()) { 
				scanner.next();
				System.out.println("1.구걸하기 2.밥먹기 3.일하기 4.복권사기");
			}
			
			int btn = scanner.nextInt();
			
			if(btn == 0 || btn >= 5) {
				continue;
			}
			
			if(btn == 1) {

				Random random = new Random();
				int beg = Math.round(random.nextInt(1000));
				money += beg;
				turn++;
				energy += -2;
				
				while(true) {
					if(turn == 1) {
						state = "아침";
						break;
					} else if(turn == 2) {
						state = "점심";
						break;
					} else if(turn == 3) {
						state = "저녁";
						break;
					} else {
						turn = 1;
						state = "아침";
						day++;
						break;
					}
				}
				
				System.out.println(beg + "원을 구걸에 성공하셨습니다.");
				System.out.println("체력이 조금 하력합니다. 체력 -2");
				System.out.println("");
				
				continue;
				
			} else if(btn == 2) {
				
				while(true) {
					String foodname;
					String foodprice;
					int foodenergy;
					int foodmoney;
					int foodhappy;
					String selectname;
					String selectprice;
					int selectenergy;
					int selectmoney;
					int selecthappy;
					
					System.out.println("=========== 음식 리스트 ===========");
					System.out.println("메뉴		가격		  에너지	  행복지수");
					
					for(int i = 0 ; i<foodlist.length ; i++) {
						if(foodlist[i][0] != null) {							
							foodname = foodlist[i][0];
							foodprice = foodlist[i][1];
							foodenergy = Integer.parseInt(foodlist[i][2]);
							foodmoney = Integer.parseInt(foodlist[i][3]);
							foodhappy = Integer.parseInt(foodlist[i][4]);
							
							System.out.printf("%-6s", foodname);
							System.out.printf("\t%-6s", foodprice);
							System.out.printf("\t%5d", foodenergy);
							System.out.printf("%10d%n", foodhappy);
						}
					}
					
					System.out.println("어떤 음식을 주문하시겠습니까?");
					
					while(!scanner.hasNext()) { 
						scanner.nextInt();
						System.out.println("어떤 음식을 주문하시겠습니까?");
					}

					String select = scanner.next();
					
					if(money > 0) {
						for(int i = 0 ; i<foodlist.length ; i++) {
							if(foodlist[i][0] != null) {
								if(foodlist[i][0].equals(select)) {
									selectname = foodlist[i][0];
									selectprice = foodlist[i][1];
									selectenergy = Integer.parseInt(foodlist[i][2]);
									selectmoney = Integer.parseInt(foodlist[i][3]);
									selecthappy = Integer.parseInt(foodlist[i][4]);
									
									System.out.println(selectname + "을 선택했습니다.");
									
									if(selectname == "삼각김밥" ) {
										if(money>=800) {
											money += -800;
											energy += 1;
											happy += 0;
											turn++;
											System.out.println("삼각김밥을 먹어 해당 능력치가 상승합니다.");
										} else {
											System.out.println("돈이 없습니다!!");
										}
									} else if(selectname == "도시락") {
										if(money>=4500) {
											money += -4500;
											energy += 10;
											happy += 5;
											turn++;
											System.out.println("도시락을 먹어 해당 능력치가 상승합니다.");
										} else {
											System.out.println("돈이 없습니다!!");
										}
									} else if(selectname == "라면") {
										if(money>=1500) {
											money += -1500;
											energy += 3;
											happy += 2;
											turn++;
											System.out.println("라면을 먹어 해당 능력치가 상승합니다.");
										} else {
											System.out.println("돈이 없습니다!!");
										}
									} else if(selectname == "떡볶이") {
										if(money>=15000) {
											money += -15000;
											energy += 15;
											happy += 20;
											turn++;
											System.out.println("떡볶이를 먹어 해당 능력치가 상승합니다.");
										} else {
											System.out.println("돈이 없습니다!!");
										}
									} else if(selectname == "치킨") {
										if(money>=20000) {
											money += -20000;
											energy += 20;
											happy += 25;
											turn++;
											System.out.println("치킨을 먹어 해당 능력치가 상승합니다.");
										} else {
											System.out.println("돈이 없습니다!!");
										}
									} else {
										System.out.println("메뉴중에서 골라주세요.");
										continue;
									}
									
									while(true) {
										if(turn == 1) {
											state = "아침";
											break;
										} else if(turn == 2) {
											state = "점심";
											break;
										} else if(turn == 3) {
											state = "저녁";
											break;
										} else {
											turn = 1;
											state = "아침";
											day++;
											break;
										}
									}
									
									break;
								}
							}
						}
					} else {
						System.out.println("돈이 없습니다!!");
					}
					
					break;
				}
				continue;
				
			} else if(btn == 3) {
				
				int work = 20000;
				money += work;
				turn++;
				energy += -25;
				happy += -20;
				
				while(true) {			
					if(turn == 1) {
						state = "아침";
						break;
					} else if(turn == 2) {
						state = "점심";
						break;
					} else if(turn == 3) {
						state = "저녁";
						break;
					} else {
						turn = 1;
						state = "아침";
						day++;
						break;
					}
				}
				
				System.out.println("단기알바로 " + work + "원을 벌었습니다.");
				System.out.println("체력이 급격히 빠집니다. -25");
				System.out.println("스트레스로 머리가 빠집니다. -20");
				System.out.println("");
				
				continue;
				
			} else if(btn == 4) {
				
				Random random = new Random();
				int lotto = Math.round(random.nextInt(100));
				
				System.out.println("1.복권구매(최소금액은 5000원입니다.) 2.돌아가기");
				while(!scanner.hasNextInt()) {
					scanner.next();
					System.out.println("1.구걸하기 2.밥먹기 3.일하기 4.복권사기");
				}
				
				int btn2 = scanner.nextInt();
				
				if(btn == 0 || btn >= 5) {
					continue;
				}
				
				if(btn2 == 2) {
					continue;
				}
				
				while(true) {
					if(btn2 == 1 && money >= 5000) {
						if(lotto == 77) {
							System.out.println("축하합니다!! 1등 20만원에 당첨되셨습니다!!");
							System.out.println("행복지수가 상승합니다. +50");
							money += -5000;
							money += 200000;
							happy += 50;
							break;
						} else if(lotto == 22 || lotto == 23) {
							System.out.println("축하합니다!! 2등 10만원에 당첨되셨습니다!!");
							System.out.println("행복지수가 상승합니다. +40");
							money += -5000;
							money += 100000;
							happy += 40;
							break;
						} else if(lotto == 33 || lotto == 34 || lotto == 35) {
							System.out.println("축하합니다!! 3등 5만원에 당첨되셨습니다.");
							System.out.println("행복지수가 상승합니다. +30");
							money += -5000;
							money += 50000;
							happy += 30;
							break;
						} else if(lotto == 44 || lotto == 45 || lotto == 46 || lotto == 47) {
							System.out.println("4등 2만원에 당첨되셨습니다.");
							System.out.println("행복지수가 상승합니다. +20");
							money += -5000;
							money += 20000;
							happy += 20;
							break;
						} else if(lotto == 55 || lotto == 56 || lotto == 57 || lotto == 58 || lotto == 59) {
							System.out.println("5등 5천원에 당첨되셨습니다.");
							System.out.println("행복지수가 상승합니다. +10");
							money += -5000;
							money += 5000;
							happy += 10;
							break;
						} else {
							System.out.println("꽝!! 낙첨되었습니다.");
							System.out.println("행복지수가 하락합니다. -1");
							money += -5000;
							happy += -1;
							break;
						}
					} else if(money < 5000) {
						System.out.println("최소금액이 없어 복권을 이용할 수 없습니다.");
						break;
					} else
					break;
				}

				System.out.print("DAY " + day + "일");
				System.out.println("\t" + state + "입니다.");
				System.out.println("========================================");
				System.out.print("체력 " + energy + "\t\t");
				System.out.print("머니 " + money + "\t\t");
				System.out.println("행복지수 " + happy + "\t\t");
				System.out.println("");
				
				continue;
				
			}
			
			break;
		}
	}
}
