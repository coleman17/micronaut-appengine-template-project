package micronaut.appengine.template.project.web;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller("/users")
public class UserController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public List<String> findAllUsers() {
        log.info("finding all users...");

        return Arrays.asList("Mikey", "Pablo", "Tom", "Bill");
    }
}
