package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.RoleDTO;
import com.gamedoora.model.dao.Roles;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * In mappers, we are using expression = "java(functionName())" instead of using @Named annotations
 * with qualifiedByName parameter because in case of @Named annotation the functions or utilities
 * are needed to be defined within the same class/interface, this approach defeats the purpose
 * of having a BaseMapper which follows the principle of Data Abstraction. So with the help of expression
 * we can define all our common utilities and functions within one class/interface and use it globally.
 * **/

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class RolesMapper extends BaseMapper{

    public abstract RoleDTO roleToRoleDto(Roles roles);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Roles roleDtoToRoles(RoleDTO roleDTO);
}
