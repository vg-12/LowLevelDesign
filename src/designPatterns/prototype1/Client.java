package designPatterns.prototype1;

public class Client {
    public static void fillRegistry(StudentRegistry1 stReg){
        Student st=new Student();
        st.setBatch("Aug23EveningBatch");
        st.setAvgBatchPsp(90);
        stReg.register("Aug23EveningBatch",st);
    }

    static void main() {
        StudentRegistry1 studentRegistry1=new StudentRegistry1();
        fillRegistry(studentRegistry1);
        Student st= studentRegistry1.get("Aug23EveningBatch").clone();
        st.setName("vashali");
        st.setAge(25);
        st.setPsp(88.0);

        Student st2= studentRegistry1.get("Aug23EveningBatch").clone();
        st2.setName("any");
        st2.setAge(26);
        st2.setPsp(98.0);
        System.out.println("DEBUG");
    }
}
