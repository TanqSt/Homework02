package Module4Final.Resource;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileReader;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadConfig {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            //Use JSONObject for simple JSON and JSONArray for array of JSON.
            JSONObject data = (JSONObject) parser.parse(
                    new FileReader("c:\\Users\\Boris\\IdeaProjects\\JQALearn\\src\\test\\java\\Module4Final\\Resource\\config.json"));//path to the JSON file.
            //String json;
            //json = data.toString();
            String firstName = data.getString("firstName");
            String lastName=(String) data.get("lastName");
            String address=(String) data.get("address");
            String city=(String) data.get("city");
            String state=(String) data.get("state");
            String code=(String) data.get("code");
            String mobPhone=(String) data.get("mobPhone");
            String ssn1=(String) data.get("ssn");
            String user=(String) data.get("user");
            String pass=(String) data.get("pass");
            String repPass=(String) data.get("repPass");

        }catch (IOException | ParseException e) {
            //e.printStackTrace();
        }
}



        //try {
        //    String sysPath = System.getProperty("user.dir");
            // File myObj = new File("C:\\Users\\zdrav\\Projects\\JQA_homeworks\\ZornitsaStefanova\\java-api-demo\\src\\main\\java\\config\\config.json");
            // System.out.println(sysPath);
           // File myObj = new File(sysPath + "\\src\\test\\java\\Module4Final\\Resource\\config.json");
           /// Scanner myReader = new Scanner(myObj);
           //// while (myReader.hasNextLine()) {
                //String data = myReader.nextLine();
                //System.out.println(data);
            //}
            //myReader.close();
        ////} catch (FileNotFoundException e) {
           // System.out.println("An error occurred.");
           // e.printStackTrace();

        //}
    }

