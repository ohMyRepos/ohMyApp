package co.zhanglintc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println(App.class.getClassLoader().getResource(""));
        System.out.println(App.class.getResource(""));
        System.out.println( "Hello World!" );
    }
}
