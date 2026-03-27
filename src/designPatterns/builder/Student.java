package designPatterns.builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String batch;
    private int gradYear;
    private String univName;
    private int rollNumber;

    private Student(Builder builder){
        this.name= builder.getName();
        this.age=builder.getAge();
        this.psp=builder.getPsp();
        this.batch=builder.getBatch();
        this.gradYear= builder.getGradYear();
        this.univName= builder.getUnivName();
        this.rollNumber= builder.getRollNumber();
    }
// since now this thing is handled in the builder class
    public static Builder getBuilder(){
//        now since the static method can not access the non static attribute hence make the inner class static
        return new Builder();
    }

//    inner class
    static class Builder {
        private String name;
        private int age;
        private double psp;
        private String batch;
        private int gradYear;
        private String univName;
        private int rollNumber;

        //    builder should build student object hence student return type
        public Student build(){
            //        VALIDATIONS START
            if(this.getGradYear()>=2024){
                throw new RuntimeException("Grad year should be less than or equal to 2023");
            }
            //        VALIDATION END
//        we are returning student object and passing the builder object
            return new Student(this);
        }
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getUnivName() {
            return univName;
        }

        public Builder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public int getRollNumber() {
            return rollNumber;
        }

        public Builder setRollNumber(int rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }
    }
}
