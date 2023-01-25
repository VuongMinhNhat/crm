package com.cybersoft.crm.model;

import com.cybersoft.crm.entity.TaskEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class JobModel {
    private int idUser;
    private String userName;
    List<TaskEntity> taskEntities;
}