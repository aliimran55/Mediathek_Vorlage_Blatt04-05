import java.io.FileWriter;
import java.io.IOException;

public class VerleihProtokollierer
{
    public static final String VERLIEHEN = "Verliehen";
    public static final String ZURÜCK = "Zurückgenommen";

    /**
     * Die Methode protokolliert die Anzahl und Art des Mediums.
     * @param ereignis
     * @param verleihkarte
     * @throws ProtokollierException
     */
    public static void protokolliere(String ereignis, Verleihkarte verleihkarte)
            throws ProtokollierException
    {
        assert ereignis != null : "Vorbedingung verletzt ereignis != null";
        //System.out.println("Ereignis:" + ereignis);
        String text = ereignis + "\n" + verleihkarte.getFormatiertenString();

        try (FileWriter writer = new FileWriter("./protokoll.txt", true))
        {
            writer.write(text);
        }
        catch (IOException e)
        {
            throw new ProtokollierException("Ein Fehler ist aufgetreten");
        }
        finally
        {
            System.out.println("Protokolliervorgang beendet");
        }

    }
}
