package bilet4;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Ruslan on 10.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        TxtReader txtReader = new TxtReader();
        File file = new File("src/main/resources/in.txt");
        ArrayList<Site> sites = txtReader.loadFile(file);
        ArrayList<Integer> output = new ArrayList<>();
         for (Site site: sites){
             output.add(site.getAverage());
         }
        txtReader.savefile(output,sites);

    }
}
