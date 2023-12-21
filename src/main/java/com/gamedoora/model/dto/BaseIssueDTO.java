package com.gamedoora.model.dto;

import com.gamedoora.model.dao.ActivityType;
import com.gamedoora.model.dao.Comments;
import com.gamedoora.model.dao.IssueHistory;
import com.gamedoora.model.dao.IssueType;
import com.gamedoora.model.dao.Priority;

import java.util.Date;
import java.util.List;

public class BaseIssueDTO {
    private IssueType issueType;

    private ActivityType activityType;

    private String title;

    private String description;

    private String storyPoints;

    private String issuer;

    private String assignee;

    private Priority priority;

    private Date startDate;
}
