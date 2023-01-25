package com.cybersoft.crm.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskEntity {
    private int id;
    private String name;
    private String startDate;
    private String endDate;
    private int userId;
    private int jobId;
    private int statusId;
}
