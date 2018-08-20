package 카카오코드페스티벌;

import java.util.Scanner;

public class Main//상금헌터문제 정답맞춤
				{
	
	public boolean checkT(int t){
		if(t>=1&& t<=1000){
			return true;
		}
		else return false;
		
	}
   public int prizeMoney(int a,String str, int b){
	   int prize=0;
		if(a<1||a>100){
			a=0;
		}
		
		else if(a<=1 &&a!=0){
			prize=prize+5000000;
		}
		else if(a<=3&&a>1){
			prize=prize+3000000;
		}
		else if(a<=6&&a>3){
			prize=prize+2000000;
		}
		else if(a<=10&&a>6){
			prize=prize+500000;
		}
		else if(a<=15&&a>10){
			prize=prize+300000;
		}
		else if(a<=21&&a>15){
			prize=prize+100000;
		}
		
		if(b<1||b>64){
			b=0;
		}	
		else if(b<=1&&b!=0){
			prize=prize+5120000;
		}
		else if(b<=3&&b>1){
			prize=prize+2560000;
		}
		else if(b<=7&&b>3){
			prize=prize+1280000;
		}
		else if(b<=15&&b>7){
			prize=prize+640000;
		}
		else if(b<=31&&b>15){
			prize=prize+320000;
		}	
		
		return prize;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main 상금= new Main();
		Scanner scan = new Scanner(System.in);
		int t=scan.nextInt();
		int [] score = new int[t];
		if(상금.checkT(t)){
			for(int i = 0 ; i<t; i++){
		int a = scan.nextInt();
		int b= scan.nextInt();
		
				score[i]=상금.prizeMoney(a, "", b);
			}
		}
		
		for(int i = 0; i<score.length;i++){
			System.out.println(score[i]);
		}
	
		}
	}

