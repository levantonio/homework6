package homework6;

import java.io.FileWriter;
import java.io.IOException;

public class SaverXml {
    public void saveToXML (Order order){
        String fileName = "src/homework6/file1.xml";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("<?xml version=\"1.0\"?>\n");
            writer.write("<order>\n");
            writer.write("  <clientName>" + order.getClientName() + "</clientName>\n");
            writer.write("  <product>" + order.getProduct() + "</product>\n");
            writer.write("  <qnt>" + order.getQnt() + "</qnt>\n");
            writer.write("  <price>" + order.getPrice() + "</price>\n");
            writer.write("</order>\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
