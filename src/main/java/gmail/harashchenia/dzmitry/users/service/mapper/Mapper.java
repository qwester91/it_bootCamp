package gmail.harashchenia.dzmitry.users.service.mapper;

import gmail.harashchenia.dzmitry.users.dao.entity.UserEntity;
import gmail.harashchenia.dzmitry.users.dto.ListOfUsers;
import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import gmail.harashchenia.dzmitry.users.service.mapper.api.IMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class Mapper implements IMapper {
    @Override
    public UserEntity entityFromDto(UserCreateDto dto) {
        UUID uuid = UUID.randomUUID();
        LocalDateTime now = LocalDateTime.now();
        return new UserEntity(uuid, dto.getName(), dto.getSurname(), dto.getPatronymic(),
                dto.getEmail(), dto.getRole(), now, now);
    }

    @Override
    public UserReadDto dtoFromEntity(UserEntity entity) {
        return new UserReadDto(entity.getName(),entity.getSurname(), entity.getPatronymic(),
                entity.getEmail(), entity.getRole());
    }

    @Override
    public ListOfUsers<UserReadDto> getReadDtoFromEntity(ListOfUsers<UserEntity> all) {
        List<UserReadDto> readList = new ArrayList<>();
        ListOfUsers<UserReadDto> newList = new ListOfUsers<>();
        for (UserEntity user : all.getContent()) {
            readList.add(dtoFromEntity(user));
        }
        newList.setContent(readList);
        newList.setFirst(all.getFirst());
        newList.setLast(all.getLast());
        newList.setNumber(all.getNumber());
        newList.setSize(all.getSize());
        newList.setTotalElements(all.getTotalElements());
        newList.setNumberOfElements(all.getNumberOfElements());
        newList.setTotalPages(all.getTotalPages());
        return newList;
    }
}
