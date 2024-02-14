public class Worker extends Person{

    public Worker(String firstName, String lastName, int age, boolean insured) {
        super(firstName, lastName, age, insured);
    }

    public Worker() {
        super();
    }

    public boolean canTeach(){
        return true;
    }

    @Override
    public boolean isInsured () {
        return true;
    }
    public int hoursWorkedEachDay(){
        return 8;
    }

    public double hasSalary(){
        return 40000;
    }
}
