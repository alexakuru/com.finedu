package auth.com.finedu.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/home")
public class HomeController {

    @GetMapping()
    public ResponseEntity<String> getHomeStatus() {
        return ResponseEntity.ok("It is working!");
    }
}
