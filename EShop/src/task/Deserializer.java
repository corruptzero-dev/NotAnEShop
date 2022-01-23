package task;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;

public class Deserializer {
    public static ArrayList<Product> readProducts(String from) {
        ArrayList<Product> prodArr = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(from))) {
            prodArr.add((Product) ois.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return prodArr;
    }
}

