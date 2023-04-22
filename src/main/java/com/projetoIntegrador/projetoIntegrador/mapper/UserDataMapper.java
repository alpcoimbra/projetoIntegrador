package com.projetoIntegrador.projetoIntegrador.mapper;

import com.projetoIntegrador.projetoIntegrador.domain.dto.UserDataDto;
import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserDataMapper {

//    @Mapping(target = "nomeCompleto", source = "userdataDto.nomeCompleto")
//    @Mapping(target = "areaFormacao", source = "userdataDto.areaFormacao")
//    @Mapping(target = "cidade", source = "userdataDto.cidade")
//    @Mapping(target = "dataNascimento", source = "userdataDto.dataNascimento")
//    @Mapping(target = "email", source = "userdataDto.email")
//    @Mapping(target = "profissao", source = "userdataDto.profissao")
//    @Mapping(target = "uf", source = "userdataDto.uf")
//    @Mapping(target = "senha", source = "userdataDto.senha")
//    UserData dtoToUserData(UserDataDto userDataDto);

//    @Mapping(target = "nomeCompleto", source = "nomeCompleto")
//    @Mapping(target = "areaFormacao", source = "areaFormacao")
//    @Mapping(target = "cidade", source = "cidade")
//    @Mapping(target = "dataNascimento", source = "dataNascimento")
//    @Mapping(target = "email", source = "email")
//    @Mapping(target = "profissao", source = "profissao")
//    @Mapping(target = "uf", source = "uf")
//    @Mapping(target = "senha", source = "senha")
    UserDataDto userDataToDto(UserData userData);

    //List<UserData> listDtoToUserData(List<UserDataDto> userDataDtoList);

    List<UserDataDto> listUserDataToDto(List<UserData> userDataList);
}
