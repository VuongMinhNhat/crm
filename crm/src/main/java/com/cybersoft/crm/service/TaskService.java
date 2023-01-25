package com.cybersoft.crm.service;

import com.cybersoft.crm.entity.TaskEntity;
import com.cybersoft.crm.model.TaskModel;
import com.cybersoft.crm.repository.TaskRepository;
import com.cybersoft.crm.utils.DateFormat;

import java.util.List;

public class TaskService {

    private TaskRepository taskRepository = new TaskRepository();
    private DateFormat dateFormat
 = new DateFormat();

    public List<TaskModel> getAllTasks() {
        List<TaskModel> tasks = taskRepository.getTasks();
        for (TaskModel task: tasks) {
            task.setStartDate(dateFormat
.changeFormatDate(task.getStartDate(), "/"));
            task.setEndDate(dateFormat
.changeFormatDate(task.getEndDate(), "/"));
        }
        return tasks;
    }

    public boolean deleteTaskById(int id) {
        int result = taskRepository.deleteTaskById(id);
        return result > 0;
    }

    public boolean insertTask(TaskEntity task) {
        try {
            task.setStartDate(dateFormat
.changeFormatDate(task.getStartDate(), "-"));
            task.setEndDate(dateFormat
.changeFormatDate(task.getEndDate(), "-"));
            int result = taskRepository.insertTask(task);
            return result > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public TaskEntity findTaskById(int id) {
        TaskEntity task = taskRepository.findTaskById(id);
        task.setStartDate(dateFormat
.changeFormatDate(task.getStartDate(), "/"));
        task.setEndDate((dateFormat
.changeFormatDate(task.getEndDate(), "/")));
        return task;
    }

    public boolean updateTask(TaskEntity task) {
        try {
            task.setStartDate(dateFormat
.changeFormatDate(task.getStartDate(), "-"));
            task.setEndDate(dateFormat
.changeFormatDate(task.getEndDate(), "-"));
            int result = taskRepository.updateTask(task);
            return result > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public List<TaskEntity> findTasksByUserId(int userId) {
        List<TaskEntity> tasks = taskRepository.findTaskByUserId(userId);
        for (TaskEntity task: tasks) {
            task.setStartDate(dateFormat
.changeFormatDate(task.getEndDate(), "/"));
            task.setEndDate(dateFormat
.changeFormatDate(task.getEndDate(), "/"));
        }
        return tasks;
    }

}
