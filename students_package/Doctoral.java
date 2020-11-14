package students_package;

import java.util.Scanner;

public class Doctoral implements Colleagestudent,Teacher{
	
	int mo=7000;
	int mu=6000;
	int amount=mo*12;
	int amount1=mu*12;
	final double tex=0.03;
	SchoolFinance sv=new SchoolFinance();

	int d=sv.getMoney();
	public void toshow() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名");
	     String name=sc.next();
	     System.out.println("请输入性别");
	     String sex=sc.next();
	     System.out.println("请输入年龄");
	     int age=sc.nextInt();
	     System.out.println("姓名："+name);
	     System.out.println("性别："+sex);
	     System.out.println("年龄："+age);
	}
     
	public void payment() {
		Doctoral Doctoral1 = new Doctoral();
		SchoolFinance  scw=new SchoolFinance();
		String str="请重新输入你要交的学费";
		scw.setMoney(15400);
		while(true) {
			System.out.println(str);
			Scanner sc=new Scanner(System.in);
			int id1;
			int b=scw.getMoney();
    	try {
    		id1=sc.nextInt();
    		if(id1==b) {
    			System.out.println("你的学费支付了："+id1+"元,支付成功");
         		break;
    		}else {
    			 System.out.println("你输入的有误");
    		}
     		
		} catch (Exception e) {
			str="您输入有误,请输入一个整数:";
			continue;
		} 	
     }
		
	}
	public void checkmany() {
		sv.setMoney(15400);
		d=sv.getMoney();
		System.out.println("您查询的学费为"+d);
	}
	public void paysalary() {
		
		System.out.println("每个月发放的薪水为："+mo);
	}
	public void paysalary1() {
		System.out.println("每个月发放的薪水为："+mu);
	}
    public void annual() {
    	System.out.println("你的年总收入是："+amount);
    }
    public void annual1() {
    	System.out.println("你的年总收入是："+amount1);
    }
    public void taxamount() {
    	System.out.println("该学生的税额款为："+(amount-d)*tex+"元");
    }
    public void taxamount1() {
    	System.out.println("该学生的税额款为："+(amount1-d)*tex+"元");
    }
    public void inquiresalary() {
    	System.out.println("每个月的薪水为："+mo);
    }
    public void inquiresalary1() {
    	System.out.println("每个月的薪水为："+mu);
    }
    
}
