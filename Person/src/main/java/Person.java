public abstract class Person {

        public String firstName;
        public String lastName;
        public int age;
        public boolean insured;

        public Person(String firstName, String lastName, int age, boolean insured) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.insured = insured;

        }

    public Person() {

    }

    public String getfirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isInsured () {
        return isInsured();
    }

    public int hoursWorkedEachDay() {
        return 0;
    }

    public double hasSalary() {
        return 0;
    }
}


