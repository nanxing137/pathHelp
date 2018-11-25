package objectCenter.pathHelp;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, URISyntaxException
    {
        System.out.println( "Hello World!" );
        Path path = Paths.get("E:\\CS16_chs");
        System.out.println(path.getFileName());
        System.out.println(path.getFileSystem());
        System.out.println(path.getClass().getName());
        URL url = new URL("");
        
        InputStream inputStream = new FileInputStream(new File(""));
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        InputStreamReader inputStreamReader = new InputStreamReader(bufferedInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String readLine = bufferedReader.readLine();
        
        Socket socket = new Socket("", 0);
        Socket socket2 = new Socket("", 120);
    }
}
