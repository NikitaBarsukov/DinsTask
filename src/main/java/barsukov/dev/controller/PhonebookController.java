package barsukov.dev.controller;

import barsukov.dev.model.User;
import barsukov.dev.service.impl.PhoneBookService;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class PhonebookController {

    private final PhoneBookService phoneBookService;

    @Inject
    PhonebookController(PhoneBookService phoneBookService ){
        this.phoneBookService = phoneBookService;
    }

    @GetMapping("/getAll")
    @ResponseStatus(HttpStatus.OK)
    public String getAll(){
        return phoneBookService.getAllUsers();
    }


    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public @Valid String createProfile(@Valid @RequestBody User request) {
        return "User created with id: " + phoneBookService.createUser(request);
    }


}
