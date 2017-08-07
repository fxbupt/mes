package org.cims.tsinghua.models;

import java.util.Date;

public class GanttTask {
  private int id;
  private String text;
  private Date start_date;
  private int duration;
  private double progress;
  private int parent;
  
  public int getId() {
    return id;
  }
  public String getText() {
    return text;
  }
  public Date getStart_date() {
    return start_date;
  }
  public int getDuration() {
    return duration;
  }
  public double getProgress() {
    return progress;
  }
  public int getParent() {
    return parent;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  public void setText(String text) {
    this.text = text;
  }
  public void setStart_date(Date start_date) {
    this.start_date = start_date;
  }
  public void setDuration(int duration) {
    this.duration = duration;
  }
  public void setProgress(double progress) {
    this.progress = progress;
  }
  public void setParent(int parent) {
    this.parent = parent;
  }
}