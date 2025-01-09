import org.springframework.web.bind.annotation.RestController;

@RestController
public class App {
    public String getMessage() {
        return "CI-CD flow working!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}