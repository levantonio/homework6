import homework6.*;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        Order orderMy = new Order("Arkadyi Parovozov", "Sapsan", 2, 19658000);
        SaverXml saverXml = new SaverXml();
        SaverJson saverJson = new SaverJson();
        SaverTxt saverTxt = new SaverTxt();
        Loader loader = new Loader();

        saverXml.saveToXML(orderMy);
        saverJson.saveToJson(orderMy);
        saverTxt.saveToTxt(orderMy);

        Order order1 = new Order();
        loader.loadFromJson(new File("src/homework6/file1.json"), order1);
        System.out.println(order1);
    }
}
