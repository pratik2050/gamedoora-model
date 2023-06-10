package mapper.reviewMapper;

import dto.reviewDTO.StudiosDTO;
import mapper.BaseMapper;
import com.gamedoora.model.dao.Studios;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class StudiosMapper extends BaseMapper {

    public abstract StudiosDTO studiosToStudiosDto(Studios studios);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Studios studiosDtoToStudios(StudiosDTO studiosDTO);
}
