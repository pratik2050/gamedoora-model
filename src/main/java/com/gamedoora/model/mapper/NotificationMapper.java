package com.gamedoora.model.mapper.mapper.reviewMapper;

import com.gamedoora.model.dto.dto.reviewDTO.NotificationsDTO;
import com.gamedoora.model.mapper.mapper.BaseMapper;
import com.gamedoora.model.dao.Notifications;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public abstract class NotificationMapper extends BaseMapper {

    public abstract NotificationsDTO notificationToNotificationDTO(Notifications notifications);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Notifications notificationsDtoToNotifications(NotificationsDTO notificationsDTO);
}
