package com.gamedoora.model.dto;

import com.gamedoora.model.dao.ActivityType;
import com.gamedoora.model.dao.Users;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

public class IssueHistoryDTO {

    private ActivityType activityType;

    private Date startDate;
}
