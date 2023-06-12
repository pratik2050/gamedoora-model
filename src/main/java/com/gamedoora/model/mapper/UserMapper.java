package com.gamedoora.model.mapper;


import com.gamedoora.model.dto.UserDTO;
import com.gamedoora.model.dao.Users;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class UserMapper extends BaseMapper{

    public abstract UserDTO usersToUserDTO(Users users);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Users userDtoToUsers(UserDTO userDTO);

}
