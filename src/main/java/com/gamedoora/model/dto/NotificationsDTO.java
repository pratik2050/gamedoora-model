package com.gamedoora.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NotificationsDTO {

    private long id;

    private String uid;

    private String type;

    private long entityId;

    private String context;

    private String actionUrl;
}
