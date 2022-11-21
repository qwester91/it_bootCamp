package gmail.harashchenia.dzmitry.users.service.mapper.api;

import gmail.harashchenia.dzmitry.users.dao.entity.UserEntity;
import gmail.harashchenia.dzmitry.users.dto.ListOfUsers;
import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import org.springframework.data.domain.Page;

public interface IMapper {
    public UserEntity entityFromDto(UserCreateDto dto);
    public UserReadDto dtoFromEntity(UserEntity entity);
    ListOfUsers<UserReadDto> getReadDtoFromEntity(ListOfUsers<UserEntity> all);
}
