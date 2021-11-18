package schoolmanagementsystem
// code is responsible for the Student object
public class Student {
private int Id;
private String name;
private int grade;
private int feesPaid;
private int feesTotal;
}

public Student(int Id,String Name,int grade){
feesPaid = 0;
feesTotal = 30000;
this.id = id;
this.name = name;
this.grade = grade;
}

public void setGrade(int grade){
this.grade= grade;
}

public void updatefeesPaid(int fees) {
feesPaid += fees;
}
