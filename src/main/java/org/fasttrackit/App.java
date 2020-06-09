package org.fasttrackit;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import org.fasttrackit.domain.Task;
import org.fasttrackit.persistance.TaskRepository;
import org.fasttrackit.transfer.CreateTaskRequest;
import org.fasttrackit.transfer.UpdateTaskRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException, SQLException, ClassNotFoundException {
            // create a task
        CreateTaskRequest request = new CreateTaskRequest();
        request.setDescription("Learn JDBCTEST22234555");
        request.setDeadline(LocalDate.now().plusWeeks(1));


//        UpdateTaskRequest updateRequest = new UpdateTaskRequest();
//        updateRequest.setDone(true);


        TaskRepository taskRepository = new TaskRepository();

        taskRepository.createTask(request);

        // update a task
        //        taskRepository.updateTask(1, updateRequest);
        // delete a task
        //        taskRepository.deleteTask(4);
        // get all tasks as a list
        //        List<Task> tasks = taskRepository.getTasks();
        //        System.out.println(tasks);

    }
}
