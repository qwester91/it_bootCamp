package gmail.harashchenia.dzmitry.users.service.validator.api;

import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;

public interface IValidator {
    public boolean createDtoValidate(UserCreateDto dto);
    public boolean readDtoValidate(UserReadDto dto);

}
