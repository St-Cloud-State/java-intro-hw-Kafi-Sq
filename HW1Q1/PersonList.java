import java.util.LinkedList;

public class PersonList {
    private LinkedList<Person> personList;

    public PersonList() {
        this.personList = new LinkedList<>();
    }

    public void store(BufferedReader reader) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                Person person = new Person(data[0].trim(), data[1].trim(), data[2].trim());
                personList.add(person);
            }
        }
        reader.close();
    }

    public void display(BufferedWriter writer) throws IOException {
        for (Person person : personList) {
            writer.write(person.toString());
            writer.newLine();
        }
        writer.flush();
    }

    public int find(String sid) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public LinkedList<Person> getPersonList() {
        return personList;
    }
}