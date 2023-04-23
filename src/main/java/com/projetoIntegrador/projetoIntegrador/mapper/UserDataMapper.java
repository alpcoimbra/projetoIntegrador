package com.projetoIntegrador.projetoIntegrador.mapper;

import com.projetoIntegrador.projetoIntegrador.domain.dto.UserDataDto;
import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDataMapper {

    UserData dtoToUserData(UserDataDto userDataDto);

    UserDataDto userDataToDto(UserData userData);

    List<UserData> listDtoToUserData(List<UserDataDto> userDataDtoList);

    List<UserDataDto> listUserDataToDto(List<UserData> userDataList);
}
