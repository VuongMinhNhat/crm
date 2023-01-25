package com.cybersoft.crm.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskModel {
    private int id;
    private String name;
    private String startDate;
    private String endDate;
    private String userName;
    private String jobName;
    private String statusName;

}
