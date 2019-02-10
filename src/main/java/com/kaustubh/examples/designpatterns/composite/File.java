package com.kaustubh.examples.designpatterns.composite;

import java.util.List;

public class File implements FileSystemComponent {

  private String name;
  private String data;

  public void ls() {
    System.out.println("-----> " + this.name);
  }
}
