package com.keep.root.domain;

import java.sql.Date;
import java.util.List;

public class Course {
  int no;
  User user;
  Date createdDate;
  List<CourseDay> coursewDay;
}