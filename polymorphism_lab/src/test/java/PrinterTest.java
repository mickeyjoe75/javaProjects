import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer("Epson");
    }

    @Test
    public void canPrint() {
        assertEquals("printing: Hello World", printer.print("Hello World"));
    }

    @Test
    public void canReportStatus() {
        assertEquals("Toner low", printer.getStatus());
    }




}
