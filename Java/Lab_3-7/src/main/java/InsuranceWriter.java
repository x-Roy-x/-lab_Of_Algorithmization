import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class InsuranceWriter {
    FileWriter fileWriter = null;

    public void writeToFile(List<Insurance> insurances)  {

        File csvText = new File("Insurances.csv");


        try( FileWriter fileWriter =new FileWriter(csvText)) {
            for (Insurance insurance : insurances) {
                fileWriter.write(insurance.getHeaders()+ "\n" + insurance.toCSV() + "\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}