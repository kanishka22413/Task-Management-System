package com.service;



import java.util.List;

public interface TakeService {

    TaskResponseDTO createTask(TaskRequestDTO taskDTO);

    List<TaskResponseDTO> getAllTask();

    TaskResponseDTO getTaskById(Long taskId);

    String updateTask(Long taskId, TaskRequestDTO taskDTO);

    String deleteTask(Long taskId);

    List<TaskResponseDTO> getAllTasksByTaskStatus(String taskStatus);

    List<TaskResponseDTO> getAllTasksByPriority(String priority);

}

