package rentcalculatebound  ;

import java.util.Scanner;

public class rentcalculatebound {
	public static void main(String[]args ) {
		System.out.println("��ӭʹ�÷�����ƾ�����㹤��!");
		System.out.println("ѡ����еĲ�������:1���û�����ѡ�� 2�������û������� 3�����û������� 4���˳�");
		Scanner sc=new Scanner(System.in) ;
		int act=sc.nextInt();
		boolean actResult=act==1|| act==2||act==3||act==4;
		        String result=actResult?"��ѡ�����1~4":"���ѡ����1~4��Χ��";
		        System.out .println(result );
		        System.out.println("�������û�����:");
		        String username=sc.next();
		        System.out .println("�����û�����="+username);
		        System.out.println("�����������û��Ա�:true or flase");
		        boolean sex=sc.nextBoolean();
		        System.out .println("�Ա�="+(sex?'��':'Ů'));
		        System.out .println("�������");
		        System.out.println("�����뷿�ݳ������:");
		        double houseRent= sc.nextDouble();
		        System.out.println("��������ҵ����:" );
		        float propertycost=sc.nextInt();
		        System.out.println("��������������:" );
		        int othercost=sc.nextInt();
		        double rent=houseRent+propertycost+othercost;
		        System.out.println("���="+rent);
	}
	

}
