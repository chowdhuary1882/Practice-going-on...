package opennotepad;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class NotePad {

    public static void main(String[] args) {
        Runtime rs = Runtime.getRuntime();

        try {
            rs.exec("notepad");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
