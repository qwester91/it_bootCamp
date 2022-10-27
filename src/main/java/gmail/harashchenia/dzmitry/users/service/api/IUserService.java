package gmail.harashchenia.dzmitry.users.service.api;

import gmail.harashchenia.dzmitry.users.dto.ListOfUsers;
import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import org.springframework.data.domain.Pageable;

public interface IUserService {
    void add(UserCreateDto dto);
    ListOfUsers<UserReadDto> getListOfUsers(Pageable pageable);
}
