import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Assert;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadDataFromJSONFile {
    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();

        FileReader reader = new FileReader("jsonfiles/employee.json");

        Object obj = jsonParser.parse(reader);

        JSONObject empJsonObj = (JSONObject) obj;

        JSONArray array = (JSONArray) empJsonObj.get("products");
        long id=0;
       int i = 0;
       for (i = 0; i < array.size(); i++) {
            JSONObject products = (JSONObject) array.get(i);
          // String price = (String) products.get("price");
           //id = (long) products.get("id");
            //System.out.println("id = " + id);
           // System.out.println("names = " + price);
       }
       // System.out.println(id);
       System.out.println(i);
        Assert.assertEquals(i, 34);



        for (int j = 0; j < array.size(); j++) {
            JSONObject products1 = (JSONObject) array.get(j);

            String prices = (String) products1.get("price");

            int prices2 = Integer.parseInt(prices.substring(4));
            //System.out.println(prices2);
            if (prices2 < 1000) {
                //File f = new File("C:\\Users\\Adem\\IdeaProjects\\jsonproject\\jsonfiles\\log.txt");
                //System.out.println(prices2);
                //FileWriter fileWriter = new FileWriter(f);
                //fileWriter.write("merhaba");
                System.out.println(prices2);


            }
        }


    }

}
