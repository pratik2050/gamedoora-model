package com.gamedoora.model.mapper;

import com.gamedoora.model.dao.IssueHistory;
import com.gamedoora.model.dto.IssueHistoryDTO;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring" , builder = @Builder(disableBuilder = true))
public abstract class IssueHistoryMapper extends BaseMapper{

    public abstract IssueHistoryDTO issueHistoryToIssueHistoryDTO(IssueHistory issueHistory);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract IssueHistory issueHistoryDTOToIssueHistory(IssueHistoryDTO issueHistoryDTO);
}
