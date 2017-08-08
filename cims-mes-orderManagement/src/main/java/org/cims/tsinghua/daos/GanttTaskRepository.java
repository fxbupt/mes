package org.cims.tsinghua.daos;

import java.util.List;

import org.cims.tsinghua.models.GanttTask;

public interface GanttTaskRepository {
  public List<GanttTask> getAllGanttTasks();
  public GanttTask getGanttTaskById(int id);
  public void insertGanttTask(GanttTask ganttTask);
}