package com.kaustubh.examples.designpatterns.composite;

import java.util.List;

public class Folder implements FileSystemComponent {

  private String name;
  private List<FileSystemComponent> children;

  public void ls() {
    System.out.println(this.name);
    System.out.println("|");
    System.out.println("|");
    System.out.println("|");
  }
}
