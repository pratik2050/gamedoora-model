package com.gamedoora.model.mapper;

import org.mapstruct.Named;

import java.util.Date;

public abstract class BaseMapper {

    private final String creator = "GameDoora";

    @Named("CreatedBy")
    public String getCreatedBy(){
        return creator;
    }

    @Named("UpdatedBy")
    public String getUpdatedBy(){
        return creator;
    }

    @Named("NewDate")
    public Date getNewDate(){
        return new Date();
    }
}
