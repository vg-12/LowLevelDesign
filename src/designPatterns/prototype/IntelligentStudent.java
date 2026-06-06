package designPatterns.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(){

    }
  public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq=student.iq;
  }
    @Override//not a mandatory annotation
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
//        IntelligentStudent intelligentStudent= new IntelligentStudent();
//        intelligentStudent.iq=this.iq;
//
//        intelligentStudent.setAge(this.getAge());
//        intelligentStudent.setBatch(this.getBatch());
//        intelligentStudent.setName(this.getName());
//        intelligentStudent.setPsp(this.getPsp());
//        intelligentStudent.setAvgBatchPsp(this.getAvgBatchPsp());

//        return intelligentStudent;
    }
}
