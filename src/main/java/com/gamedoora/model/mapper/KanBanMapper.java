package com.gamedoora.model.mapper;

import com.gamedoora.model.dao.KanBan;
import com.gamedoora.model.dto.KanBanDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class KanBanMapper extends BaseMapper{

    public abstract KanBanDTO kanBanToKanBanDTO(KanBan kanBan);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract KanBan kanBanDTOToKanBan(KanBanDTO kanBanDTO);
}
