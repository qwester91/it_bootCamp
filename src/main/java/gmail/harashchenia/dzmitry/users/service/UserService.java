package gmail.harashchenia.dzmitry.users.service;

import gmail.harashchenia.dzmitry.users.dto.ListOfUsers;
import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import gmail.harashchenia.dzmitry.users.service.api.IUserService;
import org.springframework.data.domain.Pageable;

public class UserService implements IUserService {
    @Override
    public void add(UserCreateDto dto) {

    }

    @Override
    public ListOfUsers<UserReadDto> getListOfUsers(Pageable pageable) {
        return null;
    }
}
