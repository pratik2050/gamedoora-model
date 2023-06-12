package com.gamedoora.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class StudioUserRequestDTO {

    private long id;

    private String uid;

    private String status;
}
