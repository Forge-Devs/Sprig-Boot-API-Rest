package turstar.com.br.TurStar.controllers;

import turstar.com.br.entities.User;
import turstar.com.br.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);

    @GetMapping
    public List<User> getAllUsers; {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById;(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}