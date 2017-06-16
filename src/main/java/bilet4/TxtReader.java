package bilet4;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Ruslan on 10.06.2017.
 */
public class TxtReader {


    public ArrayList<Site> loadFile(File f) {
        System.out.println(f.canRead());
        ArrayList<Site> output = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split("\\s");
                Site currentSite = new Site(values);
                output.add(currentSite);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return output;
    }

    public void savefile(ArrayList<Integer> output, ArrayList<Site> sites) {
        try (FileWriter writer = new FileWriter("src/main/resources/out.txt", false)) {

            for (int i = 0; i < sites.size(); i++) {
                writer.write(sites.get(i).getName() + " " + output.get(i));
                writer.append('\n');
                writer.flush();
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}
