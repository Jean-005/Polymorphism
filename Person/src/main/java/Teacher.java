public class Teacher implements  IWork{
            @Override
            public int hoursWorkedEachDay(){
                return 8;
            }

            public double hasSalary(){
                return 40000;
            }

    @Override
    public String work(int hours) {
        return "Works for" + hours + " hours";
    }
}


