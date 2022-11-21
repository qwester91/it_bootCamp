package gmail.harashchenia.dzmitry.users.dto;

import gmail.harashchenia.dzmitry.users.dao.entity.Role;

public class UserReadDto extends UserDto{
    public UserReadDto(String name, String surname, String patronymic, String email, Role role) {
        super(name, surname, patronymic, email, role);
    }
}
