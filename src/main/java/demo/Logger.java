package demo;

/**
 * Created by eugene on 11/01/2017.
 */
public class Logger {
    private Saver saver; //DI (+DI Framework)
    private Filter filter;

    public Logger(Saver saver, Filter filter) {
        this.saver = saver;
        this.filter = filter;
    }

    public void log(String message, int level) {
        if (filter.filter(level)) {
            saver.save(message);
        }
    }
}

class Saver {
    public void save(String message) {
        ///////
    }
}

class FileSaver extends Saver {  //IS-A
    private final String pathToFile;


    public FileSaver(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public void save(String message) {
        //.......
        super.save(message);
        //.....
    }
}

interface Filter {
    boolean filter(int level);
}

class LevelFilter implements Filter {
    @Override
    public boolean filter(int level) {
        return false;
    }
}

class BadSaver extends Saver {
    @Override
    public void save(String message) {
        //Contract broken
    }
}