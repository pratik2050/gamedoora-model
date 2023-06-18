package com.gamedoora.model.mapper;

import com.gamedoora.model.dao.Task;
import com.gamedoora.model.dto.TaskDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class TaskMapper extends BaseMapper {

    public abstract TaskDTO taskToTaskDto(Task task);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Task taskDtoToTask(TaskDTO taskDTO);
}
