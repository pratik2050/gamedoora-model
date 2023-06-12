package com.gamedoora.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class CommentsDTO {

    long id;

    private String context;

    private long commentableId;

    private String type;
}
