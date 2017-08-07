package org.cims.tsinghua.models;

public class GanttLink {
  private int id;
  private int source;
  private int target;
  private String type;
  
  public int getId() {
    return id;
  }
  public int getSource() {
    return source;
  }
  public int getTarget() {
    return target;
  }
  public String getType() {
    return type;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  public void setSource(int source) {
    this.source = source;
  }
  public void setTarget(int target) {
    this.target = target;
  }
  public void setType(String type) {
    this.type = type;
  }
}