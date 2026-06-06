package designPatterns.prototype;

public class Client {
    static void main() {
        StudentRegistry studentRegistry=new StudentRegistry();
        fillRegistery(studentRegistry);

        Student rajneesh= studentRegistry.get("aug23Evening").clone();
        rajneesh.setName("Rajneesh");
        rajneesh.setAge(25);
        rajneesh.setPsp(89.0);
        Student umair = studentRegistry.get("aug23Evening").clone();
        umair.setName("umair");
        umair.setAge(26);
        umair.setPsp(91.0);

        Student ningappa = studentRegistry.get("aug23EveningIntelligent").clone();
        ningappa.setName("ningappa");
        ningappa.setAge(27);
        ningappa.setPsp(99);

        System.out.println("DEBUG");

    }
    private static void fillRegistery(StudentRegistry studentRegistry){
        // 1 create prototype object for every batch
        Student aug23EveningBatch=new Student();
        aug23EveningBatch.setBatch("Aug23 evening batch");
        aug23EveningBatch.setAvgBatchPsp(75.0);
        studentRegistry.register("aug23Evening", aug23EveningBatch);

        Student aug23EveningBatchIntelligent = new IntelligentStudent();
        aug23EveningBatchIntelligent.setBatch("Aug23 evening batch");
        aug23EveningBatchIntelligent.setAvgBatchPsp(90.0);
        studentRegistry.register("aug23EveningIntelligent",aug23EveningBatchIntelligent);
    }
}
