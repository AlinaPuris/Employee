public class Employee {
    private static String name;
    private static int age;
    private static String department;
    public Employee(String name, int age, String department){
        this.name=name;
        this.age=age;
        this.department=department;
    }

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
