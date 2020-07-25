import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hi");

        get("/hello", ((request, response) -> "Hello World"));
    }
}
