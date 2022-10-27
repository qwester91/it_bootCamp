package gmail.harashchenia.dzmitry.users.controller;

import gmail.harashchenia.dzmitry.users.dto.ListOfUsers;
import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import gmail.harashchenia.dzmitry.users.service.api.IUserService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody UserCreateDto dto){
        userService.add(dto);
    }

    @GetMapping
    public ListOfUsers<UserReadDto> getListOfUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                                                   @RequestParam(value = "size", defaultValue = "10") int size){
        Pageable pageable = PageRequest.of(page-1, size);
        return this.userService.getListOfUsers(pageable);

    }
}
