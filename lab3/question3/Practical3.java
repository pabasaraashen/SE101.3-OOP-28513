public class Practical3 {

    public static void main(String[] args) {
         employee s1=new employee();
        //set the values
        s1.setName("Pabasara");
        s1.setAge(23);
        s1.setSalary(25000.00);

        //display the values
        String a= s1.getName();
        int b= s1.getAge();
        double c= s1.getSalary();

        System.out.println("Name is:" +a);
        System.out.println("Age is:" +b);
        System.out.println("Salary is:"+c);
    }
}
