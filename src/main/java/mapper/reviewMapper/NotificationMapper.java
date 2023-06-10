package mapper.reviewMapper;

import dto.reviewDTO.NotificationsDTO;
import mapper.BaseMapper;
import com.gamedoora.model.dao.Notifications;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class NotificationMapper extends BaseMapper {

    public abstract NotificationsDTO notificationToNotificationDTO(Notifications notifications);

    @Mapping(target = "createdBy" , expression = "java(getCreatedBy())")
    @Mapping(target = "createdOn" , expression = "java(getNewDate())")
    @Mapping(target = "updateBy" , expression = "java(getUpdatedBy())")
    @Mapping(target = "updateOn" , expression = "java(getNewDate())")
    public abstract Notifications notificationsDtoToNotifications(NotificationsDTO notificationsDTO);
}
