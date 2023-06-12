package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.StudioAssetDTO;
import com.gamedoora.model.dao.StudioAsset;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class StudioAssetMapper extends BaseMapper {

    public abstract StudioAssetDTO studioAssetToStudioAssetDto(StudioAsset studioAsset);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract StudioAsset studioAssetDtoToStudioAsset(StudioAssetDTO studioAssetDTO);
}
