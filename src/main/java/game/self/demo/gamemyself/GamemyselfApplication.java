package game.self.demo.gamemyself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GamemyselfApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamemyselfApplication.class, args);
    }

    @RequestMapping("/")
    public String index(){
        System.out.println("default");
        return "Welcome, My Buddy!";
    }


    @RequestMapping("/123")
    public String index123(){
        System.out.println("123");
        return "Welcome, My Buddy123!";
    }

    @RequestMapping("/test")
    public String indexTest(){
        System.out.println("Test");
        return "Welcome, My Buddy, Test!";
    }

    @RequestMapping("/cpu")
    public String cpu(){
        System.out.println("cpu");
        while (true){
            int i = 100 * 100;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
