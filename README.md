# java-3

## 计G202 2020322098  石帅斌  
## 1.实验目的
掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
了解异常的使用方法，并在程序中根据输入情况做异常处理

## 2. 实验内容
    1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。

    2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。    

    3.根据Persons类中的对象和方法让字类中的学生类和老师类来继承Person类中的对象和方法。

    4.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额。

## 3. 实验设计

    1.设置Colleagestudent和 Teacher 接口中的方法
    2.设置教师接口查询薪水的方法，学生接口查缴学费的方法。

 ## 4. 核心方法
 
 1. Doctoral类实现接口中的博士生的缴费功能和获取缴费成功的信息的方法。
  
  ```
  public void payment() {
  Doctoral Doctoral1 = new Doctoral();
  SchoolFinance  scw=new SchoolFinance();
  String str="请输入你要交的学费";
  scw.setMoney(10000);
  
 
 public void checkmany() {
  try {
   sv.setMoney(10000);
   d=sv.getMoney();
  } catch (Exception e) {
   System.out.println("你输入的不正确");
  }
  
 
  ```
  2. 调用博士类并且通过Scanner类进行输出姓名，性别，年龄，和缴费中的方法。
      ```
        Scanner sc=new Scanner(System.in);
      System.out.println("请输入姓名");
     name=sc.nextLine();
     System.out.println("请输入性别");
      String sex=sc.next();
      System.out.println("请输入年龄");
      int age=sc.nextInt();
      System.out.println("姓名："+name);
      System.out.println("性别："+sex);
      System.out.println("年龄："+age);
 }
       ```
   
  ## 5.实验截图
 https://github.com/shishuaibin123/java-3/blob/main/%E5%AE%9E%E9%AA%8C%E6%88%AA%E5%9B%BE/38a5b84a24014a694c36d4f9354644f.jpg
 https://github.com/shishuaibin123/java-3/blob/main/%E5%AE%9E%E9%AA%8C%E6%88%AA%E5%9B%BE/41c59f4f5176106d01dcdb2a236743d.jpg
  ## 6.实验感想

  1. 通过这个实验学习到了如何通过实现接口中的方法，实现博士生所具有的方法。
  2. 了解异常的使用方法，并在程序中根据输入情况做异常处理
   3.在编写程序方面仍然需要提升能力，使得程序更加完善。
  
