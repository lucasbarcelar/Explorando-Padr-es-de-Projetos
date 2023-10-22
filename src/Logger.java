import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instancia;
    private PrintWriter logFile;

    private Logger() {
        try {
            logFile = new PrintWriter(new FileWriter("log.txt"), true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensagem) {
        logFile.println(mensagem);
    }
}
