package gmail.harashchenia.dzmitry.users.dto;

import gmail.harashchenia.dzmitry.users.dao.entity.Role;

public class UserCreateDto extends UserDto{
    public UserCreateDto(String name, String surname, String patronymic, String email, Role role) {
        super(name, surname, patronymic, email, role);
    }
}
