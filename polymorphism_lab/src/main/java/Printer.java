import java.util.ArrayList;

public class Printer implements INetworkable {

    private String name;
    private ArrayList<Printer> printers;

    public Printer(String name) {
        this.printers = new ArrayList<Printer>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String print(String data) {
        return "printing: " + data;
    }

    public int deviceCount() {
        return printers.size();
    }

    public void connect(Printer printer) {
        printers.add(printer);
    }

    public void disconnectAll() {
        printers.clear();
    }

    public String getStatus() {
        return "Toner low";
    }
}