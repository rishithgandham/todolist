package com.webapp.todolist.tasklist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class AllListResponse {
    private List<TaskList> lists;
}
