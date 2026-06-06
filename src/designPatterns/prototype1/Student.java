package designPatterns.prototype1;

public class Student implements Prototype1<Student> {

    private String name;
    private String batch;
    private int age;
    private double psp;
    private double avgBatchPsp;


    public String getName() {
        return name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public double getAvgBatchPsp() {
        return avgBatchPsp;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Student clone() {
        Student st=new Student();
        st.name=this.name;
        st.age=this.age;
        st.psp=this.psp;
        st.batch=this.batch;
        st.avgBatchPsp=this.avgBatchPsp;
        return st;
    }
}
