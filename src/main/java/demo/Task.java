package demo;

import javax.persistence.*;

@Entity
@Table(name="task_list")
public class Task {

    @Id
    @GeneratedValue
    @Column(name="task_id")
    private Integer id;

    @Column(name="task_name")
    String taskName;

    @Column(name="task_status")
    Boolean taskStatus = false;

    public int getTaskId(int taskId) {
        return id;
    }

    public void setTaskId(int taskId) {
        this.id = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Boolean getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(Boolean taskStatus) {
        this.taskStatus = taskStatus;
    }

}