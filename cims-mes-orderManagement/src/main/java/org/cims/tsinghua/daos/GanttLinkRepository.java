package org.cims.tsinghua.daos;

import java.util.List;

import org.cims.tsinghua.models.GanttLink;

public interface GanttLinkRepository {
  public List<GanttLink> getAllGanttLinks();
  public GanttLink getGanttLinkById(int id);
  public void insertGanttLink(GanttLink ganttLink);
}
