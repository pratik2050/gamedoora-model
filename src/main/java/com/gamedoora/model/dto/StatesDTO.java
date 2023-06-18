package com.gamedoora.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class StatesDTO {

    private long id;

    private String name;

    private long position;
}
