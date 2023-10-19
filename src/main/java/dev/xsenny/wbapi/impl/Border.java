package dev.xsenny.wbapi.impl;


import dev.xsenny.wbapi.api.WorldBorderApiImpl;

public class Border extends WorldBorderApiImpl {

  public Border() {
    super(WorldBorder::new, WorldBorder::new);
  }
}