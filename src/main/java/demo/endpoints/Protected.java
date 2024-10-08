package demo.endpoints;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/protected")
public class Protected {

  @GetMapping
  public ResponseEntity<String> protectedEndpoint() {
    return ResponseEntity.ok("This is a protected endpoint");
  }

}
