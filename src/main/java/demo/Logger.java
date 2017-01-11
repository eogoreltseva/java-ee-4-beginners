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

    public void log(Object message, int level) {
        if (filter.filter(level)) {
            saver.save(message);
        }
    }

    public Object[] get10LastObjects() {
        return null;
    }
}

class Saver {
    public void save(Object message) {
        ///////
    }
}

class FileSaver extends Saver {  //IS-A
    private final String pathToFile;


    public FileSaver(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    @Override
    public void save(Object message) {
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
    public void save(Object message) {
        //Contract broken
    }
}


class Main {
    public static void main(String[] args) {
        Logger logger = new Logger(new FileSaver(""), new LevelFilter());
        logger.log("Ssssss", 9);
        logger.log("Ssssss", 9);
        logger.log(new Object(), 9);
        logger.log("Ssssss", 9);
        logger.log("Ssssss", 9);

        for (Object elemant : logger.get10LastObjects()) {
            if (elemant instanceof String) {
                final String strElemnt = (String) elemant;
                System.out.println(strElemnt);
            }
        }
    }
}