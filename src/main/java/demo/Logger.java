package demo;

/**
 * Created by eugene on 11/01/2017.
 */
public class Logger {
    private FileSaver saver = new FileSaver("tttt");
    private LevelFilter filter = new LevelFilter();

    public void log(String message, int level) {
        if (filter.filter(level)) {
            saver.save(message);
        }
    }
}

class FileSaver {
    private final String pathToFile;


    public FileSaver(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void save(String message) {
        //.....
    }
}

class LevelFilter {
    public boolean filter(int level) {
        return false;
    }
}