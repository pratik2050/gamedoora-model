package mapper.reviewMapper;

import com.gamedoora.model.dao.Task;
import dto.reviewDTO.TaskDTO;
import mapper.BaseMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class TaskMapper extends BaseMapper {

    public abstract TaskDTO taskToTaskDto(Task task);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Task taskDtoToTask(TaskDTO taskDTO);
}
