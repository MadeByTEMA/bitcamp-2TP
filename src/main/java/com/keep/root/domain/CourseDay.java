package com.keep.root.domain;

import java.sql.Date;
import java.util.List;

public class CourseDay {
  int no;
  String title;
  Date dayDate;
  Course course;
  List<CoursePlace> coursePlace;
}