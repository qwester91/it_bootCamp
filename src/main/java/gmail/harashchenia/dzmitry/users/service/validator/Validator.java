package gmail.harashchenia.dzmitry.users.service.validator;

import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import gmail.harashchenia.dzmitry.users.service.validator.api.IValidator;
import org.springframework.stereotype.Component;

@Component
public class Validator implements IValidator {
    @Override
    public boolean createDtoValidate(UserCreateDto dto) {
        return false;
    }

    @Override
    public boolean readDtoValidate(UserReadDto dto) {
        return false;
    }
}
