package rentcalculatebound  ;

import java.util.Scanner;

public class rentcalculatebound {
	public static void main(String[]args ) {
		System.out.println("欢迎使用房屋租凭租金计算工作!");
		System.out.println("选择进行的操作类型:1、用户类型选择 2、单个用户租金计算 3、多用户租金计算 4、退出");
		Scanner sc=new Scanner(System.in) ;
		int act=sc.nextInt();
		boolean actResult=act==1|| act==2||act==3||act==4;
		        String result=actResult?"你选择的是1~4":"你的选择不在1~4范围内";
		        System.out .println(result );
		        System.out.println("请输入用户姓名:");
		        String username=sc.next();
		        System.out .println("求租用户姓名="+username);
		        System.out.println("请输入求租用户性别:true or flase");
		        boolean sex=sc.nextBoolean();
		        System.out .println("性别="+(sex?'男':'女'));
		        System.out .println("计算租金");
		        System.out.println("请输入房屋出租费用:");
		        double houseRent= sc.nextDouble();
		        System.out.println("请输入物业费用:" );
		        float propertycost=sc.nextInt();
		        System.out.println("请输入其他费用:" );
		        int othercost=sc.nextInt();
		        double rent=houseRent+propertycost+othercost;
		        System.out.println("租金="+rent);
	}
	

}
