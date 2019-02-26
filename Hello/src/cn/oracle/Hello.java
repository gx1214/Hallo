package cn.oracle;

import java.util.*;					  				//引入util包
public class Hello {
	public static void main(String[] arges){		//主函数
		int times=1;								//记录输入的次数
		Random random =new Random();				//定义随机数对象
		int ran= random.nextInt(100)+1; 			//System.out.println(ran); 生成随机数
		System.out.println("输入");				    //控制台输入	
		Scanner sc=new Scanner(System.in);			//获取用户输入数据的方法
		while(true){								//while循环
			System.out.println("plz enter some number");
			String num=sc.nextLine();				//获取用户输入的数据
			int _num=Integer.parseInt(num);			//将获取的数据转换成int型变量
			if(_num==ran){
				System.out.println("输入正确"+ran+"共输入"+times+"次");
				break;	
			}
			else{
				times++;
				if(_num>ran){
					System.out.println("大了");
				}
				else{
					System.out.println("小了");
				}
			}
		}
	}

}
