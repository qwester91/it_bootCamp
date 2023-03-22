package gmail.harashchenia.dzmitry.users.service;

import gmail.harashchenia.dzmitry.users.dao.api.IUserDao;
import gmail.harashchenia.dzmitry.users.dto.ListOfUsers;
import gmail.harashchenia.dzmitry.users.dto.UserCreateDto;
import gmail.harashchenia.dzmitry.users.dto.UserDto;
import gmail.harashchenia.dzmitry.users.dto.UserReadDto;
import gmail.harashchenia.dzmitry.users.service.api.IUserService;
import gmail.harashchenia.dzmitry.users.service.mapper.api.IMapper;
import gmail.harashchenia.dzmitry.users.service.validator.api.IValidator;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    private final IUserDao dao;
    private final IValidator validator;
    private final IMapper mapper;

    public UserService(IUserDao dao, IValidator validator, IMapper mapper) {
        this.dao = dao;
        this.validator = validator;
        this.mapper = mapper;
    }

    @Override
    public void add(UserCreateDto dto) {
        if(validator.createDtoValidate(dto)){
            dao.save(mapper.entityFromDto(dto));
        }

    }

    @Override
    public ListOfUsers<UserReadDto> getListOfUsers(Pageable pageable) {
        ListOfUsers<UserReadDto> readDtoFromEntity = mapper.getReadDtoFromEntity(new ListOfUsers<>(dao.findByOrderByEmailAsc(pageable)));
        return readDtoFromEntity;
    }
}
