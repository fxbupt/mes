package org.cims.tsinghua.models;

import java.util.Date;

public class GanttTask {
  private int id;
  private String text;
  private Date start_date;
  private int duration;
  private double progress;
  private int parent;
  
  public int getId(){
    return this.id;
  }
  public String getText(){
    return this.text;
  }
  public Date getStart_date(){
    return this.start_date;
  }
  public int getDuration(){
    return this.duration;
  }
  public double getProcess(){
    return this.progress;
  }
  public int getParent(){
    return this.parent;
  }
  
  public void setId(int id){
    this.id = id;
  }
}