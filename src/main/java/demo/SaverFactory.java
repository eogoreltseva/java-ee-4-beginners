package demo;

/**
 * Created by eugene on 11/01/2017.
 */
public class SaverFactory {
    public static Saver create() {
        return new FileSaver("");
    }
}
