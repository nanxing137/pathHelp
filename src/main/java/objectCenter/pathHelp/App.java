package objectCenter.pathHelp;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Path path = Paths.get("");
        System.out.println(path.getClass().getName());
    }
}
