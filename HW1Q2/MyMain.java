import java.util.linkedList;

public class MyMain {
    LinkedList<Linked> linkedList = new LinkedList<>();


    public static void store(BufferedReader reader, LinkedList<Linked> linkedList) throws IOException {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 3) {
                Linked dataEn = new Linked(data[0].trim(), data[1].trim(), data[2].trim());
                linkedList.add(dataEn);
            }
        }
        reader.close();
    }

    public static void display(BufferedWriter writer, LinkedList<Linked> linkedList) throws IOException {
        for (Linked dataEn : linkedList) {
            writer.write(dataEn.toString());
            writer.newLine();
        }
        writer.flush();
    }

    public static int find(String sid, LinkedList<Linked> linkedList) {
        for (int i = 0; i < linkedList.size(); i++) {
            if (linkedList.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public void main(String[] args) {
        FileInputStream file = new FileInputStream("people.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(file));
        System.out.println(linkedList.store(reader));
    }
}