package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.StatesDTO;
import com.gamedoora.model.dao.States;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class StatesMapper extends BaseMapper {

    public abstract StatesDTO statesToStatesDto(States states);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract States statesDtoToStates(StatesDTO statesDTO);
}
