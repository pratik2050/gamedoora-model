package com.gamedoora.model.mapper;

import com.gamedoora.model.dto.StoriesDTO;
import com.gamedoora.model.dao.Stories;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class StoriesMapper extends BaseMapper {

    public abstract StoriesDTO storiesToStoriesDto(Stories stories);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Stories storiesDtoToStories(StoriesDTO storiesDTO);
}
