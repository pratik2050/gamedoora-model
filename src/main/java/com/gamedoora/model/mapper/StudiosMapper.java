package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.StudiosDTO;
import com.gamedoora.model.dao.Studios;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class StudiosMapper extends BaseMapper {

    public abstract StudiosDTO studiosToStudiosDto(Studios studios);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Studios studiosDtoToStudios(StudiosDTO studiosDTO);
}
