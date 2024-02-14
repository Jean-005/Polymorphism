import java.util.ArrayList;

public class Main {
    public class Person {

        public ArrayList<Person> persons;

        public Person() {
            this.persons = new ArrayList<>();
        }

        public int countPersons(){
            return this.persons.size();
        }
    }
}
