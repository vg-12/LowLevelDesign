package designPatterns.builder;

public class Client {
    public static void main(String[] args) {
//        previously there was no co-relation between the student and builder
//        Builder builder=new Builder();
//        Creating builder object in the student class itself
//        Builder builder=Student.getBuilder();
//        builder.setName("any");
//        builder.setAge(25);
//        builder.setPsp(95.0);
//        builder.setGradYear(2023);
//instead of calling the student object directly we will be calling build method
//        Student student=new Student(builder);
//        Student student=builder.build();

        Student st=Student.getBuilder()
                .setName("any")
                .setAge(23)
                .setPsp(90.0)
                .setBatch("cse")
                .setGradYear(2024)
                .setUnivName("stanley")
                .setRollNumber(120)
                .build();
        System.out.println("DEBUG");
    }
}
