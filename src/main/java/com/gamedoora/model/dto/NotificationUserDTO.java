package com.gamedoora.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class NotificationUserDTO {

    private long id;

    private boolean isSeen;

    private boolean isClicked;
}
