package gmail.harashchenia.dzmitry.users.dto;

import gmail.harashchenia.dzmitry.users.dao.entity.Role;

public class UserDto {

    private String name;
    private String surname;
    private String patronymic;
    private String email;
    private Role role;

    public UserDto() {
    }

    public UserDto(String name, String surname, String patronymic, String email, Role role) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.email = email;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
