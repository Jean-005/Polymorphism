public class Caretaker implements IWork {

        @Override
        public int hoursWorkedEachDay(){
            return 3;
        }

        public double hasSalary(){
            return 12000;

        }
    @Override
    public String work(int hours) {
        return "Works for" + hours + " hours";
    }
}
