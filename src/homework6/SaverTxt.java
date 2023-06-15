package homework6;

import java.io.FileWriter;
import java.io.IOException;

public class SaverTxt {
    public void saveToTxt (Order order){
        String fileName = "src/homework6/file1.txt";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("clientName = " + order.getClientName() + "\n");
            writer.write("product = " + order.getProduct() + "\n");
            writer.write("qnt = " + order.getQnt() + "\n");
            writer.write("price = " + order.getPrice() + "\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


