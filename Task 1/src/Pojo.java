public class Pojo {
    private String name;
    private String status;
    private String job;
    private int age;
    private String salary;

    public Pojo(){

    }

    public Pojo(String salary, int age, String job, String status, String name) {
        this.salary = salary;
        this.age = age;
        this.job = job;
        this.status = status;
        this.name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
