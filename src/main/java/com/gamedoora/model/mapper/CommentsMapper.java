package com.gamedoora.model.mapper.mapper.reviewMapper;

import com.gamedoora.model.dto.dto.reviewDTO.CommentsDTO;
import com.gamedoora.model.mapper.mapper.BaseMapper;
import com.gamedoora.model.dao.Comments;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class CommentsMapper extends BaseMapper {

    public abstract CommentsDTO commentsToCommentsDto(Comments comments);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Comments commentsDtoToComments(CommentsDTO commentsDTO);
}
