package reader;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        String path = "E:\\My Sql";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("We could not find the file..");
        }
        String data = "";
        try {
            br = new BufferedReader(fr);
            while((data = br.readLine()) !=null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("We could not read the file..");
        }
        finally {
            if(fr != null) {
                fr = null;
            }
            if(br != null) {
                br = null;
            }
        }
    }


}
