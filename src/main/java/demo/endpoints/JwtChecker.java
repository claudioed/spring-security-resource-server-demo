package demo.endpoints;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class JwtChecker {

  @GetMapping("/jwt")
  @PreAuthorize("isAuthenticated()")

  public String check(JwtAuthenticationToken jwtAuthenticationtoken) {
    return jwtAuthenticationtoken.getPrincipal().toString();
  }

}
